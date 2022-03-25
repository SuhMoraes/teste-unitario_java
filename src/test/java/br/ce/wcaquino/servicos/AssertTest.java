package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void test(){
        Assert.assertTrue(!false);
        Assert.assertFalse(!true);

        Assert.assertEquals(1,1);
        Assert.assertEquals(0.91,0.91, 0.01);
        Assert.assertEquals(Math.PI,3.14, 0.01);

        //Comparando Tipo Primitivio Vs Objeto
        int i = 5;
        Integer i2 = 5;
        Assert.assertEquals(Integer.valueOf(i), i2); //OU
        Assert.assertEquals(i, i2.intValue());

        Assert.assertEquals("bola", "bola");
        Assert.assertTrue("bola".equalsIgnoreCase("Bola"));

        Usuario us1 = new Usuario("Usuario 1");
        Usuario us2 = new Usuario("Usuario 1");
        Usuario us3 = null;

        Assert.assertEquals(us1, us2);

        Assert.assertSame(us2, us2);
        Assert.assertNotSame(us2, us3);


    }
}
