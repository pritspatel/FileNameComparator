package com.prits.file.comparator;

import org.apache.commons.io.comparator.NameFileComparator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Testing file name comparison" );
        final AbstractApplicationContext context =

                new ClassPathXmlApplicationContext("classpath:appContext.xml");

        context.registerShutdownHook();

    }
}
