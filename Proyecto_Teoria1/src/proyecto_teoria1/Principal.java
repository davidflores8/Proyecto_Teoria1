/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_teoria1;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        Jd_Mcreacion = new javax.swing.JDialog();
        Crear_Planta = new javax.swing.JButton();
        Crear_proveedor = new javax.swing.JButton();
        Crear_conse = new javax.swing.JButton();
        Crear_cliente = new javax.swing.JButton();
        Crear_compa = new javax.swing.JButton();
        Crear_vehiculo = new javax.swing.JButton();
        lb_fondocreacion = new javax.swing.JLabel();
        Jd_Mmodificacion = new javax.swing.JDialog();
        Jd_Meliminacion = new javax.swing.JDialog();
        C_Compañia = new javax.swing.JDialog();
        id_compa = new javax.swing.JLabel();
        id_compa2 = new javax.swing.JLabel();
        id_compa1 = new javax.swing.JLabel();
        compa_marca = new javax.swing.JTextField();
        Compa_id = new javax.swing.JTextField();
        compa_nombre = new javax.swing.JTextField();
        Btn_crearEmpre = new javax.swing.JButton();
        lb_Fondo_C_empre = new javax.swing.JLabel();
        C_Planta = new javax.swing.JDialog();
        planta_tipo = new javax.swing.JTextField();
        planta_nombre = new javax.swing.JTextField();
        planta_id = new javax.swing.JTextField();
        Btn_crearplanta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id_compa3 = new javax.swing.JLabel();
        id_compa4 = new javax.swing.JLabel();
        id_compa5 = new javax.swing.JLabel();
        lb_Fondo_C_empre1 = new javax.swing.JLabel();
        C_Proveedor = new javax.swing.JDialog();
        Proveedor_id = new javax.swing.JTextField();
        Proveedor_nombre = new javax.swing.JTextField();
        Btn_crearproveedor = new javax.swing.JButton();
        id_compa6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_compa7 = new javax.swing.JLabel();
        lb_Fondo_C_empre2 = new javax.swing.JLabel();
        C_Conse = new javax.swing.JDialog();
        conse_rtn = new javax.swing.JTextField();
        conse_nombre = new javax.swing.JTextField();
        Btn_crearconse = new javax.swing.JButton();
        id_compa8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id_compa9 = new javax.swing.JLabel();
        lb_Fondo_C_empre3 = new javax.swing.JLabel();
        C_Cliente = new javax.swing.JDialog();
        C_vehiculo = new javax.swing.JDialog();
        id_compa10 = new javax.swing.JLabel();
        id_compa11 = new javax.swing.JLabel();
        Btn_creaVehi = new javax.swing.JButton();
        id_compa12 = new javax.swing.JLabel();
        vehi_modelo = new javax.swing.JTextField();
        vehi_color = new javax.swing.JTextField();
        vehi_vin = new javax.swing.JTextField();
        Vehi_motor = new javax.swing.JTextField();
        id_compa13 = new javax.swing.JLabel();
        id_compa14 = new javax.swing.JLabel();
        id_compa16 = new javax.swing.JLabel();
        id_compa17 = new javax.swing.JLabel();
        vehi_trans = new javax.swing.JComboBox<>();
        vehi_carro = new javax.swing.JComboBox<>();
        lb_Fondo_C_empre4 = new javax.swing.JLabel();
        Bt_Menu_Creacion = new javax.swing.JButton();
        Bt_Menu_Modificar = new javax.swing.JButton();
        Bt_Menu_Eliminacion = new javax.swing.JButton();
        lb_fondo1 = new javax.swing.JLabel();

        Jd_Mcreacion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Crear_Planta.setText("Planta");
        Crear_Planta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Crear_PlantaMouseClicked(evt);
            }
        });
        Jd_Mcreacion.getContentPane().add(Crear_Planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 110, -1));

        Crear_proveedor.setText("Proveedor");
        Crear_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Crear_proveedorMouseClicked(evt);
            }
        });
        Jd_Mcreacion.getContentPane().add(Crear_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 110, -1));

        Crear_conse.setText("Consecionario");
        Jd_Mcreacion.getContentPane().add(Crear_conse, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        Crear_cliente.setText("Cliente");
        Jd_Mcreacion.getContentPane().add(Crear_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 110, -1));

        Crear_compa.setText("Compañia");
        Crear_compa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Crear_compaMouseClicked(evt);
            }
        });
        Jd_Mcreacion.getContentPane().add(Crear_compa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 110, -1));

        Crear_vehiculo.setText("Vehiculo");
        Crear_vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Crear_vehiculoMouseClicked(evt);
            }
        });
        Jd_Mcreacion.getContentPane().add(Crear_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 110, -1));

        lb_fondocreacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diseno-fondo-moderno-blanco-3d_53876-88246.jpg"))); // NOI18N
        Jd_Mcreacion.getContentPane().add(lb_fondocreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout Jd_MmodificacionLayout = new javax.swing.GroupLayout(Jd_Mmodificacion.getContentPane());
        Jd_Mmodificacion.getContentPane().setLayout(Jd_MmodificacionLayout);
        Jd_MmodificacionLayout.setHorizontalGroup(
            Jd_MmodificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        Jd_MmodificacionLayout.setVerticalGroup(
            Jd_MmodificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Jd_MeliminacionLayout = new javax.swing.GroupLayout(Jd_Meliminacion.getContentPane());
        Jd_Meliminacion.getContentPane().setLayout(Jd_MeliminacionLayout);
        Jd_MeliminacionLayout.setHorizontalGroup(
            Jd_MeliminacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        Jd_MeliminacionLayout.setVerticalGroup(
            Jd_MeliminacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        C_Compañia.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_compa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa.setText("Id Compañia");
        C_Compañia.getContentPane().add(id_compa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        id_compa2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa2.setText("Nombre compañia");
        C_Compañia.getContentPane().add(id_compa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        id_compa1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa1.setText("Marca");
        C_Compañia.getContentPane().add(id_compa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));
        C_Compañia.getContentPane().add(compa_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 120, -1));
        C_Compañia.getContentPane().add(Compa_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 120, -1));
        C_Compañia.getContentPane().add(compa_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, -1));

        Btn_crearEmpre.setText("Crear");
        Btn_crearEmpre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_crearEmpreMouseClicked(evt);
            }
        });
        C_Compañia.getContentPane().add(Btn_crearEmpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        lb_Fondo_C_empre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-minimalistic-mint-green-poster-background-image_234071.jpg"))); // NOI18N
        C_Compañia.getContentPane().add(lb_Fondo_C_empre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 442, 450));

        C_Planta.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        C_Planta.getContentPane().add(planta_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 120, -1));
        C_Planta.getContentPane().add(planta_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, -1));
        C_Planta.getContentPane().add(planta_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 120, -1));

        Btn_crearplanta.setText("Crear");
        Btn_crearplanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_crearplantaMouseClicked(evt);
            }
        });
        C_Planta.getContentPane().add(Btn_crearplanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        jLabel1.setText("CREACION DE PLANTAS ");
        C_Planta.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        id_compa3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa3.setText("Id planta");
        C_Planta.getContentPane().add(id_compa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        id_compa4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa4.setText("Nombre planta");
        C_Planta.getContentPane().add(id_compa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        id_compa5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa5.setText("tipo planta");
        C_Planta.getContentPane().add(id_compa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        lb_Fondo_C_empre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-minimalistic-mint-green-poster-background-image_234071.jpg"))); // NOI18N
        C_Planta.getContentPane().add(lb_Fondo_C_empre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 442, 450));

        C_Proveedor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        C_Proveedor.getContentPane().add(Proveedor_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 120, -1));
        C_Proveedor.getContentPane().add(Proveedor_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, -1));

        Btn_crearproveedor.setText("Crear");
        Btn_crearproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_crearproveedorMouseClicked(evt);
            }
        });
        C_Proveedor.getContentPane().add(Btn_crearproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        id_compa6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa6.setText("Id proveedor");
        C_Proveedor.getContentPane().add(id_compa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel2.setText("CREACION DE PROVEEDOR");
        C_Proveedor.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        id_compa7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa7.setText("Nombre proveedor");
        C_Proveedor.getContentPane().add(id_compa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lb_Fondo_C_empre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-minimalistic-mint-green-poster-background-image_234071.jpg"))); // NOI18N
        C_Proveedor.getContentPane().add(lb_Fondo_C_empre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 442, 450));

        C_Conse.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        C_Conse.getContentPane().add(conse_rtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 120, -1));
        C_Conse.getContentPane().add(conse_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, -1));

        Btn_crearconse.setText("Crear");
        Btn_crearconse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_crearconseMouseClicked(evt);
            }
        });
        C_Conse.getContentPane().add(Btn_crearconse, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        id_compa8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa8.setText("RTN");
        C_Conse.getContentPane().add(id_compa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel3.setText("CREACION DE CONCESIONARIO");
        C_Conse.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        id_compa9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa9.setText("Nombre consecionario");
        C_Conse.getContentPane().add(id_compa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lb_Fondo_C_empre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-minimalistic-mint-green-poster-background-image_234071.jpg"))); // NOI18N
        C_Conse.getContentPane().add(lb_Fondo_C_empre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 442, 450));

        javax.swing.GroupLayout C_ClienteLayout = new javax.swing.GroupLayout(C_Cliente.getContentPane());
        C_Cliente.getContentPane().setLayout(C_ClienteLayout);
        C_ClienteLayout.setHorizontalGroup(
            C_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        C_ClienteLayout.setVerticalGroup(
            C_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        C_vehiculo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_compa10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa10.setText("TIPO CARROCERIA");
        C_vehiculo.getContentPane().add(id_compa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        id_compa11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa11.setText("VIN");
        C_vehiculo.getContentPane().add(id_compa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        Btn_creaVehi.setText("Crear");
        Btn_creaVehi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_creaVehiMouseClicked(evt);
            }
        });
        C_vehiculo.getContentPane().add(Btn_creaVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));

        id_compa12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa12.setText("COLOR");
        C_vehiculo.getContentPane().add(id_compa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));
        C_vehiculo.getContentPane().add(vehi_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 120, -1));
        C_vehiculo.getContentPane().add(vehi_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 120, -1));
        C_vehiculo.getContentPane().add(vehi_vin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 120, -1));
        C_vehiculo.getContentPane().add(Vehi_motor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 120, -1));

        id_compa13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa13.setText("TRANSMISION");
        C_vehiculo.getContentPane().add(id_compa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        id_compa14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa14.setText("MODELO");
        C_vehiculo.getContentPane().add(id_compa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        id_compa16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa16.setText("CREACION VEHICULOS");
        C_vehiculo.getContentPane().add(id_compa16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        id_compa17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        id_compa17.setText("Tipo Motor");
        C_vehiculo.getContentPane().add(id_compa17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        vehi_trans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecanico", "Automatico" }));
        C_vehiculo.getContentPane().add(vehi_trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 200, 110, -1));

        vehi_carro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "media cabina", "1 cabina", "2 cabinas" }));
        C_vehiculo.getContentPane().add(vehi_carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 250, 110, -1));

        lb_Fondo_C_empre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-minimalistic-mint-green-poster-background-image_234071.jpg"))); // NOI18N
        C_vehiculo.getContentPane().add(lb_Fondo_C_empre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 560));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bt_Menu_Creacion.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        Bt_Menu_Creacion.setText("Creacion");
        Bt_Menu_Creacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_Menu_CreacionMouseClicked(evt);
            }
        });
        getContentPane().add(Bt_Menu_Creacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, 230, 50));

        Bt_Menu_Modificar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        Bt_Menu_Modificar.setText("Modificar");
        getContentPane().add(Bt_Menu_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, 30));

        Bt_Menu_Eliminacion.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        Bt_Menu_Eliminacion.setText("Eliminar");
        getContentPane().add(Bt_Menu_Eliminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, -1, -1));

        lb_fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/WhatsApp Image 2020-03-05 at 6.43.00 PM.jpeg"))); // NOI18N
        getContentPane().add(lb_fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 980, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_Menu_CreacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_Menu_CreacionMouseClicked
        Jd_Mcreacion.setLocationRelativeTo(this);
        Jd_Mcreacion.pack();
        Jd_Mcreacion.setModal(true);
        Jd_Mcreacion.setVisible(true);
    }//GEN-LAST:event_Bt_Menu_CreacionMouseClicked

    private void Crear_compaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Crear_compaMouseClicked
        C_Compañia.setLocationRelativeTo(this);
        C_Compañia.pack();
        C_Compañia.setModal(true);
        C_Compañia.setVisible(true);
    }//GEN-LAST:event_Crear_compaMouseClicked

    private void Btn_crearEmpreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_crearEmpreMouseClicked
        // creacion de companias:  id compa nombre compa y marca
        String Nombre_com = "";
        int id_compa = 0;
        String Marca_compa = "";
        boolean verificar = false;
        
        Nombre_com = compa_nombre.getText();
        compa_nombre.setText("");
        Marca_compa = compa_marca.getText();
        compa_marca.setText("");
        try {
            //TRY CATCH PARA QUE AL INGRESAR CARACETEES NO SE QUIEBRE EL PROGRAMA
            id_compa = Integer.parseInt(Compa_id.getText());
            Compa_id.setText("");
            if (id_compa > 0 && Marca_compa.length() > 0 && Nombre_com.length() > 0) {
                verificar = true;
            }

            //EJECUTAR TRIGGER DE INSERTAR EN LA TABLA DE EMPRESAS
        } catch (Exception e) {
            JOptionPane.showMessageDialog(C_Compañia, "en id se debe ingresar un valor numerico");
            C_Compañia.setVisible(false);
        }
        if (verificar) {
            JOptionPane.showMessageDialog(C_Compañia, "se guardaron los datos de forma satisfactoria\nfalta llamar los triggers");
            C_Compañia.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(C_Compañia, "tiene algun problema a la hora de ingresar el nombre o la marca");
            C_Compañia.setVisible(false);
        }

    }//GEN-LAST:event_Btn_crearEmpreMouseClicked

    private void Btn_crearplantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_crearplantaMouseClicked
        // creacion de plantas
    }//GEN-LAST:event_Btn_crearplantaMouseClicked

    private void Crear_PlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Crear_PlantaMouseClicked
        C_Planta.setLocationRelativeTo(this);
        C_Planta.pack();
        C_Planta.setModal(true);
        C_Planta.setVisible(true);
    }//GEN-LAST:event_Crear_PlantaMouseClicked

    private void Btn_crearproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_crearproveedorMouseClicked
        // TODO add your handling code here:
        C_Proveedor.setLocationRelativeTo(this);
        C_Proveedor.pack();
        C_Proveedor.setModal(true);
        C_Proveedor.setVisible(true);
    }//GEN-LAST:event_Btn_crearproveedorMouseClicked

    private void Crear_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Crear_proveedorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Crear_proveedorMouseClicked

    private void Crear_vehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Crear_vehiculoMouseClicked
        C_vehiculo.setLocationRelativeTo(this);
        C_vehiculo.pack();
        C_vehiculo.setModal(true);
        C_vehiculo.setVisible(true);
    }//GEN-LAST:event_Crear_vehiculoMouseClicked

    private void Btn_crearconseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_crearconseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_crearconseMouseClicked

    private void Btn_creaVehiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_creaVehiMouseClicked
        //creacion vehiculos
        String motor = "", transmision = "", modelo = "", carroceria = "", color = "", vin = "";
        motor = Vehi_motor.getText();
        Vehi_motor.setText("");
        transmision = vehi_trans.getSelectedItem().toString();
        System.out.println(transmision);
        vehi_trans.setSelectedIndex(0);
        vin = vehi_vin.getText();
        vehi_vin.setText("");
        modelo = vehi_modelo.getText();
        vehi_modelo.setText("");
        carroceria = vehi_carro.getSelectedItem().toString();
        vehi_carro.setSelectedIndex(0);
        System.out.println(carroceria);
        color = vehi_color.getText();
        vehi_color.setText("");
        JOptionPane.showMessageDialog(C_Planta, "se creo el vehiculo");
        C_vehiculo.setVisible(false);

    }//GEN-LAST:event_Btn_creaVehiMouseClicked

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Menu_Creacion;
    private javax.swing.JButton Bt_Menu_Eliminacion;
    private javax.swing.JButton Bt_Menu_Modificar;
    private javax.swing.JButton Btn_creaVehi;
    private javax.swing.JButton Btn_crearEmpre;
    private javax.swing.JButton Btn_crearconse;
    private javax.swing.JButton Btn_crearplanta;
    private javax.swing.JButton Btn_crearproveedor;
    private javax.swing.JDialog C_Cliente;
    private javax.swing.JDialog C_Compañia;
    private javax.swing.JDialog C_Conse;
    private javax.swing.JDialog C_Planta;
    private javax.swing.JDialog C_Proveedor;
    private javax.swing.JDialog C_vehiculo;
    private javax.swing.JTextField Compa_id;
    private javax.swing.JButton Crear_Planta;
    private javax.swing.JButton Crear_cliente;
    private javax.swing.JButton Crear_compa;
    private javax.swing.JButton Crear_conse;
    private javax.swing.JButton Crear_proveedor;
    private javax.swing.JButton Crear_vehiculo;
    private javax.swing.JDialog Jd_Mcreacion;
    private javax.swing.JDialog Jd_Meliminacion;
    private javax.swing.JDialog Jd_Mmodificacion;
    private javax.swing.JTextField Proveedor_id;
    private javax.swing.JTextField Proveedor_nombre;
    private javax.swing.JTextField Vehi_motor;
    private javax.swing.JTextField compa_marca;
    private javax.swing.JTextField compa_nombre;
    private javax.swing.JTextField conse_nombre;
    private javax.swing.JTextField conse_rtn;
    private javax.swing.JLabel id_compa;
    private javax.swing.JLabel id_compa1;
    private javax.swing.JLabel id_compa10;
    private javax.swing.JLabel id_compa11;
    private javax.swing.JLabel id_compa12;
    private javax.swing.JLabel id_compa13;
    private javax.swing.JLabel id_compa14;
    private javax.swing.JLabel id_compa16;
    private javax.swing.JLabel id_compa17;
    private javax.swing.JLabel id_compa2;
    private javax.swing.JLabel id_compa3;
    private javax.swing.JLabel id_compa4;
    private javax.swing.JLabel id_compa5;
    private javax.swing.JLabel id_compa6;
    private javax.swing.JLabel id_compa7;
    private javax.swing.JLabel id_compa8;
    private javax.swing.JLabel id_compa9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lb_Fondo_C_empre;
    private javax.swing.JLabel lb_Fondo_C_empre1;
    private javax.swing.JLabel lb_Fondo_C_empre2;
    private javax.swing.JLabel lb_Fondo_C_empre3;
    private javax.swing.JLabel lb_Fondo_C_empre4;
    private javax.swing.JLabel lb_fondo1;
    private javax.swing.JLabel lb_fondocreacion;
    private javax.swing.JTextField planta_id;
    private javax.swing.JTextField planta_nombre;
    private javax.swing.JTextField planta_tipo;
    private javax.swing.JComboBox<String> vehi_carro;
    private javax.swing.JTextField vehi_color;
    private javax.swing.JTextField vehi_modelo;
    private javax.swing.JComboBox<String> vehi_trans;
    private javax.swing.JTextField vehi_vin;
    // End of variables declaration//GEN-END:variables

    /*
    --compañia : id compañia, nombre, marca
    --proveedor: id proveedor nombre proveedor
    --concesionario : rtn nombre 
    cliente telefono direccion nombre rtn // persona id sexo ingreso anual // empresa tipo de empresa
    vehiculo tipo motor, vin color transmision tipo carroceria modelo
    --planta id planta nombre tipo
     */
 /*
Cuentas del log in
     */
}
