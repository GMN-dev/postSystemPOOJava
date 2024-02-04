package entities;
import entities.Comment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	LocalDate moment;
	String title;
	String content;
	Integer likes;
	
	List<Comment> comments = new ArrayList<>();
	
	
	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public List<Comment> getComments(){
		return this.comments;
	}

	
	public void addComment(Comment commentInput){
		this.getComments().add(commentInput);
	}
	public void removeComment(Comment commentInput) {
		this.getComments().remove(commentInput);
	}

	
	public Post(LocalDate moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	@Override
	public String toString(){
		String res = String.format(" %s\n\n %s \n %s \n %d\n Comments: \n", moment, title, content, likes);
		for(Comment x:this.getComments()) {
			res += x.getText() + "\n";
		};
		return res;
	}
}


 