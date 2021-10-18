package com.gilvano.pontointeligente.DTOs

data class EmpresaDto (
        val razaoSocial: String,
        val cnpj: String,
        val id: String? = null
)
