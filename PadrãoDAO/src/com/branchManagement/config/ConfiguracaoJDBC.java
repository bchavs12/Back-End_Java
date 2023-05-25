package com.branchManagement.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {

    private final String jdbcDrive;

    private final String dbUrl;

    private final String nomeUsuario;

    private final String senha;

    public ConfiguracaoJDBC(){
        this.jdbcDrive = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:~/filiais;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    public  Connection conectarComBancoDeDados() {
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(dbUrl, nomeUsuario, senha);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}
