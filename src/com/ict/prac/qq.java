package com.ict.prac;
import java.util.*;
import java.util.stream.Collectors;

public class qq {
    public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    while(true) {
    String[] com = {"가위", "바위", "보"};
    System.out.print("사용자의 값: ");
    String user = sc.nextLine();
    int len = com.length;
    String comrd = com[(int)(Math.random()*len+0)];
    System.out.println("컴퓨터의 값: " + comrd);
    if(user.equals(comrd)==true) {
        System.out.println("비겼습니다.");
    }
    if(user.equals("가위") && comrd.equals("보") || user.equals("바위") && comrd.equals("가위")  || user.equals("보") && comrd.equals("바위")){
        System.out.println("이겼습니다.");
    }
    else {
        System.out.println("졌습니다.");
    }
    }
    }
    }