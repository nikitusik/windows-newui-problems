package com.example.windowsnewuiproblems.intention

import com.intellij.codeInsight.intention.impl.BaseIntentionAction
import com.intellij.icons.AllIcons
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Iconable
import com.intellij.psi.PsiFile
import javax.swing.Icon

abstract class ProblemIntention: BaseIntentionAction(), Iconable {

    override fun getText(): String = familyName

    override fun isAvailable(project: Project, editor: Editor?, file: PsiFile?): Boolean = true

    override fun invoke(project: Project, editor: Editor?, file: PsiFile?) {
        showDialog(project)
    }

    abstract fun showDialog(project: Project)

    override fun getIcon(flags: Int): Icon = AllIcons.Scope.Problems

    override fun startInWriteAction(): Boolean = false
}