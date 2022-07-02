import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Решил написать по проще но притянуть за уши все принципы ООП
        // Инкапсуляция (Методы Протекдет)
        // Абстракция + Полиморфизм учтены
        // Наследование тоже есть

        //создаю листы и добавляю объекты с методами
        ArrayList<AbstractProducts>right = new ArrayList<>();
        right.add(new Money());
        right.add(new Papper());
        right.add(new Money());
        ArrayList<AbstractProducts>left = new ArrayList<>();
        left.add(new Key());
        left.add(new Coins());
        left.add(new Coins());

        //вывожу список правого кармана
        System.out.println("В правом кармане");
        for (AbstractProducts p : right) {
            p.products();
        }
        System.out.println("");
        //вывожу список левого кармана
        System.out.println("В левом кармане");
        for (AbstractProducts p : left) {
            p.products();
        }
    } // знаю мог интереснее и чище написать но у меня сейчас тяжелое состояние (Здоровья)
}
