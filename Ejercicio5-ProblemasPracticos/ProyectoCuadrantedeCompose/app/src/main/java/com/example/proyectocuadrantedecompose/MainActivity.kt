package com.example.proyectocuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectocuadrantedecompose.ui.theme.ProyectoCuadrantedeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoCuadrantedeComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CuadranteCompose()
                }
            }
        }
    }
}

@Composable
fun TarjetaCuadrante(
    titulo: String,
    descripcion: String,
    colorFondo: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorFondo)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun CuadranteCompose() {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            TarjetaCuadrante(
                titulo = "Text composable",
                descripcion = "Displays text and allows you to style it with different fonts, sizes, and colors.",
                colorFondo = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            TarjetaCuadrante(
                titulo = "Image composable",
                descripcion = "Creates a composable that lays out and draws a given Painter class object.",
                colorFondo = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            TarjetaCuadrante(
                titulo = "Row composable",
                descripcion = "A layout composable that places its children in a horizontal sequence.",
                colorFondo = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            TarjetaCuadrante(
                titulo = "Column composable",
                descripcion = "A layout composable that places its children in a vertical sequence.",
                colorFondo = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun VistaPreviaCuadrante() {
    ProyectoCuadrantedeComposeTheme {
        CuadranteCompose()
    }
}
