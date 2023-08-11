const crypto = require('crypto');
const connection = require('../database/connection');

module.exports = {

    // Cria usuário
    async create(req, res) {
        const id = crypto.randomBytes(4).toString('HEX');
        const { nome, email, idade, empresa } = req.body;
        await connection('usuarios').insert({
            id,
            nome,
            email,
            idade,
            empresa
        });
        res.json({ id });
    },

    // Atualiza usuário
    async update(req, res) {
        const { id } = req.params;
        const { nome, email, idade, empresa } = req.body;
        await connection('usuarios').where('id', id).update({
            nome,
            email,
            idade,
            empresa
        });
        return res.status(204).send();
    },

    // Lista usuários
    async list(req, res) {
        const usuarios = await connection('usuarios').select('*');
        res.json(usuarios);
    },

    // Exibe um único usuário
    async show(req, res) {
        const { id } = req.params;
        const usuario = await connection('usuarios')
            .where('id', id)
            .select('*');
        res.json(usuario);
    },

    // Deleta um usuário
    async delete(req, res) {
        const { id } = req.params;
        await connection('usuarios').where('id', id).delete();
        return res.status(204).send();
    },

}