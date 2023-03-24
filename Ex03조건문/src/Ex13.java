
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  long a = System.currentTimeMillis();
	      int ret = -1;
	       
	      for (int i=0; i<1000000000; ++i)
	          for (int num=0; num<5; ++num)
	              if (num == 0)      ret = 10;
	              else if (num == 1) ret = 20;
	              else if (num == 2) ret = 30;
	              else if (num == 3) ret = 40;
	              else if (num == 4) ret = 50;
	              else               ret = 12;
	      long b = System.currentTimeMillis();
	      System.out.println(ret);
	      System.out.println(b-a+"ms");

	      //구분선
	      
	      long c = System.currentTimeMillis();
	      int ret2 = -1;
	       
	      for (int i=0; i<1000000000; ++i)
	          for (int num=0; num<5; ++num)
	              switch (num) {
	              case 0: ret2 = 10; break;
	              case 1: ret2= 20; break;
	              case 2: ret2 = 30; break;
	              case 3: ret2 = 40; break;
	              case 4: ret2 = 50; break;
	              default: ret2 = 12; break;
	              }
	      long d = System.currentTimeMillis();
	      System.out.println(ret2);
	      System.out.println(d-c+"ms");
	}

}
