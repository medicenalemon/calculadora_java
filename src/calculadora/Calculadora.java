
package calculadora;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author mauricioalemon
 */
public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
  
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        btnEncAp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnIgual = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Nunito Sans", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, 328, 38));

        txtResultado.setFont(new java.awt.Font("Nunito Sans ExtraBold", 1, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, 328, 50));

        btnEncAp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_turn_off_15005.png"))); // NOI18N
        btnEncAp.setBorder(null);
        btnEncAp.setBorderPainted(false);
        btnEncAp.setContentAreaFilled(false);
        btnEncAp.setFocusPainted(false);
        btnEncAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncApActionPerformed(evt);
            }
        });
        jPanel1.add(btnEncAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 170));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIgual.setFont(new java.awt.Font("Nunito Sans Light", 1, 32)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_st.png"))); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorderPainted(false);
        btnIgual.setFocusPainted(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 50, 50));

        btn9.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btn9.setForeground(new java.awt.Color(55, 62, 71));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn9.setText("9");
        btn9.setFocusPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        btnCE.setFont(new java.awt.Font("Nunito Sans Light", 0, 16)); // NOI18N
        btnCE.setForeground(new java.awt.Color(55, 62, 71));
        btnCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnCE.setText("CE");
        btnCE.setFocusPainted(false);
        btnCE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnCE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        jPanel2.add(btnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btnPorcentaje.setFont(new java.awt.Font("Nunito Sans Light", 0, 20)); // NOI18N
        btnPorcentaje.setForeground(new java.awt.Color(55, 62, 71));
        btnPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.setFocusPainted(false);
        btnPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnPorcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btnDivision.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(55, 62, 71));
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnDivision.setText("/");
        btnDivision.setFocusPainted(false);
        btnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btnMultiplicacion.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(55, 62, 71));
        btnMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnMultiplicacion.setText("X");
        btnMultiplicacion.setFocusPainted(false);
        btnMultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnMultiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        btnResta.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btnResta.setForeground(new java.awt.Color(55, 62, 71));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnResta.setText("-");
        btnResta.setFocusPainted(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, 50));

        btnSuma.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(55, 62, 71));
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setFocusPainted(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        btnC.setFont(new java.awt.Font("Nunito Sans Light", 0, 16)); // NOI18N
        btnC.setForeground(new java.awt.Color(55, 62, 71));
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnC.setText("C");
        btnC.setFocusPainted(false);
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn7.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btn7.setForeground(new java.awt.Color(55, 62, 71));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn7.setText("7");
        btn7.setFocusPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        btn8.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btn8.setForeground(new java.awt.Color(55, 62, 71));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn8.setText("8");
        btn8.setFocusPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        btn6.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btn6.setForeground(new java.awt.Color(55, 62, 71));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn6.setText("6");
        btn6.setFocusPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 50));

        btn4.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btn4.setForeground(new java.awt.Color(55, 62, 71));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn4.setText("4");
        btn4.setFocusPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        btn5.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btn5.setForeground(new java.awt.Color(55, 62, 71));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn5.setText("5");
        btn5.setFocusPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 50));

        btn3.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btn3.setForeground(new java.awt.Color(55, 62, 71));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn3.setText("3");
        btn3.setFocusPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        btn1.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btn1.setForeground(new java.awt.Color(55, 62, 71));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn1.setText("1");
        btn1.setFocusPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        btn2.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btn2.setForeground(new java.awt.Color(55, 62, 71));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn2.setText("2");
        btn2.setFocusPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        btnClose.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btnClose.setForeground(new java.awt.Color(55, 62, 71));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnclose.png"))); // NOI18N
        btnClose.setFocusPainted(false);
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnClose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        btnPunto.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(55, 62, 71));
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setFocusPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 50, 50));

        btn0.setFont(new java.awt.Font("Nunito Sans Light", 0, 28)); // NOI18N
        btn0.setForeground(new java.awt.Color(55, 62, 71));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn0.setText("0");
        btn0.setFocusPainted(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_hover.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 340, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        addNumber("7");
        btnIgual.doClick();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        addNumber("1");
        btnIgual.doClick();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        addNumber("*");
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       addNumber("8");
       btnIgual.doClick();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       addNumber("9");
       btnIgual.doClick();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       addNumber("4");
       btnIgual.doClick();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       addNumber("5");
       btnIgual.doClick();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       addNumber("6");
       btnIgual.doClick();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       addNumber("2");
       btnIgual.doClick();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       addNumber("3");
       btnIgual.doClick();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
       String text = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
       txtOperacion.setText(text);
       btnIgual.doClick();
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
       addNumber("%");
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
       addNumber("/");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
       addNumber("-");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
       addNumber("+");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        try {
            // TODO add your handling code here:
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        } catch (ScriptException ex) {
            txtResultado.setText("ERROR");
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        addNumber(".");
    }//GEN-LAST:event_btnPuntoActionPerformed

    boolean dark = false;
    
    private void btnEncApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncApActionPerformed
      if(!dark){
        jPanel1.setBackground(Color.decode("#212b41"));
        jPanel2.setBackground(Color.decode("#2e3952"));
        txtOperacion.setForeground(Color.decode("#0db387"));
        txtResultado.setForeground(Color.decode("#0db387"));
        cambiarColorABotonesNumericos(btn1);
        cambiarColorABotonesNumericos(btn2);
        cambiarColorABotonesNumericos(btn3);
        cambiarColorABotonesNumericos(btn4);
        cambiarColorABotonesNumericos(btn5);
        cambiarColorABotonesNumericos(btn6);
        cambiarColorABotonesNumericos(btn7);
        cambiarColorABotonesNumericos(btn8);
        cambiarColorABotonesNumericos(btn9);
        cambiarColorABotonesNumericos(btn0);
        cambiarColorABotonesNumericos(btnPunto);
        cambiarColorABotonesEspeciales(btnSuma);
        cambiarColorABotonesEspeciales(btnResta);
        cambiarColorABotonesEspeciales(btnMultiplicacion);
        cambiarColorABotonesEspeciales(btnDivision);
        cambiarColorABotonesEspeciales(btnPorcentaje);
        cambiarColorABotonesEspeciales(btnC);
        cambiarColorABotonesEspeciales(btnCE);
        pasarBotonCerrarAOscuro(btnClose);
        pasarBotonIgualAOscuro(btnIgual);
        dark = true;
      } else {
        jPanel1.setBackground(Color.decode("#f4fdfb"));
        jPanel2.setBackground(Color.decode("#ffffff"));
        txtOperacion.setForeground(Color.decode("#373e47"));
        txtResultado.setForeground(Color.decode("#373e47"));
        revertirColorABotonesNumericos(btn1);
        revertirColorABotonesNumericos(btn2);
        revertirColorABotonesNumericos(btn3);
        revertirColorABotonesNumericos(btn4);
        revertirColorABotonesNumericos(btn5);
        revertirColorABotonesNumericos(btn6);
        revertirColorABotonesNumericos(btn7);
        revertirColorABotonesNumericos(btn8);
        revertirColorABotonesNumericos(btn9);
        revertirColorABotonesNumericos(btn0);
        revertirColorABotonesNumericos(btnPunto);
        revertirColorABotonesEspeciales(btnSuma);
        revertirColorABotonesEspeciales(btnResta);
        revertirColorABotonesEspeciales(btnMultiplicacion);
        revertirColorABotonesEspeciales(btnDivision);
        revertirColorABotonesEspeciales(btnPorcentaje);
        revertirColorABotonesEspeciales(btnC);
        revertirColorABotonesEspeciales(btnCE);
        revertirBotonCerrar(btnClose);
        revertirBotonIgual(btnIgual);
        dark = false;
      }
    }//GEN-LAST:event_btnEncApActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        addNumber("0");
        btnIgual.doClick();
    }//GEN-LAST:event_btn0ActionPerformed

    public void cambiarColorABotonesNumericos(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        boton.setForeground(Color.decode("#96a8a0"));
    }
    
    public void cambiarColorABotonesEspeciales(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn2_dark_hover.png")));
        boton.setForeground(Color.decode("#0db387"));
    }
    
    public void pasarBotonIgualAOscuro(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/images/btn3_dark.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn3_dark.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn3_dark_hover.png")));
        boton.setForeground(Color.decode("#2e3951"));
    }
    
    public void pasarBotonCerrarAOscuro(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/images/btnclose_dark.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/images/btnclose_dark.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
    }
    
    public void revertirColorABotonesNumericos(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/images/btn2.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn2.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_hover.png")));
        boton.setForeground(Color.decode("#373e47"));
    }
    
    public void revertirColorABotonesEspeciales(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/images/btn1.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn1.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_hover.png")));
        boton.setForeground(Color.decode("#373e47"));
    }
    
    public void revertirBotonCerrar(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/images/btnclose.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/images/btnclose.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_hover.png")));
    }
    
    public void revertirBotonIgual(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/images/btn3_st.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn3_st.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_hover.png")));
        boton.setForeground(Color.decode("#ffffff"));
        boton.setFocusPainted(false);
        boton.setBorder(null);
    }
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText() + digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnEncAp;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
