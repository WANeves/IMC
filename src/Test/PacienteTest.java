

import org.junit.Assert;
import org.junit.Test;

import main.Paciente;

/**
 * Created by wellingtonalvesdasneves on 6/9/16.
 */
public class PacienteTest {
    @Test
    public void testPesoMuitoGrave(){
        Paciente p1 = new Paciente(40, 1.63);
        Assert.assertEquals(15, p1.calcularIMC(p1.getPeso(), p1.getGetAltura()),1);
    }

    @Test
    public void testPesoGrave(){
        Paciente p1 = new Paciente(45, 1.63);
        Assert.assertEquals(16, p1.calcularIMC(p1.getPeso(), p1.getGetAltura()),0.99);
    }

    @Test
    public void testBaixoPeso(){
        Paciente p1 = new Paciente(48, 1.63);
        Assert.assertEquals(17, p1.calcularIMC(p1.getPeso(), p1.getGetAltura()),1.49);
    }

    @Test
    public void testPesoNormal(){
        Paciente p1 = new Paciente(55, 1.63);
        Assert.assertEquals(18.50, p1.calcularIMC(p1.getPeso(), p1.getGetAltura()),5.99);
    }

    @Test
    public void testSobrePeso(){
        Paciente p1 = new Paciente(70, 1.63);
        Assert.assertEquals(25, p1.calcularIMC(p1.getPeso(), p1.getGetAltura()),4.99);
    }

    @Test
    public void testObesidade1(){
        Paciente p1 = new Paciente(92, 1.63);
        Assert.assertEquals(30, p1.calcularIMC(p1.getPeso(), p1.getGetAltura()),4.99);
    }

    @Test
    public void testObesidade2(){
        Paciente p1 = new Paciente(105, 1.63);
        Assert.assertEquals(35, p1.calcularIMC(p1.getPeso(), p1.getGetAltura()),4.99);
    }

    @Test
    public void testObesidade3(){
        Paciente p1 = new Paciente(120, 1.63);
        Assert.assertEquals(40, p1.calcularIMC(p1.getPeso(), p1.getGetAltura()),10);
    }

}