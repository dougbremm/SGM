package br.com.fean.sgm.view;

import br.com.level.celesc.modelo.Concessionaria;
import br.com.level.celesc.service.ServiceFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroTipoPessoa extends javax.swing.JDialog {

    private Concessionaria concessionariaSelecionada;

    public CadastroTipoPessoa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        bExcluir.setVisible(false);
        this.tfCodigo.setEnabled(false);
    }

    public CadastroTipoPessoa(Concessionaria concessionaria, java.awt.Frame parent, boolean modal) {
        this(parent, modal);
        this.concessionariaSelecionada = concessionaria;
        if (concessionariaSelecionada != null) {
            tfCodigo.setText(concessionaria.getId().toString());
            tfNome.setText(concessionaria.getNome());
            // Mostra o botão Excluir     
            bExcluir.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lNome1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        bSalvar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Concesssionárias");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Concessionária"));

        lNome.setText("Código:");

        lNome1.setText("Descrição:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lNome1)
                    .addComponent(lNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bExcluir.setText("Excluir");
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalvar)
                    .addComponent(bCancelar)
                    .addComponent(bExcluir))
                .addGap(38, 38, 38))
        );

        getAccessibleContext().setAccessibleName("Cadastro de Concessionárias");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        if (concessionariaSelecionada != null) {
            concessionariaSelecionada.setNome(tfNome.getText());
            try {
                ServiceFactory.getConcessionariaService().alterarConcessionaria(concessionariaSelecionada);
                JOptionPane.showMessageDialog(this, "Concessionária Alterada com Sucesso!");

            } catch (Exception ex) {
                Logger.getLogger(CadastroTipoPessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Concessionaria concessionaria = new Concessionaria(tfNome.getText());
            try {
                ServiceFactory.getConcessionariaService().incluirConcessionaria(concessionaria);
                JOptionPane.showMessageDialog(this, "Concessionária Inlcuída com Sucesso!");
            } catch (Exception ex) {
                Logger.getLogger(CadastroTipoPessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        concessionariaSelecionada = null;
        this.dispose();
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        if (concessionariaSelecionada != null) {
            try {
                ServiceFactory.getConcessionariaService().excluirConcessionaria(concessionariaSelecionada);
                JOptionPane.showMessageDialog(this, "Concessionária Excluída com Sucesso!");
            } catch (Exception ex) {
                Logger.getLogger(CadastroTipoPessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
            concessionariaSelecionada = null;
            this.dispose();
        }
    }//GEN-LAST:event_bExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNome1;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
