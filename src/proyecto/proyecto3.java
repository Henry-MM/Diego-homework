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
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import static net.ucanaccess.converters.Functions.date;

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
        jLabel17.setVisible(false);
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
        jLabel16 = new javax.swing.JLabel();
        jComboBox_editarpersonas = new javax.swing.JComboBox<>();
        admin = new javax.swing.JDialog();
        botonlistarusuarios = new javax.swing.JButton();
        jb_modificarusuarios = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        crearusuarioboton = new javax.swing.JButton();
        jButton_logincomousuario = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        listarusuarios = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listausuarios = new javax.swing.JList<>();
        eliminarusuarios = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaeliminar = new javax.swing.JList<>();
        botoneliminarpersona = new javax.swing.JButton();
        correo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        bandejadeentrada = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        redactar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        redactarcorreos = new javax.swing.JPanel();
        text1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textpane1 = new javax.swing.JTextPane();
        tamanioletra1 = new javax.swing.JComboBox<>();
        estiloletra1 = new javax.swing.JComboBox<>();
        italicletra1 = new javax.swing.JButton();
        negritaletra1 = new javax.swing.JButton();
        subrayadoletra1 = new javax.swing.JButton();
        backgroundletra1 = new javax.swing.JButton();
        colorletra1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        listartareas = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        logincuenta = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        dropbox = new javax.swing.JDialog();
        permisosaplicaciones = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pf_contrasenia = new javax.swing.JPasswordField();
        tf_nombredeusuario = new javax.swing.JTextField();
        Entrar = new java.awt.Button();
        jLabel17 = new javax.swing.JLabel();

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
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        menutareas.add(eliminar);

        agregartarea.setText("Agregar una tarea");
        agregartarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregartareaMouseClicked(evt);
            }
        });
        menutareas.add(agregartarea);

        marcarcomoimportante.setText("Marcar como Importante");
        marcarcomoimportante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marcarcomoimportanteMouseClicked(evt);
            }
        });
        menutareas.add(marcarcomoimportante);

        jb_midia.setText("Mi dia");
        jb_midia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_midiaMouseClicked(evt);
            }
        });
        jb_midia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_midiaActionPerformed(evt);
            }
        });

        jb_tareasimportantes.setText("Tareas Importantes");
        jb_tareasimportantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_tareasimportantesMouseClicked(evt);
            }
        });

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
                .addGroup(TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_tareasimportantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_midia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_listatareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel16.setText("Seleccione la persona a editar:");

        javax.swing.GroupLayout crearunacuentaLayout = new javax.swing.GroupLayout(crearunacuenta);
        crearunacuenta.setLayout(crearunacuentaLayout);
        crearunacuentaLayout.setHorizontalGroup(
            crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearunacuentaLayout.createSequentialGroup()
                .addGroup(crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearunacuentaLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addGroup(crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(crearcuentaboton)))
                    .addGroup(crearunacuentaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(crearunacuentaLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox_editarpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(importancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        crearunacuentaLayout.setVerticalGroup(
            crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearunacuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addGroup(crearunacuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBox_editarpersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
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

        jb_modificarusuarios.setText("Modificar Usuarios");
        jb_modificarusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarusuariosMouseClicked(evt);
            }
        });

        jButton3.setText("Eliminar Usuarios");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        crearusuarioboton.setText("Crear Usuario");
        crearusuarioboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearusuariobotonMouseClicked(evt);
            }
        });

        jButton_logincomousuario.setText("Meterse en la cuenta de un usuario");
        jButton_logincomousuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_logincomousuarioMouseClicked(evt);
            }
        });

        jButton10.setText("Administrar Permisos");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout adminLayout = new javax.swing.GroupLayout(admin.getContentPane());
        admin.getContentPane().setLayout(adminLayout);
        adminLayout.setHorizontalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_modificarusuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crearusuarioboton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonlistarusuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_logincomousuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(667, Short.MAX_VALUE))
        );
        adminLayout.setVerticalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(botonlistarusuarios)
                .addGap(55, 55, 55)
                .addComponent(jb_modificarusuarios)
                .addGap(46, 46, 46)
                .addComponent(jButton3)
                .addGap(52, 52, 52)
                .addComponent(crearusuarioboton)
                .addGap(44, 44, 44)
                .addComponent(jButton_logincomousuario)
                .addGap(46, 46, 46)
                .addComponent(jButton10)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        listausuarios.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(listausuarios);

        javax.swing.GroupLayout listarusuariosLayout = new javax.swing.GroupLayout(listarusuarios);
        listarusuarios.setLayout(listarusuariosLayout);
        listarusuariosLayout.setHorizontalGroup(
            listarusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarusuariosLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        listarusuariosLayout.setVerticalGroup(
            listarusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarusuariosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        listaeliminar.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(listaeliminar);

        botoneliminarpersona.setText("Eliminar");
        botoneliminarpersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoneliminarpersonaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout eliminarusuariosLayout = new javax.swing.GroupLayout(eliminarusuarios);
        eliminarusuarios.setLayout(eliminarusuariosLayout);
        eliminarusuariosLayout.setHorizontalGroup(
            eliminarusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarusuariosLayout.createSequentialGroup()
                .addGroup(eliminarusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eliminarusuariosLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(eliminarusuariosLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(botoneliminarpersona)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        eliminarusuariosLayout.setVerticalGroup(
            eliminarusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarusuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botoneliminarpersona)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bandejadeentrada.setText("Bandeja de Entrada");
        jPanel2.add(bandejadeentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, -1));

        jButton4.setText("Spam");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));

        jButton5.setText("Bandeja de Reciclaje");
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        redactar.setText("Redactar");
        jPanel2.add(redactar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        jButton6.setText("Borradores");
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, -1));

        javax.swing.GroupLayout correoLayout = new javax.swing.GroupLayout(correo.getContentPane());
        correo.getContentPane().setLayout(correoLayout);
        correoLayout.setHorizontalGroup(
            correoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        correoLayout.setVerticalGroup(
            correoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(textpane1);

        tamanioletra1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tamanioletra1ItemStateChanged(evt);
            }
        });
        tamanioletra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanioletra1ActionPerformed(evt);
            }
        });

        estiloletra1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                estiloletra1ItemStateChanged(evt);
            }
        });
        estiloletra1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                estiloletra1KeyPressed(evt);
            }
        });

        italicletra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                italicletra1MouseClicked(evt);
            }
        });

        negritaletra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                negritaletra1MouseClicked(evt);
            }
        });

        subrayadoletra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subrayadoletra1MouseClicked(evt);
            }
        });

        backgroundletra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundletra1MouseClicked(evt);
            }
        });

        colorletra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorletra1MouseClicked(evt);
            }
        });

        jLabel13.setText("Destinatario");

        jLabel14.setText("CC:");

        jButton1.setText("Enviar");

        javax.swing.GroupLayout text1Layout = new javax.swing.GroupLayout(text1);
        text1.setLayout(text1Layout);
        text1Layout.setHorizontalGroup(
            text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, text1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(text1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(text1Layout.createSequentialGroup()
                            .addComponent(estiloletra1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(tamanioletra1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(italicletra1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(negritaletra1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(subrayadoletra1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(backgroundletra1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(colorletra1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, text1Layout.createSequentialGroup()
                            .addGroup(text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(72, 72, 72)))
                    .addGroup(text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))))
        );
        text1Layout.setVerticalGroup(
            text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, text1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tamanioletra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(estiloletra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(italicletra1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(negritaletra1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subrayadoletra1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backgroundletra1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorletra1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout redactarcorreosLayout = new javax.swing.GroupLayout(redactarcorreos);
        redactarcorreos.setLayout(redactarcorreosLayout);
        redactarcorreosLayout.setHorizontalGroup(
            redactarcorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redactarcorreosLayout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        redactarcorreosLayout.setVerticalGroup(
            redactarcorreosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redactarcorreosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jList1.setModel(new DefaultListModel());
        jList1.setComponentPopupMenu(menutareas);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jList1);

        jLabel15.setText("Lista de Listas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Fecha de Vencimiento", "Asignado a"
            }
        ));
        jTable1.setComponentPopupMenu(menutareas);
        jScrollPane7.setViewportView(jTable1);

        javax.swing.GroupLayout listartareasLayout = new javax.swing.GroupLayout(listartareas);
        listartareas.setLayout(listartareasLayout);
        listartareasLayout.setHorizontalGroup(
            listartareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listartareasLayout.createSequentialGroup()
                .addGroup(listartareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listartareasLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listartareasLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel15)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        listartareasLayout.setVerticalGroup(
            listartareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listartareasLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(listartareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jButton2.setText("Login");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jScrollPane8.setViewportView(jList2);

        javax.swing.GroupLayout logincuentaLayout = new javax.swing.GroupLayout(logincuenta);
        logincuenta.setLayout(logincuentaLayout);
        logincuentaLayout.setHorizontalGroup(
            logincuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logincuentaLayout.createSequentialGroup()
                .addGroup(logincuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logincuentaLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jButton2))
                    .addGroup(logincuentaLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        logincuentaLayout.setVerticalGroup(
            logincuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logincuentaLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout dropboxLayout = new javax.swing.GroupLayout(dropbox.getContentPane());
        dropbox.getContentPane().setLayout(dropboxLayout);
        dropboxLayout.setHorizontalGroup(
            dropboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dropboxLayout.setVerticalGroup(
            dropboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton7.setText("Quitar Dropbox");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jScrollPane9.setViewportView(jList3);

        jButton8.setText("Quitar Correo");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("Quitar To-Do");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout permisosaplicacionesLayout = new javax.swing.GroupLayout(permisosaplicaciones);
        permisosaplicaciones.setLayout(permisosaplicacionesLayout);
        permisosaplicacionesLayout.setHorizontalGroup(
            permisosaplicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(permisosaplicacionesLayout.createSequentialGroup()
                .addGroup(permisosaplicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(permisosaplicacionesLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(permisosaplicacionesLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton7)
                        .addGap(44, 44, 44)
                        .addComponent(jButton8)
                        .addGap(71, 71, 71)
                        .addComponent(jButton9)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        permisosaplicacionesLayout.setVerticalGroup(
            permisosaplicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, permisosaplicacionesLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(permisosaplicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(71, 71, 71))
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

        jLabel17.setText("LOGIN COMO USUARIO: ");

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
                        .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jLabel17)))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel17)
                .addGap(50, 50, 50)
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

            x1.query.execute(" INSERT INTO tareas (asignado,importancia,Fecha,contenido,lista)  VALUES ('" + combobox_personas.getSelectedItem()
                    + "','" + t + "','" + jdc_fechavencimiento.getDate() + "','" + ta_descripcion.getText() + "','" + tf_nombre.getText() + "','" + jList1.getSelectedValue().toString() + "')");

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
        boolean bandera3 = true;
        boolean bandera4 = true;
        boolean bandera5 = true;
        try {
            x1.query.execute("select nombre,contra,importancia,todo,correo,dropbox from usuarios");

            ResultSet rs = x1.query.getResultSet();

            while (rs.next()) {

                if (rs.getString(1).equals(tf_nombredeusuario.getText()) && rs.getString(2).equals(pf_contrasenia.getText())) {
                    bandera = true;
                    vartemp = tf_nombredeusuario.getText();
                    if (rs.getString(3).equals("true")) {
                        bandera2 = true;
                    }
                    if (rs.getString(4).equals("false")) {
                        bandera2 = false;
                    }
                    if (rs.getString(5).equals("false")) {
                        bandera2 = false;
                    }
                    if (rs.getString(6).equals("false")) {
                        bandera2 = false;
                    }
                    TAREAS.setVisible(bandera3);
                    CORREO.setVisible(bandera4);
                    DROPBOX.setVisible(bandera5);
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
        visible(listartareas);
        listartareas.setVisible(true);
        listartareas.setSize(800, 400);
        listartareas.setLocation(200, 200);
        Tareas.add(listartareas, BorderLayout.CENTER);
        Tareas.revalidate();
        Tareas.repaint();
        DefaultListModel rt = (DefaultListModel) jList1.getModel();
        rt.removeAllElements();
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        try {
            x1.query.execute("select lista from tareas where nombre = '" + vartemp + "'");

            ResultSet rs = x1.query.getResultSet();

            while (rs.next()) {
                rt.addElement(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        x1.desconectar();
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
                    x1.query.execute(" INSERT INTO usuarios (nombre,contra,importancia,todo,correo,dropbox)  VALUES ('" + username.getText() + "','" + contracrearusuario.getText() + "','" + b + "' 'true','true','true')");
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
        invisible(eliminarusuarios);
        eliminarusuarios.setVisible(false);
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
        x1.desconectar();
    }//GEN-LAST:event_botonlistarusuariosMouseClicked

    private void botonlistarusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlistarusuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonlistarusuariosActionPerformed

    private void crearusuariobotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearusuariobotonMouseClicked
        jLabel16.setVisible(false);
        jComboBox_editarpersonas.setVisible(false);
 
        invisible(listarusuarios);
        listarusuarios.setVisible(false);
        invisible(eliminarusuarios);
        eliminarusuarios.setVisible(false);
        visible(crearunacuenta);
        crearunacuenta.setVisible(true);

        crearunacuenta.setSize(631, 401);
        crearunacuenta.setLocation(350, 100);
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
        x1.desconectar();
    }//GEN-LAST:event_combobox_personasItemStateChanged

    private void botoneliminarpersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoneliminarpersonaMouseClicked

        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        DefaultListModel<String> rt = (DefaultListModel) listaeliminar.getModel();

        String x = listaeliminar.getSelectedValue();
        System.out.println(x);
        try {

            x1.query.execute("delete * from usuarios where nombre = '" + x + "'");
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        rt.removeAllElements();
        try {
            x1.query.execute("select nombre from usuarios");

            ResultSet rs = x1.query.getResultSet();

            while (rs.next()) {

                rt.addElement(rs.getString(1));

            }// fin de while
            listaeliminar.setModel(rt);
        }// fin del try
        catch (Exception ex) {
            ex.printStackTrace();

        }
        x1.desconectar();
    }//GEN-LAST:event_botoneliminarpersonaMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        invisible(crearunacuenta);
        crearunacuenta.setVisible(false);
        invisible(listarusuarios);
        listarusuarios.setVisible(false);
        visible(eliminarusuarios);
        eliminarusuarios.setVisible(true);

        eliminarusuarios.setSize(531, 421);
        eliminarusuarios.setLocation(150, 150);
        admin.add(eliminarusuarios, BorderLayout.NORTH);
        admin.revalidate();
        admin.repaint();
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        DefaultListModel<String> rt = new DefaultListModel();
        try {
            x1.query.execute("select nombre from usuarios");

            ResultSet rs = x1.query.getResultSet();

            while (rs.next()) {

                rt.addElement(rs.getString(1));

            }// fin de while
            listaeliminar.setModel(rt);
        }// fin del try
        catch (Exception ex) {
            ex.printStackTrace();
        }
        x1.desconectar();
    }//GEN-LAST:event_jButton3MouseClicked

    private void tamanioletra1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tamanioletra1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanioletra1ItemStateChanged

    private void tamanioletra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanioletra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanioletra1ActionPerformed

    private void estiloletra1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_estiloletra1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_estiloletra1ItemStateChanged

    private void estiloletra1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estiloletra1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_estiloletra1KeyPressed

    private void italicletra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_italicletra1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_italicletra1MouseClicked

    private void negritaletra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_negritaletra1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_negritaletra1MouseClicked

    private void subrayadoletra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subrayadoletra1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_subrayadoletra1MouseClicked

    private void backgroundletra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundletra1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backgroundletra1MouseClicked

    private void colorletra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorletra1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_colorletra1MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

        DefaultListModel rt = (DefaultListModel) jList1.getModel();
        rt.addElement("");
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
        tm.setRowCount(0);
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        try {
            x1.query.execute("select nombre,contenido,Fecha,asignado from tareas where lista = '" + jList1.getSelectedValue() + "'");

            ResultSet rs = x1.query.getResultSet();

            while (rs.next()) {

                Object[] row = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                tm.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }


    }//GEN-LAST:event_jList1MouseClicked

    private void agregartareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregartareaMouseClicked

        visible(CrearTarea);
        CrearTarea.setVisible(true);
        CrearTarea.setSize(531, 421);
        CrearTarea.setLocation(150, 150);
        Tareas.add(CrearTarea, BorderLayout.NORTH);
        Tareas.revalidate();
        Tareas.repaint();
    }//GEN-LAST:event_agregartareaMouseClicked

    private void jb_midiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_midiaMouseClicked
       visible(listartareas);
        listartareas.setVisible(true);
        listartareas.setSize(800, 400);
        listartareas.setLocation(200, 200);
        Tareas.add(listartareas, BorderLayout.CENTER);
        Tareas.revalidate();
        Tareas.repaint();
        DefaultListModel rt = (DefaultListModel) jList1.getModel();
        rt.removeAllElements();
        dba x1 = new dba("./Database2.accdb");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date x = new Date();
        
        x1.conectar();
        
        try {
            x1.query.execute("select lista from tareas where nombre = '" + vartemp + "'and Fecha ='"+ formato.format(x) +"'");

            ResultSet rs = x1.query.getResultSet();

            while (rs.next()) {
                rt.addElement(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        x1.desconectar();
    }//GEN-LAST:event_jb_midiaMouseClicked

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        DefaultListModel<String> rt = (DefaultListModel) jList1.getModel();

        String x = jList1.getSelectedValue();

        try {

            x1.query.execute("delete * from tareas where lista = '" + x + "'");
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        rt.removeAllElements();
        try {
            x1.query.execute("select lista from usuarios");

            ResultSet rs = x1.query.getResultSet();

            while (rs.next()) {

                rt.addElement(rs.getString(1));

            }// fin de while
            jList1.setModel(rt);
        }// fin del try
        catch (Exception ex) {
            ex.printStackTrace();

        }
        x1.desconectar();
    }//GEN-LAST:event_eliminarMouseClicked

    private void marcarcomoimportanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcarcomoimportanteMouseClicked
        System.out.println("EWEWEWAEAWE");
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        DefaultListModel<String> rt = (DefaultListModel) jList1.getModel();

        String x = jList1.getSelectedValue();

        try {

            x1.query.execute("update tareas set importancia = true where lista = '" + x + "'");
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }//GEN-LAST:event_marcarcomoimportanteMouseClicked

    private void jb_modificarusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarusuariosMouseClicked
        jLabel7.setText("Modificar una Cuenta");
        crearcuentaboton.setText("Modificar!");

        invisible(listarusuarios);
        listarusuarios.setVisible(false);
        invisible(eliminarusuarios);
        eliminarusuarios.setVisible(false);
        visible(crearunacuenta);
        crearunacuenta.setVisible(true);

        crearunacuenta.setSize(631, 401);
        crearunacuenta.setLocation(350, 100);
        admin.add(crearunacuenta, BorderLayout.CENTER);
        admin.revalidate();
        admin.repaint();

        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        DefaultComboBoxModel dc = (DefaultComboBoxModel) jComboBox_editarpersonas.getModel();
        try {
            x1.query.execute("select nombre from usuarios");

            ResultSet rs = x1.query.getResultSet();

            while (rs.next()) {

                dc.addElement(rs.getString(1));

            }// fin de while
           jComboBox_editarpersonas.setModel(dc); 
        } catch (Exception e) {
            e.printStackTrace();
        }

        String temp = (String) jComboBox_editarpersonas.getSelectedItem();
        try {
            x1.query.execute("select nombre, contra from usuarios where nombre = '" + temp + "'");
            ResultSet rs = x1.query.getResultSet();
            while (rs.next()){
            nombrepersonacuenta.setText("");
            edad.setValue(0);
            username.setText(rs.getString(1));
            contracrearusuario.setText(rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        x1.desconectar();
    }//GEN-LAST:event_jb_modificarusuariosMouseClicked

    private void jButton_logincomousuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_logincomousuarioMouseClicked

        invisible(crearunacuenta);
        crearunacuenta.setVisible(false);
        invisible(eliminarusuarios);
        eliminarusuarios.setVisible(false);
        visible(logincuenta);
        logincuenta.setVisible(true);

        logincuenta.setSize(531, 421);
        logincuenta.setLocation(150, 150);
        admin.add(logincuenta, BorderLayout.NORTH);
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
            jList2.setModel(rt);
        }// fin del try
        catch (Exception ex) {

            ex.printStackTrace();

        }
        x1.desconectar();


    }//GEN-LAST:event_jButton_logincomousuarioMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        String temp1 = "";
        String temp2 = "";
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        if (jList2.getSelectedIndex() >= 0) {

            temp1 = jList2.getSelectedValue();
            try {
                x1.query.execute("select contra from usuarios where nombre = '" + temp1 + "'");
                ResultSet rs = x1.query.getResultSet();
                while (rs.next()) {
                    temp2 = rs.getString(1);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(jButton2, "Seleccione un elemento");
        }
        System.out.println(temp2);

        cerrar(Iconos);
        cerrar(Tareas);
        cerrar(correo);
        cerrar(dropbox);
        cerrar(admin);
        tf_nombredeusuario.setText(temp1);
        pf_contrasenia.setText(temp2);
        jLabel17.setVisible(true);
        jLabel17.setText("LOGIN COMO USUARIO: " + temp1);
        x1.desconectar();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        if (jList2.getSelectedIndex() >= 0) {

            try {
                x1.query.execute("update usuarios set dropbox = 'false' where nomre = '" + vartemp + "'");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(jButton7, "Seleccione un elemento");
        }
        x1.desconectar();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        if (jList2.getSelectedIndex() >= 0) {

            try {
                x1.query.execute("update usuarios set correo = 'false' where nomre = '" + vartemp + "'");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(jButton8, "Seleccione un elemento");
        }
        x1.desconectar();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        if (jList2.getSelectedIndex() >= 0) {

            try {
                x1.query.execute("update usuarios set todo = 'false' where nomre = '" + vartemp + "'");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(jButton9, "Seleccione un elemento");
        }
        x1.desconectar();
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
         invisible(crearunacuenta);
        crearunacuenta.setVisible(false);
        invisible(eliminarusuarios);
        eliminarusuarios.setVisible(false);
        visible(permisosaplicaciones);
        permisosaplicaciones.setVisible(true);

        permisosaplicaciones.setSize(531, 421);
        permisosaplicaciones.setLocation(250, 50);
        admin.add(permisosaplicaciones, BorderLayout.NORTH);
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
           jList3.setModel(rt);
        }// fin del try
        catch (Exception ex) {

            ex.printStackTrace();

        }
        x1.desconectar();
    }//GEN-LAST:event_jButton10MouseClicked

    private void jb_tareasimportantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_tareasimportantesMouseClicked

                                                                                
       visible(listartareas);
        listartareas.setVisible(true);
        listartareas.setSize(800, 400);
        listartareas.setLocation(200, 200);
        Tareas.add(listartareas, BorderLayout.CENTER);
        Tareas.revalidate();
        Tareas.repaint();
        DefaultListModel rt = (DefaultListModel) jList1.getModel();
        rt.removeAllElements();
        dba x1 = new dba("./Database2.accdb");
        x1.conectar();
        try {
            x1.query.execute("select lista from tareas where nombre = '" + vartemp + "' and importancia = 'true'");

            ResultSet rs = x1.query.getResultSet();

            while (rs.next()) {
                rt.addElement(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        x1.desconectar();        
    }//GEN-LAST:event_jb_tareasimportantesMouseClicked

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
    private javax.swing.JButton backgroundletra1;
    private javax.swing.JButton bandejadeentrada;
    private javax.swing.JButton botoneliminarpersona;
    private javax.swing.JRadioButton botonimportancia;
    private javax.swing.JButton botonlistarusuarios;
    private javax.swing.JButton colorletra;
    private javax.swing.JButton colorletra1;
    private javax.swing.JComboBox<String> combobox_personas;
    private javax.swing.JTextField contracrearusuario;
    private javax.swing.JDialog correo;
    private javax.swing.JButton crearcuentaboton;
    private javax.swing.JButton creartarea;
    private javax.swing.JPanel crearunacuenta;
    private javax.swing.JButton crearusuarioboton;
    private javax.swing.JDialog dropbox;
    private javax.swing.JSpinner edad;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JPanel eliminarusuarios;
    private javax.swing.JComboBox<String> estiloletra;
    private javax.swing.JComboBox<String> estiloletra1;
    private javax.swing.JComboBox<String> importancia;
    private javax.swing.JButton italicletra;
    private javax.swing.JButton italicletra1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_logincomousuario;
    private javax.swing.JComboBox<String> jComboBox_editarpersonas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jb_listatareas;
    private javax.swing.JButton jb_midia;
    private javax.swing.JButton jb_modificarusuarios;
    private javax.swing.JButton jb_tareasimportantes;
    private com.toedter.calendar.JDateChooser jdc_fechavencimiento;
    private javax.swing.JList<String> listaeliminar;
    private javax.swing.JPanel listartareas;
    private javax.swing.JPanel listarusuarios;
    private javax.swing.JList<String> listausuarios;
    private javax.swing.JPanel logincuenta;
    private javax.swing.JMenuItem marcarcomoimportante;
    private javax.swing.JPopupMenu menutareas;
    private javax.swing.JButton negritaletra;
    private javax.swing.JButton negritaletra1;
    private javax.swing.JTextField nombrepersonacuenta;
    private javax.swing.JPanel permisosaplicaciones;
    private javax.swing.JPasswordField pf_contrasenia;
    private javax.swing.JButton redactar;
    private javax.swing.JPanel redactarcorreos;
    private javax.swing.JButton subrayadoletra;
    private javax.swing.JButton subrayadoletra1;
    private javax.swing.JTextArea ta_descripcion;
    private javax.swing.JComboBox<String> tamanioletra;
    private javax.swing.JComboBox<String> tamanioletra1;
    private javax.swing.JPanel text;
    private javax.swing.JPanel text1;
    private javax.swing.JTextPane textpane;
    private javax.swing.JTextPane textpane1;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombredeusuario;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
StyledDocument doc;
    Style estilo;

}
