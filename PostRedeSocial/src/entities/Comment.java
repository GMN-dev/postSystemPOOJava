package entities;

public class Comment {

	private String text;
	
	public Comment(String textInput) {
		this.text = textInput;
	}

	public void setText(String textInput) {
		this.text = textInput;
	}
	
	public String getText() {
		return this.text;
	}
	
	@Override
	public String toString() {
		return this.getText();
	}
}
