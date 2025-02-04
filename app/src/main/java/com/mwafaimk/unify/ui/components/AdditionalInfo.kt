package com.mwafaimk.unify.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mwafaimk.unify.R

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.Text
import com.mwafaimk.unify.data.model.post.PostDetails

@Composable
fun AdditionalInfo(postData: PostDetails) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = postData.time?:"Any time",
            fontSize = 13.sp,
            color = Color.Black,
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = postData.memberCount?:"Jitnay zyada utna acha",
            fontSize = 13.sp,
            color = Color.Black
        )
      //  Spacer(modifier = Modifier.width(30.dp))


        // Adding the "🔗" ASCII character as a button
//        TextButton(
//            onClick = {
//                // Handle button click here
//            },
//            modifier = Modifier.size(30.dp) // Optional: Adjust size
//        ) {
//            Text(
//                text = "\uD83D\uDD17",
//                fontSize = 16.sp,
//                color = Color.Red // Ensures the character is visible
//            )
//        }
    }
}