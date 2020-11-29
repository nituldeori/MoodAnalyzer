package com.moodanalysis;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood(String message){
        this.message=message;
        try {
            return analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
            return "HAPPY";
        }
    }
    public String analyseMood() throws MoodAnalysisException{
        try{
            if(message.contains(("sad"))){
                return "SAD";
            }
            else
                return "HAPPY";
        } catch (NullPointerException e){
            throw new MoodAnalysisException("Please enter proper message");
        }
    }
}
