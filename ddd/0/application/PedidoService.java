package com.techcamps.application;

import com.techcamps.domain.Cliente;
import com.techcamps.domain.Pedido;
import com.techcamps.domain.Produto;
import com.techcamps.infrastructure.PedidoRepository;

public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido criarPedido(Cliente cliente) {
        Pedido pedido = new Pedido(cliente);
        pedidoRepository.salvar(pedido);
        return pedido;
    }

    public void adicionarProduto(String pedidoId, Produto produto) {
            Pedido pedido = pedidoRepository.buscarPorId(pedidoId);
            if (pedido != null) {
                pedido.adicionarProduto(produto);
            }
    }

    public void pagarPedido(String pedidoId) {
        Pedido pedido = pedidoRepository.buscarPorId(pedidoId);
        pedido.pagar();
    }

    public void cancelarPedido(String pedidoId) {
        // implementar
    }
}