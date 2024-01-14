package todolist;


/**
 * UI
 */
public class UI {
  private char[][] display;
  private int lineLength;
  public UI(){
    this.display = new char[2][2];
    this.lineLength = subarrayMaxLnegth();
  }

  public void frame(){
    horizontalFrame();
    for (int i = 0; i < display.length; i++) {
      System.out.print("* ");
      for (int j = 0; j < display[i].length; j++) {
        System.out.print(display[i][j]);
      }
        emptyLine(i);
      System.out.println("  *");
    }
    horizontalFrame();
  }
  public void horizontalFrame(){
    for (int i = 0; i < lineLength+5; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
  public void addLine(String line){
    char[] lineChar = line.toCharArray();
    if(ArrayIsNull(display[display.length-1])){
    for (int i = 0; i < display.length; i++) {
      if(ArrayIsNull(display[i])){
        display[i] = lineChar;
        break;
      }
    }
    }
    else{
          newLine(lineChar);
    }
      lineLength = subarrayMaxLnegth();
  }
  public void newLine(char[] arr){
    char[][] temp = new char[display.length+1][lineLength];
    for(int i = 0; i < display.length;i++){
        temp[i] = display[i];
    }
    temp[temp.length-1] = arr;
    display = temp;
  }
  public boolean ArrayIsNull(char[] arr){
boolean allNull = true;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != '\u0000')
			{
				allNull=false;
				break;
			}
    }
    return allNull;
  }
  public void emptyLine(int index){
    for(int i = 0; i < lineLength-display[index].length;i++)
      System.out.print(" ");
    if (ArrayIsNull(display[index])) {
      System.out.print("  ");
    }
  }
  private int subarrayMaxLnegth() {
    int max = display[0].length;
    for (char[] cs : display) {
      if (max<cs.length) {
        max = cs.length;
      }
    }
      return max;
  }
}
