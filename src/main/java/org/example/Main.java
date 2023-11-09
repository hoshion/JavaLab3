package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lab lab = new Lab();

        String text = """
                oegrk  ergokrgeko.rgokgo\trgpl rgp\nwgowkgokweo k oewo ewkofwk ok woekf 
                ger
                
                gerer4552lokler
                eplhtp
                45pl4525 2o5 23l 5pl pl g93482953ig jk owkok kk kkk kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                
                """;
        String symbol = "k";
        try {
            List<String> result = lab.calc(text, symbol);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}