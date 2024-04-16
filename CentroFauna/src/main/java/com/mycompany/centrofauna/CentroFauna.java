package com.mycompany.centrofauna;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class CentroFauna extends javax.swing.JFrame {

    static ArrayList<Mamifero> mamiferos = new ArrayList();
    static ArrayList<Ave> aves = new ArrayList();
    static ArrayList<Reptil> reptiles = new ArrayList();
    static ArrayList<Animal> bajas = new ArrayList();

    //PRUEBAS JCOMBO BAJA
    static Ave a1 = new Ave(true, null, "gorrion", 20, "muy grave");
    static Ave a2 = new Ave(true, null, "gorrion", 20, "muy grave");
    static Ave a3 = new Ave(true, null, "gorrion", 20, "muy grave");
    static Ave a4 = new Ave(true, null, "gorrion", 20, "muy grave");

    //tamaño letra 18
    /**
     * Creates new form CentroFauna
     */
    public CentroFauna() {
        //PRUEBAS
        aves.add(a1);
        aves.add(a2);
        aves.add(a3);
        aves.add(a4);

        initComponents();
        for (int i = 0; i < aves.size(); i++) {
            desplegableBaja.addItem(aves.toString());
        }
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alta = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tipoAnimal = new javax.swing.JComboBox<>();
        gravedad = new javax.swing.JComboBox<>();
        salirAlta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        guardarAlta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        especieAnimal = new javax.swing.JTextField();
        fechaEntrada = new javax.swing.JTextField();
        baja = new javax.swing.JFrame();
        desplegableBaja = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fechaBaja = new javax.swing.JTextField();
        guardarBaja = new javax.swing.JButton();
        salirBaja = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        botonAlta = new javax.swing.JButton();
        botonListado = new javax.swing.JButton();
        botonLib = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonBaja = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonTratamiento1 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tipo de animal: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Gravedad:");

        tipoAnimal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ave", "Mamífero", "Reptil" }));
        tipoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoAnimalActionPerformed(evt);
            }
        });

        gravedad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gravedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "muy grave", "grave", "leve", "muy leve" }));

        salirAlta.setText("Salir");
        salirAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirAltaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Fecha de entrada: ");

        guardarAlta.setText("Guardar");
        guardarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarAltaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Peso: ");

        peso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Especie: ");

        especieAnimal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        fechaEntrada.setText("dd/MM/aaaa");

        javax.swing.GroupLayout altaLayout = new javax.swing.GroupLayout(alta.getContentPane());
        alta.getContentPane().setLayout(altaLayout);
        altaLayout.setHorizontalGroup(
            altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaLayout.createSequentialGroup()
                .addGroup(altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(altaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(guardarAlta)
                                .addGap(18, 18, 18)
                                .addComponent(salirAlta))
                            .addGroup(altaLayout.createSequentialGroup()
                                .addGroup(altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(altaLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(altaLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGroup(altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(altaLayout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(tipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(altaLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(gravedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 176, Short.MAX_VALUE))))
                    .addGroup(altaLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(altaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(altaLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(especieAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4))
                    .addGap(186, 223, Short.MAX_VALUE)))
        );
        altaLayout.setVerticalGroup(
            altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gravedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarAlta)
                    .addComponent(salirAlta)))
            .addGroup(altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(altaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(altaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(especieAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(67, 67, 67)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(133, Short.MAX_VALUE)))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Indique la fecha de la baja:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Seleccione el animal que quiere dar de baja:");

        fechaBaja.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechaBaja.setText("dd/MM/aaaa");
        fechaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaBajaActionPerformed(evt);
            }
        });

        guardarBaja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        guardarBaja.setText("Guardar");
        guardarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBajaActionPerformed(evt);
            }
        });

        salirBaja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        salirBaja.setText("Salir");
        salirBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bajaLayout = new javax.swing.GroupLayout(baja.getContentPane());
        baja.getContentPane().setLayout(bajaLayout);
        bajaLayout.setHorizontalGroup(
            bajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bajaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salirBaja)
                .addGap(17, 17, 17))
            .addGroup(bajaLayout.createSequentialGroup()
                .addGroup(bajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bajaLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel6))
                    .addGroup(bajaLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bajaLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(fechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bajaLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(desplegableBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        bajaLayout.setVerticalGroup(
            bajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bajaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desplegableBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(bajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarBaja)
                    .addComponent(salirBaja))
                .addGap(18, 18, 18))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CENTRO DE FAUNA");
        setBackground(new java.awt.Color(51, 51, 255));
        setBounds(new java.awt.Rectangle(500, 300, 0, 0));
        setResizable(false);

        botonAlta.setText("ALTA");
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });

        botonListado.setText("LISTADO");
        botonListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListadoActionPerformed(evt);
            }
        });

        botonLib.setText("LIBERACIÓN");
        botonLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLibActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        jLabel1.setText("CENTRO DE FAUNA");

        botonBaja.setText("BAJA");
        botonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajaActionPerformed(evt);
            }
        });

        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonTratamiento1.setText("TRATAMIENTO");
        botonTratamiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTratamiento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonTratamiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonListado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonLib, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonLib, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonListado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(botonTratamiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(botonSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonTratamiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTratamiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTratamiento1ActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaActionPerformed
        //MIO
        setVisible(false);
        baja.setLocationRelativeTo(CentroFauna.this);
        baja.setSize(500, 375);
        baja.setVisible(true);
        baja.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }//GEN-LAST:event_botonBajaActionPerformed

    private void botonLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonLibActionPerformed

    private void botonListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonListadoActionPerformed

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
        alta.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        alta.setSize(500, 375);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        //obtiene el tamaño de la pantalla
        Dimension tamPantalla = miPantalla.getScreenSize();
        int altoPantalla = tamPantalla.height;
        int anchoPantalla = tamPantalla.width;
        //alta.setSize(anchoPantalla / 2, altoPantalla / 2); //viene de JFrame
        alta.setLocation(anchoPantalla / 4, altoPantalla / 4);
        alta.setVisible(true);

    }//GEN-LAST:event_botonAltaActionPerformed

    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoActionPerformed

    private void guardarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarAltaActionPerformed
        setVisible(false);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        double pesoD = 0;
        String especieA = "";
        String gravedadA = null;
        Date fecha_entrada = null;
        boolean errores = true;
        while (errores) {
            //PESO
            try {
                //BUCLE INFINITO; HAY Q LIMPIAR PESOD O PESO y FECHA
                pesoD = Double.parseDouble(peso.getText());
                String fechaS = fechaEntrada.getText();
                fecha_entrada = formato.parse(fechaS);
                errores = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor introducido en PESO no es válido.");
                errores = true;
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "El formato de la fecha es incorrecto(dd/MM/aaaa).");
                errores = true;

            }

//            //FECHA ENTRADA
//            try {
//                String fechaS = fechaEntrada.getText();
//                fecha_entrada = formato.parse(fechaS);
//                errores = false;
//            } catch (ParseException e) {
//                JOptionPane.showMessageDialog(null, "El formato de la fecha es incorrecto(dd/MM/aaaa).");
//                errores = true;
//
//            }
//            //ESPECIE
//            try {
//                especieA = especieAnimal.getText();
//                errores = false;
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "El valor introducido en ESPECIE no es válido.");
//                errores = true;
//
//            }
        }

        if (tipoAnimal.getSelectedItem()
                .equals("Ave")) {
            int siLesion = JOptionPane.showConfirmDialog(null, "¿El motivo de la lesión es la caza?", "Lesión", JOptionPane.YES_NO_OPTION);
            boolean lesionCaza;
            if (siLesion == 0) {
                lesionCaza = true;
            } else {
                lesionCaza = false;
            }
            Ave av1 = new Ave(lesionCaza, fecha_entrada, especieA, pesoD, gravedadA);
            aves.add(av1);
        }

        if (tipoAnimal.getSelectedItem()
                .equals("Mamífero")) {
            int siLesion = JOptionPane.showConfirmDialog(null, "¿El motivo de la lesión es un atropello?", "Lesión", JOptionPane.YES_NO_OPTION);
            boolean lesionAtropello;
            if (siLesion == 0) {
                lesionAtropello = true;
            } else {
                lesionAtropello = false;
            }
            Mamifero m1 = new Mamifero(lesionAtropello, fecha_entrada, especieA, pesoD, gravedadA);
            mamiferos.add(m1);
        }

        if (tipoAnimal.getSelectedItem()
                .equals("Reptil")) {
            int siLesion = JOptionPane.showConfirmDialog(null, "¿El motivo de la lesión es una infección bacteriana?", "Lesión", JOptionPane.YES_NO_OPTION);
            boolean lesionInf;
            if (siLesion == 0) {
                lesionInf = true;
            } else {
                lesionInf = false;
            }
            Reptil r1 = new Reptil(lesionInf, fecha_entrada, especieA, pesoD, gravedadA
            );
            reptiles.add(r1);
        }

        alta.setVisible(false);
        alta.dispose();
        setVisible(true);
        //LIMPIAR TEXTFIELDS

        especieAnimal.setText(
                "");
        fechaEntrada.setText(
                "");
        peso.setText(
                "");
    }//GEN-LAST:event_guardarAltaActionPerformed

    private void salirAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirAltaActionPerformed
        alta.dispose();
        setVisible(true);
    }//GEN-LAST:event_salirAltaActionPerformed

    private void tipoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoAnimalActionPerformed

    private void fechaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaBajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaBajaActionPerformed

    private void salirBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBajaActionPerformed
        baja.dispose();
        setVisible(true);
    }//GEN-LAST:event_salirBajaActionPerformed

    private void guardarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBajaActionPerformed
        boolean noterminar = true;
        do {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha_baja = null;
            if (desplegableBaja.getSelectedItem() instanceof Ave) {
                aves.remove(desplegableBaja.getSelectedItem());
            }
            if (desplegableBaja.getSelectedItem() instanceof Mamifero) {
                mamiferos.remove(desplegableBaja.getSelectedItem());
            }
            if (desplegableBaja.getSelectedItem() instanceof Reptil) {
                reptiles.remove(desplegableBaja.getSelectedItem());
            }
            boolean fechaerror = true;
            while (fechaerror) {
                try {
                    fechaerror = true;
                    String fechaB = fechaBaja.getText();
                    fecha_baja = formato.parse(fechaB);
                    fechaerror = false;
                    noterminar = false;
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "El formato de la fecha es incorrecto(dd/MM/aaaa).");
                    fechaerror = true;
                }
            }
        } while (noterminar);
        JOptionPane.showMessageDialog(null, "El animal se ha dado de baja correctamente.");
        baja.dispose();

    }//GEN-LAST:event_guardarBajaActionPerformed

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
            java.util.logging.Logger.getLogger(CentroFauna.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentroFauna.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentroFauna.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentroFauna.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentroFauna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame alta;
    private javax.swing.JFrame baja;
    private javax.swing.JButton botonAlta;
    private javax.swing.JButton botonBaja;
    private javax.swing.JButton botonLib;
    private javax.swing.JButton botonListado;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonTratamiento1;
    private javax.swing.JComboBox<String> desplegableBaja;
    private javax.swing.JTextField especieAnimal;
    private javax.swing.JTextField fechaBaja;
    private javax.swing.JTextField fechaEntrada;
    private javax.swing.JComboBox<String> gravedad;
    private javax.swing.JButton guardarAlta;
    private javax.swing.JButton guardarBaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField peso;
    private javax.swing.JButton salirAlta;
    private javax.swing.JButton salirBaja;
    private javax.swing.JComboBox<String> tipoAnimal;
    // End of variables declaration//GEN-END:variables
}
