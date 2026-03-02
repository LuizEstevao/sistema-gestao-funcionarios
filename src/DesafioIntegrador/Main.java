package DesafioIntegrador;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Luiz", 8000);
        Funcionario devJunior = new DesenvolvedorJunior("Eduarda",4000);
        Funcionario estagiario = new Estagiario("Lewis",2000);

        gerente.calcularBonus();
        devJunior.calcularBonus();
        estagiario.calcularBonus();

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(gerente);
        funcionarios.add(devJunior);
        funcionarios.add(estagiario);

        for (Funcionario f : funcionarios) {
            f.exibirResultados();
        }
    }
}
