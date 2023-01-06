package com.example


import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPluginLocal implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println("greeting hi local script $project.name")
    }
}
