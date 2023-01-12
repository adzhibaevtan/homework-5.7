package com.test.homework

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class AndroidTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleDivide() {
        runBlocking {
            Espresso.onView(withId(R.id.firstET)).perform(ViewActions.typeText("10.0"))
            Espresso.onView(withId(R.id.firstET)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.secondET)).perform(ViewActions.typeText("5.0"))
            Espresso.onView(withId(R.id.secondET)).perform(ViewActions.closeSoftKeyboard())
            Espresso.onView(withId(R.id.calculateBtn)).perform(ViewActions.click())
            Espresso.onView(withId(R.id.resultTV)).check(ViewAssertions.matches(ViewMatchers.withText("2.0")))
        }
    }

}