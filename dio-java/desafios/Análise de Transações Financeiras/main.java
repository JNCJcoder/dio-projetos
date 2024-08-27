import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe Transacao representa a entidade do domínio
class Transacao {
    private List<Double> transacoes;

    public Transacao(List<Double> transacoes) {
        this.transacoes = transacoes;
    }

    public List<Double> getTransacoes() {
        return transacoes;
    }
}

// Classe AnaliseTransacoesUseCase contém a lógica do caso de uso
class AnaliseTransacoesUseCase {
    public String analisar(Transacao transacao) {
        List<Double> transacoes = transacao.getTransacoes();
        double saldoFinal = 0;
        double maiorDeposito = Double.MIN_VALUE;
        double maiorRetirada = Double.MAX_VALUE;

        for (double valor : transacoes)
        {
            saldoFinal += valor;

            if (valor > 0)
            {
                if (valor > maiorDeposito)
                {
                    maiorDeposito = valor;
                }
            }
            else if (valor < 0)
            {
                if (valor < maiorRetirada)
                {
                    maiorRetirada = valor;
                }
            }
        }

        if (maiorDeposito == Double.MIN_VALUE)
        {
            maiorDeposito = 0;
        }

        if (maiorRetirada == Double.MAX_VALUE)
        {
            maiorRetirada = 0;
        }

        String resultado = saldoFinal >= 0 ? "Saldo positivo" : "Saldo negativo";

        return String.format(
            "Saldo: %.2f\nDeposito: %.2f\nRetirada: %.2f\n%s",
            saldoFinal, maiorDeposito, maiorRetirada, resultado
        );
    }
}

// Classe principal que funciona como interface de entrada/saída e execução do caso de uso
public class AnaliseTransacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de transações
        int numeroTransacoes = scanner.nextInt();

        // Leitura das transações
        List<Double> transacoes = new ArrayList<>();
        for (int i = 0; i < numeroTransacoes; i++) {
            transacoes.add(scanner.nextDouble());
        }

        // Criação da entidade Transacao
        Transacao transacao = new Transacao(transacoes);

        // Criação e execução do caso de uso
        AnaliseTransacoesUseCase useCase = new AnaliseTransacoesUseCase();
        String resultado = useCase.analisar(transacao);

        // Saída do resultado
        System.out.println(resultado);

        scanner.close();
    }
}