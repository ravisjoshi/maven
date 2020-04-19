package com.ctl.ravi.maven_app;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{
	App obj = new App();
	
    @Test
    public void twoPlusTwoEqualsFour() {
        assertEquals(4, obj.adder(2, 2));
    }
    
    @Test
    public void twoSubTwoEqualsFour() {
        assertEquals(4, obj.sub(6, 2));
    }
}

