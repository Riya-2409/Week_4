package com.reflection.intermediatelevel.retriveannotation;

public class Main {
    public static void main(String[] args) {

        Class<Book> bookClass = Book.class;


        if (bookClass.isAnnotationPresent(Author.class)) {

            Author author = bookClass.getAnnotation(Author.class);

            System.out.println("Author of the class: " + author.name());
        } else {
            System.out.println("No @Author annotation found.");
        }
    }
}