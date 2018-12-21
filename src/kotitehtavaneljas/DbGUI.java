package kotitehtavaneljas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DbGUI extends javax.swing.JFrame {

    public DbGUI() {
        initComponents();
        showOlut();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBeerDialog = new javax.swing.JDialog();
        titleLabel = new javax.swing.JLabel();
        beerNameLabel = new javax.swing.JLabel();
        beerTypeLabel = new javax.swing.JLabel();
        beerManufacturerLabel = new javax.swing.JLabel();
        beerCountryLabel = new javax.swing.JLabel();
        beerNameTextField = new javax.swing.JTextField();
        beerTypeTextField = new javax.swing.JTextField();
        beerManufacturerTextField = new javax.swing.JTextField();
        beerCountryTextField = new javax.swing.JTextField();
        insertBeerToDBButton = new javax.swing.JButton();
        emptyFieldsButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        addBeerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        beerTable = new javax.swing.JTable();

        addBeerDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addBeerDialog.setTitle("Lisää olut!");
        addBeerDialog.setLocationByPlatform(true);
        addBeerDialog.setMinimumSize(new java.awt.Dimension(380, 360));
        addBeerDialog.setPreferredSize(new java.awt.Dimension(0, 0));
        addBeerDialog.setSize(new java.awt.Dimension(0, 0));

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titleLabel.setText("Oluttietokannan hallinta");

        beerNameLabel.setText("Oluen nimi:");

        beerTypeLabel.setText("Oluen tyyppi:");

        beerManufacturerLabel.setText("Valmistaja:");

        beerCountryLabel.setText("Valmistusmaa:");

        insertBeerToDBButton.setText("Lisää olut tietokantaan");
        insertBeerToDBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBeerToDBButtonActionPerformed(evt);
            }
        });

        emptyFieldsButton.setText("Tyhjennä");
        emptyFieldsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyFieldsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addBeerDialogLayout = new javax.swing.GroupLayout(addBeerDialog.getContentPane());
        addBeerDialog.getContentPane().setLayout(addBeerDialogLayout);
        addBeerDialogLayout.setHorizontalGroup(
            addBeerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBeerDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addBeerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addBeerDialogLayout.createSequentialGroup()
                        .addGroup(addBeerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(beerNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(beerTypeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(beerManufacturerLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(beerCountryLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addBeerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beerTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beerManufacturerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beerCountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addBeerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(emptyFieldsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(insertBeerToDBButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        addBeerDialogLayout.setVerticalGroup(
            addBeerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBeerDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(addBeerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beerNameLabel)
                    .addComponent(beerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBeerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beerTypeLabel)
                    .addComponent(beerTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBeerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beerManufacturerLabel)
                    .addComponent(beerManufacturerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBeerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beerCountryLabel)
                    .addComponent(beerCountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(insertBeerToDBButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emptyFieldsButton)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Olutta!");

        addBeerButton.setText("Lisää olut!");
        addBeerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBeerButtonActionPerformed(evt);
            }
        });

        beerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nimi", "Tyyppi", "Valmistaja", "Maa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(beerTable);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(addBeerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(addBeerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertBeerToDBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBeerToDBButtonActionPerformed
        saveBeer();
    }//GEN-LAST:event_insertBeerToDBButtonActionPerformed

    private void emptyFieldsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyFieldsButtonActionPerformed
        emptyBeerText();
    }//GEN-LAST:event_emptyFieldsButtonActionPerformed

    private void addBeerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBeerButtonActionPerformed
        addBeerDialog.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_addBeerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DbGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DbGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DbGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DbGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DbGUI().setVisible(true);
            }
        });
    }
    
    public ArrayList<Olut> olutList() {
        ArrayList<Olut> olutList = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/olut_db?useTimezone=true&serverTimezone=UTC","root","");
            System.out.println("Connection success!");
            
            String query = "SELECT * FROM oluet";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Olut olut;
            
            while (rs.next()) {
                olut = new Olut(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                olutList.add(olut);
            }
            con.close();
            
        } catch (Exception e){
            System.out.println("Tapahtui virhe!");
            System.out.println(e);
        }
        
        return olutList;
    }
    
    public void showOlut() {
        ArrayList<Olut> list = olutList();
        DefaultTableModel model = (DefaultTableModel)beerTable.getModel();
        Object[] row = new Object[4];
        for (int i=0; i < list.size(); i++) {
            row[0] = list.get(i).getNimi();
            row[1] = list.get(i).getTyyppi();
            row[2] = list.get(i).getValmistaja();
            row[3] = list.get(i).getMaa();
            model.addRow(row);
        }
    }
    
    public void saveBeer() {
        String nimi = beerNameTextField.getText();
        String tyyppi = beerTypeTextField.getText();
        String valmistaja = beerManufacturerTextField.getText();
        String maa = beerCountryTextField.getText();

        Olut olut = new Olut(nimi, tyyppi, valmistaja, maa);
        olut.insertBeerIntoDB();
        DefaultTableModel model = (DefaultTableModel)beerTable.getModel();
        Object[] row = new Object[4];
        
        row[0] = olut.getNimi();
        row[1] = olut.getTyyppi();
        row[2] = olut.getValmistaja();
        row[3] = olut.getMaa();
            
        model.addRow(row);
        
        JOptionPane.showMessageDialog(this, "Olut tallennettu!");
        
        addBeerDialog.dispose();
    }
    
    public void emptyBeerText() {
        beerNameTextField.setText("");
        beerTypeTextField.setText("");
        beerManufacturerTextField.setText("");
        beerCountryTextField.setText("");
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBeerButton;
    private javax.swing.JDialog addBeerDialog;
    private javax.swing.JLabel beerCountryLabel;
    private javax.swing.JTextField beerCountryTextField;
    private javax.swing.JLabel beerManufacturerLabel;
    private javax.swing.JTextField beerManufacturerTextField;
    private javax.swing.JLabel beerNameLabel;
    private javax.swing.JTextField beerNameTextField;
    private javax.swing.JTable beerTable;
    private javax.swing.JLabel beerTypeLabel;
    private javax.swing.JTextField beerTypeTextField;
    private javax.swing.JButton emptyFieldsButton;
    private javax.swing.JButton insertBeerToDBButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
