import java.util.ArrayList;
public class ArrayListPractice{
	public static ArrayList<Integer> combine(ArrayList<Integer> firstlist, ArrayList<Integer> secondlist){
		ArrayList<Integer> combinelist = new ArrayList<>();

		for(int i = 0; i<firstlist.size(); i++)
		combinelist.add(firstlist.get(i));

		for(int i = 0; i<secondlist.size(); i++)
		combinelist.add(secondlist.get(i));

		return combinelist;
	}
	public static void removeBraces(ArrayList<Integer> firstlist){
		int a = firstlist.size();

		for(int i = 0; i<firstlist.size(); i++){
			if(i==a-1)
				System.out.print(firstlist.get(i));
			else
				System.out.print(firstlist.get(i)+", ");
			}
		}
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> firstlist){

	}
	public static void main(String[]args){
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		//list 1
		for(int i = 1; i<=10; i++)
			list1.add(i);

		for(int i = 0; i<list1.size(); i++)
			System.out.print(list1.get(i)+" ");

			System.out.println();

		//list 2
		for(int i = 1; i<=10; i++)
			list2.add(i);

		for(int i = 0; i<list2.size(); i++)
			System.out.print(list2.get(i)+" ");
			System.out.println();

		System.out.println(combine(list1, list2));
		removeBraces(list1);
		System.out.println();
	}
}