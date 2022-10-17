package rca.devops.v1.servicesImpls;

import org.springframework.stereotype.Service;
import rca.devops.v1.services.ISimpleCalculatorService;

@Service
public class SimpleCalculatorServiceImpl implements ISimpleCalculatorService {
    @Override
    public int add(int[] arr) {
        int sum = 0;
        for(int num:arr){
            sum += num;
        }
        return sum;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int arr[]) {
        int prod = 1;
        for(int num:arr){
            prod = prod * num;
        }
        return prod;
    }
}
