package com.cteam.app.command;

import org.springframework.ui.Model;

import com.cteam.app.dao.BoardDAO;
import com.cteam.app.dao.CDao;

public class boardinsertCommand implements AnCommand {

	@Override
	public void execute(Model model)  {
		

		String member_id = (String)model.asMap().get("member_id");
		String board_subject = (String)model.asMap().get("board_subject");
		String board_title = (String)model.asMap().get("board_title");
		String board_content = (String)model.asMap().get("board_content");
		String board_city = (String)model.asMap().get("board_city");
		String board_region = (String)model.asMap().get("board_region");
		String board_imagepath = (String)model.asMap().get("board_imagepath");

		
		BoardDAO boarddao = new BoardDAO();
		int state = boarddao.boardinsert(member_id,board_subject,board_title,board_content,board_city,board_region,board_imagepath);
		
		model.addAttribute("state", state);
	}	 

}
