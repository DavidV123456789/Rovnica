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
    public Riesenie getPocetKorenov()
    {
        return null;
    }
    public void vypisKorene()
    {

    }
}
