// const connection = require('./database/connection');
// const crypto = require('crypto');
const express = require('express');
const routes = express.Router();
const UserController = require('./controller/UserController');

routes.get('/users', UserController.list);
routes.post('/users', UserController.create);
routes.get('/users/:id', UserController.show);
routes.put('/users/:id', UserController.update);
routes.delete('/users/:id', UserController.delete);
/*
// Cadastra usuário
routes.post('/users', async (req, res) => {
    const id = crypto.randomBytes(4).toString('HEX');
    const { nome, email, idade, empresa } = req.body;
    await connection('usuarios').insert({
        id,
        nome,
        email,
        idade,
        empresa
    });
    res.json({id});
})

// Lista usuários cadastrados
routes.get('/users', async (req, res) => {
    const usuarios = await connection('usuarios').select('*');
    res.json(usuarios);
})
*/

module.exports = routes;