# Sistema de Registro de Asistencia

Bienvenido al repositorio del Sistema de Registro de Asistencia desarrollado en Java y SQL Server. Este sistema permite gestionar el registro de asistencia en un entorno educativo y cuenta con tres roles principales: Administrador, Profesor y Alumno.

## Comenzando 🚀
_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

### Pre-requisitos 📝

Antes de ejecutar el proyecto, asegúrate de tener lo siguiente:

- Java Development Kit (JDK) instalado en tu sistema.
- SQL Server instalado y configurado.
- Una base de datos en SQL Server con las tablas necesarias para el sistema. La configuración de conexión se encuentra en el archivo `CConexion.java`.
- Descarga el controlador JDBC para establecer la conexión entre Java y SQL Server. Puedes descargarlo desde [este enlace](https://learn.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-ver16).
- Librería JCalendar para la gestión de fechas en la interfaz gráfica.

### Configuración de la Base de Datos 🗃️

1. Crea una base de datos en SQL Server con las tablas requeridas para el sistema. Puedes encontrar los detalles de la estructura en el archivo de script `database.sql`.

2. En el paquete "Clases" se encuentra el archivo `CConexion.java`, proporciona el nombre de la base de datos, el nombre de usuario y la contraseña para la conexión a SQL Server.

```java
String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=yourName;"
                + "user=yourUser;"
                + "password=userPassword;"
                + "loginTimeout=30;"
                + "TrustServerCertificate=True;";
```
### Instalación 🔧
1. Clona este repositorio a tu máquina local:

```
git clone https://github.com/RafBD/RegistroAsistencia
```

2. Agrega el controlador JDBC descargado previamente al proyecto.
3. Agrega la librería JCalendar al proyecto para gestionar fechas en la interfaz.
4. Importa el proyecto en tu entorno de desarrollo Java.

### Uso 🤚🏽

1. Ejecuta la aplicación.

2. Utiliza uno de los siguientes roles:

- Administrador: Gestiona profesores y alumnos.
- Profesor: Toma asistencias, gestiona asistencias por fechas.
- Alumno: Consulta la asistencia general de la clase.

### Consultas y Stored Procedures 🔎
Algunas de las consultas a la base de datos se realizan mediante Stored Procedures para seguridad y rendimiento.

#### Contribuciones 🙌🏽
¡Las contribuciones son bienvenidas! Para contribuir, sigue los pasos habituales de bifurcación y solicitudes pull. 😉

¡Gracias por tu interés en este proyecto! Siéntete libre de contactarnos para cualquier pregunta o comentario.

⌨️ con ❤️ por [Rafael Benítez Díaz](https://github.com/RafBD) 😊
