package org.example.zajecia.zadanie5_proxy;

interface INewsService {
    Response addMessage(String title, String content);

    Response readMessage(int id);

    Response editMessage(int id, String newContent);

    Response deleteMessage(int id);
}
