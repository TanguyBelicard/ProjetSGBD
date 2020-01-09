/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgbd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Appli extends javax.swing.JFrame {

    private List<Table> lestables;
    private MemoireCache memCache;
    private DefaultListModel def_jlist = new DefaultListModel();
    private DefaultTableModel def_table = new DefaultTableModel();
    private int cout_bloc;
    
    public Appli() {
        initComponents();
        this.memCache = new MemoireCache();
        
        setTitle("Base de donnée");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.lestables = new ArrayList<Table>();
        this.lestables.add(genereTable1());
        this.lestables.add(genereTable2());
        
        this.lestables.add(genereTableR());
        this.lestables.add(genereTableS());                
        //System.out.println(lestables.get(2).toString());
        //System.out.println(lestables.get(3).toString());
        
        //this.lestables.add(ProduitCart(lestables.get(0), "Ville",lestables.get(1), "Ville"));       
        //this.lestables.add(ProduitCart(lestables.get(2), "Ville",lestables.get(3), "Ville"));
        
        this.lestables.add(genereTableR_IndexVille());
        this.lestables.add(genereTableS_IndexVille());
        //System.out.println(lestables.get(4).toString());
        //System.out.println(lestables.get(5).toString());
        
        //this.lestables.add(genereTable1Index());
        //this.lestables.add(genereTable2Index());
        //System.out.println(lestables.get(6).toString());
        //System.out.println(lestables.get(7).toString());
        
        
        //TEST
        //attention : le premier paramètre doit être la table avec l'index
        //this.lestables.add(keyLookup(lestables.get(4), "Ville", lestables.get(5), "Ville" )); //-> fonctionne
        
        //this.lestables.add(keyLookup(lestables.get(6), "Ville", lestables.get(7), "Ville" ));
        System.out.println("\n \n --------------");
        //System.out.println(lestables.get(8));
        
        System.out.println(ProduitCart(lestables.get(0), "Ville",lestables.get(1), "Ville"));
        
        
        initJList();
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        BTN_produitcart = new javax.swing.JButton();
        LBL_selection = new javax.swing.JLabel();
        LBL_cout = new javax.swing.JLabel();
        BTN_key = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Table sélectionnée :");

        jLabel2.setText("Liste des tables :");

        jList1.setModel(def_jlist);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        BTN_produitcart.setText("ProduitCart() sur Ville");
        BTN_produitcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_produitcartActionPerformed(evt);
            }
        });

        LBL_selection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_selection.setText("Veuillez sélectionner deux tables dans la liste");

        LBL_cout.setText("Coût (Nombre de blocs lus) =");

        BTN_key.setText("KeyLookup() sur Ville");
        BTN_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_keyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LBL_cout, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(BTN_produitcart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LBL_selection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_key, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_selection)
                    .addComponent(LBL_cout))
                .addGap(1, 1, 1)
                .addComponent(BTN_produitcart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_key)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        jLabel1.setText(""+jList1.getSelectedValue());
        genereTables(this.lestables, jList1.getSelectedValue());
    }//GEN-LAST:event_jList1ValueChanged

    private void BTN_produitcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_produitcartActionPerformed
        List<Integer> items = new ArrayList<Integer>();
        if(jList1.getSelectedIndices().length == 2)
        {
            items.add(jList1.getSelectedIndices()[0]);
            items.add(jList1.getSelectedIndices()[1]);
            this.lestables.add(ProduitCart(lestables.get(items.get(0)), "Ville",lestables.get(items.get(1)), "Ville"));            
            this.LBL_selection.setText(lestables.get(items.get(0)).getNom()+" X "+lestables.get(items.get(1)).getNom());
            initJList();
            
            this.LBL_cout.setText("Coût (Nombre de blocs lus) = "+this.cout_bloc);
        }
        else
            this.LBL_selection.setText("Il n'y a pas 2 tables selectionnées !");
    }//GEN-LAST:event_BTN_produitcartActionPerformed

    private void BTN_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_keyActionPerformed
        List<Integer> items = new ArrayList<Integer>();
        if(jList1.getSelectedIndices().length == 2)
        {
            items.add(jList1.getSelectedIndices()[0]);
            items.add(jList1.getSelectedIndices()[1]);
            this.lestables.add(keyLookup(lestables.get(items.get(0)), "Ville",lestables.get(items.get(1)), "Ville"));            
            this.LBL_selection.setText(lestables.get(items.get(0)).getNom()+" KeyLookup "+lestables.get(items.get(1)).getNom());
            initJList();
            
            this.LBL_cout.setText("Coût (Nombre de blocs lus) = "+this.cout_bloc);
        }
        else
            this.LBL_selection.setText("Il n'y a pas 2 tables selectionnées ou la 1ère table ne possède pas d'index");
    }//GEN-LAST:event_BTN_keyActionPerformed

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
            java.util.logging.Logger.getLogger(Appli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appli().setVisible(true);
            }
        });
    }
    
    
    public Table genereTable1() {

        List<String> attributs = new ArrayList<String>();
        attributs.add("id_etu");
        attributs.add("nom");
        attributs.add("Ville");

        Table tableR = new Table("Etudiant", attributs);

        List<String> l1 = new ArrayList<>();
        l1.add("12");
        l1.add("Francois");
        l1.add("Dijon");
        tableR.insertLigne(l1);
        List<String> l2 = new ArrayList<>();
        l2.add("13");
        l2.add("Tanguy");
        l2.add("Macon");
        tableR.insertLigne(l2);
        List<String> l3 = new ArrayList<String>();
        l3.add("14");
        l3.add("Xavier");
        l3.add("Besancon");
        tableR.insertLigne(l3);
        for (int i = 0; i < 10; i++) {
            List<String> l4 = new ArrayList<String>();
            l4.add("" + (i + 20));
            l4.add(generate(6));
            l4.add("Dijon");
            tableR.insertLigne(l4);
        }
        //System.out.println(tableR.toString());
        return tableR;

    }
    
    public Table genereTable1Index()
    {
        Table res = genereTable1();
        res.remplirIndex(2); //2 -> Ville
        res.setNom("Etudiant(Ville)");        
        return res;
    }
    
    public Table genereTable2Index()
    {
        Table res = genereTable2();
        res.remplirIndex(2); // 3 -> Ville
        res.setNom("Habitant(Ville)");        
        return res;
    }
    
    public Table genereTable2() {

        List<String> attributs = new ArrayList<String>();
        attributs.add("id_hab");
        attributs.add("nom");
        attributs.add("Ville");


        Table tableR = new Table("Habitant", attributs);

        for (int i = 0; i < 10; i++) {
            List<String> l4 = new ArrayList<String>();
            l4.add("" + i);
            l4.add(generate(6));
            l4.add("Dijon");

            tableR.insertLigne(l4);
        }
        
        List<String> l = new ArrayList<String>();
        l.add("13");
        l.add("JILEAU");
        l.add("Macon");

        tableR.insertLigne(l);
        
        return tableR;

    }
    
    
    public Table genereTableR()
    {
        List<String> attributs = new ArrayList<String>();
        attributs.add("ID");
        attributs.add("Ville");
        
        Table tableR = new Table("TableR", attributs);
        
        List<String> l1 = new ArrayList<>();
        l1.add("12");
        l1.add("Dijon");
        tableR.insertLigne(l1);
        
        List<String> l2 = new ArrayList<>();
        l2.add("13");
        l2.add("Macon");
        tableR.insertLigne(l2);
        
        List<String> l3 = new ArrayList<String>();
        l3.add("14");
        l3.add("Besancon");
        tableR.insertLigne(l3);
        
        //System.out.println(tableR.toString());
        return tableR;
    }
    
    public Table genereTableS()
    {
        List<String> attributs = new ArrayList<String>();
        attributs.add("ID");
        attributs.add("Ville");
        
        Table tableS = new Table("TableS", attributs);
        
        List<String> l1 = new ArrayList<>();
        l1.add("15");
        l1.add("Macon");
        tableS.insertLigne(l1);
        
        List<String> l2 = new ArrayList<>();
        l2.add("16");
        l2.add("Macon");
        tableS.insertLigne(l2);
        
        List<String> l3 = new ArrayList<String>();
        l3.add("17");
        l3.add("Dijon");
        tableS.insertLigne(l3);
        
        //System.out.println(tableS.toString());
        return tableS;
    }
    
    public Table genereTableR_IndexVille()
    {
        Table res = genereTableR();
        res.remplirIndex(1); // 1 -> ville
        res.setNom("R(Ville)");
        return res;
    }
    
    public Table genereTableS_IndexVille()
    {
        Table res = genereTableS(); 
        res.remplirIndex(1); // 1 -> ville 
        res.setNom("S(Ville)");        
        return res;
    }
    
    public String generate(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuffer pass = new StringBuffer();
        for (int x = 0; x < length; x++) {
            int i = (int) Math.floor(Math.random() * (chars.length() - 1));
            pass.append(chars.charAt(i));
        }
        return pass.toString();
    }
    
    
    private Table genereTableJoin(Table R, String a, Table S, String b) {
        List<String> attributNewTable = new ArrayList<String>();
        for (int i = 0; i < R.getAttribut().size(); i++) {
            attributNewTable.add(R.getAttribut().get(i));
            if(R.getAttribut().get(i).equals(a))
            {
                this.memCache.pos_attr_jointR = i;
                //R.remplirIndex(i); //si jointure avec index
                System.out.println("Jointure : pos_attr_jointR="+i);
            }
        }
        for (int i = 0; i < S.getAttribut().size(); i++) {
            if (!(S.getAttribut().get(i).equals(b))) {
                attributNewTable.add(S.getAttribut().get(i));
            }
            else
            {
                this.memCache.pos_attr_jointS = i;
                System.out.println("Jointure : pos_attr_jointS="+i);
            }
        }

        Table res = new Table("res", attributNewTable);
        return res;
    }
    
    public void initCurseurRetS()
    {
        memCache.indiceR = 0;
        memCache.indiceS = 0;
    }
    

    
    
    
    private Table ProduitCart(Table R, String a, Table S, String b)
    {
        Table res = genereTableJoin(R, a, S, b);
        String nomTable = "ResProduitCart_" + R.getNom() + "_U_" + S.getNom() +"_sur_"+a;
        System.out.println(nomTable+"\n");
        res.setNom(nomTable);
        memCache.tableCache = res;        
        initCurseurRetS();
        this.cout_bloc = 0;
        
        do
        {
            memCache.getBufferS().getB().clear(); // flush du bufferS
            memCache.chargeDernierBuffer(S); //charge du bufferS

            do
            {
                memCache.getBuffersR().clear(); //flush des buffersR
                memCache.chargeBuffer(R); // charge des buffersR
                //methode parcours buff
                memCache.parcoursMem();
                System.out.println(memCache.toString());
                this.cout_bloc+=memCache.Cout();
            }while(!memCache.getBuffersR().isEmpty());
            
        }while (!memCache.getBufferS().getB().isEmpty() );
        
        //memCache.getBufferS().getB().add(new Bloc()); // init 
        
        return memCache.tableCache;
    }
    
    
    //attention : le premier paramètre doit être la table avec l'index
    // si 2 tables avec index passées en paramètre alors le keylookup 
    //se fait seulement sur le 1 ere argument
    private Table keyLookup(Table R, String a, Table S, String b)
    {
        Table res = genereTableJoin(R, a, S, b);
        String nomTable = "keyLookup" + R.getNom() + "_U_" + S.getNom() +"_sur_"+a;
        System.out.println(nomTable+"\n");
        res.setNom(nomTable);
        R.remplirIndex(IndiceJointure(R,a));
        memCache.tableCache = res;        
        initCurseurRetS();
        this.cout_bloc = 0;
        
        do
        {
            memCache.getBufferS().getB().clear(); // flush du bufferS
            memCache.chargeDernierBuffer(S); //charge du bufferS

            do
            {
                memCache.getBuffersR().clear(); //flush des buffersR
                System.out.println("INDEX : \n"+R.getIndext().getIndex().toString());
                memCache.chargeBufferKeylook(R); // charge des buffersR
                //methode parcours buff
                memCache.parcoursMem();
                System.out.println(memCache.toString());
                this.cout_bloc+=memCache.Cout();
            }while(!R.getIndext().getIndex().isEmpty() || !memCache.getBuffersR().isEmpty() ); //|| 
            
        }while (!memCache.getBufferS().getB().isEmpty() );
        
        
        return memCache.tableCache;
    }
    
    private void initJList()
    {
        def_jlist.clear();
        for (int b = 0; b < lestables.size(); b++) 
            {
            def_jlist.addElement(lestables.get(b).getNom());
            }
        
        this.jList1.setSelectedIndex(0);
    }
    
    public void genereTables(List<Table> lestables, String nom) {
        
        Table aAffiche;
        String[] entetes={};
        String[][] donnees={};
        for (int a = 0; a < lestables.size(); a++) {
            if (lestables.get(a).getNom().equals(nom)) {
                aAffiche = lestables.get(a);
                List<String> t1attrib = aAffiche.getAttribut();
                entetes = new String[t1attrib.size()];
                for (int i = 0; i < t1attrib.size(); i++) {
                    entetes[i] = t1attrib.get(i);
                }
                donnees = new String[aAffiche.count()][t1attrib.size()];
                int numLigne = 0;
                for (int i = 0; i < aAffiche.getBlocs().size(); i++) {
                    for (int j = 0; j < aAffiche.getBlocs().get(i).getLignes().size(); j++) {
                        for (int k = 0; k < t1attrib.size(); k++) {

                            donnees[numLigne][k] = aAffiche.getBlocs().get(i).getLignes().get(j).getAttributs().get(k);
                        }
                        numLigne++;
                    }
                }
            }
        }
        def_table = new DefaultTableModel(donnees, entetes);
        jTable1.setModel(def_table);
    }
    
    public int IndiceJointure(Table R, String s)
    {
        for(int i=0; i< R.getAttribut().size();i++)
        {
            if(R.getAttribut().get(i) == s)
            {
                return i;
            }
        }
        return 1;
    }
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_key;
    private javax.swing.JButton BTN_produitcart;
    private javax.swing.JLabel LBL_cout;
    private javax.swing.JLabel LBL_selection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
