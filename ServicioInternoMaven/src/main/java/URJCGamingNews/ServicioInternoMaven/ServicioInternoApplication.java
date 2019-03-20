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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Aplicacion que se pone a escuchar en el puerto 7777 a la espera de
 * peticiones. Recibe un link de la noticia y una serie de emails. Construye un
 * mensaje de correo electrónico que envía el link de la noticia a los emails
 * recibidos
 *
 */
public class ServicioInternoApplication {
	public static void main(String[] args) {

		int puertoServidor = 7777;

		// Lista donde se almacenarán todos los correos recibidos para enviar la
		// newsletter
		List<String> listaCorreos = new ArrayList<>();
		ExecutorService pool = Executors.newFixedThreadPool(10);
		String linkNoticia = null;

		// Bucle infinito a la espera de peticiones
		while (true) {

			System.out.println("Esperando una conexion en el puerto: " + puertoServidor);

			try {

				ServerSocket serverSocket = new ServerSocket(puertoServidor);
				Socket fromClientSocket = serverSocket.accept();
				pool.execute(new procesarPeticionConcurrente(fromClientSocket));
				
				serverSocket.close();

			} catch (IOException e) {
				System.out.println("Fallo en la conexion");
			}

		}
	}

	
}
