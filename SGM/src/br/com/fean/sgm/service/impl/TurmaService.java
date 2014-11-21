package br.com.fean.sgm.service.impl;

import br.com.fean.sgm.dao.impl.TurmaDAO;
import br.com.fean.sgm.model.Turma;
import br.com.fean.sgm.service.ITurmaService;
import java.util.ArrayList;

public class TurmaService implements ITurmaService {

    TurmaDAO turmaDAO = new TurmaDAO();

    @Override
    public void incluirTurma(Turma turma) throws Exception {
        turmaDAO.incluirTurma(turma);
    }

    @Override
    public void alterarTurma(Turma turma) throws Exception {
        turmaDAO.alterarTurma(turma);
    }

    @Override
    public void excluirTurma(Turma turma) throws Exception {
        turmaDAO.excluirTurma(turma);
    }

    @Override
    public ArrayList<Turma> getTurmas() throws Exception {
        return turmaDAO.getTurmas();
    }

    @Override
    public ArrayList<Turma> getTurmas(String filtro) throws Exception {
        return turmaDAO.getTurmas(filtro);
    }

    @Override
    public Turma getTurma(int id) throws Exception {
        return turmaDAO.getTurma(id);
    }

    @Override
    public Turma getTurma(String nome) throws Exception {
        return turmaDAO.getTurma(nome);
    }
}
