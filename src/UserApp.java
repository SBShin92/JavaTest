import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserApp {
	public static void main(String[] args) {
		
		User master = new Staff("master", "m7788", "운영자", 3500000);
		User usr01 = new Customer("jung-ws", "j1357913579", "정우성", 1000);
		User usr02 = new Customer("LeeHR", "a123!!", "이효리", 2500);
		User usr03 = new Customer("ms-park", "y2345", "박명수", 1200);
		
		List<User> lst = new ArrayList<>();
		lst.add(master);
		lst.add(usr01);
		lst.add(usr02);
		lst.add(usr03);
		
		System.out.println("---------------회원+운영자 전체리스트-------------------");
		Iterator<User> iter = lst.iterator();
		for (int i = 1; iter.hasNext(); i++) {
			System.out.print(i + ".");
			iter.next().showInfo();
		}
		System.out.println();
		
		for (User node: lst) {
			if (node.getName().equals("운영자")) {
				Staff tmp = (Staff)node;
				System.out.printf("운영자의 연봉은 %d 입니다.%n",
						(tmp.getSalary() * 12));
			}
		}
	}
}
