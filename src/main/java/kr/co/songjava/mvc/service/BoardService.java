package kr.co.songjava.mvc.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.co.songjava.mvc.domain.Board;
import kr.co.songjava.mvc.parameter.BoardParameter;
import kr.co.songjava.mvc.repository.BoardRepository;


/*
 * @author hyunsok
 */
@Service
public class BoardService {

	@Autowired
	private BoardRepository repository;

	/**
	 * 목록 리턴
	 * 
	 * @return
	 */
	public List<Board> getList() {
		System.out.println("getList 실행 확인 !!!!!!!!!!!!!!!!!!!!!!!!");
		
		System.out.println("getList 실행 확인 !!!!!!!!!!!!!!!!!!!!!!!!");
		List<Board> board = repository.getList();
		System.out.println("board :" + board);
		
		return repository.getList();
	};

	/**
	 * 상세 정보
	 * 
	 * @param boardSeq
	 * @return
	 */
	public Board get(int boardSeq) {

		return repository.get(boardSeq);

	};

	public void save(BoardParameter parameter) {
		Board board = repository.get(parameter.getBoardSeq());
		if(board == null) {
			repository.save(parameter);
		} else {
			repository.update(parameter);
		}
	}
	

	// public void update(BoardParameter parameter) {
	// repository.update(parameter);
	// };

	public void delete(int boardSeq) {

		repository.delete(boardSeq);

	};

}

