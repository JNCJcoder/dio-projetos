//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

// Lê a jogada do personagem:
const jogadaPersonagem = parseInt(gets());

// Lê a jogada do monstro:
const jogadaMonstro = parseInt(gets());

function combate() {
    if (jogadaPersonagem > jogadaMonstro) {
        return "Você venceu a batalha!";
    }
    else if(jogadaMonstro > jogadaPersonagem)
    {
        return "Você perdeu a batalha!";
    }
  
    return "Foi um empate!";
}

const resultado = combate();
print(resultado);