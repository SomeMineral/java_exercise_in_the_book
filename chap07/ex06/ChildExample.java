package ex06;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		/*
		Parent(String nation) call
		Parent() call
		Child(String name) call
		Child() call
		 */
		
		/*
		 guess
		 
		 Child() constructor
		 -> this("Gil-dong")
		 
		 ->-> Child(String name) constructor : Child("Gil-dong")
				 
		 ->->-> Parent() constructor
		 
		 ->->->->-> this("korea")
		 ->->->->->-> Parent(String nation) constructor : Parent("korea")
		 
		 ->->->->->->-> this.nation = nation;
		 ->->->->->->-> printed "Parent(String nation) call"
		 
		 ->->->->->-> Parent(String nation) constructor exit
		 
		 ->->->->-> this("korea") exit
		 
		 ->->->-> printed "Parent() call"
		 
		 ->->-> Parent() constructor exit
		 
		 ->-> this.name = name
		 ->-> printed "Child(String name) call"
		 
		 -> Child(String name) exit
		 
		 printed "Child() call"
		 
		 Child() constructor exit
		 
		 */
		
	}
}
