package com.mwafaimk.unify.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mwafaimk.unify.core.navigation.NavRoutes
import com.mwafaimk.unify.ui.pages.signIn.viewModel.SignInViewModel

@Composable

fun EditProfileButton(onNavigate: (String) -> Unit , viewModel: SignInViewModel = hiltViewModel())
{
    Button(
        onClick = { onNavigate(NavRoutes.EditProfile) },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
        modifier = Modifier.fillMaxWidth(0.8f)
    ) {
        Text(
            text = "edit profile",
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewEditProfileButton() {
    //EditProfileButton()
}
