package br.com.fean.sgm.dao.impl;

import br.com.level.celesc.dao.IErroDAO;
import br.com.level.celesc.modelo.Erro;
import br.com.level.celesc.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class TipoPessoaDAO implements IErroDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirErro(Erro erro) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(erro);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarErro(Erro erro) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(erro);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirErro(Erro erro) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(erro);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Erro> getErros() throws Exception {
      ArrayList<Erro> lista = new ArrayList<Erro>();
        Query query = entityManager.createQuery("select x from Erro x");
        lista = (ArrayList<Erro>) 
                query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Erro> getErros(String filtro) throws Exception {
        ArrayList<Erro> lista = new ArrayList<Erro>();
        Query query = entityManager.createQuery("select x from Erro x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<Erro>) 
                query.getResultList();
        return lista;
    }

    @Override
    public Erro getErro(int id) throws Exception {
        Erro erro = null;
        try {
            erro = entityManager.find(Erro.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return erro;  
    }

    @Override
    public Erro getErro(String nome) throws Exception {
        Erro erro = null;
        try {
            erro = entityManager.find(Erro.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return erro;  
    }

}
