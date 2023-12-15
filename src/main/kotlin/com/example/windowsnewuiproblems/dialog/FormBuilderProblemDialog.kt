package com.example.windowsnewuiproblems.dialog

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.ComboBox
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.components.JBLabel
import com.intellij.ui.components.JBTextField
import com.intellij.util.ui.FormBuilder
import javax.swing.JComponent

class FormBuilderProblemDialog(project: Project) : DialogWrapper(project) {
    init {
        init()
        title = "Form Builder Problem"
    }

    override fun createCenterPanel(): JComponent {
        val labelField = JBLabel("Label")
        val textField = JBTextField("Text")

        val comboBox = ComboBox(arrayOf(1, 2))
        return FormBuilder.createFormBuilder()
            .addComponent(labelField)
            .addComponent(comboBox)
            .addComponent(textField)
            .panel
    }
}