/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.emptyType;
import javax.inject.Inject;
import junit.framework.Assert;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
        

@RunWith(Arquillian.class)
public class UtilitiesTest {
    
    @Deployment
    public static WebArchive desplegar() {
        WebArchive salida=ShrinkWrap.create(WebArchive.class)
                .addClass(Utilities.class)
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(salida.toString(true));
        return salida;
    }
    
    @Inject
    private Utilities servicio;
    
    @Test
    public void probarMetodogetResume(){
        String texto="Bienvenidos a la materia de Programacion 3 Ciclo II 2017";
        String respuesta="Bienvenidos a la mat";
        String resultado = servicio.getresumen(texto);
        Assert.assertEquals(respuesta, resultado);
    
}
    @Test
    public void probarMetodogetResume1(){
        String texto="Hola Mundo";
        String respuesta="Hola Mundo";
        String resultado = servicio.getresumen(texto);
        Assert.assertEquals(respuesta, resultado);
}
    
    @Test
    public void probarMetodogetResume2(){
        String texto=null;
        String respuesta=null;
        String resultado = servicio.getresumen(texto);
        Assert.assertEquals(respuesta, resultado);
}
    
    @Test
    public void probarMetodoCapitalizar(){
        String texto="prueBas de UNIDAD co JUnit & arQuillian";
        String respuesta="Pruebas De Unidad Con Junit & Arquillian";
        String resultado = servicio.capitalizar(texto);
        Assert.assertEquals(respuesta, resultado);
    }
    
    @Test
    public void probarMetodocapitalizar1(){
        String texto="";
        String respuesta="";
        String resultado = servicio.capitalizar(texto);
        Assert.assertEquals(respuesta, resultado);

    }
 
    @Test
    public void probarMetodoCapitalizar2(){
        String texto=null;
        String respuesta=null;
        String resultado = servicio.capitalizar(texto);
        Assert.assertEquals(respuesta, resultado);
    }
    
    @Test
    public void probarMetodocontarCoincidencias(){
        String texto="Bienvenidos a la materia de Programacion 3 Ciclo II 2017";
        String frase="2017";
        int respuesta=1;
        int resultado = servicio.contarCoincidencias(frase,texto);
        Assert.assertEquals(respuesta, resultado);
    }
    
    @Test
    public void probarMetodocontarCoincidencias1(){
        String texto="Bienvenidos a la materia de Programacion 3 Ciclo II 2017";
        String frase="MA";
        int respuesta=2;
        int resultado = servicio.contarCoincidencias(frase,texto);
        Assert.assertEquals(respuesta, resultado);
    }
    
    @Test
    public void probarMetodocontarCoincidencias2(){
        String texto=null;
        String frase="bienvenido";
        int respuesta=0;
        int resultado = servicio.contarCoincidencias(frase,texto);
        Assert.assertEquals(respuesta, resultado);
    }
}
   


