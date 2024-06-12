package coreJava;

public class Task_01_Hometask_Variables {
	
	public static void main(String[] args) {
		//1. Daniel has 3 apples; Amber has 2 apples. How many apples do Daniel and Amber have together?
        int danielApples = 3;
        int amberApples = 2;
        int totalApples1 = danielApples + amberApples;
        System.out.println("In scenario 1, Daniel and Amber have " + totalApples1 + " apples together.");

        //2. Daniel has 3.5 apples and Amber has 2.5 apples. How many apples do Daniel and Amber have together?
        double danielApplesDouble = 3.5;
        double amberApplesDouble = 2.5;
        double totalApples2 = danielApplesDouble + amberApplesDouble;
        System.out.println("In scenario 2, Daniel and Amber have " + totalApples2 + " apples together.");
    }

}
