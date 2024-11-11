package org.example.zajecia.zadanie5_proxy;

import java.util.HashMap;
import java.util.Map;

public class NewsServiceProxy implements INewsService {
    private static final NewsService newsService = new NewsService();
    private final User user;
    private static final Map<Integer, Response> cache = new HashMap<>();

    public NewsServiceProxy(User user) {
        this.user = user;
    }


    @Override
    public Response readMessage(int id) {
        if (cache.containsKey(id)) {
            System.out.println("Cash");
            return cache.get(id);
        }
        Response response = newsService.readMessage(id);
        cache.put(id, response);
        return response;
    }

    @Override
    public Response addMessage(String title, String content) {
        if (user.getRole() == UserRole.GUEST) {
            return new Response("Error", "Access denied");
        } else {
            cache.clear();
            return newsService.addMessage(title, content);
        }
    }

    @Override
    public Response editMessage(int id, String newContent) {
        if (user.getRole() == UserRole.MODERATOR || user.getRole() == UserRole.ADMIN) {
            cache.remove(id);
            return newsService.editMessage(id, newContent);
        }
        return new Response("Error", "Access denied");
    }

    @Override
    public Response deleteMessage(int id) {
        if (user.getRole() == UserRole.ADMIN) {
            cache.remove(id);
            return newsService.deleteMessage(id);
        }
        return new Response("Error", "Access denied");
    }
}
