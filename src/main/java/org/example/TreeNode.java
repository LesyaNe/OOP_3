package org.example;

public abstract class TreeNode {
    private String name;
    private String surname;

    private TreeNode parent;

    private TreeNode child;

    public void getParent(){}

    public void setParent(){}

    public void getChild(){}

    public void setChild(){}

    public TreeNode(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String toString(){
        return "Person is " + name + " " + surname;
    }
}
