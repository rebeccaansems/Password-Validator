package com.rebeccaansems.csci3130_assignments;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.espresso.ViewAction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.KeyEvent;
import android.widget.EditText;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.pressKey;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


import static android.support.test.espresso.action.ViewActions.click;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {

    private String textToFind;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void passwordIsWeak()
    {
        onView(withId(R.id.testInputPassword)).perform(click());
        onView(isAssignableFrom(EditText.class)).perform(typeText("badPassword"));
        onView(withId(R.id.buttonValidatePassword)).perform(click());

        onView(withId(R.id.textViewPasswordStrength)).check(matches(withText("Password is weak")));
    }

    @Test
    public void passwordIsStrong()
    {
        onView(withId(R.id.testInputPassword)).perform(click());
        onView(isAssignableFrom(EditText.class)).perform(typeText("thisIsAG00dP@ssword"));
        onView(withId(R.id.buttonValidatePassword)).perform(click());

        onView(withId(R.id.textViewPasswordStrength)).check(matches(withText("Password is strong")));
    }


}