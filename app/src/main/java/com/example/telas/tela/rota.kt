package com.example.telas.tela

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.telas.principal

@Composable
fun rota() {
    val navController = rememberNavController()
    var cadLogin by rememberSaveable { mutableStateOf("") }
    var cadSenha by rememberSaveable { mutableStateOf("") }

    NavHost(navController = navController, startDestination = "login") {
        composable("login") { login(navController, cadLogin, cadSenha) }
        composable("cadastro") {cadastro(navController, { login, senha ->
            cadLogin = login
            cadSenha = senha
            navController.navigate("login")
        }) }
        composable("principal") { principal() }
    }
}
