package com.gilvano.pontointeligente.repositories

import com.gilvano.pontointeligente.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario, String> {
    fun findByEmail(email: String): Funcionario?
    fun findByCpf(cpf: String): Funcionario?
}