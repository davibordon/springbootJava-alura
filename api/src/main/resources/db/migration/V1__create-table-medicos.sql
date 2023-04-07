create table ENDERECO(
                         endereco_id int not null auto_increment,
                         logradouro varchar(100),
                         bairro varchar(100),
                         cep varchar(100),
                         cidade varchar(100),
                         uf varchar(100),
                         complemento varchar(100),
                         numero varchar(100),
                         primary key(endereco_id)
);

create table MEDICOS(
                        id int not null primary key auto_increment,
                        nome varchar(100),
                        email varchar(45) not null,
                        crm varchar(100) not null,
                        especialidade varchar(100) not null,
                        endereco_id int not null,
                        foreign key (endereco_id) references ENDERECO (endereco_id)
);