package rainfallclass;
import java.util.Scanner;
public class RainfallClass {
public static void main(String[] args)
	{
	double[] months = new double[12];
	double[] rainfall = new double[12];
 	Scanner keyboard = new Scanner(System.in);
 	for (int index = 0; index < rainfall.length; index++)
	{
	System.out.print("Enter rainfall for month #" + 
        (index + 1) + ": ");
	rainfall[index] = keyboard.nextDouble();
		}
 	TotalRainfall(rainfall);
 	Average(rainfall);
 	Most(rainfall, months);
 	Least(rainfall, months);
	}
 public static void TotalRainfall(double[] rainfall)
	{
	double total = 0;
	for (int index = 0; index < rainfall.length; index++)
	{
	total += rainfall[index];
	}
	System.out.printf("total rainfall is: " , total);
	}
 	public static void Average(double[] rainfall)
	{
	double total = 0;
	double average;
	for (int index = 0; index < rainfall.length; index++)
		{
			total += rainfall[index];
	}
		average = total / rainfall.length;
 		System.out.printf("average monthly rainfall is: " , average);
	}
        public static void Most(double[] rainfall, double[] months)
	{
            double highest = rainfall[0];
            double month = 0;
 		for (int index = 1; index < rainfall.length; index++)
		{
			if (rainfall[index] > highest)
		{
			month = months[index];
		}
		}
			System.out.println("Highest raifall occurred during "
                                + "month # " + month);
	}
	public static void Least(double[] rainfall, double[] months)
	{
		double lowest = 0;
		int month=0;
		for (int index = 1; index < rainfall.length; index++)
		{
		if (rainfall[index] < lowest)
		{
		lowest = rainfall[index];
		month = index;
		}
		}
 		System.out.println("Least rainfall occurred during month #"
                        + month);
	}
}
