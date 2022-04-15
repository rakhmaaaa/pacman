import Model.ModelPacman;

import javax.swing.JFrame;

public class GimPacman extends JFrame{

        public GimPacman() {
            add(new ModelPacman());
        }

        public static void main(String[] args) {
            GimPacman pac = new GimPacman();
            pac.setVisible(true);
            pac.setTitle("Pacman");
            pac.setSize(380,420);
            pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
            pac.setLocationRelativeTo(null);

        }

}
