package advancedjava;

import java.util.concurrent.ConcurrentSkipListMap;

class ccslm{
	
	java.util.HashMap<Integer,String> cars=new java.util.HashMap<Integer,String>();
	//ConcurrentSkipListMap<Integer,String> slm =new ConcurrentSkipListMap<>();

	//public ConcurrentSkipListMap<Integer, String> ccslminput(int key, String value) {
		public java.util.HashMap<Integer,String> ccslminput(int key, String value) {
		//slm.put(key, value);
        cars.put(key,value);
		//return slm;
		return cars;
	}

	public void print() {
		//System.out.println(slm);
	System.out.println(cars);
	}
	public void getlist(int i) {

	//System.out.println(slm.get(i));
		System.out.println(cars.get(i));
	}
}

class trd1 extends Thread{
	private ccslm l1;

	trd1(ccslm l1){
		this.l1=l1;
	}
	public void run() {
		l1.ccslminput(3,"Test3");
	}
}
class trd2 extends Thread{

	private ccslm l1;

	trd2(ccslm l1){
		this.l1=l1;
	}
	public void run() {
		l1.ccslminput(2,"Test2");
	}
}
class trd3 extends Thread{

	private ccslm l1;

	trd3(ccslm l1){
		this.l1=l1;
	}
	public void run() {
		l1.ccslminput(1,"Test1");
	}
}

class trd4 extends Thread{
	private ccslm l1;

	trd4(ccslm l1){
		this.l1=l1;
	}
	public void run() {
		for(int i=1;i<4;i++) {
			l1.getlist(i);
		}
	}
}

public class ConCurrSLM {

	public static void main(String[] args) {
		ccslm obj =new ccslm();

		trd1 t1=new trd1(obj);
		trd2 t2=new trd2(obj);
		trd3 t3=new trd3(obj);
		trd4 t4=new trd4(obj);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		obj.print();
	}
}
