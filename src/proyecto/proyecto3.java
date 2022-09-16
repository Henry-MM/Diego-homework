/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author FAMILIA
 */
public class proyecto3 extends javax.swing.JFrame {

    ArrayList<tarea> listatareas = new ArrayList();
    String vartemp = "";
    boolean ban = false;

    public proyecto3() {
        initComponents();

        doc = textpane.getStyledDocument();
        estilo = textpane.addStyle("miestilo", null);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fn[] = ge.getAvailableFontFamilyNames();
        DefaultComboBoxModel rh = (DefaultComboBoxModel) estiloletra.getModel();
        for (int i = 0; i < fn.length; i++) {
            rh.addElement(fn[i]);
        }
        estiloletra.setModel(rh);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearTarea = new javax.swing.JPanel();
        jdc_fechavencimiento = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_descripcion = new javax.swing.JTextArea();
        combobox_personas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        creartarea = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        botonimportancia = new javax.swing.JRadioButton();
        menutareas = new javax.swing.JPopupMenu();
        eliminar = new javax.swing.JMenuItem();
        agregartarea = new javax.swing.JMenuItem();
        marcarcomoimportante = new javax.swing.JMenuItem();
        Tareas = new javax.swing.JDialog();
        jb_midia = new javax.swing.JButton();
        jb_tareasimportantes = new javax.swing.JButton();
        jb_listatareas = new javax.swing.JButton();
        Iconos = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        TAREAS = new javax.swing.JLabel();
        CORREO = new javax.swing.JLabel();
        DROPBOX = new javax.swing.JLabel();
        ADMIN = new javax.swing.JLabel();
        text = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textpane = new javax.swing.JTextPane();
        tamanioletra = new javax.swing.JComboBox<>();
        estiloletra = new javax.swing.JComboBox<>();
        italicletra = new javax.swing.JButton();
        negritaletra = new javax.swing.JButton();
        subrayadoletra = new javax.swing.JButton();
        backgroundletra = new javax.swing.JButton();
        colorletra = new javax.swing.JButton();
        crearunacuenta = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombrepersonacuenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edad = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        contracrearusuario = new javax.swing.JTextField();
        crearcuentaboton = new javax.swing.JButton();
        importancia = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        admin = new javax.swing.JDialog();
        botonlistarusuarios = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        crearusuarioboton = new javax.swing.JButton();
        listarusuarios = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listausuarios = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pf_contrasenia = new javax.swing.JPasswordField();
        tf_nombredeusuario = new javax.swing.JTextField();
        Entrar = new java.awt.Button();

        jLabel3.setText("Fecha de Vencimiento:");

        jLabel4.setText("Descripcion: ");

        ta_descripcion.setColumns(20);
        ta_descripcion.setRows(5);
        jScrollPane2.setViewportView(ta_descripcion);

        combobox_personas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox_personasItemStateChanged(evt);
            }
        });

        jLabel5.setText("Asignar Tarea a:");

        creartarea.setText("Crear Tarea");
        creartarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creartareaMouseClicked(evt);
            }
        });

        jLabel6.setText("Nombre:");

        botonimportancia.setText("Importante");
        botonimportancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonimportanciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearTareaLayout = new javax.swing.GroupLayout(CrearTarea);
        CrearTarea.setLayout(CrearTareaLayout);
        CrearTareaLayout.setHorizontalGroup(
            CrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearTareaLayout.createSequentialGroup()
                .addGroup(CrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrearTareaLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(CrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(combobox_personas, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(CrearTareaLayout.createSequentialGroup()
                                    .addGroup(CrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addGap(77, 77, 77)
                                    .addGroup(CrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(CrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tf_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jdc_fechavencimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))))
                            .addGroup(CrearTareaLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5))))
                    .addGroup(CrearTareaLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(creartarea))
                    .addGroup(CrearTareaLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(botonimportancia)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        CrearTareaLayout.setVerticalGroup(
            CrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearTareaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(CrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdc_fechavencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CrearTareaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)))
                .addGap(40, 40, 40)
                .addGroup(CrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(botonimportancia)
                .addGap(43, 43, 43)
                .addGroup(CrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(combobox_personas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(creartarea)
                .addGap(53, 53, 53))
        );

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        menutareas.add(eliminar);

        agregartarea.setText("jMenuItem4");
        menutareas.add(agregartarea);

        marcarcomoimportante.setText("jMenuItem5");
        menutareas.add(marcarcomoimportante);

        jb_midia.setText("Mi dia");
        jb_midia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_midiaActionPerformed(evt);
            }
        });

        jb_tareasimportantes.setText("Tareas Importantes");

        jb_listatareas.setText("Lista de Tareas");
        jb_listatareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_listatareasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TareasLayout = new javax.swing.GroupLayout(Tareas.getContentPane());
        Tareas.getContentPane().setLayout(TareasLayout);
        TareasLayout.setHorizontalGroup(
            TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TareasLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_tareasimportantes)
                    .addComponent(jb_midia)
                    .addComponent(jb_listatareas))
                .addContainerGap(1016, Short.MAX_VALUE))
        );
        TareasLayout.setVerticalGroup(
            TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TareasLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jb_midia)
                .addGap(110, 110, 110)
                .addComponent(jb_tareasimportantes)
                .addGap(104, 104, 104)
                .addComponent(jb_listatareas)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TAREAS.setText("TAREAS");
        TAREAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TAREASMouseClicked(evt);
            }
        });

        CORREO.setText("CORREO");

        DROPBOX.setText("DROPBOX");

        ADMIN.setText("ADMIN");
        ADMIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADMINMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout IconosLayout = new javax.swing.GroupLayout(Iconos.getContentPane());
        Iconos.getContentPane().setLayout(IconosLayout);
        IconosLayout.setHorizontalGroup(
            IconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IconosLayout.createSequentialGroup()
                .addGroup(IconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IconosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IconosLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(IconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(IconosLayout.createSequentialGroup()
                                .addComponent(DROPBOX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ADMIN))
                            .addGroup(IconosLayout.createSequentialGroup()
                                .addComponent(TAREAS)
                                .addGap(321, 321, 321)
                                .addComponent(CORREO)))))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        IconosLayout.setVerticalGroup(
            IconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IconosLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(IconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IconosLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(TAREAS))
                    .addGroup(IconosLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(CORREO)))
                .addGap(166, 166, 166)
                .addGroup(IconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DROPBOX)
                    .addComponent(ADMIN))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(textpane);

        tamanioletra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tamanioletraItemStateChanged(evt);
            }
        });
        tamanioletra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanioletraActionPerformed(evt);
            }
        });

        estiloletra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                estiloletraItemStateChanged(evt);
            }
        });
        estiloletra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                estiloletraKeyPressed(evt);
            }
        });

        italicletra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                italicletraMouseClicked(evt);
            }
        });

        negritaletra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                negritaletraMouseClicked(evt);
            }
        });

        subrayadoletra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subrayadoletraMouseClicked(evt);
            }
        });

        backgroundletra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundletraMouseClicked(evt);
            }
        });

        colorletra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorletraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout textLayout = new javax.swing.GroupLayout(text);
        text.setLayout(textLayout);
        textLayout.setHorizontalGroup(
            textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(textLayout.createSequentialGroup()
                        .addComponent(estiloletra, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(tamanioletra, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(italicletra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(negritaletra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subrayadoletra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backgroundletra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(colorletra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        textLayout.setVerticalGroup(
            textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tamanioletra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(estiloletra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(italicletra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(negritaletra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subrayadoletra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backgroundletra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorletra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Crear Cuenta");

        jLabel8.setText("Proporcione su Nombre: ");

        jLabel9.setText("Edad:");

        edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 122, 1));

        jLabel10.setText("Nombre de Usuario:");

        jLabel11.setText("Contrasenia: ");

        crearcuentaboton.setText("Crear Cuenta");
        crearcuentaboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearcuentabotonMouseClicked(evt);
            }
        });

        importancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));

        jLabel12.setText("Rol:");

        javax.swing.GroupLayout crearunacuentaLayout = new javax.swing.GroupLayout(crearunacuenta);
        crearunacuenta.setLayout(crearunacuentaLayout);
        crearunacuentaLayout.setHorizontalGroup(
            crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearunacuentaLayout.createSequentialGroup()
                .addGroup(crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearunacuentaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(crearunacuentaLayout.createSequentialGroup()
                                .addGroup(crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(crearunacuentaLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(crearunacuentaLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(nombrepersonacuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                    .addGroup(crearunacuentaLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(username))
                                    .addGroup(crearunacuentaLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(contracrearusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(crearunacuentaLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(importancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65))))
                    .addGroup(crearunacuentaLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(crearcuentaboton)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        crearunacuentaLayout.setVerticalGroup(
            crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearunacuentaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addGap(55, 55, 55)
                .addGroup(crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nombrepersonacuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(contracrearusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(crearcuentaboton)
                .addGap(19, 19, 19))
        );

        botonlistarusuarios.setText("Listar Usuarios");
        botonlistarusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonlistarusuariosMouseClicked(evt);
            }
        });
        botonlistarusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlistarusuariosActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar Usuarios");

        jButton3.setText("Eliminar Usuarios");

        crearusuarioboton.setText("Crear Usuario");
        crearusuarioboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearusuariobotonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout adminLayout = new javax.swing.GroupLayout(admin.getContentPane());
        admin.getContentPane().setLayout(adminLayout);
        adminLayout.setHorizontalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crearusuarioboton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonlistarusuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(681, Short.MAX_VALUE))
        );
        adminLayout.setVerticalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(botonlistarusuarios)
                .addGap(55, 55, 55)
                .addComponent(jButton2)
                .addGap(46, 46, 46)
                .addComponent(jButton3)
                .addGap(52, 52, 52)
                .addComponent(crearusuarioboton)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        listausuarios.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(listausuarios);

        javax.swing.GroupLayout listarusuariosLayout = new javax.swing.GroupLayout(listarusuarios);
        listarusuarios.setLayout(listarusuariosLayout);
        listarusuariosLayout.setHorizontalGroup(
            listarusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarusuariosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        listarusuariosLayout.setVerticalGroup(
            listarusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarusuariosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrar ");

        jLabel1.setText("Nombre de Usuario:");

        jLabel2.setText("Contrasenia:");

        tf_nombredeusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombredeusuarioActionPerformed(evt);
            }
        });

        Entrar.setLabel("Entrar");
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pf_contrasenia)
                            .addComponent(tf_nombredeusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombredeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pf_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrar(JDialog cosa) {
        cosa.setModal(true);
        cosa.pack();
        cosa.setLocationRelativeTo(this);
        cosa.setVisible(true);
    }

    private void cerrar(JDialog cosa) {
        cosa.dispose();
    }
    private void creartareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creartareaMouseClicked
        
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        String t = "false";

        try {
            if (botonimportancia.isSelected()) {
                t = "true";
            }

            x1.query.execute(" INSERT INTO tareas (asignado,importancia,Fecha,contenido)  VALUES ('" + combobox_personas.getSelectedItem()
                    + "','" + t + "','" + jdc_fechavencimiento.getDate() + "','" + ta_descripcion.getText() + "',"+tf_nombre.getText()+")");

        } catch (Exception v) {
            v.printStackTrace();
        }
        x1.desconectar();
//Date vencimiento, boolean importante, String asignado, String contenido
    }//GEN-LAST:event_creartareaMouseClicked
    public void visible(JPanel panelgay) {
        for (Component component : panelgay.getComponents()) {
            component.setVisible(true);
        }
    }// fin de invisible

    public void invisible(JPanel panelgay) {
        for (Component component : panelgay.getComponents()) {
            component.setVisible(false);
        }
    }// fin de invisible

    private void jb_midiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_midiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_midiaActionPerformed

    private void TAREASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TAREASMouseClicked
        entrar(Tareas);
        cerrar(Iconos);
    }//GEN-LAST:event_TAREASMouseClicked

    private void EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseClicked
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        boolean bandera = false;
        boolean bandera2 = false;
        try {
            x1.query.execute("select nombre,contra,importancia from usuarios");

            ResultSet rs = x1.query.getResultSet();

            while (rs.next()) {

                if (rs.getString(1).equals(tf_nombredeusuario.getText()) && rs.getString(2).equals(pf_contrasenia.getText())) {
                    bandera = true;
                    vartemp = tf_nombredeusuario.getText();
                    if (rs.getString(3).equals("true")) {
                        bandera2 = true;
                    }
                }
            }
            if (bandera == false) {
                JOptionPane.showMessageDialog(Entrar, "Contrasenia o nombre de usuario incorrecto");
            } else {
                ADMIN.setVisible(bandera2);
                entrar(Iconos);
            }
        } catch (Exception v) {
            v.printStackTrace();
        }
        x1.desconectar();
    }//GEN-LAST:event_EntrarMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

    }//GEN-LAST:event_eliminarActionPerformed

    private void jb_listatareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_listatareasMouseClicked
        CrearTarea.setSize(853, 528);
        CrearTarea.setLocation(250, 300);
        Tareas.add(CrearTarea, BorderLayout.WEST);
        Tareas.revalidate();
        Tareas.repaint();
    }//GEN-LAST:event_jb_listatareasMouseClicked

    private void colorletraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorletraMouseClicked
        try {
            StyleConstants.setForeground(estilo, JColorChooser.showDialog(colorletra, "Seleccione el Color", Color.red));
            doc.setCharacterAttributes(textpane.getSelectionStart(), textpane.getSelectionEnd() - textpane.getSelectionStart(), textpane.getStyle("miestilo"), true);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_colorletraMouseClicked

    private void backgroundletraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundletraMouseClicked
        try {
            StyleConstants.setBackground(estilo, JColorChooser.showDialog(colorletra, "Seleccione el Color", Color.red));
            doc.setCharacterAttributes(textpane.getSelectionStart(), textpane.getSelectionEnd() - textpane.getSelectionStart(), textpane.getStyle("miestilo"), true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_backgroundletraMouseClicked

    private void subrayadoletraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subrayadoletraMouseClicked
        try {
            StyleConstants.setUnderline(estilo, true);
            doc.setCharacterAttributes(textpane.getSelectionStart(), textpane.getSelectionEnd() - textpane.getSelectionStart(), textpane.getStyle("miestilo"), true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_subrayadoletraMouseClicked

    private void negritaletraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_negritaletraMouseClicked
        try {
            StyleConstants.setBold(estilo, true);
            doc.setCharacterAttributes(textpane.getSelectionStart(), textpane.getSelectionEnd() - textpane.getSelectionStart(), textpane.getStyle("miestilo"), true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_negritaletraMouseClicked

    private void italicletraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_italicletraMouseClicked
        try {
            StyleConstants.setItalic(estilo, true);
            doc.setCharacterAttributes(textpane.getSelectionStart(), textpane.getSelectionEnd() - textpane.getSelectionStart(), textpane.getStyle("miestilo"), true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_italicletraMouseClicked

    private void tamanioletraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanioletraActionPerformed
        try {
            StyleConstants.setFontSize(estilo, Integer.parseInt(tamanioletra.getSelectedItem().toString()));
            doc.setCharacterAttributes(textpane.getSelectionStart(), textpane.getSelectionEnd() - textpane.getSelectionStart(), textpane.getStyle("miestilo"), true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_tamanioletraActionPerformed

    private void estiloletraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_estiloletraItemStateChanged

        try {
            StyleConstants.setFontFamily(estilo, estiloletra.getSelectedItem().toString());
            doc.setCharacterAttributes(textpane.getSelectionStart(), textpane.getSelectionEnd() - textpane.getSelectionStart(), textpane.getStyle("miestilo"), true);
        } catch (Exception e) {

        }

    }//GEN-LAST:event_estiloletraItemStateChanged

    private void crearcuentabotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearcuentabotonMouseClicked

        if (nombrepersonacuenta.getText().equals("") || username.getText().equals("") || contracrearusuario.getText().equals("")) {
            JOptionPane.showMessageDialog(crearcuentaboton, "No se permiten espacion vacios");
        } else {
            dba x1 = new dba("./Database2.accdb");
            x1.conectar();

            boolean bandera = false;

            try {
                x1.query.execute("select nombre,contra from usuarios");

                ResultSet rs = x1.query.getResultSet();

                while (rs.next()) {

                    if (rs.getString(1).equals(username.getText()) && rs.getString(2).equals(contracrearusuario.getText())) {
                        bandera = true;

                    }
                }
                if (bandera == true) {
                    JOptionPane.showMessageDialog(Entrar, "Usuario o contrasenia repetido, no se permite");
                } else {
                    String b = "";
                    if (importancia.getSelectedItem().equals("Administrador")) {
                        b = "true";
                    } else {
                        b = "false";
                    }
                    x1.query.execute(" INSERT INTO usuarios (nombre,contra,importancia)  VALUES ('" + username.getText() + "','" + contracrearusuario.getText() + "','" + b + "')");
                    JOptionPane.showMessageDialog(Entrar, "Usuario agregado");
                    invisible(crearunacuenta);
                    crearunacuenta.setVisible(false);
                    contracrearusuario.setText("");
                    nombrepersonacuenta.setText("");
                    username.setText("");
                }
            } catch (Exception v) {
                v.printStackTrace();
            }
            x1.desconectar();
        }
    }//GEN-LAST:event_crearcuentabotonMouseClicked

    private void tamanioletraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tamanioletraItemStateChanged
        DefaultComboBoxModel rt = (DefaultComboBoxModel) tamanioletra.getModel();
        for (int i = 1; i < 34; i++) {
            rt.addElement(i * 2);
        }
    }//GEN-LAST:event_tamanioletraItemStateChanged

    private void estiloletraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estiloletraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_estiloletraKeyPressed

    private void tf_nombredeusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombredeusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombredeusuarioActionPerformed

    private void botonlistarusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonlistarusuariosMouseClicked
        invisible(crearunacuenta);
        crearunacuenta.setVisible(false);
        visible(listarusuarios);
        listarusuarios.setVisible(true);

        listarusuarios.setSize(531, 421);
        listarusuarios.setLocation(150, 150);
        admin.add(listarusuarios, BorderLayout.NORTH);
        admin.revalidate();
        admin.repaint();
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        DefaultListModel<String> rt = new DefaultListModel();
        try {
            x1.query.execute("select nombre,contra from usuarios");

            ResultSet rs = x1.query.getResultSet();

            while (rs.next()) {

                rt.addElement(rs.getString(1));

            }// fin de while
            listausuarios.setModel(rt);
        }// fin del try
        catch (Exception ex) {
            ex.printStackTrace();

        }

    }//GEN-LAST:event_botonlistarusuariosMouseClicked

    private void botonlistarusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlistarusuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonlistarusuariosActionPerformed

    private void crearusuariobotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearusuariobotonMouseClicked
        invisible(listarusuarios);
        listarusuarios.setVisible(false);
        crearunacuenta.setSize(618, 385);
        crearunacuenta.setLocation(100, 100);
        admin.add(crearunacuenta, BorderLayout.CENTER);
        admin.revalidate();
        admin.repaint();
        nombrepersonacuenta.setText("");
        edad.setValue(0);
        username.setText("");
        contracrearusuario.setText("");

    }//GEN-LAST:event_crearusuariobotonMouseClicked

    private void ADMINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINMouseClicked
        entrar(admin);
    }//GEN-LAST:event_ADMINMouseClicked

    private void botonimportanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonimportanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonimportanciaActionPerformed

    private void combobox_personasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox_personasItemStateChanged
        DefaultComboBoxModel ry = (DefaultComboBoxModel) combobox_personas.getModel();
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        try {
             x1.query.execute("select nombre from usuarios");

                ResultSet rs = x1.query.getResultSet();

                while (rs.next()) {

                    ry.addElement(rs.getString(1));

                    }
                
            
        } catch (Exception r) {
            r.printStackTrace();
        }
    }//GEN-LAST:event_combobox_personasItemStateChanged

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
            java.util.logging.Logger.getLogger(proyecto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proyecto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proyecto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proyecto3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proyecto3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADMIN;
    private javax.swing.JLabel CORREO;
    private javax.swing.JPanel CrearTarea;
    private javax.swing.JLabel DROPBOX;
    private java.awt.Button Entrar;
    private javax.swing.JDialog Iconos;
    private javax.swing.JLabel TAREAS;
    private javax.swing.JDialog Tareas;
    private javax.swing.JDialog admin;
    private javax.swing.JMenuItem agregartarea;
    private javax.swing.JButton backgroundletra;
    private javax.swing.JRadioButton botonimportancia;
    private javax.swing.JButton botonlistarusuarios;
    private javax.swing.JButton colorletra;
    private javax.swing.JComboBox<String> combobox_personas;
    private javax.swing.JTextField contracrearusuario;
    private javax.swing.JButton crearcuentaboton;
    private javax.swing.JButton creartarea;
    private javax.swing.JPanel crearunacuenta;
    private javax.swing.JButton crearusuarioboton;
    private javax.swing.JSpinner edad;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JComboBox<String> estiloletra;
    private javax.swing.JComboBox<String> importancia;
    private javax.swing.JButton italicletra;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_listatareas;
    private javax.swing.JButton jb_midia;
    private javax.swing.JButton jb_tareasimportantes;
    private com.toedter.calendar.JDateChooser jdc_fechavencimiento;
    private javax.swing.JPanel listarusuarios;
    private javax.swing.JList<String> listausuarios;
    private javax.swing.JMenuItem marcarcomoimportante;
    private javax.swing.JPopupMenu menutareas;
    private javax.swing.JButton negritaletra;
    private javax.swing.JTextField nombrepersonacuenta;
    private javax.swing.JPasswordField pf_contrasenia;
    private javax.swing.JButton subrayadoletra;
    private javax.swing.JTextArea ta_descripcion;
    private javax.swing.JComboBox<String> tamanioletra;
    private javax.swing.JPanel text;
    private javax.swing.JTextPane textpane;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombredeusuario;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
StyledDocument doc;
    Style estilo;

}
