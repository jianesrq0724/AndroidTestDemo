package com.example.ruiqin.androidtestdemo;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * 类描述:
 *
 * @author : ruiqin.shen
 * @date : 2017/12/14
 */
@RunWith(AndroidJUnit4.class)
public class LoginTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(
            LoginActivity.class);
    @Test
    public void loginWithWrongPassword(){
        onView(withId(R.id.edtName)).perform(typeText("android"), closeSoftKeyboard());
        onView(withId(R.id.edtPwd)).perform(typeText("wrong"),closeSoftKeyboard());
        onView(withId(R.id.btnLogin)).perform(click());
        onView(withId(R.id.tvLoginResult)).check(matches(withText("登录失败")));
    }
    @Test
    public void loginWithRightPassword(){
        onView(withId(R.id.edtName)).perform(typeText("android"), closeSoftKeyboard());
        onView(withId(R.id.edtPwd)).perform(typeText("123456"),closeSoftKeyboard());
        onView(withId(R.id.btnLogin)).perform(click());
        onView(withId(R.id.tvLoginResult)).check(matches(withText("登录成功")));
    }
}
