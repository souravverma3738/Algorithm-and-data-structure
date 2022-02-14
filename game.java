import java.util.*;
import java.io.IOException;
public class game
{

	public static void main(String[] arg) {
		while (true) {
			System.out.println("\nWELCOME IN THE SUDOKU GAME");
			System.out.println("\n\n\t1.New Game");
			System.out.println("\t2.History");
			System.out.println("\t3.Exit");
			int a;
			Scanner s1 = new Scanner(System.in);
			System.out.println("\nEnter your choice:");
			a = s1.nextInt();

			switch (a) {
				case 1:
					clear();
					System.out.println("\n\n\t*************NEW GAME************");
					System.out.println("\n\n\t\t1.Easy");
					System.out.println("\t\t2.Medium");
					System.out.println("\t\t3.Hard");
					System.out.println("\n\t\t4.Back");
					int b;
					System.out.println("Enter your choice:");
					b = s1.nextInt();
					switch (b) {

						case 1:
							clear();System.out.println("\n\t\t\t*********EASY MODE********");
							System.out.println("\n\t\t\t\tHOW TO PLAY");
							System.out.println("\tTraditional Sudoku is a 9x9 puzzle grid made up of nine");
							System.out.println("\t3x3 region. What you need to do is to comokete the sudoku ");
							System.out.println("\tpuzzle and make sure that the same single number may not ");
							System.out.println("\tappear twice in the same row, column, or any of the nine 3x3 regons.");
							System.out.println("\tEnter 1 to conitnue:");
							int enter;
							enter = s1.nextInt();
							break;
						case 2:
							clear();
							System.out.println("\n\t\t\t*********MEDIUM MODE********");
							System.out.println("\n\t\t\t\tHOW TO PLAY");
							System.out.println("\tTraditional Sudoku is a 9x9 puzzle grid made up of nine");
							System.out.println("\t3x3 region. What you need to do is to comokete the sudoku ");
							System.out.println("\tpuzzle and make sure that the same single number may not ");
							System.out.println("\tappear twice in the same row, column, or any of the nine 3x3 regons.");
							System.out.println("\tEnter 1 to conitnue:");int enter1;
							enter1 = s1.nextInt();
							break;

						case 3:
							clear();
							System.out.println("\n\t\t\t*********HARD MODE********");
							System.out.println("\n\t\t\t\tHOW TO PLAY");
							System.out.println("\tTraditional Sudoku is a 9x9 puzzle grid made up of nine");
							System.out.println("\t3x3 region. What you need to do is to comokete the sudoku ");
							System.out.println("\tpuzzle and make sure that the same single number may not ");
							System.out.println("\tappear twice in the same row, column, or any of the nine 3x3 regons.");
							System.out.println("\tEnter 1 to conitnue:");
							int enter2;
							enter2 = s1.nextInt();
							break;
					}
					break;


				case 2:
					clear();
					System.out.println("\n\t________________HISTORY_______________");
					System.out.println("\n\t\tNote: IF YOU WANT TO REPLAY THE GAME PLEASE ENTER YOUR CHOICE BELOW:");
					System.out.println("\n\t\t1.Back");
					System.out.println("\t\t2.Records");
					System.out.println("\n\tEnter your choice:");
					int n;

					n = s1.nextInt();
					switch (n) {
						case 1:
							clear();
							break;
						case 2:
							clear();
							System.out.println("\n _____________RECORDS____________");
							break;
					}
			}
		}
	}

		public static void  clear()
		{
			try {
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}
			catch (Exception E)
			{
				System.out.println(E);
			}
		}
}

