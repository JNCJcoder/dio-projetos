function getMatches(wins, loses)
{
    return wins - loses;
}
  
function getRank(wins, loses)
{
    const resultRankNumber = getMatches(wins, loses);
    let rank = "";
    
    if (resultRankNumber <= 10)
    {
        rank = "Ferro";
    }
    else if (resultRankNumber <= 20)
    {
        rank = "Bronze";
    }
    else if (resultRankNumber <= 50)
    {
        rank = "Prata";
    }
    else if (resultRankNumber <= 80)
    {
        rank = "Ouro";
    }
    else if (resultRankNumber <= 90)
    {
        rank = "Diamante";
    }
    else if (resultRankNumber <= 100)
    {
        rank = "Lendário";
    }
    else if (resultRankNumber >= 100)
    {
        rank = "Imortal";
    }

    return `O Herói tem de saldo de ${resultRankNumber} e está no nível de ${rank}`;
}
  
console.log(getRank(50, 20));