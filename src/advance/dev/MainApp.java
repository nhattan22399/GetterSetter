package advance.dev;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class MainApp {
	
	public static void input(List<Student> studentList ){
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i < 3; i++) {
			System.out.println("Sinh vien thu: " + i);
			System.out.println("name:");
			String name = sc.next();
			System.out.println("age:");
			int age = sc.nextInt();
			System.out.println("dia chi:");
			String address = sc.next(); 
			System.out.println("So dien thoai:");
			String phone = sc.next();
			System.out.println("Diem trung binh:");
			double dtb = sc.nextDouble();
			Student std = new Student(name, age, address, phone, dtb);
			studentList.add(std);}
		}
	public static void print(List<Student> studentList) {
		Iterator<Student> it = studentList.iterator();
		while(it.hasNext()) {
			Student std = it.next();
			System.out.println(std.toString());
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		
		input(studentList);
		print(studentList);
		
		Collections.sort(studentList, new Comparator<Student>(){

			@Override
			public int compare(Student std1, Student std2) {
				// TODO Auto-generated method stub
				return (int) (std1.getDtb() - std2.getDtb());
			}
			
		});
		System.out.println("Sap xep theo dtb tang dan");
		for(Student std : studentList) {
			System.out.println(std.toString());
		}
		
	}
		
	}


