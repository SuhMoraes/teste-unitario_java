package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static br.ce.wcaquino.utils.DataUtils.isMesmaData;
import static br.ce.wcaquino.utils.DataUtils.obterDataComDiferencaDias;


public class LocacaoServiceTest {

    @Test
    public void teste() {
        //cenario
        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("Usuario 1");
        Filme filme	= new Filme("Filme 1", 2, 5.0);

        //acao
        Locacao locacao = service.alugarFilme(usuario, filme);

        //verificacao
        MatcherAssert.assertThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.equalTo(5)));
        MatcherAssert.assertThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.not(6.0)));
        MatcherAssert.assertThat(isMesmaData(locacao.getDataLocacao(), new Date()), CoreMatchers.is(true));
        MatcherAssert.assertThat(isMesmaData(locacao.getDataRetorno(), obterDataComDiferencaDias(1)), CoreMatchers.is(true));
    }
}

