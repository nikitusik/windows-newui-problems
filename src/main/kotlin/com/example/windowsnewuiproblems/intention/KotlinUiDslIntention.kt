package com.example.windowsnewuiproblems.intention

import com.example.windowsnewuiproblems.dialog.KotlinUiDslProblemDialog
import com.intellij.openapi.project.Project

class KotlinUiDslIntention : ProblemIntention() {
    override fun showDialog(project: Project) {
        KotlinUiDslProblemDialog(project).show()
    }

    override fun getFamilyName(): String = "Kotlin UI DSL Dialog"
}