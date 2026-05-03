package com.example.PresensiApi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PresensiApi.model.Presensi;

public interface PresensiRepository extends JpaRepository<Presensi, Long> {
    // Spring Data JPA mendukung Pageable secara otomatis
    Page<Presensi> findByNimMhs(String nimMhs, Pageable pageable);
}
