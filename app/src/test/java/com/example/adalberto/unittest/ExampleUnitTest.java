package com.example.adalberto.unittest;

import android.content.Context;
import android.content.SharedPreferences;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Mock
    Context mContext;

    @Mock
    SharedPreferences mSharedPreferences;

    @Mock
    SharedPreferences.Editor mEditor;

    UserPreferences mUserPreferences;

    @Before
    public void setup() {
        mUserPreferences = new UserPreferences();

        initMocks(this);
        when(mUserPreferences.getSettings(mContext)).thenReturn(mSharedPreferences);
        when(mUserPreferences.getSettings(mContext).edit()).thenReturn(mEditor);
    }

    @Test
    public void set_user_name() throws Exception {
        //Arrange
        String name = "adalberto";
        when(mUserPreferences.getUserName(mContext)).thenReturn(name);

        //Act
        mUserPreferences.setUserName(mContext, name);

        //Assert
        assertEquals(mUserPreferences.getUserName(mContext), "adalberto");
    }
}