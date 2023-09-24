using System;

namespace AvaliacaoTestesAutomatizados {
  class Program {
    static void Main(string[] args) {
      int testesPassados = Convert.ToInt32(Console.ReadLine());

      int totalTestes = Convert.ToInt32(Console.ReadLine());

      decimal taxaSucesso = ((decimal)testesPassados / (decimal)totalTestes) * (decimal)100;

      Console.WriteLine($"Taxa de sucesso: {taxaSucesso:F2}%");
    }
  }
}