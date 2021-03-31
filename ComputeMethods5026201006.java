import java.util.Random;
import java.lang.Math;
public class ComputeMethods5026201006{
    public double fToC(double degreesF){
    return 5/9.0 * (degreesF - 32);
    }
    public double hypotenuse(double a, double b){
    return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
    public int roll(){
    Random dice = new Random ();
    return dice.nextInt((6)+1) + dice.nextInt((6)+1);
    }
}
    
    