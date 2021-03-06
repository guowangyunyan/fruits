package com.service;

import com.model.UserModel;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserModel> login();

    List<UserModel> find(Map<String, String> map);
}
