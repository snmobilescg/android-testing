package com.example.android.testing.unittesting.basicunitandroidtest;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by bsills on 4/2/15.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class MainActivityAndroidUnitTest {

    public static final String TEST_STRING = "hello";

    @Test
    public void mainActivity_returnHello() {
        assertThat(MainActivity.returnHello(), is(TEST_STRING));
    }
}
