package Clothes;

public class Clothes{
   /////////
	private String size;
	private String color;
    private int prize;
	
	public Clothes(){}
	
	public Clothes(String size){
		this();
		setSize(size);
	}
	
	public Clothes(String size,String Color){
		this(size);
		setColor(color);
	}
	
	
	public String getSize(){
		return this.size;
	}
	
	public void setSize(String size){
		this.size = size;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		this.color = color;
	}

}