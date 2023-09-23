alter table pacientes add ativo tinyint;
update pacientes set ativo = 1;
#A partir daqui, é possivel configurar a coluna ativo como not null#