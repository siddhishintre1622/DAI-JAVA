package day10;

import java.util.Arrays;
import java.lang.reflect.*;

public class DemoReflection {

	private static Method[] methods;

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Student s = new Student();
		Class c = s.getClass();
		
		Field[] field = c.getDeclaredFields();
		for(Field f : field)
		{
			System.out.println(f.getName());
			System.out.println(f.getType());
			if(f.getName().equals("rollno"))
			{
				f.setAccessible(true);
				f.setInt(s,  110);
			}
			if(f.getName().equals("name"))
			{
				f.setAccessible(true);
				f.set(s,  "sss");
				
				
				Constructor []  cons= c.getDeclaredConstructors();
				for(Constructor con : cons)
				{
					System.out.println(con.getParameterCount());
					if(con.getParameterCount()==2)
					{
						Parameter[] params = con.getParameters();
						System.out.println(Arrays.toString(params));
						Student s1= (Student) con.newInstance(235,"mmm");
						s1.displayData();
						}
				}
				Method [] methods = c.getDeclaredMethods();
				for(Method m : methods)
				{
					System.out.println(m.getName());
					if(m.getName().equals("privateMethod"))
					{
						m.setAccessible(true);
						m.invoke(s);
					}
					if(m.getName().equals("staticMethod"))
					{
						m.invoke(null);
					}
					Parameter [] params = m.getParameters();
					System.out.println(Arrays.toString(params));
					m.invoke(s,  456, "ttt");
				}
			}
			
			for(Method m :  methods)
			{
				if(m.getDeclaredAnnotation(CreatedBy.class)!=null)
				{
					CreatedBy anno= m.getDeclaredAnnotation(CreatedBy.class);
					if(anno.priority()==1)
					{
						m.invoke(s);
					}
				}
			}
		}
		
	}

}