using System;

namespace SimulacaoFalhaTeste {
  class Program {
    static void Main(string[] args) {
      string nomeDoTeste = Console.ReadLine().Trim();

      string descricaoDoErro = Console.ReadLine().Trim();
      
      Console.WriteLine($"O teste falhou. Descricao: {descricaoDoErro}");
    }
  }
}