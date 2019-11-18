package project4.t1;


import java.util.*;

public class Start {
	static Set<Student> set_student = Collections.synchronizedSet(new HashSet<Student>());
	static Set<Teacher> set_teacher = Collections.synchronizedSet(new HashSet<Teacher>());

	public static void main(String[] a) {
		Start start = new Start();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("欢迎来到人事管理系统\r\n按1进入学生界面\r\n按2进入老师界面\r\n0退出系统");
			int status = -1;
			while (true) {
				try {
					status = Integer.valueOf(sc.nextLine());
					break;
				} catch (NumberFormatException e) {
					continue;
				}
			}
			switch (status) {
				case 1:
					start.studentSystem();
					break;
				case 2:
					start.teacherSystem();
					break;

				default:
					System.out.println("请输入正确的数字");
					break;
			}
		}

	}

	public void studentSystem() {
		int status = -1;
		Scanner sc = new Scanner(System.in);
		while (status != 0) {
			System.out.println("欢迎来到学生管理系统" + "\r\n请选择你要使用的功能："
					+ "\r\n1:展示所有学生信息" + "\r\n2:添加" + "\r\n3:删除" + "\r\n4:修改");
			while (true) {
				try {
					status = Integer.valueOf(sc.nextLine());
					break;
				} catch (NumberFormatException e) {
					continue;
				}
			}
			switch (status) {
				case 1:
					studentDisplay();
					break;
				case 2:
					System.out.println("请输入学生的姓名");
					String name_add = sc.nextLine();
					System.out.println("请输入学生的性别");
					String gender_add = sc.nextLine();
					System.out.println("请输入学生的学号");
					int num_add = -1;
					while (true) {
						try {
							num_add = Integer.valueOf(sc.nextLine());
							break;
						} catch (Exception e) {
							continue;
						}
					}
					System.out.println("请输入学生的高考成绩");
					Double gaokao_add = Double.valueOf(sc.nextLine());
					System.out.println("请输入学生的专业");
					String major_add = sc.nextLine();
					System.out.println("请输入学生的班级");
					String clas_add = sc.nextLine();
					System.out.println("请输入学生的生日");
					String bir_add = sc.nextLine();
					Student s = new Student();
					s.setName(name_add);
					s.setGender(gender_add);
					s.setNum(num_add);
					s.setGaokao(gaokao_add);
					s.setClas(clas_add);
					s.setMajor(major_add);
					s.setBirthday(bir_add);
					if (this.addStudent(s)) {
						System.out.println("----添加成功----");
					}
					break;
				case 3:
					System.out.println("请输入你要删除的学生学号：");
					int num_delete = -1;
					while (true) {
						try {
							num_delete = Integer.valueOf(sc.nextLine());
							break;
						} catch (Exception e) {
							continue;
						}
					}
					if (this.deleteStudent(num_delete)) {
						System.out.println("--删除成功--");
					} else {
						System.out.println("--删除失败：可能没有该学生--");
					}
					break;
				case 4:
					System.out.println("请输入你要修改的学生学号:");
					int num_old = -1;
					while (true) {
						try {
							num_old = Integer.valueOf(sc.nextLine());
							break;
						} catch (Exception e) {
							continue;
						}
					}
					System.out.println("请输入学生的姓名");
					String name_update = sc.nextLine();
					System.out.println("请输入学生的性别");
					String gender_update = sc.nextLine();
					System.out.println("请输入学生的学号");
					int num_new = -1;
					while (true) {
						try {
							num_new = Integer.valueOf(sc.nextLine());
							break;
						} catch (Exception e) {
							continue;
						}
					}
					Student s_update = new Student();
					s_update.setName(name_update);
					s_update.setNum(num_new);
					s_update.setGender(gender_update);
					if (this.updateStudent(num_old, s_update)) {
						System.out.println("--修改成功--");
					} else {
						System.out.println("--未找到该学生--");
					}
					break;

				default:
					break;
			}
		}
		sc.close();

	}

	private void studentDisplay() {
		for (Student s : set_student) {
			System.out.println(s.toString());
		}
		if (set_student.size() == 0) {
			System.out.println("----当前学生数据为空----");
		}
	}

	private Student searchStudentByNum() {
		return null;
	}

	private boolean deleteStudent(int num_delete) {
		boolean result = false;
		Iterator<Student> it = set_student.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			if (num_delete == s.getNum()) {
				it.remove();
				result = true;
			}
		}
		return result;
	}

	private boolean updateStudent(int num_old, Student s_update) {
		boolean result = false;
		for (Student s : set_student) {
			if (s.getNum() == num_old) {
				s.setName(s_update.getName());
				s.setGender(s_update.getGender());
				s.setNum(s_update.getNum());
				result = true;
			}
		}
		return result;
	}

	private boolean addStudent(Student s) {

		boolean result = set_student.add(s);
		return result;
	}

	public void teacherSystem() {
		int status = -1;
		Scanner sc = new Scanner(System.in);
		while (status != 0) {
			System.out.println("欢迎来到老师管理系统" + "\r\n请选择你要使用的功能："
					+ "\r\n1:展示所有老师信息" + "\r\n2:添加" + "\r\n3:删除" + "\r\n4:修改");
			status = Integer.valueOf(sc.nextLine());
			switch (status) {
				case 1:
					teacherDisplay();
					break;
				case 2:
					System.out.println("请输入老师的姓名");
					String name_add = sc.nextLine();
					System.out.println("请输入老师的性别");
					String gender_add = sc.nextLine();
					System.out.println("请输入老师的编号");
					int num_add = -1;
					while (true) {
						try {
							num_add = Integer.valueOf(sc.nextLine());
							break;
						} catch (Exception e) {
							continue;
						}
					}
					System.out.println("请输入老师的部门");
					String dept_add = sc.nextLine();
					System.out.println("请输入老师的职称");
					String prof_add = sc.nextLine();
					System.out.println("请输入老师的工资");
					double sal_add = Double.valueOf(sc.nextLine());
					System.out.println("请输入老师的生日");
					String bir_add = sc.nextLine();
					Teacher s = new Teacher();
					s.setName(name_add);
					s.setGender(gender_add);
					s.setNum(num_add);
					s.setDep(dept_add);
					s.setProf(prof_add);
					s.setSal(sal_add);
					s.setBirthday(bir_add);
					if (this.addTeacher(s)) {
						System.out.println("--添加成功--");
					}
					break;
				case 3:
					System.out.println("请输入你要删除的老师学号：");
					int num_delete = -1;
					while (true) {
						try {
							num_delete = Integer.valueOf(sc.nextLine());
							break;
						} catch (Exception e) {
							continue;
						}
					}
					if (this.deleteTeacher(num_delete)) {
						System.out.println("--删除成功--");
					} else {
						System.out.println("--删除失败：可能没有该老师--");
					}
					break;
				case 4:
					System.out.println("请输入你要修改的老师学号:");
					int num_old = -1;
					while (true) {
						try {
							num_old = Integer.valueOf(sc.nextLine());
							break;
						} catch (Exception e) {
							continue;
						}
					}
					System.out.println("请输入老师的姓名");
					String name_update = sc.nextLine();
					System.out.println("请输入老师的性别");
					String gender_update = sc.nextLine();
					System.out.println("请输入老师的学号");
					int num_new = -1;
					while (true) {
						try {
							num_new = Integer.valueOf(sc.nextLine());
							break;
						} catch (Exception e) {
							continue;
						}
					}
					Teacher s_update = new Teacher();
					s_update.setName(name_update);
					s_update.setNum(num_new);
					s_update.setGender(gender_update);
					if (this.updateTeacher(num_old, s_update)) {
						System.out.println("--修改成功--");
					}
					break;

				default:
					break;
			}
		}

	}

	private void teacherDisplay() {
		for (Teacher s : set_teacher) {
			System.out.println(s.toString());
		}
		if (set_teacher.size() == 0) {
			System.out.println("----当前老师数据为空----");
		}
	}

	private boolean deleteTeacher(int num_delete) {
		boolean result = false;
		Iterator<Teacher> it = set_teacher.iterator();
		while (it.hasNext()) {
			Teacher s = it.next();
			if (num_delete == s.getNum()) {
				it.remove();
				result = true;
			}
		}
		return result;
	}

	private boolean updateTeacher(int num_old, Teacher s_update) {
		boolean result = false;
		for (Teacher s : set_teacher) {
			if (s.getNum() == num_old) {
				s.setName(s_update.getName());
				s.setGender(s_update.getGender());
				s.setNum(s_update.getNum());
				result = true;
			}
		}
		return result;
	}

	private boolean addTeacher(Teacher s) {

		boolean result = set_teacher.add(s);
		return result;
	}

}