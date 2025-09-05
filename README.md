# 🚀 API de Cadastro de Leads - SNCT

API RESTFull desenvolvida para atender o **cadastro de leads** na **Semana Nacional de Ciência e Tecnologia (SNCT)**.  
Construída sob orientação do professor **Rômulo C. Silvestre**, o projeto foi desenvolvido em equipe durante as disciplinas de **Teste de Software, Implementação de Sistemas e Modelagem de Sistemas**, aplicando conceitos práticos de engenharia de software.

---

## 🛠️ Tecnologias Utilizadas

<p align="left">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" title="Java" width="30" />&nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" title="Spring Boot" width="30" />&nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" title="MySQL" width="30" />&nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/hibernate/hibernate-original.svg" title="Hibernate" width="30" />&nbsp;
  <img src="https://img.icons8.com/color/48/flyway.png" title="Flyway" width="30" />&nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg" title="Git" width="30" />&nbsp;
</p>

---

## 📂 Estrutura do Projeto

```

📦 api-leads-snct
┣ 📂 src
┃ ┣ 📂 main
┃ ┃ ┣ 📂 java
┃ ┃ ┃ ┗ 📂 br.com.senai.leads
┃ ┃ ┃ ┃ ┣ 📂 controller
┃ ┃ ┃ ┃ ┣ 📂 service
┃ ┃ ┃ ┃ ┣ 📂 repository
┃ ┃ ┃ ┃ ┗ 📂 model
┃ ┃ ┗ 📂 resources
┃ ┃ ┃ ┣ application.properties
┃ ┃ ┃ ┗ db/migration (📌 scripts Flyway)
┣ 📜 pom.xml
┗ 📜 README.md

````

---

## ⚡ Como Executar o Projeto

### ✅ Pré-requisitos
Antes de começar, você precisa ter instalado em sua máquina:
- [Java 17+](https://adoptium.net/) ☕
- [Maven](https://maven.apache.org/) 🐘
- [MySQL](https://dev.mysql.com/downloads/) 🐬
- [Git](https://git-scm.com/) 🔧

---

### 📥 Passo a Passo

1. **Clonar o repositório**
   ```bash
   git clone https://github.com/gabrielj-e/api-leads-snct.git
   cd api-leads-snct
````

2. **Configurar o banco de dados**
   Crie um banco no MySQL:

   ```sql
   CREATE DATABASE leads_snct;
   ```

   Edite o arquivo `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/leads_snct
   spring.datasource.username=SEU_USUARIO
   spring.datasource.password=SUA_SENHA
   spring.jpa.hibernate.ddl-auto=validate
   ```

3. **Rodar a aplicação**

   ```bash
   mvn spring-boot:run
   ```

4. **Acessar a API**

   * URL base: `http://localhost:8080/api/leads`
   * Exemplos de endpoints:

     * `POST /api/leads` → cadastrar lead
     * `GET /api/leads` → listar leads

---

## 🧪 Testes Automatizados

Os testes foram implementados utilizando **JUnit** e **Spring Boot Test**.
Para rodar os testes:

```bash
mvn test
```

---

## 🌐 Contatos

* 📧 Email: [gabriel17j.e@gmail.com](mailto:gabriel17j.e@gmail.com)
* 🐙 GitHub: [gabrielj-e](https://github.com/gabrielj-e)

---

💡 *Este projeto foi desenvolvido com foco acadêmico e profissional, aplicando boas práticas REST, versionamento de banco com Flyway e persistência com JPA/Hibernate.*

<<<<<<< HEAD
---
=======
---
>>>>>>> 481e222a6833e19b11cb9218e44740ec6111e9f9
