package com.moodanalysis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MoodAnalyserTest {
    @Test
    public void givenNullMoodShouldThrowException() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        moodAnalyser.analyseMood(null);

    }

    @Test
    public void givenEmptyMoodShouldThrowException() throws MoodAnalysisException{
        MoodAnalyser moodAnalyser=new MoodAnalyser("");
        moodAnalyser.analyseMood("");
    }
    @Test
    public void givenSadMoodreturnSad(){
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in sad Mood");
        try {
            String mood= moodAnalyser.analyseMood();
            Assert.assertEquals("SAD",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void givenAnyMoodreturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in any Mood");
        try {
            String mood= moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }


}