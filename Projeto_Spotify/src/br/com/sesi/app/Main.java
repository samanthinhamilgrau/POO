package br.com.sesi.app;

import java.util.Scanner;

import br.com.sesi.model.Musica;
import br.com.sesi.model.Podcast;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Musica primeiraMusica = null;
        Podcast primeiroPodcast = null;

        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Criar uma música");
            System.out.println("2. Criar um podcast");
            System.out.println("3. Imprimir informações");
            System.out.println("4. Curtir");
            System.out.println("5. Reproduzir");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    primeiraMusica = criarMusica(scanner);
                    break;

                case 2:
                    primeiroPodcast = criarPodcast(scanner);
                    break;

                case 3:
                    if (primeiraMusica != null) {
                        primeiraMusica.imprimer();
                    } else if (primeiroPodcast != null) {
                        primeiroPodcast.imprimer();
                    } else {
                        System.out.println("Nenhuma música ou podcast criado ainda.");
                    }
                    break;

                case 4:
                    if (primeiraMusica != null) {
                        primeiraMusica.curtir();
                    } else if (primeiroPodcast != null) {
                        primeiroPodcast.curtir();
                    } else {
                        System.out.println("Nenhuma música ou podcast criado ainda.");
                    }
                    break;

                case 5:
                    if (primeiraMusica != null) {
                        primeiraMusica.reproduzir();
                    } else if (primeiroPodcast != null) {
                        primeiroPodcast.reproduzir();
                    } else {
                        System.out.println("Nenhuma música ou podcast criado ainda.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 6);

        scanner.close();
    }

    private static Musica criarMusica(Scanner scanner) {
        Musica musica = new Musica();

        System.out.println("Digite o título da música: ");
        String titulo = scanner.nextLine();
        musica.setTitulo(titulo);

        System.out.println("Digite a duração da música (em segundos): ");
        int duracao = scanner.nextInt();
        scanner.nextLine(); 
        musica.setDuracao(duracao);

        System.out.println("Digite o ano de lançamento da música: ");
        int anoDeLancamento = scanner.nextInt();
        scanner.nextLine(); 
        musica.setAnoDeLancamento(anoDeLancamento);

        System.out.println("Digite o nome do cantor: ");
        String cantor = scanner.nextLine();
        musica.setCantor(cantor);

        return musica;
    }

    	private static Podcast criarPodcast(Scanner scanner) {
        Podcast podcast = new Podcast();

        System.out.println("Digite o título do podcast: ");
        String titulo = scanner.nextLine();
        podcast.setTitulo(titulo);

        System.out.println("Digite a duração do podcast (em segundos): ");
        int duracao = scanner.nextInt();
        scanner.nextLine(); 
        podcast.setDuracao(duracao);

        System.out.println("Digite o ano de lançamento do podcast: ");
        int anoDeLancamento = scanner.nextInt();
        scanner.nextLine(); 
        podcast.setAnoDeLancamento(anoDeLancamento);

        System.out.println("Digite o nome do apresentador: ");
        String apresentador = scanner.nextLine();
        podcast.setApresentador(apresentador);

        return podcast;
    }
}
