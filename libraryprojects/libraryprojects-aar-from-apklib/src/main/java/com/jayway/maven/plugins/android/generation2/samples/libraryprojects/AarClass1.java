package com.jayway.maven.plugins.android.generation2.samples.libraryprojects;

import com.jayway.maven.plugins.android.generation2.samples.libraryprojects.lib1.Lib1Class;

/**
 * Extends lib1Class from apklib1 to prove that we have compiled using apklib1 as a dependency.
 */
public class AarClass1 extends Lib1Class {

    public String getString2() {
        return "String2";
    }
}
