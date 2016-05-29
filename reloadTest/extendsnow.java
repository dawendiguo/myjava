class Supersnow{
	public String str = "Supersnow";

	public void show(){
		System.out.println("Super.show:"+str);
		}
}

class Extendsnow extends Supersnow{
	public String str = "Extendsnow";
		
	public void show(){
		System.out.println("Extend.show:"+str);
	}

	public static void main(String[] args){
		Extendsnow ext = new Extendsnow();
		Supersnow sup = ext;
		sup.show();
		ext.show();
		System.out.println("sup.str:"+sup.str);
		System.out.println("ext.str:"+ext.str);
	}
}
