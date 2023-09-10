create table curriculo (
	id int AUTO_INCREMENT not null,
	data_hora_cadastro varchar(100) not null,
	nome varchar(100) not null,
	e_mail varchar(100) not null,
	telefone varchar(20) not null,
	escolaridade varchar(45) not null,
	experiencias_profissionais varchar(500) not null,
	outros varchar(500),
	situacao varchar(1) not null,
	primary key (id)
);