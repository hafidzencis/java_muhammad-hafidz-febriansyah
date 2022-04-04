package com.Alterra.Section26.service;

import com.Alterra.Section26.domain.dao.ProductDao;
import com.Alterra.Section26.domain.dao.TransactionDao;
import com.Alterra.Section26.domain.dto.ProductDto;
import com.Alterra.Section26.domain.dto.TransactionDto;
import com.Alterra.Section26.repository.ProductRepository;
import com.Alterra.Section26.repository.TransactionRepository;
import com.Alterra.Section26.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.Alterra.Section26.constant.CONSTANTAPP.KEY_FOUND;
import static com.Alterra.Section26.constant.CONSTANTAPP.KEY_NOT_FOUND;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public ResponseEntity<Object> getAllTransaction() {
        return BaseResponse.build(HttpStatus.OK, KEY_FOUND, transactionRepository.findAll());

    }

    public ResponseEntity<Object> saveNewTransaction(TransactionDto request) {
        TransactionDao transactionDao = TransactionDao.builder()
                        .customer_name(request.getCustomer_name())
                        .transaction_details(request.getTransaction_details())
                        .is_paid(request.getIs_paid())
                        .created_at(request.getCreated_at())
                        .build();
       transactionRepository.save(transactionDao);
        return BaseResponse.build(HttpStatus.OK, KEY_FOUND, transactionDao);
    }


    public ResponseEntity<Object> updateTransaction(String id, TransactionDto update){
        Optional<TransactionDao> transactionDaoOptional =  transactionRepository.findById(id);
        if (transactionDaoOptional.isEmpty()){
            return BaseResponse.build(HttpStatus.BAD_REQUEST,KEY_NOT_FOUND,null);
        }


        TransactionDao transactionDao = transactionDaoOptional.get();
        transactionDao.setCustomer_name(update.getCustomer_name());
        transactionDao.setTransaction_details(update.getTransaction_details());
        transactionDao.setIs_paid(update.getIs_paid());
        transactionRepository.save(transactionDao);

        return BaseResponse.build(HttpStatus.OK,KEY_FOUND,transactionDao);
    }

    public ResponseEntity<Object> deleteTransaction(String id){
        transactionRepository.deleteById(id);
        return BaseResponse.build(HttpStatus.OK,KEY_FOUND,null);
    }

}
