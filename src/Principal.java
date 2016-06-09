/**
 * Created by wellingtonalvesdasneves on 5/10/16.
 */
public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(92, 1.63);
        Paciente paciente2 = new Paciente(130, 1.65);
        Paciente paciente3 = new Paciente(70, 1.72);

        System.out.println("Resultado do IMC Paciente 1: " + paciente1.diagnostico());
        System.out.println("Resultado do IMC Paciente 2: " + paciente2.diagnostico());
        System.out.println("Resultado do IMC Paciente 3: " + paciente3.diagnostico());

    }
}
