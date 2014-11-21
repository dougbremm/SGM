package br.com.fean.sgm.service;

import br.com.fean.sgm.model.Turma;
import java.util.ArrayList;

public interface ITurmaService {

    public void incluirTurma(Turma turma) throws Exception;

    public void alterarTurma(Turma turma) throws Exception;

    public void excluirTurma(Turma turma) throws Exception;

    public ArrayList<Turma> getTurmas() throws Exception;

    public ArrayList<Turma> getTurmas(String filtro) throws Exception;

    public Turma getTurma(int id) throws Exception;

    public Turma getTurma(String nome) throws Exception;
}
