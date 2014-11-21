package br.com.fean.sgm.dao;

import br.com.fean.sgm.dao.impl.TurmaDAO;

public class DAOFactory {

    private static final ITurmaDAO turmaDAO = new TurmaDAO();
    

    public static ITurmaDAO getTurmaDAO() {
        return turmaDAO;
    }

  
}
