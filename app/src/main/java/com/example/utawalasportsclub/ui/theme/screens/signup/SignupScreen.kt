package com.example.utawalasportsclub.ui.theme.screens.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.utawalasportsclub.R
import com.example.utawalasportsclub.data.AuthViewModel
import com.example.utawalasportsclub.navigation.ROUT_LOGIN


@Composable
fun SignupScreen(navController: NavController){


    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.img_1), contentScale = ContentScale.FillBounds)
        ,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "home",
            modifier = Modifier
                .size(200.dp)

            )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Magic Bricks",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.LightGray,
            fontWeight = FontWeight.ExtraLight
        )
        Spacer(modifier = Modifier.height(10.dp))

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confpassword by remember { mutableStateOf("") }

        OutlinedTextField(
            value =name  ,
            onValueChange = { name = it},
            label = { Text(text = "Enter full name")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.AccountBox, contentDescription = "", tint = Color.Black)   },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

            )

        OutlinedTextField(
            value =email  ,
            onValueChange = { email = it},
            label = { Text(text = "Enter Email ")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.AccountBox, contentDescription = "", tint = Color.Black)   },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        OutlinedTextField(
            value =password ,
            onValueChange = { password = it},
            label = { Text(text = "Enter password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = Color.Black)   },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )

        OutlinedTextField(
            value =confpassword ,
            onValueChange = { confpassword = it},
            label = { Text(text = "Confirm your Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = Color.Black)   },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)


        Button(onClick = {  authViewModel.signup(name, email, password,confpassword)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(100.dp)


        ) {
            Text(text = "Create an account")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            navController.navigate(ROUT_LOGIN)
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(100.dp)


        ) {
            Text(text = "Log in")

        }





    }


}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    SignupScreen(rememberNavController())

}

