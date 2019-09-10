/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.beans.Venda_CD;
import model.dao.VendaDAO;

/**
 *
 * @author Gustavo Lobo
 */
public class ConsultarVenda extends javax.swing.JFrame {

    /** Creates new form RealizarVenda */
    public ConsultarVenda() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_data = new javax.swing.JLabel();
        lbl_pagamento = new javax.swing.JLabel();
        txt_pagamento = new javax.swing.JTextField();
        txt_data = new javax.swing.JTextField();
        btn_inserir_cliente = new javax.swing.JButton();
        btn_limpar_cliente = new javax.swing.JButton();
        lbl_nome_cliente = new javax.swing.JLabel();
        lbl_cpf_cliente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_lista_produtos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produtos_venda = new javax.swing.JTable();
        btn_adicionar_produto = new javax.swing.JButton();
        btn_excluir_produto = new javax.swing.JButton();
        btn_alterar_venda = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btn_limpar_venda = new javax.swing.JButton();
        lbl_total_venda = new javax.swing.JLabel();
        lbltxt_total_venda = new javax.swing.JLabel();
        lbltxt_nome_cliente = new javax.swing.JLabel();
        lbltxt_cpf_cliente = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btn_excluir_venda = new javax.swing.JButton();
        lbl_pesquisarData = new javax.swing.JLabel();
        txt_pesquisarData = new javax.swing.JTextField();
        lbl_pesquisarNomeCliente = new javax.swing.JLabel();
        txt_pesquisarNome = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_consulta_vendas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbltxt_codigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTAR VENDA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lbl_data.setText("Data");

        lbl_pagamento.setText("Forma de Pagamento");

        btn_inserir_cliente.setText("Inserir Cliente");
        btn_inserir_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserir_clienteActionPerformed(evt);
            }
        });

        btn_limpar_cliente.setText("Limpar cliente");

        lbl_nome_cliente.setText("Nome do cliente");

        lbl_cpf_cliente.setText("CPF do cliente");

        lbl_lista_produtos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_lista_produtos.setText("Lista de produtos da venda:");

        tb_produtos_venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço", "Quantidade", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produtos_venda.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_produtos_venda);

        btn_adicionar_produto.setText("Adicionar Produto");
        btn_adicionar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionar_produtoActionPerformed(evt);
            }
        });

        btn_excluir_produto.setText("Excluir Produto");

        btn_alterar_venda.setText("Salvar Alterações");

        btn_limpar_venda.setText("Limpar Campos");
        btn_limpar_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpar_vendaActionPerformed(evt);
            }
        });

        lbl_total_venda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_total_venda.setText("Valor total da venda:");

        lbltxt_total_venda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbltxt_nome_cliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbltxt_cpf_cliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_excluir_venda.setText("Excluir Venda");

        lbl_pesquisarData.setText("Pesquisar Data da Venda");

        lbl_pesquisarNomeCliente.setText("Pesquisar Nome do Cliente");

        tb_consulta_vendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Nome Cliente", "Total Venda"
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
        tb_consulta_vendas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tb_consulta_vendas);

        jLabel1.setText("Código");

        lbltxt_codigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_pesquisarNomeCliente)
                            .addComponent(lbl_pesquisarData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pesquisarData, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lbl_cpf_cliente))
                                    .addComponent(lbl_nome_cliente, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltxt_cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbltxt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl_data)
                                        .addComponent(lbl_pagamento)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbltxt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_inserir_cliente)
                                    .addGap(64, 64, 64)
                                    .addComponent(btn_limpar_cliente)
                                    .addGap(91, 91, 91))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(btn_adicionar_produto)
                                    .addGap(83, 83, 83)
                                    .addComponent(btn_excluir_produto))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(141, 141, 141)
                                    .addComponent(lbl_lista_produtos)
                                    .addGap(138, 138, 138)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_alterar_venda)
                        .addGap(36, 36, 36)
                        .addComponent(btn_excluir_venda)
                        .addGap(31, 31, 31)
                        .addComponent(btn_limpar_venda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(591, 591, 591)
                        .addComponent(lbl_total_venda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltxt_total_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_alterar_venda, btn_excluir_venda, btn_limpar_venda});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_adicionar_produto, btn_excluir_produto});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_inserir_cliente, btn_limpar_cliente});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbltxt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_data)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_pesquisarData)
                            .addComponent(txt_pesquisarData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_pesquisarNomeCliente)
                            .addComponent(txt_pesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_pagamento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_inserir_cliente)
                            .addComponent(btn_limpar_cliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltxt_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nome_cliente))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_cpf_cliente)
                            .addComponent(lbltxt_cpf_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_lista_produtos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_adicionar_produto)
                            .addComponent(btn_excluir_produto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltxt_total_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_total_venda))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_limpar_venda)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_alterar_venda)
                                .addComponent(btn_excluir_venda))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbltxt_cpf_cliente, lbltxt_nome_cliente});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_alterar_venda, btn_excluir_venda, btn_limpar_venda});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_adicionar_produto, btn_excluir_produto});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_inserir_cliente, btn_limpar_cliente});

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

    public void preencherTabela(String sql)
    {
        VendaDAO dao = new VendaDAO();
        
        List<Venda_CD> consulta_venda = dao.consultar_tabela(sql);
        
        DefaultTableModel tabela = (DefaultTableModel) tb_consulta_vendas.getModel();
        tabela.setNumRows(0);
        
        consulta_venda.forEach((instancia) -> 
        {
            tabela.addRow(new Object[]
            {
                instancia.getData_venda(),
                instancia.getNome_cliente(),
                instancia.getTotal_venda()
            });
        });
    }
    
    private void btn_limpar_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpar_vendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limpar_vendaActionPerformed

    private void btn_inserir_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserir_clienteActionPerformed
        InserirCliente_Venda tela07 = new InserirCliente_Venda();
        tela07.setVisible(true);
    }//GEN-LAST:event_btn_inserir_clienteActionPerformed

    private void btn_adicionar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionar_produtoActionPerformed
        AdicionarProduto_Venda tela08 = new AdicionarProduto_Venda();
        tela08.setVisible(true);
    }//GEN-LAST:event_btn_adicionar_produtoActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adicionar_produto;
    private javax.swing.JButton btn_alterar_venda;
    private javax.swing.JButton btn_excluir_produto;
    private javax.swing.JButton btn_excluir_venda;
    private javax.swing.JButton btn_inserir_cliente;
    private javax.swing.JButton btn_limpar_cliente;
    private javax.swing.JButton btn_limpar_venda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_cpf_cliente;
    private javax.swing.JLabel lbl_data;
    private javax.swing.JLabel lbl_lista_produtos;
    private javax.swing.JLabel lbl_nome_cliente;
    private javax.swing.JLabel lbl_pagamento;
    private javax.swing.JLabel lbl_pesquisarData;
    private javax.swing.JLabel lbl_pesquisarNomeCliente;
    private javax.swing.JLabel lbl_total_venda;
    private javax.swing.JLabel lbltxt_codigo;
    private javax.swing.JLabel lbltxt_cpf_cliente;
    private javax.swing.JLabel lbltxt_nome_cliente;
    private javax.swing.JLabel lbltxt_total_venda;
    private javax.swing.JTable tb_consulta_vendas;
    private javax.swing.JTable tb_produtos_venda;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_pagamento;
    private javax.swing.JTextField txt_pesquisarData;
    private javax.swing.JTextField txt_pesquisarNome;
    // End of variables declaration//GEN-END:variables

}
