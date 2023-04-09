package com.example.api.repository;

import com.example.api.model.paciente.Paciente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
    Page<Paciente> findAllByAtivoTrue(Pageable paginacao);
}
