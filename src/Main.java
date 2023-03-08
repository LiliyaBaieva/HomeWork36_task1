public class Main {
  public static void main(String[] args) {
    Soda sodaWithAdd = new Soda("Малина");
    Soda normalSoda = new Soda();

    System.out.println(sodaWithAdd.GetMyDrinkString());
    System.out.println(normalSoda.GetMyDrinkString());

  }


}