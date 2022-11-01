import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {

        Funcionario gerente = new Gerente(1, "Gerente João", "joao@gmail.com", "157829",
                                            "joaolog", "123456");

        Funcionario secretaria = new Secretaria(2, "Secretária Maria", "maria@gmail.com",
                "155727", "1933620000", "4");

        Funcionario operador = new Operador(3, "Operador Zé", "ze@gmail.com",
                "182365", 10.00);

        RegistroPonto registrarEntradaGerente = new RegistroPonto(1, gerente,
                LocalDate.now(), LocalDateTime.now());
        registrarEntradaGerente.apresentarRegistroPonto();

        Thread.sleep(1000);

        RegistroPonto registrarEntradaOperador = new RegistroPonto(3, operador, LocalDate.now(), LocalDateTime.now());
        registrarEntradaOperador.apresentarRegistroPonto();

        Thread.sleep(1000);

        RegistroPonto registrarEntradaSecretaria = new RegistroPonto(2, secretaria, LocalDate.now(), LocalDateTime.now());
        registrarEntradaSecretaria.apresentarRegistroPonto();

        Thread.sleep(1000);

        RegistroPonto registrarSaidaGerente = new RegistroPonto(
                registrarEntradaGerente.getIdRegPonto(),
                registrarEntradaGerente.getFuncionario(),
                registrarEntradaGerente.getDataRegistro(),
                registrarEntradaGerente.getHoraEntrada(),
                LocalDateTime.now());

        registrarSaidaGerente.apresentarRegistroPonto();

        Thread.sleep(1000);

        RegistroPonto registrarSaidaOperador = new RegistroPonto(
                registrarEntradaOperador.getIdRegPonto(),
                registrarEntradaOperador.getFuncionario(),
                registrarEntradaOperador.getDataRegistro(),
                registrarEntradaOperador.getHoraEntrada(),
                LocalDateTime.now());

        registrarSaidaOperador.apresentarRegistroPonto();

        Thread.sleep(1000);

        RegistroPonto registrarSaidaSecretaria = new RegistroPonto(
                registrarEntradaSecretaria.getIdRegPonto(),
                registrarEntradaSecretaria.getFuncionario(),
                registrarEntradaSecretaria.getDataRegistro(),
                registrarEntradaSecretaria.getHoraEntrada(),
                LocalDateTime.now());

        Thread.sleep(1000);

        registrarSaidaSecretaria.apresentarRegistroPonto();
    }
}