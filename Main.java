//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book2 b1=new Book2("Jonk",1989,"Jonah Sachs","IB7915-556");
        Magazine m1=new Magazine("SUMMER",1999,"LLC",5);

        System.out.println(b1.getDetails());
        System.out.println(m1.getDetails());

    }
}