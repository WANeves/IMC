/**
 * Created by wellingtonalvesdasneves on 5/10/16.
 */
public class Paciente {

    double peso;
    double altura;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    double calcularIMC(double peso, double altura){
        return (peso / (altura * altura));
    }

    String diagnostico(){
        String msg ="";
        double imc;

        imc = calcularIMC(this.peso, this.altura);

        if (imc < 16) {
            msg = "Baixo peso muito grave";
        }else if(imc >= 16 && imc <= 16.99){
            msg = "Baixo peso grave";
        }else if(imc >= 17 && imc <= 18.49){
            msg = "Baixo peso";
        }else if(imc >= 18.50 && imc <= 24.99){
            msg = "Peso normal";
        }else if(imc >= 25 && imc <= 29.99){
            msg = "Sobrepeso";
        }else if(imc >= 30 && imc <= 34.99){
            msg = "Obesidade Grau I";
        }else if(imc >= 35 && imc <= 39.99){
            msg = "Obesidade Grau II";
        }else if(imc >= 40){
            msg = "Obesidade Grau III(obesidade mórbida)";
        }

        return msg;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
