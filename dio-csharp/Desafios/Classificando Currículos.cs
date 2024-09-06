using System;
using System.Collections.Generic;
using System.Linq;

class Program
{
    static void Main()
    {
        // Leitura da entrada do usuário
        string input = Console.ReadLine();

        // Processamento da entrada
        List<int> anosExperiencia = input.Split(',')
                                          .Select(x => int.Parse(x))
                                          .ToList();
        
        // Classificação dos currículos
        List<string> classificacoes = ClassificarCurriculos(anosExperiencia);

        // Formatação da saída
        string resultado = string.Join(", ", classificacoes);
        Console.WriteLine(resultado);
    }

    static List<string> ClassificarCurriculos(List<int> anosExperiencia)
    {
        List<string> classificacoes = new List<string>();

        foreach (int anos in anosExperiencia)
        {
            if (anos <= 3)
            {
                classificacoes.Add("Junior");
            }
            else if (anos <= 5)
            {
                classificacoes.Add("Pleno");
            }
            else
            {
                classificacoes.Add("Senior");
            }
        }

        return classificacoes;
    }
}