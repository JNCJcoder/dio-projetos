// Solicita ao usuário que insira o nome do personagem:
const nomePersonagem = gets();

// Solicita ao usuário que escolha entre "Atacar" ou "Fugir":
const acaoEscolhida = gets();

function agir(personagem, acao)
{
    if(acao == "Atacar" || acao == "Fugir")
    {
        return `${personagem} escolheu ${acao}!`;
    }

    return "Tente novamente";
}

print(agir(nomePersonagem, acaoEscolhida));