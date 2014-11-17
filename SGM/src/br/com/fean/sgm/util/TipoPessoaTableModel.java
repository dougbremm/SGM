package br.com.fean.sgm.util;

import br.com.level.celesc.modelo.Erro;
import br.com.level.celesc.service.ServiceFactory;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class TipoPessoaTableModel extends AbstractTableModel {

    private List<Erro> erros;
    private String[] cabecalhoColunas = {"Código", "Nome"};

    public TipoPessoaTableModel() {
        try {
            erros = ServiceFactory.getErroService().getErros();
        } catch (Exception ex) {
            Logger.getLogger(TipoPessoaTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return erros.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int numLinha, int numColuna) {

        switch (numColuna) {
            case 0:
                return erros.get(numLinha).getId();
            case 1:
                return erros.get(numLinha).getDescricao();
        }
        return null;
    }

    @Override
    public String getColumnName(int numColuna) {
        return cabecalhoColunas[numColuna];
    }

    public List<Erro> getErros() {
        return erros;
    }

}
