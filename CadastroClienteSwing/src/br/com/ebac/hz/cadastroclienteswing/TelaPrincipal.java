/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ebac.hz.cadastroclienteswing;

import br.com.ebac.hz.modulo14.dao.ClienteMapDAO;
import br.com.ebac.hz.modulo14.dao.IClienteDAO;
import br.com.ebac.hz.modulo14.domain.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe & Cíntia
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private IClienteDAO clienteDAO = new ClienteMapDAO();
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        cpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        Telefone = new javax.swing.JLabel();
        Endereço = new javax.swing.JLabel();
        Cidade = new javax.swing.JLabel();
        cpf1 = new javax.swing.JLabel();
        cpf2 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtNumb = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuItemSair = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nome.setText("Nome:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        cpf.setText("CPF:");

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        Telefone.setText("Telefone:");

        Endereço.setText("Endereço:");

        Cidade.setText("Cidade:");

        cpf1.setText("Número:");

        cpf2.setText("Estado:");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        menuItemSair.setText("Opções ");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuItemSair.add(jMenuItem2);

        jMenuBar1.add(menuItemSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Endereço, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 99, Short.MAX_VALUE)
                                                .addComponent(btnLimpar)
                                                .addGap(64, 64, 64)
                                                .addComponent(btnSalvar)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnAtualizar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExcluir))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cpf2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Endereço)
                    .addComponent(cpf1)
                    .addComponent(txtNumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cidade)
                    .addComponent(cpf2)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Deseja Sair da aplicação", "Sair",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = txtNome.getText();
        String cpf1 = txtCpf.getText();
        String telefone = txtTelefone.getText();
        String endereco = txtEnd.getText();
        String numb = txtNumb.getText();
        String cidade = txtCidade.getText();
        String estado = txtEstado.getText();
        
        if (isCamposValidos(nome, cpf1, telefone, endereco,numb,cidade,estado)){
             JOptionPane.showConfirmDialog(null, "Existem campos a serem preenchidos", "Atenção", JOptionPane.INFORMATION_MESSAGE);
             return;
        }
        
        Cliente cliente = new Cliente(nome,cpf1 ,telefone, endereco,numb,cidade,estado);
        Boolean isCadastrado = this.clienteDAO.cadastrar(cliente);
        
        if (isCadastrado){
            modelo.addRow(new Object[]{cliente.getNome(), cliente.getCpf(), cliente.getTel(), cliente.getEnd()});
            limparCampos();
        }else{
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado", "Atenção",JOptionPane.CLOSED_OPTION);
        }
        
        
        JOptionPane.showConfirmDialog(null, "Cliente cadastrado com Sucesso", "Sucesso", JOptionPane.CLOSED_OPTION);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
       int linhaSelecionada = tabelaClientes.getSelectedRow();
       Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada, 1);
       
       Cliente cliente = this.clienteDAO.consultar(cpf);
       
       txtNome.setText(cliente.getNome());
       txtCpf.setText(cliente.getCpf().toString());
       txtTelefone.setText(cliente.getTel().toString());
       txtEnd.setText(cliente.getEnd());
       txtNumb.setText(cliente.getNumero().toString());
       txtCidade.setText(cliente.getCidade());
       txtEstado.setText(cliente.getEstado());
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = tabelaClientes.getSelectedRow();
       
        if(linhaSelecionada >=0){
            int result = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este cliente?","Cuidado",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            
            if (result == JOptionPane.YES_OPTION){
                Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada, 1);
                this.clienteDAO.excluir(cpf);
                modelo.removeRow(linhaSelecionada);
                
                JOptionPane.showConfirmDialog(null,"Cliente excluído com Sucesso", "Sucesso", JOptionPane.CLOSED_OPTION);
                limparCampos();
            }
        }else{
            JOptionPane.showConfirmDialog(null,"Nenhum Cliente Selecionada", "ERRO", JOptionPane.CLOSED_OPTION);
            
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        int linhaSelecionada = tabelaClientes.getSelectedRow();
        
        if (linhaSelecionada >=0 ){
            Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada, 1);
            String nome = txtNome.getText();
            String telefone = txtTelefone.getText();
            String endereco = txtEnd.getText();
            String numb = txtNumb.getText();
            String cidade = txtCidade.getText();
            String estado = txtEstado.getText();
        
        if (isCamposValidos(nome, cpf.toString(),telefone,endereco,numb,cidade,estado)){
             JOptionPane.showConfirmDialog(null, "Existem campos a serem preenchidos", "Atenção", JOptionPane.INFORMATION_MESSAGE);
             return;
        }
        
        Cliente clienteAlt = new Cliente(nome, cpf.toString(),telefone,endereco,numb,cidade,estado);
        this.clienteDAO.alterar(clienteAlt);
        
        modelo.removeRow(linhaSelecionada);
        modelo.addRow(new Object[] {clienteAlt.getNome(),clienteAlt.getCpf(),clienteAlt.getTel(),clienteAlt.getEnd()});
        
               
         JOptionPane.showConfirmDialog(null, "Cliente atualizado com Sucesso", "Sucesso", JOptionPane.CLOSED_OPTION);
    }//GEN-LAST:event_btnAtualizarActionPerformed
        else{
            JOptionPane.showConfirmDialog(null, "Nenhum Cliente selecionado", "ERRO", JOptionPane.CLOSED_OPTION);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel Endereço;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel cpf1;
    private javax.swing.JLabel cpf2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuItemSair;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumb;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private boolean isCamposValidos(String ...campos) {
        for (String campo: campos){
            if (campos != null || "".equals(campo)){
                return false;
            }
        }
        return true;
    }

    private void initCustomComponents() {
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Telefone");
        modelo.addColumn("Endereço");
        
        tabelaClientes.setModel(modelo);
    }

    private void limparCampos() {
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEnd.setText("");
        txtNumb.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        
    }
}
