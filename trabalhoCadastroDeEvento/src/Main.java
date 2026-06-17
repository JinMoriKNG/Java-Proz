import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite as informações do evento " + i + ":");
            System.out.print("Código do Evento: ");
            int codeEvent = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Nome do Evento: ");
            String nameEvent = entrada.nextLine();

            System.out.print("Local do Evento: ");
            String localEvent = entrada.nextLine();

            System.out.print("Preço do Evento: R$ ");
            double priceEvent = entrada.nextDouble();

            System.out.print("Quantidade de Vagas: ");
            int quantVacancies = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Data do Evento: ");
            String dateEvent = entrada.nextLine();

            Event event = new Event(codeEvent, nameEvent, localEvent, priceEvent, quantVacancies, dateEvent);
            event.showInfo();
            event.verifyVacancies();
            event.discountVerify();
        }
    }
}
