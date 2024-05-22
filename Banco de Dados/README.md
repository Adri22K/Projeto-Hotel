# 📍 Variáveis do código


<h1> 👤  Tabela Hospedes  </h1>

🔑 id_hospedes 
- nome_completo 
- dt_nascimento 
- endereço
- telefone
- email 
- cpf 

<h1> 👤  Tabela Funcionarios  </h1>

🔑 id_funcionario
- nome_completo 
- cargo 
- telefone
- id_reservas 
	

<h1> 👤  Tabela Tipo Quarto  </h1>

🔑 id_tipo 
- caracteristica 
- descrição 
- capacidade 
- preço_noite 
	
<h1> 👤  Tabela Quarto  </h1>

🔑 id_quarto 
- num_quarto
- tipo 
- preço 
🔑 id_tipo 

<h1> 👤  Tabela Reservas  </h1>
	
🔑 id_reservas
- data_checkin 
- data_checkout
- status 
🔑 id_hospedes 
🔑 id_funcionario 
🔑 id_quarto 
