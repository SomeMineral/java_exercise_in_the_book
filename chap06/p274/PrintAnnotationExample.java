package p274;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		// from Service class
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for (Method method : declaredMethods) {
			//wonder PrintAnnotation
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//get PrintAnnotation object
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			// print method's name
			System.out.println("[" + method.getName() + "] ");
			// print line for identification?
			for(int i=0; i<printAnnotation.number();i++) {
				System.out.print(printAnnotation.value());
			}
			System.out.println();
			
			try {
				// call method
				method.invoke(new Service());
			} catch (Exception e) {}
			System.out.println();
			}
		}
		
	}
}
