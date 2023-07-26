import enums.TipoConversion;
import model.*;

import javax.swing.*;
import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) throws Exception {

        String conversionDeMoneda = "Convertir moneda";
        String conversionDeTemperatura = "Convertir temperatura";

        boolean ejecuta = true;

        Repetidor repetidor = new Repetidor();

        while(ejecuta){
            String operacion = JOptionPane.showInputDialog(null, "Que deseas convertir?",
                    "Conversiones", JOptionPane.QUESTION_MESSAGE, null, new String[]
                            {conversionDeMoneda, conversionDeTemperatura}, "Elección").toString();

            if (operacion.equals(conversionDeMoneda)) {
                IniciadorConversionMonedas iniciadorConversionMonedas = new IniciadorConversionMonedas();
                String operacaoMoedas = JOptionPane.showInputDialog(null, "Elige una moneda",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversion.PESOS_MXN_PARA_DOLAR.getDescripcion(),
                                TipoConversion.PESOS_MXN_PARA_EURO.getDescripcion(),
                                TipoConversion.PESOS_MXN_PARA_LIBRA_ESTERLINA.getDescripcion(),
                                TipoConversion.PESOS_MXN_PARA_YEN_JAPONES.getDescripcion(),
                                TipoConversion.PESOS_MXN_PARA_WON_SURCOREANO.getDescripcion(),
                                TipoConversion.DOLAR_PARA_PESOS_MXN.getDescripcion(),
                                TipoConversion.EURO_PARA_PESOS_MXN.getDescripcion(),
                                TipoConversion.LIBRA_ESTERLINA_PARA_PESOS_MXN.getDescripcion(),
                                TipoConversion.YEN_JAPONES_PARA_PESOS_MXN.getDescripcion(),
                                TipoConversion.WON_SURCOREANO_PARA_PESOS_MXN.getDescripcion()},
                        "Escolha").toString();

                String valorString = JOptionPane.showInputDialog("INGRESA LA CANTIDAD");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "INTENTA NUEVAMENTE");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    BigDecimal valorConvertido = iniciadorConversionMonedas.operarConversao(operacaoMoedas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            } else if(operacion.equals(conversionDeTemperatura)){
                IniciadorConversionTemperatura iniciadorConversionTemperatura = new IniciadorConversionTemperatura();
                String operacaoTemperaturas = JOptionPane.showInputDialog(null, "SELECCIONA LA ESCALA DE TEMPERATURA",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversion.CELSIUS_PARA_FAHRENHEIT.getDescripcion(),
                                TipoConversion.CELSIUS_PARA_KELVIN.getDescripcion(),
                                TipoConversion.FAHRENHEIT_PARA_CELSIUS.getDescripcion(),
                                TipoConversion.FAHRENHEIT_PARA_KELVIN.getDescripcion(),
                                TipoConversion.KELVIN_PARA_CELSIUS.getDescripcion(),
                                TipoConversion.KELVIN_PARA_FAHRENHEIT.getDescripcion(),},
                        "Elección").toString();

                String valorString = JOptionPane.showInputDialog("INGRESA LA CANTIDAD");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "INTENTA DE NUEVO");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    double valorConvertido = iniciadorConversionTemperatura.operarConversao(operacaoTemperaturas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            }
            ejecuta = repetidor.intentaRepetir();
        }

    }
}
