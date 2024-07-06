package com.sirmaacademy.entrycourse.classes.articles;

import java.util.Scanner;

public class ArticleApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] articleData = sc.nextLine().split(",\\s+");

        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {

            String[] commands = sc.nextLine().split(":");

            changeArticleAttributes(commands, article);

        }

        System.out.println(article);

    }

    private static void changeArticleAttributes(String[] commands, Article article) {

        String newValue = commands[1].trim();

        switch (commands[0]) {

            case "Edit":
                article.edit(newValue);

                break;

            case "ChangeAuthor":
                article.changeAuthor(newValue);

                break;

            case "Rename":
                article.rename(newValue);

                break;

        }
    }

}
