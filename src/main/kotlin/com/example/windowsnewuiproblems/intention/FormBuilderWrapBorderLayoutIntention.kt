package com.example.windowsnewuiproblems.intention

import com.example.windowsnewuiproblems.dialog.FormBuilderWrapBorderLayoutProblemDialog
import com.intellij.openapi.project.Project

class FormBuilderWrapBorderLayoutIntention : ProblemIntention() {
    override fun showDialog(project: Project) {
        FormBuilderWrapBorderLayoutProblemDialog(project).show()
    }

    override fun getFamilyName(): String = "Form Builder Wrap Border Layout Dialog"
}