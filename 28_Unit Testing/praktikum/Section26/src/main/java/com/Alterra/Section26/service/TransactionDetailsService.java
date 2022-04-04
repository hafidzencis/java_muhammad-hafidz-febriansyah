package com.Alterra.Section26.service;

import com.Alterra.Section26.domain.dao.TransactionDao;
import com.Alterra.Section26.domain.dao.TransactionDetailDao;
import com.Alterra.Section26.domain.dto.TransactionDetailDto;
import com.Alterra.Section26.domain.dto.TransactionDto;
import com.Alterra.Section26.repository.ProductRepository;
import com.Alterra.Section26.repository.TransactionDetailRepository;
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
public class TransactionDetailsService {
    @Autowired
    private TransactionDetailRepository transactionDetailRepository;


    public ResponseEntity<Object> getAllTransactionDetail() {
        return BaseResponse.build(HttpStatus.OK, KEY_FOUND, transactionDetailRepository.findAll());

    }

    public ResponseEntity<Object> saveNewTransactionDetails(TransactionDetailDto request) {
        TransactionDetailDao transactionDetailDao = TransactionDetailDao.builder()
                .transaction_id(request.getTransaction_id())
                .product_id(request.getProduct_id())
                .quantity(request.getQuantity())
                .build();
        transactionDetailRepository.save(transactionDetailDao);
        return BaseResponse.build(HttpStatus.OK, KEY_FOUND, transactionDetailDao);
    }


    public ResponseEntity<Object> updateTransactionDetails(String id, TransactionDetailDto update){
        Optional<TransactionDetailDao> transactionDetailDaoOptional =  transactionDetailRepository.findById(id);
        if (transactionDetailDaoOptional.isEmpty()){
            return BaseResponse.build(HttpStatus.BAD_REQUEST,KEY_NOT_FOUND,null);
        }


        TransactionDetailDao transactionDetailDao = transactionDetailDaoOptional.get();
        transactionDetailDao.setQuantity(update.getQuantity());
        transactionDetailRepository.save(transactionDetailDao);

        return BaseResponse.build(HttpStatus.OK,KEY_FOUND,transactionDetailDao);
    }

    public ResponseEntity<Object> deleteTransactionDetail(String id){
        transactionDetailRepository.deleteById(id);
        return BaseResponse.build(HttpStatus.OK,KEY_FOUND,null);
    }
}
