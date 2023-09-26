using System;

namespace VerificacaoDadosTeste {
  class Program {
    static void Main(string[] args) {
      int idTeste;
      if (int.TryParse(Console.ReadLine(), out idTeste)) {
        string descricaoTeste = Console.ReadLine();

        if (idTeste > 0 && descricaoTeste.Length <= 50) {
          Console.WriteLine("ID de teste valido.\nDescricao valida.");
        } else {
          Console.WriteLine("ID de teste invalido ou descricao muito longa.");
        }
      } else {
        Console.WriteLine("ID de teste invalido.");
      }
    }
  }
}