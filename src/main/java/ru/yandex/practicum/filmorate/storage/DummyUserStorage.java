package ru.yandex.practicum.filmorate.storage;

import org.springframework.stereotype.Component;

import ru.yandex.practicum.filmorate.model.User;

@Component
public class DummyUserStorage implements UserStorage {
    @Override
    public User getById(long id) {
        return new User(id);
    }
}
