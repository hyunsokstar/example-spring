package kr.co.songjava.mvc.parameter;
import lombok.Data;
// import java.util.Date;


@Data
public class BoardParameter {
	private int boardSeq;
	private String title;
	private String contents;
	// private Date regDate;
}
