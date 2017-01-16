package be.yannickvanhecke.activities;

import android.app.Activity;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Collection;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.runner.lifecycle.Stage.RESUMED;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by yannickvanhecke on 26/12/16.
 */

@RunWith(AndroidJUnit4.class)
public class activity_activity1_tests
{
    @Rule
    public ActivityTestRule<activity_activity1> activity_activity1ActivityTestRule = new ActivityTestRule<activity_activity1>(activity_activity1.class);

    @Test
    public void testToSeeWhetherPressingAButtonOpensTheNewActivityCorrectly(){
        onView(withId(R.id.btnStartActivityTwo)).perform(click());
        Activity activity = getActivityInstance();
        assertTrue(activity instanceof activity_activity2);
    }

    @Test
    public void testToCheckOneOfTheParametersYouAreTestingEGOnStartMethode(){
        Activity activity = getActivityInstance();
        if (activity instanceof  activity_activity1) {
            activity_activity1 activity_activity1 = (be.yannickvanhecke.activities.activity_activity1) activity;
            assertEquals(1, activity_activity1.getOnCreateCounter());
        }
        
    }

    // source: http://www.vogella.com/tutorials/AndroidTestingEspresso/article.html
    public Activity getActivityInstance() {
        final Activity[] activity = new Activity[1];
        InstrumentationRegistry.getInstrumentation().runOnMainSync(new Runnable( ) {
            public void run() {
                Activity currentActivity = null;
                Collection resumedActivities = ActivityLifecycleMonitorRegistry.getInstance().getActivitiesInStage(RESUMED);
                if (resumedActivities.iterator().hasNext()){
                    currentActivity = (Activity) resumedActivities.iterator().next();
                    activity[0] = currentActivity;
                }
            }
        });

        return activity[0];
    }
}
