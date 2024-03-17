package com.hdw.controller;

import com.hdw.controller.action.Action;
import com.hdw.controller.action.BoardListAction;
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
		}
		return action;
	}
	
}
