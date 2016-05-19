package com.example.adalberto.unittest;

import android.content.Context;
import android.content.SharedPreferences;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void set_user_name() throws Exception {
        Context context = Mockito.mock(Context.class);
        SharedPreferences sharedPreferences = Mockito.mock(SharedPreferences.class);
        SharedPreferences.Editor editor = UserPreferences.getSettingsEditor(sharedPreferences);// Mockito.mock(SharedPreferences.Editor.class);
        UserPreferences preferences = Mockito.mock(UserPreferences.class);
        preferences.setUserName(editor, "adalberto");

        assertEquals(preferences.getUserName(context), "adalberto");
    }
}