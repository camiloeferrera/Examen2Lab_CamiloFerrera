package examen2_camiloferrera;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        usuarios.add(new Cliente("camiloeferrera","java123","Camilo","Eduardo","Ferrera","Padilla","0801",2000,2020));
        ((Cliente)usuarios.get(0)).getCuentas().add(new Cuenta (11841136));
        ((Cliente)usuarios.get(0)).getCuentas().add(new Cuenta (11811245));
        atms.add(new ATM("Tegucigalpa","45675",2019));
        atms.add(new ATM("SPS","45211",2017));
        atms.get(1).setBilletesDe100(136);
        
//        File archivo = new File ("./Datos.txt");
//        try{
//            if(archivo.exists()){
//                FileInputStream entrada = new FileInputStream(archivo);
//                ObjectInputStream objeto = new ObjectInputStream(entrada);
//                try{
//                    while ((objeto.readObject())!=null) {
//                        if ((objeto.readObject()) instanceof Usuario) {
//                            usuarios.add((Usuario)(objeto.readObject()));
//                        } else if ((objeto.readObject()) instanceof ATM) {
//                            atms.add((ATM)(objeto.readObject()));
//                        } else if ((objeto.readObject()) instanceof String){
//                            log.add((String)(objeto.readObject()));
//                        }
//                    }
//                }catch (EOFException ex) {
//                    
//                }
//                objeto.close();
//                entrada.close();
//            }
//        }catch (Exception ex) {
//             ex.printStackTrace();
//        }
        
        DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_atms.getModel();
        for (int i = 0; i < atms.size(); i++) {
            cb.addElement(atms.get(i));
        }
        cb_atms.setModel(cb);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearATM = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_ubicacionatm = new javax.swing.JTextField();
        tf_idatm = new javax.swing.JTextField();
        yc_añoatm = new com.toedter.calendar.JYearChooser();
        jButton4 = new javax.swing.JButton();
        Registro = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_idusuario = new javax.swing.JTextField();
        tf_pnombre = new javax.swing.JTextField();
        tf_snombre = new javax.swing.JTextField();
        tf_papellido = new javax.swing.JTextField();
        tf_sapellido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        yc_año = new com.toedter.calendar.JYearChooser();
        cb_tipousuario = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        pf_passregistro = new javax.swing.JPasswordField();
        MenuClientes = new javax.swing.JDialog();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cb_cuentas = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        RetiroDinero = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        cb_atms = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jl_500 = new javax.swing.JLabel();
        jl_100 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jl_saldo = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        sp_500 = new javax.swing.JSpinner();
        sp_100 = new javax.swing.JSpinner();
        jButton13 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pf_passretiro = new javax.swing.JPasswordField();
        tf_idretiro = new javax.swing.JTextField();
        Transacciones = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_trans = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        pf_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        CrearATM.setTitle("Crear ATM");
        CrearATM.setResizable(false);

        jLabel4.setText("Ubicacion:");

        jLabel5.setText("ID:");

        jLabel6.setText("Año de Fabricacion:");

        jButton4.setText("Crear ATM");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CrearATMLayout = new javax.swing.GroupLayout(CrearATM.getContentPane());
        CrearATM.getContentPane().setLayout(CrearATMLayout);
        CrearATMLayout.setHorizontalGroup(
            CrearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearATMLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(CrearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CrearATMLayout.createSequentialGroup()
                        .addGroup(CrearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CrearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CrearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_ubicacionatm)
                                .addComponent(tf_idatm, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                            .addComponent(yc_añoatm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CrearATMLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(82, 82, 82)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        CrearATMLayout.setVerticalGroup(
            CrearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearATMLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(CrearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_ubicacionatm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_idatm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CrearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yc_añoatm, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(36, 36, 36))
        );

        Registro.setTitle("Registro");
        Registro.setResizable(false);

        jLabel7.setText("ID:");

        jLabel8.setText("Primer Nombre:");

        jLabel9.setText("Segundo Nombre:");

        jLabel10.setText("Primer Apellido:");

        jLabel11.setText("Segundo Apellido:");

        jLabel12.setText("Año de Nacimiento:");

        tf_snombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_snombreActionPerformed(evt);
            }
        });

        jLabel13.setText("Tipo Usuario:");

        cb_tipousuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Mantenimiento" }));

        jButton5.setText("Registrarse");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jLabel14.setText("Usuario:");

        jLabel16.setText("Contraseña:");

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro.getContentPane());
        Registro.getContentPane().setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_idusuario)
                    .addComponent(tf_pnombre)
                    .addComponent(tf_snombre)
                    .addComponent(tf_papellido)
                    .addComponent(tf_sapellido)
                    .addComponent(yc_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tipousuario, 0, 160, Short.MAX_VALUE)
                    .addComponent(tf_usuario)
                    .addComponent(pf_passregistro)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton5)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_idusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(pf_passregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_pnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_snombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_papellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_sapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yc_año, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cb_tipousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        MenuClientes.setUndecorated(true);
        MenuClientes.setResizable(false);
        MenuClientes.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                MenuClientesWindowClosing(evt);
            }
        });

        jButton6.setText("Retirar Dinero");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("Ingresar Dinero a Cuenta Personal");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("Ingresar Dinero a Otra Cuenta");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("Crear Nueva Cuenta");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setText("Revisar Estado de Cuenta");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jLabel15.setText("Cuenta Seleccionada:");

        jButton11.setText("Salir");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setText("Ver Transacciones");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuClientesLayout = new javax.swing.GroupLayout(MenuClientes.getContentPane());
        MenuClientes.getContentPane().setLayout(MenuClientesLayout);
        MenuClientesLayout.setHorizontalGroup(
            MenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuClientesLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(MenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cb_cuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        MenuClientesLayout.setVerticalGroup(
            MenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuClientesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_cuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel17.setText("Seleccione ATM:");

        cb_atms.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_atmsItemStateChanged(evt);
            }
        });

        jLabel18.setText("Billetes de 500 Disponibles:");

        jLabel19.setText("Billetes de 100 Disponibles:");

        jl_500.setText("jLabel20");

        jl_100.setText("jLabel20");

        jLabel20.setText("Saldo en su Cuenta:");

        jl_saldo.setText("jLabel21");

        jLabel22.setText("Billetes de 500 a Retirar:");

        jLabel23.setText("Billetes de 100 a Retirar:");

        sp_500.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        sp_100.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jButton13.setText("Retirar");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jLabel21.setText("ID:");

        jLabel24.setText("Contraseña:");

        javax.swing.GroupLayout RetiroDineroLayout = new javax.swing.GroupLayout(RetiroDinero.getContentPane());
        RetiroDinero.getContentPane().setLayout(RetiroDineroLayout);
        RetiroDineroLayout.setHorizontalGroup(
            RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RetiroDineroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RetiroDineroLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RetiroDineroLayout.createSequentialGroup()
                        .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_atms, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jl_100, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addComponent(jl_500, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(RetiroDineroLayout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sp_100))
                        .addGroup(RetiroDineroLayout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sp_500, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RetiroDineroLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton13))
                    .addGroup(RetiroDineroLayout.createSequentialGroup()
                        .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pf_passretiro)
                            .addComponent(tf_idretiro, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        RetiroDineroLayout.setVerticalGroup(
            RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RetiroDineroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cb_atms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jl_500))
                .addGap(18, 18, 18)
                .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jl_100))
                .addGap(18, 18, 18)
                .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jl_saldo))
                .addGap(18, 18, 18)
                .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf_idretiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(pf_passretiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(sp_500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RetiroDineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(sp_100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        Transacciones.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                TransaccionesWindowClosing(evt);
            }
        });

        jt_trans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Cuenta", "Descripcion", "ID", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_trans);
        if (jt_trans.getColumnModel().getColumnCount() > 0) {
            jt_trans.getColumnModel().getColumn(0).setResizable(false);
            jt_trans.getColumnModel().getColumn(1).setResizable(false);
            jt_trans.getColumnModel().getColumn(2).setResizable(false);
            jt_trans.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout TransaccionesLayout = new javax.swing.GroupLayout(Transacciones.getContentPane());
        Transacciones.getContentPane().setLayout(TransaccionesLayout);
        TransaccionesLayout.setHorizontalGroup(
            TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        TransaccionesLayout.setVerticalGroup(
            TransaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Examen #2 Camilo Ferrera");

        jLabel2.setText("Usuario:");

        jLabel3.setText("Contraseña:");

        jButton1.setText("Inicar Sesion");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Registrarse");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Crear ATM");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_user)
                                .addComponent(pf_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(55, 55, 55)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if (tf_ubicacionatm.getText().isEmpty() || tf_idatm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(CrearATM, "Hay campos vacios.");
        } else {
            String u = tf_ubicacionatm.getText();
            String id = tf_idatm.getText();
            int año = yc_añoatm.getYear();
            
            boolean idvalido = true;
            for (int i = 0; i < atms.size(); i++) {
                if (id.equals(atms.get(i).getId())) {
                    idvalido = false;
                    break;
                }
            }
            
            if (idvalido == true) {
                atms.add(new ATM (u,id,año));
                JOptionPane.showMessageDialog(CrearATM, "ATM creado con exito.");
                CrearATM.setVisible(false);
                
                tf_ubicacionatm.setText("");
                tf_idatm.setText("");
                yc_añoatm.setYear(2020);
                
            } else {
                JOptionPane.showMessageDialog(CrearATM, "ID ya ocupado, intente con otro.");
            }
        }
                    
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        CrearATM.pack();
        CrearATM.setModal(true);
        CrearATM.setLocationRelativeTo(this);
        CrearATM.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (tf_user.getText().isEmpty() || pf_pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hay campos vacios.");
        } else {
            boolean login = false;
            for (int i = 0; i < usuarios.size(); i++) {
                if (tf_user.getText().equals(usuarios.get(i).getUsuario()) && pf_pass.getText().equals(usuarios.get(i).getContraseña())) {
                    login = true;
                    this.flag = i;
                    break;
                }
            }

            if (login == true) {
                
                if (usuarios.get(flag) instanceof Cliente) {
                    DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_cuentas.getModel();
                    for (int i = 0; i < ((Cliente)usuarios.get(flag)).getCuentas().size(); i++) {
                        cb.addElement(((Cliente)usuarios.get(flag)).getCuentas().get(i));
                    }
                    cb_cuentas.setModel(cb);
                    
                    cb_atms.setSelectedIndex(0);
                    jl_100.setText(Long.toString(atms.get(0).getBilletesDe100()));
                    jl_500.setText(Long.toString(atms.get(0).getBilletesDe500()));
                                        
                    MenuClientes.pack();
                    MenuClientes.setLocationRelativeTo(this);
                    MenuClientes.setVisible(true);

                    this.setVisible(false);
                    tf_user.setText("");
                    pf_pass.setText("");
                    
                } else {

                }
                
                log.add(usuarios.get(flag) + " inicio sesión el: " + new Date());
            } else {
                JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña incorrecto/s");
            }
        }
        
            
    }//GEN-LAST:event_jButton1MouseClicked

    private void tf_snombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_snombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_snombreActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if (tf_idusuario.getText().isEmpty() || tf_pnombre.getText().isEmpty() || tf_snombre.getText().isEmpty() || tf_papellido.getText().isEmpty() 
                || tf_sapellido.getText().isEmpty() || tf_usuario.getText().isEmpty() || pf_passregistro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(Registro, "Hay campos vacios.");
        } else {
            String u = tf_usuario.getText(),
            pass = pf_passregistro.getText(),
            pn = tf_pnombre.getText(),
            sn = tf_snombre.getText(),
            pa = tf_papellido.getText(),
            sa = tf_sapellido.getText(),
            id = tf_idusuario.getText();
            int año = yc_año.getYear();
            
            boolean idvalido = true;
            for (int i = 0; i < usuarios.size(); i++) {
                if (id.equals(usuarios.get(i).getId())) {
                    idvalido = false;
                    break;
                }
            }
            
            boolean usuariovalido = true; 
            for (int i = 0; i < usuarios.size(); i++) {
                if (u.equals(usuarios.get(i).getUsuario())) {
                    usuariovalido = false;
                }
            }
            
            if (idvalido == true && usuariovalido == true) {
                if (cb_tipousuario.getSelectedIndex() == 0) {
                    usuarios.add(new Cliente (u,pass,pn,sn,pa,sa,id,año,2020));
                } else {
                    usuarios.add(new Mantenimiento (u,pass,pn,sn,pa,sa,id,año,2020));
                }
                
                JOptionPane.showMessageDialog(Registro, "Registrado exitosamente!");
                
                Registro.setVisible(false);
                tf_usuario.setText("");
                tf_pnombre.setText("");
                tf_snombre.setText("");
                tf_papellido.setText("");
                tf_sapellido.setText("");
                yc_año.setYear(2020);
                cb_tipousuario.setSelectedIndex(0);
            } else {
                if (idvalido == false) {
                    JOptionPane.showMessageDialog(Registro, "ID ya ocupado.");
                    tf_idusuario.setText("");
                }
                if (usuariovalido == false) {
                    JOptionPane.showMessageDialog(Registro, "Nombre de usuario ya ocupado.");
                    tf_usuario.setText("");
                }
                
            }
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Registro.pack();
        Registro.setModal(true);
        Registro.setLocationRelativeTo(this);
        Registro.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        if (((Cliente)usuarios.get(flag)).getCuentas().size() == 0) {
            JOptionPane.showMessageDialog(MenuClientes, "No tiene ninguna cuenta creada.");
        } else {
            if (acciones == 0) {
                jl_saldo.setText(Long.toString(((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()).getSaldo()));
                RetiroDinero.pack();
                RetiroDinero.setModal(true);
                RetiroDinero.setLocationRelativeTo(MenuClientes);
                RetiroDinero.setVisible(true);
                             
            } else {
                JOptionPane.showMessageDialog(MenuClientes, "Ya ha realizado una accion en el ATM. ");
            }
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        if (((Cliente)usuarios.get(flag)).getCuentas().size() == 0) {
            JOptionPane.showMessageDialog(MenuClientes, "No tiene ninguna cuenta creada.");
        } else {
            if (acciones == 0) {
                try {
                    long x = Long.parseLong(JOptionPane.showInputDialog(MenuClientes, "Ingrese cantidad a ingresar:"));
                    ((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()).setSaldo(x);
                    JOptionPane.showMessageDialog(MenuClientes, "Dinero ingreasado a su cuenta seleccionada!");
                    usuarios.get(flag).getTransacciones().add(new Transaccion (((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()).getNumeroDeCuenta(),"ingreso dinero a su cuenta",usuarios.get(flag).getId(),new Date()));
                    acciones++;
                    
                    log.add(usuarios.get(flag) + " ingreso " + x + " Lempiras a su cuenta: " + ((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(MenuClientes, "Hubo un error, intente de nuevo.");
                }  
            } else {
                JOptionPane.showMessageDialog(MenuClientes, "Ya ha realizado una accion en el ATM.");
            }
                  
        }           
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        if (((Cliente)usuarios.get(flag)).getCuentas().size() == 0) {
            JOptionPane.showMessageDialog(MenuClientes, "No tiene ninguna cuenta creada.");
        } else {
            JOptionPane.showMessageDialog(MenuClientes, "Saldo: " + Long.toString(((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()).getSaldo()) + " Lempiras");
        }
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        MenuClientes.setVisible(false);
        DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_cuentas.getModel();
        cb.removeAllElements();
        cb_cuentas.setModel(cb);
        
        DefaultTableModel modelo = (DefaultTableModel) jt_trans.getModel();
        int tamaño = modelo.getRowCount();
        for (int i = 0; i < tamaño; i++) {
            modelo.removeRow(0);
        }
        jt_trans.setModel(modelo);
        
        acciones = 0;
        contpass = 0;
        this.setVisible(true);
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        if (acciones == 0) {
            try {
                long x = Long.parseLong(JOptionPane.showInputDialog(MenuClientes,"Ingrese numero de cuenta: "));
                
                boolean cuentavalida = true;
                for (int i = 0; i < usuarios.size(); i++) {
                    if (usuarios.get(i) instanceof Cliente) {
                        for (int j = 0; j < ((Cliente)usuarios.get(i)).getCuentas().size(); j++) {
                            if (x ==  ((Cliente)usuarios.get(i)).getCuentas().get(j).getNumeroDeCuenta()) {
                                cuentavalida = false;
                                break;
                            }
                        }
                    }
                }
                
                if (cuentavalida == true) {
                    JOptionPane.showMessageDialog(MenuClientes, "Cuenta creada exitosamente!");
                    ((Cliente)usuarios.get(flag)).getCuentas().add(new Cuenta (x));

                    DefaultComboBoxModel cb = (DefaultComboBoxModel) cb_cuentas.getModel();
                    cb.addElement(new Cuenta (x));
                    cb_cuentas.setModel(cb);

                    acciones++;
                } else {
                    JOptionPane.showMessageDialog(MenuClientes, "Este numero de cuenta ya existe en el sistema.");
                }
                
                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(MenuClientes, "Hubo un error, intente de nuevo.");
            }
        } else {
            JOptionPane.showMessageDialog(MenuClientes, "Ya ha realizado una accion en el ATM.");
        }
            
    }//GEN-LAST:event_jButton9MouseClicked

    private void MenuClientesWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_MenuClientesWindowClosing
        System.exit(0);
    }//GEN-LAST:event_MenuClientesWindowClosing

    private void cb_atmsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_atmsItemStateChanged
        ATM x = (ATM)cb_atms.getSelectedItem();
        jl_100.setText(Integer.toString(x.getBilletesDe100()));
        jl_500.setText(Integer.toString(x.getBilletesDe500()));   
    }//GEN-LAST:event_cb_atmsItemStateChanged

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        if (tf_idretiro.getText().isEmpty() || pf_passregistro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(RetiroDinero, "Hay campos vacios.");
        } else {
            if (pf_pass.getText().equals(usuarios.get(flag).getContraseña())) {
                boolean idvalido = false;
                int bandera = 0;
                for (int i = 0; i < usuarios.size(); i++) {
                    if (tf_idretiro.getText().equals(usuarios.get(i).getId())) {
                        idvalido = true;
                        bandera = i;
                        break;
                    }
                }
                
                if (idvalido == true) {
                    
                    int cien = (int)sp_100.getValue();
                    int quin = (int)sp_500.getValue();

                    if (cien > atms.get(cb_atms.getSelectedIndex()).getBilletesDe100() || quin > atms.get(cb_atms.getSelectedIndex()).getBilletesDe500()) {
                        JOptionPane.showMessageDialog(RetiroDinero, "No hay billetes suficientes.");
                    } else {
                        int total = cien*100 + quin*500;
                        if (total > ((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()).getSaldo()) {
                            JOptionPane.showMessageDialog(RetiroDinero, "Saldo insuficiente.");
                            log.add(usuarios.get(flag) + " hizo un retiro fallido de " + total + " Lempiras");
                        } else {
                            ((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()).setSaldo(((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()).getSaldo() - total);
                            JOptionPane.showMessageDialog(RetiroDinero, "Dinero retirado exitosamente!");

                            RetiroDinero.setVisible(false);
                            sp_100.setValue(0);
                            sp_500.setValue(0);

                            atms.get(cb_atms.getSelectedIndex()).setBilletesDe100(atms.get(cb_atms.getSelectedIndex()).getBilletesDe100()-cien);
                            atms.get(cb_atms.getSelectedIndex()).setBilletesDe500(atms.get(cb_atms.getSelectedIndex()).getBilletesDe500()-quin);

                            acciones++;
                            log.add(usuarios.get(flag) + " ha hecho un retiro de " + total + " Lempiras con " + cien + " billetes de 100 y " + quin + " billetes de 500 con el ID: " + usuarios.get(bandera).getId());
                        }
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(RetiroDinero, "No se encontro el ID.");
                    log.add("No se encontro ningun ID cuando desde la cuenta " + usuarios.get(flag) + " el " + new Date());
                }
            } else {
                JOptionPane.showMessageDialog(RetiroDinero, "Contraseña incorrecta.");
                contpass ++;             
                if (contpass % 5 == 0) {
                    JOptionPane.showMessageDialog(RetiroDinero, "Tenga cuidado.");
                    log.add(usuarios.get(flag) + " se equivoco cinco veces en su contraseña el " + new Date());
                }
            }
        }
        
        
                    
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        if (((Cliente)usuarios.get(flag)).getCuentas().size() ==  0) {
            JOptionPane.showMessageDialog(MenuClientes, "No tiene cuentas creadas.");
        } else {
            if (acciones == 0) {
                try {
                    long transferencia = Long.parseLong(JOptionPane.showInputDialog(MenuClientes, "Ingrese monto a transferir:"));
                    if (transferencia > ((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()).getSaldo()) {
                        JOptionPane.showMessageDialog(MenuClientes, "Saldo insuficiente.");
                    } else {
                        long x = Long.parseLong(JOptionPane.showInputDialog(MenuClientes,"Ingrese numero de cuenta a transferir el monto: "));
                        
                        boolean numvalido = false;
                        for (int i = 0; i < usuarios.size(); i++) {
                            if (usuarios.get(i) instanceof Cliente) {
                                for (int j = 0; j < ((Cliente)usuarios.get(i)).getCuentas().size(); j++) {
                                    if (x ==  ((Cliente)usuarios.get(i)).getCuentas().get(j).getNumeroDeCuenta()) {
                                        numvalido = true;
                                        ((Cliente)usuarios.get(i)).getCuentas().get(j).setSaldo(((Cliente)usuarios.get(i)).getCuentas().get(j).getSaldo() + transferencia);
                                        
                                        ((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()).setSaldo(((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()).getSaldo() - transferencia);
                                        JOptionPane.showMessageDialog(MenuClientes, "Transferencia realizada exitosamente!");
                                        acciones++;
                                        Date f = new Date();
                                        log.add(usuarios.get(flag) + " transfirio " + transferencia + " Lempiras " + " desde su cuenta " + ((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()) + " a la cuenta " + x);
                                        usuarios.get(i).getTransacciones().add(new Transaccion (((Cliente)usuarios.get(i)).getCuentas().get(j).getNumeroDeCuenta()," se le deposito a esta cuenta " ,usuarios.get(i).getId(),f));
                                        usuarios.get(flag).getTransacciones().add(new Transaccion (((Cliente)usuarios.get(flag)).getCuentas().get(cb_cuentas.getSelectedIndex()).getNumeroDeCuenta(), " deposito dinero a otra cuenta ", usuarios.get(flag).getId(),f));
                                        break;
                                    }
                                }
                            }
                        }
                        
                        if (numvalido == false) {
                            JOptionPane.showMessageDialog(MenuClientes, "Numero de cuenta no encontrado, intente de nuevo.");
                            log.add(usuarios.get(flag) + " hizo una transferencia fallida el " + new Date());
                        }
                        
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(MenuClientes, "Ha ocurrido un error, intente de nuevo.");
                }
            } else {
                JOptionPane.showMessageDialog(MenuClientes, "Ya ha realizado una accion en el ATM.");
            }
        } 
        
                
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jt_trans.getModel();
        for (int i = 0; i < usuarios.get(flag).getTransacciones().size(); i++) {
            Transaccion x = usuarios.get(flag).getTransacciones().get(i);
            Object[] row = {x.getNumeroDeCuenta(),x.getDescripcion(),x.getId(),x.getFecha()};
            modelo.addRow(row);
        }
        jt_trans.setModel(modelo);
        
        Transacciones.pack();
        Transacciones.setModal(true);
        Transacciones.setLocationRelativeTo(MenuClientes);
        Transacciones.setVisible(true);
    }//GEN-LAST:event_jButton12MouseClicked

    private void TransaccionesWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_TransaccionesWindowClosing
        DefaultTableModel modelo = (DefaultTableModel) jt_trans.getModel();
        int tamaño = modelo.getRowCount();
        for (int i = 0; i < tamaño; i++) {
            modelo.removeRow(0);
        }
        jt_trans.setModel(modelo);
    }//GEN-LAST:event_TransaccionesWindowClosing

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter (new File ("Log.txt"),false);
            bw = new BufferedWriter(fw);
            
            for (int i = 0; i < log.size(); i++) {
                bw.write(log.get(i) + "\n");
            }
            bw.flush();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        
        try {
            fw = new FileWriter (new File ("Transacciones.txt"),false);
            bw = new BufferedWriter(fw);
            
            for (int i = 0; i < usuarios.size(); i++) {
                for (int j = 0; j < usuarios.get(i).getTransacciones().size(); j++) {
                    bw.write(usuarios.get(i).getTransacciones().get(j) + "\n");
                }
            }
            bw.flush();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog CrearATM;
    private javax.swing.JDialog MenuClientes;
    private javax.swing.JDialog Registro;
    private javax.swing.JDialog RetiroDinero;
    private javax.swing.JDialog Transacciones;
    private javax.swing.JComboBox<String> cb_atms;
    private javax.swing.JComboBox<String> cb_cuentas;
    private javax.swing.JComboBox<String> cb_tipousuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_100;
    private javax.swing.JLabel jl_500;
    private javax.swing.JLabel jl_saldo;
    private javax.swing.JTable jt_trans;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JPasswordField pf_passregistro;
    private javax.swing.JPasswordField pf_passretiro;
    private javax.swing.JSpinner sp_100;
    private javax.swing.JSpinner sp_500;
    private javax.swing.JTextField tf_idatm;
    private javax.swing.JTextField tf_idretiro;
    private javax.swing.JTextField tf_idusuario;
    private javax.swing.JTextField tf_papellido;
    private javax.swing.JTextField tf_pnombre;
    private javax.swing.JTextField tf_sapellido;
    private javax.swing.JTextField tf_snombre;
    private javax.swing.JTextField tf_ubicacionatm;
    private javax.swing.JTextField tf_user;
    private javax.swing.JTextField tf_usuario;
    private com.toedter.calendar.JYearChooser yc_año;
    private com.toedter.calendar.JYearChooser yc_añoatm;
    // End of variables declaration//GEN-END:variables
    ArrayList<ATM> atms = new ArrayList();
    ArrayList<Usuario> usuarios = new ArrayList();
    ArrayList<String> log = new ArrayList();
    int flag,acciones = 0,contpass=0;
}