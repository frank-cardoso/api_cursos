package br.com.frank.api_cursos.modules.curso.repositories;


import br.com.frank.api_cursos.modules.curso.entities.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CursoRepository extends JpaRepository<CursoEntity, UUID> {
    Optional<CursoEntity> findByName(String name);
}
