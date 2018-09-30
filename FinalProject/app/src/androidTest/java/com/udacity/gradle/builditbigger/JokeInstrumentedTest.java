package com.udacity.gradle.builditbigger;


import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class JokeInstrumentedTest {

    private static final Intent JOKE_ACTIVITY_TEST = new Intent(
            InstrumentationRegistry.getTargetContext(), MainActivity.class);
    private static final String Joke_TEXT = "Mooooooooo!\n            -Impatient Cow";

    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setup() {
        mainActivityTestRule.launchActivity(JOKE_ACTIVITY_TEST);
    }

    @Test
    public void asyncTask_return_valid() throws InterruptedException{
        onView(withId(R.id.btn_get_joke)).perform(click());
        Thread.sleep(1500);
        onView(withId(R.id.tv_main_joke_text)).check(matches(withText(Joke_TEXT)));
    }
}
