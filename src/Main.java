    import java.util.Scanner; //biblioteca p importar

    public class Main {
        public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);  //criando objeto scanner pra entrada do usuário

        System.out.println("Digite um número inteiro: ");
        int numInteiro = entrada.nextInt(); //colocando o num int na variável int NumInteiro

        System.out.println("Digite um decimal: ");
        double numDecimal = entrada.nextDouble();


        Integer wrapperInt = Integer.valueOf(numInteiro);
        Double wrapperDecimal = Double.valueOf(numDecimal);

        System.out.println("Valor inteiro (primitiva): " + numInteiro);
        System.out.println("Valor decimal (primitiva): " + numDecimal);
        System.out.println("Valor inteiro (wrapper): " + wrapperInt);
        System.out.println("Valor decimal (wrapper): " + wrapperDecimal);

        entrada.close(); //fechando o objeto scanner
    }
    }
