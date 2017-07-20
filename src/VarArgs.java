class A{}

public class VarArgs {
static void printArray(Object[] args){
	for(Object obj : args)
		System.out.println(obj);
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new Object[]{
				new Integer(67),
				new Float(3.14f),
				new Double(11.11),
		});
		printArray(new Object[]{"raz", "dwa", "trzy",});
		printArray(new Object[]{new A(), new A(), new A(),});
		printArray(new Object[]{new Integer(20), new String("Hej hej hej")});
		}

}
