package com.masonluo.java.advance.course.prepare.jvm;

import java.util.Base64;

/**
 * @author Masonluo
 * @date 2020-09-20 16:53
 */
public class HelloWorldClassLoader extends ClassLoader {

    public static void main(String[] args) {
        try {
            new HelloWorldClassLoader().findClass("com.masonluo.java.advance.course.prepare.jvm.Hello").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String str = "yv66vgAAADQAHwoABgARCQASABMIABQKABUAFgcAFwcAGAEABjxpbml0PgEAAygpVgEABENvZGUBAA9MaW5lTnVtYmVyVGFibGUBABJMb2NhbFZhcmlhYmxlVGFibGUBAAR0aGlzAQA0TGNvbS9tYXNvbmx1by9qYXZhL2FkdmFuY2UvY291cnNlL3ByZXBhcmUvanZtL0hlbGxvOwEACDxjbGluaXQ+AQAKU291cmNlRmlsZQEACkhlbGxvLmphdmEMAAcACAcAGQwAGgAbAQALSGVsbG8gV29ybGQHABwMAB0AHgEAMmNvbS9tYXNvbmx1by9qYXZhL2FkdmFuY2UvY291cnNlL3ByZXBhcmUvanZtL0hlbGxvAQAQamF2YS9sYW5nL09iamVjdAEAEGphdmEvbGFuZy9TeXN0ZW0BAANvdXQBABVMamF2YS9pby9QcmludFN0cmVhbTsBABNqYXZhL2lvL1ByaW50U3RyZWFtAQAHcHJpbnRsbgEAFShMamF2YS9sYW5nL1N0cmluZzspVgAhAAUABgAAAAAAAgABAAcACAABAAkAAAAvAAEAAQAAAAUqtwABsQAAAAIACgAAAAYAAQAAAAcACwAAAAwAAQAAAAUADAANAAAACAAOAAgAAQAJAAAAJQACAAAAAAAJsgACEgO2AASxAAAAAQAKAAAACgACAAAACQAIAAoAAQAPAAAAAgAQ";
        byte[] bytes = Base64.getDecoder().decode(str.getBytes());
        return defineClass(name, bytes, 0, bytes.length);
    }
}
