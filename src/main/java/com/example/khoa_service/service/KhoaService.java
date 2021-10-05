package com.example.khoa_service.service;


import com.example.khoa_service.entity.Khoa;
import com.example.khoa_service.repository.KhoaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
//@RequiredArgsConstructor
public class KhoaService {

    @Autowired
    private KhoaRepository khoaRepository;

    public Khoa saveKhoa(Khoa khoa) {
        log.info("Inside saveKhoa of Service! ");
        return khoaRepository.save(khoa);
    }

    public Khoa findKhoaById(Long khoaId) {
        log.info("inside findKhoaById ");
        return khoaRepository.findById(khoaId).get();
    }
}
