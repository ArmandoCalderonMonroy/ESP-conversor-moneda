package enums;

public enum TipoConversion {
    PESOS_MXN_PARA_DOLAR("De MXN a USD-DOLAR"),
    PESOS_MXN_PARA_EURO("De MXN a EUR-EURO"),
    PESOS_MXN_PARA_LIBRA_ESTERLINA("De MXN a GBP-LIBRA ESTERLINA"),
    PESOS_MXN_PARA_YEN_JAPONES ("De MXN a JPY-JAPONES"),
    PESOS_MXN_PARA_WON_SURCOREANO ("De MXN a KRW-SURCOREANO"),
    DOLAR_PARA_PESOS_MXN("De USD a MXN"),
    EURO_PARA_PESOS_MXN("De EUR a MXN"),
    LIBRA_ESTERLINA_PARA_PESOS_MXN("De GBP a MXN"),
    YEN_JAPONES_PARA_PESOS_MXN("De JPY a MXN"),
    WON_SURCOREANO_PARA_PESOS_MXN("De KRW a MXN"),


    CELSIUS_PARA_FAHRENHEIT("Celsius a Fahrenheit"),
    CELSIUS_PARA_KELVIN("Celsius a Kelvin"),
    KELVIN_PARA_FAHRENHEIT("Kelvin a Fahrenheit"),
    KELVIN_PARA_CELSIUS ("Kelvin a Celsius"),
    FAHRENHEIT_PARA_CELSIUS ("Fahrenheit a Celsius"),
    FAHRENHEIT_PARA_KELVIN("Fahrenheit a Kelvin");

    private String descripcion;

    TipoConversion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
