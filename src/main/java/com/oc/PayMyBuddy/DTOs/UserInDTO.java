package com.oc.PayMyBuddy.DTOs;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserInDTO {
        @NotNull
        @NotEmpty
        private String firstName;

        @NotNull
        @NotEmpty
        private String lastName;

        @NotNull
        @NotEmpty
        private String password;
        private String matchingPassword;

        @NotNull
        @NotEmpty
        private String email;

    }
