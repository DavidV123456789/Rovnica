/*package rovnica.map;

public class RovnicaKv extends RovnicaLN implements Rovnica{
    private  float c;

    public RovnicaKv(float a1, float b1, float c) {
        super(a1, b1);//super volá konštruktor rodičovskej triedy
        this.c = c;
    }

    public RovnicaKv(float a1, float c) {
        super(a1);
        this.c = c;
    }

    public RovnicaKv() {
        this(1,1);//vyvolá sa konštruktor nad tým
    }
    public String toString()
    {
        return a+"x^2"+((b>=0)?"+":"-")+b+"x"+((c>=0)?"+":"-")+c+"=0";
    }
    private  float getDiskriminant()
    {
        return b*b-4*a*c;
    }
    public Riesenie getPocetKorenov()
    {
        float result=getDiskriminant();
        if(result<0)
        {
            return Riesenie.ZIADNE;
        }
        else if(result>0)
        {
            return Riesenie.DVE;
        }
        return Riesenie.JEDNO;
    }
    public void vypisKorene()
    {
        switch (getPocetKorenov())
        {
            case JEDNO -> System.out.println("Koren je:"+" "+((-b)/(2*a)));
            case ZIADNE -> System.out.println("Nema korene");
            case DVE -> System.out.println("Koren 1 je:"+" "+((-b+Math.sqrt(getDiskriminant()))/(2*a))+"  Koren 2 je:"+" "+((-b-Math.sqrt(getDiskriminant()))/(2*a)));

        }
    }

    public void dajRiesenie()
    {

    }
}*/

package rovnica.map;

public class RovnicaKv extends RovnicaLn implements Rovnica
{
    static class nieJeKvadraticka extends Exception
    {
        private String info;
        nieJeKvadraticka(String text)
        {
            info=text;
        }
        String getInfo()
        {
            return info;
        }
    }
    private float a;
    public RovnicaKv(float a, float b, float c)
    {
        super(b, c); //vola konstruktor rodicovskej triedy
        this.a = a;
    }
    public RovnicaKv(float a, float b)
    {
        super(b);
        this.a = a;
    }
    public RovnicaKv()
    {
        this(1,1);
    }
    private float getDiskriminant()
    {
        return this.b * this.b -4* a * c;
    }
    public String toString()
    {
        return a +"x^2"+((this.b >0)?"+":"")+ this.b +"x"+((c >0)?"+":"")+ c +" = 0";
    }

    @Override
    public Riesenie getPocetKorenov()
    {
        Riesenie result = Riesenie.DVE;
        float D=getDiskriminant();
        if(D<0)
        {
            result=Riesenie.ZIADNE;
        }
        else if(D==0)
        {
            result=Riesenie.JEDNO;
        }
        return result;
    }
    @Override
    public void vypisKorene()
    {
        try
        {
            if(a==0) throw new nieJeKvadraticka("Rovnica je len linearna!");
            switch (getPocetKorenov())
            {
                case JEDNO -> System.out.println("Jedno riesenie: "+" "+(-this.b /(2* a)));
                case ZIADNE -> System.out.printf("Nema riesenie");
                case DVE -> System.out.printf("Prve:"+(-this.b + Math.sqrt(getDiskriminant()))/(2* a)+"\nDruhe:"+(-this.b - Math.sqrt(getDiskriminant()))/(2* a));
            }
        }
        catch (nieJeKvadraticka ex)
        {
            System.out.println(ex.getInfo());
            super.dajRiesenie();//super vyvoláva nadradenú triedu
        }

    }

    @Override
    public void dajRiesenie()
    {
        try
        {
            float D = getDiskriminant();
            if(a==0)
            {
                // throw new nieJeKvadraticka("Rovnica je len linearna!");
            }


            if(D>0)
            {
                System.out.println("x1= " + (-b)/(2*a));
            }
            else if(D==0){
                System.out.println("x1= " + (-b-Math.sqrt(D))/(2*a)+"; x2= " + (-b+Math.sqrt(D))/(2*a));
            }
            else {
                throw new ArithmeticException();
            }

            System.out.println("Koren je: " + D);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Nema riesenie");
        }

    }
}

