package br.com.fean.sgm.util;

import br.com.fean.sgm.model.Turma;
import br.com.fean.sgm.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class TurmaTableModel extends AbstractTableModel {

    private List<Turma> turmas;
    private String[] cabecalhoColunas = {"Código","Ano","Semestre", "Nome"};

    public TurmaTableModel() {
        try {
            turmas = ServiceFactory.getTurmaService().getTurmas();
        } catch (Exception ex) {
            Logger.getLogger(TurmaTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return turmas.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return turmas.get(numLinha).getTurId();
            case 1:
                return turmas.get(numLinha).getTurAno();
            case 2:
                return turmas.get(numLinha).getTurSemestre();
            case 3:
                return turmas.get(numLinha).getTurNome();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

}
