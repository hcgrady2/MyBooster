package com.hc.demoplugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

public class PluginImpl implements Plugin<Project>{

    void apply(Project project){
        System.out.println("========================");
        System.out.println("hello my first plugin......!");
        System.out.println("========================");

        //addListener 与 registerTransfrom 好像是不能同时使用
     //   project.gradle.addListener(new TaskListener())

//        //使用自己的 transform

        def android = project.extensions.getByType(AppExtension)
        println('--------------- registering AutoTrackTransform ------------------')
        InsertTransform transform = new InsertTransform()
        android.registerTransform(transform)


    }
}