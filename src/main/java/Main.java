import java.util.Scanner;

public class Main {

    static final String PEDIR_CONVERTER = "Insira uma letra/palavra: ";
    static final String PEDIR_SOMAR = "Insira uma letra/palavra: ";
    static final String PEDIR_BINARISE = "Insira um numero: ";
    static final String PEDIR_OP_MENU = "Escolher opção: ";

    static final String MOSTRAR_CONVERTER = "O Resultado de converter é: ";
    static final String MOSTRAR_SOMAR = "O Resultado de somar é: ";
    static final String MOSTRAR_BINARISE = "O Resultado de binarise é: ";

    static private BinString binString = new BinString();

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {

        boolean sairVF = false;

        while (sairVF == false) {

            System.out.println("\n");
            System.out.println(":::::::::: M E N U ::::::::::");
            System.out.println(":: 1- Converter            ::");
            System.out.println(":: 2- Somar                ::");
            System.out.println(":: 3- Binarise             ::");
            System.out.println(":: 0- Sair                 ::");

            int res = lerInputInt(PEDIR_OP_MENU);

            if (res == 0) {
                break;
            } else {
                OpcaoMenu(res);
            }

        }

    }

    public static void OpcaoMenu(int escolha) {

        switch (escolha) {
            case 1:
                MenuConverter();
                break;
            case 2:
                MenuSomar();
                break;
            case 3:
                MenuBinarise();
                break;
            default:
                break;
        }

    }

    public static void MenuConverter() {

        boolean sairVF = false;

        while (sairVF == false) {

            System.out.println("\n");
            System.out.println(":::::::::: Converter ::::::::::");
            System.out.println(":: 1- Inserir valor          ::");
            System.out.println(":: 0- Sair                   ::");

            int res = lerInputInt(PEDIR_OP_MENU);

            if (res == 0) {
                break;
            } else {
                MostrarMsg(MOSTRAR_CONVERTER + binString.convert(lerInputString(PEDIR_CONVERTER)));
            }

        }

    }

    public static void MenuSomar() {

        boolean sairVF = false;

        while (sairVF == false) {

            System.out.println("\n");
            System.out.println("::::::::::    Somar   ::::::::::");
            System.out.println(":: 1- Inserir valor           ::");
            System.out.println(":: 0- Sair                    ::");

            int res = lerInputInt(PEDIR_OP_MENU);

            if (res == 0) {
                break;
            } else {
                MostrarMsg(MOSTRAR_SOMAR + binString.sum(lerInputString(PEDIR_SOMAR)));
            }

        }

    }

    public static void MenuBinarise() {

        boolean sairVF = false;

        while (sairVF == false) {

            System.out.println("\n");
            System.out.println("::::::::::  Binarise  ::::::::::");
            System.out.println(":: 1- Inserir valor           ::");
            System.out.println(":: 0- Sair                    ::");

            int res = lerInputInt(PEDIR_OP_MENU);

            if (res == 0) {
                break;
            } else {

                MostrarMsg(MOSTRAR_BINARISE + binString.binarise(lerInputInt(PEDIR_BINARISE)));
            }

        }

    }

    public static void MostrarMsg(String msg) {

        System.out.print(msg);

    }

    public static int lerInputInt(String msg) {

        boolean sair = true;
        int resultadoInt = 0;

        do {
            MostrarMsg(msg);
            try {
                sair = true;
                resultadoInt = NovoScanner().nextInt();
            } catch (Exception e) {
                sair = false;
            }
        } while (sair != true);

        return resultadoInt;

    }

    public static String lerInputString(String msg) {

        boolean sair = true;
        String resultadoString = "";

        do {
            MostrarMsg(msg);
            try {
                sair = true;
                resultadoString = NovoScanner().next();
            } catch (Exception e) {
                sair = false;
            }
        } while (sair != true);

        return resultadoString;

    }

    public static Scanner NovoScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

}
