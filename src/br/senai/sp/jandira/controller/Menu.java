package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    public void executarMenu() throws SQLException {

        FuncionarioController funcionario = new FuncionarioController();


        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("/-----Seja-Bem-Vindo------");
            System.out.println("/-------------------------");
            System.out.println("/--------- Menu ---------/");
            System.out.println("--------------------------");
            System.out.println("1--Cadatrar-Funcionario---");
            System.out.println("2---Listar-Fucionario-----");
            System.out.println("3---Deletar-Funcionario---");
            System.out.println("4--Consultar-Funcionario--");
            System.out.println("5--sair-------------------");


            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    Funcionario newFuncionario = new Funcionario();
                    newFuncionario.cadastrarFuncionario();
                    funcionario.cadastraFuncionario(newFuncionario);
                    break;
                case 2:
                    System.out.println("Listar-Funcionario");
                    funcionario.listarFuncionarios();
                    break;
                case 3:
                    System.out.println("Informe o nome a ser deletado");
                    String nomeDelete = scanner.nextLine();
                    funcionario.deletarFuncionario(nomeDelete);
                    break;
                case 4:
                    System.out.println("Informe o nome que deseja  pesquisar: ");
                    String nomepesquisado = scanner.nextLine();
                    funcionario.consultarFuncionario(nomepesquisado);

                    break;
                case 5:
                    continuar = false;
                    break;

            }

        }
    }
}
