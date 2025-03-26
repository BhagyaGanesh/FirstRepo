package mavenpackageone;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer obj = new StringBuffer("Hey");
		System.out.println(obj);
		
		StringBuilder obj1 = new StringBuilder("Hi There");
		System.out.println(obj1);
		
		//append---add the new string at last
		obj.append("Arya");
		System.out.println(obj);
		//insert--to insert element based on index
		obj.insert(2, "Techi");
		System.out.println(obj);
		//replace--replace value based on starting and ending index
		obj.replace(2, 4, "Anju");
		System.out.println(obj);
		//reverse--to reverse string
		obj.reverse();
		System.out.println(obj);
		//Delete --to delete specific part
		obj.delete(1, 8);
		System.out.println(obj);

	}

}
