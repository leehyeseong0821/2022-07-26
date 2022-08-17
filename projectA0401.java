package projectA04;

public class projectA0401 {

	public static void main(String[] args) {
//		10과 10이 같으면 1 다르면 0 사망연산자 
		System.out.println(10==11?1:0);
         
		int x1=10;
		int x2=10;
		int s =0;
		if(x1==x2) {
			s=1;
		}else {
			s=0;
		}
		System.out.println(s);
		s=(x1==x2?1:0);
		System.out.println(s);
	}

}
