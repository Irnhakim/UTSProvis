
package UTS;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;

/**
 *
 * @author ryusaga
 */
public class Utama extends javax.swing.JFrame {


    public Utama() {
        initComponents();
    }

    private String formatRupiah(int angka) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        return kursIndonesia.format(angka);
    }

    private String formatRupiahh(double angka) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        return kursIndonesia.format(angka);
    }

    private double hitungbiaya(boolean pemesanan, double totalHarga) {
        double biaya = 0;
        if (pemesanan) {
            biaya = totalHarga * 5 / 100;

        }
        return biaya;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        dHasil = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblJumlahPahaAtas = new javax.swing.JLabel();
        lblTotalPahaAtas = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblJumlahPahaBawah = new javax.swing.JLabel();
        lblJumlahSayap = new javax.swing.JLabel();
        lblJumlahAti = new javax.swing.JLabel();
        lblTotalPahaBawah = new javax.swing.JLabel();
        lblTotalSayap = new javax.swing.JLabel();
        lblTotalAti = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblPotPA = new javax.swing.JLabel();
        lblPotPB = new javax.swing.JLabel();
        lblPotSayap = new javax.swing.JLabel();
        lblPotAti = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lblBiayaPesanan = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lblPajak = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lblTotalBayar = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblJumlahPot = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        cbPahaAtas = new javax.swing.JCheckBox();
        cbPahaBawah = new javax.swing.JCheckBox();
        cbSayap = new javax.swing.JCheckBox();
        cbAti = new javax.swing.JCheckBox();
        spPahaAtas = new javax.swing.JSpinner();
        spPahaBawah = new javax.swing.JSpinner();
        spAti = new javax.swing.JSpinner();
        spSayap = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        rbLangsung = new javax.swing.JRadioButton();
        rbPemesanan = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        dHasil.setTitle("Hasil Perhitungan");
        dHasil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dHasil.setMinimumSize(new java.awt.Dimension(310, 599));

        jLabel6.setText("DIKERJAKAN OLEH");

        jLabel7.setText("NIM");

        jLabel8.setText("NAMA");

        jLabel9.setText("SEMESTER");

        jLabel10.setText("KELAS");

        jLabel11.setText(":");

        jLabel12.setText(":");

        jLabel13.setText(":");

        jLabel14.setText(":");

        jLabel15.setText("10120143");

        jLabel16.setText("IHSAN RAMADHAN NUL HAKIM");

        jLabel17.setText("4");

        jLabel18.setText("IF-4");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setText("Nama Pembeli");

        jLabel21.setText("Paha Atas");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel23.setText("Jumlah");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setText("Jenis");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel22.setText("Total");

        lblJumlahPahaAtas.setText("Jumlah");
        lblJumlahPahaAtas.setToolTipText("");

        lblTotalPahaAtas.setText("Total");

        jLabel26.setText("Paha Bawah");

        jLabel27.setText("Sayap");

        jLabel28.setText("Ati Ampela");

        lblJumlahPahaBawah.setText("Jumlah");
        lblJumlahPahaBawah.setToolTipText("");

        lblJumlahSayap.setText("Jumlah");
        lblJumlahSayap.setToolTipText("");

        lblJumlahAti.setText("Jumlah");
        lblJumlahAti.setToolTipText("");

        lblTotalPahaBawah.setText("Total");

        lblTotalSayap.setText("Total");

        lblTotalAti.setText("Total");

        lblNama.setText("namadisini");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel36.setText("Subtotal");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel37.setText("Potongan");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel38.setText("Jenis");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel24.setText("Potongan");

        jLabel25.setText("Paha Atas");

        jLabel29.setText("Paha Bawah");

        jLabel31.setText("Sayap");

        jLabel32.setText("Ati Ampela");

        lblPotPA.setText("Potongan");

        lblPotPB.setText("Potongan");

        lblPotSayap.setText("Potongan");

        lblPotAti.setText("Potongan");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel43.setText("Biaya Pesanan");

        lblBiayaPesanan.setText("Biaya");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel45.setText("Pajak");

        lblPajak.setText("Pajak");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel47.setText("Total Bayar");

        lblTotalBayar.setText("Total");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel30.setText("Jumlah Potongan");

        lblJumlahPot.setText("Potongan disini");

        jButton2.setText("Tutup");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel33.setText(":");

        jLabel34.setText(":");

        jLabel35.setText(":");

        jLabel39.setText(":");

        jLabel40.setText(":");

        javax.swing.GroupLayout dHasilLayout = new javax.swing.GroupLayout(dHasil.getContentPane());
        dHasil.getContentPane().setLayout(dHasilLayout);
        dHasilLayout.setHorizontalGroup(
            dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(dHasilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(dHasilLayout.createSequentialGroup()
                        .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dHasilLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(dHasilLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addGroup(dHasilLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addGroup(dHasilLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel43)
                    .addComponent(jLabel45)
                    .addComponent(jLabel47)
                    .addGroup(dHasilLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dHasilLayout.createSequentialGroup()
                                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(dHasilLayout.createSequentialGroup()
                                        .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel32))
                                        .addGap(53, 53, 53))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dHasilLayout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblPotPA)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lblPotSayap)
                                    .addComponent(lblPotPB)
                                    .addComponent(lblPotAti)
                                    .addComponent(lblJumlahPot)
                                    .addComponent(lblBiayaPesanan)
                                    .addComponent(lblPajak)
                                    .addComponent(lblTotalBayar)))
                            .addGroup(dHasilLayout.createSequentialGroup()
                                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(dHasilLayout.createSequentialGroup()
                                        .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21))
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNama)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(dHasilLayout.createSequentialGroup()
                                        .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel28))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblJumlahPahaAtas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblJumlahAti, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblJumlahPahaBawah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblJumlahSayap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)))
                                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotalPahaBawah)
                                    .addComponent(jLabel22)
                                    .addComponent(lblTotalPahaAtas)
                                    .addComponent(lblTotalSayap)
                                    .addComponent(lblTotalAti)))))
                    .addComponent(jLabel30)
                    .addComponent(jLabel19))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dHasilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        dHasilLayout.setVerticalGroup(
            dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dHasilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblNama)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lblJumlahPahaAtas)
                    .addComponent(lblTotalPahaAtas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(lblJumlahPahaBawah)
                    .addComponent(lblTotalPahaBawah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lblJumlahSayap)
                    .addComponent(lblTotalSayap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(lblJumlahAti)
                    .addComponent(lblTotalAti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dHasilLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32))
                    .addGroup(dHasilLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPotPA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPotPB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPotSayap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPotAti)))
                .addGap(15, 15, 15)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(lblJumlahPot)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(lblBiayaPesanan)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(lblPajak)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dHasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(lblTotalBayar)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Tukang Ayam");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Aplikasi Tukang Ayam");

        jLabel2.setText("Nama Pembeli");

        jLabel3.setText("Jenis Barang");

        cbPahaAtas.setText("Paha Atas");
        cbPahaAtas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPahaAtasActionPerformed(evt);
            }
        });

        cbPahaBawah.setText("Paha Bawah");
        cbPahaBawah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPahaBawahActionPerformed(evt);
            }
        });

        cbSayap.setText("Sayap");
        cbSayap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSayapActionPerformed(evt);
            }
        });

        cbAti.setText("Ati Ampela");
        cbAti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAtiActionPerformed(evt);
            }
        });

        spPahaAtas.setEnabled(false);

        spPahaBawah.setEnabled(false);

        spAti.setEnabled(false);

        spSayap.setEnabled(false);

        jLabel4.setText("Jenis Pembelian");

        buttonGroup1.add(rbLangsung);
        rbLangsung.setSelected(true);
        rbLangsung.setText("Langsung");

        buttonGroup1.add(rbPemesanan);
        rbPemesanan.setText("Pemesanan");
        rbPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPemesananActionPerformed(evt);
            }
        });

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Jumlah yang dibeli");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbAti)
                                                .addComponent(cbSayap))
                                            .addGap(36, 36, 36)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(spSayap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(spAti, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbPahaBawah)
                                                .addComponent(cbPahaAtas))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(spPahaBawah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(spPahaAtas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNama))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbLangsung)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbPemesanan))
                                    .addComponent(jLabel4))))
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(319, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPahaAtas)
                    .addComponent(spPahaAtas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPahaBawah)
                    .addComponent(spPahaBawah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAti)
                    .addComponent(spAti, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSayap)
                    .addComponent(spSayap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLangsung)
                    .addComponent(rbPemesanan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPahaAtasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPahaAtasActionPerformed
        spPahaAtas.setEnabled(cbPahaAtas.isSelected());
    }//GEN-LAST:event_cbPahaAtasActionPerformed

    private void cbPahaBawahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPahaBawahActionPerformed
        spPahaBawah.setEnabled(cbPahaBawah.isSelected());
    }//GEN-LAST:event_cbPahaBawahActionPerformed

    private void cbAtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAtiActionPerformed
        spAti.setEnabled(cbAti.isSelected());
    }//GEN-LAST:event_cbAtiActionPerformed

    private void cbSayapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSayapActionPerformed
        spSayap.setEnabled(cbSayap.isSelected());
    }//GEN-LAST:event_cbSayapActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtNama.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama Pembeli tidak boleh kosong");
            return;
        } 
        
        
       
                
        int hargaPahaAtas = 5000;
        int hargaPahaBawah = 4500;
        int hargaSayap = 2500;
        int hargaAti = 2000;
        
        int jumlahPahaAtas = 0;
        int jumlahPahaBawah =0;
        int jumlahSayap =0;
        int jumlahAti = 0;
        
        if(cbPahaAtas.isSelected()){
         jumlahPahaAtas = Integer.parseInt(spPahaAtas.getValue().toString());
        }else{
             jumlahPahaAtas = 0;
        }
        
        if(cbPahaBawah.isSelected()){
         jumlahPahaBawah = Integer.parseInt(spPahaBawah.getValue().toString());
        }else{
            jumlahPahaBawah =0;
        }
        if(cbSayap.isSelected()){
         jumlahSayap = Integer.parseInt(spSayap.getValue().toString());
        }else{
             jumlahSayap =0;
        }
        
        if(cbAti.isSelected()){
         jumlahAti = Integer.parseInt(spAti.getValue().toString());
        }else{
            jumlahAti = 0;
        }
        
        if(jumlahPahaAtas<0 || jumlahPahaBawah<0 || jumlahSayap<0 || jumlahAti<0 ){
            JOptionPane.showMessageDialog(null, "Pembelian barang tidak boleh kurang dari 0");
            return;
        }

        int totalPahaAtas = hargaPahaAtas * jumlahPahaAtas;
        int totalPahaBawah = hargaPahaBawah * jumlahPahaBawah;
        int totalSayap = hargaSayap * jumlahSayap;
        int totalAti = hargaAti * jumlahAti;
        int totalharga = totalPahaAtas + totalPahaBawah + totalSayap + totalAti;

        lblNama.setText(txtNama.getText());
        lblJumlahPahaAtas.setText(spPahaAtas.getValue().toString());
        lblJumlahPahaBawah.setText(spPahaBawah.getValue().toString());
        lblJumlahSayap.setText(spSayap.getValue().toString());
        lblJumlahAti.setText(spAti.getValue().toString());

        lblTotalPahaAtas.setText(formatRupiah(totalPahaAtas));
        lblTotalPahaBawah.setText(formatRupiah(totalPahaBawah));
        lblTotalSayap.setText(formatRupiah(totalSayap));
        lblTotalAti.setText(formatRupiah(totalAti));

        double potonganPahaAtas = 0;
        if (jumlahPahaAtas > 5) {
            potonganPahaAtas = totalPahaAtas * 5 / 100;
        }

        double potonganPahaBawah = 0;
        if (jumlahPahaBawah > 5) {
            potonganPahaBawah = totalPahaBawah * 5 / 100;
        }

        double potonganSayap = 0;
        if (jumlahSayap > 5) {
            potonganSayap = totalSayap * 3 / 100;
        }

        double potonganAti = 0;
        if (jumlahAti > 5) {
            potonganAti = totalAti * 3 / 100;
        }
        double jumlahPotongan = potonganPahaAtas + potonganPahaBawah + potonganSayap + potonganAti;
        double bayarKotor = totalharga - jumlahPotongan;

        lblPotPA.setText(formatRupiahh(potonganPahaAtas));
        lblPotPB.setText(formatRupiahh(potonganPahaBawah));
        lblPotSayap.setText(formatRupiahh(potonganSayap));
        lblPotAti.setText(formatRupiahh(potonganAti));
        lblJumlahPot.setText(formatRupiahh(jumlahPotongan));

        double biayaLayanan = hitungbiaya(rbPemesanan.isSelected(), totalharga);
        lblBiayaPesanan.setText(formatRupiahh(biayaLayanan));

        double pajak = totalharga * 10 / 100;
        lblPajak.setText(formatRupiahh(pajak));

        double totalBayar = bayarKotor + biayaLayanan + pajak;

        lblTotalBayar.setText(formatRupiahh(totalBayar));
        dHasil.pack();
        dHasil.setLocationRelativeTo(null);
        dHasil.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dHasil.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPemesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPemesananActionPerformed

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
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbAti;
    private javax.swing.JCheckBox cbPahaAtas;
    private javax.swing.JCheckBox cbPahaBawah;
    private javax.swing.JCheckBox cbSayap;
    private javax.swing.JDialog dHasil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBiayaPesanan;
    private javax.swing.JLabel lblJumlahAti;
    private javax.swing.JLabel lblJumlahPahaAtas;
    private javax.swing.JLabel lblJumlahPahaBawah;
    private javax.swing.JLabel lblJumlahPot;
    private javax.swing.JLabel lblJumlahSayap;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblPajak;
    private javax.swing.JLabel lblPotAti;
    private javax.swing.JLabel lblPotPA;
    private javax.swing.JLabel lblPotPB;
    private javax.swing.JLabel lblPotSayap;
    private javax.swing.JLabel lblTotalAti;
    private javax.swing.JLabel lblTotalBayar;
    private javax.swing.JLabel lblTotalPahaAtas;
    private javax.swing.JLabel lblTotalPahaBawah;
    private javax.swing.JLabel lblTotalSayap;
    private javax.swing.JRadioButton rbLangsung;
    private javax.swing.JRadioButton rbPemesanan;
    private javax.swing.JSpinner spAti;
    private javax.swing.JSpinner spPahaAtas;
    private javax.swing.JSpinner spPahaBawah;
    private javax.swing.JSpinner spSayap;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
