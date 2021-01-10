-- Consulta com mútiplas tabelas.

-- Usa apelido para identificar de qual tabela pertence o atributo. O where serve como filtro.
SELECT
    e.nome as Estados,
    c.nome as Cidades,
    regiao as Região
FROM Estados e, Cidades c
WHERE e.id = c.estado_id;

-- INNER JOIN permite usar um operador de comparação, usando valores de colunas provenientes de tabelas associadas.
SELECT
    e.nome as Estado,
    c.nome as Cidade,
    regiao as Região
-- `Estados` está sendo comparado com `Cidades` e em seguida dizendo qual a comparação.
FROM Estados e
    INNER JOIN Cidades c
    on e.id = c.estado_id;