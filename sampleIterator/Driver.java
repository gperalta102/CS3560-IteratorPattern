
public class Driver {

	public static void main(String[] args) {
		StringRepo stringRepo = new StringRepo();
		
		for(Iterator iterator = stringRepo.createIterator(); iterator.hasNext();) {
			String s = (String)iterator.next();
	        System.out.println(s);
		}
	}
}
