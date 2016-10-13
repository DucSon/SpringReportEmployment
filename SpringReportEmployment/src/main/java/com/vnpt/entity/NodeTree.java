package com.vnpt.entity;

import java.util.List;

public class NodeTree {

	private int id;
	private String text;
	private List<NodeTree> children;
	
	public NodeTree(int id, String text){
		this.id= id;
		this.text = text;	
	};
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public List<NodeTree> getChildren() {
		return children;
	}

	public void setChildren(List<NodeTree> children) {
		this.children = children;
	}

	
}
