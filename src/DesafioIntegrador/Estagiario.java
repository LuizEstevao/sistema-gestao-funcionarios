package DesafioIntegrador;

public class Estagiario extends Funcionario {
    double bonus;

    public Estagiario(String nome, float salario) {
        super(nome, salario);

    }

    public double calcularBonus(){
        bonus = salario * 0.1;
        return bonus;
    }

    public void exibirResultados(){
        System.out.println("");
        System.out.println("Estágiario");
        System.out.println("Nome: " + nome);
        System.out.printf("Salario: %.2f \n",salario);
        System.out.printf("Bônus: %.2f", bonus);
        System.out.println("");
    }
}
