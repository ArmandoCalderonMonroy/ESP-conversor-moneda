package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaWonSurcoreano extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.WON_SURCOREANO;
        return super.convertirParaMoneda(moneda, valorEnReais);
    }

    @Override
    public BigDecimal convertirParaPesos(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.WON_SURCOREANO;
        return super.convertirParaPesos(moneda, valorEnMoneda);
    }
}
