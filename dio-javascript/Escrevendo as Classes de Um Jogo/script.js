class Heroi
{
    constructor(nome, idade, tipo)
    {
        this.nome   = nome;
        this.idade  = idade;
        this.tipo   = tipo;
    }

    atacar()
    {
        let ataque = "";

        switch (this.tipo)
        {
            case "mago":        ataque = "magia";           break;
            case "guerreiro":   ataque = "espada";          break;
            case "monge":       ataque = "arte marcial";    break;
            case "ninja":       ataque = "shuriken";        break;
        }

        console.log(`o ${this.tipo} atacou usando ${ataque}.`);
    }
}

const atlas = new Heroi("Atlas", 22, "guerreiro");
atlas.atacar();
