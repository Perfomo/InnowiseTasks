package exp.toleyko.fileSystem.tools;

import org.junit.Assert;
import org.junit.Test;

public class StringValidatorTest {


    @Test
    public void isValidTest1() {
        Assert.assertFalse(StringValidtor.isValid("/"));
    }

    @Test
    public void isValidTest2() {
        Assert.assertFalse(StringValidtor.isValid(""));
    }

    @Test
    public void isValidTest3() {
        Assert.assertFalse(StringValidtor.isValid("."));
    }

    @Test
    public void isValidTest4() {
        Assert.assertFalse(StringValidtor.isValid("?"));
    }

    @Test
    public void isValidTest5() {
        Assert.assertFalse(StringValidtor.isValid("d//d"));
    }

    @Test
    public void isValidTest6() {
        Assert.assertFalse(StringValidtor.isValid("d/d//"));
    }

    @Test
    public void isValidTest7() {
        Assert.assertFalse(StringValidtor.isValid("d/d/d.tct.b"));
    }

    @Test
    public void isValidTest8() {
        Assert.assertFalse(StringValidtor.isValid("d/d/d."));
    }

    @Test
    public void isValidTest9() {
        Assert.assertFalse(StringValidtor.isValid("d/d/d.d/"));
    }

    @Test
    public void isValidTest10() {
        Assert.assertFalse(StringValidtor.isValid("d/d/d.d/d"));
    }

    @Test
    public void isValidTest11() {
        Assert.assertFalse(StringValidtor.isValid("f f"));
    }

    @Test
    public void isValidTest12() {
        Assert.assertTrue(StringValidtor.isValid("d"));
    }

    @Test
    public void isValidTest13() {
        Assert.assertTrue(StringValidtor.isValid("d/"));
    }

    @Test
    public void isValidTest14() {
        Assert.assertTrue(StringValidtor.isValid("d/d/"));
    }

    @Test
    public void isValidTest15() {
        Assert.assertTrue(StringValidtor.isValid("d/d"));
    }

    @Test
    public void isValidTest16() {
        Assert.assertTrue(StringValidtor.isValid("d/f.tg"));
    }

    @Test
    public void isValidTest17() {
        Assert.assertTrue(StringValidtor.isValid("f.tg"));
    }

}
