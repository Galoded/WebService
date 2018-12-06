package cn.supreme.ws.cxf_rest.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentInterfaceImpl implements StudentInterface {

	@Override
	public Student query(int id, String name) {
		System.out.println(id + "&&" + name);
		Student stu = new Student();
		stu.setId(22054);
		stu.setName("dongh");
		stu.setBirthday(new Date());
		return stu;
	}

	@Override
	public List<Student> queryList() {
		Student stu1 = new Student();
		stu1.setId(10006);
		stu1.setName("dongh");
		stu1.setBirthday(new Date());

		Student stu2 = new Student();
		stu2.setId(22054);
		stu2.setName("dongdah");
		stu2.setBirthday(new Date());

		List<Student> list = new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		return list;
	}

}
