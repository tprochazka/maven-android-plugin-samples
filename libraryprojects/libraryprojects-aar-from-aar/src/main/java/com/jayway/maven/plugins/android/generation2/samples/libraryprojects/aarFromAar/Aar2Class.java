package com.jayway.maven.plugins.android.generation2.samples.libraryprojects.aarFromAar;

import com.jayway.maven.plugins.android.generation2.samples.libraryprojects.aar1.Aar1Class;

/**
 * Extends lib1Class from Aar1Class to prove that we have compiled using aar1 as a dependency.
 */
public class Aar2Class extends Aar1Class {

    public String getString2() {
        return "String2";
    }
}
