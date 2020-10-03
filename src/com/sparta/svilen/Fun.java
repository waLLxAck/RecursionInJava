package com.sparta.svilen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Fun {
    public static ArrayList generateRandomListEngineering72 () {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Shahid", "Saleh", "Dami", "Toyin", "Emmanuel", "Ben", "Janja", "Reece", "Chris", "Svilen"));
        ArrayList<String> randomList = new ArrayList<>();

        int randomNum;
        for (int i = 0; i < names.size();) {
            randomNum = ThreadLocalRandom.current().nextInt(0, names.size());
            randomList.add(names.get(randomNum));
            names.remove(randomNum);
        }
        return randomList;
    }
}
