package com.gilvano.pontointeligente.services

import com.gilvano.pontointeligente.documents.Funcionario

interface FuncionarioService {
    fun persistir(funcionario: Funcionario): Funcionario
    fun buscarPorCpf(cpf: String): Funcionario?
    fun buscarPorEmail(email: String): Funcionario?
    fun buscarPorId(id: String): Funcionario?
}