package com.example.api.repository;

import com.example.api.controller.MedicoController;
import com.example.api.model.medico.Medico;
import net.bytebuddy.jar.asm.commons.Remapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Integer> {
    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
