import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
    /*
     author Hnatusiv Bohdan
     23.09.2020
     */
    public class CarArrayList {
        public static void main(String[] args) {

  /*
     ArrayList - это класс, который имплементиться от интерфейса List,являющегося наследнеиком
      интерфейса Collection. Похож на массив, поэтому доступ по индексу сравнительно очень быстрый (O(1)).
      Но в отличие от массива имеет возможность  автоматически увеличиваться  и уменьшаться.По дефолту имеет значение 10.
       При каждом увеличении вместимости увеличивается примерно в 1.5 раза
      по сравнению с предыдущим . При вставке  элемента внутрь , правая часть от вставленного
      сдвигается   вправо.При удалении , правая часть от удаленного  сдвигается влево.Поэтому такая операция
      относительно достаточно медленная (O(n)).ArrayList   довольно медленно когда
           происходит поиск по значению,потому что надо каждый раз сравнивать ,а это линейное время( О(n)).
       ArrayList  Имеет много всяких методов,что дает возможность добавлять элементы,получать по
       индексу,определения размера , вставлять внутрь и удалять из середины , и много других (см.ниже  примеры).
    */

            List<Cars> listCars = new ArrayList<>();

            Cars car1 = new Cars("Audi");
            Cars car2 = new Cars("BMW");
            Cars car3 = new Cars("Citroen");
            Cars car4 = new Cars("KIA");
            Cars car5 = new Cars("Mazda");
            Cars car6 = new Cars("Honda");

            // метод добавления элементов
            listCars.add(car1);
            listCars.add(car2);
            listCars.add(car3);
            listCars.add(car4);
            listCars.add(car5);
            listCars.add(car6);


            // метод получения по индексу
            Cars car2_OfListCars = listCars.get(1);
            Cars car5_OfListCars = listCars.get(4);
            System.out.print(car2_OfListCars + "  and  " + car5_OfListCars);

            System.out.println();

            // метод  получения по индексу( так даже короче)
            System.out.print(listCars.get(0) + " and " + listCars.get(3));

            System.out.println();

            // метод определения размера коллекции
            System.out.println(" Size this Collection  =   " + listCars.size() + ".");

            //  метод вставки элемента внутрь коллекции ,например на место под индексом 3
            Cars car7 = new Cars("Mercedes");
            listCars.add(3, car7);
            System.out.println(" Size this Collection  =   " + listCars.size() + ".");// размер увеличился

            // и вместо мазды  - мерседес
            System.out.print(listCars.get(0) + " and " + listCars.get(3));
            System.out.println();

            //метод определения индекса по значению
            System.out.println("Index  " + car2 + " = " + listCars.indexOf(car2));

            //метод опредения  наличия  в коллекции по значению(   при наличии = true )
            System.out.println(" Object   " + car4 + " is  in this collection    =  " + listCars.contains(car4));

            //   метод проверки на полноту коллекции, если  true то пустая
            boolean empty = listCars.isEmpty();
            System.out.println(  " This  Collection  is empty  =  "+empty);

            // метод удаления по индексу  и значению  ,соответсвенно
            listCars.remove(2);
            System.out.println(" Size this Collection  =   " + listCars.size());//стал на 1 меньше
            listCars.remove(car2);
            System.out.println(" Size this Collection  =   " + listCars.size());//стал еще на 1 меньше

            //метод очистки коллекции
            listCars.clear();
            boolean empty1 = listCars.isEmpty();
            System.out.println(" This  Collection  is empty  =  "  +  empty1);//если  true то пустая

            //восстанавливаю  коллекцию
            listCars.add(car1);
            listCars.add(car2);
            listCars.add(car3);
            listCars.add(car4);
            listCars.add(car5);
            listCars.add(car6);
            listCars.add(car7);

            //для вывода всех значений есть , конечно универсальный оператор foreach
            System.out.print(" With help  foreach  :  ");
            for (Cars car : listCars) {
                System.out.print(car + "  ;  ");
            }
            System.out.println();

            // но есть спецметоды класса  Iterator,   для моего случая - это : listCars.iterator()
            // в классе  Iterator  чаще всего используются такие методы:hasNext(),next()
            System.out.print("  With help class Iterator   :  ");
            Iterator<Cars> iterator = listCars.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + "  //  ");
            }

        }
    }


