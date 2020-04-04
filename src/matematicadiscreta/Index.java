
package matematicadiscreta;

import Classes.Conjunto;
import java.util.ArrayList;

/**
 *
 * @author Ana Carolina Marinho
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    ArrayList<Conjunto> Conjuntos = new ArrayList();
    public Index() {
        initComponents();
        
    }

    public void Cbx(){
        for(Conjunto conj:Conjuntos ){
            cbxConjuntos.addItem(conj.getNome());
            cbxConjuntos1.addItem(conj.getNome());
            cbxConjuntos2.addItem(conj.getNome());
            cbxConjuntos3.addItem(conj.getNome()); 
            cbxConjuntos5.addItem(conj.getNome()); 
        }
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JBcriar = new javax.swing.JButton();
        JBatualizarCBox = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfElemento = new javax.swing.JTextField();
        cbxConjuntos = new javax.swing.JComboBox<>();
        JBinserirElementos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfSaida = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        cbxConjuntos3 = new javax.swing.JComboBox<>();
        cbxConjuntos1 = new javax.swing.JComboBox<>();
        tfOperacao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JBpertinencia = new javax.swing.JButton();
        JBcontinencia = new javax.swing.JButton();
        cbxConjuntos2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JBprodutoCartesiano = new javax.swing.JButton();
        JBsubconjProprio = new javax.swing.JButton();
        JBuniao = new javax.swing.JButton();
        JBinterseccao = new javax.swing.JButton();
        JBcomplemento = new javax.swing.JButton();
        JBdiferenca = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JBconjDasPartes = new javax.swing.JButton();
        JBimprimir = new javax.swing.JButton();
        cbxConjuntos5 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Criar Conjunto : "));

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do Conjunto");

        JBcriar.setText("Criar ");
        JBcriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcriarActionPerformed(evt);
            }
        });

        JBatualizarCBox.setText("Atualizar Cbbox");
        JBatualizarCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBatualizarCBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBatualizarCBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBcriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBcriar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBatualizarCBox)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 280, 130));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserir Elementos no Conjunto : "));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(tfElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, -1));

        jPanel2.add(cbxConjuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, -1));

        JBinserirElementos.setText("Inserir  ");
        JBinserirElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBinserirElementosActionPerformed(evt);
            }
        });
        jPanel2.add(JBinserirElementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 130, -1));

        jLabel2.setText("Selecionar Conjunto");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 140, -1));

        jLabel3.setText("Elemento");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 73, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 350, 130));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados :"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfSaida.setColumns(20);
        tfSaida.setRows(5);
        jScrollPane1.setViewportView(tfSaida);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 120));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 380, 160));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Operações"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.add(cbxConjuntos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 90, -1));

        jPanel4.add(cbxConjuntos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 100, -1));
        jPanel4.add(tfOperacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 90, -1));

        jLabel4.setText("Digite um Elemento:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 20));

        jLabel6.setText("Conjunto 2: ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        JBpertinencia.setText("Pertence");
        JBpertinencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpertinenciaActionPerformed(evt);
            }
        });
        jPanel4.add(JBpertinencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 100, 40));

        JBcontinencia.setText("Contém");
        JBcontinencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcontinenciaActionPerformed(evt);
            }
        });
        jPanel4.add(JBcontinencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, -1));

        jPanel4.add(cbxConjuntos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 100, -1));

        jLabel7.setText("Conjunto 1: ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 80, -1));

        jLabel8.setText("Conjunto :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 80, 20));

        JBprodutoCartesiano.setText("Produto Cartesiano");
        JBprodutoCartesiano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBprodutoCartesianoActionPerformed(evt);
            }
        });
        jPanel4.add(JBprodutoCartesiano, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 150, -1));

        JBsubconjProprio.setText("Subconjunto próprio");
        JBsubconjProprio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsubconjProprioActionPerformed(evt);
            }
        });
        jPanel4.add(JBsubconjProprio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 160, -1));

        JBuniao.setText("União");
        JBuniao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBuniaoActionPerformed(evt);
            }
        });
        jPanel4.add(JBuniao, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        JBinterseccao.setText("Intersecção");
        JBinterseccao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBinterseccaoActionPerformed(evt);
            }
        });
        jPanel4.add(JBinterseccao, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        JBcomplemento.setText("Complemento");
        jPanel4.add(JBcomplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        JBdiferenca.setText("Diferença");
        JBdiferenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBdiferencaActionPerformed(evt);
            }
        });
        jPanel4.add(JBdiferenca, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        jLabel9.setText("Verificar a Existencia de um Elemento em Determinado Conjunto:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel10.setText("Operações entre conjuntos:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        JBconjDasPartes.setText("Conjunto das Partes");
        JBconjDasPartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBconjDasPartesActionPerformed(evt);
            }
        });
        jPanel4.add(JBconjDasPartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 640, 250));

        JBimprimir.setText("Imprimir");
        JBimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBimprimirActionPerformed(evt);
            }
        });
        getContentPane().add(JBimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 120, -1));

        getContentPane().add(cbxConjuntos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 120, 30));

        jLabel5.setText("Escolha um Conjunto:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 130, -1));

        jLabel11.setText("Imprimir um Determinado Conjunto:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBcriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcriarActionPerformed
        Conjunto Conj = new Conjunto(tfNome.getText());
        Conjuntos.add(Conj);
    
    }//GEN-LAST:event_JBcriarActionPerformed

    private void JBinserirElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBinserirElementosActionPerformed
           for(Conjunto conj:Conjuntos ){
               if(cbxConjuntos.getSelectedItem().equals(conj.getNome())){
                   conj.inserir(tfElemento.getText());
               }
           }
    }//GEN-LAST:event_JBinserirElementosActionPerformed

    private void JBimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBimprimirActionPerformed
            for(Conjunto conj:Conjuntos ){
               if(cbxConjuntos1.getSelectedItem().equals(conj.getNome())){
                   tfSaida.setText(conj.imprimir());
               }
           }
    }//GEN-LAST:event_JBimprimirActionPerformed

    private void JBatualizarCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBatualizarCBoxActionPerformed
        cbxConjuntos.removeAll();
        cbxConjuntos1.removeAll(); 
        cbxConjuntos2.removeAll();
        cbxConjuntos3.removeAll();
        cbxConjuntos5.removeAll();
        Cbx();
    }//GEN-LAST:event_JBatualizarCBoxActionPerformed

    private void JBpertinenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpertinenciaActionPerformed
       
        for(Conjunto conj:Conjuntos ){
               if(cbxConjuntos3.getSelectedItem().equals(conj.getNome())){
                   String elemento = tfOperacao.getText();
                   if (conj.pertence(tfOperacao.getText()).equals(true)){    
                       tfSaida.setText(elemento + " ∈ "+ conj.getNome());
                   }
                   else{
                        tfSaida.setText(elemento + " ∉ "+ conj.getNome());
                   }
                  
               }
           }
    }//GEN-LAST:event_JBpertinenciaActionPerformed

    private void JBcontinenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcontinenciaActionPerformed
        Conjunto conj1 = null;
        Conjunto conj2 = null;
        
        for(Conjunto conj:Conjuntos ){
            if(cbxConjuntos1.getSelectedItem().equals(conj.getNome())){
                conj1 = conj;
            }
            if(cbxConjuntos2.getSelectedItem().equals(conj.getNome())){
                conj2 = conj;
            } 
          }
        if(conj1.contem(conj2.getElementos()).equals(true)){
            tfSaida.setText(conj1.getNome()+ " ⊂ " +conj2.getNome());
        }
        else{
            tfSaida.setText(conj1.getNome()+ " ⊄ " +conj2.getNome());
        }    
    }//GEN-LAST:event_JBcontinenciaActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void JBprodutoCartesianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBprodutoCartesianoActionPerformed
        Conjunto conj1 = null;
        Conjunto conj2 = null;
        
        
        for(Conjunto conj:Conjuntos ){
            if(cbxConjuntos1.getSelectedItem().equals(conj.getNome())){
                conj1 = conj;
            }
            if(cbxConjuntos2.getSelectedItem().equals(conj.getNome())){
                conj2 = conj;
            } 
          }    
        ArrayList<String> result = conj1.ProdutoCartesiano(conj2.getElementos());
        tfSaida.append(result.toString()); 
    }//GEN-LAST:event_JBprodutoCartesianoActionPerformed

    private void JBsubconjProprioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsubconjProprioActionPerformed
            for(Conjunto conj:Conjuntos ){
               if(cbxConjuntos1.getSelectedItem().equals(conj.getNome())){
                  
                   } 
               } 
    }//GEN-LAST:event_JBsubconjProprioActionPerformed

    private void JBconjDasPartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBconjDasPartesActionPerformed
       for(Conjunto conj:Conjuntos ){
               if(cbxConjuntos1.getSelectedItem().equals(conj.getNome())){ 
                        ArrayList<String> result = conj.ConjuntoDasPartes();  
                        tfSaida.append("P(" + conj.getNome() + ") = {∅ " + result.toString()+ "}"); 
               } 
        } 
    }//GEN-LAST:event_JBconjDasPartesActionPerformed

    private void JBuniaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBuniaoActionPerformed
          
    }//GEN-LAST:event_JBuniaoActionPerformed

    private void JBdiferencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBdiferencaActionPerformed
        Conjunto conj1 = null;
        Conjunto conj2 = null;
        
        
        for(Conjunto conj:Conjuntos ){
            if(cbxConjuntos1.getSelectedItem().equals(conj.getNome())){
                conj1 = conj;
            }
            if(cbxConjuntos2.getSelectedItem().equals(conj.getNome())){
                conj2 = conj;
            } 
          }    
        ArrayList<String> result = conj1.Diferenca(conj2.getElementos());
        tfSaida.append(result.toString()); 
    }//GEN-LAST:event_JBdiferencaActionPerformed

    private void JBinterseccaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBinterseccaoActionPerformed
        Conjunto conj1 = null;
        Conjunto conj2 = null;
        
        //A : 1,2,3
        //B: 2,3
        // 2,3
        for(Conjunto conj:Conjuntos ){
            if(cbxConjuntos1.getSelectedItem().equals(conj.getNome())){
                conj1 = conj;
            }
            if(cbxConjuntos2.getSelectedItem().equals(conj.getNome())){
                conj2 = conj;
            } 
          }    
        ArrayList<String> result = conj1.Interseccao(conj2.getElementos(), Universo() );
        tfSaida.append(result.toString()); 
    }//GEN-LAST:event_JBinterseccaoActionPerformed
    public ArrayList Universo(){ 
        ArrayList<String> Universo = new ArrayList();
        for(Conjunto conj : Conjuntos){ 
            for(Object i :  conj.getElementos() ){
                Universo.add(i.toString());
            }
        }
        return Universo;
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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBatualizarCBox;
    private javax.swing.JButton JBcomplemento;
    private javax.swing.JButton JBconjDasPartes;
    private javax.swing.JButton JBcontinencia;
    private javax.swing.JButton JBcriar;
    private javax.swing.JButton JBdiferenca;
    private javax.swing.JButton JBimprimir;
    private javax.swing.JButton JBinserirElementos;
    private javax.swing.JButton JBinterseccao;
    private javax.swing.JButton JBpertinencia;
    private javax.swing.JButton JBprodutoCartesiano;
    private javax.swing.JButton JBsubconjProprio;
    private javax.swing.JButton JBuniao;
    private javax.swing.JComboBox<String> cbxConjuntos;
    private javax.swing.JComboBox<String> cbxConjuntos1;
    private javax.swing.JComboBox<String> cbxConjuntos2;
    private javax.swing.JComboBox<String> cbxConjuntos3;
    private javax.swing.JComboBox<String> cbxConjuntos5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfElemento;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfOperacao;
    private javax.swing.JTextArea tfSaida;
    // End of variables declaration//GEN-END:variables
}
