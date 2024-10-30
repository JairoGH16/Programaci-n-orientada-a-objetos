import models.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Person myPerson = new Person("Jairo", 19);

        Field[] myPersonFields = myPerson.getClass().getDeclaredFields();
        for (Field myPersonField : myPersonFields) {
            System.out.println(myPersonField.getName());
            if (myPersonField.getName().equals("age")) {
                myPersonField.setAccessible(true);
                System.out.println(myPersonField.get(myPerson));
            }
        }

        Method[] myPersonMethods = myPerson.getClass().getDeclaredMethods();
        for (Method myPersonMethod : myPersonMethods) {
            System.out.println(myPersonMethod.getName());
            if (myPersonMethod.getParameterCount() == 0) {
                myPersonMethod.setAccessible(true);
                myPersonMethod.invoke(myPerson);
            }
        }

        Method greetOtherPersonMethod = myPerson.getClass().getDeclaredMethod("greetOtherPerson", String.class);
        greetOtherPersonMethod.setAccessible(true);
        greetOtherPersonMethod.invoke(myPerson, "Rafa");
    }
}
