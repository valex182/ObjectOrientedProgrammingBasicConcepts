package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Александр";
        post.passport = "7416 № 816544";
        post.patronymic = "Александрович";
        post.phone = "+7 (800)-555-35-35";
        post.surname = "Воронович";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 6;
        post.birthday.month = 5;
        post.birthday.year = 1993;
    }
}
