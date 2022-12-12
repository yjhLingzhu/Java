package com.company06;

import java.util.ArrayList;
import java.util.Scanner;

public class StuSystem {
    public static void main(String[] args) {
        // 创建一个学生集合
        ArrayList<Student> array = new ArrayList<Student>();
        boolean flag = true;

        while (flag) {
            System.out.println("\t\t\t---欢迎使用学生管理系统---\t\t\t");
            System.out.println("\t\t\t        1.添加学生      \t\t\t");
            System.out.println("\t\t\t        2.删除学生      \t\t\t");
            System.out.println("\t\t\t        3.修改学生      \t\t\t");
            System.out.println("\t\t\t        4.查看学生      \t\t\t");
            System.out.println("\t\t\t        5.退出系统      \t\t\t");

            System.out.println("请输入您的选择[1-5]:");
            Scanner sc = new Scanner(System.in);
            int sel = sc.nextInt();

            switch (sel) {
                case 1:
                    // 添加学生
                    addStu(array);
                    break;
                case 2 :
                    // 删除学生
                    deleteStu(array);
                    break;
                case 3 :
                    // 修改学生
                    modifyStu(array);
                    break;
                case 4 :
                    // 查看学生
                    showStu(array);
                    break;
                case 5 :
                    // 退出系统
                    flag = false;
                    System.out.println("感谢使用！");
                    break;
                default :
                    System.out.println("输入有误！请规范输入[1-5]");
                    break;
            }
        }
    }

    // 添加学生
    public static void addStu(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学号:");
        String id = sc.nextLine();

        System.out.println("请输入姓名:");
        String name = sc.nextLine();

        System.out.println("请输入年龄:");
        String age = sc.nextLine();

        System.out.println("请输入居住地:");
        String address = sc.nextLine();

        // 新建一个学生
        Student stu = new Student(id, name, age, address);
        // 添加到集合
        array.add(stu);
        System.out.println("添加成功.");
    }

    // 删除学生
    public static void deleteStu(ArrayList<Student> array) {
        // 根据id删除学生
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        String dId = sc.nextLine();

        int index = -1; // 记录需要删除的学生是哪个
        Student stu;
        for (int i = 0; i < array.size(); i++) {
            stu = array.get(i);
            if (stu.getId().equals(dId)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            array.remove(index);
            System.out.println("删除成功.");
        } else {
            System.out.println("不存在此学生");
        }
    }

    //  修改学生
    public static void modifyStu(ArrayList<Student> array) {
        // 根据学号修改学生姓名，年龄，地址
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        String mId = sc.nextLine();
        int index = -1; // 记录需要修改的是哪个学生
        Student stu;
        for (int i = 0; i < array.size(); i++) {
            stu = array.get(i);
            if (stu.getId().equals(mId)) {
                index = i;
            }
        }
        if (index != -1) {
            // 开始修改学生
            Student mStu = array.get(index);

            System.out.println("请输入姓名:");
            String name = sc.nextLine();

            System.out.println("请输入年龄:");
            String age = sc.nextLine();

            System.out.println("请输入居住地:");
            String address = sc.nextLine();

            mStu.setName(name);
            mStu.setAge(age);
            mStu.setAddress(address);

            System.out.println("修改成功.");
        } else {
            System.out.println("不存在此学生");
        }
    }

    // 查看学生
    public static void showStu(ArrayList<Student> array) {
        System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t\t地址");
        Student stu;
        for (int i = 0; i < array.size(); i++) {
            stu = array.get(i);
            String id = stu.getId();
            String name = stu.getName();
            String age = stu.getAge();
            String address = stu.getAddress();
            System.out.println(id+"\t\t"+name+"\t\t"+age+"\t\t"+address);
        }
        System.out.println("------------------------------------------------------------");
    }
}
