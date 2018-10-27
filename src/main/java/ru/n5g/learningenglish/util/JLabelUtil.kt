package ru.n5g.learningenglish.util

import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JTextField

fun JComponent.followPositionX(): Int = x + width
fun JComponent.nextLineY(): Int = y + 20

@JvmOverloads
fun newLabel(text: String = "", positionX: Int, positionY: Int, isVisible: Boolean = true): JLabel {
    val jLabel = JLabel(text);
    val preferSize = jLabel.preferredSize
    jLabel.setBounds(positionX, positionY, preferSize.width, preferSize.height)
    jLabel.isVisible = isVisible
    return jLabel
}

fun newLabelNextLine(text: String, followComponent: JComponent, isVisible: Boolean = true) =
        newLabel(text, followComponent.x, followComponent.nextLineY(), isVisible)

@JvmOverloads
fun newLabelFollow(followComponent: JComponent, text: String, isVisible: Boolean, offset: Int = 5) =
        newLabel(text, followComponent.followPositionX() + offset, followComponent.y, isVisible)

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