package com.hdw.controller;

import com.hdw.controller.action.Action;
import com.hdw.controller.action.BoardCheckPassFormAction;
import com.hdw.controller.action.BoardListAction;
import com.hdw.controller.action.BoardUpdateAction;
import com.hdw.controller.action.BoardUpdateFormAction;
import com.hdw.controller.action.BoardViewAction;
import com.hdw.controller.action.BoardWriteAction;
import com.hdw.controller.action.BoardWriteFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactiry :" + command);
		if(command.equals("board_list")){
			action = new BoardListAction();
		}else if(command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
		}else if(command.equals("board_write")) {
			action = new BoardWriteAction();
		}else if(command.equals("board_view")) {
			action = new BoardViewAction();
		}else if(command.equals("board_check_pass_form")) {
			action = new BoardCheckPassFormAction();
		}else if(command.equals("board_update_form")) {
			action = new BoardUpdateFormAction();
		}else if(command.equals("board_update")) {
			action = new BoardUpdateAction();
		}
		return action;
	}
	
}
