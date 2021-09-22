public class Teste {
    public static void main(String[] args) {
        CalculoMatematico calcular = new CalculoMatematico();
        
        try{
            System.out.println("Resultado da divisão: " + calcular.dividir(4,0));
        } catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }
    }
}
