package rovnica.map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RovnicaKvTest {

    private RovnicaKv rovnicaTEST;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getPocetKorenov() {
        rovnicaTEST = new RovnicaKv(1,2,5);
        Assert.assertEquals("Ziadny koren",Riesenie.ZIADNE,rovnicaTEST.getPocetKorenov());
        rovnicaTEST = new RovnicaKv(1,4,4);
        Assert.assertEquals("Jeden koren",Riesenie.JEDNO,rovnicaTEST.getPocetKorenov());
        rovnicaTEST = new RovnicaKv(1,5,6);
        Assert.assertEquals("Dva korene",Riesenie.DVE,rovnicaTEST.getPocetKorenov());
    }

    @Test
    public void vypisKorene() {
        rovnicaTEST = new RovnicaKv(1,2,5);
        Assert.assertEquals("Ziadne riesenie",Float.NaN,rovnicaTEST.vypisKorene().getKoren1(),0.01);
        rovnicaTEST = new RovnicaKv(1,4,4);
        Assert.assertEquals("Jedno riesenie",-2,rovnicaTEST.vypisKorene().getKoren1(),0.01);
        rovnicaTEST = new RovnicaKv(1,5,6);
        Assert.assertEquals("Dve riesenia",-2,rovnicaTEST.vypisKorene().getKoren1(),0.01);
        Assert.assertEquals("Dve riesenia",-3,rovnicaTEST.vypisKorene().getKoren2(),0.01);
    }

    @Test
    public void dajRiesenie() {
        rovnicaTEST = new RovnicaKv(1,2,5);
        Assert.assertEquals("Ziadne riesenie",Float.NaN,rovnicaTEST.vypisKorene().getKoren1(),0.01);
        rovnicaTEST = new RovnicaKv(1,4,4);
        Assert.assertEquals("Jedno riesenie",-2,rovnicaTEST.vypisKorene().getKoren1(),0.01);
        rovnicaTEST = new RovnicaKv(1,5,6);
        Assert.assertEquals("Dve riesenia",-2,rovnicaTEST.vypisKorene().getKoren1(),0.01);
        Assert.assertEquals("Dve riesenia",-3,rovnicaTEST.vypisKorene().getKoren2(),0.01);
    }
}