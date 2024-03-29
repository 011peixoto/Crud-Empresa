package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Funcionario {


    Scanner scanner = new Scanner(System.in);

    private int idFuncionario, permissao, departamento_FK;
    private String nome, sobrenome, matricula;

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getPermissao() {
        return permissao;
    }

    public int getDepartamento_FK() {
        return departamento_FK;
    }

    public void setDepartamento_FK(int departamento_FK) {
        this.departamento_FK = departamento_FK;
    }

    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void cadastrarFuncionario() {
        System.out.println("/-  Cadastro Funcionario  -/");
        System.out.println("Informe o nome");
        this.nome = scanner.nextLine();
        System.out.println("Informe o sobrenome");
        this.sobrenome = scanner.nextLine();
        System.out.println("Informe a matricula");
        this.matricula = scanner.nextLine();
        System.out.println("Informe o Id do Funcinario (0)");
        this.idFuncionario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe a permissão");
        this.permissao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe o id do Departamento ");
        this.departamento_FK = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cadastro local efetuado");
    }
}
