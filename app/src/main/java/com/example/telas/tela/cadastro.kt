package com.example.telas.tela

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cadastro(navController: NavController, cadastrox: (String, String) -> Unit) {
    var loginx by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(14.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = loginx,
            onValueChange = { loginx = it },
            label = { Text("Login") },
            colors = androidx.compose.material3.TextFieldDefaults.textFieldColors(
                containerColor = Color.LightGray,
                cursorColor = Color.Black
            ),
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = senha,
            onValueChange = { senha = it },
            label = { Text("Senha") },
            colors = androidx.compose.material3.TextFieldDefaults.textFieldColors(
                containerColor = Color.LightGray,
                cursorColor = Color.Black
            ),
        )
        Spacer(modifier = Modifier.height(14.dp))
        Button(
            onClick = {
                cadastrox(loginx, senha)
                navController.navigate("login")
            },
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray,
                contentColor = Color.White
            )
        ) {
            Text("Cadastre e Bem-vinda!")
        }
    }
}
