package com.oopsjpeg.osu4j;

import com.oopsjpeg.osu4j.backend.EndpointMatches;
import com.oopsjpeg.osu4j.backend.Osu;
import com.oopsjpeg.osu4j.exception.OsuAPIException;

import java.net.MalformedURLException;

public class GetMultiMatchTest {
    private static final int MATCH_ID = 56347212;

    public static void main(String[] args) throws OsuAPIException, MalformedURLException {
        // Create a new Osu object with an API key
        String key = args[0];
        Osu osu = Osu.getAPI(key);

        // Get the beatmap
        OsuMatch match = osu.matches.getAsQuery(new EndpointMatches.ArgumentsBuilder(MATCH_ID).build())
                .resolve();

        // Print information
        System.out.println(match.toString());
//        System.out.println(beatmap.getURL());
//        System.out.println("Creator: " + beatmap.getCreatorName());
//        System.out.println("BPM: " + beatmap.getBPM());
//        System.out.println("Difficulty: " + beatmap.getDifficulty());
    }
}
