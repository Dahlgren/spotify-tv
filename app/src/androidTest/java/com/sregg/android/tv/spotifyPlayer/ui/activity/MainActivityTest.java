package com.sregg.android.tv.spotifyPlayer.ui.activity;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.squareup.spoon.Spoon;
import com.sregg.android.tv.spotifyPlayer.activities.MainActivity;
import com.sregg.android.tv.spotifyPlayer.testUtils.rule.EspressoTestRule;
import com.sregg.android.tv.spotifyPlayer.testUtils.rule.FailureScreenshotRule;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;

/**
 * Created by simonreggiani on 15-08-14.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

//    @ClassRule
//    public static RuleChain ruleChain = RuleChain
//            .outerRule(new DriverMockServerRule())
//            .around(new LoginRule())
//            .around(new FailureScreenshotRule());

    @ClassRule
    public static FailureScreenshotRule failureScreenshotRule = new FailureScreenshotRule();

    @Rule
    public EspressoTestRule activityTestRule = new EspressoTestRule<>(MainActivity.class);

    @Test
    public void shouldOpen() {
        Spoon.screenshot(activityTestRule.getActivity(), "on_main_activity_open_start");
        // TODO
        assertTrue(true);
    }
}
