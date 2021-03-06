package Principal;

import Aeroporto.*;
import Voo.*;
import Lista.*;
import javax.swing.*;
import static javax.swing.JOptionPane.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * Esta classe representa um formulário de manutenção de aeroportos e de voos e de exibição.
 * 
 * @author Antônio Hideto Borges Kotsubo.
 * @author Nícolas Maisonnette Duarte.
 */
public class Principal extends javax.swing.JFrame 
{
    /**
     * Variável ListaDuplamenteLigadaOrdenadaSemRepeticao que indica a lista de aeroportos.
     */
    protected ListaDuplamenteLigadaOrdenadaSemRepeticao<Aeroporto> aeroportos;
    /**
     * Variável DefaultTableModel que indica um modelo da tabela de voos.
     */
    protected DefaultTableModel model;

    /**
     * Cria um novo formulário Principal.
     */
    public Principal()
    {
        aeroportos = new ListaDuplamenteLigadaOrdenadaSemRepeticao<>();
        
        carregarPadrao();
        
        initComponents();
        
        formatarTabela();
    }

    /**
     * Este método é chamado de dentro do construtor para inicializar o formulário.
     * ALERTA: Não modifique este código. O contéudo deste método é sempre gerado pelo Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnProcurarA = new javax.swing.JButton();
        btnIncluirA = new javax.swing.JButton();
        btnAlterarA = new javax.swing.JButton();
        btnExcluirA = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnProcurarV = new javax.swing.JButton();
        btnIncluirV = new javax.swing.JButton();
        btnAlterarV = new javax.swing.JButton();
        btnExcluirV = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtOrigem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        cbFiltro = new javax.swing.JComboBox<>();
        btnExibir = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ANAC - Organização da Malha Aérea");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jPanel3.setLayout(new java.awt.BorderLayout());

        btnProcurarA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnProcurarA.setText("Procurar");
        btnProcurarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarAActionPerformed(evt);
            }
        });
        jPanel5.add(btnProcurarA);

        btnIncluirA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIncluirA.setText("Incluir");
        btnIncluirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirAActionPerformed(evt);
            }
        });
        jPanel5.add(btnIncluirA);

        btnAlterarA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAlterarA.setText("Alterar");
        btnAlterarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAActionPerformed(evt);
            }
        });
        jPanel5.add(btnAlterarA);

        btnExcluirA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExcluirA.setText("Excluir");
        btnExcluirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAActionPerformed(evt);
            }
        });
        jPanel5.add(btnExcluirA);

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel6.setLayout(new java.awt.GridLayout(5, 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText(" Código");
        jPanel6.add(jLabel2);

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel6.add(txtCodigo);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText(" Cidade");
        jPanel6.add(jLabel3);

        txtCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel6.add(txtCidade);
        jPanel6.add(jPanel12);
        jPanel6.add(jPanel11);
        jPanel6.add(jPanel13);

        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Manutenção de Aeroportos", jPanel3);

        jPanel2.setLayout(new java.awt.BorderLayout());

        btnProcurarV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnProcurarV.setText("Procurar");
        btnProcurarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarVActionPerformed(evt);
            }
        });
        jPanel7.add(btnProcurarV);

        btnIncluirV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIncluirV.setText("Incluir");
        btnIncluirV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirVActionPerformed(evt);
            }
        });
        jPanel7.add(btnIncluirV);

        btnAlterarV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAlterarV.setText("Alterar");
        btnAlterarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVActionPerformed(evt);
            }
        });
        jPanel7.add(btnAlterarV);

        btnExcluirV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnExcluirV.setText("Excluir");
        btnExcluirV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVActionPerformed(evt);
            }
        });
        jPanel7.add(btnExcluirV);

        jPanel2.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setLayout(new java.awt.GridLayout(5, 2));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText(" Número");
        jPanel8.add(jLabel4);

        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel8.add(txtNumero);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText(" Aeroporto de Origem");
        jPanel8.add(jLabel5);

        txtOrigem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel8.add(txtOrigem);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText(" Aeroporto de Destino");
        jPanel8.add(jLabel6);

        txtDestino.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel8.add(txtDestino);
        jPanel8.add(jPanel14);

        jPanel2.add(jPanel8, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Manutenção de Voos", jPanel2);

        jPanel4.setLayout(new java.awt.BorderLayout());

        cbFiltro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS" }));
        jPanel9.add(cbFiltro);

        btnExibir.setText("Exibir");
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });
        jPanel9.add(btnExibir);

        jPanel4.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setLayout(new java.awt.BorderLayout());

        tblLista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Cidade de Destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLista.setDragEnabled(true);
        jScrollPane1.setViewportView(tblLista);

        jPanel10.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel10, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Listagem", jPanel4);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnProcurarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarAActionPerformed
        try
        {
            Aeroporto ret = null;
            for(int i = 0; i < aeroportos.getQtd(); i++)
            {
                ret = aeroportos.getDaPosicao(i);
                if(ret.getCodigo().equals(txtCodigo.getText().toUpperCase()))
                    break;
                
                ret = null;
            }
            
            txtCidade.setText(ret.getCidade());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Aeroporto não encontrado. Tente novamente!", "Erro!", ERROR_MESSAGE);
            txtCidade.setText("");
        }
    }//GEN-LAST:event_btnProcurarAActionPerformed

    private void btnIncluirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirAActionPerformed
        try
        {
            String codigo = txtCodigo.getText().toUpperCase();
            String cidade = txtCidade.getText();
            Aeroporto inc = null;
            
            for(int i = 0; i < aeroportos.getQtd(); i++)
            {
                inc = aeroportos.getDaPosicao(i);
                if(inc.getCodigo().equals(codigo))
                    throw new Exception("código já existente!");
            }
            
            //Aeroporto já possui validação
            inc = new Aeroporto(codigo, cidade, new ListaDuplamenteLigadaOrdenadaSemRepeticao<Voo>());
            
            aeroportos.insira(inc);
            JOptionPane.showMessageDialog(new JFrame(), "Aeroporto incluído com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Dados inválidos para inserção: " + ex.getMessage() + " Tente novamente!", "Erro!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIncluirAActionPerformed

    private void btnAlterarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAActionPerformed
        try
        {
            String codigo = txtCodigo.getText().toUpperCase();
            String cidade = txtCidade.getText();
            boolean tem = false;
            Aeroporto alt;
            Aeroporto backup = null;
            
            for(int i = 0; i < aeroportos.getQtd(); i++)
            {
                backup = aeroportos.getDaPosicao(i);
                if(backup.getCodigo().equals(codigo))
                {
                    tem = true;
                    break;
                }
            }
            
            if(!tem)
                throw new Exception("aeroporto inexistente!");   
            
            //Aeroporto já possui validação
            alt = new Aeroporto(codigo, cidade, backup.getVoos());
            aeroportos.remova(backup);
            aeroportos.insira(alt);
            
            JOptionPane.showMessageDialog(new JFrame(), "Aeroporto alterado com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Dados inválidos para alteração: " + ex.getMessage() + " Tente novamente!", "Erro!", ERROR_MESSAGE);
            txtCidade.setText("");
        }
    }//GEN-LAST:event_btnAlterarAActionPerformed
    
    private void btnExcluirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAActionPerformed
        try
        {
            String codigo = txtCodigo.getText().toUpperCase();
            boolean tem = false;
            Aeroporto del = null;
            
            for(int i = 0; i < aeroportos.getQtd(); i++)
            {
                del = aeroportos.getDaPosicao(i);
                if(del.getCodigo().equals(codigo))
                {
                    tem = true;
                    break;
                }
            }
            if(!tem)
                throw new Exception("aeroporto inexistente!");   
            
            int dialogResult = JOptionPane.showConfirmDialog (null, "Você tem certeza de que deseja excluir?", "Atenção", WARNING_MESSAGE);
            if(dialogResult != JOptionPane.YES_OPTION)
            {
                return;
            }
            aeroportos.remova(del);
            
            JOptionPane.showMessageDialog(new JFrame(), "Aeroporto removido com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
            txtCodigo.setText("");
            txtCidade.setText("");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Dados inválidos para deleção: " + ex.getMessage() + " Tente novamente!", "Erro!", ERROR_MESSAGE);
            txtCidade.setText("");
            txtCodigo.setText("");
        }
    }//GEN-LAST:event_btnExcluirAActionPerformed

    private void btnProcurarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarVActionPerformed
        try
        {
            Aeroporto retA = null;
            boolean achou = false;
            Voo retB = null;
            ListaDuplamenteLigadaOrdenadaSemRepeticao<Voo> voos;
            
            for(int i = 0; i < aeroportos.getQtd(); i++)
            {
                retA = aeroportos.getDaPosicao(i);
                voos = retA.getVoos();
                for(int j = 0; j < voos.getQtd(); j++)
                {
                    retB = voos.getDaPosicao(j);
                    if(retB.getNumero() == Integer.parseInt(txtNumero.getText()))
                    {
                        achou = true;
                        break;
                    }
                    
                    retB = null;
                }
                if(achou)
                    break;
                
                retA = null;
            }
            
            txtOrigem.setText(retA.getCodigo());
            txtDestino.setText(retB.getDestino());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Voo não encontrado. Verifique se o número é válido e tente novamente!", "Erro!", ERROR_MESSAGE);
            txtOrigem.setText("");
            txtDestino.setText("");
        }
    }//GEN-LAST:event_btnProcurarVActionPerformed

    private void btnIncluirVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirVActionPerformed
        try
        {
            Voo inc;
            Aeroporto aero = null;
            Aeroporto aeroO = null;
            ListaDuplamenteLigadaOrdenadaSemRepeticao<Voo> voos;
            
            boolean temOrigem = false;
            boolean temDestino = false;
            int numero = -1;
            String origem = txtOrigem.getText().toUpperCase();
            String destino = txtDestino.getText().toUpperCase();
            
            if(destino.equals(origem))
                throw new Exception("destino é o mesmo local da origem!");
            try
            {
                numero = Integer.parseInt(txtNumero.getText());
            }
            catch(Exception ex)
            {
                throw new Exception("número inválido!");
            }
            
            
            for(int i = 0; i < aeroportos.getQtd(); i++)
            {
                aero = aeroportos.getDaPosicao(i);
                voos = aero.getVoos();
                for(int j = 0; j < voos.getQtd(); j++)
                {
                    inc = voos.getDaPosicao(j);
                    if(inc.getNumero() == numero)
                        throw new Exception("o número já está sendo utilizado!");
                }
            }
            
            for(int i = 0; i < aeroportos.getQtd(); i++)
            {
                aero = aeroportos.getDaPosicao(i);
                if(aero.getCodigo().equals(origem))
                {
                    aeroO = aero;
                    temOrigem = true;
                }
                if(aero.getCodigo().equals(destino))
                    temDestino = true;
            }
            if(!temOrigem || !temDestino)
                throw new Exception("origem e/ou destino inválidos!");
            
            //Voo já possui validação
            inc = new Voo(numero, destino);
            
            voos = aeroO.getVoos();
            voos.insira(inc);
            aeroO.setVoos(voos);
            
            JOptionPane.showMessageDialog(new JFrame(), "Voo incluído com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Dados inválidos para inserção: " + ex.getMessage() + " Tente novamente!", "Erro!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIncluirVActionPerformed

    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed
        try
        {   
            limparTabela();
            
            ListaDuplamenteLigadaOrdenadaSemRepeticao<Voo> voos;
            String opcao = (String)cbFiltro.getSelectedItem();
            Aeroporto aero;
            Aeroporto aeroAux;
            Voo voo;
            
            if(opcao.toUpperCase().equals("TODOS"))
            {
                for(int i = 0; i < aeroportos.getQtd(); i++)
                {
                    aero = aeroportos.getDaPosicao(i);
                    voos = aero.getVoos();
                    
                    for(int j = 0; j < voos.getQtd(); j++)
                    {
                        voo = voos.getDaPosicao(j);
                        
                        aeroAux = getDestinoVoo(voo);
          
                        model.addRow(new String[]{voo.getNumero()+"", aeroAux.getCidade()});
                    }
                }
            }
            else
            {
                for(int i = 0; i < aeroportos.getQtd(); i++)
                {
                    aero = aeroportos.getDaPosicao(i);
                    
                    if(opcao.equals(aero.getCodigo()))
                    {
                        voos = aero.getVoos();
                        
                        for(int j = 0; j < voos.getQtd(); j++)
                        {
                            voo = voos.getDaPosicao(j);
                            
                            aeroAux = getDestinoVoo(voo); 
                                                              
                            model.addRow(new String[]{voo.getNumero()+"", aeroAux.getCidade()});
                        }
                        break;
                    }
                }
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(new JFrame(), ex.getMessage() + " Tente novamente!", "Erro!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExibirActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
        try
        {
            cbFiltro.removeAllItems();
            
            carregarFiltro();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(new JFrame(), ex.getMessage() + " Tente novamente!", "Erro!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void btnAlterarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVActionPerformed
        try
        {
            Voo inc = null;
            Aeroporto aero = null;
            Aeroporto aero2 = null;
            Aeroporto aeroO = null;
            ListaDuplamenteLigadaOrdenadaSemRepeticao<Voo> voosO;
            ListaDuplamenteLigadaOrdenadaSemRepeticao<Voo> voosD;
            
            boolean temOrigem = false;
            boolean temDestino = false;
            boolean temNumero = false;
            int numero = -1;
            String origem = txtOrigem.getText().toUpperCase();
            String destino = txtDestino.getText().toUpperCase();
            
            if(destino.equals(origem))
                throw new Exception("destino é o mesmo local da origem!");
            try
            {
                numero = Integer.parseInt(txtNumero.getText());
            }
            catch(Exception ex)
            {
                throw new Exception("número em formato inválido!");
            }
            
            
            for(int i = 0; i < aeroportos.getQtd(); i++)
            {
                aero = aeroportos.getDaPosicao(i);
                voosD = aero.getVoos();
                for(int j = 0; j < voosD.getQtd(); j++)
                {
                    inc = voosD.getDaPosicao(j);
                    if(inc.getNumero() == numero)
                    {
                        temNumero = true;
                        break;
                    }
                }
                if(temNumero)
                    break;
            }
            if(!temNumero)
                throw new Exception("número inválido!");
            
            for(int i = 0; i < aeroportos.getQtd(); i++)
            {
                aero2 = aeroportos.getDaPosicao(i);
                if(aero2.getCodigo().equals(origem))
                {
                    aeroO = aero2;
                    temOrigem = true;
                }
                if(aero2.getCodigo().equals(destino))
                    temDestino = true;
            }
            if(!temOrigem || !temDestino)
                throw new Exception("origem e/ou destino inválidos!");
            
            
            voosO = aeroO.getVoos();
            voosD = aero.getVoos();
            voosD.remova(inc);
            
            //Voo já possui validação
            inc = new Voo(numero, destino);
            
            voosO.insira(inc);
            aeroO.setVoos(voosO);
            
            JOptionPane.showMessageDialog(new JFrame(), "Voo alterado com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Dados inválidos para alteração: " + ex.getMessage() + " Tente novamente!", "Erro!", ERROR_MESSAGE);
            txtOrigem.setText("");
            txtDestino.setText("");
        }
    }//GEN-LAST:event_btnAlterarVActionPerformed

    private void btnExcluirVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVActionPerformed
        try
        {
            int numero = -1;
            boolean temNumero = false;
            Voo inc = null;
            Aeroporto aero;
            ListaDuplamenteLigadaOrdenadaSemRepeticao<Voo> voos = null;
            
            try
            {
                numero = Integer.parseInt(txtNumero.getText());
            }
            catch(Exception ex)
            {
                throw new Exception("número em formato inválido!");
            }
            
            
            for(int i = 0; i < aeroportos.getQtd(); i++)
            {
                aero = aeroportos.getDaPosicao(i);
                voos = aero.getVoos();
                for(int j = 0; j < voos.getQtd(); j++)
                {
                    inc = voos.getDaPosicao(j);
                    if(inc.getNumero() == numero)
                    {
                        temNumero = true;
                        break;
                    }
                }
                if(temNumero)
                    break;
            }
            if(!temNumero)
                throw new Exception("número inválido!");   
            
            int dialogResult = JOptionPane.showConfirmDialog (null, "Você tem certeza de que deseja excluir?", "Atenção", WARNING_MESSAGE);
            if(dialogResult != JOptionPane.YES_OPTION)
            {
                return;
            }
            voos.remova(inc);
            
            JOptionPane.showMessageDialog(new JFrame(), "Voo removido com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
            txtOrigem.setText("");
            txtDestino.setText("");
            txtNumero.setText("");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Dados inválidos para deleção: " + ex.getMessage() + " Tente novamente!", "Erro!", ERROR_MESSAGE);
            txtOrigem.setText("");
            txtDestino.setText("");
            txtNumero.setText("");
        }
    }//GEN-LAST:event_btnExcluirVActionPerformed

    /**
     * Este método realiza o carregamento da lista de filtros.
     * 
     * @throws Exception se ocorrer erro ao adicionar um item ao filtro.
     */
    protected void carregarFiltro() throws Exception
    {
        Aeroporto aero = null;
        
        cbFiltro.addItem("TODOS");
        
        for(int i = 0; i < aeroportos.getQtd(); i++)
        {
            aero = aeroportos.getDaPosicao(i);
            cbFiltro.addItem(aero.getCodigo());
        }   
    }
    
    /**
     * Este método realiza a busca do aeroporto de destino de um voo.
     * 
     * @param voo Representa o voo cujo aeroporto de destino se deseja coletar.
     * @throws Exception Se ocorrer erro ao buscar o aeroporto de destino de um voo.
     * @return o aeroporto de destino.
     */
    protected Aeroporto getDestinoVoo(Voo voo) throws Exception
    {
        Aeroporto ret = null;
        Aeroporto aero;
        
        for(int i = 0; i < aeroportos.getQtd(); i++)
        {
            aero = aeroportos.getDaPosicao(i);
                    
            if(voo.getDestino().equals(aero.getCodigo()))
            {
                ret = aero;
                break;
            }
        }
        return ret;
    }
    
    /**
     * Este método realiza a formatação da tabela de voos.
     * 
     * 
     */
    protected void formatarTabela()
    {
        model = (DefaultTableModel)tblLista.getModel();
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.LEFT );
        tblLista.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        
        tblLista.getColumnModel().getColumn(0).setResizable(false);
    }

    /**
     * Este método realiza o carregamento das informações padrão nos vetores de aeroportos e de voos.
     * 
     * 
     */
    protected void carregarPadrao() 
    {
        try
        {
            ListaDuplamenteLigadaOrdenadaSemRepeticao<Voo> voos = new ListaDuplamenteLigadaOrdenadaSemRepeticao<>();
            voos.insira(new Voo(107, "SSA"));

            Aeroporto bsb = new Aeroporto("BSB", "Brasília", voos);

            voos = new ListaDuplamenteLigadaOrdenadaSemRepeticao<>();
            voos.insira(new Voo(214, "SSA"));
            voos.insira(new Voo(555, "GIG"));
            voos.insira(new Voo(101, "GRU"));

            Aeroporto cnf = new Aeroporto("CNF", "Belo Horizonte", voos);

            voos = new ListaDuplamenteLigadaOrdenadaSemRepeticao<>();
            voos.insira(new Voo(554, "CNF"));
            voos.insira(new Voo(90, "GRU"));

            Aeroporto gig = new Aeroporto("GIG", "Rio de Janeiro", voos);

            voos = new ListaDuplamenteLigadaOrdenadaSemRepeticao<>();
            voos.insira(new Voo(50, "BSB"));
            voos.insira(new Voo(89, "GIG"));
            voos.insira(new Voo(102, "CNF"));

            Aeroporto gru = new Aeroporto("GRU", "São Paulo", voos);

            voos = new ListaDuplamenteLigadaOrdenadaSemRepeticao<>();
            voos.insira(new Voo(215, "CNF"));

            Aeroporto ssa = new Aeroporto("SSA", "Salvador", voos);

            voos = null;

            aeroportos.insira(bsb);
            aeroportos.insira(cnf);
            aeroportos.insira(gig);
            aeroportos.insira(gru);
            aeroportos.insira(ssa);
            }
        catch(Exception erro)
        {
            // não vai dar erro
        }
    }
    
    /**
     * Este método realiza a limpeza dos dados da tabela de voos.
     * 
     * 
     */
    protected void limparTabela()
    {
        int qtdLinhas = tblLista.getRowCount();
        
        for(int i = 0; i < qtdLinhas; i++)
        {
            model.removeRow(0);
        }
    }
    
    /**
     * Main da classe.
     * 
     * @param args os argumentos da linha de comando.
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarA;
    private javax.swing.JButton btnAlterarV;
    private javax.swing.JButton btnExcluirA;
    private javax.swing.JButton btnExcluirV;
    private javax.swing.JButton btnExibir;
    private javax.swing.JButton btnIncluirA;
    private javax.swing.JButton btnIncluirV;
    private javax.swing.JButton btnProcurarA;
    private javax.swing.JButton btnProcurarV;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtOrigem;
    // End of variables declaration//GEN-END:variables
}
