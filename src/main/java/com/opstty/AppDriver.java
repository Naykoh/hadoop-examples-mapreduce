package com.opstty;

import com.opstty.job.*;
import org.apache.hadoop.util.ProgramDriver;

public class AppDriver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver programDriver = new ProgramDriver();

        try {
            programDriver.addClass("wordcount", WordCount.class,
                    "A map/reduce program that counts the words in the input files.");

            programDriver.addClass("districtcount", DistrictCount.class,
                    "A map/reduce program that displays the list of distinct containing trees in this file");

            programDriver.addClass("existingspecies", ExistingSpecies.class,
                    "A map/reduce program that displays the list of different species trees in this file");

            programDriver.addClass("treesbyspecies", TreesBySpecies.class,
                    "A map/reduce program that calculates the number of trees of each species");

            programDriver.addClass("heightperspecie", HeightPerSpecie.class,
                    "A map/reduce program that calculates the height of the tallest tree of each kind");

            exitCode = programDriver.run(argv);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.exit(exitCode);
    }
}
