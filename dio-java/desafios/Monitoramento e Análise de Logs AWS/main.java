import java.util.*;
import java.util.stream.Collectors;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maiorServico = "";
        String menorServico = "";
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Integer> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");

            if (parts.length != 3)
            {
                continue;
            }

            String servico = parts[1].trim();
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0) + 1);
        }

        int maximoEventos = -1;
        int minimoEventos = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : eventosPorServico.entrySet()) {
            int eventos = entry.getValue();

            if (eventos >= maximoEventos)
            {
                maximoEventos = eventos;
                maiorServico = entry.getKey();
            }

            if (eventos < minimoEventos)
            {
                minimoEventos = eventos;
                menorServico = entry.getKey();
            }
        }

        System.out.println("Eventos por servico:");
        eventosPorServico.forEach((servico, eventos) -> System.out.println(servico + ":" + eventos));

        System.out.println("Maior:" + maiorServico);
        System.out.println("Menor:" + menorServico);

        scanner.close();
    }
}