package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // Uma amostra desconhecida chega para o IDS;

    // É aplicado um método de clustering para identificar o(s) classificador(es) especialistas nas amostras similares àquela desconhecida.

    // Dois classificadores são selecionados para seus outputs serem considerados na decisão final.

    // Esses dois classificadores geram resultados conflitantes para a amostra desconhecida.
    // Ou nenhum classificador apresenta uma F1-Score suficiente

    //O solicitante solicita um conselho para a rede de conselheiros (publish/subscribe).

    //Os conselheiros fazem uma correlação temporal da amostra e indicam se houve ou não algum registro de ataques em uma janela de 2 segundos a partir do timestamp da amostra recebida na requisição de conselhos.

    //O solicitante verifica quais conselhos devem ser aceitos a partir da média ponderada entre a RepScore (reputação na rede) e F1-Score (performance interna do conselheiro).

    //O solicitante efetua uma validação cruzada para ver quais conselhos maximizam sua performance interna (F1-Score do solicitante)

    //O solicitante atualiza sua base de conhecimento.

    //O solicitante envia um feedback para a rede, que atualiza a RepScore do conselheiro.

    // O conselheiro ouve seu próprio RepScore para saber se precisa aprender

    // O conselheiro começa a ouvir conselhos da rede para terceiros (executa a linha 24)

    // Conselheiros atualizam a RepScore dos demais.

}