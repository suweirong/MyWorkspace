package com.shengsiyuan.designpattern.composite.exampl_platefruit;

import java.util.ArrayList;

public class Plate extends Component {

	private ArrayList<Component> list = new ArrayList<Component>();
	
	public void add(Component com){
		list.add(com);
	}
	
	public void remove(Component com){
		list.remove(com);
	}
	
	public Component getChild(int i){
		return list.get(i);
	}
	
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		for(Component obj:list){
			obj.eat();
		}
	}

}
