
public class StringRepo implements Collection {

public String strings[] = {"hey", "fish", "bread", "golf"};

	@Override
	public Iterator createIterator() {
		return new StringIterator();
	}
	
	private class StringIterator implements Iterator{
		int i;
		
		public boolean hasNext() {
			
			if(i < strings.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return strings[i++];
			}
			return null;
		}

	}

}
