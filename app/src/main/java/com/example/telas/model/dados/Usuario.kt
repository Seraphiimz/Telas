package com.example.telas.model.dados

import com.google.firebase.firestore.DocumentId

data class Usuario(
    @DocumentId var id: String = "",
    var loginx: String = "",
    var senha: String = ""
)
