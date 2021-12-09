package View;

import Control.MedicoControl;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class GerenciaMedico extends javax.swing.JFrame {
    
    private MedicoControl control; 
    
    public GerenciaMedico() {
        initComponents();
        this.control = new MedicoControl();
        this.Carregar(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableMedico = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        g_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        g_telefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        g_crm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        g_especialidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        g_turno = new javax.swing.JTextField();
        g_cancelar = new javax.swing.JButton();
        g_apagar = new javax.swing.JButton();
        g_editar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Médicos");
        setMinimumSize(new java.awt.Dimension(766, 630));
        getContentPane().setLayout(null);

        JTableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone", "CRM", "Especialidade", "Turno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableMedicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableMedico);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 751, 158);

        jLabel1.setText("Nome: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(23, 206, 60, 16);
        getContentPane().add(g_nome);
        g_nome.setBounds(23, 234, 556, 22);

        jLabel2.setText("Telefone: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(23, 274, 70, 16);

        g_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_telefoneActionPerformed(evt);
            }
        });
        getContentPane().add(g_telefone);
        g_telefone.setBounds(23, 302, 215, 22);

        jLabel3.setText("CRM: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(23, 342, 50, 16);
        getContentPane().add(g_crm);
        g_crm.setBounds(23, 370, 215, 22);

        jLabel4.setText("Especialidade: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(23, 410, 90, 16);
        getContentPane().add(g_especialidade);
        g_especialidade.setBounds(23, 438, 556, 22);

        jLabel5.setText("Turno: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(23, 478, 60, 16);
        getContentPane().add(g_turno);
        g_turno.setBounds(23, 506, 217, 22);

        g_cancelar.setText("Cancelar");
        g_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(g_cancelar);
        g_cancelar.setBounds(436, 535, 90, 22);

        g_apagar.setText("Apagar");
        g_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_apagarActionPerformed(evt);
            }
        });
        getContentPane().add(g_apagar);
        g_apagar.setBounds(634, 535, 80, 22);

        g_editar.setText("Editar");
        g_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_editarActionPerformed(evt);
            }
        });
        getContentPane().add(g_editar);
        g_editar.setBounds(544, 535, 72, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/logo.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 60, 520, 580);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/branco.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-20, 150, 370, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTableMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableMedicoMouseClicked
        
            if (this.JTableMedico.getSelectedRow() != -1) { 
            
            String nome = this.JTableMedico.getValueAt(this.JTableMedico.getSelectedRow(), 1).toString();
            String telefone = this.JTableMedico.getValueAt(this.JTableMedico.getSelectedRow(), 2).toString();
            String crm = this.JTableMedico.getValueAt(this.JTableMedico.getSelectedRow(), 3).toString();
            String especialidade = this.JTableMedico.getValueAt(this.JTableMedico.getSelectedRow(), 4).toString();
            String turno = this.JTableMedico.getValueAt(this.JTableMedico.getSelectedRow(), 5).toString();
            this.g_nome.setText(nome);
            this.g_telefone.setText(telefone);
            this.g_crm.setText(crm);
            this.g_especialidade.setText(especialidade);
            this.g_turno.setText(turno);
        }
    }//GEN-LAST:event_JTableMedicoMouseClicked

    private void g_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_editarActionPerformed
        
            try {
            int id = 0;
            String nome = "";
            String telefone = "";
            String crm = "";
            String especialidade = "";
            String turno = "";

            if (this.g_nome.getText().length() < 2) {
                throw new Mensagens("O nome deve conter ao menos 2 caracteres");
            } else {
                nome = this.g_nome.getText();
            }

            if (this.g_telefone.getText().length() <= 0) {
                throw new Mensagens("O telefone deve ser número e ser maior que zero");
            } else {
                telefone = this.g_telefone.getText();
            }

            if (this.g_crm.getText().length() <= 0) {
                throw new Mensagens("O CRM deve ser número e ser maior que zero");
            } else {
                crm = this.g_crm.getText();
            }

            if (this.g_especialidade.getText().length() < 2) {
                throw new Mensagens("A especialidade deve conter ao menos 2 caracteres");
            } else {
                especialidade = this.g_especialidade.getText();
            }

            if (this.g_turno.getText().length() < 0) {
                throw new Mensagens("O turno deve conter ao menos 2 caracteres");
            } else {
                turno = this.g_turno.getText();
            }

            if (this.JTableMedico.getSelectedRow() == -1) {
                throw new Mensagens("Selecione um médico para mudar");
            } else {
                id = Integer.parseInt(this.JTableMedico.getValueAt(this.JTableMedico.getSelectedRow(), 0).toString());
            }

            if (this.control.Editar(nome, crm, id, especialidade, turno, telefone)) {

                this.g_nome.setText("");
                this.g_telefone.setText("");
                this.g_crm.setText("");
                this.g_especialidade.setText("");
                this.g_turno.setText("");
                JOptionPane.showMessageDialog(rootPane, "Médico mudado com sucesso !");
            }

            System.out.println(this.control.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Precisa ser um número !");
        } finally {
            this.Carregar();
        } 
        
    }//GEN-LAST:event_g_editarActionPerformed

    private void g_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_apagarActionPerformed
        
            try { 

            int id = 0;
            if (this.JTableMedico.getSelectedRow() == -1) {
                throw new Mensagens("Selecione um médico para apagar");
            } else {
                id = Integer.parseInt(this.JTableMedico.getValueAt(this.JTableMedico.getSelectedRow(), 0).toString());
            }

            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Você quer apagar este médico?");

            if (resposta_usuario == 0) {

                if (this.control.Deletar(id)) {

                    this.g_nome.setText("");
                    this.g_telefone.setText("");
                    this.g_crm.setText("");
                    this.g_especialidade.setText("");
                    this.g_turno.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Médico foi apagado !");
                }
            }

            System.out.println(this.control.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            this.Carregar();
        } 
        
    }//GEN-LAST:event_g_apagarActionPerformed

    private void g_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_cancelarActionPerformed
        this.setVisible(false); 
    }//GEN-LAST:event_g_cancelarActionPerformed

    private void g_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g_telefoneActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaMedico().setVisible(true);
            }
        });
    } 
    
    @SuppressWarnings("Unchecked") 
    public void Carregar() {

        DefaultTableModel modelo = (DefaultTableModel) this.JTableMedico.getModel();

        modelo.setNumRows(0);

        String linhaMatriz[][] = control.EntregarPraView();

        for (int i = 0; i < linhaMatriz.length; i++) {

            modelo.addRow(new Object[]{
                linhaMatriz[i][0],
                linhaMatriz[i][1],
                linhaMatriz[i][2],
                linhaMatriz[i][3],
                linhaMatriz[i][4],
                linhaMatriz[i][5]
            });
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableMedico;
    private javax.swing.JButton g_apagar;
    private javax.swing.JButton g_cancelar;
    private javax.swing.JTextField g_crm;
    private javax.swing.JButton g_editar;
    private javax.swing.JTextField g_especialidade;
    private javax.swing.JTextField g_nome;
    private javax.swing.JTextField g_telefone;
    private javax.swing.JTextField g_turno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
