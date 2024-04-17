import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        /*
         * Cliente cliente1 = new Cliente()
         * Cliente cliente2 = new Cliente()
         * Cliente cliente3 = new Cliente()
         * Cliente cliente4 = new Cliente()
         * Cliente cliente5 = new Cliente()
         * Cliente cliente6 = new Cliente()
         * Cliente cliente7 = new Cliente() 
         *
        */
        Integer  option = 0;
        Scanner scanner = new Scanner(System.in);
       do {
        System.out.println(
        " __________________________________________________________ \n"+
        "|----------------------------------------------------------|\n"+
        "|------------------- Tela de Cadastro ---------------------|\n"+
        "|----------------------------------------------------------|\n"+
        "|__________________________________________________________|\n"+
        "|                                                          |\n"+
        "|               Qual opção  deseja executar?               |\n"+
        "|                                                          |\n"+
        "| 1- CADASTRAR NOVO CLIENTE | 2- LISTAR CLIENTES | 3- SAIR |\n"+
        "|==========================================================|"
        );
        System.out.print("> ");
        option = Integer.parseInt(scanner.nextLine());
        
       } while (option != 3);
       scanner.close();
    }
}
