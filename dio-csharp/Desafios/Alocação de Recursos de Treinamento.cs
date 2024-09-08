using System;
using System.Collections.Generic;
using System.Linq;

class Program
{
    static void Main()
    {
        // Leitura do orçamento
        int budget = int.Parse(Console.ReadLine());

        // Leitura dos custos de treinamento
        var costs = Console.ReadLine()
                            .Split(',')
                            .Select(int.Parse)
                            .OrderBy(x => x)
                            .ToList();

        List<int> selectedTrainings = new List<int>();
        int totalCost = 0;

        foreach (var cost in costs)
        {
            if (totalCost + cost <= budget)
            {
                selectedTrainings.Add(cost);
                totalCost += cost;
            }
            else
            {
                break;
            }
        }

        Console.WriteLine(string.Join(",", selectedTrainings));
    }
}