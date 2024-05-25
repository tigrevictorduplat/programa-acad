import java.util.List;
import java.util.Scanner;

public class Operacoes {
    

    public static void menuCliente(Scanner scanner , List<Cliente> clientes) {
        while (true) {
            System.out.println("Menu Clientes:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Buscar Cliente");
            System.out.println("4. Remover Cliente");
            System.out.println("5. Modificar Cliente");
            System.out.println("6. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    cadastrarCliente(scanner, clientes);
                    break;
                case 2:
                    listarClientes(clientes);
                    break;
                case 3:
                    buscarCliente(scanner, clientes);
                    break;
                case 4:
                    removerCliente(scanner, clientes);
                    break;
                case 5:
                    modificarCliente(scanner, clientes);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public static void menuFuncionario(Scanner scanner, List<Funcionario> funcionarios) {
        while (true) {
            System.out.println("Menu Funcionários:");
            System.out.println("1. Cadastrar Funcionario");
            System.out.println("2. Listar Funcionarios");
            System.out.println("3. Buscar Funcionario");
            System.out.println("4. Remover Funcionario");
            System.out.println("5. Modificar Funcionario");
            System.out.println("6. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    cadastrarFuncionario(scanner, funcionarios);
                    break;
                case 2:
                    listarFuncionarios(funcionarios);
                    break;
                case 3:
                    buscarFuncionario(scanner, funcionarios);
                    break;
                case 4:
                    removerFuncionario(scanner, funcionarios);
                    break;
                case 5:
                    modificarFuncionario(scanner, funcionarios);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    // Métodos para Cliente
    public static void cadastrarCliente(Scanner scanner, List<Cliente> clientes) {
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o Email: ");
        String email = scanner.nextLine();
        System.out.print("Digite o Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Matrícula Ativa (true/false): ");
        boolean matriculaAtiva = scanner.nextBoolean();
        System.out.print("Tem Débito (true/false): ");
        boolean temDebito = scanner.nextBoolean();
        scanner.nextLine(); // Consumir a nova linha

        Cliente cliente = new Cliente(cpf, email, telefone, matriculaAtiva, temDebito);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void listarClientes(List<Cliente> clientes) {
        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : clientes) {
            System.out.println("CPF: " + cliente.getCpf() + ", Email: " + cliente.getEmail() + ", Telefone: " + cliente.getTelefone());
        }
    }

    public static void buscarCliente(Scanner scanner, List<Cliente> clientes) {
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println(cliente);
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    public static void removerCliente(Scanner scanner, List<Cliente> clientes) {
        System.out.print("Digite o CPF do cliente que deseja remover: ");
        String cpf = scanner.nextLine();
        Cliente clienteARemover = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clienteARemover = cliente;
                break;
            }
        }
        if (clienteARemover != null) {
            System.out.print("Tem certeza que deseja remover o cliente? (s/n): ");
            String confirmacao = scanner.nextLine();
            if (confirmacao.equalsIgnoreCase("s")) {
                clientes.remove(clienteARemover);
                System.out.println("Cliente removido com sucesso!");
            } else {
                System.out.println("Remoção cancelada.");
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public static void modificarCliente(Scanner scanner, List<Cliente> clientes) {
        System.out.print("Digite o CPF do cliente que deseja modificar: ");
        String cpf = scanner.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.print("Digite o novo Email: ");
                String novoEmail = scanner.nextLine();
                System.out.print("Digite o novo Telefone: ");
                String novoTelefone = scanner.nextLine();
                System.out.print("Matrícula Ativa (true/false): ");
                boolean novaMatriculaAtiva = scanner.nextBoolean();
                System.out.print("Tem Débito (true/false): ");
                boolean novoTemDebito = scanner.nextBoolean();
                scanner.nextLine(); // Consumir a nova linha

                cliente.setEmail(novoEmail);
                cliente.setTelefone(novoTelefone);
                cliente.setMatriculaAtiva(novaMatriculaAtiva);
                cliente.setTemDebito(novoTemDebito);

                System.out.println("Cliente modificado com sucesso!");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    // Métodos para Funcionario
    public static void cadastrarFuncionario(Scanner scanner, List<Funcionario> funcionarios) {
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o Email: ");
        String email = scanner.nextLine();
        System.out.print("Digite o Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Matrícula Ativa (true/false): ");
        boolean matriculaAtiva = scanner.nextBoolean();
        System.out.print("Tem Débito (true/false): ");
        boolean temDebito = scanner.nextBoolean();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Digite o Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Digite o Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        Funcionario funcionario = new Funcionario(cpf, email, telefone, matriculaAtiva, temDebito, cargo, salario);
        funcionarios.add(funcionario);
        System.out.println("Funcionario cadastrado com sucesso!");
    }

    public static void listarFuncionarios(List<Funcionario> funcionarios) {
        System.out.println("Funcionários cadastrados:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("CPF: " + funcionario.getCpf() + ", Email: " + funcionario.getEmail() + ", Telefone: " + funcionario.getTelefone());
        }
    }

    public static void buscarFuncionario(Scanner scanner, List<Funcionario> funcionarios) {
        System.out.print("Digite o CPF do funcionario: ");
        String cpf = scanner.nextLine();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                System.out.println(funcionario);
                return;
            }
        }
        System.out.println("Funcionario não encontrado.");
    }

    public static void removerFuncionario(Scanner scanner, List<Funcionario> funcionarios) {
        System.out.print("Digite o CPF do funcionario que deseja remover: ");
        String cpf = scanner.nextLine();
        Funcionario funcionarioARemover = null;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                funcionarioARemover = funcionario;
                break;
            }
        }
        if (funcionarioARemover != null) {
            System.out.print("Tem certeza que deseja remover o funcionario? (s/n): ");
            String confirmacao = scanner.nextLine();
            if (confirmacao.equalsIgnoreCase("s")) {
                funcionarios.remove(funcionarioARemover);
                System.out.println("Funcionario removido com sucesso!");
            } else {
                System.out.println("Remoção cancelada.");
            }
        } else {
            System.out.println("Funcionario não encontrado.");
        }
    }

    public static void modificarFuncionario(Scanner scanner, List<Funcionario> funcionarios) {
        System.out.print("Digite o CPF do funcionario que deseja modificar: ");
        String cpf = scanner.nextLine();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                System.out.print("Digite o novo Email: ");
                String novoEmail = scanner.nextLine();
                System.out.print("Digite o novo Telefone: ");
                String novoTelefone = scanner.nextLine();
                System.out.print("Matrícula Ativa (true/false): ");
                boolean novaMatriculaAtiva = scanner.nextBoolean();
                System.out.print("Tem Débito (true/false): ");
                boolean novoTemDebito = scanner.nextBoolean();
                scanner.nextLine(); // Consumir a nova linha
                System.out.print("Digite o novo Cargo: ");
                String novoCargo = scanner.nextLine();
                System.out.print("Digite o novo Salário: ");
                double novoSalario = scanner.nextDouble();
                scanner.nextLine(); // Consumir a nova linha

                funcionario.setEmail(novoEmail);
                funcionario.setTelefone(novoTelefone);
                funcionario.setMatriculaAtiva(novaMatriculaAtiva);
                funcionario.setTemDebito(novoTemDebito);
                funcionario.setCargo(novoCargo);
                funcionario.setSalario(novoSalario);

                System.out.println("Funcionario modificado com sucesso!");
                return;
            }
        }
        System.out.println("Funcionario não encontrado.");
    }

}
