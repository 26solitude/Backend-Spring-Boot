package app.sigorotalk.backend.common.exception;

import org.springframework.http.HttpStatus;

public interface ErrorCode {

    HttpStatus getHttpStatus();

    int getCode();

    String getMessage();
}
