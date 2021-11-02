package com.junit.reflex;

import org.junit.Test;

import java.lang.reflect.*;

public class getMethodsAndField {

    private static int num;

    @Test
    public void testField() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取person类的字节码文件
        Class<Person> personClass = Person.class;
//        获取共有的两个参数的构造器
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        Constructor<Person> decon = personClass.getDeclaredConstructor(String.class, int.class, String.class, int.class);
//        使用newInstance构造器创建一个实例
        Person ssss = constructor.newInstance("FirstReflex", 23);
//        输出内容
        System.out.println(ssss);
//        获取person类中的方法
        Method method = personClass.getMethod("getName");
        method.invoke(ssss);
        Field field = personClass.getDeclaredField("name");
        System.out.println(field.getModifiers());
        System.out.println("lever:" + Modifier.toString(field.getModifiers()));
        field.setAccessible(true);
        field.set(ssss, "jjjjj");
        execute(ssss, field);

        Object invoke = method.invoke(ssss);
        System.out.println(invoke);
//        for (Field field : fields) {
//            System.out.println(field.getName());
//            personClass.getField(field.getName());
//            System.out.println(field.get(personClass));
//            System.out.println(field.get(personClass));
//            System.out.println(field.get(personClass));
//            System.out.println(field.get(personClass));
//        }
//        method();
    }

    private void execute(Person ssss, Field field) throws IllegalAccessException {
        System.out.println(ssss);
        field.set(ssss, "彭陶是猪");
        Object o = field.get(ssss);
        System.out.println(o);
    }

    public static void method(String name, int age) {
        getMethodsAndField.num = 10;
        int num = getMethodsAndField.num;
    }
}
