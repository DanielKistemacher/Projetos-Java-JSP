create database curriculoWeb;

create table PESSOA (
	id int AUTO_INCREMENT not null,
	nome varchar(150) not null,
	email varchar(50) not null,
	telefone varchar(15) not null,
	data_nascimento date not null,
	primary key (id)
);

create table USUARIO (
	id int AUTO_INCREMENT not null,
	nome varchar(150),
	senha varchar(200),
	primary key (id)
);

insert into usuario values (1,'admin','admin');
insert into usuario values (2,'juca','bala');