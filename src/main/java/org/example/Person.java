package org.example;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public abstract class Person implements TreeNode {

    private final List<Person> children = new ArrayList<>();
    private final List<Person> parents = new ArrayList<>();

    enum Sex {MALE, FEMALE}

    private Sex sex;

    public Person(String name, String surname, Sex sex, Person parent) {
        this.setName(name);
        this.setSurname(surname);
        this.sex = sex;
        if (checkParent(parent)) {
            this.parents.add(parent);
            parent.children.add(this);
        }

    }

    private void setSurname(String surname) {

    }

    private void setName(String name) {
    }

    public String getSex() {
        return String.valueOf(this.sex);
    }

    private boolean checkParent(Person person) {
        return person != null;
    }


    public List<Person> getParents() {
        return parents;
    }


    public List<Person> getChildren() {
        return children;
    }


    public List<Person> getSubParents() {
        List<Person> result = new ArrayList<>();
        List<Person> subResult = this.getParents();
        for (Person per : subResult) {
            result.addAll(per.getParents());
        }
        return result;
    }


    public List<Person> getSubChildren() {
        List<Person> result = new ArrayList<>();
        List<Person> subResult = this.getChildren();
        for (Person per : subResult) {
            result.addAll(per.getChildren());
        }
        return result;
    }
}
