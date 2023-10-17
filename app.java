public class App {
    public static void main(String[] args) {
        int salarioBase = 2000; // Salário base da vaga
        int salarioPretendidoCandidato = 2200; // Salário pretendido do candidato

        if (salarioBase > salarioPretendidoCandidato) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendidoCandidato) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado de demais candidatos");
        }
    }
}
