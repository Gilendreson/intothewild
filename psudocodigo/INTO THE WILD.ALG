Algoritmo "Into The Wild".
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Denis Cople
// Descri��o   : Cadastro dos clientes, cadastro dos destinos e consulta.
// Autor(a)    : Gilendreson Ribeiro de Ara�jo
// Data atual  : 11/07/2022
Var
// Se��o de Declara��es das vari�veis 
   clientes, destinos: vetor [1..6] de caractere
   procurar: caractere
   opcao, i: inteiro
   encontrou: logico

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 

procedimento cadastrarClientes
inicio
      escreval("Cadastre 06 clientes: ")
      para i de 1 ate 6 passo 1 faca
   	      limpatela
		escreval("Cadastre o cliente de numero:", i)
		leia(clientes[i])
		escreval("")
      fimpara
fimprocedimento

procedimento cadastrarDestinos
inicio
      escreval("Cadastre 06 destinos: ")
      para i de 1 ate 6 passo 1 faca
            limpatela
		escreval("Cadastre o destino de n�mero:", i)
		leia(destinos[i])
		escreval("")
      fimpara
fimprocedimento

procedimento pesquisarCLiente
inicio
      limpatela
      encontrou <- falso
      escreval("Pesquise um cliente: ")
      leia(procurar)
      para i de 1 ate 6 passo 1 faca
           se procurar = clientes[i] entao
                      encontrou <- verdadeiro
           fimse
      fimpara

      se encontrou = verdadeiro entao
           escreval("O cliente ", procurar, " foi encontrado")
           escreval("")
      senao
           escreval("Cliente ", procurar, " n�o encontrado")
           escreval("")
      fimse
fimprocedimento

procedimento pesquisarDestino
inicio
      limpatela
      encontrou <- falso
      escreval("Procure por um destino: ")
      leia(procurar)
      para i de 1 ate 6 passo 1 faca
           se procurar = destinos[i] entao
               encontrou <- verdadeiro
           fimse
      fimpara

      se encontrou = verdadeiro entao
           escreval("O destino ", procurar, " foi encontrado")
           escreval("")
      senao
           escreval("N�o encontramo o destino: ", procurar)
           escreval("")
      fimse
fimprocedimento



repita
      escreval("Escolha uma op��o para continuar e aperte Enter:")
		escreval("Digite 1 para Cadastrar Clientes")
		escreval("Digite 2 para Cadastrar Destinos")
		escreval("Digite 3 para Pesquisar Cliente")
		escreval("Digite 4 para Pesquisar Destino")
		escreval("Digite 0 para Sair")
      leia(opcao)
      escolha opcao
              caso 1
                   cadastrarClientes
              caso 2
                   cadastrarDestinos
              caso 3
                   pesquisarCliente
              caso 4
                   pesquisarDestino
              caso 0
                   escreval("Obrigado por usar nosso sistema. Tchao!")
              outrocaso
                   escreval("Digite uma op��o valida.")
      fimescolha
ate opcao = 0



Fimalgoritmo