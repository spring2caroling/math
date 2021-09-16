package com.suanfa.demo;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/6/22 2:40 下午
 */
public class User {
    private String name;
    private Integer age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) {
        System.out.println(test());
    }

    private static  int test() {
        int num = 0;

        while (num < 3) {
            num++;
            System.out.println("hhhhh");
            return num;
        }

        return num;
    }




}
