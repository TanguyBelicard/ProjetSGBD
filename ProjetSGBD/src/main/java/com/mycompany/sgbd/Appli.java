/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgbd;

import java.util.ArrayList;
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
    
    public Appli() {
        initComponents();
        this.memCache = new MemoireCache();
        setTitle("Base de donnée");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.lestables = new ArrayList<Table>();
        this.lestables.add(genereTable1());
        this.lestables.add(genereTable2());
        Table R = lestables.get(0);
        Table S = lestables.get(1);
        this.lestables.add(ProduitCartesien(R, "ville", S, "Ville"));
        
        this.lestables.add(genereTableR());
        this.lestables.add(genereTableS());
        this.lestables.add(ProduitCartesien(lestables.get(2), "ID", lestables.get(3),"ID"));
        
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
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
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        jLabel1.setText(""+jList1.getSelectedValue());
        genereTable(this.lestables, jList1.getSelectedValue());
    }//GEN-LAST:event_jList1ValueChanged

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

        List<String> attribut = new ArrayList<String>();
        attribut.add("id_etu");
        attribut.add("nom");
        attribut.add("ville");

        Table tableR = new Table("Etudiant", attribut);

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
    
    public Table genereTable2() {

        List<String> attribut = new ArrayList<String>();
        attribut.add("id_hab");
        attribut.add("nom");
        attribut.add("Prenom");
        attribut.add("Ville");
        attribut.add("age");

        Table tableR = new Table("Habitant", attribut);

        for (int i = 0; i < 10; i++) {
            List<String> l4 = new ArrayList<String>();
            l4.add("" + i);
            l4.add(generate(6));
            l4.add(generate(6));
            l4.add("Dijon");
            l4.add("" + ((int) (Math.random() * 100)));
            tableR.insertLigne(l4);
        }
        //System.out.println(tableR.toString());
        return tableR;

    }
    
    
    public Table genereTableR()
    {
        List<String> attribut = new ArrayList<String>();
        attribut.add("ID");
        attribut.add("Ville");
        
        Table tableR = new Table("TableR", attribut);
        
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
        
        System.out.println(tableR.toString());
        return tableR;
    }
    
    public Table genereTableS()
    {
        List<String> attribut = new ArrayList<String>();
        attribut.add("ID");
        attribut.add("Ville");
        
        Table tableS = new Table("TableS", attribut);
        
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
        
        System.out.println(tableS.toString());
        return tableS;
    }
    
    public static String generate(int length) {
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
            System.out.println(R.getAttribut().get(i));
        }
        for (int i = 0; i < S.getAttribut().size(); i++) {
            if (!(S.getAttribut().get(i).equals(b))) {
                attributNewTable.add(S.getAttribut().get(i));
                System.out.println(S.getAttribut().get(i));
            }
        }

        Table res = new Table("RES", attributNewTable);
        return res;
    }
    
    private Table ProduitCartesien(Table R, String a, Table S, String b) {

        Table res = genereTableJoin(R, a, S, b);
        String nomTable = "ResProduitCarth_" + R.getNom() + "_U_" + S.getNom() +"_sur_"+a;
        res.setNom(nomTable);
        int nbBlocksParBuffer = memCache.getBuffers().get(0).getCapacite();
        int nbBlocksPourBufferR = (memCache.getBuffers().get(0).getCapacite() * (memCache.getM() - 1));
        int nbLignePBlocsR = R.getBlocs().get(0).getNbLigneParBloc();
        int nbLignePBlocsS = S.getBlocs().get(0).getNbLigneParBloc();
        for (int i = 0; i < S.getBlocs().size(); i = i + nbBlocksParBuffer) {
            this.memCache.chargeDernierBuffer(S, i);
            for (int j = 0; j < R.getBlocs().size(); j = j + nbBlocksPourBufferR) {
                this.memCache.chargeBuffer(R, j);

                for (int buffR = 0; buffR < memCache.getM() - 1; buffR++) {
                    for (int blR = 0; blR < nbBlocksParBuffer; blR++) {
                        for (int liR = 0; liR < nbLignePBlocsR; liR++) {
                            System.out.println("[" + buffR + "][" + blR + "][+" + liR + "]");
                            for (int blS = 0; blS < nbBlocksParBuffer; blS++) {
                                for (int liS = 0; liS < nbLignePBlocsS; liS++) {
                                    /*System.out.println("[" + buffR + "][" + blR + "][+" + liR + "]");
                                    System.out.println("Union");
                                    System.out.println("[il est seul][" + blS + "][+" + liS + "]");*/
                                    Bloc lS = this.memCache.getBuffers().get(memCache.getM() - 1).getB().get(blS);/*.getLignes().get(liS);
                                   /* Ligne lR = this.memCache.getBuffers().get(buffR).getB().get(blR).getLignes().get(liR);
                                    System.out.println(lR.toString()+" U " +lS.toString());*/
                                    System.out.println(lS.toString());                                }
                            }
                        }

                    }
                }
            }
        }
        return res;
    }
    
    private void initJList()
    {
         for (int b = 0; b < lestables.size(); b++) 
            {
            def_jlist.addElement(lestables.get(b).getNom());
            }
         
    }
    
    public void genereTable(List<Table> lestables, String nom) {
        
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

                            donnees[numLigne][k] = aAffiche.getBlocs().get(i).getLignes().get(j).getAttribut().get(k);
                        }
                        numLigne++;
                    }
                }
            }
        }
        def_table = new DefaultTableModel(donnees, entetes);
        jTable1.setModel(def_table);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
