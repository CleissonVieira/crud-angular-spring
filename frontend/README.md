# Frontend

## Extensões utilizadas no VsCode para Angular:

- Angular Extension Pack (Loiane)

## [Angular CLI 15.1.1](https://github.com/angular/angular-cli)

- `npm install -g @angular/cli`

## Development server

Run `npm install` and `npm run start` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

# Anotações/Dicas

1. Divisão em módulos para um código mais limpo
   1.1. A cada novo módulo gerar um `ng g m nomeModulo --routing`

2. É possível criar a própria paleta de cores utilizando SCSS. Existe a documentação: Guides -> Theming Angular Material

3. Criado proxy.conf.js para não precisar configurar CORS na API, de forma que conseguimos utilizar a API com frontend localmente.
   3.1. Para isso foi necessário alterar a variável scripts: start: "ng serve --proxy-config proxy.conf.js" e utiliza NPM RUN START para iniciar

4. Criado um courses/guards/course.resolver.ts para quando entrar no course-routing que tenha uma variável id (sendo essa o edit) ele busque o objeto para renderizar na tela
