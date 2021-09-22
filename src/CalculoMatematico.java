public class CalculoMatematico {

    public double dividir(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Divisor zero!");
        }
        return a/b;

    }
}
