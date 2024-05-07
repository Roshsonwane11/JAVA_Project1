package Variable_package;

public class Instance_variable {
	
    int b =10; //instance variable non-static 
    int i;
	public static void main(String[] args) {
		
		Instance_variable R1 = new Instance_variable();
		Instance_variable R2 = new Instance_variable();
		
		R1.b = R1.b +5; //15
		//if we change one object value, then it will not change another object.
		R2.b = R1.b + 5; //20 its create seperate copy
		
		System.out.println(R1.b);
		System.out.println(R2.b);

		
		
		System.out.println(R1.i);
	}

}

//default value of int 0
//error: if we not create object then -Cannot make a static reference to the non-static field b
/*
Oject store only non static member 
Instance(visualization- example)Variable(non-static): written at class level only
instance variable create seperate memory  for every object

<<<<<<<heap memory: object store in heap memory>>>>>>>
<<<<<<<MetaSpace: all static method, varible store>>>>>>>
*/