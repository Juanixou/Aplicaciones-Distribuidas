package URJCGamingNews.ServicioInternoMaven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class procesarPeticionConcurrente implements Runnable {

	
	Socket fromClienteSocket;
	
	
	int puertoServidor = 7777;

	// Lista donde se almacenarán todos los correos recibidos para enviar la
	// newsletter
	List<String> listaCorreos = new ArrayList<>();

	String linkNoticia = null;
	
	
	
	public procesarPeticionConcurrente(Socket socket) {
		this.fromClienteSocket = socket;
		
	}
	
	
	@Override
	public void run() {
		
		try {
			PrintWriter pw = new PrintWriter(fromClienteSocket.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(fromClienteSocket.getInputStream()));

			//Variables necesarias para almacenar de forma correcta por un lado el link de la noticia y por otro los correos
			int contador = 0;
			String contenido;

			while ((contenido = br.readLine()) != null) {
				if (contador == 0) // Link de la noticia
					linkNoticia = contenido;
				else
					listaCorreos.add(contenido);
				contador++;
			}

			System.out.println("El link de la noticia es: " + linkNoticia);

			for (int i = 0; i < listaCorreos.size(); i++) {
				System.out.println("Correo " + i + " recibido: " + listaCorreos.get(i));
			}

			String asunto = "¡Nueva noticia en URJC Gaming News!";
			String cuerpo = "Querido suscriptor de nuestra Newsletter, le envíamos el link de la noticia"
					+ "que acaba de ser publicada en nuestra web. Haz click en este link para ir a verla ahora: "
					+ linkNoticia;

			for (int i = 0; i < listaCorreos.size(); i++)
				enviarConGMail(listaCorreos.get(i), asunto, cuerpo);

			pw.close();
			br.close();
			fromClienteSocket.close();
			
		} catch (IOException e) {
			System.out.println("Fallo en la conexion");
		}

		
	}
	
	private static void enviarConGMail(String destinatario, String asunto, String cuerpo) {
		// Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el
		// remitente también.
		String remitente = "urjcgamingnews"; // Para la dirección nomcuenta@gmail.com

		Properties props = System.getProperties();
		props.put("mail.smtp.host", "smtp.gmail.com"); // El servidor SMTP de Google
		props.put("mail.smtp.user", remitente);
		props.put("mail.smtp.clave", "Otaduy666"); // La clave de la cuenta
		props.put("mail.smtp.auth", "true"); // Usar autenticación mediante usuario y clave
		props.put("mail.smtp.starttls.enable", "true"); // Para conectar de manera segura al servidor SMTP
		props.put("mail.smtp.port", "587"); // El puerto SMTP seguro de Google

		Session session = Session.getDefaultInstance(props);
		MimeMessage message = new MimeMessage(session);

		try {
			message.setFrom(new InternetAddress(remitente));
			message.addRecipients(Message.RecipientType.TO, destinatario); // Se podrían añadir varios de la misma
																			// manera
			message.setSubject(asunto);
			message.setText(cuerpo);
			Transport transport = session.getTransport("smtp");
			transport.connect("smtp.gmail.com", remitente, "Otaduy666");
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (MessagingException me) {
			me.printStackTrace(); // Si se produce un error
		}

	}

}
