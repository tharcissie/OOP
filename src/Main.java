import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        /* CONSTRUCTOR =  a special method in class where you initialize objects,
                          you can pass arguments to it and set up initial values
                          it is automatically called when you create a new object

           OVERLOADED CONSTRUCTORS = allow a class to have multiple constructors with
                                     different parameter lists.
                                     enable object to be initialized in various ways
        */

        /* THIS = reference to the current object instance (refers to the object we are current working with),
                  you can not use it inside a static method,
                  since static method belong to the class itself and not to any particular object

            STATIC = is used to create utility methods or shared resources, makes a variable
                     or method belong to a class it was created in. rather than any specific object.
        */

        /* INHERITANCE = class inherits properties (methods, attributes) from another class */

        /* SUPER = refer to the parent class, used to call the parent's constructor to initialize attributes */

        /* METHOD OVERRIDING = happens when a subclass (child) provides its own implementation of a method that is
                               already defined in its superclass (parent)
        */

        /* .toString = is it inherited from the object class, used to return a string representation of an object */

        /* ABSTRACTION = process of hiding implementation details and showing only the essential features,
                         when a class is an abstract you can not instantiate directly from it.
                         in abstract classes we have CONCRETE and ABSTRACT methods;
                         ABSTRACT methods are methods without a body.
                         CONCRETE methods are methods with an implementation.

                         A class that extends an abstract class must override and implement all abstract methods
                         (unless the subclass is also abstract)
                         Concrete methods are inherited normally and can be used as-is or overridden if needed.
        */

        /* INTERFACE = A blueprint for a class that specifies a set of abstract methods
                       that implementing classes MUST define. supports multiple inheritance behavior.
        */

        /* POLYMORPHISM = POLY: many, MORPH: shape. Objects can be treated as objects of a common superclass
                          ex: Animal[] animals = {
                              new Dog(),
                              new Cat()
                              };

                              for (Animal animal : animals) {
                              animal.makeSound();
                               }
        */

        /* RUNTIME POLYMORPHISM = When the method that gets executed is decided at runtime based on
                                  the actual type of the object.
                                  ex: Animal animal = new Dog();
                                      animal.makeSound();
        */

        /* GETTERS & SETTERS = They help protect data and add rules for accessing or modifying.
                               GETTERS: Methods that make a field READABLE.
                               SETTERS: Methods that make a field WRITEABLE.
         */

        /* AGGREGATION = Is a relationship between two classes where one class has a reference to
                         another class but both objects can exist independently.
                         It represents a "has-a" relationship.
                         ex: A Department has Employees, but employees can exist even if the department is deleted

                         Department(String name, Employee employee){
                            this.name = name;
                            this.employee = employees
                            }
         */

        /* COMPOSITION = opposite of AGGREGATION, It represents a "part-of".
                         ex: A house has rooms, A room generally doesn't exist without a house.

                         House(String name, Room room){
                            this.name = name;
                            this.room = new Room(room)
                            }
        */

        /* WRAPPER CLASSES = Allow primitive values (int, char, double, boolean) to be used as objects. "wrap them in an object"
                             Allows use of collections framework and static utility.
                             ex: String b = Integer.toString(12) this is one of the example of converting a number into a string
                                 int a = Integer.parseInt("123")

                                 char letter = "%";
                                 Character.isLetter(letter) //false
                                          .isUpperCase(letter)

                                 int a = 123 (Unboxing)
                                 Integer a = 123 (Autoboxing)
         */

        /* ARRAYLISTS = only works with objects, it is a resizeable array that stores objects(autoboxing).
                        arrays are fixed in size but ArrayLists are dynamic(can change).
                        ex: ArrayList<Integer> list = new ArrayList<>();
                            list.add(1);
                            list.add(8);
                            list.remove(1);
                            list.set(0, 200);
                            System.out.println(list.get(5));
                            System.out.println(list.size());
                            Collections.sort(list);
                            System.out.println(list);
        */

        /* EXCEPTION = An event that interrupts the normal flow of a program, surround any dangerous code with a try{}, catch{},
                       finally{}.
        */

        // How to write a file using java (4 popular options)
        /* FileWriter = Good for small or medium-sized text files
           BufferedWriter = Better performance for large amounts of text
           PrintWriter = Best for structured data, like reports or logs
           FileOutputStream = Best for binary files (e.g., images, audio files)
         */

        // How to read a file using java (3 popular options)
        /* BufferedReader + FileReader = Best for reading file line by line
           RandomAccessFile = Best for read/write specific portions of a large file
           FileInputStream = Best for binary files (e.g., images, audio files)
         */

        /* How to work with DATES & TIMES using java
           (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
          ex: LocalDate date = LocalDate.now();
              Instant instant = Instant.now() //UTC
         */
        /* ANONYMOUS CLASS = A class with no name. can not be reused. add custom behavior
                             without having to create a new class.
                             Often used for one time uses (TimerTask, Runnable, callbacks)
        */


        //anonymous class
        Car car = new Car("Kigali", "Bike"){
            @Override
            void sound(){
                System.out.println("boom boom");
            }
        };

        car.sound();

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, h:mm");
        String newDate = date.format(formatter);
        System.out.println(newDate);

        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("I like this");

        } catch (FileNotFoundException e) {
            System.out.println("could not locate file location");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        String filepath = "C:\\Users\\tharc\\Desktop\\OOP\\test.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("could not locate file location");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }


    }
}
