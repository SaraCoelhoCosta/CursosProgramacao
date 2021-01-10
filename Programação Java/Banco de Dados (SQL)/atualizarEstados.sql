-- Atualiza dados da tabela `Estados`.

-- Muda a região de Santa Catarina que estava como 'Norte' para a região 'Sul'.
-- Como a sigla é única, não possui repetições então não vai mudar no lugar errado.
UPDATE Estados
SET regiao = 'Sul'
WHERE sigla = "SC";
