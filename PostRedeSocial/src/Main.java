import entities.Comment;
import entities.Post;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
	
	public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy h:m:s");
	
	String date = sc.nextLine();
	LocalDate ld = LocalDate.parse(date, dtFormatter);
	String title = sc.nextLine();
	String content = sc.nextLine();
	Integer likes = sc.nextInt();
	
	Post post = new Post(ld, title, content, likes);
	
	Comment c1 = new Comment("Concordo totalmente!");
	Comment c2 = new Comment("Muito interessante!");

	post.addComment(c1);
	post.addComment(c2);
	
	System.out.println(post);
	}
}
