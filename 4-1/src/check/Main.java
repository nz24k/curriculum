package check;

import constants.Constants;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String firstName = "石川";
		String lastName = "理恵";
		
		System.out.println("printNameメソッド→" +  printName(firstName, lastName));
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
	}

	private static String printName(String firstName, String lastName) {
		return firstName + lastName;
	}
}
