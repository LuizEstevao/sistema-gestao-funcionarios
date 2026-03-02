# 💼 Sistema de Gestão de Funcionários com Controle de Acesso

## 📖 Contexto

Em ambientes corporativos reais, diferentes cargos possuem regras específicas para cálculo de salário e permissões distintas de acesso ao sistema.

Sem uma modelagem adequada, isso pode gerar:

- ❌ Duplicação de regras de negócio  
- ❌ Acesso indevido a funcionalidades  
- ❌ Alto acoplamento entre classes  
- ❌ Dificuldade de manutenção e escalabilidade  

Este projeto simula um cenário empresarial aplicando conceitos fundamentais de **Programação Orientada a Objetos (POO)** para estruturar uma solução organizada e extensível.

---

## 🧠 Arquitetura Aplicada

O sistema foi estruturado com foco em boas práticas de modelagem:

- 🔹 Classe abstrata `Funcionario`
- 🔹 Interface `Autenticavel`
- 🔹 Subclasses específicas:
  - `Gerente`
  - `DesenvolvedorJunior`
  - `Estagiario`
- 🔹 Uso de **polimorfismo** para cálculo de bônus
- 🔹 Separação entre regra de salário e regra de autenticação

Apenas cargos autorizados implementam a interface de autenticação, garantindo controle de acesso em nível de modelagem.

---

## 🧩 Conceitos Demonstrados

- Encapsulamento  
- Herança  
- Polimorfismo  
- Classes Abstratas  
- Interfaces  
- Dynamic Binding  
- Programação orientada a abstração  
- Baixo acoplamento  

---

## 📊 Estrutura do Projeto
```sistema-gestao-funcionarios/
├── src/
│ └── Sistemas/
│ └── DesafioIntegrador/
│ ├── Funcionario.java
│ ├── Gerente.java
│ ├── DesenvolvedorJunior.java
│ ├── Estagiario.java
│ ├── Autenticavel.java
│ └── Main.java
└── README.md
```

---

## ▶ Como Executar

1. Clone o repositório:
git clone https://github.com/LuizEstevao/sistema-gestao-funcionarios.git


2. Abra na sua IDE (IntelliJ, Eclipse, VSCode)

3. Execute a classe `Main`

---

## 🚀 Possíveis Evoluções

Este projeto pode evoluir para:

- 🔹 Integração com banco de dados (JPA / Hibernate)
- 🔹 API REST com Spring Boot
- 🔹 Sistema de autenticação com JWT
- 🔹 Implementação de testes unitários (JUnit)
- 🔹 Aplicação de princípios SOLID

---

## 🎯 Objetivo

Este projeto faz parte do meu plano estruturado de formação em **Java Backend**, com foco na construção de uma base sólida em modelagem orientada a objetos e arquitetura de sistemas.

---

## 👨‍💻 Autor

Luiz Miguel  
Estudante de Engenharia de Software | Foco em Backend Java  
