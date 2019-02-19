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

  

|Nombre |Apellidos |Correo |Cuenta Github

  

|-----------|----------------|--------------------------|---------------|

  

|Juan Daniel|Silva Mora |[jd.silva@alumnos.urjc.es](mailto:jd.silva@alumnos.urjc.es) |[juanixou](https://github.com/juanixou)

  

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
