package com.example.utawalasportsclub.ui.theme.screens.selling




import android.annotation.SuppressLint
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.utawalasportsclub.R
import com.example.utawalasportsclub.ui.theme.lightpink

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SellingScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState())


    ) {


        TopAppBar(
            title = {
                Text(text = "SHOP", fontFamily = FontFamily.Cursive, textAlign = TextAlign.Center)
            },

            colors = TopAppBarDefaults.mediumTopAppBarColors(lightpink)
        )

        Spacer(modifier = Modifier.height(20.dp))

        //search bar


        //end search bar



        Text(text = "Comming SOON")

        Row(
            modifier = Modifier
                .padding(start = 20.dp)
                .horizontalScroll(rememberScrollState())
        ) {
            Card(
                modifier = Modifier
                    .height(180.dp)
                    .width(200.dp)
            ) {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.img_18),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )


                }
            }
            // end of card 1

            Spacer(modifier = Modifier.width(20.dp))
            //card 2

            Card(
                modifier = Modifier
                    .height(180.dp)
                    .width(200.dp)
            ) {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            //card 3
            Card(
                modifier = Modifier
                    .height(180.dp)
                    .width(200.dp)
            ) {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            //card 4
            Card(
                modifier = Modifier
                    .height(180.dp)
                    .width(200.dp)
            ) {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.img_4),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //card 5
            Card(
                modifier = Modifier
                    .height(180.dp)
                    .width(200.dp)
            ) {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }

        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "What we have")

        Spacer(modifier = Modifier.height(10.dp))

        //Content Section
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 80.dp)
                .verticalScroll(rememberScrollState())

        ) {
            val mContext = LocalContext.current


            //start of row
            Row {
                Card(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                ) {

                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.img_6),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite, contentDescription = "",

                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(10.dp),
                            tint = Color.Cyan
                        )

                    }
                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "Adidas football",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold
                    )


                    Text(text = "best Property you can BUY")
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    Text(text = "54,780 reviews")

                    Row {
                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            shape = RoundedCornerShape(100.dp)

                        ) {

                            Text(text = "add to cart")
                        }


                        Text(text = "29000")
                    }



                }
            }
            Spacer(modifier = Modifier.height(10.dp))

            ///end of row
            Row {
                Card(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                ) {

                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.img_17),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite, contentDescription = "",

                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(10.dp),
                            tint = Color.Cyan
                        )

                    }
                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "Messi boots",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold
                    )


                    Text(text = "best Property you can BUY")
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    Text(text = "54,780 reviews")

                    Row {
                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            shape = RoundedCornerShape(100.dp)

                        ) {

                            Text(text = "add to cart")
                        }


                        Text(text = "6000")
                    }

                }
            }
            ///end of row

            Row {
                Card(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                ) {

                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.img_16),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite, contentDescription = "",

                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(10.dp),
                            tint = Color.Cyan
                        )

                    }
                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "CR7 boots",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold
                    )


                    Text(text = "best shoes you can buy")
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    Text(text = "54,780 reviews")

                    Row {
                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            shape = RoundedCornerShape(100.dp)

                        ) {

                            Text(text = "add to cart")
                        }


                        Text(text = "9000")
                    }

                }
            }
            ///end of row
            Row {
                Card(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                ) {

                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.img_15),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite, contentDescription = "",

                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(10.dp),
                            tint = Color.Cyan
                        )

                    }
                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "Mikasa football",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold
                    )


                    Text(text = "best you can buy")
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                       
                    }
                    Text(text = "54,780 reviews")

                    Row {
                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            shape = RoundedCornerShape(100.dp)

                        ) {

                            Text(text = "add to cart")
                        }


                        Text(text = "3000")
                    }

                }
            }
            ///end of row
            Row {
                Card(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                ) {

                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.img_9),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite, contentDescription = "",

                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(10.dp),
                            tint = Color.Cyan
                        )

                    }
                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "All Blacks ",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold
                    )


                    Text(text = "10% discount")
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    Text(text = "54,780 reviews")

                    Row {
                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            shape = RoundedCornerShape(100.dp)

                        ) {

                            Text(text = "add to cart")
                        }


                        Text(text = "65000")
                    }

                }
            }
            ///end of row
            Row {
                Card(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                ) {

                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.img_10),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite, contentDescription = "",

                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .padding(10.dp),
                            tint = Color.Cyan
                        )

                    }
                }
                Column(modifier = Modifier.padding(start = 20.dp)) {
                    Text(
                        text = "Wilson basketball",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold
                    )


                    Text(text = "IMPORTED",
                        

                        )
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Blue,
                            modifier = Modifier.size(20.dp)
                        )

                    }
                    Text(text = "54,780 reviews")

                    Row {
                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            shape = RoundedCornerShape(100.dp)

                        ) {

                            Text(text = "add to cart")
                        }


                        Text(text = "79000")
                    }

                }
            }
            ///end of row




        }

    }


}







@Composable
@Preview(showBackground = true)
fun SellingScreenPreview(){
    SellingScreen(rememberNavController())

}