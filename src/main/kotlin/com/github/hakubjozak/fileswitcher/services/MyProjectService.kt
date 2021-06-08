package com.github.hakubjozak.fileswitcher.services

import com.github.hakubjozak.fileswitcher.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
