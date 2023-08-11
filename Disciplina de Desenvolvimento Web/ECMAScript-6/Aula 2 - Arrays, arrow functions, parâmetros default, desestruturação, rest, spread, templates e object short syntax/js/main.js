// Arrays

const array = [1, 2, 3, 4, 5, 8, 9]; // Array ou lista
console.log(array) // Imprime a antiga lista

/* --------------------------------------------------------------------------------------------------------------------------- */

// Funções sem flecha/seta (sem arrow)

const novoArray = array.map(
    function(item) { // A nova lista vai receber os elementos da lista anterior multiplicados por 2
        return item * 2;
    }
)
console.log(novoArray) // Imprime a nova lista

/* 
 * Soma os elementos da lista, retornando um único resultado
 * const soma = array.reduce(
 *   function(total, elemento) {
 *       return total + elemento;
 *   }
 * )
 */

// Filtra os elementos da lista que são mútiplos de 2
const multiplos2 = array.filter(
    function(item) {
        return item % 2 == 0;
    }
)
console.log(multiplos2) // Imprime o resultado da lista multiplos2

/* --------------------------------------------------------------------------------------------------------------------------- */

// Arrow Function - Funções com flecha/seta (com arrow)

const soma = array.reduce((total, elemento) => total + elemento) // Soma os elementos da lista, retornando um único resultado
console.log(soma) // Imprime o resultado da variável soma

// Busca se o elemento 4 existe na lista
const encontrar4 = array.find(elemento => elemento === 4)
console.log(encontrar4) // Imprime o resultado da busca pelo número 4

// Variável recebe uma função que retorna um array
const teste = () => [1, 2, 3];
console.log(teste()); // Imprimer variável

/*
 * Variável recebe uma função que retorna um array - Para mais de uma linha de código
 * const teste = () => {
 *      [1, 2, 3];
 * }
 * console.log(teste()); // Imprimer variável
 */ 

// Variável recebe uma função que retorna a propriedade
const propriedade = () => {return {nome: 'Sara'}};
console.log(propriedade());

/* Variável recebe uma função, mas não entende o retorna da propriedade
 * const propriedade = () => {nome: 'Sara'};
 */

/* --------------------------------------------------------------------------------------------------------------------------- */

// Valor padrão (default)

const somaValoresPadrao = (num1 = 1, num2 = 2) => num1 + num2; // Soma os elementos recebidos, mas se não receber valor em uma ou nas duas variáveis utiliza-se o valor padrão para retornar o resultado
console.log(somaValoresPadrao()); // Imprime soma com valor padrão
console.log(somaValoresPadrao(3, )); // Imprime soma alterando o valor da primeira variável
console.log(somaValoresPadrao(2, 5)); // Imprime soma alterando o valor das duas variáveis

/* --------------------------------------------------------------------------------------------------------------------------- */

// Propriedades da lista
const usuario = {
    nomeUsuario: 'Sara',
    idade: 21,
    endereco: {
        rua: 'ABC',
        cidade: 'Jequié'
    }
}
console.log(usuario); // Imprime as propriedades da lista

/* --------------------------------------------------------------------------------------------------------------------------- */

// Desestruturação

// Acessando as propriedades sem desestruturação
const nomeUsuarioSemDes = usuario.nomeUsuario;
const idadeSemDes = usuario.idade;
console.log(nomeUsuarioSemDes);
console.log(idadeSemDes);

// Acessando as propriedades com desestruturação
const {nomeUsuario, endereco:{rua}} = usuario;
console.log(nomeUsuario, rua);

// Função sem desestruturação com arrow 
const exibirNomeSemDes = (usuario) => {console.log(usuario.nomeUsuario)};
exibirNomeSemDes(usuario);

// Função com desestruturação com arrow
const exibirNomeComDes = ({nomeUsuario}) => {console.log(nomeUsuario)};
exibirNomeComDes(usuario);

/* --------------------------------------------------------------------------------------------------------------------------- */

// Rest - "Resto"

const {idade, ... resto} = usuario;
console.log(idade); // Exibe apenas a idade
console.log(resto); // Exibe toda a lista exceto a idade, isto é, o resto

// Desestruturação usando Rest
const lista = [1, 2, 3, 4];
const [a, b, ...c] = lista;
console.log(a, b); // Exibe o primeiro e segundo elemneto
console.log(c); // Exibe o restante da lista

// Função com arrow sem utilizar Rest
const somaSemRest = (a, b, c, d) => a + b + c + d;
console.log(somaSemRest(1, 2, 3, 4));

// Função com arrow utilizando Rest
const somaComRest = (...paramentros) => paramentros.reduce((total, proximoElemento) => total + proximoElemento);
console.log(somaComRest(1, 2, 3, 4, 5, 6, 7));

/* --------------------------------------------------------------------------------------------------------------------------- */

// Lista de propriedades 2
const usuario2 = {
    nomeUsuario2: 'Maria',
    idadeUsuario2: 18,
    empresa: 'UESB'
}

/* --------------------------------------------------------------------------------------------------------------------------- */

// Spread - "Espalhar"

// Copiando dados e editando a variável nomeUsuario2 da lista de propriedades usuario2
const usuario3 = {... usuario2, nomeUsuario2: 'Maria Fernanda'};
console.log(usuario2); // Exibe o usuário 2
console.log(usuario3); // Exibe o usuário 3 com nome alterado

/* --------------------------------------------------------------------------------------------------------------------------- */

// Templates

const nomeTemp = 'Julia';
const idadeTemp = 15;

// Exibindo sintaxe simples
console.log('Olá! Meu nome é ' + nomeTemp + ' e minha idade é ' + idadeTemp + ' anos.');

// Exibindo síntaxe usando Template
console.log(`Olá! Meu nome é ${nomeTemp} e minha idade é ${idadeTemp}  anos.`);

/* --------------------------------------------------------------------------------------------------------------------------- */

// Object Short Syntax - Sintaxe Curta de Objeto

// Lista de propriedades simples
const usuarioSimples = {
    nomeTemp: 'Marcelo',
    idadeTemp: 23,
    empresa: 'UESB'
}
console.log(usuarioSimples);

// Lista de propriedades com Object Short Syntax
const usuarioObjectShortSyntax = {
    nomeTemp, // Não precisou atribuir valor, pois a variável já havia sido inicializada
    idadeTemp,
    empresa: 'UESB'
}
console.log(usuarioObjectShortSyntax);