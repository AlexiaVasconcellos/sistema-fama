/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotevisao;

import com.sun.awt.AWTUtilities;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import pacoDAO.clienteDAO;
import pacoteModelo.Cliente;


/**
 *
 * @author Alexia
 */
public class CadCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadaCliente
     */
    int x,y;
    
    public CadCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this,false);
        
        
    }
    
        private void botoes(boolean novo, boolean salvar, boolean editar, boolean excluir){
        btnadcionar.setEnabled(novo);
        btnsalvar.setEnabled(salvar);
        btneditar.setEnabled(editar);
        btnexcluir.setEnabled(excluir);
        //btnexcluir.setEnabled(consultar);
    }
    
    private void limparCampos(){
     txtnome.setText("");
     txtierg.setText("");
     txttipopessoa.setText("");
     txtcpfcnpj.setText("");
     txtdddc1.setText("");
     txtcelular1.setText("");
     txtdatanasc.setText("");
     txtendereco.setText("");
     txtnumero.setText("");
     txtbairro.setText("");
     txtuf.setText("");
     txtcidade.setText("");
     txtemail.setText("");
     txttdddt1.setText("");
     txtcep.setText("");
     txtcomplemento.setText("");
     txttelefone.setText("");
    }
    private void carregarFormulario(Cliente c) {

        txtcpfcnpj.setText( String.valueOf(c.getCnpjcpf()) );
        txtnome.setText(c.getNome());                         
        txtierg.setText(c.getIerg());
        txttipopessoa.setText( String.valueOf( c.getTipopessoa()) );
        txtdatanasc.setText( String.valueOf( c.getDatanasc()) );
        txtemail.setText( String.valueOf( c.getEmail()) );
        txttdddt1.setText( String.valueOf( c.getDddFone()) );
        txttelefone.setText( String.valueOf( c.getFone()) );
        txtdddc1.setText( String.valueOf( c.getDddcel1()) );
        txtcelular1.setText( String.valueOf( c.getCelular1()) );
        txtcep.setText( String.valueOf( c.getCep()) );
        txtendereco.setText( String.valueOf( c.getEndereco()) );
        txtnumero.setText( String.valueOf( c.getNumero()) );
        txtcomplemento.setText( String.valueOf( c.getComplemento()) );
        txtbairro.setText( String.valueOf( c.getBairro()) );
        txtcidade.setText( String.valueOf( c.getCidade()) );
        txtuf.setText( String.valueOf( c.getUf()) );
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        txtcelular1 = new javax.swing.JTextField();
        txttelefone = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtierg = new javax.swing.JTextField();
        txtendereco = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        txtcomplemento = new javax.swing.JTextField();
        txtbairro = new javax.swing.JTextField();
        txtcpfcnpj = new javax.swing.JTextField();
        txtcidade = new javax.swing.JTextField();
        txtdatanasc = new javax.swing.JTextField();
        txtdddc1 = new javax.swing.JTextField();
        txtuf = new javax.swing.JTextField();
        txttdddt1 = new javax.swing.JTextField();
        txtcep = new javax.swing.JTextField();
        txttipopessoa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtconsulta = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnconsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTcliente = new javax.swing.JTable();
        btnadcionar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(900, 900));
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(900, 900));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(null);

        jTabbedPane2.setBackground(new java.awt.Color(255, 51, 51));
        jTabbedPane2.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(169, 209, 142));
        jPanel3.setLayout(null);

        txtcelular1.setBorder(null);
        txtcelular1.setOpaque(false);
        jPanel3.add(txtcelular1);
        txtcelular1.setBounds(80, 230, 230, 30);

        txttelefone.setBorder(null);
        txttelefone.setOpaque(false);
        txttelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefoneActionPerformed(evt);
            }
        });
        jPanel3.add(txttelefone);
        txttelefone.setBounds(80, 120, 230, 30);

        txtnome.setBorder(null);
        txtnome.setOpaque(false);
        jPanel3.add(txtnome);
        txtnome.setBounds(10, 40, 440, 30);

        txtemail.setBorder(null);
        txtemail.setOpaque(false);
        jPanel3.add(txtemail);
        txtemail.setBounds(650, 420, 230, 30);

        txtierg.setBorder(null);
        txtierg.setOpaque(false);
        txtierg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiergActionPerformed(evt);
            }
        });
        jPanel3.add(txtierg);
        txtierg.setBounds(540, 40, 230, 30);

        txtendereco.setBorder(null);
        txtendereco.setOpaque(false);
        jPanel3.add(txtendereco);
        txtendereco.setBounds(10, 340, 440, 30);

        txtnumero.setBorder(null);
        txtnumero.setOpaque(false);
        jPanel3.add(txtnumero);
        txtnumero.setBounds(520, 340, 50, 30);

        txtcomplemento.setBorder(null);
        txtcomplemento.setOpaque(false);
        jPanel3.add(txtcomplemento);
        txtcomplemento.setBounds(650, 340, 230, 30);

        txtbairro.setBorder(null);
        txtbairro.setOpaque(false);
        jPanel3.add(txtbairro);
        txtbairro.setBounds(300, 420, 230, 30);

        txtcpfcnpj.setBorder(null);
        txtcpfcnpj.setOpaque(false);
        jPanel3.add(txtcpfcnpj);
        txtcpfcnpj.setBounds(660, 120, 230, 30);

        txtcidade.setBorder(null);
        txtcidade.setOpaque(false);
        jPanel3.add(txtcidade);
        txtcidade.setBounds(10, 420, 230, 30);

        txtdatanasc.setBorder(null);
        txtdatanasc.setOpaque(false);
        jPanel3.add(txtdatanasc);
        txtdatanasc.setBounds(400, 220, 230, 30);

        txtdddc1.setBorder(null);
        txtdddc1.setOpaque(false);
        jPanel3.add(txtdddc1);
        txtdddc1.setBounds(10, 230, 40, 30);

        txtuf.setBorder(null);
        txtuf.setOpaque(false);
        txtuf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtufActionPerformed(evt);
            }
        });
        jPanel3.add(txtuf);
        txtuf.setBounds(570, 420, 40, 30);

        txttdddt1.setBorder(null);
        txttdddt1.setOpaque(false);
        txttdddt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttdddt1ActionPerformed(evt);
            }
        });
        jPanel3.add(txttdddt1);
        txttdddt1.setBounds(10, 120, 40, 30);

        txtcep.setBorder(null);
        txtcep.setOpaque(false);
        jPanel3.add(txtcep);
        txtcep.setBounds(680, 220, 230, 30);

        txttipopessoa.setBorder(null);
        txttipopessoa.setOpaque(false);
        jPanel3.add(txttipopessoa);
        txttipopessoa.setBounds(410, 120, 230, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada2.png"))); // NOI18N
        jLabel6.setToolTipText("");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(70, 110, 260, 60);

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel5.setText("Cidade");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(100, 380, 60, 30);

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel7.setText("N°");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(530, 300, 30, 30);

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel9.setText("Nome");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(160, 10, 60, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada3.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(0, 110, 70, 58);

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel11.setText("Data  de nascimento");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(430, 180, 160, 20);

        jLabel14.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel14.setText("CPF/ CNPJ");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(750, 80, 110, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada2.png"))); // NOI18N
        jLabel12.setToolTipText("");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(650, 110, 260, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada2.png"))); // NOI18N
        jLabel13.setToolTipText("");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(0, 410, 260, 60);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada.png"))); // NOI18N
        jLabel15.setToolTipText("");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(0, 330, 460, 60);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada2.png"))); // NOI18N
        jLabel16.setToolTipText("");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(530, 30, 260, 60);

        jLabel17.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel17.setText("Endereço");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(150, 300, 90, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada2.png"))); // NOI18N
        jLabel18.setToolTipText("");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(280, 410, 260, 60);

        jLabel19.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel19.setText("Bairro");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(380, 380, 50, 30);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada3.png"))); // NOI18N
        jLabel20.setText("jLabel10");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(510, 330, 70, 58);

        jLabel21.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel21.setText("Telefone");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(160, 80, 80, 30);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada3.png"))); // NOI18N
        jLabel22.setText("jLabel10");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(560, 410, 70, 60);

        jLabel24.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel24.setText("UF");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(580, 380, 30, 30);

        jLabel25.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel25.setText("DDD");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(10, 80, 50, 30);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada3.png"))); // NOI18N
        jLabel27.setText("jLabel10");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(0, 220, 70, 58);

        jLabel28.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel28.setText("Celular1");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(160, 190, 60, 30);

        jLabel29.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel29.setText("DDD");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(10, 190, 50, 30);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada2.png"))); // NOI18N
        jLabel30.setToolTipText("");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(640, 410, 260, 60);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada2.png"))); // NOI18N
        jLabel23.setToolTipText("");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(240, 520, 260, 60);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada2.png"))); // NOI18N
        jLabel31.setToolTipText("");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(70, 220, 260, 60);

        jLabel32.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel32.setText("Email");
        jPanel3.add(jLabel32);
        jLabel32.setBounds(740, 380, 50, 30);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada2.png"))); // NOI18N
        jLabel33.setToolTipText("");
        jPanel3.add(jLabel33);
        jLabel33.setBounds(400, 110, 260, 60);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada2.png"))); // NOI18N
        jLabel35.setToolTipText("");
        jPanel3.add(jLabel35);
        jLabel35.setBounds(390, 210, 260, 60);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada.png"))); // NOI18N
        jLabel34.setToolTipText("");
        jPanel3.add(jLabel34);
        jLabel34.setBounds(0, 30, 460, 60);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada2.png"))); // NOI18N
        jLabel40.setToolTipText("");
        jPanel3.add(jLabel40);
        jLabel40.setBounds(640, 330, 260, 60);

        jLabel41.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel41.setText("Complemento");
        jPanel3.add(jLabel41);
        jLabel41.setBounds(730, 300, 120, 30);

        jLabel26.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel26.setText("RG");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(640, 0, 30, 30);

        jLabel36.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel36.setText("Tipo pessoa");
        jPanel3.add(jLabel36);
        jLabel36.setBounds(490, 80, 110, 30);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada2.png"))); // NOI18N
        jLabel37.setToolTipText("");
        jPanel3.add(jLabel37);
        jLabel37.setBounds(670, 210, 260, 60);

        jLabel38.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        jLabel38.setText("CEP");
        jPanel3.add(jLabel38);
        jLabel38.setBounds(770, 180, 40, 20);

        jTabbedPane2.addTab("Cliente", jPanel3);

        jPanel2.setBackground(new java.awt.Color(169, 209, 142));
        jPanel2.setLayout(null);

        txtconsulta.setColumns(40);
        txtconsulta.setBorder(null);
        txtconsulta.setOpaque(false);
        jPanel2.add(txtconsulta);
        txtconsulta.setBounds(20, 50, 440, 30);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/entrada.png"))); // NOI18N
        jLabel39.setToolTipText("");
        jPanel2.add(jLabel39);
        jLabel39.setBounds(10, 40, 460, 60);

        jLabel1.setText("Nome Cliente");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 24, 110, 10);

        btnconsulta.setText("Consultar");
        btnconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btnconsulta);
        btnconsulta.setBounds(520, 60, 140, 23);

        jTcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Telefone", "UF"
            }
        ));
        jTcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTclienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTcliente);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 870, 340);

        jTabbedPane2.addTab("Consulta", jPanel2);

        jPanel1.add(jTabbedPane2);
        jTabbedPane2.setBounds(50, 120, 900, 500);

        btnadcionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/incluircliente1.png"))); // NOI18N
        btnadcionar.setBorder(null);
        btnadcionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadcionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnadcionar);
        btnadcionar.setBounds(260, 50, 80, 70);

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/editarcliente.png"))); // NOI18N
        btneditar.setBorder(null);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        jPanel1.add(btneditar);
        btneditar.setBounds(480, 50, 80, 70);

        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/confirmar.png"))); // NOI18N
        btnsalvar.setBorder(null);
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalvar);
        btnsalvar.setBounds(370, 50, 80, 70);

        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/excluir.png"))); // NOI18N
        btnexcluir.setBorder(null);
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnexcluir);
        btnexcluir.setBounds(600, 50, 80, 70);

        btnvoltar.setFont(new java.awt.Font("Calisto MT", 1, 16)); // NOI18N
        btnvoltar.setText("Voltar");
        btnvoltar.setBorder(null);
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnvoltar);
        btnvoltar.setBounds(770, 650, 73, 23);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacoteImagens/fundo2.png"))); // NOI18N
        Fundo.setMinimumSize(new java.awt.Dimension(978, 824));
        jPanel1.add(Fundo);
        Fundo.setBounds(20, -20, 1040, 740);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefoneActionPerformed

    private void txtufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtufActionPerformed

    private void txttdddt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttdddt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttdddt1ActionPerformed

    private void btnadcionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadcionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadcionarActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        
        Cliente c = new Cliente();
        c.setCnpjcpf          (txtcpfcnpj.getText()); 
        c.setCelular1         (Integer.parseInt  (txtcelular1.getText()));
        c.setDddcel1          (Integer.parseInt  (txtdddc1.getText())   );
        c.setFone             (Integer.parseInt  (txttelefone.getText()));
        c.setDddfone          (Integer.parseInt  (txttdddt1.getText())   );
        c.setCep              (Integer.parseInt  (txtcep.getText()));
        c.setDatanasc         (txtdatanasc.getText()        );
        c.setNome             (txtnome.getText()            );
        c.setEndereco         (txtendereco.getText()        );
        c.setNumero           (txtnumero.getText()          );
        c.setBairro           (txtbairro.getText()          );
        c.setCidade           (txtcidade.getText()          );
        c.setUf               (txtuf.getText()              );
        c.setEmail            (txtemail.getText()           );
        c.setComplemento      (txtcomplemento.getText()     );
        c.setIerg             (txtierg.getText()            );
        c.setTipopessoa       (txttipopessoa.getText()      );
    
       
        
        
    

        
        clienteDAO bd = new clienteDAO();
        bd.adcionarCliente(c);
        limparCampos();
        
        botoes(true, false, false, false);
        txtnome.requestFocus();
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnvoltarActionPerformed

    private void txtiergActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiergActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiergActionPerformed

    private void btnconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultaActionPerformed
        // TODO add your handling code here:
        clienteDAO bd;
	Cliente c;

	List<Cliente> listaCliente;
	bd = new clienteDAO();
	c = new Cliente();
	listaCliente = bd.consultarClientePorNome(txtconsulta.getText());

	DefaultTableModel model = (DefaultTableModel)
	jTcliente.getModel();

	model.setNumRows(0);

	for( int itemLista = 0; itemLista < listaCliente.size(); itemLista++){
		c = listaCliente.get(itemLista);
		model.addRow(new Object[] { c.getCnpjcpf(), c.getNome(), c.getFone(), c.getUf() });
	}
    }//GEN-LAST:event_btnconsultaActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        // TODO add your handling code here:
        String sMensagem, sTitulo;
        int iResposta;
        sMensagem = "Deseja realmente excluir o cliente?";
        sTitulo = "Confirmação";
        iResposta = JOptionPane.showConfirmDialog(null, sMensagem, sTitulo, JOptionPane.YES_NO_OPTION);
        if(iResposta == JOptionPane.YES_OPTION){
            clienteDAO bd = new clienteDAO();
            bd.excluirCliente(txtcpfcnpj.getText());
        }
        botoes(true, false, false, true);
        limparCampos();
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void jTclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTclienteMouseClicked
        // TODO add your handling code here:
        String icnpjcpf;

        icnpjcpf = (String) jTcliente.getModel().getValueAt(jTcliente.getSelectedRow(),0);

        clienteDAO bd;

        bd = new clienteDAO();

        Cliente c;

        c = new Cliente();

        c = bd.procurarClienteporCodigo(icnpjcpf);

        carregarFormulario(c);

        botoes(false, false, true, true);

        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jTclienteMouseClicked

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        clienteDAO bd;
        Cliente c;
        c = new Cliente();
        c.setNome(txtnome.getText());
        c.setCnpjcpf(txtcpfcnpj.getText()); 
        c.setCelular1(Integer.parseInt(txtcelular1.getText()));
        c.setDddcel1(Integer.parseInt(txtdddc1.getText()));
        c.setFone(Integer.parseInt(txttelefone.getText()));
        c.setDddfone(Integer.parseInt(txttdddt1.getText())   );
        c.setCep(Integer.parseInt(txtcep.getText()));
        c.setDatanasc(txtdatanasc.getText());        
        c.setEndereco(txtendereco.getText());
        c.setNumero(txtnumero.getText());
        c.setBairro(txtbairro.getText());
        c.setCidade(txtcidade.getText());
        c.setUf(txtuf.getText());
        c.setEmail(txtemail.getText());
        c.setComplemento(txtcomplemento.getText());
        c.setIerg(txtierg.getText());
        c.setTipopessoa(txttipopessoa.getText());
        
        bd = new clienteDAO();
        bd.editarCliente(c);
        limparCampos();
        botoes(true, false,false,true);
    }//GEN-LAST:event_btneditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                }catch(Exception e){
                    
                }
                new CadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton btnadcionar;
    private javax.swing.JButton btnconsulta;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTcliente;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtcelular1;
    private javax.swing.JTextField txtcep;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JTextField txtcomplemento;
    private javax.swing.JTextField txtconsulta;
    private javax.swing.JTextField txtcpfcnpj;
    private javax.swing.JTextField txtdatanasc;
    private javax.swing.JTextField txtdddc1;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtierg;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txttdddt1;
    private javax.swing.JTextField txttelefone;
    private javax.swing.JTextField txttipopessoa;
    private javax.swing.JTextField txtuf;
    // End of variables declaration//GEN-END:variables
}
