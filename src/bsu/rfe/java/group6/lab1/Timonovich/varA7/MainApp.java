package bsu.rfe.java.group6.lab1.Timonovich.varA7;
public class MainApp {


    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {

        Food[] breakfast = new Food[20];

        int itemsSoFar = 0;
        int icecreamCount=0;
        int appleCount=0;
        int cheeseCount=0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("IceCream")) {
                for (int i = 0; i < breakfast.length; i++) {
                    if (breakfast[i] == null) {
                        breakfast[i] = new IceCream(parts[1]);
                        icecreamCount++;
                        break;
                    }
                }
            }
            if (parts[0].equals("Cheese")) {
                for (int i = 0; i < breakfast.length; i++) {
                    if (breakfast[i] == null) {
                        breakfast[i] = new Cheese();
                        cheeseCount++;
                        break;
                    }
                }
            } else if (parts[0].equals("Apple")) {
                for (int i = 0; i < breakfast.length; i++) {
                    if (breakfast[i] == null) {
                        breakfast[i] = new Apple(parts[1]);
                        appleCount++;
                        break;
                    }


// ... Продолжается анализ других продуктов для завтрака
                    itemsSoFar++;
                }
            }
        }


        System.out.println(icecreamCount + "  IceCream  "+appleCount + "  Apple  "+cheeseCount+"  Cheese  ");
// Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else

                break;

        System.out.println("Всего хорошего!");
    }
}