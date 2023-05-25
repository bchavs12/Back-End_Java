package com.branchManagement.service;

import com.branchManagement.dao.IDao;
import com.branchManagement.model.Filial;

public class FilialService {

    private IDao<Filial> filialIDao;

    public FilialService(IDao<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }

    public Filial salvarFilial(Filial filial){
     return filialIDao.salvar(filial);
    }
}
