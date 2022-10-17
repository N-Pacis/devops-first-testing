package rca.devops.v1.serviceImpls;

import org.junit.jupiter.api.Test;
import rca.devops.v1.services.ISimpleCalculatorService;
import rca.devops.v1.servicesImpls.SimpleCalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorServiceImplTest {

    private final ISimpleCalculatorService service = new SimpleCalculatorServiceImpl();

    @Test
    public void add_success(){

        int expectedResult = 6;
        int actualResult = service.add(new int[]{1,2,3});

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void add_empty(){
        int actual = service.add(new int[] {});
        assertEquals(0,actual);
    }

    @Test
    public  void subtract_success(){
        int expectedResult = 4;
        int actualResult = service.subtract(5,1);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void subtract_bigger_number(){
        int expectedResult = -1;
        int actualResult = service.subtract(4,5);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void subtract_zero(){
        assertEquals(4,service.subtract(4,0));
    }

    @Test
    public void multiply_success(){
        int expectedResult = 6;
        int actualResult = service.multiply(new int[] {2,3});
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public  void multiply_by_zero(){
        int expectedResult = 0;
        int actualResult = service.multiply(new int[]{2,0});
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void multiply_negative() {
        int expectedResult = -4;
        int actualResult = service.multiply(new int[]{2,-2});
        assertEquals(expectedResult,actualResult);
    }
}
