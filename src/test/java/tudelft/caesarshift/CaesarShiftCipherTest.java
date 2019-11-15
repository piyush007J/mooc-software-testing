package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void lastBoundaryCheck()
    {
        CaesarShiftCipher Shift=new CaesarShiftCipher();
        String shiftStr=Shift.CaesarShiftCipher("azx",4);
        Assertions.assertEquals("edb",shiftStr);
    }

    @Test
    public void checkForSpaceInputs()
    {
        CaesarShiftCipher Shift=new CaesarShiftCipher();
        String shiftStr=Shift.CaesarShiftCipher("a bcd ef",1);
        Assertions.assertEquals("b cde fg",shiftStr);

    }

    @Test
    public void checkforSpecialChar()
    {
        CaesarShiftCipher Shift=new CaesarShiftCipher();
        String shiftStr=Shift.CaesarShiftCipher("a#$%",1);
        Assertions.assertEquals("invalid",shiftStr);

    }

    @Test
    public void CombinationSpecialCharAndSpace()
    {
        CaesarShiftCipher Shift=new CaesarShiftCipher();
        String shiftStr=Shift.CaesarShiftCipher("a b@#$d ef",1);
        Assertions.assertEquals("invalid",shiftStr);

    }

    @Test
    public void negativeShiftOnBoundary()
    {

        CaesarShiftCipher Shift=new CaesarShiftCipher();
        String shiftStr=Shift.CaesarShiftCipher("abc",-4);
        Assertions.assertEquals("wxy",shiftStr);

    }

    @Test
    public void shiftGreaterthan26()
    {

        CaesarShiftCipher Shift=new CaesarShiftCipher();
        String shiftStr=Shift.CaesarShiftCipher("abc",52);
        Assertions.assertEquals("abc",shiftStr);

    }
    

}
