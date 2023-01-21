import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
//    @BeforeEach
    private Calculator cal = new Calculator();
    @Test
    void twoPlusTwoEqualToFour() {
        var calculator = new Calculator();
        calculator.setCurrentValue(2);
        calculator.add();
        calculator.setCurrentValue(2);
        calculator.add();
        assertEquals(4,calculator.getCurrentTotal());
    }
    @Test
    void operationList(){
        var calculator = new Calculator();
        calculator.add();
        calculator.add();
        calculator.getOperation();
        for (String c: calculator.getOperation()){
            assertEquals(c, "+");
        }
    }

    @Test
    void cancelWhat(){
        var calculator = new Calculator();
        calculator.setCurrentValue(2);
        calculator.cancel();
        assertEquals(0.0,calculator.getCurrentValue());
    }
    @Test
    void testMultiply(){
       cal.setCurrentValue(1.0);
       cal.multiply();
       assertEquals(0.0, cal.getCurrentTotal());
    }


@Test
    void testModulus(){
        cal.setCurrentValue(4.0);
        cal.add();
        cal.setCurrentValue(45.0);
        cal.modulus();
        assertEquals(1.0, cal.getCurrentValue());
}
@Test
    void testClearTotal(){
        cal.setCurrentValue(4);
        cal.add();
        cal.clearTotal();
        assertEquals(0,cal.getCurrentTotal());

}
@Test
    void testInvert(){
        cal.setCurrentValue(20);
        cal.invert();
        assertEquals(-20, cal.getCurrentValue());
}

@Test
    void testRetriveMemory(){
      cal.setCurrentValue(20.0);
      cal.add();
      cal.setMemory();
      cal.setCurrentValue(5);
      cal.retrieveFromMemory();
      double result = cal.getCurrentValue();
      assertEquals(24.0,result );

}

@Test
    void testSubstractByTwenty(){
        cal.setCurrentValue(20.00);
        cal.subtract();
        assertEquals(-20.00, cal.getCurrentTotal());
}@Test
    void testSubstractByNegativeTwenty(){
        cal.setCurrentValue(-20.00);
        cal.subtract();
        assertEquals(20.00, cal.getCurrentTotal());
}


@Test
    void divideBy50(){
        Calculator calu = new Calculator();
        calu.setCurrentValue(50);
        calu.add();
        calu.setCurrentValue(2);
        calu.divide();
        assertEquals(25, calu.getCurrentTotal());
    }
@Test
    void testAddMemory(){
        cal.setCurrentValue(40);
        cal.add();
        cal.setMemory();
        // test to see if it adds
        cal.setCurrentValue(20);
        cal.addToMemory();
        cal.retrieveFromMemory();
        assertEquals(80,cal.getCurrentValue());


}
@Test
    void testSubtractMemoryEqualValue(){
        cal.setCurrentValue(40);
        cal.add();//total
        cal.setMemory();// 40 to memory
        cal.subtractFromMemory();
        assertEquals(0, cal.getCurrentTotal());
}

    @Test
    void testSubtractMemoryDiff(){
        cal.setCurrentValue(80);
        cal.add();//total
        cal.setMemory();// 80 to memory
        cal.add();// total should be 160
        cal.subtractFromMemory();
        assertEquals(80, cal.getCurrentTotal());
    }
@Test
    void testClearMemory(){
        cal.setCurrentValue(46);
        cal.add();
        cal.setMemory();
        cal.clearMemory();
        assertEquals(0, cal.getCurrentTotal());
}




}