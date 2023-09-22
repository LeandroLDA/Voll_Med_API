alter table medicos add ativo tinyint;
update medicos set ativo = 1;
#A partir daqui, é possivel configurar a coluna ativo como not null#