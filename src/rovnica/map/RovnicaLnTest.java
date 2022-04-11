package rovnica.map;

import org.junit.Assert;

import static org.junit.Assert.*;

public class RovnicaLnTest {

    private RovnicaLn rovnicaTEST;

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getPocetKorenov() {
        rovnicaTEST = new RovnicaLn(2,4);
        Assert.assertEquals("Jedno riesenie",Riesenie.JEDNO,rovnicaTEST.getPocetKorenov());
        rovnicaTEST = new RovnicaLn(0,4);
        Assert.assertEquals("Ziadne riesenie",Riesenie.ZIADNE,rovnicaTEST.getPocetKorenov());
        rovnicaTEST = new RovnicaLn(0,0);
        Assert.assertEquals("Vela rieseni",Riesenie.VELA,rovnicaTEST.getPocetKorenov());
    }

    @org.junit.Test
    public void vypisKorene() {
        rovnicaTEST = new RovnicaLn(2,4);
        Assert.assertEquals("Jedno riesenie",-2,rovnicaTEST.vypisKorene().getKoren1(),0.01);
        rovnicaTEST = new RovnicaLn(0,4);
        Assert.assertEquals("Ziadne riesenie",Float.NaN,rovnicaTEST.vypisKorene().getKoren1(),0.01);
        rovnicaTEST = new RovnicaLn(0,0);
        Assert.assertEquals("Vela rieseni",Float.POSITIVE_INFINITY,rovnicaTEST.vypisKorene().getKoren1(),0.01);
    }

    @org.junit.Test
    public void dajRiesenie() {
        rovnicaTEST = new RovnicaLn(2,4);
        Assert.assertEquals("Jedno riesenie",-2,rovnicaTEST.vypisKorene().getKoren1(),0.01);
        rovnicaTEST = new RovnicaLn(0,4);
        Assert.assertEquals("Ziadne riesenie",Float.NaN,rovnicaTEST.vypisKorene().getKoren1(),0.01);
        rovnicaTEST = new RovnicaLn(0,0);
        Assert.assertEquals("Vela rieseni",Float.POSITIVE_INFINITY,rovnicaTEST.vypisKorene().getKoren1(),0.01);
    }
}