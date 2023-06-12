package ru.netology;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.surname = "Арефьев";
        post.name = "Никита";
        post.patronymic = "Александрович";
        post.phone = "+79223334455";
        post.passport = "7777 № 112233";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 18;
        post.birthday.month = 2;
        post.birthday.year = 1998;
    }
}