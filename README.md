## Descripción

  

  

  

Página web de videojuegos en la cual se encuentran diversos artículos escritos por los redactores con información sobre las novedades en diversas videoconsolas tales como videojuegos, actualizaciones etc.

  

  

  

  

## Herramienta de Planificación

  

  

  

Para la planificación de tareas, se utilizará trello, al cual se puede acceder a través del siguiente enlace: [Trello](https://trello.com/b/LZSEqH9P/playurjc).

  

  

  

  

## Funcionalidad Pública

  

  

  

Acceder a los artículos escritos por los diversos redactores que trabajan en la web.

  

  

  

  

## Funcionalidad Privada

  

  

  

Los usuarios registrados tendrán acceso a la edición de artículos, de forma que estos se publiquen de cara al público.

  

  

  

  

## Entidades

  

  

  

**Noticias**: Diferentes noticias en función de la plataforma a la que se orienten, dividida en secciones: Nintendo, PS, Microsoft...

  

  

  

**Usuario**: Acceso a los datos de usuarios registrados con privilegios de edición, desde donde se podrá acceder a los artículos escritos.

  

  

  

**Notificaciones**: A través de este apartado, cualquier usuario podrá introducir sus datos para enviarle correos electrónicos con los nuevos artículos publicados.

  

  

  

**Comentarios**: Los usuarios podrán hacer conmentarios en cualquiera de los artículos publicados.

  

  

  

  

## Integrantes del equipo
|Nombre     |Apellidos       |Correo                    |Cuenta Github
|-----------|----------------|--------------------------|---------------|
|Juan Daniel|Silva Mora      |[jd.silva@alumnos.urjc.es](mailto:jd.silva@alumnos.urjc.es)  |[juanixou](https://github.com/juanixou)
|Angel Luis |Serrano González|[al.serranog@alumnos.urjc.es](mailto:al.serranog@alumnos.urjc.es) |[AlSerranog](https://github.com/AlSerranog)
|Juan Pedro |Guirado Sánchez |[jp.guirado@alumnos.urjc.es](mailto:jp.guirado@alumnos.urjc.es) |[jpguirado](https://github.com/jpguirado)
  
## Servicio Interno

  

  

  

El servicio interno será utilizado principalmente para la entidad **Notificaciones**, a través de la cual, introduciendo su correo electrónico, se le enviarán a los usuarios newsletters con información sobre los nuevos artículos publicados.

  

  

  

  

# Fase 2: Desarrollo de la aplicación web en local

  

  

  

  

Para la ejecución de esta fase, se ha definido e implementado la aplicación web, utilizando una base de datos MySQL. Para general el HTML de nuestra página, URJCGamingNews, se ha utilizado el motor de plantillas Mustache.

  

  

  

  

Se han diseñado e implementado las siguientes páginas:

  

  

  

  

## Portada:

  

  

  

  

Se ha desarrollado la siguiente portada, en la que se incluye un carrusel con las tres últimas noticias añadidas, una sección de Noticias Frescas y una sección de videos, donde subir los Gameplays de los últimos lanzamientos.

  

  

  

Además, en la barra de navegación superior se puede acceder al resto de páginas de la web, así como a la sección de Loging/Registro de la misma.

  

  

  

  

![fotoInicio](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/Inicio.PNG?raw=true)

  

  

  

  

## Categorias

  

  

  

  

![fotoInicio](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/categorias.PNG?raw=true)

  

  

  

  

Desde esta página, se puede acceder al listado de noticias de cada una de las distintas plataformas, abriéndose una página como la que veremos a continuación por cada una de las secciones:

  

  

  

  

![fotoInicio](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/Categoria.PNG?raw=true)

  

  

  

Ejemplo categoria PlayStation.

  

  

  

  

## Noticia:

  

  

  

  

Se ha diseñado la siguiente página para las noticias, donde aparece, en primer lugar, la imagen de la noticia, a continuación el texto y finalmente el autor de la misma.

  

  

  

  

![fotoInicio](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/noticia.PNG?raw=true)

  

  

  

  

De la misma manera, se ha implementado una sección de comentarios para cada noticia, con la siguiente estructura y formulario:

  

  

  

  

![fotoInicio](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/FormularioComentarios.PNG?raw=true)

  

  

  

  

## Eventos

  

  

  

  

También se ha diseñado una sección de eventos, similar a la de categorías vista anteriormente, donde aparecerán las noticias relacionadas con grandes eventos del mundo de los videojuego (Conferencias, E-Sports, Gamergy, etc).

  

  

  

  

![fotoInicio](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/eventos.PNG?raw=true)

  

  

  

  

## Formulario escribir noticias

  

  

  

  

Se ha implementado el siguiente formulario para la escritura de noticias:

  

  

  

  

![fotoInicio](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/EscribirNoticia.PNG?raw=true)

  

  

  

  

## Formularios de Login / Registro

  

  

  

  

Se han implementado los siguientes formularios para permitir hacer login en la página así como para registrar un nuevo usuario:

  

  

  

  

![fotoInicio](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/login.PNG?raw=true)

  

  

  

  

![fotoInicio](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/registro.PNG?raw=true)

  

  

  

  

## Diagrama de Navegación

  

  

  

  

El diagrama de navegación de nuestra aplicación es el siguiente:

  

  

  

  

![DiagramaNavegacion](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/diagramaDeNavegacion.PNG?raw=true)

  

  

## Diagrama de Clases

  

  

  

  

El diagrama de clases de nuestra aplicación es el siguiente:

  

  

![DiagramaClases](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/diagramaDeClases.png?raw=true)

  

  

  

## Diagrama de Base de Datos

  

  

  

El diagrama de Base de Datos corresponiente a las clases creadas es el siguiente:

  

  

  

![DiagramaNavegacion](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/Diagrama_BD.PNG?raw=true)

  
  

<![endif]-->

  
# Fase 3: Inclusión de seguridad y servicio interno


## Instrucciones para ejecutar en una máquina virtual nueva con Ubuntu Server 18.04.2

  

1.  **Crear máquina virtual con VirtualBox** y una vez arrancada te pedirá la iso del Ubuntu Server 18.04.2. Configurar nombre de servidor, nombre de usuario y contraseña del usuario.

  

2. (Opcional) **Configurar SSH para acceder desde nuestra propia máquina.**

  

- En la configuración de VirtualBox acceder a Configuración -> Red y utilizando NAT accede a opciones avanzadas y en reenvío de puertos añade una regla de puertos 1337 a 1337

  

- En la consola de nuestro Ubuntu Server deberemos ejecutar los siguientes comandos, sin incluir los paréntesis

  

	-  `sudo apt-get install openssh-server -y ` (Instalar OpenSSH)

  

	-  `sudo apt-get install nano -y ` (Instalar editor de texto nano)

  

	-  `sudo nano /etc/ssh/sshd_config ` (Acceder al archivo de configuración de ssh y descomentar el número de puerto y cambiar el 22 por el 1337)

  

	-  `sudo ufw allow 1337 `

  

	-  `sudo service ssh restart ` (Reestablecer el SSH con el nuevo puerto)

  

- Una vez configurado podemos conectarnos a nuestro Ubuntu Server ejecutando en la consola de nuestra maquina propia el comando ssh nombreusuario@ip -p1337. En nombreusuario tendremos que poner el **nombre de usuario** que establecimos en el paso 1, **no** el del servidor. Por defecto sería nombreusuario@127.0.0.1 -p1337. Nos pedirá la contraseña e introduciremos la que se estableció en el paso 1 para el usuario.

  

- Los próximos pasos que requieran ejecutar comandos en nuestro Ubuntu Server se podrán realizar desde la consola de nuestra maquina conectándonos mediante SSH o desde la propia consola de la máquina virtual.

  

3.  **Instalacion de Java en Ubuntu Server** Ejecutaremos los siguientes comandos en nuestro Ubuntu Server para instalar java y poder ejecutar nuestra aplicación web y su servicio interno, sin incluir los parentesis

  

	-  `sudo add-apt-repository ppa:webupd8team/java -y ` (Añadimos el repositorio de Java)

  

	-  `sudo apt update ` (Actualizamos repositorios)

  

	-  `sudo apt install oracle-java8-installer -y ` (Instalamos Java)

  

4.  **Instalación de Mysql Server en Ubuntu Server** Ejecutaremos los siguientes comandos en nuestro Ubuntu Server para instalar Mysql y que funcione nuestro servicio de base de datos

  

	-  `sudo apt-get install mysql-server `

  

5.  **Configuración de Mysql**

  

-  **Aceder a la consola de Mysql** Para ello ejecutaremos el siguiente comando en nuestro Ubuntu Server

  

	-  `sudo mysql `

  

-  **Crear y configurar base de datos** Para ello ejecutaremos los siguientes comandos en la consola de Mysql, sin incluir los paréntesis.

  

	-  `create database local; ` (Creamos la base de datos con nombre local, tal cual está en el Apliccation.properties de nuestro proyecto)

 
	- `create user 'root'@'%' identified by 'root'; ` (Creamos el usuario root con contraseña root

  

	-  `grant all on local.* to 'root'@'%'; ` (Damos acceso total a nuestra base de datos "local" al usuario root)

  

	-  `ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root'; ` (Comando necesario para su correcto funcionamiento)

  

6.  **Transferir los archivos .jar a nuestra máquina virtual con Ubuntu Server** Ejecutaremos el siguiente comando en nuestra maquina propia para transferir los archivos .jar a nuestra máquina virtual y poder ejecutarlos en ella, sin incluir los paréntesis

  

	-  `scp -P 1337 ruta/archivo.jar nombreusuario@127.0.0.1:/home/nombreusuario ` (nombre de usuario establecido en el paso 1)

  

	- Ejecutaremos este comando por cada uno de los jar y serán transferidos al directorio home del usuario de la máquina virtual

  

7.  **Ejecutar los archivos .jar**

  

- En la configuración de VirtualBox acceder a Configuración -> Red y utilizando NAT accede a opciones avanzadas y en reenvío de puertos añade una regla de puertos 8443 a 8443. Esto es necesario ya que es el puerto que utiliza ahora la aplicación web al ser HTTPS.

  

- Ejecutaremos los siguientes comandos en nuestra máquina virtual, estando en el directorio donde se encuentran los archivos .jar de la aplicación web y el servicio interno

  

	-  `java -jar serviciointerno.jar `

	-  `java -jar urjcgamingnews.jar `

- Una vez ambas aplicaciones arranquen correctamente, podremos acceder a la aplicación desde el navegador de nuestra maquina propia ya que hemos comunicado los puertos anteriormente.
## Interfaz entre el servicio interno y la aplicación web

Para la comunicación entre nuestra aplicación web y el servicio interno hemos empleado **Sockets** de Java, en concreto las clases **ServerSocket** para el servicio interno y **Socket** para la aplicación web.

### Mensajes que se intercambian, el orden de los mismos y donde se dejan los datos

Cada vez que se escriba una noticia nueva en la aplicación, esta se encargará de conectarse mediante un socket al puerto 7777 en el que se encuentra escuchando el servicio interno. La aplicación obtendrá de la base de datos la lista de correos suscritos a la newsletter y los almacenará en una lista de Strings. Por otro lado, almacenará en otro String el link de la noticia, que irá en el cuerpo del email que será enviado.

A la hora de enviar los datos por la red, la aplicación escribirá una primera línea en el PrintWriter asociado al OutputStream del socket encargado de enviar los datos. Esta primera línea contendrá el link de la noticia que se acaba de publicar. A continuación, escribirá de la misma forma una línea por cada uno de los emails a los que se enviará la newsletter.

Por otro lado, el servidor una vez reciba la petición se pondrá a leer líneas hasta que el buffer se encuentre vacío. De la misma forma que en el cliente, almacenará en un string el link de la noticia y todos los emails en una lista de string. Una vez recibidos todos los datos, se pondra a enviar los correos a cada uno de los suscritos a la newsletter, mediante la API JavaMail , por último, se pondrá otra vez a la espera de peticiones.

## Diagrama de Navegación

El diagrama de navegación de nuestra aplicación se ha actualizado de la siguiente forma:


![DiagramaNavegacion](https://github.com/Juanixou/URJCGamingNews/blob/master/FotosMarkDown/DiagramaNavegacion - Fase 3.png?raw=true)
