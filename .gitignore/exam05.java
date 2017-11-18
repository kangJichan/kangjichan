
class PrimeNumber extends Thread {
	int num;
	

	public PrimeNumber(int num) {
		
		this.num = num;
		
	}

	public void run() {
		int num = 0;
	      for(int i=1;i<=20;i++) {
	         int count=0;
	         for(int j=1;j<=i;j++) {
	            if(i%j==0) {
	               count+=1;
	            }
	         }
	         if(count==2) {
	            System.out.print(i + " ");
	         }
	      }
	   }
}
class PrimeNumber02 extends Thread {
	int num;
	

	public PrimeNumber02(int num, String name) {
		setName(name);
		this.num = num;
	}

	public void run() {
		System.out.println(getName());
		int num = 0;
	      for(int i=1;i<=20;i++) {
	         int count=0;
	         for(int j=1;j<=i;j++) {
	            if(i%j==0) {
	               count+=1;
	            }
	         }
	         if(count==2) {
	            System.out.print(i + " ");
	         }
	      }
	   }
}

class PrimeNumber03 extends Thread {
	int num;
	

	public PrimeNumber03(int num) {
		
		this.num = num;
	}
	public interface Runnable{
		public abstract void run();
	}
	
	public void run() {
		setName("소수를만드는 스레드");
		System.out.println(getName());
		int num = 0;
	      for(int i=1;i<=20;i++) {
	         int count=0;
	         for(int j=1;j<=i;j++) {
	            if(i%j==0) {
	               count+=1;
	            }
	         }
	         if(count==2) {
	            System.out.print(i + " ");
	         }
	      }
	   }
}
class exam05 extends Thread{
	public static void main(String args[]) {
	new Thread(new PrimeNumber03(25), "소수 만드는 스레드").start();
	
	
	}
}