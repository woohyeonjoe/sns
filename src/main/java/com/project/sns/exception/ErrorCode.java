package com.project.sns.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    DUPLICATED_USER_NAME(HttpStatus.CONFLICT, "User name is duplicated"),

    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "User not founded"),

    INVALID_PASSWORD(HttpStatus.UNAUTHORIZED, "Password is invalid"),

    INVALID_TOKEN(HttpStatus.UNAUTHORIZED, "Token is invalid"),

    INTERNAL_SERVER_ERROR(HttpStatus.CONFLICT, "Internal server error"),

    POST_NOT_FOUND(HttpStatus.NOT_FOUND, "Post not founded"),
    INVALID_PERMISSION(HttpStatus.UNAUTHORIZED, "User has invalid permission"),
    ALREADY_LIKED(HttpStatus.CONFLICT, "User already liked the post");

    private HttpStatus status;
    private String message;
}
