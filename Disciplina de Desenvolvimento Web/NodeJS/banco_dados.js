const sqlite3 = require('sqlite3').verbose();

/* :memory: -  em memória, e quando encerra o servidor perde todos os dados.
 * db.sqlite - em arquivo, ele cria o próprio arquivo e conectar com o BD
 *
 * let db = new sqlite3.Database('db.sqlite', (erro) => {
 *   if(erro){
 *      return console.error(erro.message);
 *   }
 *   console.log('Conectado com sucesso!')
 * })
 */

/* Driver: SELECT * FROM USUARIO; 
 * Query Builders: table('usuario').select('*').where();
 */

