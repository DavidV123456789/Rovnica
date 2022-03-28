package rovnica.map;

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

    }*/
}

