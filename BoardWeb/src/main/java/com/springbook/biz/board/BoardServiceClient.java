package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class BoardServiceClient {

	public static void main(String[] args) {
		
		//1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = 
									new GenericXmlApplicationContext("app3.xml");
		
		//2. Spring 컨테이너로부터 BoardServiceImpl 객체를 LookUp한다.
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		//3. 글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		vo.setTitle("임시제목1");
		vo.setWriter("홍길동1");
		vo.setContent("임시 내용1.................");
		boardService.insertBoard(vo);
//		
//		vo.setSeq(3);//몇번 인덱스부터 
//		boardService.deleteBoard(vo);//글 삭제하기
//		
		//4. 글 목록 검색 기능 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList){
			System.out.println("--->"+board.toString());
		}
		
		//5. Spring 컨테이너 종료
		container.close();
		
	}
}
