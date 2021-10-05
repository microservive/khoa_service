package com.example.khoa_service.repository;


import com.example.khoa_service.entity.Khoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoaRepository
        extends JpaRepository<Khoa, Long> {

    //Department findDepartmentById(Long departmentId);
}

