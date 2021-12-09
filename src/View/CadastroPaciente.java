package View;

import Control.PacienteControl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; 

public class CadastroPaciente extends javax.swing.JFrame {
    private PacienteControl controlador; 
    public CadastroPaciente() {
        initComponents();
        this.controlador = new PacienteControl(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_telefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_endereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_datanascimento = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_cadastrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastramento de Pacientes");
        setMinimumSize(new java.awt.Dimension(845, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nome: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(31, 30, 50, 16);
        getContentPane().add(c_nome);
        c_nome.setBounds(31, 58, 476, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Telefone: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(31, 98, 70, 16);
        getContentPane().add(c_telefone);
        c_telefone.setBounds(31, 126, 233, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Endereço: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(31, 166, 70, 16);
        getContentPane().add(c_endereco);
        c_endereco.setBounds(31, 194, 476, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Data de Nascimento: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(31, 234, 140, 16);
        getContentPane().add(c_datanascimento);
        c_datanascimento.setBounds(31, 262, 233, 22);

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar);
        b_cancelar.setBounds(246, 370, 90, 22);

        b_cadastrar.setText("Cadastrar");
        b_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cadastrar);
        b_cadastrar.setBounds(380, 370, 100, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/clínica.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, -30, 1110, 550);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/branco.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 340, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarActionPerformed
        
            try{
                
            String nome = "";
            String telefone = "";
            String endereco = "";
            String data_nasc = "";
            
            if(this.c_nome.getText().length() < 2){
                throw new Mensagens("O nome deve conter ao menos 2 caracteres.");
            }else{
                nome = this.c_nome.getText();
            }
            if(this.c_telefone.getText().length() < 10){
                throw new Mensagens("O número de telefone deve conter ao menos 10 caracteres.");
            }else{
                telefone = this.c_telefone.getText();
            }
            if(this.c_endereco.getText().length() < 5){
                throw new Mensagens("O endereço deve conter ao menos 5 caracteres.");
            }else{
                endereco = this.c_endereco.getText();
            }
            if(this.c_datanascimento.getText().length() < 6){
                throw new Mensagens("A data de nascimento deve conter ao menos 6 carcteres.");
            }else{
                data_nasc = this.c_datanascimento.getText();
            }
             if(this.controlador.Cadastrar(endereco, data_nasc, nome, telefone)){
            JOptionPane.showMessageDialog(rootPane, "Paciente cadastrado com sucesso!");
        }
             //limpar campos 
        this.c_nome.setText("");
        this.c_telefone.setText("");
        this.c_endereco.setText("");
        this.c_datanascimento.setText("");
                    
        }catch(Mensagens erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_b_cadastrarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.setVisible(false); 
    }//GEN-LAST:event_b_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cadastrar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextField c_datanascimento;
    private javax.swing.JTextField c_endereco;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}