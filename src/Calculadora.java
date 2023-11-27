public class Calculadora {

    //Atributos
    double  numero1;
    double numero2;
    double resultado;

    // Classes


    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }


    public double adicao(double numero1, double numero2){
        return resultado = numero1 + numero2;
    }

    public double subtracao(double numero1, double numero2){
        return resultado = numero1 - numero2;
    }
    public double multiplicacao(double numero1, double numero2){
        return resultado = numero1 * numero2;
    }
    public double divisao(double numero1, double numero2){
        return resultado = numero1 / numero2;
    }

    public double obterResultado(){
        return resultado;
    }

}
