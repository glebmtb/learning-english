package ru.n5g.learningenglish.util

import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JTextField

fun JComponent.followPositionX(): Int = x + width
fun JComponent.nextLineY(): Int = y + 20

@JvmOverloads
fun newLabel(text: String = "",
             positionX: Int,
             positionY: Int,
             isVisible: Boolean = true,
             listenerChangeText: () -> Unit = { }): JLabel {
    val jLabel = object : JLabel(text) {
        override fun setText(text: String) {
            super.setText(text)
            listenerChangeText()
        }
    }

    val preferSize = jLabel.preferredSize
    jLabel.setBounds(positionX, positionY, preferSize.width, preferSize.height)
    jLabel.isVisible = isVisible
    return jLabel
}

fun newLabelNextLine(text: String, followComponent: JComponent, isVisible: Boolean = true) =
        newLabel(text, followComponent.x, followComponent.nextLineY(), isVisible)

fun newLabelFollow(followComponent: JComponent, text: String, isVisible: Boolean,
                   listenerChangeText: () -> Unit = { }) =
        newLabelFollow(followComponent, text, isVisible, 5, listenerChangeText)

@JvmOverloads
fun newLabelFollow(followComponent: JComponent, text: String, isVisible: Boolean, offset: Int = 5,
                   listenerChangeText: () -> Unit = { }) =
        newLabel(text, followComponent.followPositionX() + offset, followComponent.y, isVisible, listenerChangeText)


fun resizeElements(vararg followComponent: JComponent) {

    for ((i, c) in followComponent.filter { it != null }.withIndex()) {
        c.size = c.preferredSize
        if (i != 0) c.locationFollow(followComponent[i - 1])
    }
}

@JvmOverloads
fun newTextFieldFollow(text: String = "", with: Int, followComponent: JComponent, offset: Int = 5): JTextField {
    val plusHeight = if (followComponent is JTextField) 0 else 10

    val jTextField = JTextField(text)
    jTextField.setBounds(
            followComponent.followPositionX() + offset,
            followComponent.y - (plusHeight / 2),
            with,
            followComponent.height + plusHeight
    );
    return jTextField
}

@JvmOverloads
fun JComponent.locationFollow(followComponent: JComponent, offset: Int = 5) =
        setLocation(followComponent.followPositionX() + offset, followComponent.y)