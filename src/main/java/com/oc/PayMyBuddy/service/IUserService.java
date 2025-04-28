package com.oc.PayMyBuddy.service;

import com.oc.PayMyBuddy.dto.UserInDTO;
import com.oc.PayMyBuddy.model.User;

public interface IUserService {
    User registerNewUserAccount(UserInDTO userDto);
}
