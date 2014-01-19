package com.jayway.maven.plugins.android.generation2.samples.libraryprojects.aarFromApklib;

import com.jayway.maven.plugins.android.generation2.samples.libraryprojects.lib1.Lib1Class;

/**
 * Extends lib1Class from apklib1 to prove that we have compiled using apklib1 as a dependency.
 */
public class AarFromApklibClass extends Lib1Class {

    public String getString2() {
        return "String2";
    }
}
