package project3;

import java.util.Arrays;

public class setLesson {
	Book b=new Book();
	Lesson l=new Lesson();
	public setLesson( String lessonname,String[] arrs)
	{
		b.setName(arrs);
		l.setName(lessonname);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "课程："+l.getName()+" 所需教材："+Arrays.toString(b.getName());
	}
}
