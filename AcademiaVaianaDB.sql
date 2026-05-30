create database academia;
 
use academia;
 
create table aluno (
    matricula int auto_increment primary key,
    nome varchar(100),
    cpf varchar(20) unique,
    genero varchar(20),
    dtNascimento date,
    endereco varchar(200),
    email varchar(100),
    celular varchar(20),
    objetivo varchar(200),
    limitacao varchar(200)
);

select * from aluno;
