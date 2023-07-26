package model;

import enums.Moneda;

import java.math.BigDecimal;

public class IniciadorConversionMonedas {

    private static final String PESOS_MXN_PARA_DOLAR = "De MXN a USD-DOLAR";
    private static final String PESOS_MXN_PARA_EURO = "De MXN a EUR-EURO";
    private static final String PESOS_MXN_PARA_LIBRA_ESTERLINA = "De MXN a GBP-LIBRA ESTERLINA";
    private static final String PESOS_MXN_PARA_YEN_JAPONES = "De MXN a JPY-JAPONES";
    private static final String PESOS_MXN_PARA_WON_SURCOREANO = "De MXN a KRW-SURCOREANO";
    private static final String DOLAR_PARA_PESOS_MXN = "De USD a MXN";
    private static final String EURO_PARA_PESOS_MXN = "De EUR a MXN";
    private static final String LIBRA_ESTERLINA_PARA_PESOS_MXN = "De GBP a MXN";
    private static final String YEN_JAPONES_PARA_PESOS_MXN = "De JPY a MXN";
    private static final String WON_SURCOREANO_PARA_PESOS_MXN = "De KRW a MXN";
    private ConvertidorDeMoneda convertidorDeMonedaDolar = new ConvertidorDeMonedaDolar();
    private ConvertidorDeMoneda convertidorDeMonedaEuro = new ConvertidorDeMonedaEuro();
    private ConvertidorDeMoneda convertidorDeMonedaLibraEsterlina = new ConvertidorDeMonedaLibraEsterlina();
    private ConvertidorDeMoneda convertidorDeMonedaYenJapones = new ConvertidorDeMonedaYenJapones();
    private ConvertidorDeMoneda convertidorDeMonedaWonSurcoreano = new ConvertidorDeMonedaWonSurcoreano();

    private Moneda moneda;

    public BigDecimal operarConversao(String operacionMonedas, double valorInicial) throws Exception {

        switch (operacionMonedas) {
            case PESOS_MXN_PARA_DOLAR  -> {
                return convertidorDeMonedaDolar.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESOS_MXN_PARA_EURO -> {
                return convertidorDeMonedaEuro.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESOS_MXN_PARA_LIBRA_ESTERLINA -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESOS_MXN_PARA_YEN_JAPONES  -> {
                return convertidorDeMonedaYenJapones.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESOS_MXN_PARA_WON_SURCOREANO -> {
                return convertidorDeMonedaWonSurcoreano.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case DOLAR_PARA_PESOS_MXN -> {
                return convertidorDeMonedaDolar.convertirParaPesos(moneda, BigDecimal.valueOf(valorInicial));
            }
            case EURO_PARA_PESOS_MXN  -> {
                return convertidorDeMonedaEuro.convertirParaPesos(moneda, BigDecimal.valueOf(valorInicial));
            }
            case LIBRA_ESTERLINA_PARA_PESOS_MXN -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaPesos(moneda, BigDecimal.valueOf(valorInicial));
            }
            case YEN_JAPONES_PARA_PESOS_MXN  -> {
                return  convertidorDeMonedaYenJapones.convertirParaPesos(moneda, BigDecimal.valueOf(valorInicial));
            }
            case WON_SURCOREANO_PARA_PESOS_MXN -> {
                return convertidorDeMonedaWonSurcoreano.convertirParaPesos(moneda, BigDecimal.valueOf(valorInicial));
            }
            default -> throw new Exception("INTENTA DE NUEVO");
        }

    }

}
