package br.com.fean.sgm.dao.impl;

import br.com.fean.sgm.dao.ITurmaDAO;
import br.com.fean.sgm.model.Turma;
import br.com.fean.sgm.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class TurmaDAO implements ITurmaDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void incluirTurma(Turma turma) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(turma);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void alterarTurma(Turma turma) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(turma);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public void excluirTurma(Turma turma) throws Exception {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(turma);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
        }
    }

    @Override
    public ArrayList<Turma> getTurmas() throws Exception {
      ArrayList<Turma> lista = new ArrayList<Turma>();
        Query query = entityManager.createQuery("select x from Turma x");
        lista = (ArrayList<Turma>) 
                query.getResultList();
        return lista;
    }

    @Override
    public ArrayList<Turma> getTurmas(String filtro) throws Exception {
        ArrayList<Turma> lista = new ArrayList<Turma>();
        Query query = entityManager.createQuery("select x from Turma x WHERE x.nome like :nome");
        query.setParameter("nome", "%" + filtro + "%");
        lista = (ArrayList<Turma>) 
                query.getResultList();
        return lista;
    }

    @Override
    public Turma getTurma(int id) throws Exception {
        Turma turma = null;
        try {
            turma = entityManager.find(Turma.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return turma;  
    }

    @Override
    public Turma getTurma(String nome) throws Exception {
        Turma turma = null;
        try {
            turma = entityManager.find(Turma.class, nome);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return turma;  
    }

}
