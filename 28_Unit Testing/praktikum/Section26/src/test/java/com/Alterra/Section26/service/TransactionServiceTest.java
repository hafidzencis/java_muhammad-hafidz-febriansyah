package com.Alterra.Section26.service;
import com.Alterra.Section26.domain.dao.TransactionDao;
import com.Alterra.Section26.repository.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionServiceTest {
    @Autowired
    private TransactionRepository transactionRepository;

    @Test
    public void testCreateNewTransaction(){
        TransactionDao transactionDao = new TransactionDao();
        transactionDao.setId("6246d05cf96a711641295f23");
        transactionDao.setCustomer_name("hafidz");
        transactionDao.setTransaction_details("pembelian obat");
        transactionDao.setIs_paid("TRUE");
        transactionDao.setCreated_at("2022-04-04");
        org.junit.jupiter.api.Assertions.assertNotNull(transactionRepository.findById("6246d05cf96a711641295f23"));
    }
}
