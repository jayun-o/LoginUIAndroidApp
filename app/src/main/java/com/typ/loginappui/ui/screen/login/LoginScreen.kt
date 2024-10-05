package com.typ.loginappui.ui.screen.login

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.typ.loginappui.R
import androidx.compose.ui.unit.dp
import com.typ.loginappui.ui.theme.PrimaryPink
import com.typ.loginappui.ui.theme.PrimaryPinkBlended
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.runtime.setValue
import com.typ.loginappui.ui.theme.DarkTextColor
import androidx.compose.material3.Icon
import androidx.compose.ui.text.input.PasswordVisualTransformation
import com.typ.loginappui.ui.components.ActionButton
import com.typ.loginappui.ui.theme.PrimaryPinkDark
import com.typ.loginappui.ui.theme.PrimaryPinkLight
import com.typ.loginappui.ui.theme.PrimaryYellowDark
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.Canvas
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to PrimaryPinkBlended,
                    1f to PrimaryPink
                )
            )
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Image(
            painter = painterResource(R.drawable.img_coder_m),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(start = 30.dp)
        )
        Message(
            title = "Welcome back!",
            subtitle = "Please, Log in."
        )
        Spacer(modifier = Modifier.height(8.dp))
        InputField(
            leadingIconRes = R.drawable.ic_person,
            placeholderText = "Your email",
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        InputField(
            leadingIconRes = R.drawable.ic_key,
            placeholderText = "Password",
            visualTransformation = PasswordVisualTransformation(),//hide password
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        ActionButton(
            text = "Next",
            isNavigationArrowVisible = true,
            onClicked = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryPinkDark,
                contentColor = Color.White
            ),
            shadowColor = PrimaryPinkDark,
            modifier = Modifier.padding(24.dp)
        )
        Separator(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .height(62.dp)
        )
        ActionButton(
            text = "Next",
            isNavigationArrowVisible = false,
            onClicked = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryPinkLight,
                contentColor = Color.White
            ),
            shadowColor = PrimaryPinkDark,
            modifier = Modifier.padding(24.dp)
        )
    }
}

@Composable
private fun Message(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String
) {
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ){
        Text(
            text = title,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = subtitle,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            fontWeight = FontWeight.Black
        )
    }
}

@Composable
private fun InputField(
    modifier: Modifier = Modifier,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    @DrawableRes leadingIconRes: Int,
    placeholderText: String

) {
    var inputValue by remember { mutableStateOf("") }

    TextField(
        modifier = modifier
            .fillMaxWidth()
            .height(62.dp),
        value = inputValue,
        onValueChange = { inputValue = it },
        visualTransformation = visualTransformation,
        singleLine = true,
        shape = RoundedCornerShape(percent = 50),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            focusedTextColor = DarkTextColor,
            unfocusedTextColor = DarkTextColor,
            unfocusedPlaceholderColor = DarkTextColor,
            focusedPlaceholderColor = DarkTextColor,
            focusedLeadingIconColor = DarkTextColor,
            unfocusedLeadingIconColor = DarkTextColor,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White

        ),
        textStyle = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.Medium
        ),
        leadingIcon = {
            Icon(
                painter = painterResource(leadingIconRes),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        },
        placeholder = {
            Text(text = placeholderText)
        }
    )
}

@Composable
private fun Separator(
    modifier: Modifier = Modifier
) {
    Row (
        modifier =modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        DashedLine(
            modifier = Modifier.weight(weight = 1f)
        )
        Text(
            text = "Or",
            style = MaterialTheme.typography.labelMedium,
            color = Color.White
        )
        DashedLine(
            modifier = Modifier.weight(weight = 1f)
        )
    }
}

@Composable
private fun DashedLine(
    modifier: Modifier = Modifier
) {
    Canvas(modifier = modifier){
        drawLine(
            color = Color.White,
            start = Offset(0f, 0f),
            end = Offset(size.width, 0f),
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(8f,8f), 0f),
            cap = StrokeCap.Round,
            strokeWidth = 1.dp.toPx()

        )
    }
}