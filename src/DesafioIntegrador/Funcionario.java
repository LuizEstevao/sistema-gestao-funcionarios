package DesafioIntegrador;

abstract class Funcionario {

    protected String nome;
    protected float salario;


    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();
    public abstract void exibirResultados();
}
