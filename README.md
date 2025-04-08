# 💼 desafio-itau-backend

API REST desenvolvida como solução para o **Desafio de Programação do Itaú Unibanco**, com foco em transações financeiras e cálculo de estatísticas em tempo real. O projeto foi desenvolvido em **Java com Spring Boot**, utilizando dados armazenados apenas **em memória**, sem uso de banco de dados.


## 📋 Sobre o desafio

O objetivo do desafio é construir uma API capaz de:

- Receber transações contendo valor e data/hora.
- Calcular estatísticas com base nas transações realizadas nos últimos 60 segundos.
- Limpar as transações armazenadas.
  
Tudo isso respeitando uma série de restrições técnicas — como uso exclusivo de JSON, persistência em memória, e validações rígidas de entrada.

---
### ▶️ Passos para rodar localmente

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/desafio-itau-backend.git
cd desafio-itau-backend

# Compilar o projeto
./mvnw clean install

# Rodar a aplicação
./mvnw spring-boot:run
```

A aplicação ficará disponível em:  
📍 `http://localhost:8080` ou `http://localhost:8080/swagger-ui/index.html`

---

## 📄 Licença

Projeto desenvolvido como parte do **desafio técnico do Itaú Unibanco**. Uso livre para fins educacionais.

---

## 🙋‍♂️ Autor

Huan Salomao  
[LinkedIn](https://www.linkedin.com/in/huansalomao/)
