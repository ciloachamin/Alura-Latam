/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CurrencyConverterController;
import CurrencyConverterModel.InitializeCurrencyConverter;
import CurrencyConverterView.CurrencyConverterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.math.BigDecimal;
import javax.swing.ImageIcon;

/**
 *
 * @author SAMSUNG
 */
public class Controller implements ActionListener,FocusListener {

    private CurrencyConverterView vista;
    private InitializeCurrencyConverter model;
    private BigDecimal valorIngresado = BigDecimal.ZERO;
    private BigDecimal valorResultado = BigDecimal.ZERO;

    public Controller(CurrencyConverterView vista, InitializeCurrencyConverter model) {
        this.vista = vista;
        this.model = model;
        this.vista.monedaIngresada.addActionListener(this);
        this.vista.monedaResultado.addActionListener(this);
        this.vista.valorIngresado.addActionListener(this);
        this.vista.valorResultado.addActionListener(this);
        this.vista.valorIngresado.addFocusListener(this);
    }

    public void iniciar() {
        vista.setTitle("Conversor Alura");
        vista.setLocationRelativeTo(null);
    }

   public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.valorIngresado ||e.getSource()==vista.monedaResultado) {
            String monedaOrigen = vista.monedaIngresada.getSelectedItem().toString();
            String monedaDestino = vista.monedaResultado.getSelectedItem().toString();
            BigDecimal valorIngresado = new BigDecimal(vista.valorIngresado.getText());
            String resultado = model.convertir(monedaOrigen, monedaDestino, valorIngresado).toString();
            vista.valorResultado.setText(resultado);
        }
        if (e.getSource() == vista.valorResultado||e.getSource()==vista.monedaIngresada) {
            String monedaOrigen = vista.monedaIngresada.getSelectedItem().toString();
            String monedaDestino = vista.monedaResultado.getSelectedItem().toString();
            BigDecimal valorResultado = new BigDecimal(vista.valorResultado.getText());
            BigDecimal valorIngresado = model.convertir(monedaDestino, monedaOrigen, valorResultado);
            vista.valorIngresado.setText(valorIngresado.toString());
        }
   }  
   
   @Override
    public void focusLost(FocusEvent e) {
       
    }

    @Override
    public void focusGained(FocusEvent e) {
        
    }
}