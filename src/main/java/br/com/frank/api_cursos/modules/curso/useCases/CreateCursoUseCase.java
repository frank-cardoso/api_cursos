package br.com.frank.api_cursos.modules.curso.useCases;

import br.com.frank.api_cursos.exceptions.CursoFoundException;
import br.com.frank.api_cursos.modules.curso.entities.CursoEntity;
import br.com.frank.api_cursos.modules.curso.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCursoUseCase {

    @Autowired
    private CursoRepository cursoRepository;

    public CursoEntity execute(CursoEntity cursoEntity) {
            this.cursoRepository
                    .findByName(cursoEntity.getName())
                    .ifPresent((name) -> {
                        throw new CursoFoundException();
                    });

            return this.cursoRepository.save(cursoEntity);
    }
}
