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
            return null;
        }
    public void vypisKorene()
    {

    }
}

