package com.jayway.android.robotium.solo;

import android.app.Activity;
import android.app.Instrumentation;
import android.widget.Button;
import android.widget.EditText;

public class BDDSolo extends Solo {
    /**
     * Constructor that takes in the instrumentation and the start activity.
     *
     * @param inst     the instrumentation object
     * @param activity the start activity
     */
    public BDDSolo(Instrumentation inst, Activity activity) {
        super(inst, activity);
    }

    /**
     * @see #getEditText(int)
     */
    public EditText givenEditTextWithIndex(int index) {
        return getEditText(index);
    }

    /**
     * @see #getButton(int)
     */
    public Button givenButtonWithIndex(int index) {
        return getButton(index);
    }

    /**
     * @see #clickOnText(String) 
     */
    public void whenTextIsClicked(String text) {
       clickOnText(text);
    }

    /**
     * Asserts that the expected activity is active.
     * @param name The name of the expected activity.
     */
    public void thenTheActiveActivitysNameIs(String name) {
        assertCurrentActivity("The activity named " + name + " is not active.", name);
    }
}
