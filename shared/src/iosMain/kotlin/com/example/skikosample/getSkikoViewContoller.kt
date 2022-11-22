package com.example.skikosample

import platform.UIKit.UIViewController
import org.jetbrains.skiko.*

fun getSkikoViewContoller(): UIViewController = SkikoViewController(
    SkikoUIView(
        SkiaLayer().apply {
            gesturesToListen = SkikoGestureEventKind.values()
            skikoView = GenericSkikoView(this, ShaderSample(this))
        }
    )
)
