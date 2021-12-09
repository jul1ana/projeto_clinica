package View;

import Control.PacienteControl;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 
import javax.swing.JOptionPane;

public class GerenciaPaciente extends javax.swing.JFrame {
    private PacienteControl controlador; 
    public GerenciaPaciente() {
        initComponents();
        this.controlador = new PacienteControl();
        this.carregaTabela(); 
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
        TabelaPacientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_telefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_endereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_datanascimento = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();
        b_editar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Pacientes");
        setMinimumSize(new java.awt.Dimension(815, 550));
        getContentPane().setLayout(null);

        TabelaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone", "Endereço", "Data de Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaPacientes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 800, 189);

        jLabel1.setText("Nome: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 207, 50, 16);
        getContentPane().add(c_nome);
        c_nome.setBounds(30, 235, 547, 22);

        jLabel2.setText("Telefone: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 275, 70, 16);
        getContentPane().add(c_telefone);
        c_telefone.setBounds(30, 303, 165, 22);

        jLabel3.setText("Endereço: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 347, 70, 16);
        getContentPane().add(c_endereco);
        c_endereco.setBounds(30, 375, 547, 22);

        jLabel4.setText("Data de Nascimento: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 415, 140, 16);
        getContentPane().add(c_datanascimento);
        c_datanascimento.setBounds(30, 443, 165, 22);

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(b_cancelar);
        b_cancelar.setBounds(380, 470, 90, 22);

        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });
        getContentPane().add(b_apagar);
        b_apagar.setBounds(580, 470, 90, 22);

        b_editar.setText("Editar");
        b_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editarActionPerformed(evt);
            }
        });
        getContentPane().add(b_editar);
        b_editar.setBounds(490, 470, 72, 22);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/logo.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 180, 580, 400);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/branco.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 180, 340, 350);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
         this.setVisible(false); 
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
               try{
            int id = 0;
            if(this.TabelaPacientes.getSelectedRow() == -1){
                throw new Mensagens("Selecione um paciente para apagar");
            }else{
                id = Integer.parseInt(this.TabelaPacientes.getValueAt(this.TabelaPacientes.getSelectedRow(), 0).toString());
            }
            int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este paciente?");
            if(resposta == 0){
                if(this.controlador.Apagar(id)){
                    this.c_nome.setText("");
                    this.c_telefone.setText("");
                    this.c_endereco.setText("");
                    this.c_datanascimento.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Paciente apagado com sucesso!");
                }
            }
        }catch(Mensagens erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }finally{
            carregaTabela();
        } 
    }//GEN-LAST:event_b_apagarActionPerformed

    private void b_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editarActionPerformed
        
            try{
            int id = 0;
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
                throw new Mensagens("A data de nascimento deve conter ao menos 6 caracteres.");
            }else{
                data_nasc = this.c_datanascimento.getText();
            }
            if(this.TabelaPacientes.getSelectedRow() == -1){
                throw new Mensagens("Selecione um paciente para editar.");
            }else{
                id = Integer.parseInt(this.TabelaPacientes.getValueAt(this.TabelaPacientes.getSelectedRow(), 0).toString());
            }
            if(this.controlador.Editar(endereco, data_nasc, id, nome, telefone)){
                this.c_nome.setText("");
                this.c_telefone.setText("");
                this.c_endereco.setText("");
                this.c_datanascimento.setText("");
                JOptionPane.showMessageDialog(rootPane, "Paciente alterado com sucesso!");
            }
        }catch(Mensagens erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }finally{
            carregaTabela();
        } 
        
    }//GEN-LAST:event_b_editarActionPerformed

    private void TabelaPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPacientesMouseClicked
        
                if(this.TabelaPacientes.getSelectedRow() != -1){
            String nome = this.TabelaPacientes.getValueAt(this.TabelaPacientes.getSelectedRow(), 1).toString();
            String telefone = this.TabelaPacientes.getValueAt(this.TabelaPacientes.getSelectedRow(), 2).toString();
            String endereco = this.TabelaPacientes.getValueAt(this.TabelaPacientes.getSelectedRow(), 3).toString();
            String data_nasc = this.TabelaPacientes.getValueAt(this.TabelaPacientes.getSelectedRow(), 4).toString();
            
            this.c_nome.setText(nome);
            this.c_telefone.setText(telefone);
            this.c_endereco.setText(endereco);
            this.c_datanascimento.setText(data_nasc);
        } 
        
    }//GEN-LAST:event_TabelaPacientesMouseClicked

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
            java.util.logging.Logger.getLogger(GerenciaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaPaciente().setVisible(true);
            }
        });
    }
    
        @SuppressWarnings("unchecked")
    public void carregaTabela(){
        DefaultTableModel listao = (DefaultTableModel)this.TabelaPacientes.getModel();
        listao.setNumRows(0);
        
        String linhasTabela[][] = controlador.getMatrizTabela();
        for(int i = 0; i < linhasTabela.length; i++){
            listao.addRow(new Object[]{
            linhasTabela[i][0],
            linhasTabela[i][1],
            linhasTabela[i][2],
            linhasTabela[i][3],
            linhasTabela[i][4]
        });
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaPacientes;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_editar;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}