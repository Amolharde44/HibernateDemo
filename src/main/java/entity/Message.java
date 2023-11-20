package entity;

public class Message {
	
	int id;
	String text;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message( String text) {
		super();

		this.text = text;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", text=" + text + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	

}
