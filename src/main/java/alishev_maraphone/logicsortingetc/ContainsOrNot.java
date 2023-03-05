package alishev_maraphone.logicsortingetc;

import java.util.List;
import java.util.Map;

public class ContainsOrNot {
    public static void main(String[] args) {
        var map = Map.of(
                "L1112", "Petr",
                "L3334", "Sergey",
                "L1114", "Anna",
                "L64", "Artem"
        );
        var list = List.of("L12", "L22", "L64", "L10");

        System.out.println(isKeyInMapContainsAnyElementINList(map, list));
    }

    private static boolean isKeyInMapContainsAnyElementINList(Map<String, String> aMapToSearchIn, List<String> aListToSearchFor) {
        boolean isKeyInMapContainsTheElementINList = false;
        label:
        for (String mapKeyElem : aMapToSearchIn.keySet()) {
            for (String listElem : aListToSearchFor) {
                if(mapKeyElem.contains(listElem)) {
                    isKeyInMapContainsTheElementINList = true;
                    break label;
                }
                isKeyInMapContainsTheElementINList = false;
            }
        }
        return isKeyInMapContainsTheElementINList;
    }
}
