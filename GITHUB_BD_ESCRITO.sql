CREATE DATABASE Github;
USE Github;
DROP SCHEMA Github;

CREATE TABLE Usuarios(
id int not null auto_increment,
usuario varchar(15) not null,
contraseña varchar(15) not null,
nombre varchar(50) not null,
primary	key (id)
);

 SET GLOBAL time_zone = '-3:00';
 
INSERT INTO Usuarios VALUES(null, "HectorSaldes","123456","Hector");
INSERT INTO Usuarios VALUES(null, "GandyA23","123456","Gandy");
INSERT INTO Usuarios VALUES(null, "Sterplay2010","123456","Raúl");
INSERT INTO Usuarios VALUES(null, "Laster","123456","Alexis");
INSERT INTO Usuarios VALUES(null, "Ludwig","123456","Luis");
INSERT INTO Usuarios VALUES(null, "Ordenajela1","123456","Sebastian");
INSERT INTO Usuarios VALUES(null, "Mane22","123456","Pavon");
SELECT * FROM USUARIOS;

-- CONSULTA PARA EL SISTEMA
-- SELECT nombre FROM USUARIOS WHERE usuario = ? AND contraseña = ?;

SELECT nombre FROM USUARIOS WHERE usuario = 'HectorSaldes' AND contraseña = '123456';