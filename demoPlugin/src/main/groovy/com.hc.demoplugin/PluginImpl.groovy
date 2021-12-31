package com.hc.demoplugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

public class PluginImpl implements Plugin<Project>{

    void apply(Project project){
        System.out.println("========================");
        System.out.println("hello my first plugin......!");
        System.out.println("========================");
    }
}