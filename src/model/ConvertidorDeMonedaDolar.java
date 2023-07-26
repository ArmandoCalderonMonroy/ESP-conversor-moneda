package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaDolar extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.DOLAR;
        return super.convertirParaMoneda(moneda, valorEnReais);
    }

    @Override
    public BigDecimal convertirParaPesos(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.DOLAR;
        return super.convertirParaPesos(moneda, valorEnMoneda);
    }
}
