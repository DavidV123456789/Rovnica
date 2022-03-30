/*package rovnica.map;

public class RovnicaLN implements Rovnica{
    protected float a;
    protected float b;

    RovnicaLN(float a1, float b1){
        this.a=a1;
        this.b=b1;
    }
    RovnicaLN(float a1)
    {
        this.a=this.b=a1;
    }
    RovnicaLN(){
        this( 1);
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }
    public String toString()
    {
        return a+"x"+((b>0)?"+":"-")+b+"=0";
    }
    public Riesenie getPocetKorenov()
        {
            Riesenie result = Riesenie.JEDNO;
            if(a==0)
            {
                if(b==0)
                {
                    result= Riesenie.VELA;
                }
                else {
                    result=Riesenie.ZIADNE;
                }
            }
            return  result;
        }
    public void vypisKorene()
    {
        switch (getPocetKorenov())
        {
            case JEDNO -> System.out.println("Koren je:"+" "+(-b/a));
            case ZIADNE -> System.out.println("Nema korene");
            case VELA -> System.out.println("Vela korenov");

        }
    }
    /*
    public void dajRiesenie()
    {

    }
}
*/

package rovnica.map;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RovnicaLn implements Rovnica
{
    static class VelaRieseni extends Exception
    {
        private final String info;
        VelaRieseni(String ret)
        {
            info = ret;
        }
        String getInfo()
        {
            return info;
        }
        public String toString()
        {
            return "Vela rieseni";
        }
    }

    protected float b;
    protected float c;

    public RovnicaLn(float b, float c)
    {
        this.b = b;
        this.c = c;
    }

    public RovnicaLn(float a)
    {
        this.b = this.c = a;
    }

    public RovnicaLn()

    {


            System.out.println("Zadaj koeficient b: ");
            b=getFloat();
            System.out.println("Zadaj koeficient c: ");
            c=getFloat();

        /*catch (InputMismatchException ex)
        {
            System.out.println("Nebolo zadane cislo");
        }*/

    }

    public String toString()
    {
        return b + "x" + ((c >= 0) ? "+" : "") + c + "=0";
    }

    private float getFloat ()
    {
        Scanner sc= new Scanner(System.in);
        //next bez typu ako Float číta reťazec po najblizsi biely znak
        /*
        String text;
        text=sc.next();
        text=sc.nextLine();// precita text az do konca riadku
         */
        float cislo;
        while(true)
        {
            try{
                cislo=sc.nextFloat();
                return cislo;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Zly vstup");
                sc.nextLine();
            }
        }
    }

    @Override
    public Riesenie getPocetKorenov()
    {
        Riesenie result = Riesenie.JEDNO;
        if (b == 0)
        {
            if (c == 0)
            {
                result = Riesenie.VELA;
            }
            else
            {
                result = Riesenie.ZIADNE;
            }
        }
        return result;
    }

    @Override
    public void vypisKorene()
    {
        switch (getPocetKorenov())
        {
            case JEDNO -> System.out.println("Koren je:" + " " + (-c / b));
            case ZIADNE -> System.out.println("Nema koren");
            case VELA -> System.out.println("Vela korenov");
        }
    }

    @Override
    public void dajRiesenie()
    {
        try
        {
            float koren = -c / b;
            if (b == 0)
            {
                if (c == 0)
                {
                    throw new VelaRieseni("Vela korenov!");
                }
                else
                {
                    throw new ArithmeticException();
                }
            }
            System.out.println("Koren je:" + koren);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Ziadny koren!");
        }
        catch (VelaRieseni exc)
        {
            System.out.println(exc);
        }
    }
}
