package tictactoe;

import java.util.Scanner;

public class TicTac{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=1,n;
		Enter ob=new Enter();
		String board[][]=ob.getArr1();
		do {
			System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]+"\n"
					+"- - - - -\n"+
					board[1][0]+" | "+board[1][1]+" | "+board[1][2]+"\n"
					+"- - - - -\n"+
					board[2][0]+" | "+board[2][1]+" | "+board[2][2]+"\n");
			if(ob.check()=="End Game") {
				if(count%2==0)
					System.out.println("Player1 wins!");
				else
					System.out.println("Player2 wins!");
				System.exit(0);
			}
		if(count%2!=0) {
		System.out.print("Enter player1:");
		ob.setUserName("player1");
		n=sc.nextInt();
		if(!ob.fillValues(n)) {
			count--;
		}
		ob.check();
		}
		else {
			System.out.print("Enter player2:");
			ob.setUserName("player2");
			n=sc.nextInt();
			if(!ob.fillValues(n)) {
				count--;
			}
			ob.check();
		}
		count++;
	}while(count<=9);
		System.out.println("Draw!");
		sc.close();
	}
}
