package com.cteam.app.command.jin;

import org.springframework.ui.Model;

import com.cteam.app.command.AnCommand;
import com.cteam.app.dao.CDao;

public class AnModifyCommand implements AnCommand {

	@Override
	public void execute(Model model) {		
		String member_id = (String)model.asMap().get("member_id");
		String member_pw = (String)model.asMap().get("member_pw");	
		String member_name = (String)model.asMap().get("member_name");
		String member_question = (String)model.asMap().get("member_question");
		String member_answer = (String)model.asMap().get("member_answer");
		String member_phonenum = (String)model.asMap().get("member_phonenum");
		
		CDao cdao = new CDao();
		int state = cdao.cModify(member_id, member_pw, member_name, member_question, 
				member_answer,member_phonenum);
		
	}

}
