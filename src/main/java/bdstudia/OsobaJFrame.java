/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

import java.awt.event.KeyEvent;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author makma
 */
public class OsobaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form OsobaJFrame
     */
    SessionFactory sf_ref;
    private Osoba nowaosoba;
    private BankKrwiApp parent;
    
    public void setParent(BankKrwiApp bkp) {
        parent = bkp;
    }
    
    public OsobaJFrame(SessionFactory sf,Osoba o){
        this.sf_ref = sf;
        initComponents();
        nowaosoba = o;
        init();
        
    }
    public OsobaJFrame(SessionFactory sf) {
        this.sf_ref = sf;
        initComponents();
    }
    private void init(){
        IDEditText.setText(String.valueOf( nowaosoba.getIdosoby()));
        PeselEditText.setText( nowaosoba.getPesel());
        ImieEditText.setText( nowaosoba.getImie());
        NazwiskoEditText.setText( nowaosoba.getNazwisko());
        AdresEditText.setText( nowaosoba.getAdres());
        TelefonEditText.setText( nowaosoba.getTelefon());
        GrupaKrwiComboBox.setSelectedIndex( nowaosoba.getIdgrupykrwi()-1);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IDEditText = new javax.swing.JTextField();
        ImieEditText = new javax.swing.JTextField();
        NazwiskoEditText = new javax.swing.JTextField();
        PeselEditText = new javax.swing.JTextField();
        AdresEditText = new javax.swing.JTextField();
        TelefonEditText = new javax.swing.JTextField();
        ZatwierdzButton = new javax.swing.JButton();
        SprawdButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        GrupaKrwiComboBox = new javax.swing.JComboBox<>();
        EdytujButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DODAWANIE OSOBY");

        jLabel1.setText("IdOsoby :");

        jLabel2.setText("Imie :");

        jLabel3.setText("Nazwisko :");

        jLabel4.setText("PESEL :");

        jLabel5.setText("Adres :");

        jLabel6.setText("Telefon :");

        IDEditText.setEditable(false);
        IDEditText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ImieEditText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ImieEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImieEditTextKeyTyped(evt);
            }
        });

        NazwiskoEditText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NazwiskoEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NazwiskoEditTextKeyTyped(evt);
            }
        });

        PeselEditText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PeselEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PeselEditTextKeyTyped(evt);
            }
        });

        AdresEditText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AdresEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AdresEditTextKeyTyped(evt);
            }
        });

        TelefonEditText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TelefonEditText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonEditTextKeyTyped(evt);
            }
        });

        ZatwierdzButton.setText("Zatwierd?");
        ZatwierdzButton.setEnabled(false);
        ZatwierdzButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZatwierdzButtonActionPerformed(evt);
            }
        });

        SprawdButton.setText("Sprawdz");
        SprawdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SprawdButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Grupa krwi :");

        GrupaKrwiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 Rh+", "0 Rh-", "A Rh+", "A Rh-", "B Rh+", "B Rh-", "AB Rh+", "AB Rh-" }));
        GrupaKrwiComboBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        EdytujButton.setText("Edytuj");
        EdytujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdytujButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SprawdButton)
                        .addGap(40, 40, 40)
                        .addComponent(EdytujButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ZatwierdzButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GrupaKrwiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(AdresEditText, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addComponent(PeselEditText)
                                .addComponent(NazwiskoEditText)
                                .addComponent(ImieEditText)
                                .addComponent(IDEditText)
                                .addComponent(TelefonEditText)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IDEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ImieEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NazwiskoEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PeselEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AdresEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TelefonEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GrupaKrwiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZatwierdzButton)
                    .addComponent(SprawdButton)
                    .addComponent(EdytujButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SprawdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SprawdButtonActionPerformed
        if  (!((ImieEditText.getText().isEmpty()) 
            || (NazwiskoEditText.getText().isEmpty())
            || (PeselEditText.getText().isEmpty())
            || (AdresEditText.getText().isEmpty())
            || (TelefonEditText.getText().isEmpty())
            
            ))
        {
            if  ((  PeselEditText.getText().length() == 11) && (TelefonEditText.getText().length() == 9))
            {
                ImieEditText.setEditable(false);
                NazwiskoEditText.setEditable(false);
                AdresEditText.setEditable(false);
                TelefonEditText.setEditable(false);
                PeselEditText.setEditable(false);
                GrupaKrwiComboBox.setEnabled(false);
                ZatwierdzButton.setEnabled(true);
            }            
        }
    }//GEN-LAST:event_SprawdButtonActionPerformed

    private void ImieEditTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImieEditTextKeyTyped
        char c = evt.getKeyChar();
        if(NazwiskoEditText.getText().length() > 255) evt.consume();
        if( Character.isDigit(evt.getKeyChar()) || !Character.isAlphabetic(evt.getKeyChar())
                && !(c == ' ' || c == '-' || c =='\'')) {
            evt.consume();
        }
    }//GEN-LAST:event_ImieEditTextKeyTyped

    private void NazwiskoEditTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NazwiskoEditTextKeyTyped
        char c = evt.getKeyChar();
        if(NazwiskoEditText.getText().length() > 255) evt.consume();
        if( Character.isDigit(evt.getKeyChar()) || !Character.isAlphabetic(evt.getKeyChar())
                && !(c == ' ' || c == '-' || c =='\'')) {
            evt.consume();
        }
          
    }//GEN-LAST:event_NazwiskoEditTextKeyTyped

    private void PeselEditTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PeselEditTextKeyTyped
        if(!Character.isDigit(evt.getKeyChar())
                || PeselEditText.getText().length() >= 11){
            evt.consume();
            
        }
    }//GEN-LAST:event_PeselEditTextKeyTyped

    private void AdresEditTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdresEditTextKeyTyped
        char c = evt.getKeyChar();
        if(! ( Character.isAlphabetic(c)
                || Character.isDigit(c)
                || (c == ' ') || c == '-' || c=='_' || c=='/' || c==','
                )) {            
            evt.consume();
        }
        if(AdresEditText.getText().length() > 255) evt.consume();
    }//GEN-LAST:event_AdresEditTextKeyTyped

    private void TelefonEditTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonEditTextKeyTyped
        if(!Character.isDigit(evt.getKeyChar())
                || TelefonEditText.getText().length() >= 9 ) {
            evt.consume();
        }
    }//GEN-LAST:event_TelefonEditTextKeyTyped

    private void ZatwierdzButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZatwierdzButtonActionPerformed
        System.out.println("Tu trafi?em EEEEE");
        if(!IDEditText.getText().isEmpty()){                                        // dla osoby istniejacej w bazie danych    
            System.out.println("Tu trafi?em EEEEE2");
            initOsoba();
            Session sesja = sf_ref.openSession();
            EntityManager em = sf_ref.createEntityManager();
            try{
                sesja.beginTransaction();
                sesja.update(nowaosoba);
                sesja.getTransaction().commit();
                sesja.close();
                JOptionPane.showMessageDialog(this, "Pomy?lnie zmieniono dane osoby w bazie.",
                        "Update osoby. Info.", JOptionPane.INFORMATION_MESSAGE);
            }catch(java.lang.IllegalStateException ise){
            JOptionPane.showMessageDialog(this, "DEBUG IllegalStateException in OsobaJFrame.");
            } finally {
                em.close();
            }          
        }else{                                                                  // dla nowej osoby kt?rej nie ma w bazie danych
            System.out.println("Tu trafi?em EEEEE");
            this.nowaosoba = new Osoba();
            initOsoba();
            if(!CzyIstnieje()){
                Session sesja = sf_ref.openSession();
                EntityManager em = sf_ref.createEntityManager();
                try{
                    sesja.beginTransaction();
                    sesja.save(nowaosoba);
                    sesja.getTransaction().commit();
                    sesja.close();
                    JOptionPane.showMessageDialog(this, "Pomy?lnie dodano osobe do bazy.",
                            "Dodawanie osoby. Info.", JOptionPane.INFORMATION_MESSAGE);
                    LOCK_WINDOW();
                }catch(java.lang.IllegalStateException ise){
                JOptionPane.showMessageDialog(this, "DEBUG IllegalStateException in OsobaJFrame.");
                } finally {
                    em.close();
                }
            }
        }
    }//GEN-LAST:event_ZatwierdzButtonActionPerformed

    private void EdytujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdytujButtonActionPerformed
        
        ImieEditText.setEditable(true);
        NazwiskoEditText.setEditable(true);
        AdresEditText.setEditable(true);
        TelefonEditText.setEditable(true);
        PeselEditText.setEditable(true);
        GrupaKrwiComboBox.setEnabled(true);
        ZatwierdzButton.setEnabled(false);
    }//GEN-LAST:event_EdytujButtonActionPerformed

    public void showEditForm() {
        this.setTitle("EDYTOWANIE OSOBY");
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
            java.util.logging.Logger.getLogger(OsobaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OsobaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OsobaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OsobaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        OsobaJFrame t = this;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                t.setVisible(true);
            }
        });
    }
    
    public void showAddForm() {
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
            java.util.logging.Logger.getLogger(OsobaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OsobaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OsobaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OsobaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        OsobaJFrame t = this;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                t.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdresEditText;
    private javax.swing.JButton EdytujButton;
    private javax.swing.JComboBox<String> GrupaKrwiComboBox;
    private javax.swing.JTextField IDEditText;
    private javax.swing.JTextField ImieEditText;
    private javax.swing.JTextField NazwiskoEditText;
    private javax.swing.JTextField PeselEditText;
    private javax.swing.JButton SprawdButton;
    private javax.swing.JTextField TelefonEditText;
    private javax.swing.JButton ZatwierdzButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
    private Date PeselToDate(){        
        Integer rok = Integer.valueOf(PeselEditText.getText().substring(0,2));
        Integer miesiac;
        if(Integer.valueOf(PeselEditText.getText().substring(2,4))> 12){                        
            if(Integer.valueOf(PeselEditText.getText().substring(2,4))> 32){
                miesiac = Integer.valueOf(PeselEditText.getText().substring(2,4)) - 20;
                if(Integer.valueOf(PeselEditText.getText().substring(2,4))> 92){
                    
                }else{
                    miesiac = Integer.valueOf(PeselEditText.getText().substring(2,4)) - 80;
                    rok+=1800;
                }
            }else{
                miesiac = Integer.valueOf(PeselEditText.getText().substring(2,4)) - 20;
                rok+=2000;
            }
        }else{
            miesiac = Integer.valueOf(PeselEditText.getText().substring(2,4));
            rok += 1900;
        }
        Integer dzien = 1;
        if( (Integer.valueOf(PeselEditText.getText().substring(4,6)) < 32) && (Integer.valueOf(PeselEditText.getText().substring(4,6)) > 0) ){
            dzien = Integer.valueOf(PeselEditText.getText().substring(4,6));
        }
        Date data = new Date(rok-1900,miesiac-1,dzien);
        return data;
    }    
    private int CraftGrupaKrwi(){
        return GrupaKrwiComboBox.getSelectedIndex() + 1;        
    }    
    public Osoba getOsoba(){
        return this.nowaosoba;
    }    
    public void initOsoba(){
        this.nowaosoba.setPesel(PeselEditText.getText());
        this.nowaosoba.setImie(ImieEditText.getText());
        this.nowaosoba.setNazwisko(NazwiskoEditText.getText());
        this.nowaosoba.setAdres(AdresEditText.getText());
        this.nowaosoba.setTelefon(TelefonEditText.getText());
        this.nowaosoba.setIdgrupykrwi(CraftGrupaKrwi());
        this.nowaosoba.setDataurodzenia(PeselToDate());
        try {
            parent.updateOsoba(nowaosoba);
        } catch(NullPointerException npe) {}
    }
    public boolean CzyIstnieje(){
       Session sesja = sf_ref.openSession();
       EntityManager em = sf_ref.createEntityManager();
       try{
            Osoba osoba_wynik = em.createQuery("from osoby where pesel = :pesel ", Osoba.class)
                        .setParameter("pesel", nowaosoba.getPesel())
                        .getSingleResult();
            JOptionPane.showMessageDialog(this, "osoba o tym peselu juz istnieje, popraw dane lub zamknij okno formularza",
                        "osoba formularz. B??d.", JOptionPane.WARNING_MESSAGE);
            em.close(); 
            return true;
       }catch(NoResultException nre) {
            em.close();  
            return false;
       }         
   }
    public void LOCK_WINDOW(){
        ImieEditText.setEditable(false);
        NazwiskoEditText.setEditable(false);
        AdresEditText.setEditable(false);
        TelefonEditText.setEditable(false);
        PeselEditText.setEditable(false);
        GrupaKrwiComboBox.setEnabled(false);
        ZatwierdzButton.setEnabled(false);
        SprawdButton.setEnabled(false);
        EdytujButton.setEnabled(false);
       
   }
}
