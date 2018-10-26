package ru.n5g.learningenglish.util

import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JTextField

fun JComponent.followPositionX(): Int = x + width + 5
fun JComponent.nextLineY(): Int = y + 20

@JvmOverloads
fun newLabel(text: String, positionX: Int, positionY: Int, isVisible: Boolean = true): JLabel {
    val jLabel = JLabel(text);
    val preferSize = jLabel.preferredSize
    jLabel.setBounds(positionX, positionY, preferSize.width, preferSize.height)
    jLabel.isVisible = isVisible
    return jLabel
}

fun newLabelNextLine(text: String, followComponent: JComponent, isVisible: Boolean = true) =
        newLabel(text, followComponent.x, followComponent.nextLineY(), isVisible)

@JvmOverloads
fun newLabelFollow(text: String, followComponent: JComponent, isVisible: Boolean = true) =
        newLabel(text, followComponent.followPositionX(), followComponent.y, isVisible)

@JvmOverloads
fun newTextFieldFollow(text: String = "", with: Int, followComponent: JComponent): JTextField {
    val plusHeight = if (followComponent is JTextField) 0 else 10

    val jTextField = JTextField(text)
    jTextField.setBounds(
            followComponent.followPositionX(),
            followComponent.y - (plusHeight / 2),
            with,
            followComponent.height + plusHeight
    );
    return jTextField
}