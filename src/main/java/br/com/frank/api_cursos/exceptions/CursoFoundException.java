package br.com.frank.api_cursos.exceptions;

public class CursoFoundException extends RuntimeException  {
    public CursoFoundException(){
        super("Curso já existe!!");
    }
}
