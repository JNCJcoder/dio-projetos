create database IF NOT EXISTS Oficina;

use Oficina;

create table Clientes(
    IdClientes int auto_increment primary key
);

alter table Clientes add constraint fk_Veiculo foreign key (IdClientes) references Veiculo(IdVeiculo);

create table PessoaFisica(
    IdPessoaFisica int primary key auto_increment,
    Nome varchar(45) not null,
    CPF char(11) not null,
    Endereço varchar(45),
    Telefone varchar(11)
);

alter table PessoaFisica add constraint unique_cpf_PessoaFisica unique (CPF);
alter table PessoaFisica add constraint fk_IdClientes_pf foreign key (IdPessoaFisica) references Clientes(IdClientes),
add constraint fk_Veiculo_pf foreign key (IdPessoaFisica) references Veiculo(IdVeiculo); -- nome das FK não podem se duplicar, entao juntar sempre as tabelas

create table PessoaJuridica(
    IdPessoaJuridica int primary key auto_increment,
    RazaoSocial Varchar(45) not null,
    CNPJ varchar(15) not null,
    Endereço varchar(45),
    Telefone varchar(11),
    constraint unique_cnpj_PessoaJuridica unique (CNPJ)
);

alter table PessoaJuridica add constraint fk_IdClientes_pj foreign key (IdPessoaJuridica) references Clientes(IdClientes),
add constraint fk_Veiculo_pj foreign key (IdPessoaJuridica) references Veiculo(IdVeiculo);

create table Veiculo(
    IdVeiculo int primary key auto_increment,
    PlacaVeiculo char(7) not null,
    constraint placa_id_Veiculo unique (IdVeiculo, PlacaVeiculo)
);

alter table Veiculo add constraint fk_equi_Mecanicos foreign key (IdVeiculo) references EquipeMecanico(IdEquipeMecanico),
add constraint fk_Conserto foreign key (IdVeiculo) references Conserto(IdConserto),
add constraint fk_Revisao foreign key (IdVeiculo) references Revisao(IdRevisao);

create table Conserto(
    IdConserto int primary key auto_increment,
    Descrição varchar(45) not null
);

create table Revisao(
    IdRevisao int primary key auto_increment,
    Descrição varchar(45) not null
);

create table Mecanico(
    IdMecanico int primary key auto_increment,
    NomeMecanico varchar(45) not null,
    Telefone char(11) not null,
    Especialidade varchar(45)
);

create table EquipeMecanico(
    IdEquipeMecanico int primary key auto_increment
);

alter table EquipeMecanico add constraint fk_Mecanico foreign key (IdEquipeMecanico) references Mecanico(IdMecanico);
alter table EquipeMecanico add constraint fk_ordem_servico foreign key (IdEquipeMecanico) references OrdemServico(IdOrdemServico);

create table OrdemServico(
    IdOrdemServico int primary key auto_increment,
    DataEmissao date,
    ValorServico decimal(5,2) not null,
    ValorPeca decimal(5,2) not null,
    ValorTotal decimal(5,2) not null,
    Status enum('Na Fila', 'Em Andamento', 'Concluido', 'Cancelado'),
    DataConclusao date
);

create table TabelaReferencia(
    IdTabelaReferencia int primary key auto_increment,
    constraint fk_os_tab_ref foreign key (IdTabelaReferencia) references OrdemServico(IdOrdemServico)
);

create table AutorizacaoCliente(
    IdAutorizacaoCliente int primary key auto_increment,
    Autorizado boolean,
    constraint fk_aut_cliente foreign key (IdAutorizacaoCliente) references Clientes(IdClientes),
    constraint fk_aut_Veiculo foreign key (IdAutorizacaoCliente) references Veiculo(IdVeiculo),
    constraint fk_aut_OS foreign key (IdAutorizacaoCliente) references OrdemServico(IdOrdemServico)
);

create table Pecas(
    IdPecas int primary key auto_increment,
    Descrição varchar(45),
    Valor decimal(5,2)
);

create table OSPecas(
    IdOSPecas int primary key auto_increment,
    constraint fk_Pecas foreign key (IdOSPecas) references Pecas(IdPecas),
    constraint fk_os_Pecas foreign key (IdOSPecas) references OrdemServico(IdOrdemServico)
);

create table Servicos(
    IdServicos int primary key auto_increment,
    Descrição varchar(45),
    Valor decimal(5,2)
);

create table OSServicos(
    IdOSServicos int primary key auto_increment,
    constraint fk_Servicos foreign key (IdOSServicos) references Servicos(IdServicos),
    constraint fk_os_Servicos foreign key (IdOSServicos) references OrdemServico(IdOrdemServico)
);