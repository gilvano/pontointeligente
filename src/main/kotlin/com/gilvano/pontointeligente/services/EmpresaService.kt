package com.gilvano.pontointeligente.services

import com.gilvano.pontointeligente.documents.Empresa

interface EmpresaService {
    fun buscarPorCnpj(cnpj: String): Empresa?
    fun persistir(empresa: Empresa): Empresa
}