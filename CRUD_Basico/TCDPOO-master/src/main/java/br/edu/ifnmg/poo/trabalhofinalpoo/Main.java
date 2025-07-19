package br.edu.ifnmg.poo.trabalhofinalpoo;

import br.edu.ifnmg.poo.trabalhofinalpoo.repository.*;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- INICIANDO TESTES CRUD ---");

        // --- 1. Inicializar Repositórios ---
        // (Assumindo que você criou um repositório para cada entidade)
        DiscenteRepository discenteRepository = new DiscenteRepository();
        ProfessorRepository professorRepository = new ProfessorRepository();
        DisciplinaRepository disciplinaRepository = new DisciplinaRepository();
        TurmaRepository turmaRepository = new TurmaRepository();
        MatriculaRepository matriculaRepository = new MatriculaRepository();
        AulaRepository aulaRepository = new AulaRepository();
        AvaliacaoRepository avaliacaoRepository = new AvaliacaoRepository();

        // --- 2. CRIAR Entidades ---
        System.out.println("\n--- 2.1 CRIANDO E SALVANDO ENTIDADES ---");

        Professor professor = new Professor("Luis Guisso", "111.111.111-11", LocalDate.of(1980, 1, 1));
        Long professorId = professorRepository.saveOrUpdate(professor);
        System.out.println("Professor salvo com ID: " + professorId);

        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", "Ementa completa de POO.");
        Long disciplinaId = disciplinaRepository.saveOrUpdate(disciplina);
        System.out.println("Disciplina salva com ID: " + disciplinaId);

        Discente discente = new Discente("Ana Zaira", "222.222.222-22", LocalDate.of(2000, 5, 10));
        Long discenteId = discenteRepository.saveOrUpdate(discente);
        System.out.println("Discente salvo com ID: " + discenteId);

        Turma turma = new Turma("2025/1", disciplina, professor);
        Long turmaId = turmaRepository.saveOrUpdate(turma);
        System.out.println("Turma salva com ID: " + turmaId);

        Matricula matricula = new Matricula(discente, turma);
        Long matriculaId = matriculaRepository.saveOrUpdate(matricula);
        System.out.println("Matrícula salva com ID: " + matriculaId);

        Aula aula = new Aula("Introdução a Classes e Objetos", LocalDateTime.now(), turma);
        Long aulaId = aulaRepository.saveOrUpdate(aula);
        System.out.println("Aula salva com ID: " + aulaId);

        Avaliacao avaliacao = new Avaliacao("Prova 1", 8.5, matricula);
        Long avaliacaoId = avaliacaoRepository.saveOrUpdate(avaliacao);
        System.out.println("Avaliação salva com ID: " + avaliacaoId);

        // --- 3. LER Entidades ---
        System.out.println("\n--- 3.1 BUSCANDO ENTIDADES POR ID ---");
        Professor professorEncontrado = professorRepository.findById(professorId);
        System.out.println("Professor encontrado: " + professorEncontrado.getNome());

        Turma turmaEncontrada = turmaRepository.findById(turmaId);
        System.out.println("Turma encontrada: " + turmaEncontrada.getDisciplina().getNome());

        System.out.println("\n--- 3.2 LISTANDO TODAS AS DISCIPLINAS ---");
        List<Disciplina> todasDisciplinas = disciplinaRepository.findAll();
        for (Disciplina d : todasDisciplinas) {
            System.out.println("> " + d);
        }

        // --- 4. ATUALIZAR Entidades ---
        System.out.println("\n--- 4.1 ATUALIZANDO ENTIDADES ---");
        Discente discenteParaAtualizar = discenteRepository.findById(discenteId);
        discenteParaAtualizar.setNome("Ana Zaira da Silva");
        discenteRepository.saveOrUpdate(discenteParaAtualizar);
        System.out.println("Nome do discente atualizado: " + discenteRepository.findById(discenteId).getNome());

        Avaliacao avaliacaoParaAtualizar = avaliacaoRepository.findById(avaliacaoId);
        avaliacaoParaAtualizar.setNota(9.0);
        avaliacaoRepository.saveOrUpdate(avaliacaoParaAtualizar);
        System.out.println("Nota da avaliação atualizada: " + avaliacaoRepository.findById(avaliacaoId).getNota());

        // --- 5. EXCLUIR Entidades ---
        System.out.println("\n--- 5.1 EXCLUINDO ENTIDADES ---");
        // A abordagem correta é buscar a entidade e passar o OBJETO para o método delete.
        // Isso garante que o JPA use "entityManager.remove()" e acione as exclusões em cascata.

        // Ao deletar o objeto Turma, o JPA irá deletar em cascata as Matrículas e Aulas associadas.
        System.out.println("Excluindo Turma (e suas dependências em cascata)...");
        Turma turmaParaDeletar = turmaRepository.findById(turmaId);
        if (turmaParaDeletar != null) {
            turmaRepository.delete(turmaParaDeletar);
        }

        // Agora que a Matrícula (que dependia do Discente) foi removida em cascata, podemos excluir o Discente.
        System.out.println("Excluindo Discente...");
        Discente discenteParaDeletar = discenteRepository.findById(discenteId);
        if (discenteParaDeletar != null) {
            discenteRepository.delete(discenteParaDeletar);
        }

        // Excluindo as entidades restantes que não têm mais dependências.
        System.out.println("Excluindo Professor...");
        Professor professorParaDeletar = professorRepository.findById(professorId);
        if (professorParaDeletar != null) {
            professorRepository.delete(professorParaDeletar);
        }

        System.out.println("Excluindo Disciplina...");
        Disciplina disciplinaParaDeletar = disciplinaRepository.findById(disciplinaId);
        if (disciplinaParaDeletar != null) {
            disciplinaRepository.delete(disciplinaParaDeletar);
        }

        System.out.println("\n--- VERIFICANDO EXCLUSÕES ---");
        System.out.println("Turmas no banco: " + turmaRepository.findAll().size());
        System.out.println("Discentes no banco: " + discenteRepository.findAll().size());

        System.out.println("\n--- TESTES CRUD FINALIZADOS COM SUCESSO! ---");
    }
}
