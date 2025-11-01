package com.techcamps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ProcessamentoDePagamentos {

    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);

    public static void main(String[] args) throws InterruptedException {
        realizarPagamento("1" , 150.75);
        realizarPagamento("2", 2500.00);
        realizarPagamento("3", 99.99);
        realizarPagamento("4", 500.50);
        realizarPagamento("5", 1200.00);
        logger.info("Processamento de pagamentos concluído.");
    }

    private static void realizarPagamento(String number, double payment) throws InterruptedException {
        logger.info("Iniciando o processamento do pagamento {}", number);

        switch (number) {
            case "1":
            case "4":
                logger.error("Erro ao processar o pagamento {}: Falha na transação.", number);
                break;
            case "2":
            case "3":
                logger.info("Pagamento {} processado com sucesso.", number);
                break;
            case "5":
                logger.warn("Pagamento {} está pendente. Aguardando confirmação.", number);
                Thread.sleep(1000);
                break;
        }
    }
}
