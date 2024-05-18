# TrafficLightChecker, TrafficLightSwitch e ColorRange

---

## Descrição

O programa `ColorRange` é um aplicativo Java simples que identifica a cor correspondente a um comprimento de onda de luz visível. Ele solicita ao usuário que insira o comprimento de onda em nanômetros (nm) e, com base nos intervalos definidos, determina a cor associada. Os programas "TrafficLightChecker" e "TrafficLightSwitch" são aplicativos Java que verificam a próxima cor do semáforo com base no código da cor atual. Ambos os programas permitem que o usuário insira o código da cor (1 para Vermelho, 2 para Amarelo, 3 para Verde) e, em seguida, determinam a próxima cor com base no código inserido. 

---

# ColorRange Como usar

1. Compile o código-fonte:
   - Abra um terminal ou prompt de comando.
   - Navegue até o diretório onde o arquivo `ColorRange.java` está localizado.
   - Compile o código com o seguinte comando:
     ```
     javac ColorRange.java
     ```

2. Execute o programa:
   - Após a compilação bem-sucedida, execute o programa com o seguinte comando:
     ```
     java ColorRange
     ```
   - O programa solicitará que você insira o comprimento de onda em nanômetros.

3. Insira o comprimento de onda:
   - Digite um valor numérico para o comprimento de onda e pressione Enter.

4. Resultado:
   - O programa exibirá a cor correspondente com base nos intervalos definidos.

## Intervalos de cores

- Violeta: 380 nm a 450 nm
- Azul: 450 nm a 495 nm
- Verde: 495 nm a 570 nm
- Amarelo: 570 nm a 590 nm
- Laranja: 590 nm a 620 nm
- Vermelho: 620 nm a 750 nm

---

### TrafficLightChecker

- O programa "TrafficLightChecker" utiliza uma abordagem que não envolve a estrutura de switch. Ele segue a seguinte lógica:

  - Se o código inserido for 1, a próxima cor é Amarelo (2).
  - Se o código inserido for 2, a próxima cor é Verde (3).
  - Se o código inserido for 3, a próxima cor é Vermelho (1).
  - Se o código inserido não corresponder a nenhuma das cores acima, o programa informará que o código de cor é inválido.

### TrafficLightSwitch

- O programa "TrafficLightSwitch" utiliza uma estrutura de switch para determinar a próxima cor com base no código inserido. A lógica é a mesma do programa anterior:

  - Se o código inserido for 1, a próxima cor é Amarelo (2).
  - Se o código inserido for 2, a próxima cor é Verde (3).
  - Se o código inserido for 3, a próxima cor é Vermelho (1).
  - Se o código inserido não corresponder a nenhuma das cores acima, o programa informará que o código de cor é inválido.

---

## Contato:

Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para abrir uma issue no repositório do GitHub ou enviar um e-mail para: 
[nathanfelipi2006@gmail.com].

---

Desenvolvido com ❤️ por [Nathan Felipi Almeida].