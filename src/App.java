
import java.text.DecimalFormat;
import java.time.LocalDate;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Usuario u1 = new Usuario(138, "Marcio Duarte", TipoUsuario.MEDICO);
        Usuario u2 = new Usuario(232, "Katilce Carpes", TipoUsuario.MEDICO);
        Usuario u3 = new Usuario(343, "Arthur Stein", TipoUsuario.MEDICO);
        Usuario u4 = new Usuario(545, "Beatriz de Souza", TipoUsuario.MEDICO);
        Usuario u5 = new Usuario(165, "Fabricio Ritter", TipoUsuario.MEDICO);
        Usuario u6 = new Usuario(767, "Maurício Barcelos", TipoUsuario.MEDICO);
        Usuario u7 = new Usuario(878, "Kelly Costa", TipoUsuario.MEDICO);
        Usuario u8 = new Usuario(988, "Andressa Santos", TipoUsuario.MEDICO);
        Usuario u9 = new Usuario(788, "Bruna Althaus", TipoUsuario.MEDICO);

        Usuario u10 = new Usuario(765, "Ana Franqui", TipoUsuario.PACIENTE);
        Usuario u11 = new Usuario(234, "Maria Pereira", TipoUsuario.PACIENTE);
        Usuario u12 = new Usuario(423, "Carla Lourenço", TipoUsuario.PACIENTE);
        Usuario u13 = new Usuario(495, "Leonardo Silva", TipoUsuario.PACIENTE);
        Usuario u14 = new Usuario(273, "Lenon Teixeira", TipoUsuario.PACIENTE);
        Usuario u15 = new Usuario(916, "Marcelo Machado", TipoUsuario.PACIENTE);
        Usuario u16 = new Usuario(539, "Caio Ribeiro", TipoUsuario.PACIENTE);
        Usuario u17 = new Usuario(659, "Adão Preto Filho", TipoUsuario.PACIENTE);
        Usuario u18 = new Usuario(159, "Rafael Silveira", TipoUsuario.PACIENTE);

        Usuario u19 = new Usuario(578, "Alexandre Lima", TipoUsuario.ADMINISTRADOR);
        Usuario u20 = new Usuario(357, "Gabriel Loss", TipoUsuario.ADMINISTRADOR);
        Usuario u21 = new Usuario(300, "Mateus Bittencourt", TipoUsuario.ADMINISTRADOR);
        Usuario u22 = new Usuario(100, "Marco Laimer", TipoUsuario.ADMINISTRADOR);

        CadastroUsuario cadastroUsuario = new CadastroUsuario();

        cadastroUsuario.adicionarUsuario(u1);
        cadastroUsuario.adicionarUsuario(u2);
        cadastroUsuario.adicionarUsuario(u3);
        cadastroUsuario.adicionarUsuario(u4);
        cadastroUsuario.adicionarUsuario(u5);
        cadastroUsuario.adicionarUsuario(u6);
        cadastroUsuario.adicionarUsuario(u7);
        cadastroUsuario.adicionarUsuario(u8);
        cadastroUsuario.adicionarUsuario(u9);
        cadastroUsuario.adicionarUsuario(u10);
        cadastroUsuario.adicionarUsuario(u11);
        cadastroUsuario.adicionarUsuario(u12);
        cadastroUsuario.adicionarUsuario(u13);
        cadastroUsuario.adicionarUsuario(u14);
        cadastroUsuario.adicionarUsuario(u15);
        cadastroUsuario.adicionarUsuario(u16);
        cadastroUsuario.adicionarUsuario(u17);
        cadastroUsuario.adicionarUsuario(u18);
        cadastroUsuario.adicionarUsuario(u19);
        cadastroUsuario.adicionarUsuario(u20);
        cadastroUsuario.adicionarUsuario(u21);
        cadastroUsuario.adicionarUsuario(u22);

        CadastroExame cadastroExame = new CadastroExame();

        cadastroExame.adicionarExame(new Exame(232, LocalDate.of(2023, 1, 13), u2, u18, TipoExame.DESINTOMETRIA_OSSEA));
        cadastroExame.adicionarExame(new Exame(257, LocalDate.of(2023, 4, 21), u6, u16, TipoExame.COLONOSCOPIA));
        cadastroExame.adicionarExame(new Exame(625, LocalDate.of(2023, 2, 2), u3, u15, TipoExame.ELETROCARDIOGRAMA));
        cadastroExame.adicionarExame(new Exame(845, LocalDate.of(2023, 3, 5), u8, u11, TipoExame.HEMOGRAMA));
        cadastroExame.adicionarExame(new Exame(942, LocalDate.of(2023, 8, 14), u7, u10, TipoExame.RAIO_X));
        cadastroExame.adicionarExame(new Exame(365, LocalDate.of(2023, 9, 18), u5, u12, TipoExame.ELETROCARDIOGRAMA));
        cadastroExame.adicionarExame(new Exame(372, LocalDate.of(2023, 5, 26), u4, u11, TipoExame.DESINTOMETRIA_OSSEA));
        cadastroExame.adicionarExame(new Exame(102, LocalDate.of(2023, 4, 30), u1, u16, TipoExame.TOMOGRAFIA));
        cadastroExame.adicionarExame(new Exame(825, LocalDate.of(2023, 3, 28), u3, u14, TipoExame.MAMOGRAFIA));
        cadastroExame.adicionarExame(new Exame(111, LocalDate.of(2023, 4, 10), u9, u18, TipoExame.COLONOSCOPIA));
        cadastroExame.adicionarExame(new Exame(435, LocalDate.of(2023, 11, 6), u7, u11, TipoExame.DESINTOMETRIA_OSSEA));
        cadastroExame.adicionarExame(new Exame(958, LocalDate.of(2023, 4, 18), u6, u13, TipoExame.URINA));
        cadastroExame.adicionarExame(new Exame(458, LocalDate.of(2023, 7, 14), u8, u14, TipoExame.RAIO_X));
        cadastroExame.adicionarExame(new Exame(797, LocalDate.of(2023, 4, 12), u9, u16, TipoExame.MAMOGRAFIA));
        cadastroExame.adicionarExame(new Exame(666, LocalDate.of(2023, 9, 7), u2, u18, TipoExame.HEMOGRAMA));
        cadastroExame.adicionarExame(new Exame(159, LocalDate.of(2023, 10, 22), u4, u17, TipoExame.ULTRASSONOGRAFIA));
        cadastroExame.adicionarExame(new Exame(357, LocalDate.of(2023, 12, 27), u6, u12, TipoExame.DESINTOMETRIA_OSSEA));
        cadastroExame.adicionarExame(new Exame(852, LocalDate.of(2023, 1, 30), u8, u11, TipoExame.ERGOMETRIA));
        cadastroExame.adicionarExame(new Exame(528, LocalDate.of(2023, 7, 31), u9, u17, TipoExame.TOMOGRAFIA));
        cadastroExame.adicionarExame(new Exame(339, LocalDate.of(2023, 3, 1), u1, u10, TipoExame.MAMOGRAFIA));

        cadastroExame.marcarExameComoRealizado(357, LocalDate.of(2023, 1, 3));
        cadastroExame.marcarExameComoRealizado(102, LocalDate.of(2023, 5, 8));
        cadastroExame.marcarExameComoRealizado(111, LocalDate.of(2023, 4, 15));
        cadastroExame.marcarExameComoRealizado(339, LocalDate.of(2023, 3, 31));

        int opcao = 0, seq = 1;
        String msg = "";
        TipoExame[] tiposExame = TipoExame.values();
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner in = new Scanner(System.in);

        do {
            try {
                System.out.print(msg + "\nMenu Principal\n\n(0) - Sair\n(1) - Selecionar Usuário\n\n>>> ");
                opcao = in.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.print("\nID: ");
                        int id = in.nextInt();

                        System.out.print("\nPerfil\n\n(a) - Administrador\n(m) - Médico\n(p) - Paciente\n(v) - Voltar ao menu anterior\n\n>>> ");
                        String tipo = in.nextLine();
                        tipo = in.nextLine();

                        char tipoAbrev = tipo.charAt(0);

                        TipoUsuario tipoUsuario = tipoAbrev == 'a' ? TipoUsuario.ADMINISTRADOR : tipoAbrev == 'A' ? TipoUsuario.ADMINISTRADOR : tipoAbrev == 'm' ? TipoUsuario.MEDICO : tipoAbrev == 'M' ? TipoUsuario.MEDICO : tipoAbrev == 'p' ? TipoUsuario.PACIENTE : tipoAbrev == 'P' ? TipoUsuario.PACIENTE : null;

                        if (tipoUsuario != null) {
                            Usuario usuarioAtual = cadastroUsuario.buscarUsuarioPorIDeTipo(id, tipoUsuario);
                            if (usuarioAtual != null) {
                                switch (usuarioAtual.getTipo()) {
                                    case ADMINISTRADOR:
                                        msg = "";
                                        do {
                                            System.out.print(msg + "\nUsuário atual: " + usuarioAtual.getNome() + " (" + usuarioAtual.getId() + ")\n\n(1) - Cadastrar novo usuário\n(2) - Buscar exames do usuário por parte do seu nome\n(3) - Exibir estatísticas\n(4) - Exibir todos os usuários cadastrados\n(5) - Voltar ao menu principal\n\n>>> ");
                                            opcao = in.nextInt();
                                            switch (opcao) {
                                                case 1:
                                                    System.out.print("\nID: ");
                                                    id = in.nextInt();

                                                    System.out.print("\nNome: ");
                                                    String nome = in.nextLine();
                                                    nome = in.nextLine();

                                                    System.out.print("\nTipo:\n\n(a) - Administrador\n(m) - Médico\n(p) - Paciente\n\n>>> ");

                                                    tipo = in.nextLine();
                                                    tipoAbrev = tipo.charAt(0);

                                                    tipoUsuario = tipoAbrev == 'a' ? TipoUsuario.ADMINISTRADOR : tipoAbrev == 'A' ? TipoUsuario.ADMINISTRADOR : tipoAbrev == 'm' ? TipoUsuario.MEDICO : tipoAbrev == 'M' ? TipoUsuario.MEDICO : tipoAbrev == 'p' ? TipoUsuario.PACIENTE : tipoAbrev == 'P' ? TipoUsuario.PACIENTE : null;

                                                    Usuario usuario = new Usuario(id, nome, tipoUsuario);

                                                    if (cadastroUsuario.adicionarUsuario(usuario)) {
                                                        msg = "\nUsuário cadastrado com sucesso\n";
                                                    } else {
                                                        msg = "\nErro ao cadastrar usuário\n";
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.print("\nNome: ");
                                                    String parteDoNome = in.nextLine();
                                                    parteDoNome = in.nextLine();

                                                    if (!cadastroExame.buscarExamesPorParteDoNome(parteDoNome).isEmpty()) {
                                                        msg = "\nLista de autorizações para " + parteDoNome + ":";
                                                        for (Exame exame : cadastroExame.buscarExamesPorParteDoNome(parteDoNome)) {
                                                            msg += "\n" + exame;
                                                        }
                                                        msg += "\n";
                                                    } else {
                                                        msg = "\nNão há exames a serem listados para o usuário informado\n";
                                                    }
                                                    break;
                                                case 3:
                                                    msg = "\nEstatísticas:\n";
                                                    msg += "\nTotal de usuários: " + cadastroUsuario.getSize();
                                                    msg += "\nN° de Administradores: " + cadastroUsuario.contarUsuarios(TipoUsuario.ADMINISTRADOR) + " (" + df.format(cadastroUsuario.percentualUsuarios(TipoUsuario.ADMINISTRADOR)) + "%)";
                                                    msg += "\nN° de Médicos: " + cadastroUsuario.contarUsuarios(TipoUsuario.MEDICO) + " (" + df.format(cadastroUsuario.percentualUsuarios(TipoUsuario.MEDICO)) + "%)";
                                                    msg += "\nN° de Pacientes: " + cadastroUsuario.contarUsuarios(TipoUsuario.PACIENTE) + " (" + df.format(cadastroUsuario.percentualUsuarios(TipoUsuario.PACIENTE)) + "%)";
                                                    msg += "\nN° de Autorizações Emitidas: " + cadastroExame.getSize();
                                                    msg += "\nPercentual de Autorizações com Exames já Realizados: " + df.format(cadastroExame.percentualExamesRealizados()) + "%\n";
                                                    break;
                                                case 4:
                                                    msg = "\nUsuários cadastrados no sistema:";
                                                    for (Usuario u : cadastroUsuario.getUsuarios()) {
                                                        msg += "\n" + u;
                                                    }
                                                    msg += "\n";
                                                    break;
                                                case 5:
                                                    msg = "";
                                                    break;
                                                default:
                                                    msg = "\nOpção inválida\n";
                                                    break;
                                            }
                                        } while (opcao != 5);
                                        break;
                                    case MEDICO:
                                        msg = "";
                                        do {
                                            System.out.print(msg + "\nUsuário atual: " + usuarioAtual.getNome() + " (" + usuarioAtual.getId() + ")\n\n(1) - Nova autorização de exame\n(2) - Listar autorizações\n(3) - Listar todas as autorizações cadastradas\n(4) - Voltar ao menu principal\n\n>>> ");
                                            opcao = in.nextInt();
                                            switch (opcao) {
                                                case 1:
                                                    System.out.print("\nMédicos Disponíveis:\n");
                                                    for (Usuario usuario : cadastroUsuario.getUsuariosPorTipo(TipoUsuario.MEDICO)) {
                                                        System.out.print("\n" + usuario.getId() + " - " + usuario.getNome());
                                                    }
                                                    System.out.print("\n\n>>> ");
                                                    id = in.nextInt();

                                                    Usuario medico = cadastroUsuario.buscarUsuarioPorID(id);

                                                    if (medico == null) {
                                                        System.out.println("\nMédico inválido");
                                                        break;
                                                    }

                                                    System.out.print("\nPacientes Disponíveis:\n");
                                                    for (Usuario usuario : cadastroUsuario.getUsuariosPorTipo(TipoUsuario.PACIENTE)) {
                                                        System.out.print("\n" + usuario.getId() + " - " + usuario.getNome());
                                                    }
                                                    System.out.print("\n\n>>> ");
                                                    id = in.nextInt();

                                                    Usuario paciente = cadastroUsuario.buscarUsuarioPorID(id);

                                                    if (paciente == null) {
                                                        System.out.println("\nPaciente inválido");
                                                        break;
                                                    }

                                                    int i = 0;
                                                    System.out.println("\nExames Disponíveis:\n");
                                                    for (TipoExame exame : tiposExame) {
                                                        System.out.println(i + " - " + exame);
                                                        i++;
                                                    }
                                                    System.out.print("\n>>> ");
                                                    int indexExame = in.nextInt();

                                                    if (indexExame < 0 || indexExame > TipoExame.values().length) {
                                                        System.out.println("\nIndex do exame inválido");
                                                        break;
                                                    }

                                                    Exame exame = new Exame(seq, LocalDate.now(), medico, paciente, tiposExame[indexExame]);

                                                    if (cadastroExame.adicionarExame(exame)) {
                                                        msg = "\nAutorização de exame cadastrada com sucesso";
                                                        msg += "\n" + exame + "\n";
                                                        seq++;
                                                    } else {
                                                        msg = "\nErro ao cadastrar autorização de exame\n";
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.print("\nListar Por:\n\n(1) - Paciente\n(2) - Tipo de Exame\n\n>>> ");
                                                    opcao = in.nextInt();
                                                    switch (opcao) {
                                                        case 1:
                                                            System.out.print("\nID do Paciente: ");
                                                            id = in.nextInt();

                                                            paciente = cadastroUsuario.buscarUsuarioPorID(id);

                                                            if (paciente != null) {
                                                                msg = "\nAutorizações de Exames do Paciente " + paciente.getNome() + " - (ID:" + paciente.getId() + ") listadas por Data:";
                                                                for (Exame ex : cadastroExame.buscarExamesPorPaciente(paciente)) {
                                                                    msg += "\n" + ex;
                                                                }
                                                                msg += "\n";
                                                            } else {
                                                                msg = "\nPaciente não encontrado\n";
                                                            }
                                                            break;
                                                        case 2:
                                                            i = 0;
                                                            System.out.println("\nExames Disponíveis:\n");
                                                            for (TipoExame ex : tiposExame) {
                                                                System.out.println(i + " - " + ex);
                                                                i++;
                                                            }
                                                            System.out.print("\n>>> ");
                                                            indexExame = in.nextInt();

                                                            System.out.println("\nAutorizações de Exames de " + tiposExame[indexExame] + " listadas por Data:");
                                                            for (Exame ex : cadastroExame.buscarExamesPorTipoExame(tiposExame[indexExame])) {
                                                                System.out.println(ex);
                                                            }
                                                            break;
                                                    }
                                                    break;
                                                case 3:
                                                    msg = "\nAutorizações de exames cadastradas no sistema:";
                                                    for (Exame ex : cadastroExame.getExames()) {
                                                        msg += "\n" + ex;
                                                    }
                                                    msg += "\n";
                                                    break;
                                                case 4:
                                                    msg = "";
                                                    break;
                                                default:
                                                    msg = "\nOpção inválida\n";
                                                    break;
                                            }
                                        } while (opcao != 4);
                                        break;
                                    case PACIENTE:
                                        msg = "";
                                        do {
                                            System.out.print(msg + "\nUsuário atual: " + usuarioAtual.getNome() + " (" + usuarioAtual.getId() + ")\n\n(1) - Marcar exame como realizado\n(2) - Listar exames por data\n(3) - Voltar ao menu principal\n\n>>> ");
                                            opcao = in.nextInt();
                                            switch (opcao) {
                                                case 1:
                                                    System.out.print("\nID do Exame: ");
                                                    id = in.nextInt();

                                                    System.out.print("\nDia: ");
                                                    int dia = in.nextInt();

                                                    System.out.print("\nMês: ");
                                                    int mes = in.nextInt();

                                                    System.out.print("\nAno: ");
                                                    int ano = in.nextInt();

                                                    LocalDate dataConclusao = LocalDate.of(ano, mes, dia);

                                                    if (cadastroExame.marcarExameComoRealizado(id, dataConclusao)) {
                                                        msg = "\nExame " + id + " marcado como realizado\n";
                                                    } else {
                                                        System.out.println("\nErro ao marcar exame como realizado");
                                                    }
                                                    break;
                                                case 2:
                                                    msg = "\nAutorizações de Exames de " + usuarioAtual.getNome() + " listadas por Data:";
                                                    for (Exame exame : cadastroExame.buscarExamesPorUsuarioOrdenadosPorData(usuarioAtual)) {
                                                        msg += "\n" + exame;
                                                    }
                                                    msg += "\n";
                                                    break;
                                                case 3:
                                                    msg = "";
                                                    break;
                                                default:
                                                    msg = "\nOpção inválida\n";
                                                    break;
                                            }
                                        } while (opcao != 3);
                                        break;
                                }
                            } else {
                                msg = "\nUsuário não encontrado\n";
                            }
                        } else {
                            msg = "\nUsuário não encontrado\n";
                        }
                        break;
                    default:
                        msg = "\nOpção inválida\n";
                        break;
                }
            } catch (Exception ex) {
                System.out.println();
                System.out.println("Erro de digitação. Encerrando a aplicação...\n");
                System.exit(0);
            }
        } while (opcao != 0);
        in.close();
    }
}
