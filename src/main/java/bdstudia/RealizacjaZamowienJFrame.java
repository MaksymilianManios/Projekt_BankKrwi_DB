/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.Query;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


/**
 *
 * @author makma
 */
public class RealizacjaZamowienJFrame extends javax.swing.JFrame {

    private SessionFactory factory;
    private Zamowienie z;
    private Osoba o;
    private Produkt p;
    private GrupaKrwi g;
    private Realizacjazamowienia r;    
    private List<WynikZamowienia> wynik_zamowienia_list;
    private List<Realizacjazamowienia> realizacja_list;
     
    /**
     * Creates new form ZamowieniaJFrame
     */
    
    public RealizacjaZamowienJFrame(SessionFactory factory_ref) {
        this.factory = factory_ref;
        initComponents();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaZnalezionychZamowien = new javax.swing.JList<>();
        SzukajButton = new javax.swing.JButton();
        KryteriumCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        KryteriumET = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RIDZamowieniaLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RStatusLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RProduktLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RGrupaKrwiLabel = new javax.swing.JLabel();
        RIloscLabel = new javax.swing.JLabel();
        RDataZamowienia = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        OImieLabel = new javax.swing.JLabel();
        ONazwiskoLabel = new javax.swing.JLabel();
        OPeselLabel = new javax.swing.JLabel();
        OTelLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        OAdresLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaZnalezionychRealizacjiJList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaZnalezionychZamowien.setModel(new WynikZamowieniaListModel());
        ListaZnalezionychZamowien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ListaZnalezionychZamowien);

        SzukajButton.setText("Szukaj");
        SzukajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzukajZamowieniaBtnSzukajHandler(evt);
            }
        });

        KryteriumCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NR Zamowienia", "Imie", "Nazwisko", "Typ Produktu" }));
        KryteriumCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KryteriumCBActionPerformed(evt);
            }
        });

        jLabel2.setText("Kryterium :");

        KryteriumET.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KryteriumET.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KryteriumETKeyTyped(evt);
            }
        });

        jButton1.setText("Wybierz Zam�wienie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KryteriumCB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KryteriumET, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SzukajButton))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KryteriumCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(KryteriumET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SzukajButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Wyb�r Zamowienia", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Zamowienie nr :");

        RIDZamowieniaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RIDZamowieniaLabel.setText("Nie wybrano");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Status :");

        RStatusLabel.setText("Nie wybrano");

        jLabel5.setText("Produkt :");

        RProduktLabel.setText("Nie wybrano");

        jLabel7.setText("Grupa krwi :");

        jLabel8.setText("Liczba Dawek :");

        jLabel9.setText("Data z�o�enia ");

        jLabel10.setText("zam�wienia :");

        RGrupaKrwiLabel.setText("Nie wybrano");

        RIloscLabel.setText("Nie wybrano");

        RDataZamowienia.setText("Nie wybrano");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RIDZamowieniaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RProduktLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RGrupaKrwiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RIloscLabel)
                    .addComponent(RDataZamowienia, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RIDZamowieniaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RStatusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RProduktLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RGrupaKrwiLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(RIloscLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(RDataZamowienia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Imie :");

        jLabel6.setText("Nazwisko :");

        jLabel11.setText("PESEL:");

        jLabel12.setText("Tel.:");

        OImieLabel.setText("jLabel13");

        ONazwiskoLabel.setText("jLabel14");

        OPeselLabel.setText("jLabel15");

        OTelLabel.setText("jLabel16");

        jLabel13.setText(" Adres :");

        OAdresLabel.setText("jLabel14");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(OAdresLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ONazwiskoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(OPeselLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OTelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OImieLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(OImieLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ONazwiskoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(OPeselLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(OTelLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(OAdresLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Realizuj");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Szczeg�y Zam�wienia", jPanel3);

        ListaZnalezionychRealizacjiJList.setModel(new RealizacjazamowieniaListModel());
        jScrollPane2.setViewportView(ListaZnalezionychRealizacjiJList);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("O Realizacji", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SzukajZamowieniaBtnSzukajHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzukajZamowieniaBtnSzukajHandler
        InitList();
    }//GEN-LAST:event_SzukajZamowieniaBtnSzukajHandler

    private void KryteriumETKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KryteriumETKeyTyped
        char c = evt.getKeyChar();
        switch(KryteriumCB.getSelectedIndex()){
            case(0):
            {                
                if(!((c>='0') && (c<='9')))  evt.consume(); 
                break;
            }
            default:
            {               
                if(!(((c>=65)&&(c<=90)) || ((c>=97)&&(c<=122))))  evt.consume();                
            } 
        }
    }//GEN-LAST:event_KryteriumETKeyTyped

    private void KryteriumCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KryteriumCBActionPerformed
        KryteriumET.setText("");
    }//GEN-LAST:event_KryteriumCBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListaZnalezionychZamowien.getSelectedIndex();
        z = new Zamowienie();
        o = new Osoba();
        g = new GrupaKrwi();
        p = new Produkt();
        int id_zamowienia = ((WynikZamowieniaListModel)ListaZnalezionychZamowien.getModel()).getIdWynikuZamowienia(ListaZnalezionychZamowien.getSelectedIndex());
        Session sesja = factory.openSession();
        EntityManager em = factory.createEntityManager();
        try{
            z = em.createQuery("FROM zamowienia WHERE idzamowienia = :idzamowienia ", Zamowienie.class)
                    .setParameter("idzamowienia", id_zamowienia)
                    .getSingleResult();
            RIDZamowieniaLabel.setText(String.valueOf(z.getIdzamowienia()));
            RIloscLabel.setText(String.valueOf(z.getIlosc()));
            RDataZamowienia.setText(String.valueOf(z.getDatazamowienia()));
        }catch(NoResultException nre){
            JOptionPane.showMessageDialog(this, "nie znaleziono zamowienia",
                        "RealizacjaZamowien. B��d.", JOptionPane.WARNING_MESSAGE);
        }
        try{
            o = em.createQuery("FROM osoby WHERE idosoby = :idosoby ", Osoba.class)
                    .setParameter("idosoby", z.getIdosoby())
                    .getSingleResult();
            OImieLabel.setText(o.getImie());
            ONazwiskoLabel.setText(o.getNazwisko());
            OPeselLabel.setText(o.getPesel());
            OTelLabel.setText(o.getTelefon());
            OAdresLabel.setText(o.getAdres());
        }catch(NoResultException nre){
            JOptionPane.showMessageDialog(this, "nie znaleziono osoby",
                        "RealizacjaZamowien. B��d.", JOptionPane.WARNING_MESSAGE);
        }
        try{
            g = em.createQuery("FROM grupykrwi WHERE  idgrupykrwi = :idgrupykrwi ", GrupaKrwi.class)
                    .setParameter("idgrupykrwi", o.getIdgrupykrwi())
                    .getSingleResult();
            RGrupaKrwiLabel.setText(g.getRodzaj()+g.getWskaznikrh());
        }catch(NoResultException nre){
            JOptionPane.showMessageDialog(this, "nie znaleziono grupyKrwi",
                        "RealizacjaZamowien. B��d.", JOptionPane.WARNING_MESSAGE);
        }
        try{
            p = em.createQuery("FROM produkty WHERE  idproduktu = :idproduktu ", Produkt.class)
                    .setParameter("idproduktu", z.getIdproduktu())
                    .getSingleResult();
            RProduktLabel.setText(p.getTyp());
        }catch(NoResultException nre){
            JOptionPane.showMessageDialog(this, "nie znaleziono produktu",
                        "RealizacjaZamowien. B��d.", JOptionPane.WARNING_MESSAGE);
        }
        StanRealizacji();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void pokaz_formularz() {
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
            java.util.logging.Logger.getLogger(PobranieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PobranieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PobranieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PobranieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        RealizacjaZamowienJFrame t = this;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               t.setVisible(true);
            }
        });
    }
    public void InitList(){
        Session sesja = factory.openSession();
        EntityManager em = factory.createEntityManager();
        wynik_zamowienia_list = new ArrayList<WynikZamowienia>();
        switch(KryteriumCB.getSelectedIndex()){
            case(0): // IDzamowienia
            {
                List<Object[]> WynikiOBJ = em.createNativeQuery(
                    "SELECT OKZ.Imie, OKZ.Nazwisko, OKZ.Rodzaj, OKZ.WskaznikRh, p.Typ, OKZ.Ilosc, OKZ.DataZamowienia, OKZ.IDZamowienia "
                    + "FROM ( "
                        + "SELECT OK.Imie, OK.Nazwisko, OK.Rodzaj, OK.WskaznikRh , z.Ilosc, z.IDProduktu, z.DataZamowienia, z.IDZamowienia "
                        + "FROM ( "
                            + "SELECT o.IDOsoby, o.Imie, o.Nazwisko, k.Rodzaj, k.WskaznikRh "
                            + "FROM osoby o INNER JOIN grupykrwi k "
                            + "ON o.IDGrupyKrwi = k.IDGrupyKrwi "
                        + ") AS OK INNER JOIN zamowienia z "
                        + "ON OK.IDOsoby = z.IDOsoby "
                        + "WHERE z.IDZamowienia = "
                        + KryteriumET.getText()
                    + ") AS OKZ INNER JOIN produkty p "
                    + "ON OKZ.IDProduktu = p.IDProduktu"
                ).getResultList();    
                
                for(Object[] w : WynikiOBJ){        
                    WynikZamowienia WZ = new WynikZamowienia(w);
                    wynik_zamowienia_list.add(WZ);                                                            
                }
                break;
            }
            case(1): // Imie
            {
                List<Object[]> WynikiOBJ = em.createNativeQuery(
                    "SELECT OKZ.Imie, OKZ.Nazwisko, OKZ.Rodzaj, OKZ.WskaznikRh, p.Typ, OKZ.Ilosc, OKZ.DataZamowienia, OKZ.IDZamowienia "
                    + "FROM ( "
                        + "SELECT OK.Imie, OK.Nazwisko, OK.Rodzaj, OK.WskaznikRh , z.Ilosc, z.IDProduktu, z.DataZamowienia, z.IDZamowienia "
                        + "FROM ( "
                            + "SELECT o.IDOsoby, o.Imie, o.Nazwisko, k.Rodzaj, k.WskaznikRh "
                            + "FROM osoby o INNER JOIN grupykrwi k "
                            + "ON o.IDGrupyKrwi = k.IDGrupyKrwi "
                            + "WHERE o.Imie LIKE '%"
                            + KryteriumET.getText()
                            +"%' "
                        + ") AS OK INNER JOIN zamowienia z "
                        + "ON OK.IDOsoby = z.IDOsoby "                    
                    + ") AS OKZ INNER JOIN produkty p "
                    + "ON OKZ.IDProduktu = p.IDProduktu"
                )
                .getResultList();
                
                for(Object[] w : WynikiOBJ){        
                    WynikZamowienia WZ = new WynikZamowienia(w);
                    wynik_zamowienia_list.add(WZ);                                                            
                }
                break;
            }
            case(2): // Nazwisko
            {
                List<Object[]> WynikiOBJ = em.createNativeQuery(
                    "SELECT OKZ.Imie, OKZ.Nazwisko, OKZ.Rodzaj, OKZ.WskaznikRh, p.Typ, OKZ.Ilosc, OKZ.DataZamowienia, OKZ.IDZamowienia "
                    + "FROM ( "
                        + "SELECT OK.Imie, OK.Nazwisko, OK.Rodzaj, OK.WskaznikRh , z.Ilosc, z.IDProduktu, z.DataZamowienia, z.IDZamowienia "
                        + "FROM ( "
                            + "SELECT o.IDOsoby, o.Imie, o.Nazwisko, k.Rodzaj, k.WskaznikRh "
                            + "FROM osoby o INNER JOIN grupykrwi k "
                            + "ON o.IDGrupyKrwi = k.IDGrupyKrwi "
                            + "WHERE o.Nazwisko LIKE '%"
                            + KryteriumET.getText()
                            +"%' "
                        + ") AS OK INNER JOIN zamowienia z "
                        + "ON OK.IDOsoby = z.IDOsoby "                    
                    + ") AS OKZ INNER JOIN produkty p "
                    + "ON OKZ.IDProduktu = p.IDProduktu"
                )
                .getResultList();
                
                for(Object[] w : WynikiOBJ){        
                    WynikZamowienia WZ = new WynikZamowienia(w);
                    wynik_zamowienia_list.add(WZ);                                                            
                }
                break;
            }
            case(3): // TypProduktu
            {
                List<Object[]> WynikiOBJ = em.createNativeQuery(
                    "SELECT OKZ.Imie, OKZ.Nazwisko, OKZ.Rodzaj, OKZ.WskaznikRh, p.Typ, OKZ.Ilosc, OKZ.DataZamowienia, OKZ.IDZamowienia "
                    + "FROM ( "
                        + "SELECT OK.Imie, OK.Nazwisko, OK.Rodzaj, OK.WskaznikRh , z.Ilosc, z.IDProduktu, z.DataZamowienia, z.IDZamowienia "
                        + "FROM ( "
                            + "SELECT o.IDOsoby, o.Imie, o.Nazwisko, k.Rodzaj, k.WskaznikRh "
                            + "FROM osoby o INNER JOIN grupykrwi k "
                            + "ON o.IDGrupyKrwi = k.IDGrupyKrwi "                        
                        + ") AS OK INNER JOIN zamowienia z "
                        + "ON OK.IDOsoby = z.IDOsoby "                    
                    + ") AS OKZ INNER JOIN produkty p "
                    + "ON OKZ.IDProduktu = p.IDProduktu "
                    + "WHERE p.Typ LIKE '%"
                    + KryteriumET.getText()
                    +"%'"
                 )
                .getResultList();
                
                for(Object[] w : WynikiOBJ){        
                    WynikZamowienia WZ = new WynikZamowienia(w);
                    wynik_zamowienia_list.add(WZ);                                                            
                }
                break;
            }            
        }
        // 
        ((WynikZamowieniaListModel)
                ListaZnalezionychZamowien.getModel())
                .dodajZamowienia(wynik_zamowienia_list);
        
    }  
    public void StanRealizacji(){
        Session sesja = factory.openSession();
        EntityManager em = factory.createEntityManager();
        realizacja_list = new ArrayList<>();    
        realizacja_list = em.createNativeQuery(
            "SELECT * "
            + "FROM realizacjezamowien "
            + "WHERE IDZamowienia = " + z.getIdzamowienia()
        ).getResultList();
        if(realizacja_list.isEmpty()){
            RStatusLabel.setText("Nie Zrealizowane");
        }else if(!(realizacja_list.isEmpty()) && realizacja_list.size()<z.getIlosc()){
            RStatusLabel.setText("Cz�ciowo Zrealizowane");           
        }else if(realizacja_list.size()==z.getIlosc()){
            RStatusLabel.setText("Zrealizowane");
        }else{
            JOptionPane.showMessageDialog(this, " B��d StanRealizacji() !!! ");
        }        
        ((RealizacjazamowieniaListModel)
            ListaZnalezionychRealizacjiJList
            .getModel()).dodajRealizacjeZamowien(realizacja_list);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> KryteriumCB;
    private javax.swing.JTextField KryteriumET;
    private javax.swing.JList<String> ListaZnalezionychRealizacjiJList;
    private javax.swing.JList<String> ListaZnalezionychZamowien;
    private javax.swing.JLabel OAdresLabel;
    private javax.swing.JLabel OImieLabel;
    private javax.swing.JLabel ONazwiskoLabel;
    private javax.swing.JLabel OPeselLabel;
    private javax.swing.JLabel OTelLabel;
    private javax.swing.JLabel RDataZamowienia;
    private javax.swing.JLabel RGrupaKrwiLabel;
    private javax.swing.JLabel RIDZamowieniaLabel;
    private javax.swing.JLabel RIloscLabel;
    private javax.swing.JLabel RProduktLabel;
    private javax.swing.JLabel RStatusLabel;
    private javax.swing.JButton SzukajButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}