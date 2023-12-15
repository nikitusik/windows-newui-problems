package com.example.windowsnewuiproblems.dialog

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.dsl.builder.panel
import com.intellij.ui.dsl.gridLayout.HorizontalAlign
import java.awt.Dimension
import javax.swing.JComponent

class KotlinUiDslWithSizeProblemDialog(project: Project): DialogWrapper(project) {
    init {
        init()
        title = "Kotlin UI DSL Problem"
        contentPane.preferredSize = Dimension(600, 0)
    }

    override fun createCenterPanel(): JComponent = panel {
        row {
            checkBox("Test checkbox")
        }
        row("Test textField") {
            textField().horizontalAlign(HorizontalAlign.FILL)
        }
        row("Test combobox") {
            comboBox(listOf(1,2,3)).horizontalAlign(HorizontalAlign.FILL)
        }
    }
}