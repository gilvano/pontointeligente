package com.gilvano.pontointeligente.services.impl

import com.gilvano.pontointeligente.documents.Empresa
import com.gilvano.pontointeligente.repositories.EmpresaRepository
import com.gilvano.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {
    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)
}