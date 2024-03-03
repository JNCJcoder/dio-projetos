import java.util.Scanner;

interface Employee {
    double calculateSalary();
}

interface ContractType {
    public double getSalary();
}

class CLTEmployee implements Employee {
    private final ContractType contractType;
    public CLTEmployee(ContractType contractType) {
        this.contractType = contractType;
    }
    @Override
    public double calculateSalary() {
        return contractType.getSalary();
    }
}

class PJEmployee implements Employee {
    private final ContractType contractType;
    public PJEmployee(ContractType contractType) {
        this.contractType = contractType;
    }
    @Override
    public double calculateSalary() {
        return contractType.getSalary();
    }
}

class CLT implements ContractType {
    private final double baseSalary;
    private final double commissions;
    public CLT(double baseSalary, double commissions) {
        this.baseSalary = baseSalary;
        this.commissions = commissions;
    }
    @Override
    public double getSalary() {
        return baseSalary + commissions;
    }
}

class PJ implements ContractType {
    private final double workedHours;
    private final double hourlyRate;

    public PJ(double workedHours, double hourlyRate) {
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return workedHours * hourlyRate;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractType = scanner.nextLine();
        if (contractType.equalsIgnoreCase("CLT")) {
            String[] input = scanner.nextLine().split(",");
            double baseSalary = Double.parseDouble(input[0]);
            double commissions = Double.parseDouble(input[1]);
            ContractType cltContract = new CLT(baseSalary, commissions);
            Employee cltEmployee = new CLTEmployee(cltContract);
            System.out.println("CLT: " + cltEmployee.calculateSalary());
        } else if (contractType.equalsIgnoreCase("PJ")) {
            String[] input = scanner.nextLine().split(",");
            double workedHours = Double.parseDouble(input[0]);
            double hourlyRate = Double.parseDouble(input[1]);
            ContractType pjContract = new PJ(workedHours, hourlyRate);
            Employee pjEmployee = new PJEmployee(pjContract);
            System.out.println("PJ: " + pjEmployee.calculateSalary());
        } else {
            System.out.println("Tipo de contrato inválido.");
        }

        scanner.close();
    }
}