package br.com.fean.sgm.service.impl;

import br.com.level.celesc.dao.impl.ErroDAO;
import br.com.level.celesc.modelo.Erro;
import br.com.level.celesc.service.IErroService;
import java.util.ArrayList;

public class TipoPessoaService implements IErroService {

    ErroDAO erroDAO = new ErroDAO();

    @Override
    public void incluirErro(Erro erro) throws Exception {
        erroDAO.incluirErro(erro);
    }

    @Override
    public void alterarErro(Erro erro) throws Exception {
        erroDAO.alterarErro(erro);
    }

    @Override
    public void excluirErro(Erro erro) throws Exception {
        erroDAO.excluirErro(erro);
    }

    @Override
    public ArrayList<Erro> getErros() throws Exception {
        return erroDAO.getErros();
    }

    @Override
    public ArrayList<Erro> getErros(String filtro) throws Exception {
        return erroDAO.getErros(filtro);
    }

    @Override
    public Erro getErro(int id) throws Exception {
        return erroDAO.getErro(id);
    }

    @Override
    public Erro getErro(String nome) throws Exception {
        return erroDAO.getErro(nome);
    }
}
