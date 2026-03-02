package DesafioIntegrador;

public class DesenvolvedorJunior extends Funcionario implements Autenticavel {

    double bonus;

    public DesenvolvedorJunior(String nome, float salario) {
        super(nome, salario);

    }

    public void autenticar() {
        System.out.println("Dev junior Autenticado");
    }

    public double calcularBonus() {
        bonus = salario * 0.3;
        return bonus;
    }

    public void exibirResultados(){
        System.out.println("");
        System.out.println("Desenvolvedor Junior");
        System.out.println("Nome: " + nome);
        System.out.printf("Salario: %.2f\n",salario);
        System.out.printf("Bônus: %.2f", bonus);
        System.out.println("");

    }
}
