package p495;

import java.lang.reflect.InvocationTargetException; //헐. 넣어줘야 하는거야?

public class NewInstanceExample {
	public static void main(String[] args) {
		
		
		// ah. class 이름 꺼내와서 그에 해당하는 instance 생성인가.
		// 단, 초기 형태는 Object니까 type conversion 필요?
		try {
			//Class clazz = Class.forName("p495.SendAction");
			Class clazz = Class.forName("p495.ReceiveAction");
			//Action action = (Action) clazz.newInstance();
			Action action = (Action) clazz.getDeclaredConstructor().newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}

/*
 * Deprecated.
This method propagates any exception thrown by the nullary constructor, including a checked exception.
Use of this method effectively bypasses the compile-time exception checking that would otherwise be performed by the compiler.
The Constructor.newInstance method avoids this problem
by wrapping any exception thrown by the constructor in a (checked) InvocationTargetException.

The call
 clazz.newInstance()
can be replaced by
 clazz.getDeclaredConstructor().newInstance()

The latter sequence of calls is inferred to be able to throw the additional exception types InvocationTargetException and NoSuchMethodException.
Both of these exception types are subclasses of ReflectiveOperationException.
 * 
 * 
 * 
 */
