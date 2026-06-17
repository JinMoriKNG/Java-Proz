import javax.swing.*;

public class Event {
    private int codeEvent;
    private String nameEvent;
    private String localEvent;
    private double priceEvent;
    private int quantVacancies;
    private String dateEvent;

    public Event(int codeEvent, String nameEvent, String localEvent, double priceEvent, int quantVacancies, String dateEvent) {
        this.codeEvent = codeEvent;
        this.nameEvent = nameEvent;
        this.localEvent = localEvent;
        this.priceEvent = priceEvent;
        this.quantVacancies = quantVacancies;
        this.dateEvent = dateEvent;
    }

    public void showInfo() {
        System.out.println("Código do Evento: " + codeEvent);
        System.out.println("Nome do Evento: " + nameEvent);
        System.out.println("Local do Evento: " + localEvent);
        System.out.println("Preço do Evento: R$ " + priceEvent);
        System.out.println("Quantidade de Vagas: " + quantVacancies);
        System.out.println("Data do Evento: " + dateEvent);
    }

    public void verifyVacancies() {
        if (quantVacancies == 0) {
            System.out.println("Não há vagas disponíveis para inscrição.");
            return;
        }

        if (quantVacancies < 10 ) {
            JOptionPane.showMessageDialog(null, "Restam menos de 10 vagas disponíveis para este evento.");
        } else if (quantVacancies <= 30){
            System.out.println("Restam" + quantVacancies + "vagas disponíveis para este evento.");
        } else {
            System.out.println("Há muitas vagas disponíveis para este evento.");
        }
    }

    public void updateVacancies(int newVacancies) {
        this.quantVacancies = newVacancies;
    }

    public void discountVerify() {
        if (priceEvent > 300) {
            System.out.println("Este evento possui desconto de 10% disponível.");
        } else {
            System.out.println("Este evento não possui desconto disponível.");
        }
    }
}


