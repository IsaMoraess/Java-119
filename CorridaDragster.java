/* Imagine que você está fazendo um jogo sobre Corrida de Dragsters 
(um tipo corrida envolvendo um veículo leve com motores extremamente potentes, 
especialmente projetados para provas de arrancadas em retas). 
O código abaixo visa criar um programa onde você deve entrar com o valor da 
aceleração e da distância e o referido programa calcula a velocidade final, 
usando a Equação de Torricelli:
V 2 V1 2* a * distância 2

Observações:
- Considera-se que a velocidade inicial (V1) é zero.
- A velocidade é calculada originalmente em m/s e deve ser convertida para km/h 
antes de mostrar o resultado na tela. Para isso o programa deve multiplicar a 
velocidade calculada por 3.6.
-Crie uma classe com um método com duas variáveis de instância: 
aceleração e distância, depois crie os métodos gets e sets para cada um 
desses campos da classe, crie também um método que calcula e 
retorna a velocidade final. 
-Crie outra classe com o método main que lê os valores 
da aceleração e distância e chama o método da primeira classe que calcula 
a velocidade final. Por fim mostre a informação se a velocidade final 
bateu um novo recorde ou não. */

public class CorridaDragster {
    // Variáveis de instância
    private double aceleracao;
    private double distancia;

    // Construtor
    public CorridaDragster(double aceleracao, double distancia) {
        this.aceleracao = aceleracao;
        this.distancia = distancia;
    }

    // Métodos get e set para aceleração
    public double getAceleracao() {
        return aceleracao;
    }
    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    // Métodos get e set para distância
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    // Método para calcular a velocidade final
    public double calcularVelocidadeFinal() {
        double velocidadeFinal = Math.sqrt(2 * aceleracao * distancia);
        velocidadeFinal *= 3.6;
        return velocidadeFinal;
    }
}
