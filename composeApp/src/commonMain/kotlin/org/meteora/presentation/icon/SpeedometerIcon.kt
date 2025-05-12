package org.meteora.presentation.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SpeedometerIcon: ImageVector
    get() {
        if (_SpeedometerIcon != null) {
            return _SpeedometerIcon!!
        }
        _SpeedometerIcon = ImageVector.Builder(
            name = "Speedometer",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 2f)
                arcToRelative(
                    0.5f,
                    0.5f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    0.5f,
                    0.5f
                )
                verticalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 0f)
                verticalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 2f)
                moveTo(3.732f, 3.732f)
                arcToRelative(
                    0.5f,
                    0.5f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    0.707f,
                    0f
                )
                lineToRelative(0.915f, 0.914f)
                arcToRelative(
                    0.5f,
                    0.5f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    -0.708f,
                    0.708f
                )
                lineToRelative(-0.914f, -0.915f)
                arcToRelative(
                    0.5f,
                    0.5f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    0f,
                    -0.707f
                )
                moveTo(2f, 8f)
                arcToRelative(
                    0.5f,
                    0.5f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    0.5f,
                    -0.5f
                )
                horizontalLineToRelative(1.586f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 8f)
                moveToRelative(9.5f, 0f)
                arcToRelative(
                    0.5f,
                    0.5f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    0.5f,
                    -0.5f
                )
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1f)
                horizontalLineTo(12f)
                arcToRelative(
                    0.5f,
                    0.5f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -0.5f,
                    -0.5f
                )
                moveToRelative(0.754f, -4.246f)
                arcToRelative(
                    0.39f,
                    0.39f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.527f,
                    -0.02f
                )
                lineTo(7.547f, 7.31f)
                arcTo(0.91f, 0.91f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.85f, 8.569f)
                lineToRelative(3.434f, -4.297f)
                arcToRelative(
                    0.39f,
                    0.39f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.029f,
                    -0.518f
                )
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.664f, 15.889f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.336f, 0.11f)
                arcToRelative(
                    8f,
                    8f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -2.672f,
                    15.78f
                )
                close()
                moveToRelative(-4.665f, -4.283f)
                arcTo(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 10f)
                curveToRelative(2.186f, 0f, 4.236f, 0.585f, 6.001f, 1.606f)
                arcToRelative(
                    7f,
                    7f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    -12.002f,
                    0f
                )
            }
        }.build()
        return _SpeedometerIcon!!
    }

private var _SpeedometerIcon: ImageVector? = null
