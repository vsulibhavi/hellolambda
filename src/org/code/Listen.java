package org.code;


interface Action
{
	
	public void act(String text,int length);

	
}
public class Listen {

	public void listenMe(Action act,int length,String name)
	{
		act.act(name, length);
	}
	
}
