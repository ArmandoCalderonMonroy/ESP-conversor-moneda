package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaYenJapones extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.YEN_JAPONES;
        return super.convertirParaMoneda(moneda, valorEnReais);
    }

    @Override
    public BigDecimal convertirParaPesos(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.YEN_JAPONES;
        return super.convertirParaPesos(moneda, valorEnMoneda);
    }
}
