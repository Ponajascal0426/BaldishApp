package com.example.parking10.data;

import android.view.*;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.parking10.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {




    public Result<LoggedInUser> login(String username, String password) {
        try {
            // TODO: handle loggedInUser authentication
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            username);

            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("登录失败！", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}
