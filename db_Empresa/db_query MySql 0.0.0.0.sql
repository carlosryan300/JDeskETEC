/*Criação de base de dados */
CREATE DATABASE db_Empresa;
-------------------------------------------------------------------------------------------------------------------------------------------------
/*Usar base de dados*/(
USE db_Empresa;
-------------------------------------------------------------------------------------------------------------------------------------------------
/*CRIAÇÃO DA TABELA LOGIN*/
CREATE TABLE Tbl_Login(id_login INT NOT NULL CONSTRAINT id_Login_fk PRIMARY KEY IDENTITY(100,1), 
                       Usuario NVARCHAR(50) UNIQUE NOT NULL,
					   Senha NVARCHAR(50) NOT NULL);
					   
-------------------------------------------------------------------------------------------------------------------------------------------------
/*CRIAÇÃO DA TABELA USUARIO*/
CREATE TABLE Tbl_Usuario(id_Usuario INT NOT NULL CONSTRAINT id_Usuario_pk
                         PRIMARY KEY IDENTITY(1,1),
                         Nome NVARCHAR(15) NOT NULL,
						 Sobrenome NVARCHAR(40) NOT NULL,
						 CPF DECIMAL(11,0) CONSTRAINT Uq_CPF UNIQUE NOT NULL,
						 RG DECIMAL(9,0) CONSTRAINT Uq_RG  UNIQUE NOT NULL,
						 Sexo NVARCHAR (8) NOT NULL CONSTRAINT ck_cli_Sexo CHECK (Sexo in('Masculino','Feminino')),
						 Data_de_Nascimento DATE NOT NULL,
						 Endereco NVARCHAR (50) NOT NULL,
						 Nº NUMERIC (5) NOT NULL,
						 Complemento NVARCHAR (10),
						 Bairro NVARCHAR (30) NOT NULL,
						 Cidade NVARCHAR (30)NOT NULL,
						 Estado NVARCHAR (15) NOT NULL,
						 Cargo NVARCHAR (20)NOT NULL,
						 Salario MONEY NOT NULL,
					     Carta_Habilitacao VARCHAR NOT NULL,
						 Telefone NUMERIC (10) NOT NULL,
						 Celular NUMERIC (11) NOT NULL,
						 Email NVARCHAR (40) NOT NULL);
-------------------------------------------------------------------------------------------------------------------------------------------------
/*CRIAÇÃO DA TABELA VEICULO EMPRESA*/
CREATE TABLE Tbl_Veiculo_Emp(id_Veiculo int NOT NULL CONSTRAINT id_Veiculo_fk
                             PRIMARY KEY IDENTITY (1,1),
							 Placa CHAR (7) NOT NULL CONSTRAINT Uq_Placa UNIQUE,
							 Modelo VARCHAR NOT NULL,
							 Marca VARCHAR NOT NULL,
							 Cor VARCHAR NOT NULL,
							 Chassi CHAR (17) NOT NULL CONSTRAINT Uq_Chassi UNIQUE,
							 Categoria_Veiculo VARCHAR NOT NULL,
							 Categoria_habilitacao VARCHAR NOT NULL CONSTRAINT ck_cli_habilitação
							                       CHECK (Categoria_habilitacao in ('A','B','A&B','C','D','C')),
			 				 id_Usuario INT NOT NULL CONSTRAINT id_Usuario_pk 
							            FOREIGN KEY (id_Usuario) REFERENCES Tbl_Usuario);
										
-------------------------------------------------------------------------------------------------------------------------------------------------							  
/*ALTERAR TABELA TBL_VEICULO*/
ALTER TABLE Tbl_Usuario
           ADD id_Veiculo INT NOT NULL
           CONSTRAINT id_Veiculo_pk FOREIGN KEY (id_Veiculo)
		   REFERENCES Tbl_Veiculo_Emp;
-------------------------------------------------------------------------------------------------------------------------------------------------
/*CRIAÇÃO DA TABELA MARCA*/
CREATE TABLE Tbl_Marca(id_Marca INT NOT NULL CONSTRAINT id_Marca_fk
					   PRIMARY KEY IDENTITY (1,1),
					   Marca NVARCHAR NOT NULL);
-------------------------------------------------------------------------------------------------------------------------------------------------
/*CRIAÇÃO DA TABELA MARCA*/
CREATE TABLE Tbl_Modelo(id_Modelo INT NOT NULL CONSTRAINT id_Modelo_fk
					   PRIMARY KEY IDENTITY (1,1),
					   Modelo NVARCHAR NOT NULL);
-------------------------------------------------------------------------------------------------------------------------------------------------
/*CRIAÇÃO DA TABELA CARRO*/
CREATE TABLE Tbl_Carro(id_Carro INT NOT NULL CONSTRAINT id_Carro_fk 
					   PRIMARY KEY IDENTITY (1,1),
					   Placa CHAR (7) NOT NULL CONSTRAINT Uq_Placa UNIQUE,
                       id_Modelo INT NOT NULL CONSTRAINT id_Modelo_fk FOREIGN KEY (id_Modelo)
		               REFERENCES Tbl_Modelo,
					   id_Marca INT NOT NULL CONSTRAINT id_Marca_fk FOREIGN KEY (id_Marca)
		               REFERENCES Tbl_Marca);

-------------------------------------------------------------------------------------------------------------------------------------------------
/*CRIAÇÃO DA TABELA CLIENTE_NOMAL*/
CREATE TABLE Tbl_Cliente(id_Cliente INT NOT NULL CONSTRAINT id_Cliente_FK
						 PRIMARY KEY IDENTITY (1,1),
						 Nome VARCHAR NOT NULL,
						 Sobrenome VARCHAR,
						 CPF DECIMAL(11,0) CONSTRAINT Uq_CPF UNIQUE NOT NULL,
						 Tipo_Prod NVARCHAR NOT NULL,
						 Celular NUMERIC (11,0) NOT NULL,
						 Telefone NUMERIC (10,0),
						 id_Carro INT NOT NULL
                                  CONSTRAINT id_Carro_pk FOREIGN KEY (id_Carro)
		                          REFERENCES Tbl_Carro);
-------------------------------------------------------------------------------------------------------------------------------------------------
/*CRIAÇÃO DA TABELA CLIENTE_TERCEIRO*/
CREATE TABLE Tbl_Cliente_Terceiro(id_Cliente_Terceiro INT NOT NULL CONSTRAINT id_Cliente_Terceiro_FK
						 PRIMARY KEY IDENTITY (1,1),
						 Razão_Social VARCHAR NOT NULL,
						 CNPJ VARCHAR NOT NULL CONSTRAINT Uq_CNPJ UNIQUE,
						 Ramo VARCHAR NOT NULL,
						 Area_Atuacao VARCHAR NOT NULL,
						 Porte VARCHAR NOT NULL,
						 Telefone NUMERIC (10) NOT NULL CONSTRAINT Uq_Telefone UNIQUE,
						 Telefone2 NUMERIC (11,0),
						 id_Carro INT NOT NULL
                                  CONSTRAINT id_Carro_pk FOREIGN KEY (id_Carro)
		                          REFERENCES Tbl_Carro);
-------------------------------------------------------------------------------------------------------------------------------------------------
/*CRIAÇÃO DAS TABELAS SERVIÇO*/
CREATE TABLE Tbl_Servico1(id_Servico1 INT NOT NULL CONSTRAINT id_Servico1_fk
						 PRIMARY KEY IDENTITY (1,1),
						 Tipo_de_Servico VARCHAR NOT NULL,
						 Valor_Cobrado MONEY NOT NULL,
						 id_Carro INT NOT NULL
                                  CONSTRAINT id_Carro_pk FOREIGN KEY (id_Carro)
		                          REFERENCES Tbl_Carro, 
                         id_Cliente INT NOT NULL
						          CONSTRAINT id_Cliente_pk FOREIGN KEY (id_Cliente)
		                          REFERENCES Tbl_Cliente);

CREATE TABLE Tbl_Servico2(id_Servico2 INT NOT NULL CONSTRAINT id_Servico2_fk
						 PRIMARY KEY IDENTITY (1,1),
						 Tipo_de_Servico VARCHAR NOT NULL,
						 Valor_Cobrado MONEY NOT NULL,
						 id_Cliente_Terceiro INT NOT NULL
                                  CONSTRAINT id_Cliente_Terceiro_pk FOREIGN KEY (id_Cliente_Terceiro)
		                          REFERENCES Tbl_Cliente_Terceiro);

                         
-------------------------------------------------------------------------------------------------------------------------------------------------						 
/*CRIAÇÃO DA TABELA PONTO DO VEICULO DA EMPRESA*/
CREATE TABLE Tbl_Ponto_V(id_Ponto_V INT NOT NULL CONSTRAINT id_Ponto_V_fk
                      PRIMARY KEY IDENTITY(1,1),
				      Longitude NVARCHAR NOT NULL,
					  Latitude NVARCHAR NOT NULL,
					  Km NUMERIC NOT NULL,
					  id_Veiculo INT NOT NULL CONSTRAINT id_Veiculo_fk
					             FOREIGN KEY (id_Veiculo)
								 REFERENCES Tbl_Veiculo_Emp);
-------------------------------------------------------------------------------------------------------------------------------------------------
/*CRIAÇÃO DA TABELA PONTO DO VEICULO DO CLIENTE*/
CREATE TABLE Tbl_Ponto_Cli(id_Ponto_Cli INT NOT NULL CONSTRAINT id_Ponto_Cli_fk
                      PRIMARY KEY IDENTITY(1,1),
				      Longitude NVARCHAR NOT NULL,
					  Latitude NVARCHAR NOT NULL,
					  Km NUMERIC NOT NULL,
					  id_Carro INT NOT NULL CONSTRAINT id_Carro_fk
					             FOREIGN KEY (id_Carro)
								 REFERENCES Tbl_Carro);
								 					  	 
-----------------------------------------------------------------------------------------------------------------------------------------------------

create table Gastos(id_gastos int not null auto_increment,
					tipo varchar(20),
					descricao varchar(150),
					valor double,
                    dataCad date,
Primary key (id_gastos)
				
);
select*from Gastos;

create table teste(id int not null auto_increment,
                   total int,
primary key(id));

CREATE TRIGGER tr_inserir BEFORE INSERT
ON Gastos
FOR EACH ROW

INSERT teste(total)values(2);
no 
esquece d falar deu um erro quendo tentei colocar mais de uma trigger na mesma tabela, então pra eu inserir um ao invés de atualizar eu tive que apagar a antiga
DELIMITER $$
USE `projeto_java`$$
DROP TRIGGER IF EXISTS `projeto_java`.`tr_inserir` $$
DELIMITER ;



