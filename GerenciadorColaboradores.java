package ControleDePonto;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorColaboradores {

    private List<Colaborador> colaboradores;

    public GerenciadorColaboradores() {
        this.colaboradores = new ArrayList<>();
    }

    public void adicionarColaborador(Colaborador c) {
        colaboradores.add(c);
    }

    public boolean removerColaborador(int id) {
        return colaboradores.removeIf(colaborador -> colaborador.getId_login() == id);
    }

    public void editarColaborador(Colaborador c) {
        for (int i = 0; i < colaboradores.size(); i++) {
            if (colaboradores.get(i).getId_login() == c.getId_login()) {
                colaboradores.set(i, c);
                break;
            }
        }
    }

    public Colaborador buscarColaboradorId(int id) {
        for (Colaborador c : colaboradores) {
            if (c.getIdLogin() == id) {
                return c;
            }
        }
        return null;
    }

    public void listarColaborador() {
        for (Colaborador c : colaboradores) {
            System.out.println(c);
        }
    }
}
