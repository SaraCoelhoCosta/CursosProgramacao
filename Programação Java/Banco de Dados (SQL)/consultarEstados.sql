-- Consulta a todos os dados da tabela `Estados`.
SELECT * FROM Estados;

-- Consulta apenas as colunas nome e sigla respectivamente da tabela `Estados`.
SELECT nome, sigla FROM Estados;

-- O SQL é case sensitive. Mostra as colunas sigla e nomes da tabela `Estados` com título diferente.
-- A mudança ocorre sem o 'as'.
SELECT Sigla, nome as 'Nome do Estado' FROM Estados;

-- Mostra as sigla e nomes da tabela `Estados` quando for da região SUL.
SELECT Sigla, nome as 'Nome do Estado' FROM Estados WHERE regiao = 'Sul';

-- Mostra os nomes e regiões da tabela `Estados` quando a população é maior/igual a 10, ordenado do maior para o menor.
-- Quando não tem o DESC ordena do menor para o maior.
SELECT nome, regiao, populacao FROM Estados WHERE populacao >= 10 ORDER BY populacao DESC;


-- Pode ser usado como: 
SELECT Estados.`nome` FROM Estados WHERE sigla = "SC"; 
-- Pode colocar apelido como 'est' e tirar os til.
SELECT est.nome FROM Estados est WHERE sigla = "MA"; 
-- Só pode colocar múltiplos atributos sem o apelido, pois está acessando apenas uma tabela. 
SELECT est.nome, sigla FROM Estados est WHERE sigla = "MA"; 