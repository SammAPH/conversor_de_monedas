import java.util.Map;

public record Response(String result, String base_code, Map<String, Double> conversion_rates) {
}
