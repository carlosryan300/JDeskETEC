CREATE DATABASE db_Empresa;

create user 'db_empresa'@'localhost' identified by '1234';

grant all on *.* to 'db_empresa'@'localhost' with grant option;

USE db_Empresa;


CREATE TABLE Servico (
  id_Servico INT  NOT NULL  AUTO_INCREMENT,
  TipoServico VARCHAR (20)  NOT NULL,
  valorCobrado NVARCHAR(10) NOT NULL,
PRIMARY KEY(id_Servico)
);




CREATE TABLE Funcionario (
  id_Funcionario INT  NOT NULL  AUTO_INCREMENT,
  Nome VARCHAR(20)NOT NULL,
  sobrenome VARCHAR(40)NOT NULL,
  cpf VARCHAR(14)NOT NULL UNIQUE,
  rg VARCHAR(12)NOT NULL UNIQUE,
  sexo VARCHAR(1)NOT NULL,
  data_nasc DATE NOT NULL,
  endereco VARCHAR(50)NOT NULL,
  Nº INT NOT NULL, 
  complemento VARCHAR(15)NOT NULL,
  bairro VARCHAR(30)NOT NULL,
  cidade VARCHAR(30)NOT NULL,
  estado VARCHAR(15)NOT NULL,
  cargo VARCHAR(20)NOT NULL,
  salario double NOT NULL,
  habilitacao VARCHAR(3)
	          CHECK (habilitacao in ('A','B','A&B','C','D','C&D')),
  telefone VARCHAR (13) NOT NULL,
  celular VARCHAR(14) NOT NULL,
  email VARCHAR(50) NOT NULL,
PRIMARY KEY(id_Funcionario)
);


CREATE TABLE UsuarioLogin (
  id_Login INT  NOT NULL  AUTO_INCREMENT,
  nome VARCHAR (15) NOT NULL,
  login VARCHAR (15) NOT NULL,
  senha VARCHAR(30) NOT NULL,
  cpf VARCHAR(14) NOT NULL UNIQUE,
  email VARCHAR(50),
  Status_2 VARCHAR (8) NOT NULL,
  data_cadastro DATETIME  NOT NULL,
PRIMARY KEY(id_Login)
);


CREATE TABLE Modelo (
  id_modelo INT  NOT NULL  AUTO_INCREMENT,
  modelo VARCHAR(25)  NOT NULL,
  cor VARCHAR (20) NOT NULL,
PRIMARY KEY(id_modelo)
);


CREATE TABLE ClientePJ (
  id_cliente_PJ INT  NOT NULL  AUTO_INCREMENT,
  razaoSocial VARCHAR(40)  NOT NULL,
  cnpj VARCHAR (19) NOT NULL UNIQUE ,
  ramo VARCHAR (50) NOT NULL,
  areaAtuacao VARCHAR (20) NOT NULL,
  porte VARCHAR (15) NOT NULL,
  telefone1 VARCHAR (13) NOT NULL,
  telefone2 VARCHAR (13),
PRIMARY KEY(id_cliente_PJ)
);


CREATE TABLE ClientePF (
  id_cliente_PF INT  NOT NULL AUTO_INCREMENT,
  nome VARCHAR(20) NOT NULL  ,
  sobrenome VARCHAR(40),
  apelido VARCHAR(15),
  cpf VARCHAR (14) NOT NULL UNIQUE,
  celular NUMERIC(14) NOT NULL  ,
  telefone NUMERIC (13),
PRIMARY KEY(id_cliente_PF)
);


CREATE TABLE Marca (
  id_marca INT  NOT NULL AUTO_INCREMENT,
  marca VARCHAR(20)  NOT NULL,
PRIMARY KEY(id_marca)
);


CREATE TABLE VeiculoEmpresa (
  id_VeiculoEmp INT  NOT NULL  AUTO_INCREMENT,
  id_Fun INT NOT NULL,
  placa VARCHAR (8) NOT NULL,
  modelo VARCHAR (15)NOT NULL,
  marca VARCHAR (15)NOT NULL,
  cor VARCHAR (15)NOT NULL,
  chassi VARCHAR (22)NOT NULL UNIQUE,
  categoria_Vei VARCHAR (15)NOT NULL,
  categoria_Hab VARCHAR(3)
	     CHECK (categoria_Hab IN ('A','B','A&B','C','D','C')),
  FOREIGN KEY(id_Fun)
    REFERENCES Funcionario(id_Funcionario),
PRIMARY KEY(id_VeiculoEmp)   
);

CREATE TABLE Produto (
  id_Produto INT  NOT NULL AUTO_INCREMENT,
  placa VARCHAR(8),
  tipo_produto VARCHAR(15) NOT NULL,
  id_cli INT  NOT NULL,
  id_cliPJ INT  NOT NULL,
  id_ser INT  NOT NULL,
  id_mod INT  NOT NULL,
  id_mar INT  NOT NULL,
PRIMARY KEY(id_Produto),

  FOREIGN KEY(id_mar)
    REFERENCES Marca(id_marca),
    
  FOREIGN KEY(id_mod)
    REFERENCES Modelo(id_modelo),
    
  FOREIGN KEY(id_cliPJ)
    REFERENCES ClientePJ(id_cliente_PJ),
    
  FOREIGN KEY(id_ser)
    REFERENCES Servico(id_Servico),
    
  FOREIGN KEY(id_cli)
    REFERENCES ClientePF(id_cliente_PF)
);/*FOREIGN KEY(id_Fun)
    REFERENCES Funcionario(id_Funcionario),*/
    

drop table usuario;

CREATE INDEX tbl_carro_FKIndex1 ON Produto (tbl_marca_id_marca);

CREATE INDEX tbl_carro_FKIndex2 ON Produto (tbl_modelo_id_modelo);

CREATE INDEX tbl_carro_FKIndex3 ON Produto (tbl_cliente_PJ_id_cliente_PJ);

CREATE INDEX tbl_carro_FKIndex4 ON Produto (tbl_Usuario_id_Usuario);

CREATE INDEX tbl_prduto_FKIndex5 ON Produto (tbl_Servico_id_Servico);

CREATE INDEX tbl_prduto_FKIndex6 ON Produto (tbl_cliente_PF_id_cliente_PF);



CREATE INDEX IFK_Rel_carro1 ON Produto (tbl_marca_id_marca);

CREATE INDEX IFK_Rel_carro2 ON Produto (tbl_modelo_id_modelo);

CREATE INDEX IFK_Rel_clienteT ON Produto (tbl_cliente_PJ_id_cliente_PJ);

CREATE INDEX IFK_Rel_Usuario2 ON Produto (tbl_Usuario_id_Usuario);

CREATE INDEX IFK_Rel_07 ON Produto (tbl_Servico_id_Servico);

CREATE INDEX IFK_Rel_08 ON Produto (tbl_cliente_PF_id_cliente_PF);

select*from usuariologin;

/*

CREATE TABLE  Gastos (ID INT NOT NULL AUTO_INCREMENT,
                      tipo VARCHAR(40) NOT NULL,
                      descricao VARCHAR(120),
                      valor DOUBLE,
                      datacad DATE,
PRIMARY KEY(ID)); 

drop table gastos;       

Select para buscar e ordena a coluna data
select tipo,descricao,valor,datacad from gastos where datacad between '2015/01/01' and '2016/12/12' ORDER BY datacad;

Select para somar a coluna valor
select sum(valor) as total from gastos; 

INSERT INTO Gastos (tipo,descricao,valor,datacad)
			VALUES ('ALIMENTACAO',	'GASTO NO RESTAURANTE', 20.00,'2015/01/01'),
                   ('CAFÉ',	'GASTO PARA LANCHONETE', 25.00,'2016/01/05'),
				   ('MECANICO',	'GASTO PARA TROCAR', 30.00,'2015/06/28'),
                   ('ALMOÇO',	'GASTO NO BAR', 50.00,'2016/02/09'),
                   ('GASOLINA',	'GASTO PARA ASBASTERCER', 135.00,'2015/06/30'),
                   ('GASOLINA',	'GASTO PARA ASBASTERCER', 100.00,'2016/05/21'),
                   ('GASOLINA',	'GASTO PARA ASBASTERCER', 75.00,'2015/01/05'),
                   ('GASOLINA',	'GASTO PARA ASBASTERCER', 210.00,'2016/11/29')
                   
select*from gastos order by datacad;              
                                    

*/
