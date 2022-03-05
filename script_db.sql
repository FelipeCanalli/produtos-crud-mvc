CREATE DATABASE IF NOT EXISTS dbpizzaria;
use dbpizzaria;

create table tbproduto(
	idproduto INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR (20) NOT NULL,
    nomeproduto VARCHAR(50) NOT NULL,
    descricao VARCHAR (100) ,
    preco DECIMAL(10 , 2 ) NOT NULL
);

 -- Populando a tabela tbproduto
 INSERT into tbproduto (tipo,nomeproduto,descricao,preco) VALUES('Pizza salgada','Bacon I','Bacon, Muçarela','27.00');
 INSERT into tbproduto (tipo,nomeproduto,descricao,preco) VALUES('Pizza salgada','Calabresa I','Calabresa, Muçarela','27.00');
 INSERT into tbproduto (tipo,nomeproduto,descricao,preco) VALUES('Pizza salgada','Calabresa II','Calabresa, Catupiry','27.00');
 INSERT into tbproduto (tipo,nomeproduto,descricao,preco) VALUES('Bebida','Coca cola','600 ml','5.00');
 INSERT into tbproduto (tipo,nomeproduto,descricao,preco) VALUES('Pizza doce','Banofe','Banana, Doce de leite, Chantily, Bolacha','27.00');
 INSERT into tbproduto (tipo,nomeproduto,descricao,preco) VALUES('Bebida','Itubaina','1 Litro','6.00');
 INSERT into tbproduto (tipo,nomeproduto,descricao,preco) VALUES('Pizza salgada','Bacon II','Bacon, Catupiry','27.00');
 INSERT into tbproduto (tipo,nomeproduto,descricao,preco) VALUES('Pizza salgada','Da Moda','Frango, Catupiry, Calabresa, Muçarela','27.00');
 INSERT into tbproduto (tipo,nomeproduto,descricao,preco) VALUES('Pizza salgada','Frango com Catupiry','Frango, Catupiry, Bacon','27.00');
 INSERT into tbproduto (tipo,nomeproduto,descricao,preco) VALUES('Bebida','Dolly','2 Litros','7.00');
 INSERT into tbproduto (tipo,nomeproduto,descricao,preco) VALUES('Pizza doce','Morango com Chocolate','Morango, Chocolate, Leite condesado','27.00');
 INSERT into tbproduto (tipo,nomeproduto,descricao,preco) VALUES('Bebida','Itubaina','2 Litros','7.00');
 
 SELECT idproduto,tipo, nomeproduto, descricao, REPLACE(preco,'.',',') as preco from tbproduto order by tipo desc;
  