/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.beans.Produto;
import model.dao.ProdutoDAO;

/**
 *
 * @author Gustavo Lobo
 */
public class ConsultarProduto extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaProduto
     */
    public ConsultarProduto() {
        initComponents();
    }
    
    public void limparTodosCampos()
    {
        lbltxt_codigo.setText("");
        txt_nome.setText("");
        txt_preco.setText("");
        txt_categoria.setText("");
        txt_quant.setText("");
    }

    public void preencher_PD(String sql)
    {
        ProdutoDAO dao = new ProdutoDAO();
        
        List<Produto> consulta_produto = dao.consutar_PD(sql);
        
        DefaultTableModel tabela = (DefaultTableModel) tb_produtos.getModel();
        tabela.setNumRows(0);
        
        consulta_produto.forEach((instancia) -> 
        {
            tabela.addRow(new Object[]
            {
                instancia.getNome(),
                instancia.getCategoria(),
                instancia.getPreco()
            });
        });
    }
    
    public void pesquisaDinamica()
    {
        String sql = "SELECT * FROM Produto WHERE "
                + "nome LIKE '%" + txt_PesquisaNome.getText() + "%'";
        
        this.preencher_PD(sql);
    }
    
    public void preencherConsulta(String sql)
    {
        ProdutoDAO dao = new ProdutoDAO();
        
        Produto consulta_produto = dao.consultar(sql);
        
        lbltxt_codigo.setText("" + consulta_produto.getCod_prod());
        txt_nome.setText(consulta_produto.getNome());
        txt_preco.setText("" + consulta_produto.getPreco());
        txt_categoria.setText(consulta_produto.getCategoria());
        txt_quant.setText("" + consulta_produto.getQuantidade());
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
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_preco = new javax.swing.JLabel();
        txt_preco = new javax.swing.JTextField();
        lbl_categoria = new javax.swing.JLabel();
        txt_categoria = new javax.swing.JTextField();
        lbl_quantidade = new javax.swing.JLabel();
        txt_quant = new javax.swing.JTextField();
        lbl_codigo = new javax.swing.JLabel();
        lbltxt_codigo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_PesquisaNome = new javax.swing.JLabel();
        txt_PesquisaNome = new javax.swing.JTextField();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTA DE PRODUTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbl_nome.setText("Nome");

        lbl_preco.setText("Preço");

        lbl_categoria.setText("Categoria");

        lbl_quantidade.setText("Quantidade");

        lbl_codigo.setText("Código");

        lbltxt_codigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_PesquisaNome.setText("Pesquisar Nome");

        txt_PesquisaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_PesquisaNomeKeyReleased(evt);
            }
        });

        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        tb_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Categoria", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produtos.getTableHeader().setReorderingAllowed(false);
        tb_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_produtosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_produtos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_PesquisaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_PesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_preco, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_categoria, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_quantidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_codigo, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_quant, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_categoria, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbltxt_codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_alterar)
                                .addGap(48, 48, 48)
                                .addComponent(btn_excluir)
                                .addGap(47, 47, 47)
                                .addComponent(btn_limpar)
                                .addGap(31, 31, 31))))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_alterar, btn_excluir, btn_limpar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_PesquisaNome)
                    .addComponent(txt_PesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltxt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_codigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nome)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_preco)
                            .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_categoria)
                            .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_quantidade)
                            .addComponent(txt_quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_alterar)
                            .addComponent(btn_limpar)
                            .addComponent(btn_excluir)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_alterar, btn_excluir, btn_limpar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        
        this.limparTodosCampos();
        this.pesquisaDinamica();        
    }//GEN-LAST:event_btn_limparActionPerformed

    private void tb_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_produtosMouseClicked
        
        int linha = tb_produtos.getSelectedRow();
                        
        String sql = "SELECT * FROM Produto WHERE "
                + "nome = '" + tb_produtos.getValueAt(linha, 0) + "' AND "
                + "categoria = '" + tb_produtos.getValueAt(linha, 1) + "' AND "
                + "preco = " + tb_produtos.getValueAt(linha, 2);
        
        this.preencherConsulta(sql);
    }//GEN-LAST:event_tb_produtosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        this.pesquisaDinamica();
    }//GEN-LAST:event_formWindowOpened

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        
        Produto produto = new Produto();
        
        produto.setCod_prod(Integer.parseInt(lbltxt_codigo.getText()));
        produto.setNome(txt_nome.getText());
        produto.setPreco(Double.parseDouble(txt_preco.getText()));
        produto.setCategoria(txt_categoria.getText());
        produto.setQuantidade(Integer.parseInt(txt_quant.getText()));
        
        ProdutoDAO dao = new ProdutoDAO();
        
        boolean result = dao.alterar(produto);
        
        if(result == true)
        {
            JOptionPane.showMessageDialog(this, "Produto alterado", "produto alterado", JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Produto não alterado", "Erro", JOptionPane.PLAIN_MESSAGE);
        }
        
        this.limparTodosCampos();
        this.pesquisaDinamica();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        
        Produto produto = new Produto();
        
        produto.setCod_prod(Integer.parseInt(lbltxt_codigo.getText()));
        
        ProdutoDAO dao = new ProdutoDAO();
        
        boolean result = dao.excluir(produto);
        
        if(result == true)
        {
            JOptionPane.showMessageDialog(this, "Produto excluído", "produto excluído", JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Produto não excluído", "Erro", JOptionPane.PLAIN_MESSAGE);
        }
        
        this.limparTodosCampos();
        this.pesquisaDinamica();
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void txt_PesquisaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PesquisaNomeKeyReleased
        
        this.pesquisaDinamica();
    }//GEN-LAST:event_txt_PesquisaNomeKeyReleased

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
            java.util.logging.Logger.getLogger(ConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConsultarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_PesquisaNome;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_preco;
    private javax.swing.JLabel lbl_quantidade;
    private javax.swing.JLabel lbltxt_codigo;
    private javax.swing.JTable tb_produtos;
    private javax.swing.JTextField txt_PesquisaNome;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_preco;
    private javax.swing.JTextField txt_quant;
    // End of variables declaration//GEN-END:variables
}
