package br.senai.sp.jandira.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private String servidor, banco, password, user;
    public Connection conexao;

    public Conexao() {
        this.servidor = "localhost";
        this.banco = "db_senai_java";
        this.user = "root";
        this.password = "bcd127";
    }

    public void connectriver () {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql:// " + this.servidor + "/" + this.banco, this.user, this.password);
        }catch (SQLException erro){
            System.out.println(erro);

        }
    }
    public Connection getConnection (){
        connectriver();
        return conexao;

    }
}
