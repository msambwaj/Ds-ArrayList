package dataStructures;
import java.util.*;

public class DsArrayList {

	
	
	//create an arrayList
	public static ArrayList<Integer> myArray ( ArrayList<Integer> list){
		return list;
		
	}
	//Implement the Insertion, Deletion and Find operations
	public static ArrayList<Integer> insertElement(ArrayList<Integer> list,int X){
		list.add(X);
		 return list;
	}
	
	public static ArrayList<Integer> deleteElement(ArrayList<Integer> list,int i){
		if (i > list.size()) {
			System.out.println("Index is out of bounds");
			return list;
		}
		list.remove(i);
		 return list;
	}
	public static boolean findElement(ArrayList<Integer> list,int element){
		if (list.contains(element)) {
			return true;
		}
		 return false;
	}
	
	//Delete the duplicated items in the ordered arrayList
	public static ArrayList<Integer> deleteDuplicates(ArrayList<Integer> list){
		
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		 sortedList = sortArray(list);

		 for (int i = 0; i < sortedList.size(); i++) {
			for (int j = i+1; j < sortedList.size(); j++) {
				if (sortedList.get(i) == sortedList.get(j)) {
					sortedList.remove(i);
				}
			}
		}
				
		return sortedList;
	}
	
	public static ArrayList<Integer> sortArray (ArrayList<Integer> list){
		Collections.sort(list);
		return list;
	}
	
	
	//simple system of Student Score Management
	
	
	static ArrayList<ArrayList<String>> students = new ArrayList<ArrayList<String>>();
	
	//Insert: insert a new student information;
	public static ArrayList<ArrayList<String>> addStudent(String[] student){
		students.add(new ArrayList<String>(Arrays.asList(student)));
	
		return students;
	}
	
	//Search: Find a student on a special condition, such as Sno. or Stu. Name
	public static ArrayList<String> searchStudentByName(String name){
		ArrayList<String> targetStudent = new ArrayList<String>();
		while (!students.isEmpty()) {
			for (int i = 0; i < students.size(); i++) {
				targetStudent = students.get(i);
				for (int j = 0; j < targetStudent.size(); j++) {
					if (targetStudent.get(1).equals(name)) {
						return targetStudent;
					}
				}	
			}
		}
		
		return null;
	}
	
	public static ArrayList<String> searchStudentBySno(int number){
		ArrayList<String> targetStudent = new ArrayList<String>();
		String no = Integer.toString(number);
		while (!students.isEmpty()) {
			for (int i = 0; i < students.size(); i++) {
				targetStudent = students.get(i);
				for (int j = 0; j < targetStudent.size(); j++) {
					if (targetStudent.get(0).equals(no)) {
						return targetStudent;
					}
				}	
			}
		}
		
		return null;
	}
	
	
	//Modify: Modify the scores according to the Sno. for one course
	public static ArrayList<String> modifyColEngScore(int sno, int score){
		ArrayList<String> targetStudent = new ArrayList<String>();
		String newScore = Integer.toString(score);
		
		targetStudent = searchStudentBySno(sno);
		
		targetStudent.set(3, newScore);
		
		return targetStudent;
	}
	
	public static ArrayList<String> modifyColMathScore(int sno, int score){
		ArrayList<String> targetStudent = new ArrayList<String>();
		String newScore = Integer.toString(score);
		
		targetStudent = searchStudentBySno(sno);
		
		targetStudent.set(4, newScore);
		
		return targetStudent;
	}
	
	//delete the information of drop-out student
	public static ArrayList<ArrayList<String>> deleteStu(int sno){
		ArrayList<String> targetStudent = new ArrayList<String>();
		if (!searchStudentBySno(sno).isEmpty()) {
			targetStudent = searchStudentBySno(sno);
			for (int i = 0; i < students.size(); i++) {
				if (students.get(i) == targetStudent) {
					students.remove(i);
				}
			}
		}
		
		return students;
	}
	
	
	
	
	public static void main(String[] args) {
		//print arrays
		ArrayList<Integer> myList = new ArrayList<Integer>();
			myList.add(3);myList.add(53);myList.add(33);myList.add(32);
			myList.add(13);myList.add(67);myList.add(98);myList.add(67);
			myList.add(3);
			
		
		//System.out.println(myArray(myList));
		
		//insert an element to an ArrayList
		//System.out.println(insertElement(myList, 87));
		
		//delete an element to an ArrayList
		//System.out.println(deleteElement(myList, 83));
			
		//find an element to an ArrayList
		//System.out.println(findElement(myList, 33));
		
		//sort an Array
		//System.out.println("sorted array is " + sortArray(myList)); 
			
		//remove duplicates
		//System.out.println(deleteDuplicates(myList)); 
		
		//insert a new student information
		String[] Alan = {"2018001", "Alan", "F", "93","88"};
		String[] Danie = {"2018002", "Danie", "M", "75","69"};
		String[] Helen = {"2018003", "Helen", "M", "56","77"};
		String[] Bill = {"2018004", "Bill", "F", "87","90"};
		String[] Peter = {"2018005", "Peter", "M", "79","86"};
		String[] Amy = {"2018006", "Amy", "F", "68","75"};
		addStudent(Alan);
		addStudent(Danie);
		addStudent(Helen);addStudent(Bill);addStudent(Peter);
		addStudent(Amy);
		System.out.println(students);
		
		
		//search student
		System.out.println("\n-----------------search a student by sno and name------------------");
		System.out.println(searchStudentByName("Helen"));
		System.out.println(searchStudentBySno(2018005));
		
		//modify score by student number
		modifyColEngScore(2018005, 47);
		System.out.println("\n-----------------update english score------------------");
		System.out.println(searchStudentBySno(2018005));
		modifyColMathScore(2018003, 89);
		System.out.println("-----------------update Math score------------------");
		System.out.println(searchStudentBySno(2018003));
		
		//delete a student
		System.out.println("\n-----------------before deletion------------------");
		System.out.println(students);
		deleteStu(2018004);
		System.out.println("-----------------after deletion(Bill has dropedout)------------------");
		System.out.println(students);
		
		
					

	}

}
