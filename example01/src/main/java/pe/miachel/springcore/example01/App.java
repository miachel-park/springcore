package pe.miachel.springcore.example01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
        Pencil pencil = ctx.getBean("pencil", Pencil.class);
        
        pencil.use();
        
        ctx.close();
    }
}
