package org.code;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Listen listen = new Listen();
		listen.listenMe((name,length) -> System.out.println(name.substring(0, length)),4, "vishal");

		listen.listenMe(new Action() {
			
			@Override
			public void act(String text,int length) {
					
				System.out.println(text.substring(0, length));
				
			}
		},4, "vishal");
		
	}

}
