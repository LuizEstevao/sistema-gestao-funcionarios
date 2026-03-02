package DesafioIntegrador;

public class Gerente extends Funcionario implements Autenticavel {

    double bonus;
    double bonusExtra;

    public Gerente(String nome, float salario) {
        super(nome, salario);

    }

    public void autenticar() {
        System.out.println("Gerente Autenticado");
    }

    public double calcularBonus() {
        bonusExtra = salario * 0.2;
        bonus = (salario * 0.3) + bonusExtra;
        return bonus;
    }

    public void exibirResultados(){
        System.out.println("");
        System.out.println("Gerente");
        System.out.println("Nome: " + nome);
        System.out.printf("Salario: %.2f\n",salario);
        System.out.printf("Bônus: %.2f\n", bonus);
        System.out.println("");
    }
}
