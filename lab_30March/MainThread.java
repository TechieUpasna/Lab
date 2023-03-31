package lab_30March;



class ListLoader{

	public synchronized void loadList(int startnumber,int lastnumber) {
		int L[]=new int[100];  //array
		for(int i=startnumber;i<lastnumber;i++) {
			 L[i]=i;
			try {
				Thread.sleep(50);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}

class LoaderThread implements Runnable{
	
int startnumber,lastnumber;
	ListLoader obj;
	public LoaderThread(ListLoader obj) {
		this.obj=obj;
	}
		public void run() {
			for(int i=startnumber;i<lastnumber;i++) {
				System.out.println(System.currentTimeMillis()/2);
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					System.out.println(e);
				}
		}
		}}
		

//main class
public class MainThread {
//main method
	public static void main(String[] args) {
		
		ListLoader a=new ListLoader();

		
		//Thread
		long start=System.currentTimeMillis();
		System.out.println("Start time: "+start);
		Thread t1=new Thread() {
			public void run() {
			a.loadList(0, 100);
			long end=System.currentTimeMillis();
			System.out.println("End time: "+end);
			long response= end -start;
			System.out.println("response time: "+response);

			}
		};
		
		//thread2
		Thread t2=new Thread() {
			public void run() {
				long start=System.currentTimeMillis();
				System.out.println("Start time: "+start);
			a.loadList(0, 50);
			long end=System.currentTimeMillis();
			System.out.println("End time: "+end);
			long response=(end-start)/2;
			System.out.println("response time: "+response);
			
			}
		};
		
		//thread3
		Thread t3=new Thread() {
			public void run() {
				long start=System.currentTimeMillis();
				System.out.println("Start time: "+start);
			a.loadList(50,100);
			long end=System.currentTimeMillis();
			System.out.println("End time: "+end);
			long response=(end-start)/2;
			System.out.println("response time: "+response);
			
			}
		};
		
		t1.start();
		System.out.println("T1 started");
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		System.out.println("T2 stated");
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
		System.out.println("T3 started");
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}





















