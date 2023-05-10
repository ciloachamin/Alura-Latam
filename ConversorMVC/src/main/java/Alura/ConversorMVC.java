/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Alura;

import CurrencyConverterController.Controller;
import CurrencyConverterModel.InitializeCurrencyConverter;
import CurrencyConverterView.CurrencyConverterView;

/**
 *
 * @author SAMSUNG
 */
public class ConversorMVC {

    public static void main(String[] args) {
        CurrencyConverterView view =new CurrencyConverterView();
        InitializeCurrencyConverter model = new InitializeCurrencyConverter();
        Controller controller = new Controller(view,model);
        controller.iniciar();
        view.setVisible(true);
    }
}
