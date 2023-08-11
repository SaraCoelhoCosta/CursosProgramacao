const express = require('express');

const app = express();

// Objeto para o request body 
app.use(express.json());

/* O GET recebe dois parâmetros: rota e função
 * req - requisição que traz todos os parâmetros da página referente a quem requisitou (dados do solicitante)
 * res - resposta exibida na página
 * 
 * app.get('/', (req, res) => {
 *       res.send("Hello World!!!") // Enviado (exibido) na página
 *   }
 * );
 */

/*
 * Métodos:
 * GET - buscar ou listar uma informação no back-end (pega dados)
 * POST - criar uma informação no back-end
 * PUT - alterar uma informação no back-end
 * DELETE - deletar uma informação no back-end
 * 
 */ 

/*
 * Parâmetros:
 * Query - recebe parâmetros nomeados enviados na rota
 * Rotes param - parâmetros usados para identificar um recurso
 * Request body - corpo da requisição
 */

// Recebendo parâmetro nomeado
app.get('/users', (req, res) => {
        
        const parametros = req.query;
        console.log(parametros);

        const route = req.route;
        console.log(route);

        res.json(
            {
                nome: 'Sara',
                empresa: 'Prefeitura' 
            }
        )
    }
);

// Identificando recurso
app.post('/users/:id', (req, res) => {
    const parametros = req.params;
    console.log(parametros);
    res.json(parametros)
}
);

// Corpo da requisição
/* app.post('/users/:id', (req, res) => {
 *    const parametros = req.body;
 *    console.log(parametros);
 *    res.json(parametros)
 * });
 */


// No browser na porta 3001 vai rodar a aplicação
app.listen(3001);
