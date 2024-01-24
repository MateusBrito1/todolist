import java.util.Scanner;

class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return (concluida ? "[Concluída] " : "") + descricao;
    }
}

public class Main {
    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\\n--- Menu ---\"");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Marcar como Concluída");
            System.out.println("4. Exibir Lista");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    listaDeTarefas.adicionarTarefas(descricao);
                    break;
                case 2:
                    System.out.println("Digite o indice da tarefa a ser removido: ");
                    int indiceRemover = scanner.nextInt();
                    listaDeTarefas.removerTarefa(indiceRemover);
                    break;
                case 3:
                    System.out.println("Digite o indice da tarefa a ser marcado como concluída");
                    int indiceConcluido = scanner.nextInt();
                    listaDeTarefas.marcarComoConcluida(indiceConcluido);
                    break;
                case 4:
                    listaDeTarefas.exibitLista();
                    break;
                case 0:
                    System.out.println("Saindo do TODOLIST!");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (escolha != 0);

        scanner.close();
    }
}