package test;

import com.branchManagement.config.ConfiguracaoJDBC;
import com.branchManagement.dao.impl.FilialDao;
import com.branchManagement.model.Filial;
import com.branchManagement.service.FilialService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FilialServiceTest {
    private FilialService filialService = new FilialService(new FilialDao(new ConfiguracaoJDBC()));

    private Filial f1, f2, f3, f4, f5;

    @BeforeEach
    void doBefore(){
        f1 = new Filial("Hotel Estrela Dourada","Rua das flores",123,"São Paulo", "São paulo", "Cinco Estrelas");
        f2 = new Filial("Hotel Mar Azul","Avenida Beira-Mar",456,"Rio de Janeiro", "Rio de Janeiro", "Cinco Estrelas");
        f3 = new Filial("Hotel Montanha Encantada","Rua da Serra",789,"Gramado", "Rio grande do Sul", "Cinco Estrelas");
        f4 = new Filial("Hotel Sol Poente","Praia do Sol",321, "Fortaleza", "Ceará", "três estrelas");
        f5 = new Filial("Hotel Praia Serena","Avenida dos Coqueiros",987, "Florianópolis", "Santa Catarina", "Cinco Estrelas");
    }

    @Test
    void deveSalvarFilial(){
        filialService.salvarFilial(f1);
        Assertions.assertNotNull(f1.getId());
        filialService.salvarFilial(f2);
        Assertions.assertNotNull(f2.getId());
        filialService.salvarFilial(f3);
        Assertions.assertNotNull(f3.getId());
        filialService.salvarFilial(f4);
        Assertions.assertNotNull(f4.getId());
        filialService.salvarFilial(f5);
        Assertions.assertNotNull(f5.getId());
    }

}
