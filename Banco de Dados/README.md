# 📍 Variáveis do código

<h3> 👤  Tabela Hospedes  </h3>
🔑 id_hospedes 
- nome_completo 
- dt_nascimento 
- endereço
- telefone
- email 
- cpf 

<h3> 👤  Tabela Funcionarios  </h3>
🔑 id_funcionario
- nome_completo 
- cargo 
- telefone
- id_reservas 
	

<h3> 👤  Tabela Tipo Quarto  </h3>
🔑 id_tipo 
- caracteristica 
- descrição 
- capacidade 
- preço_noite 
	
<h3> 👤  Tabela Quarto  </h3>
🔑 id_quarto 
- num_quarto
- tipo 
- preço 
- 🔑 id_tipo 

<h3> 👤  Tabela Reservas  </h3>
🔑 id_reservas
- data_checkin 
- data_checkout
- status 
- 🔑 id_hospedes 
- 🔑 id_funcionario 
- 🔑 id_quarto 

</hr>

# 📍 Cardinalidades

<h5> Hóspedes </h5>
Cada hóspede pode ter várias reservas associadas a ele, mas uma reserva é feita por apenas um hóspede.
Portanto, a cardinalidade entre Hóspedes e Reservas é "1 para muitos".

</br>

<h5> Funcionários </h5>
A relação entre funcionários e reservas como estamos definindo qual funcionário irá fazer a
reserva específica, a cardinalidade seria "1 para 1".

</br>

<h5> Reservas </h5>
Cada reserva está associada a um único hóspede, mas um hóspede pode ter várias reservas.
Portanto, a cardinalidade entre Reservas e Hóspedes é "muitos para 1".

</br>

<h5> Quartos </h5>
Cada quarto está associado a uma única reserva, mas uma reserva pode ter vários quartos
associados a ela. Portanto, a cardinalidade entre Quartos e Reservas é "muitos para 1".

</br>

<h5> Tipos de Quarto </h5>
Vários quartos podem ser do mesmo tipo, mas um tipo de quarto pode ser associado a um quarto.
Portanto, a cardinalidade entre Tipos de Quarto e Quartos da Reserva é "muitos para muitos".

