public class BinString {

    public String convert(String s) {
        return binarise(sum(s));
    }

    public int sum(String s) {

        /**
         * Ajuda
         * https://www.w3schools.com/java/tryjava.asp?filename=demo_ref_string_charat
         * String myStr = "Hello";
         * char result = myStr.charAt(0);
         * int result2 = ((int) myStr.charAt(1));
         * System.out.println(result2);
         */

        // Se a string tiver vazia devolve 0
        if (s == "") {
            return 0;
        }

        // Se a string for igual a 1 devolve a posicao do caracter na posicao 0 em
        // decimal ex: d == 100
        if (s.length() == 1) {
            return ((int) s.charAt(0));
        }

        /**
         * Caso os dois casos acima nao se verifiquem
         * devolve a posicao do caracter na posicao 0 em decimal + a posicao do caracter
         * em decimal na posicao 1
         * ex: Add -> 65 + 100 + 100 = 265
         * s.substring esta a criar uma nova string dd e repete esta linha em baixo
         * que começa na posicao 1(d).
         */
        return (((int) s.charAt(0))) + sum(s.substring(1));
    }

    public String binarise(int x) {

        /**
         * Caso x seja igual a 0 retorna vazio
         */
        if (x == 0) {
            return "";
        }
        /**
         * caso x mod 2 seja igual a 1 devolve a string "1" juntamente com o resultado
         * de binarise(x / 2)
         */
        /*
         * if (x % 2 == 1) {
         * return "1" + binarise(x / 2);
         * }
         */
        if (x % 2 == 1) {
            return binarise(x / 2) + "1";
        }
        /**
         * Se nenhuma das condicoes encima se verificar devolve string "0" juntamente
         * com o resultado de binarise(x / 2)
         */
        // return "0" + binarise(x / 2);
        return binarise(x / 2) + "0";

    }
}
