package com.oc.PayMyBuddy.dto;

import com.oc.PayMyBuddy.utils.PasswordMatches;
import com.oc.PayMyBuddy.utils.ValidEmail;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@PasswordMatches
public class UserInDTO {
        @NotNull
        @NotEmpty
        private String firstName;

        @NotNull
        @NotEmpty
        private String lastName;

        @NotNull
        @NotEmpty
        private String username;

        @NotNull
        @NotEmpty
        private String password;
        private String matchingPassword;

        @ValidEmail
        @NotNull
        @NotEmpty
        private String email;

        @NotNull
        @NotEmpty
        private double balance;

    }
