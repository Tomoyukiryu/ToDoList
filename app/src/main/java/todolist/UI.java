package todolist;


/**
 * UI
 */
public class UI {
  private char[][] display;
  public UI(){
    this.display = new char[2][2];
  }

  public void frame(){
    horizontalFrame();
    for (int i = 0; i < display.length; i++) {
      System.out.print("*  ");
      for (int j = 0; j < display[0].length; j++) {
        System.out.print(display[i][j]);
      }
      System.out.println("  *");
    }
    horizontalFrame();
  }
  public void horizontalFrame(){
    for (int i = 0; i < display[0].length+4; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}
