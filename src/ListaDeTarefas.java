import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private final List<Tarefa> listaDeTarefas;

    public ListaDeTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        listaDeTarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada: " + descricao);
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < listaDeTarefas.size()) {
            Tarefa tarefaRemovida = listaDeTarefas.remove(indice);
            System.out.println("Tarefa removida: " + tarefaRemovida.getDescricao());
        } else {
            System.out.println("Indice inválido. A tarefa não foi removida.");
        }
    }

    public void marcarComoConcluida(int indice) {
        if (indice >= 0 && indice < listaDeTarefas.size()) {
            Tarefa tarefa = listaDeTarefas.get(indice);
            tarefa.marcarComoConcluida();
            System.out.println("Tarefa foi marcada como concluída: " + tarefa.getDescricao());
        } else {
            System.out.println("Indice inválido. A tarefa não foi marcada como concluida");
        }
    }

    public void exibitLista() {
        if (listaDeTarefas.isEmpty()) {
            System.out.println("A tarefa está vazia");
        } else {
            System.out.println("Lista de tarefas: ");
            for (int i = 0; i < listaDeTarefas.size(); i++) {
                System.out.println(i + ": " + listaDeTarefas.get(i));
            }
        }
    }
}

