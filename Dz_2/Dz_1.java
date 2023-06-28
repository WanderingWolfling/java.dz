import java.util.HashMap;
import java.util.Map;

public class SQLQueryBuilder {
    public static void main(String[] args) {
        String baseQuery = "select * from students where ";
        Map<String, String> filters = new HashMap<>();
        filters.put("name", "Ivanov");
        filters.put("country", "Russia");
        filters.put("city", "Moscow");
        filters.put("age", "null");

        String whereClause = buildWhereClause(filters);
        String finalQuery = baseQuery + whereClause;
        System.out.println("Final Query: " + finalQuery);
    }

    public static String buildWhereClause(Map<String, String> filters) {
        StringBuilder whereClause = new StringBuilder();
        for (Map.Entry<String, String> entry : filters.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (value != null && !value.equals("null")) {
                if (whereClause.length() > 0) {
                    whereClause.append(" and ");
                }
                whereClause.append(key).append(" = '").append(value).append("'");
            }
        }
        return whereClause.toString();
    }
}
