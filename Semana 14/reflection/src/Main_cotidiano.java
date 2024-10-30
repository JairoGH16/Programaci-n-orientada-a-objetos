import models.Cat;
import models.Dog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main_cotidiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el comando en la forma: Clase.Metodo(parametros) o 'salir' para terminar:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                String[] parts = input.split("\\.");

                if (parts.length < 2) {
                    throw new IllegalArgumentException("Comando no válido. Debe estar en la forma Clase.Metodo");
                }

                String className = parts[0];
                String methodName;
                String[] methodParams = null;

                if (parts[1].contains("(")) {
                    methodName = parts[1].substring(0, parts[1].indexOf('('));
                    String paramsString = parts[1].substring(parts[1].indexOf('(') + 1, parts[1].indexOf(')'));
                    methodParams = paramsString.isEmpty() ? null : paramsString.split(",");
                } else {
                    methodName = parts[1];
                }

                Class<?> targetClass;
                if (className.equalsIgnoreCase("Cat")) {
                    targetClass = Cat.class;
                } else if (className.equalsIgnoreCase("Dog")) {
                    targetClass = Dog.class;
                } else {
                    throw new IllegalArgumentException("Clase no encontrada: " + className);
                }

                Method targetMethod;

                if (methodParams == null || methodParams.length == 0) {
                    targetMethod = targetClass.getDeclaredMethod(methodName);
                    targetMethod.setAccessible(true);
                    targetMethod.invoke(null);
                } else {
                    Class<?>[] paramTypes = new Class[methodParams.length];
                    Object[] parsedParams = new Object[methodParams.length];

                    for (int i = 0; i < methodParams.length; i++) {
                        String param = methodParams[i].trim();

                        if (param.matches("-?\\d+")) {
                            paramTypes[i] = int.class;
                            parsedParams[i] = Integer.parseInt(param);
                        } else {
                            paramTypes[i] = String.class;
                            parsedParams[i] = param;
                        }
                    }

                    targetMethod = targetClass.getDeclaredMethod(methodName, paramTypes);
                    targetMethod.setAccessible(true);
                    targetMethod.invoke(null, parsedParams);
                }

            } catch (NoSuchMethodException e) {
                System.err.println("Método no encontrado.");
            } catch (IllegalAccessException e) {
                System.err.println("Acceso al método denegado.");
            } catch (InvocationTargetException e) {
                System.err.println("Error al ejecutar el método: " + e.getCause());
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Comando no válido.");
            }
        }
    }
}
