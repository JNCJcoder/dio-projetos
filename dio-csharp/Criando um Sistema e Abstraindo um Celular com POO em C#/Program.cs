using DesafioPOO.Models;

Console.WriteLine("Smartphone Nokia: ");
Nokia nokia = new Nokia("911111111", "1111111111", "Modelo 1", 16);
nokia.Ligar();
nokia.InstalarAplicativo("Snake");
nokia.ReceberLigacao();

Console.WriteLine("\n");

Console.WriteLine("Smartphone iPhone: ");
Iphone iphone = new Iphone("922222222", "22222222", "Modelo 2", 512);
iphone.Ligar();
iphone.InstalarAplicativo("WhatsApp");
iphone.ReceberLigacao();

