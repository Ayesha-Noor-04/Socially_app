package com.example.smda1

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTest {

    // Start from Login3Activity (to test button)
    @get:Rule
    var activityRule1 = ActivityScenarioRule(Login3Activity::class.java)

    @Test
    fun testLoginButtonNavigatesToLogin24Activity() {
        // Click button (id: button)
        onView(withId(R.id.button)).perform(click())

        // Check that a view from Login24Activity is displayed
        // Replace R.id.target_view_id with a view that exists in Login24Activity
        onView(withId(R.id.username)).check(matches(isDisplayed()))
    }



    // Start from Kyan21Activity (to test follow button)
    @get:Rule
    var activityRule2 = ActivityScenarioRule(Kyan21Activity::class.java)

    @Test
    fun testFollowButtonNavigatesToKyan22Activity() {
        // Click follow button (id: follow)
        onView(withId(R.id.follow)).perform(click())

        // Check that a view from Kyan22Activity is displayed
        // Replace R.id.target_view_id_2 with a view that exists in Kyan22Activity
        onView(withId(R.id.jacobpfp13)).check(matches(isDisplayed()))
    }
}