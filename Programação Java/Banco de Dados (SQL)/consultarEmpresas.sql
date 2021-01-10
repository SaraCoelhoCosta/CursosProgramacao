-- Consulta com tabela relacional.

-- Colunas.
SELECT
    e.nome as Empresas,
    c.nome as 'Cidades'
FROM
-- Informações que serão utilizadas.
    Empresas e,
    empresas_unidades eu,
    Cidades c
-- Condição de quais informações serão exibidas.
WHERE e.id = eu.empresa_id
    AND
    c.id = eu.cidade_id
    AND
    sede;