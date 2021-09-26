package kr.co.songjava.mvc.repository;
import java.util.List;
import org.springframework.stereotype.Repository;
import kr.co.songjava.mvc.domain.Board;
import kr.co.songjava.mvc.parameter.BoardParameter;


/*
 * @author hyunsok
 */
@Repository
public interface BoardRepository {
	
	List<Board> getList();
	Board get(int boardSeq);
	void save(BoardParameter board);
	void update(BoardParameter board);
	void delete(int boardSeq);
	
}
