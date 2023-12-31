//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

// Definição da classe ItemMagico
class ItemMagico {
    constructor(tipo, dano, resistencia) {
        this.tipo           = tipo;
        this.dano           = dano;
        this.resistencia    = resistencia;
    }
    
    calcularDano() {
        return this.tipo === "arma" ? this.dano * 2 : this.dano;
    }
}
    
// Solicita ao usuário para digitar o tipo do item mágico, o dano no item e a resistência do item
const tipoItem = gets();
const danoItem = parseInt(gets());
const resistenciaItem = parseInt(gets());
    
const itemPersonalizado = new ItemMagico(tipoItem, danoItem, resistenciaItem);

print("Tipo: " + itemPersonalizado.tipo);
print("Dano: " + itemPersonalizado.dano);
print("Resistencia: " + itemPersonalizado.resistencia);
    
// Calcula e imprime o dano causado pelo item personalizado em um combate simulado
const danoTotal = itemPersonalizado.calcularDano();
print("Dano em combate: " + danoTotal);