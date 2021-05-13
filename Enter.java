package tictactoe;
class Enter{
	private String username;
	private String arr1[][]={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
	//setting different values so that none of them equals
	public void setUserName(String username) {
		this.username=username;
	}
	public String getUserName() {
		return username;
	}
	public String[][] getArr1() {
		return arr1;
	}
	public String check() {
		//to check if any of the row,column or diagonal matches
			if ((arr1[0][0]==arr1[0][1]&&arr1[0][0]==arr1[0][2])||
				(arr1[1][0]==arr1[1][1]&&arr1[1][0]==arr1[1][2])||
				(arr1[2][0]==arr1[2][1]&&arr1[2][0]==arr1[2][2])||
				(arr1[0][0]==arr1[1][0]&&arr1[0][0]==arr1[2][0])||
				(arr1[0][1]==arr1[1][1]&&arr1[0][1]==arr1[2][1])||
				(arr1[0][2]==arr1[1][2]&&arr1[0][2]==arr1[2][2])||
				(arr1[0][0]==arr1[1][1]&&arr1[0][0]==arr1[2][2])||
				(arr1[0][2]==arr1[1][1]&&arr1[0][2]==arr1[2][0])){
				return "End Game";
			}
		return "Next turn";
	}
	public boolean fillValues(int value) {
		int k=1;//increments after each element of the array is accessed.
		outerloop:
		for(int r=1;r<=3;r++) {
			for(int c=1;c<=3;c++) {
				if((arr1[r-1][c-1]=="X"||arr1[r-1][c-1]=="O")&&value==k) {
					System.out.println("Entry not allowed! Place in another position");
					return false;
				}
				if(value==k && getUserName()=="player1") {
					arr1[r-1][c-1]="X";
					break outerloop;
				}
				if(value==k && getUserName()=="player2") {
					arr1[r-1][c-1]="O";
					break outerloop;
				}
				k++;
				}
			}
		return true;
		}
}


