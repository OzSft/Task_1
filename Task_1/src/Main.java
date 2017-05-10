import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String[] args){
		
		ArrayList<DieselTrain> dieselTrainList = new ArrayList<>();
		ArrayList<Locomotive> locomotiveList = new ArrayList<>();
		ArrayList<Sportbike> sportbikeList = new ArrayList<>();
		ArrayList<Tricycle> tricycleList = new ArrayList<>();
		
		//------------------------------------- DieselTain ---------------------------------------------------
		
		try {
			String filePath = "txt\\DieselTrain.txt";
			
			File file = new File(filePath);
			Scanner input = new Scanner(file);
			
			while(input.hasNextLine()) {
				String[] split = input.nextLine().split(",");
				DieselTrain dieselTrain = new DieselTrain(split[0], Integer.parseInt(split[1]),
																	Double.parseDouble(split[2]),
																	Integer.parseInt(split[3]),
																	Integer.parseInt(split[4]));
				dieselTrainList.add(dieselTrain);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found!");
		}
		
		//------------------------------------- Locomotive ---------------------------------------------------
		
		try {
			String filePath = "txt\\Locomotive.txt";
			
			File file = new File(filePath);
			Scanner input = new Scanner(file);
			
			while(input.hasNextLine()) {
				String[] split = input.nextLine().split(",");
				Locomotive locomotive = new Locomotive(split[0], Integer.parseInt(split[1]),
																	Double.parseDouble(split[2]),
																	Integer.parseInt(split[3]),
																	Integer.parseInt(split[4]));
				locomotiveList.add(locomotive);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found!");
		}
		
		//------------------------------------- Sportbike ---------------------------------------------------
		
		try {
			String filePath = "txt\\Sportbike.txt";
			
			File file = new File(filePath);
			Scanner input = new Scanner(file);
			
			while(input.hasNextLine()) {
				String[] split = input.nextLine().split(",");
				Sportbike sportbike = new Sportbike(split[0], Integer.parseInt(split[1]),
																	Double.parseDouble(split[2]),
																	Integer.parseInt(split[3]),
																	Integer.parseInt(split[4]));
				sportbikeList.add(sportbike);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found!");
		}
		
		//------------------------------------- Tricycle ---------------------------------------------------
		
		try {
			String filePath = "txt\\Tricycle.txt";
			
			File file = new File(filePath);
			Scanner input = new Scanner(file);
			
			while(input.hasNextLine()) {
				String[] split = input.nextLine().split(",");
				Tricycle tricycle = new Tricycle(split[0], Integer.parseInt(split[1]),
																	Double.parseDouble(split[2]),
																	Integer.parseInt(split[3]),
																	Integer.parseInt(split[4]));
				tricycleList.add(tricycle);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found!");
		}
		
		
		locomotiveList.sort(null);
		dieselTrainList.sort(null);
		sportbikeList.sort(null);
		tricycleList.sort(null);
		
		ArrayList<Mashine> mashineList = new ArrayList<>();
		mashineList.addAll(locomotiveList);
		mashineList.addAll(dieselTrainList);
		mashineList.addAll(sportbikeList);
		mashineList.addAll(tricycleList);
		
		mashineList.sort(null);
		
		try {
			String filePath = "txt\\Mashine.txt";
			
			PrintWriter writer = new PrintWriter(filePath);
			
			for (Mashine mashine : mashineList) {
				writer.println(mashine.getName() + ", " + mashine.getSpeed() + ", " +
								mashine.getWeight() + ", " + mashine.getCountOfPassengers() +
								", " + mashine.getCountOfWheels());
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found!");
		}
	}

}
