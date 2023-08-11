/**
 * @param { import("knex").Knex } knex
 * @returns { Promise<void> }
 */

// Realizar ação no BD
exports.up = function (knex) {
    return knex.schema.createTable('usuarios', function (tabela) {
        tabela.string('id').primary();
        tabela.string('nome', 255).notNullable;
        tabela.string('email', 255).notNullable;
        tabela.integer('idade');
        tabela.string('empresa');
    })
};

/**
 * @param { import("knex").Knex } knex
 * @returns { Promise<void> }
 */

// Desfazer ação no BD
exports.down = function (knex) {
    return knex.schema.dropTable('usuarios');
};
