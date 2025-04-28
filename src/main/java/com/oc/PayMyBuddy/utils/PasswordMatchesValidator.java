package com.oc.PayMyBuddy.utils;

import com.oc.PayMyBuddy.dto.UserInDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator
        implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context){
        UserInDTO user = (UserInDTO) obj;
        return user.getPassword().equals(user.getMatchingPassword());
    }
}
