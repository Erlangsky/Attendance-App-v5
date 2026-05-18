package com.example.PresensiApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PresensiApi.model.Mahasiswa;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, String> {
    // Spring Data JPA mendukung Pageable secara otomatis
    // SELECT, INSERT, UPDATE, DAN DELETE di balik layar
}
