import java.util.Scanner;

interface NotificacaoEmail {
  void enviarEmail(String mensagem);
}

interface NotificacaoSMS {
  void enviarSMS(String mensagem);
}

class NotificacaoEmailImpl implements NotificacaoEmail {
  @Override
  public void enviarEmail(String mensagem) {
    System.out.println("Email enviado: %s".formatted(mensagem));
  }
}

class NotificacaoSMSImpl implements NotificacaoSMS {
  @Override
  public void enviarSMS(String mensagem) {
    System.out.println("SMS enviado: %s".formatted(mensagem));
  }
}

public class Principal {
  public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)) {
      String[] entradas = scanner.nextLine().split(", ");
  
      String tipoNotificacao = entradas[0];
      String mensagem = entradas[1];
  
      switch (tipoNotificacao) {
          case "email":
              NotificacaoEmail email = new NotificacaoEmailImpl();
              email.enviarEmail(mensagem);
              break;
          case "sms":
              NotificacaoSMS sms = new NotificacaoSMSImpl();
              sms.enviarSMS(mensagem);
              break;
          default:
              System.out.println("Tipo de notificacao invalido.");
      }
    }
  }
}