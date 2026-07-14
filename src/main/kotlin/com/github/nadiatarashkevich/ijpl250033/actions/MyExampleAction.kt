package com.github.nadiatarashkevich.ijpl250033.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class MyExampleAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        Messages.showInfoMessage(e.project, "Hello from IJPL-250033 plugin!", "Example Action")
    }
}
