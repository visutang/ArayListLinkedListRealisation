import java.util.Iterator;
import java.util.LinkedList;
/*
 * author Hnatusiv Bohdan
 * 23.09.2020
 */

public class CarLinkedList {
    public static void main(String[] args) {

        /*
          LinkedList это класс ,который имплементится от интерфейса List,
        который в свою очередь наследуется от интерфейса  Collection.Особенностью
         LinkedList являеться двусвязанность списка.Каждый элемент в LinkedList имеет
         ссылки на соседние элементы( нa prev (предыдущий)  и  на next (последующий).
         И когда  надо вставить элемент  или удалить его, то перебрасываются  только  соседниие
          соответсвующие ссылки (время (O(1) )) , и не  производиться громоздкая    работа по
           копированию и сдвигу всей части коллекции в ту или иную сторону,как это просходит
           в ArrayList.Поэтому этот  класс рационально применять при частой вставке или
           удалении элементов. Недостатком является относительная длительность поиска  элементов
           по индексу по сравнению с  ArrayList,потому что приходиться   в поисках нужного
           элемента идти по всем элеметам списка  (O(n)).  LinkedList  довольно медленно ,когда
           происходит поиск по значению,потому что надо каждый раз сравнивать ,поэтому  время - ( О(n)).
            LinkedList имеет много всяких  методов,что дает вожможность добавлять элементы,получать
            по индексу,определять размер вставлять внутрь и удалять из середины , и много других (см.ниже  примеры).
        */

        LinkedList<Cars> carsLinkedList = new LinkedList<>();

        //создание объектов
        Cars car1 = new Cars("Audi");
        Cars car2 = new Cars("BMW");
        Cars car3 = new Cars("Citroen");
        Cars car4 = new Cars("KIA");
        Cars car5 = new Cars("Mazda");
        Cars car6 = new Cars("Honda");

        // метод добавление элементов
        carsLinkedList.add(car1);
        carsLinkedList.add(car2);
        carsLinkedList.add(car3);
        carsLinkedList.add(car4);
        carsLinkedList.add(car5);
        carsLinkedList.add(car6);

        // метод определения размера коллекции
        System.out.println(" Size this collection  =   " + carsLinkedList.size());

        //метод добавления элемента в середину , например на место под индексом 3
        Cars car7 = new Cars(" Reno");
        carsLinkedList.add(3, car7);
        //сразу же убедимся в этом, достав этот элемент
        System.out.println(" Index " + 3 + " " + carsLinkedList.get(3));
        // убедимся что и размер стал больше
        System.out.println(" Size this collection  =   " + carsLinkedList.size());

        //метод удаления по индексу
        carsLinkedList.remove(3);
        //убеждаемся что под индексом 3 уже нет Рено
        System.out.println("Index " + 3 + " " + carsLinkedList.get(3));

        // метод определения индекса по значению
        System.out.println("Index " + car5 + " = " + carsLinkedList.indexOf(car5));


        //метод опредения  наличия  в коллекции по значению
        System.out.println(" Object  " + car4 + " is this collection " + carsLinkedList.contains(car4));

        //   метод проверки на полноту коллекции, если  true то пустая
        System.out.println("Collection  is  empty     =    " + carsLinkedList.isEmpty());

        // метод удаления по значению
        carsLinkedList.remove(car4);
        // убеждаемся , что car4 нет ,д.б. false
        System.out.println(" Object  " + car4 + " is this collection " + carsLinkedList.contains(car4));

        //добавление какого-то  елемента на первое место  и на последнее,
        System.out.println(" Size this collection  =   " + carsLinkedList.size());
        carsLinkedList.addFirst(car7);
        System.out.println("Index " + car7 + " = " + carsLinkedList.indexOf(car7));
        carsLinkedList.addLast(car2);
        // убеждаемся что увеличился размер  на 2
        System.out.println(" Size this collection  =   " + carsLinkedList.size());

        //метод очистки коллекции;после очистки д.б. true
        carsLinkedList.clear();
        boolean empty = carsLinkedList.isEmpty();
        System.out.println("Collection  is  empty     =    " + carsLinkedList.isEmpty());

        // восстановим коллекцию
        carsLinkedList.add(car1);
        carsLinkedList.add(car2);
        carsLinkedList.add(car3);
        carsLinkedList.add(car4);
        carsLinkedList.add(car5);
        carsLinkedList.add(car6);

        System.out.println("Size this collection  =   " + carsLinkedList.size());

        System.out.println();

        //для вывода всех значений  есть спецметоды класса  Iterator,
        // Iterator  чаще всего используются такие методы:hasNext(),next()
        System.out.print("  Go out all elements of collection with help class  Iterator  :  ");
        Iterator<Cars> iterator = carsLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ";   ");
        }
        System.out.println();
        System.out.println();
        System.out.println();


    }
}


