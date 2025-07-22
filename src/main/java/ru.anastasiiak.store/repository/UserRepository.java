package ru.anastasiiak.store.repository;

import ru.anastasiiak.store.core.User;

public interface UserRepository {

    User registerUser(String login, String password);
    User findByLogin(String login);
}
