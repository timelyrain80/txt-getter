package com.github.timelyrain80.txtgetter.services

import com.intellij.openapi.project.Project
import com.github.timelyrain80.txtgetter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
