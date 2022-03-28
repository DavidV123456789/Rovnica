package rovnica.map;

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
}
