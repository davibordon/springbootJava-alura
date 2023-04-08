create table PACIENTE(
                        id int not null primary key auto_increment,
                        nome varchar(100),
                        cpf varchar(100),
                        email varchar(45) not null,
                        telefone varchar(100) not null,
                        endereco_id int not null,
                        foreign key (endereco_id) references ENDERECO (id)
);