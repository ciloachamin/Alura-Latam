package CurrencyConverterModel;

import CurrencyConverterModel.enums.CurrencyType;
import CurrencyConverterView.CurrencyConverterView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class InitializeCurrencyConverter {

    private Map<String, CurrencyType> tasasDeCambio = new HashMap<>();

    public InitializeCurrencyConverter() {
        tasasDeCambio.put("Dolar", CurrencyType.DOLAR);
        tasasDeCambio.put("Euro", CurrencyType.EURO);
        tasasDeCambio.put("Libras Esterlinas", CurrencyType.LIBRA_ESTERLINA);
        tasasDeCambio.put("Peso Mexicano", CurrencyType.PESO_MEXICANO);
        tasasDeCambio.put("Peso Argentino", CurrencyType.PESO_ARGENTINO);
        tasasDeCambio.put("Peso Chileno", CurrencyType.PESO_CHILENO);
        tasasDeCambio.put("Won Sul-Coreano", CurrencyType.WON_SULCOREANO);
        tasasDeCambio.put("Yen Japonés", CurrencyType.YEN_JAPONES);
    }

    public BigDecimal convertir(String monedaOrigen, String monedaDestino, BigDecimal cantidad) {
        CurrencyType tasaOrigen = tasasDeCambio.get(monedaOrigen);
        CurrencyType tasaDestino = tasasDeCambio.get(monedaDestino);

        double factorConversionOrigen = Double.parseDouble(tasaOrigen.getFACTOR_CONVERSION().toString());
        double factorConversionDestino = Double.parseDouble(tasaDestino.getFACTOR_CONVERSION().toString());

        BigDecimal factorOrigen = BigDecimal.valueOf(factorConversionOrigen);
        BigDecimal factorDestino = BigDecimal.valueOf(factorConversionDestino);

        return cantidad.multiply(factorDestino.divide(factorOrigen, 4, RoundingMode.HALF_UP));
    }

}
