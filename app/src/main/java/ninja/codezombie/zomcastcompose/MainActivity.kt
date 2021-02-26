package ninja.codezombie.zomcastcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ninja.codezombie.zomcastcompose.ui.theme.ZomCastComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBox()
        }
    }
}



@Preview
@Composable
fun MyBox(){
    Column (modifier = Modifier.fillMaxSize().background(Color.Gray), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier.background(Color.Red).padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.my_image),
                contentDescription = "My Image",
                modifier = Modifier.clip(RoundedCornerShape(10.dp)).border(2.dp, Color.Black)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {}) {
            Text("Click")
        }
    }
    
}