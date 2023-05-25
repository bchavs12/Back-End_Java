package com.branchManagement.dao.impl;

import com.branchManagement.config.ConfiguracaoJDBC;
import com.branchManagement.dao.IDao;
import com.branchManagement.model.Filial;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FilialDao implements IDao<Filial> {

    private ConfiguracaoJDBC configuracaoJDBC;
    private final static Logger log = Logger.getLogger(FilialDao.class);

    public FilialDao(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Filial salvar(Filial filial) {
        log.info("Registrando nova Filial! " + filial.toString());

        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;

        String query = String.format("INSERT INTO filiais(nomeFilial, rua, numero, cidade, estado, isFiveStars) " + " VALUES ('%s','%s','%s','%s','%s','%s')", filial.getNomeFilial(), filial.getRua(), filial.getNumero(), filial.getCidade(), filial.getEstado(), filial.getIsFiveStars());

        try{
           statement = connection.createStatement();
           statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
           ResultSet generatedKeys = statement.getGeneratedKeys();
           if (generatedKeys.next()){
               filial.setId(generatedKeys.getInt(1));
               statement.close();
               connection.close();
           }
            log.info("Registrando nova Filial COM ID! " + filial.toString());
        }catch(SQLException e){
           e.printStackTrace();
        }

        return filial;
    }
}
