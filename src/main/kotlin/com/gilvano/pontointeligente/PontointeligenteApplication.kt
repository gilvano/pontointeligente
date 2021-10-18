package com.gilvano.pontointeligente

import com.gilvano.pontointeligente.documents.Empresa
import com.gilvano.pontointeligente.documents.Funcionario
import com.gilvano.pontointeligente.enums.PerfilEnum
import com.gilvano.pontointeligente.repositories.EmpresaRepository
import com.gilvano.pontointeligente.repositories.FuncionarioRepository
import com.gilvano.pontointeligente.utils.SenhaUtils
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PontointeligenteApplication(val empresaRepository: EmpresaRepository,
val funcionarioRepository: FuncionarioRepository): CommandLineRunner {
	override fun run(vararg args: String?) {
		empresaRepository.deleteAll()
		funcionarioRepository.deleteAll()

		val empresa = Empresa("Empresa", "10443887000146")
		val novaEmpresa = empresaRepository.save(empresa)

		val admin = Funcionario("Admin", "admin@empresa.com", SenhaUtils().gerarBCrypt("123456"),
			"25708317000", PerfilEnum.ROLE_ADMIN, novaEmpresa.id!!)
		val novoAdmin = funcionarioRepository.save(admin)

		val funcionario = Funcionario("Funcionario", "funcionario@empresa.com", SenhaUtils().gerarBCrypt("123456"),
			"44325441557", PerfilEnum.ROLE_USUARIO, novaEmpresa.id!!)
		val novoFuncionario = funcionarioRepository.save(funcionario)

		println("Empresa id: ${novaEmpresa.id}")
		println("Admin id: ${novoAdmin.id}")
		println("Funcionario id: ${novoFuncionario.id}")

	}
}

fun main(args: Array<String>) {
	runApplication<PontointeligenteApplication>(*args)
}
