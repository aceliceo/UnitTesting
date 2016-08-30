package com.example.adalberto.unittest;

import android.content.Context;
import android.content.SharedPreferences;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {
    @Mock
    Context mContext;

    @Mock
    SharedPreferences mSharedPreferences;

    @Mock
    SharedPreferences.Editor mEditor;

    @Mock
    UserPreferences mUserPreferences;

    @Before
    public void setup() {
        mUserPreferences = new UserPreferences();

        initMocks(this);
        when(mUserPreferences.getSettings(mContext)).thenReturn(mSharedPreferences);
        when(mUserPreferences.getSettings(mContext).edit()).thenReturn(mEditor);
        //when(mSharedPreferences.edit()).thenReturn(mEditor);
    }

    @Test
    public void set_user_name() throws Exception {
        //Arrange
        String name = "adalberto";

        when(mEditor.putString(UserPreferences.USER_NAME, name)).thenReturn(mEditor);
        when(mUserPreferences.getUserName(mContext)).thenReturn(name);

        //Act
        mUserPreferences.setUserName(mContext, name);

        //Assert
        assertEquals(mUserPreferences.getUserName(mContext), name);
    }
}