package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class BoardServiceClient {

	public static void main(String[] args) {
		
		//1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container = 
									new GenericXmlApplicationContext("app3.xml");
		
		//2. Spring �����̳ʷκ��� BoardServiceImpl ��ü�� LookUp�Ѵ�.
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		//3. �� ��� ��� �׽�Ʈ
		BoardVO vo = new BoardVO();
		vo.setTitle("�ӽ�����1");
		vo.setWriter("ȫ�浿1");
		vo.setContent("�ӽ� ����1.................");
		boardService.insertBoard(vo);
//		
//		vo.setSeq(3);//��� �ε������� 
//		boardService.deleteBoard(vo);//�� �����ϱ�
//		
		//4. �� ��� �˻� ��� �׽�Ʈ
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList){
			System.out.println("--->"+board.toString());
		}
		
		//5. Spring �����̳� ����
		container.close();
		
	}
}
