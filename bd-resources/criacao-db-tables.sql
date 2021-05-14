create database sistema_floricultura;
use sistema_floricultura;

create table endereco(
	id_end int not null auto_increment,
    estado varchar(40) not null,
    cudade varchar(40) not null,
    bairro varchar(40) not null,
    rua varchar(120) not null,
    
    primary key (id_end)
);

create table cliente(
	id_cli int not null auto_increment,
    CPF varchar(11) not null unique,
    nome varchar(60) not null,
    email varchar(120) not null,
    estado_civil varchar(30) not null,
    data_nasc date not null,
    fk_id_endereco int not null,
    
    primary key (id_cli),
    foreign key (fk_id_endereco) references endereco(id_end)
);

create table venda(
	id_venda int not null auto_increment,
    data_venda date not null,
    fk_id_cli int not null,
    
    primary key (id_venda),
    foreign key (fk_id_cli) references cliente(id_cli)
);

create table tipo_prod(
	id_tipo int not null auto_increment,
    nome varchar(30) not null,
    
    primary key (id_tipo)
);

create table produto(
	id_produto int not null auto_increment,
    nome varchar(60) not null,
    valor_unitario decimal(10,2) not null,
    estoque int not null,
    descricao varchar(500),
    fk_id_tipo_prod int not null,
    
    primary key (id_produto),
    foreign key (fk_id_tipo_prod) references tipo_prod(id_tipo)
);

create table item_venda(
	id_item int not null auto_increment,
    quantidade int not null,
    valor_total decimal(10,2) not null,
    fk_id_venda int not null,
    fk_id_produto int not null,
    
    primary key (id_item),
    foreign key (fk_id_venda) references venda(id_venda),
    foreign key (fk_id_produto) references produto(id_produto)
);
