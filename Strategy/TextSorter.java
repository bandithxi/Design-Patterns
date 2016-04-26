public class TextSorter extends abstractSorter{

	public void sort(SortBehavior b){
		System.out.println("Text Sort Overrides Abstract Sorter");
		b.sort();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractSorter obj1 = new TextSorter();
		abstractSorter obj2 = new InheritedSorter();
		
		obj1.sort(new QuickSort());
		obj2.sort(new MergeSort());
		
		obj1.sort(new MergeSort());
		obj2.sort(new QuickSort());

	}

}
