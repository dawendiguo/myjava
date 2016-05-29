class fibonacci{
	final static String f="this is a fibonacci";
	/**print out the fibonacci sequence for values <50 */
	public static void main(String[] args){
		int lo=1;
		int hi=1;
		System.out.println(f);
		System.out.println(lo);
		while(hi<50){
			System.out.println(hi);
			hi=lo+hi;
			lo=hi-lo;
		}
	}
}
