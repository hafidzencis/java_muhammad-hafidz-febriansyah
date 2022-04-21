package com.section33.section33customerservice.service;


import com.section33.section33customerservice.domain.dao.CustomerDao;
import com.section33.section33customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDao save(CustomerDao request){
        return customerRepository.save(request);
    }

    public CustomerDao getById(Long id){
        Optional<CustomerDao> customerDao = customerRepository.findById(id);
        if (customerDao.isEmpty()){
            return CustomerDao.builder().build();
        }
        return customerDao.get();
    }

//    public ResponseEntity<Object> getProductById(Long id) {
//        Optional<CustomerDao> customerDaoOptional = customerRepository.findById(id);
//
//        if (customerDaoOptional.isEmpty())
//            return Response.build(ResponseMessage.NOT_FOUND, HttpStatus.BAD_REQUEST, null);
//
//        CustomerDao customerDao = customerDaoOptional.get();
//        return Response.build(ResponseMessage.SUCCESS, HttpStatus.OK, CustomerDto.builder()
//                        .customer_id(customerDao.getCustomer_id())
//                        .customer_name(customerDao.getCustomer_name())
//                        .gender(customerDao.getGender())
//                        .nomor_hp(customerDao.getNomor_hp())
//                        .alamat(customerDao.getAlamat())
//                        .kodepos(customerDao.getKodepos())
//                        .build());
//    }
//
//    public ResponseEntity<Object> getAllCustomer() {
//        List<CustomerDao> customerDaoList = customerRepository.findAll();
//        List<CustomerDto> customerDtoList = new ArrayList<>();
//        for(CustomerDao customer : customerDaoList) {
//            customerDtoList.add(CustomerDto.builder()
//                    .customer_id(customer.getCustomer_id())
//                    .customer_name(customer.getCustomer_name())
//                    .gender(customer.getGender())
//                    .nomor_hp(customer.getNomor_hp())
//                    .alamat(customer.getAlamat())
//                    .kodepos(customer.getKodepos())
//                    .build());
//        }
//        return Response.build(ResponseMessage.SUCCESS, HttpStatus.OK, customerDaoList);
//    }
//
//
//
//    public ResponseEntity<Object> createCustomer(CustomerDto customer) {
//        CustomerDao customerDao = CustomerDao.builder()
//                .customer_id(customer.getCustomer_id())
//                .customer_name(customer.getCustomer_name())
//                .gender(customer.getGender())
//                .nomor_hp(customer.getNomor_hp())
//                .alamat(customer.getAlamat())
//                .kodepos(customer.getKodepos())
//                .build();
//
//
//
//
//        customerRepository.save(customerDao);
//        return Response.build(ResponseMessage.SUCCESS, HttpStatus.CREATED, CustomerDto.builder()
//                .customer_id(customer.getCustomer_id())
//                .customer_name(customer.getCustomer_name())
//                .gender(customer.getGender())
//                .nomor_hp(customer.getNomor_hp())
//                .alamat(customer.getAlamat())
//                .kodepos(customer.getKodepos())
//                .build());
//    }
//
//    public ResponseEntity<Object> updateProduct(Long id, CustomerDto customer) {
//        Optional<CustomerDao> customerDaoOptional =customerRepository.findById(id);
//
//        if (customerDaoOptional.isEmpty())
//            return Response.build(ResponseMessage.NOT_FOUND, HttpStatus.BAD_REQUEST, null);
//
//        CustomerDao customerDao = customerDaoOptional.get();
//        customerDao.setCustomer_name(customer.getCustomer_name());
//        customerDao.setGender(customer.getGender());
//        customerDao.setNomor_hp(customer.getNomor_hp());
//        customerDao.setAlamat(customer.getAlamat());
//        customerDao.setKodepos(customer.getKodepos());
//        customerRepository.save(customerDao);
//
//        return Response.build(ResponseMessage.SUCCESS, HttpStatus.OK, CustomerDto.builder()
//                .customer_id(customerDao.getCustomer_id())
//                .customer_name(customerDao.getCustomer_name())
//                .gender(customerDao.getGender())
//                .nomor_hp(customerDao.getNomor_hp())
//                .alamat(customerDao.getAlamat())
//                .kodepos(customerDao.getKodepos())
//                .build());
//    }
//
//    public ResponseEntity<Object> deleteProduct(Long id) {
//        Optional<CustomerDao> customerDaoOptional = customerRepository.findById(id);
//
//        if (customerDaoOptional.isEmpty())
//            return Response.build(ResponseMessage.NOT_FOUND, HttpStatus.BAD_REQUEST, null);
//
//        customerRepository.deleteById(id);
//        return Response.build(ResponseMessage.SUCCESS, HttpStatus.OK, null);
//    }
}
