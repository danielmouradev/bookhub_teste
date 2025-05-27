create table usuarios(
id int auto_increment primary key, 
nome varchar(100), 
cpf varchar(20), 
email varchar(100) unique, 
senha varchar(100), 
nascimento date, 
telefone varchar(100) 
);