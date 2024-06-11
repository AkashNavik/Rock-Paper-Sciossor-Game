package com.akashnavik.rock_paper_scissor.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akashnavik.rock_paper_scissor.R

@Composable
fun Screen(){
    var userImg by remember {
        mutableStateOf(R.drawable.u_1)
    }
    var botImg by remember {
        mutableStateOf(R.drawable.u_1)
    }
    var result by remember {
        mutableStateOf("")
    }
    var uScore by remember {
        mutableStateOf(0)
    }
    var cScore by remember {
        mutableStateOf(0)
    }
    var bgcol by remember {
        mutableStateOf(Color.LightGray)
    }
    var usbg by remember {
        mutableStateOf(Color.LightGray)
    }
    var Start by remember {
        mutableStateOf(false)
    }
    var userIn :String
    var botIn:String




    
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(4.dp)
        , horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Center
    ) {

        Image(painter = painterResource(id = R.drawable.icon), contentDescription = null)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                Image(painter = painterResource(id = R.drawable.title), contentDescription = null
                    , modifier = Modifier.size(width = 450.dp , height = 75.dp))
            }
            Spacer(modifier = Modifier.padding(8.dp))

        if(Start) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "User:${uScore}", fontSize = 30.sp, fontWeight = FontWeight.ExtraBold
                    )
                }
                Column {
                    Text(
                        text = "Bot:${cScore}", fontSize = 30.sp, fontWeight = FontWeight.ExtraBold
                    )
                }
            }

            Spacer(modifier = Modifier.padding(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly

            ) {
                Card(
                    modifier = Modifier
                        .size(150.dp)
                        .shadow(elevation = 10.dp), colors = CardDefaults.cardColors(usbg)
                ) {
                    Image(painter = painterResource(id = userImg), contentDescription = "")
                }
                Column {
                    Text(
                        text = "VS",
                        fontSize = 50.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = FontFamily.SansSerif,
                        fontStyle = FontStyle.Italic
                    )
                }
                Card(
                    modifier = Modifier
                        .size(150.dp)
                        .shadow(elevation = 10.dp), colors = CardDefaults.cardColors(bgcol)
                ) {
                    Image(painter = painterResource(id = botImg), contentDescription = "")
                }
            }

            Spacer(modifier = Modifier.padding(5.dp))

            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = result, fontSize = 30.sp, fontWeight = FontWeight.ExtraBold
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            )
            {
                Button(onClick = {
                    userIn = "rock"
                    usbg = Color(241, 84, 129)
                    userImg = R.drawable.u_2
                    var ran = kotlin.random.Random.nextInt(1, 4)
                    var comp = if (ran == 1) {
                        botIn = "rock"
                        bgcol = Color(241, 84, 129)
                        botImg = R.drawable.u_2
                    } else if (ran == 2) {
                        bgcol = Color(255, 222, 83)
                        botIn = "paper"
                        botImg = R.drawable.u_1
                    } else {
                        bgcol = Color(127, 207, 218)
                        botIn = "scissor"
                        botImg = R.drawable.u_3
                    }
                    if (userIn.equals(botIn)) {
                        result = "Draw"
                    } else if (botIn == "scissor") {
                        uScore++
                        result = "User Win"
                    } else {
                        cScore++
                        result = "Bot Win"
                    }


                }) {
                    Text(text = "Rock")
                }
                Button(onClick = {
                    userIn = "paper"
                    usbg = Color(255, 222, 83)
                    userImg = R.drawable.u_1
                    var ran = kotlin.random.Random.nextInt(1, 4)
                    var comp = if (ran == 1) {
                        botIn = "rock"
                        bgcol = Color(241, 84, 129)
                        botImg = R.drawable.u_2
                    } else if (ran == 2) {
                        bgcol = Color(255, 222, 83)
                        botIn = "paper"
                        botImg = R.drawable.u_1
                    } else {
                        bgcol = Color(127, 207, 218)
                        botIn = "scissor"
                        botImg = R.drawable.u_3
                    }
                    if (userIn.equals(botIn)) {
                        result = "Draw"
                    } else if (botIn == "scissor") {
                        uScore++
                        result = "User Win"
                    } else {
                        cScore++
                        result = "Bot Win"
                    }

                }) {
                    Text(text = "Paper")
                }
                Button(onClick = {
                    userIn = "scissor"
                    usbg = Color(127, 207, 218)
                    userImg = R.drawable.u_3
                    var ran = kotlin.random.Random.nextInt(1, 4)
                    var comp = if (ran == 1) {
                        botIn = "rock"
                        bgcol = Color(241, 84, 129)
                        botImg = R.drawable.u_2
                    } else if (ran == 2) {
                        bgcol = Color(255, 222, 83)
                        botIn = "paper"
                        botImg = R.drawable.u_1
                    } else {
                        bgcol = Color(127, 207, 218)
                        botIn = "scissor"
                        botImg = R.drawable.u_3
                    }

                    if (userIn.equals(botIn)) {
                        result = "Draw"
                    } else if (botIn == "scissor") {
                        uScore++
                        result = "User Win"
                    } else {
                        cScore++
                        result = "Bot Win"
                    }

                }) {
                    Text(text = "Scissor")
                }
            }
        }else{
            Start = false
        }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp, end = 32.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Button(onClick = { Start  = !Start
                    if(!Start){
                        uScore = 0
                        cScore = 0
                        botImg = R.drawable.u_2
                        userImg = R.drawable.u_2
                        result = ""
                        bgcol =Color.LightGray
                        usbg=Color.LightGray
                    }
                                 }, modifier = Modifier.fillMaxWidth()) {
                    Text(text = if (Start) "Back" else "Start")
                }
            }
    }

}
