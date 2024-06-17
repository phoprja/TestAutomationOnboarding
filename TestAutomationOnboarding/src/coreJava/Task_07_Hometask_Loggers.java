package coreJava;

public class Task_07_Hometask_Loggers {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
        
        int result = calculator.add(10, 20);
        System.out.println("Addition result: " + result);
        
        double divisionResult = calculator.divide(10, 2);
        System.out.println("Division result: " + divisionResult);
        
        divisionResult = calculator.divide(10, 0);
        System.out.println("Division result (Exception): " + divisionResult);

}
	
}
