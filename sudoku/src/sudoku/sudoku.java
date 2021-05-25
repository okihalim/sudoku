package sudoku;
import java.util.Random; 
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class sudoku {
	public static int[][] createBoard(){
		int[][] board = new int[9][9];
		Random rand = new Random(); 
		int x[];
		ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<10; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
		
		for (int i = 0; i < 9; i ++) {
			for (int j = 0; j < 9; j++) {  
				 
				board[i][j] = list.get( j);
			}
			 int temp = list.get(list.size()-1); 
			 for(int p = list.size()-1; p > 0; p--)
			    {
				  list.set(p,list.get(p-1)); 
			    }
			 list.set(0, temp);  
		}
		
		for (int i = 0; i < 9; i ++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j] + " "); 
			}
			System.out.println();
		}
		
		return board;
	}
	
	
	
	public static void main(String[] args) {
	
			System.out.println("Enter Difficulty Level");
			System.out.println("JK, only easy mode available (for now :})");
			
			int[][] a = new int[9][9];
			
			a = createBoard();
		}
}
