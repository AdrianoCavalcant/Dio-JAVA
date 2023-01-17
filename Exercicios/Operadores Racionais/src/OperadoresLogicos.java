public class OperadoresLogicos{

public static void main(String[] args) {
    
    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = true;
    boolean b4 = false;

    // and
    System.out.println("b1 && b2 " + (b1 && b2));
    System.out.println("b1 && b3 " + (b1 && b3));

    // Or
    System.out.println("b2 || b3 " + (b2 || b3));
    System.out.println("b2 || b4 " + (b2 || b4));

    // Xor
    System.out.println("b1 ^ b3 " + (b1 ^ b3));
    System.out.println("b4 ^ b1 " + (b4 ^ b1));

    // Inversão
    System.out.println(!b1);
    System.out.println(!b2);

    double salarioMensal = 1.893;
    double mediaSalario = 2.000;

    int quantidadedeDependentes = 4;
    int mediaDependentes = 2;

    System.out.println((salarioMensal < mediaSalario) && (quantidadedeDependentes >= mediaDependentes));

    //  (diminuindo o  codigo)
    boolean salarioBaixo = salarioMensal < mediaSalario;
    boolean muitosDependentes = quantidadedeDependentes >= mediaDependentes;

    System.out.println((salarioBaixo)&&(muitosDependentes));

    //  (diminuindo o  codigo)
    boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

    System.out.println("Recebe Auxilio " + recebeAuxilio);

    
    
    







}





















}