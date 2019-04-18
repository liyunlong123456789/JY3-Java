package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
	studentClient sct;

	public StudentManager() {
	}

	public StudentManager(studentClient sct) {
		this.sct = sct;
	}

	// ����һ��ѧ������
	static Student[] stus = new Student[0];
	static Student[] newStus;
	static Student[] nums = new Student[1];
	Student student =  new Student();
	// ���ѧ��
	public void addStudent(Student student) {
		stus = Arrays.copyOf(stus, stus.length + 1);
		stus[stus.length - 1] = student;
	}

	// ���ѧ������
	public void addStuPage(Scanner scanner) {
		int age;
		int id;
		String sex;
		String cls;
		String nums;
		String email;
		String[] num = new String[11];
		int j = 1;
		System.out.println("******************************���ѧ����Ϣ*********************************");
		id = checkId();
//		do {
//			id = scanner.nextInt();
//			if (id == 3) {
//				System.out.println("��id3����,����������:");
//			}
//		} while (id == 3);

		System.out.println("������ѧ������:");
		String name = scanner.next();
		do {
			System.out.println("������ѧ���Ա�:");
			sex = scanner.next();
			if (sex.equals("��") || sex.equals("Ů")) {
				j = 2;
			} else
				System.out.println("��������,����������");
		} while (j == 1);
		do {
			System.out.println("������ѧ������(ֻ��1-120֮���ڵ�����):");
			age = scanner.nextInt();
			if (age < 1 || age > 120) {
				System.out.println("��������,����������");
			}
		} while (age < 1 || age > 120);
		do {
			System.out.println("������ѧ�������꼶(ֻ�ܳ������м����߼�):");

			cls = scanner.next();

			if (false == (cls.equals("����") || cls.equals("�м�") || cls.equals("�߼�"))) {
				System.out.println("��������,����������");
			}
		} while (false == (cls.equals("����") || cls.equals("�м�") || cls.equals("�߼�")));
		System.out.println("������ѧ����ַ:");
		String address = scanner.next();
		do {
			System.out.println("������ѧ����ϵ��ʽ(11λ�ֻ�����):");
			nums = scanner.next();
			if (nums.length() < num.length || nums.length() > num.length) {
				System.out.println("��������,����������");
			}
		} while (nums.length() < num.length || nums.length() > num.length);
		do {
			System.out.println("������ѧ����������(����@��.com):");
			email = scanner.next();
			String check = ".com";
			char a = '@';

			for (int i = 0; i < email.length(); i++) {
				if (a == email.charAt(i)) {
					if (check.equals(email.substring(email.length() - 4))) {
						j = 3;
					} else
						System.out.println("��������,����������");
				}
			}

		} while (j == 2);

		StudentManager studentmanager = new StudentManager();
		Student stu = new Student(id, name, sex, age, cls, address, nums, email);
		studentmanager.addStudent(stu);
		System.out.println("���ݱ���ɹ�,ϵͳ���Զ������ϲ�Ŀ¼~");
		sct.studentIndex();
	}

	// �ж�ID�Ƿ�������ȷ�Ҵ���
	public int checkId() {
		Scanner sca = new Scanner(System.in);
		System.out.println("������ѧ��ID");
		int id = sca.nextInt();
		if (id < 0) {
			System.out.println("������������������");
			checkId();
		} else {
			for (int i = 0; i < stus.length; i++) {
				if (id ==stus[i].getId()) {
					System.out.println("��ID" + id + "���ڣ�����������");
				}
				checkId();
			}
		}
		return id;
	}

	// ����ID��ѯѧ����Ϣ
	public void watchIdMissage() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ��ѯѧ����ID");
		int sca = scanner.nextInt();
		for (int i = 0; i < stus.length; i++) {
			if (sca == stus[i].getId()) {
				nums[0] = stus[i];
				System.out.println(Arrays.toString(nums));
			}
		}
		for (int p = 0; p < stus.length; p++) {
			if (sca != stus[p].getId()) {
				System.out.println("���ݿ���û���������id ����������");
				watchIdMissage();
			}
		}

	}

	// ����ID��ѯѧ������
	public void watchIdName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ��ѯѧ����ID");
		int sca = scanner.nextInt();
		for (int i = 0; i < stus.length; i++) {
			if (sca == stus[i].getId()) {
				String name = stus[i].getStuName();
				System.out.println("��ID��������" + name);
			}
		}
		for (int p = 0; p < stus.length; p++) {
			if (sca != stus[p].getId()) {
				System.out.println("���ݿ���û���������id ����������");
				watchIdName();
			}
		}
	}

	// ����IDɾ��ѧ�� ����
	public Student[] delOneStudentByStuID() {
		int k = 0;
		int z = 1;
		int id;
		while (z == 1) {
			Scanner sca = new Scanner(System.in);
			int stuId = sca.nextInt();
			for (int i = 0; i < stus.length; i++) {
				if (stuId == stus[i].getId()) {
					// ��ɾ��������鸳ֵ ���Ƶĳ���Ϊ����֮ǰԭ����ĳ���-1
					newStus = new Student[stus.length - 1];
					// ���������е�Ԫ��
					for (int j = 0; j < stus.length; j++) {
						// �ж������е�ѧ���Ƿ���idΪstuid��ѧ��
						if (stus.length == 1) {
							z = 2;
						}
						if (stuId != stus[j].getId()) {
							newStus[k] = stus[j];
							k++;
							z = 2;
						}
					}
				}
			}
			for (int p = 0; p < stus.length; p++) {
				if (stuId != stus[p].getId())
					System.out.println("���ݿ���û���������id ����������");
			}
		}
		return newStus;
	}

	// ����ID�޸�ѧ��ȫ����Ϣ
	public void updateStudentInfo(Scanner scanner) {

		int age;
		int id;
		String sex;
		String cls;
		String nums;
		String email;
		String[] num = new String[11];
		int j = 1;
		System.out.println("������Ҫ�޸�ѧ����id");
		id = scanner.nextInt();
		System.out.println("������ѧ������:");
		String name = scanner.next();
		do {
			System.out.println("������ѧ���Ա�:");
			sex = scanner.next();
			if (sex.equals("��") || sex.equals("Ů")) {
				j = 2;
			} else
				System.out.println("��������,����������");
		} while (j == 1);
		do {
			System.out.println("������ѧ������(ֻ��1-120֮���ڵ�����):");
			age = scanner.nextInt();
			if (age < 1 || age > 120) {
				System.out.println("��������,����������");
			}
		} while (age < 1 || age > 120);
		do {
			System.out.println("������ѧ�������꼶(ֻ�ܳ������м����߼�):");

			cls = scanner.next();

			if (false == (cls.equals("����") || cls.equals("�м�") || cls.equals("�߼�"))) {
				System.out.println("��������,����������");
			}
		} while (false == (cls.equals("����") || cls.equals("�м�") || cls.equals("�߼�")));
		System.out.println("������ѧ����ַ:");
		String address = scanner.next();
		do {
			System.out.println("������ѧ����ϵ��ʽ(11λ�ֻ�����):");
			nums = scanner.next();
			if (nums.length() < num.length || nums.length() > num.length) {
				System.out.println("��������,����������");
			}
		} while (nums.length() < num.length || nums.length() > num.length);
		do {
			System.out.println("������ѧ����������(����@��.com):");
			email = scanner.next();
			String check = ".com";
			char a = '@';

			for (int i = 0; i < email.length(); i++) {
				if (a == email.charAt(i)) {
					if (check.equals(email.substring(email.length() - 4))) {
						j = 3;
					} else
						System.out.println("��������,����������");
				}
			}

		} while (j == 2);

		StudentManager studentmanager = new StudentManager();
		Student stu = new Student(id, name, sex, age, cls, address, nums, email);
		// �ҵ�Ҫ�޸ĵ�ѧ��
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].getId() == stu.getId()) {
				stus[i] = stu;
			}
		}
	}

	// ����ID�޸Ĳ�����Ϣ
	public void studentIdChange(Scanner scanner) {
		System.out.println("������Ҫ�޸ĵ�ID");
		int id = scanner.nextInt();
		System.out.println("������Ҫ�޸ĵ�����");
		String a = scanner.next();
		for (int i = 0; i < stus.length; i++) {
			if (id == stus[i].getId()) {
				if (a.equals("name")) {
					System.out.println("�������޸ĺ������");
					stus[i].setStuName(scanner.next());
				}
				if (a.equals("sex")) {
					System.out.println("�������޸ĺ������");
					stus[i].setStusex(scanner.next());
				}
				if (a.equals("age")) {
					System.out.println("�������޸ĺ������");
					stus[i].setStuage(scanner.nextInt());
				}
				if (a.equals("grade")) {
					System.out.println("�������޸ĺ������");
					stus[i].setStuGrade(scanner.next()); 
				}
				if (a.equals("address")) {
					System.out.println("�������޸ĺ������");
					stus[i].setStuAddress(scanner.next());
				}
				if (a.equals("tel")) {
					System.out.println("�������޸ĺ������");
					stus[i].setStuTel(scanner.next());
				}
				if (a.equals("email")) {
					System.out.println("�������޸ĺ������");
					stus[i].setStuEmail(scanner.next());
				}
			}
		}
	}
}
