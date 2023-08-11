// Classes

class List { // Classe (Pai)

    constructor() { // Construtor da classe
        this.data = [] // Variável inicializada com lista vazia
    }
    
    add(nome){ // Método para adicionar na lista e imprimir lista
        this.data.push(nome); // Adiciona valor na lista
        console.log(this.data); // Imprime o resultado no console
    }
}

class ToList extends List { // Classe com herança (Filho)

    constructor() { // Construtor da classe        
        super(); // Chama o construtor da classe pai
        this.usuario = 'Sara'; // Inicialização da variável
    }

    getUsuario() { // Método para imprimir no console
       console.log(this.usuario) 
    }

    static soma (numero1, numero2) { // Método estático (pode ser chamado mesmo sem a classe ter sido instanciada)
        return numero1 + numero2;
    }
}

const toList = new ToList() // Instância

document.getElementById("novoToDo").onclick = function () { // Ao clicar no botão, vai chamar uma ação
    toList.add('Item'); // Chamada da função passando como parâmetro 'Item'
    toList.getUsuario(); // Chamada da função
}

console.log(ToList.soma(5, 8)); // Imprime a soma no console, chamando a função estática (resultado: 13)

/* --------------------------------------------------------------------------------------------------------------------------- */

// Tipos de variáveis

var tipo_var = 'Variável pode ser alterada em qualquer momento'; // Pode ser alterada (global)

const tipo_const = 'Constante não pode ser modificada após criada'; // Não pde ser alterada (global)

const tipo_const2 = {texto: 'Não pode mudar estrutura'} // Ná alteração da propriedade, mas não da estrutura do objeto
tipo_const2.texto = 'Propriedade alterada';
console.log(tipo_const2)

function testadoTipoVariavel(valor1) {
    let valor2  = 4; // Só é vista dentro da função (local - usada na função)
    if (valor1 >= 2) { // Estrutura condicional
        valor2 = 6;
        console.log(valor1, valor2);
    }
}
testadoTipoVariavel(10) // Chamada da função