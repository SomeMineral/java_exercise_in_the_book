package p491;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectionExample {
	
	// 허.. main에서 throws는 좀..
	// -- main start
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("p472.Counter");
		System.out.println("[class name]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[constructor information]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		
		System.out.println("[field information]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		
		System.out.println("[method information]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}		
	}
	// -- main end

		
		
	//--	
	private static void printParameters(Class[] parameters) {
		for (int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < (parameters.length-1)) {
				System.out.print(", ");
			}
		}
	}
	
	//--
	
}
