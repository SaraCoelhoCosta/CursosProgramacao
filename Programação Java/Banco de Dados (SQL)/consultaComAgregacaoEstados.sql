-- Vai realizar a consulta somando(sum) a população de vários `Estados` diferentes.

-- Mostra região e total populacional em ordem decrescente.
SELECT regiao as 'Região', SUM(populacao) as 'Total' 
    FROM Estados 
        GROUP BY regiao
         ORDER BY Total DESC;

-- Mostra apenas total da população.
SELECT SUM(populacao) as 'Total' 
    FROM Estados;

-- Mostra média(avg) da população.
SELECT AVG(populacao) as 'Total' 
    FROM Estados;