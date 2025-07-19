package br.edu.ifnmg.poo.trabalhofinalpoo.repository;

import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Professor;

public class ProfessorRepository extends Repository<Professor> {

    @Override
    public String getJpqlFindAll() {
        return "SELECT a FROM Aula a";
    }

    @Override
    public String getJpqlFindById() {
        return "SELECT a FROM Aula a WHERE a.id = :id";
    }

    @Override
    public String getJpqlDeleteById() {
        return "DELETE FROM Aula a WHERE a.id = :id";
    }
}
