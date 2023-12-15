package com.example.windowsnewuiproblems.intention

import com.example.windowsnewuiproblems.dialog.KotlinUiDslWithSizeProblemDialog
import com.intellij.openapi.project.Project

class KotlinUiDslWithSizeIntention : ProblemIntention() {
    override fun showDialog(project: Project) {
        KotlinUiDslWithSizeProblemDialog(project).show()
    }

    override fun getFamilyName(): String = "Kotlin UI DSL With Size Dialog"
}