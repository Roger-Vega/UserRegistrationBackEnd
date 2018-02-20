# UserRegistrationBackEnd

### Indicaciones para ejecutar el proyecto:

- Tener instalado Spring Tool Suite (https://spring.io/tools)

- Clonar el repositorio 
```git clone https://github.com/Roger-Vega/UserRegistrationBackEnd.git```

- Importar el proyecto en [Spring Tool Suite](https://spring.io/tools)
- Click derecho sobre el proyecto > Run As > Spring Boot App

### La API REST puede recibir peticiones tipo:
- GET

http://localhost:8080/userId

Donde el userId es el número de identificación del usuario

- POST

http://localhost:8080/

En el body se debe enviar un JSON con la siguiente estructura:
```
{
  "userId": "0123456789",	
  "name": "Nombre",
  "birthday": "2000-06-15",
  "homeAddress":  "Direccion",
  "hobbie":  "Hobbie",
  "description": "Descripcion",
  "telephone": "0987456123",
  "gender": "M",
  "civilStatus": "Casado",
  "email": "example@mail.com"
}
```

- DELETE

http://localhost:8080/userId

Donde el userId es su número de identificación
