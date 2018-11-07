package Clothes;

public class Pants{
   /////////
	private String size;
	private String color;

	public Pants(){}
	
	public Clothes(String size){
		this();
		setSize(size);
	}
	
	public Clothes(String size,String Color){
		this(size);
		setColor(color);
	}