package CurrencyConverterModel.enums;

import java.math.BigDecimal;

public enum CurrencyType {
    DOLAR(BigDecimal.valueOf(1.00)),
    EURO(BigDecimal.valueOf(0.92)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(0.80)),
    PESO_ARGENTINO(BigDecimal.valueOf(211.33)),
    PESO_CHILENO(BigDecimal.valueOf(819.90)),
    PESO_MEXICANO(BigDecimal.valueOf(18.24)),
    WON_SULCOREANO(BigDecimal.valueOf(1318.56)),
    YEN_JAPONES(BigDecimal.valueOf(131.73));

    private BigDecimal FACTOR_CONVERSION;

    public BigDecimal getFACTOR_CONVERSION() {
        return this.FACTOR_CONVERSION;
    }
    /**
     *
     * @param FACTOR_CONVERSION
     */
    CurrencyType(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }
}
