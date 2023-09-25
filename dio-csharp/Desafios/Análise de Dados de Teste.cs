using System;

namespace AnaliseDadosTeste {
  class Program {
    static void Main(string[] args) {
      int testesBemSucedidos = int.Parse(Console.ReadLine());

      int testesTotais = int.Parse(Console.ReadLine());

      double taxaSucesso = ((double)testesBemSucedidos / (double)testesTotais) * 100;
      
      if(taxaSucesso >= 80.0)
      {
        Console.WriteLine("A funcionalidade esta pronta para lancamento.");
      }
      else
      {
        Console.WriteLine("A funcionalidade nao esta pronta para lancamento.");
      }
    }
  }
}