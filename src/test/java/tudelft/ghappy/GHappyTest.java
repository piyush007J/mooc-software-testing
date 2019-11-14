package tudelft.ghappy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void g1stHappy()
    {
        GHappy gHappy=new GHappy();
        Boolean outCome =gHappy.gHappy("xxggxx");
        Assertions.assertTrue(outCome);

    }

    @Test
    public void g1stHappy2ndgNotHappy()
    {
        GHappy gHappy=new GHappy();
        Boolean outCome =gHappy.gHappy("xxggxxg");
        Assertions.assertFalse(outCome);
    }

    @Test
    public  void g1stNotHappy2ndgHappy()
    {
        GHappy gHappy=new GHappy();
        Boolean outCome =gHappy.gHappy("gxxggxx");
        Assertions.assertFalse(outCome);
    }

    @Test
    public void Allg()
    {
        GHappy gHappy=new GHappy();
        Boolean outCome =gHappy.gHappy("gggggg");
        Assertions.assertTrue(outCome);
    }

    @Test
    public void Nog()
    {
        GHappy gHappy=new GHappy();
        Boolean outCome =gHappy.gHappy("xxxx");
        Assertions.assertFalse(outCome);
    }

    @Test
    public  void g3At1st()
    {
        GHappy gHappy=new GHappy();
        Boolean outCome =gHappy.gHappy("gggijhsih");
        Assertions.assertTrue(outCome);
    }

    @Test
    public void g3AtLast()
    {
        GHappy gHappy=new GHappy();
        Boolean outCome =gHappy.gHappy("uififyggg");
        Assertions.assertTrue(outCome);
    }

    @Test
    public void g3Andg2Together()
    {
        GHappy gHappy=new GHappy();
        Boolean outCome =gHappy.gHappy("xxgggxxggaiugi");
        Assertions.assertFalse(outCome);
    }

    @Test
    public void g3Andg2TogetherT() {
        GHappy gHappy = new GHappy();
        Boolean outCome = gHappy.gHappy("xxgggxxggaiuggi");
        Assertions.assertTrue(outCome);
    }

    @Test
    public void AlternategPattern1(){
        GHappy gHappy = new GHappy();
        Boolean outCome = gHappy.gHappy("xgxgxgxgxgx");
        Assertions.assertFalse(outCome);

    }

    @Test
    public void AlternategPattern2(){
        GHappy gHappy = new GHappy();
        Boolean outCome = gHappy.gHappy("gzghgxgag");
        Assertions.assertFalse(outCome);
    }
}
