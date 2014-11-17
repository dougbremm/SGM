package br.com.fean.sgm.dao;

import java.util.ArrayList;

public interface ITipoPessoaDAO {

    public void incluirErro(Erro erro) throws Exception;

    public void alterarErro(Erro erro) throws Exception;

    public void excluirErro(Erro erro) throws Exception;

    public ArrayList<Erro> getErros() throws Exception;

    public ArrayList<Erro> getErros(String filtro) throws Exception;

    public Erro getErro(int id) throws Exception;

    public Erro getErro(String nome) throws Exception;

}
