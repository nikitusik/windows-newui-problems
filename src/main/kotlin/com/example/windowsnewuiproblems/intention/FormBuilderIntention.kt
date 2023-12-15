package com.example.windowsnewuiproblems.intention

import com.example.windowsnewuiproblems.dialog.FormBuilderProblemDialog
import com.example.windowsnewuiproblems.dialog.FormBuilderWrapBorderLayoutProblemDialog
import com.intellij.openapi.project.Project

class FormBuilderIntention : ProblemIntention() {
    override fun showDialog(project: Project) {
        FormBuilderProblemDialog(project).show()
    }

    override fun getFamilyName(): String = "Form Builder Dialog"
}