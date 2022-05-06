package teatro.view;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import teatro.controlador.controlador;
import teatro.model.modelado;

public class View extends javax.swing.JFrame implements Observer {

    public View() {
        initComponents();
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b_pre_01 = new javax.swing.JButton();
        b_pre_03 = new javax.swing.JButton();
        b_pre_02 = new javax.swing.JButton();
        b_pre_05 = new javax.swing.JButton();
        b_pre_04 = new javax.swing.JButton();
        b_pre_06 = new javax.swing.JButton();
        b_pre_07 = new javax.swing.JButton();
        b_pre_08 = new javax.swing.JButton();
        b_pre_09 = new javax.swing.JButton();
        b_pre_10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        b_lun_01 = new javax.swing.JButton();
        b_lun_02 = new javax.swing.JButton();
        b_lun_04 = new javax.swing.JButton();
        b_lun_03 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        b_lun_10 = new javax.swing.JButton();
        b_lun_09 = new javax.swing.JButton();
        b_lun_08 = new javax.swing.JButton();
        b_lun_07 = new javax.swing.JButton();
        b_lun_06 = new javax.swing.JButton();
        b_lun_15 = new javax.swing.JButton();
        b_lun_14 = new javax.swing.JButton();
        b_lun_13 = new javax.swing.JButton();
        b_lun_12 = new javax.swing.JButton();
        b_lun_11 = new javax.swing.JButton();
        b_lun_25 = new javax.swing.JButton();
        b_lun_24 = new javax.swing.JButton();
        b_lun_23 = new javax.swing.JButton();
        b_lun_22 = new javax.swing.JButton();
        b_lun_21 = new javax.swing.JButton();
        b_lun_20 = new javax.swing.JButton();
        b_lun_19 = new javax.swing.JButton();
        b_lun_18 = new javax.swing.JButton();
        b_lun_17 = new javax.swing.JButton();
        b_lun_16 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        b_gge_01 = new javax.swing.JButton();
        b_gge_02 = new javax.swing.JButton();
        b_gge_04 = new javax.swing.JButton();
        b_gge_03 = new javax.swing.JButton();
        b_gge_05 = new javax.swing.JButton();
        b_gge_10 = new javax.swing.JButton();
        b_gge_09 = new javax.swing.JButton();
        b_gge_08 = new javax.swing.JButton();
        b_gge_07 = new javax.swing.JButton();
        b_gge_06 = new javax.swing.JButton();
        b_gge_11 = new javax.swing.JButton();
        b_gge_12 = new javax.swing.JButton();
        b_gge_13 = new javax.swing.JButton();
        b_gge_14 = new javax.swing.JButton();
        b_gge_15 = new javax.swing.JButton();
        b_gge_16 = new javax.swing.JButton();
        b_gge_17 = new javax.swing.JButton();
        b_gge_18 = new javax.swing.JButton();
        b_gge_19 = new javax.swing.JButton();
        b_gge_20 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c_espera_preferencial = new javax.swing.JTextField();
        c_reservas_preferencial = new javax.swing.JTextField();
        c_pagadas_preferenciañ = new javax.swing.JTextField();
        c_reservadas_luneta = new javax.swing.JTextField();
        c_espera_luneta = new javax.swing.JTextField();
        c_pagadas_luneta = new javax.swing.JTextField();
        c_pagadas_ggeneral = new javax.swing.JTextField();
        c_espera_ggeneral = new javax.swing.JTextField();
        c_reservadas_ggeneral = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        b_reservar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        m_Archivo = new javax.swing.JMenu();
        m_inicializa = new javax.swing.JMenuItem();
        m_reservaciones = new javax.swing.JMenu();
        m_reservacion_preferencial = new javax.swing.JCheckBoxMenuItem();
        m_reservacion_luneta = new javax.swing.JCheckBoxMenuItem();
        m_reservacion_ggeneral = new javax.swing.JCheckBoxMenuItem();
        m_reportes = new javax.swing.JMenu();
        m_ganancia_general = new javax.swing.JMenuItem();
        m_ganancia_preferencial = new javax.swing.JMenuItem();
        m_ganancia_luneta = new javax.swing.JMenuItem();
        m_ganancia_ggeneral = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("ESCENARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        b_pre_01.setText("PRE-01");
        b_pre_01.setToolTipText("");
        b_pre_01.setEnabled(false);

        b_pre_03.setText("PRE-03");
        b_pre_03.setEnabled(false);

        b_pre_02.setText("PRE-02");
        b_pre_02.setToolTipText("");
        b_pre_02.setEnabled(false);

        b_pre_05.setText("PRE-05");
        b_pre_05.setEnabled(false);

        b_pre_04.setText("PRE-04");
        b_pre_04.setEnabled(false);

        b_pre_06.setText("PRE-06");
        b_pre_06.setEnabled(false);

        b_pre_07.setText("PRE-07");
        b_pre_07.setEnabled(false);

        b_pre_08.setText("PRE-08");
        b_pre_08.setEnabled(false);

        b_pre_09.setText("PRE-09");
        b_pre_09.setEnabled(false);

        b_pre_10.setText("PRE-10");
        b_pre_10.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_pre_09)
                    .addComponent(b_pre_10)
                    .addComponent(b_pre_07)
                    .addComponent(b_pre_08)
                    .addComponent(b_pre_06)
                    .addComponent(b_pre_04)
                    .addComponent(b_pre_05)
                    .addComponent(b_pre_02)
                    .addComponent(b_pre_03)
                    .addComponent(b_pre_01))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(b_pre_01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_pre_02)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_pre_03)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_pre_04)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_pre_05)
                .addGap(18, 18, 18)
                .addComponent(b_pre_06)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_pre_07)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_pre_08)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_pre_09)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_pre_10)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        b_lun_01.setText("LUN-01");
        b_lun_01.setEnabled(false);

        b_lun_02.setText("LUN-02");
        b_lun_02.setEnabled(false);

        b_lun_04.setText("LUN-04");
        b_lun_04.setEnabled(false);

        b_lun_03.setText("LUN-03");
        b_lun_03.setEnabled(false);

        jButton15.setText("LUN-05");
        jButton15.setEnabled(false);

        b_lun_10.setText("LUN-10");
        b_lun_10.setEnabled(false);

        b_lun_09.setText("LUN-09");
        b_lun_09.setEnabled(false);

        b_lun_08.setText("LUN-08");
        b_lun_08.setEnabled(false);

        b_lun_07.setText("LUN-07");
        b_lun_07.setEnabled(false);

        b_lun_06.setText("LUN-06");
        b_lun_06.setEnabled(false);

        b_lun_15.setText("LUN-15");
        b_lun_15.setEnabled(false);

        b_lun_14.setText("LUN-14");
        b_lun_14.setToolTipText("");
        b_lun_14.setEnabled(false);
        b_lun_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_lun_14ActionPerformed(evt);
            }
        });

        b_lun_13.setText("LUN-13");
        b_lun_13.setEnabled(false);

        b_lun_12.setText("LUN-12");
        b_lun_12.setEnabled(false);

        b_lun_11.setText("LUN-11");
        b_lun_11.setEnabled(false);

        b_lun_25.setText("LUN-25");
        b_lun_25.setEnabled(false);

        b_lun_24.setText("LUN-24");
        b_lun_24.setEnabled(false);

        b_lun_23.setText("LUN-23");
        b_lun_23.setEnabled(false);

        b_lun_22.setText("LUN-22");
        b_lun_22.setEnabled(false);

        b_lun_21.setText("LUN-21");
        b_lun_21.setEnabled(false);

        b_lun_20.setText("LUN-20");
        b_lun_20.setEnabled(false);

        b_lun_19.setText("LUN-19");
        b_lun_19.setEnabled(false);

        b_lun_18.setText("LUN-18");
        b_lun_18.setEnabled(false);

        b_lun_17.setText("LUN-17");
        b_lun_17.setEnabled(false);

        b_lun_16.setText("LUN-16");
        b_lun_16.setToolTipText("");
        b_lun_16.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_lun_02)
                            .addComponent(b_lun_01)
                            .addComponent(jButton15)
                            .addComponent(b_lun_04)
                            .addComponent(b_lun_03))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_lun_15)
                            .addComponent(b_lun_14)
                            .addComponent(b_lun_13)
                            .addComponent(b_lun_12)
                            .addComponent(b_lun_11)
                            .addComponent(b_lun_10)
                            .addComponent(b_lun_09)
                            .addComponent(b_lun_08)
                            .addComponent(b_lun_07)))
                    .addComponent(b_lun_06))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_lun_25)
                    .addComponent(b_lun_24)
                    .addComponent(b_lun_23)
                    .addComponent(b_lun_22)
                    .addComponent(b_lun_21)
                    .addComponent(b_lun_20)
                    .addComponent(b_lun_18)
                    .addComponent(b_lun_17)
                    .addComponent(b_lun_16)
                    .addComponent(b_lun_19))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_lun_16)
                    .addComponent(b_lun_06))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_lun_07)
                    .addComponent(b_lun_17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_lun_18)
                    .addComponent(b_lun_08))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_lun_09)
                            .addComponent(b_lun_19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_lun_10)
                            .addComponent(b_lun_20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_lun_22)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_lun_13)
                            .addComponent(b_lun_23))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_lun_01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_lun_02)
                        .addGap(18, 18, 18)
                        .addComponent(b_lun_03)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_lun_04)
                            .addComponent(b_lun_11)
                            .addComponent(b_lun_21))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton15)
                            .addComponent(b_lun_12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_lun_24)
                    .addComponent(b_lun_14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_lun_15)
                    .addComponent(b_lun_25))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        b_gge_01.setText("GGE-01");
        b_gge_01.setEnabled(false);

        b_gge_02.setText("GGE-02");
        b_gge_02.setToolTipText("");
        b_gge_02.setEnabled(false);

        b_gge_04.setText("GGE-04");
        b_gge_04.setToolTipText("");
        b_gge_04.setEnabled(false);

        b_gge_03.setText("GGE-03");
        b_gge_03.setEnabled(false);

        b_gge_05.setText("GGE-05");
        b_gge_05.setToolTipText("");
        b_gge_05.setEnabled(false);

        b_gge_10.setText("GGE-10");
        b_gge_10.setToolTipText("");
        b_gge_10.setEnabled(false);

        b_gge_09.setText("GGE-09");
        b_gge_09.setToolTipText("");
        b_gge_09.setEnabled(false);

        b_gge_08.setText("GGE-08");
        b_gge_08.setEnabled(false);

        b_gge_07.setText("GGE-07");
        b_gge_07.setToolTipText("");
        b_gge_07.setEnabled(false);

        b_gge_06.setText("GGE-06");
        b_gge_06.setEnabled(false);

        b_gge_11.setText("GGE-11");
        b_gge_11.setToolTipText("");
        b_gge_11.setEnabled(false);

        b_gge_12.setText("GGE-12");
        b_gge_12.setToolTipText("");
        b_gge_12.setEnabled(false);

        b_gge_13.setText("GGE-13");
        b_gge_13.setEnabled(false);

        b_gge_14.setText("GGE-14");
        b_gge_14.setToolTipText("");
        b_gge_14.setEnabled(false);

        b_gge_15.setText("GGE-15");
        b_gge_15.setToolTipText("");
        b_gge_15.setEnabled(false);

        b_gge_16.setText("GGE-16");
        b_gge_16.setEnabled(false);

        b_gge_17.setText("GGE-17");
        b_gge_17.setToolTipText("");
        b_gge_17.setEnabled(false);

        b_gge_18.setText("GGE-18");
        b_gge_18.setToolTipText("");
        b_gge_18.setEnabled(false);

        b_gge_19.setText("GGE-19");
        b_gge_19.setToolTipText("");
        b_gge_19.setEnabled(false);

        b_gge_20.setText("GGE-20");
        b_gge_20.setToolTipText("");
        b_gge_20.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_gge_01)
                    .addComponent(b_gge_02)
                    .addComponent(b_gge_03)
                    .addComponent(b_gge_04)
                    .addComponent(b_gge_05)
                    .addComponent(b_gge_06)
                    .addComponent(b_gge_07)
                    .addComponent(b_gge_08)
                    .addComponent(b_gge_09)
                    .addComponent(b_gge_10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_gge_11)
                    .addComponent(b_gge_12)
                    .addComponent(b_gge_13)
                    .addComponent(b_gge_14)
                    .addComponent(b_gge_15)
                    .addComponent(b_gge_16)
                    .addComponent(b_gge_17)
                    .addComponent(b_gge_18)
                    .addComponent(b_gge_19)
                    .addComponent(b_gge_20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(b_gge_11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_gge_12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_gge_13)
                        .addGap(12, 12, 12)
                        .addComponent(b_gge_14)
                        .addGap(18, 18, 18)
                        .addComponent(b_gge_15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(b_gge_16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_gge_17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_gge_18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_gge_19)
                        .addGap(18, 18, 18)
                        .addComponent(b_gge_20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(b_gge_01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_gge_02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_gge_03)
                        .addGap(12, 12, 12)
                        .addComponent(b_gge_04)
                        .addGap(18, 18, 18)
                        .addComponent(b_gge_05)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_gge_06)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_gge_07)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_gge_08)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_gge_09)
                        .addGap(18, 18, 18)
                        .addComponent(b_gge_10)))
                .addContainerGap())
        );

        jLabel2.setText("Cant. Reservadas");

        jLabel3.setText("Cant. En espera");

        jLabel4.setText("Cant. Pagas");

        c_espera_preferencial.setBackground(new java.awt.Color(255, 255, 204));

        c_reservas_preferencial.setBackground(new java.awt.Color(255, 255, 204));
        c_reservas_preferencial.setToolTipText("");

        c_pagadas_preferenciañ.setBackground(new java.awt.Color(255, 255, 204));

        c_reservadas_luneta.setBackground(new java.awt.Color(204, 255, 204));
        c_reservadas_luneta.setToolTipText("");

        c_espera_luneta.setBackground(new java.awt.Color(204, 255, 204));

        c_pagadas_luneta.setBackground(new java.awt.Color(204, 255, 204));

        c_pagadas_ggeneral.setBackground(new java.awt.Color(204, 255, 255));

        c_espera_ggeneral.setBackground(new java.awt.Color(204, 255, 255));

        c_reservadas_ggeneral.setBackground(new java.awt.Color(204, 255, 255));
        c_reservadas_ggeneral.setToolTipText("");

        jLabel5.setText("Cant. Reservadas");

        jLabel6.setText("Cant. Reservadas");

        jLabel7.setText("Cant. En espera");

        jLabel8.setText("Cant. En espera");

        jLabel9.setText("Cant. Pagas");

        jLabel10.setText("Cant. Pagas");

        b_reservar.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        b_reservar.setText("Reservar");
        b_reservar.setToolTipText("");
        b_reservar.setEnabled(false);
        b_reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reservarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton1.setText("Pagar");
        jButton1.setEnabled(false);

        m_Archivo.setText("Archivo");

        m_inicializa.setText("Inicializa");
        m_inicializa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_inicializaActionPerformed(evt);
            }
        });
        m_Archivo.add(m_inicializa);

        jMenuBar2.add(m_Archivo);

        m_reservaciones.setText("Reservaciones");

        m_reservacion_preferencial.setText("Preferencial");
        m_reservacion_preferencial.setToolTipText("");
        m_reservacion_preferencial.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                m_reservacion_preferencialStateChanged(evt);
            }
        });
        m_reservacion_preferencial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_reservacion_preferencialMouseClicked(evt);
            }
        });
        m_reservacion_preferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_reservacion_preferencialActionPerformed(evt);
            }
        });
        m_reservaciones.add(m_reservacion_preferencial);

        m_reservacion_luneta.setText("Luneta");
        m_reservaciones.add(m_reservacion_luneta);

        m_reservacion_ggeneral.setText("Graderia General");
        m_reservacion_ggeneral.setToolTipText("");
        m_reservaciones.add(m_reservacion_ggeneral);

        jMenuBar2.add(m_reservaciones);

        m_reportes.setText("Reportes");
        m_reportes.setToolTipText("");

        m_ganancia_general.setText("Ganancia General");
        m_ganancia_general.setToolTipText("");
        m_reportes.add(m_ganancia_general);

        m_ganancia_preferencial.setText("Ganancia Preferencial");
        m_ganancia_preferencial.setToolTipText("");
        m_reportes.add(m_ganancia_preferencial);

        m_ganancia_luneta.setText("Ganancia luneta");
        m_ganancia_luneta.setToolTipText("");
        m_reportes.add(m_ganancia_luneta);

        m_ganancia_ggeneral.setText("Ganancia GGeneral");
        m_reportes.add(m_ganancia_ggeneral);

        jMenuBar2.add(m_reportes);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c_espera_preferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c_pagadas_preferenciañ, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c_reservas_preferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_reservadas_luneta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_espera_luneta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_pagadas_luneta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_reservadas_ggeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_espera_ggeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_pagadas_ggeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_reservar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(b_reservar)
                        .addGap(50, 50, 50)
                        .addComponent(jButton1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(c_reservas_preferencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(c_espera_preferencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(c_pagadas_preferenciañ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c_reservadas_luneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(c_espera_luneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c_pagadas_luneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_reservadas_ggeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_espera_ggeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_pagadas_ggeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_inicializaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_inicializaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_inicializaActionPerformed

    private void b_lun_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_lun_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_lun_14ActionPerformed

    private void m_reservacion_preferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_reservacion_preferencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_reservacion_preferencialActionPerformed

    private void b_reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_reservarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_reservarActionPerformed

    private void m_reservacion_preferencialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_reservacion_preferencialMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m_reservacion_preferencialMouseClicked

    private void m_reservacion_preferencialStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_m_reservacion_preferencialStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_m_reservacion_preferencialStateChanged

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton b_gge_01;
    public static javax.swing.JButton b_gge_02;
    public static javax.swing.JButton b_gge_03;
    public static javax.swing.JButton b_gge_04;
    public static javax.swing.JButton b_gge_05;
    public static javax.swing.JButton b_gge_06;
    public static javax.swing.JButton b_gge_07;
    public static javax.swing.JButton b_gge_08;
    public static javax.swing.JButton b_gge_09;
    public static javax.swing.JButton b_gge_10;
    public static javax.swing.JButton b_gge_11;
    public static javax.swing.JButton b_gge_12;
    public static javax.swing.JButton b_gge_13;
    public static javax.swing.JButton b_gge_14;
    public static javax.swing.JButton b_gge_15;
    public static javax.swing.JButton b_gge_16;
    public static javax.swing.JButton b_gge_17;
    public static javax.swing.JButton b_gge_18;
    public static javax.swing.JButton b_gge_19;
    public static javax.swing.JButton b_gge_20;
    public static javax.swing.JButton b_lun_01;
    public static javax.swing.JButton b_lun_02;
    public static javax.swing.JButton b_lun_03;
    public static javax.swing.JButton b_lun_04;
    public static javax.swing.JButton b_lun_06;
    public static javax.swing.JButton b_lun_07;
    public static javax.swing.JButton b_lun_08;
    public static javax.swing.JButton b_lun_09;
    public static javax.swing.JButton b_lun_10;
    public static javax.swing.JButton b_lun_11;
    public static javax.swing.JButton b_lun_12;
    public static javax.swing.JButton b_lun_13;
    public static javax.swing.JButton b_lun_14;
    public static javax.swing.JButton b_lun_15;
    public static javax.swing.JButton b_lun_16;
    public static javax.swing.JButton b_lun_17;
    public static javax.swing.JButton b_lun_18;
    public static javax.swing.JButton b_lun_19;
    public static javax.swing.JButton b_lun_20;
    public static javax.swing.JButton b_lun_21;
    public static javax.swing.JButton b_lun_22;
    public static javax.swing.JButton b_lun_23;
    public static javax.swing.JButton b_lun_24;
    public static javax.swing.JButton b_lun_25;
    public static javax.swing.JButton b_pre_01;
    public static javax.swing.JButton b_pre_02;
    public static javax.swing.JButton b_pre_03;
    public static javax.swing.JButton b_pre_04;
    public static javax.swing.JButton b_pre_05;
    public static javax.swing.JButton b_pre_06;
    public static javax.swing.JButton b_pre_07;
    public static javax.swing.JButton b_pre_08;
    public static javax.swing.JButton b_pre_09;
    public static javax.swing.JButton b_pre_10;
    public static javax.swing.JButton b_reservar;
    public static javax.swing.JTextField c_espera_ggeneral;
    public static javax.swing.JTextField c_espera_luneta;
    public static javax.swing.JTextField c_espera_preferencial;
    public static javax.swing.JTextField c_pagadas_ggeneral;
    public static javax.swing.JTextField c_pagadas_luneta;
    public static javax.swing.JTextField c_pagadas_preferenciañ;
    public static javax.swing.JTextField c_reservadas_ggeneral;
    public static javax.swing.JTextField c_reservadas_luneta;
    public static javax.swing.JTextField c_reservas_preferencial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JMenu m_Archivo;
    public static javax.swing.JMenuItem m_ganancia_general;
    public static javax.swing.JMenuItem m_ganancia_ggeneral;
    public static javax.swing.JMenuItem m_ganancia_luneta;
    public static javax.swing.JMenuItem m_ganancia_preferencial;
    public static javax.swing.JMenuItem m_inicializa;
    public static javax.swing.JMenu m_reportes;
    public static javax.swing.JCheckBoxMenuItem m_reservacion_ggeneral;
    public static javax.swing.JCheckBoxMenuItem m_reservacion_luneta;
    public static javax.swing.JCheckBoxMenuItem m_reservacion_preferencial;
    public static javax.swing.JMenu m_reservaciones;
    // End of variables declaration//GEN-END:variables
}


public void setModel(Model model){
    this.model=model;
    model.addObserver(this);
}    

public void setController(Controller controller){
    this.controller = controller;
