import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        // Cadastro automático de 7 objetos Cliente
        clientes.add(new Cliente("12345678900", "cliente1@example.com", "999999999", true, false));
        clientes.add(new Cliente("12345678901", "cliente2@example.com", "999999998", true, true));
        clientes.add(new Cliente("12345678902", "cliente3@example.com", "999999997", false, false));
        clientes.add(new Cliente("12345678903", "cliente4@example.com", "999999996", true, false));
        clientes.add(new Cliente("12345678904", "cliente5@example.com", "999999995", false, true));
        clientes.add(new Cliente("12345678905", "cliente6@example.com", "999999994", true, false));
        clientes.add(new Cliente("12345678906", "cliente7@example.com", "999999993", false, true));

        // Cadastro automático de 3 objetos Funcionario
        funcionarios.add(new Funcionario("22345678900", "funcionario1@example.com", "888888888", true, false, "Gerente", 3000.0));
        funcionarios.add(new Funcionario("22345678901", "funcionario2@example.com", "888888887", true, false, "Instrutor", 1500.0));
        funcionarios.add(new Funcionario("22345678902", "funcionario3@example.com", "888888886", true, true, "Recepcionista", 1200.0));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Principal:");
            System.out.println("1. Operações para Clientes");
            System.out.println("2. Operações para Funcionários");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    Operacoes.menuCliente(scanner, clientes);
                    break;
                case 2:
                    Operacoes.menuFuncionario(scanner,funcionarios);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

}

