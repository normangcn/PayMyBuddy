package com.oc.PayMyBuddy.service;

import com.oc.PayMyBuddy.DTOs.UserInDTO;
import com.oc.PayMyBuddy.model.User;

public interface IUserService {
    User registerNewUserAccount(UserInDTO userDto);
}
