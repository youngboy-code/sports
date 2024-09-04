package com.example.utawalasportsclub.ui.theme.screens.bookings

import android.content.Intent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.Color
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.foundation.Image
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.utawalasportsclub.ui.theme.lightpink
import com.example.utawalasportsclub.R
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookingScreen(navController: NavController){


    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState())


    ) {


        TopAppBar(
            title = {
                Text(text = "BOOKINGS", fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center)
            },

            colors = TopAppBarDefaults.mediumTopAppBarColors(lightpink)
        )

        Text(text = "Passing Drills", textAlign = TextAlign.Center,
            fontSize = 25.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.LightGray
            )

        val mContext = LocalContext.current

        Row {
            Card(
                modifier = Modifier
                    .height(180.dp)
                    .width(200.dp)
            ) {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.coach1),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )



                }
            }
            Column(modifier = Modifier.padding(start = 10.dp)) {
                Text(
                    text = "Coach kim",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold
                )


                Text(text = "Book am appointment with coach Kim for personal training in a football pitch to enhance your passing skills")

                Text(text = "Best in the field")

                Spacer(modifier = Modifier.height(8.dp))





                    Text(text = "speak to our agent to book", textAlign = TextAlign.Center)
                    Button(onClick = {
                        val callIntent=Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0720245837".toUri()
                        mContext.startActivity(callIntent)
                    },
                        colors = ButtonDefaults.buttonColors(Color.Red),
                        shape = RoundedCornerShape(70.dp)

                    ) {
                        Text(text = "Call")


                    }











            }
        }
        Spacer(modifier = Modifier.height(10.dp))

        ///end of row






    }


}

@Composable
@Preview(showBackground = true)
fun BookingScreenPreview(){
    BookingScreen(rememberNavController())

}