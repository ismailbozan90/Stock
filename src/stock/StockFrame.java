package stock;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ismail
 */
public class StockFrame extends javax.swing.JFrame {
    DefaultTableModel model;
    public int selectedID;
    public ArrayList<Stock> cacheData;
    public String userName;

    public StockFrame() {
        initComponents();
        
        //
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblStock = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblProductCode = new javax.swing.JLabel();
        txtProductCode = new javax.swing.JTextField();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblStockCount = new javax.swing.JLabel();
        txtStockCount = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stok Takip Sistemi");
        setResizable(false);

        tblStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün Kodu", "Ürün İsmi", "Stok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStockMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStock);
        if (tblStock.getColumnModel().getColumnCount() > 0) {
            tblStock.getColumnModel().getColumn(0).setResizable(false);
            tblStock.getColumnModel().getColumn(1).setResizable(false);
            tblStock.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Ara :");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblProductCode.setText("Ürün Kodu :");

        lblProductName.setText("Ürün İsmi  :");

        lblStockCount.setText("Stok :");

        btnAdd.setText("Ekle");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnDelete.setText("Sil");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnUpdate.setText("Güncelle");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnLogOut.setText("Çıkış Yap");
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblProductName)
                                            .addComponent(lblStockCount))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtStockCount, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblProductCode)
                                            .addComponent(jLabel1))
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(6, 6, 6))
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnLogOut))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserName))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblUserName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductCode)
                            .addComponent(txtProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductName)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStockCount)
                            .addComponent(txtStockCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        clearData();
        String src = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblStock.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + src));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStockMouseClicked
        int index = tblStock.getSelectedRow();
        if (index >= 0) {
            txtProductCode.setText(tblStock.getValueAt(index, 0).toString());
            txtProductName.setText(tblStock.getValueAt(index, 1).toString());
            txtStockCount.setText(tblStock.getValueAt(index, 2).toString());
            
            for (Stock stock : cacheData) {
                if (stock.getProductCode() == tblStock.getValueAt(index, 0).toString() 
                        && stock.getProductName() == tblStock.getValueAt(index, 1).toString()){
                    selectedID = stock.getDataID();
                }
            }
        } else {
            txtProductCode.setText("");
            txtProductName.setText("");
            txtStockCount.setText("");
        }
    }//GEN-LAST:event_tblStockMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if (selectedID >= 0) {
            DbHelper dbHelper = new DbHelper();
            Connection connection = null;
            PreparedStatement statement = null;
            try {
                connection = dbHelper.getConnection();
                statement = connection.prepareStatement("DELETE FROM stock WHERE id = ?");
                statement.setInt(1, selectedID);
                if (statement.executeUpdate() == 1){
                    lblStatus.setText(selectedID + " ID'li öğe silindi!");
                    log("PRODUCT_DELETE", userName);
                }
            } catch (SQLException exception) {
                lblStatus.setText(selectedID + " ID'li öğe silinemedi! Hata :" + exception.getMessage());
                dbHelper.showErrorMessage(exception, "DeleteQuery");
            } finally {
                try {
                    statement.close();
                    connection.close();
                } catch (SQLException ex) {
                    //
                }
               getList();
               clearData();
            }
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        String productCode = txtProductCode.getText();
        String productName = txtProductName.getText();
        int productStockCount;
        
        try {
            productStockCount = Integer.parseInt(txtStockCount.getText());
        } catch (NumberFormatException exception) {
            lblStatus.setText("Geçersiz stok girişi.");
            return;
        }
        
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement("INSERT INTO stock (productCode, productName, stockCount) VALUES (?,?,?)");
            statement.setString(1, productCode);
            statement.setString(2, productName);
            statement.setInt(3, productStockCount);
            if (statement.executeUpdate() == 1){
                lblStatus.setText("Ürün Başarıyla Eklendi!");
                log("PRODUCT_ADD", userName);
            }
            
        } catch (SQLException exception) {
            lblStatus.setText("Ürün eklenemedi! Hata :" + exception.getMessage());
            dbHelper.showErrorMessage(exception, "AddQuery");
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException exception) {
                System.out.println(exception);
            }
            getList();
            clearData();
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        if (selectedID >= 0) {
            String productCode = txtProductCode.getText();
            String productName = txtProductName.getText();
            int productStockCount;

            try {
                productStockCount = Integer.parseInt(txtStockCount.getText());
            } catch (NumberFormatException exception) {
                lblStatus.setText("Geçersiz stok girişi.");
                return;
            }

            DbHelper dbHelper = new DbHelper();
            Connection connection = null;
            PreparedStatement statement = null;
            try {
                connection = dbHelper.getConnection();
                statement = connection.prepareStatement("UPDATE stock SET productCode = ?, productName = ?, stockCount = ? WHERE id = ?");
                statement.setString(1, productCode);
                statement.setString(2, productName);
                statement.setInt(3, productStockCount);
                statement.setInt(4, selectedID);
                if (statement.executeUpdate() == 1){
                    lblStatus.setText("Ürün Başarıyla Eklendi!");
                    log("PRODUCT_UPDATE", userName);
                }

            } catch (SQLException exception) {
                lblStatus.setText(selectedID + " ID'li öğe güncellenemedi! Hata :" + exception.getMessage());
                dbHelper.showErrorMessage(exception, "Update");
            } finally {
                try {
                    statement.close();
                    connection.close();
                } catch (SQLException exception) {
                    System.out.println(exception);
                }
                getList();
                clearData();
            }
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        clearData();
        model = (DefaultTableModel) tblStock.getModel();
        if (cacheData != null) {
            cacheData.removeAll(cacheData);
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
        }
        this.setVisible(false);
        LoginFrame loginScreen = new LoginFrame();
        loginScreen.setVisible(true);
        log("LOGOUT",userName);
    }//GEN-LAST:event_btnLogOutMouseClicked

    
    public void setUserName(String name) {
        userName = name;
        lblUserName.setText("Hoşgeldiniz, " + name);
    }
    
    public void clearData() {
        txtProductCode.setText("");
        txtProductName.setText("");
        txtStockCount.setText("");
        selectedID = -1;
    }
    
    public void getList() {
        model = (DefaultTableModel) tblStock.getModel();
        if (cacheData != null) {
            cacheData.removeAll(cacheData);
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
        }
        try {
            cacheData = loadData();
            for (Stock stock : cacheData) {
                Object[] row = { stock.getProductCode(), stock.getProductName(), stock.getStockCount() };
                model.addRow(row);
            }
        } catch (SQLException exception) {
           System.out.println(exception);
        }
    }
    
    public ArrayList<Stock> loadData() throws SQLException {
        ArrayList<Stock> list = new ArrayList();
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;
       
        try {
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement("SELECT * FROM stock ORDER BY id DESC");
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                list.add(new Stock(resultSet.getString("productCode"), resultSet.getString("productName"), resultSet.getInt("stockCount"), resultSet.getInt("id")));
            }
            log("PRODUCT_SELECT", userName);
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception, "loadData");
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException exception) {
                System.out.println(exception);
            }
        }
        return list;
    }
    
    public void log(String type, String user) {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement("INSERT INTO log (user, operation, time) VALUES (?,?,NOW())");
            statement.setString(1, user);
            statement.setString(2, type);
            statement.executeUpdate();
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception, "Log");
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException exception) {
                System.out.println(exception);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblProductCode;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStockCount;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblStock;
    private javax.swing.JTextField txtProductCode;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStockCount;
    // End of variables declaration//GEN-END:variables
}
