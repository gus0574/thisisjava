package ch12.sec09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import ch12.sec08.DataExample;

public class 클래스정보얻기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = DataExample.class; 
		
		System.out.println("생성자 정보");
		Constructor[] con = clazz.getDeclaredConstructors();
		for(Constructor cons : con) {
			System.out.print(cons.getName() + "(");
			Class[] parameters = cons.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("필드 정보");
		Field[] field = clazz.getDeclaredFields();
		for(Field fields : field) {
			System.out.println(fields.getType().getName()+" "+fields.getName());
		}
		System.out.println();
		
		System.out.println("메소드 정보");
		Method[] method = clazz.getDeclaredMethods();
		for(Method methods : method) {
			System.out.print(methods.getName() + "(");
			Class[] parameters = methods.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}

	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.print(",");
			}
		}
	}
}
