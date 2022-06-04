package com.example.demo.view

import com.github.sarxos.webcam.Webcam
import javafx.scene.control.Alert
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root =vbox {
        paddingAll = 40
            button("test_cam"){
                action{
                    val webcam = Webcam.getDefault()
                    if (webcam != null) {
                        alert(Alert.AlertType.INFORMATION,"Webcam", "Webcam:  ${webcam.name }")
                    } else {
                        alert(Alert.AlertType.INFORMATION,"Webcam", "Webcam not found")
                    }
                }
            }
    }
}