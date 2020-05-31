public class samplethread implements Runnable  //implements runnable
//public class samplethread extends Thread 
{
	int a;
	samplethread(int a){		//constructor
		this.a=10;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<10;i++) {
			System.out.println("thread count "+i+" ");
				 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
    
    
	
}
