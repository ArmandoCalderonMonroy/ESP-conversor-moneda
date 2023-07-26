package enums;

import java.math.BigDecimal;

public enum Moneda {

    //VALORES TOMADOS EN 25/07/2023
    DOLAR(BigDecimal.valueOf(16.92)),
    EURO(BigDecimal.valueOf(18.70)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(21.83)),
    YEN_JAPONES(BigDecimal.valueOf(0.1201)),
    WON_SURCOREANO(BigDecimal.valueOf(0.0132));

    private BigDecimal FACTOR_CONVERSION;

    Moneda(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }

    public BigDecimal getFACTOR_CONVERSION() {
        return FACTOR_CONVERSION;
    }
}
