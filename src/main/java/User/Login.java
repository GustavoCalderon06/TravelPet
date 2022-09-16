package User;
import data.textFile;

import java.io.FileReader;

import java.util.ArrayList;

public class Login {
    private String user;
    private String pass;
    private boolean loginState = false;

    public Login() {
    }

    public Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    public String[] logearUsuario(String filepath) {
        ArrayList<String> registros = textFile.leerArchivo(filepath);
        this.loginState = false;
        String[] usuarioLogeado = new String[6];
        for (int i = 0; i < registros.size(); i++) {
            String[] temp = registros.get(i).split(",");
            if (this.user.equalsIgnoreCase(temp[0]) && this.pass.equalsIgnoreCase(temp[1])) {
                this.loginState = true;
                usuarioLogeado = temp;
            }
        }
        return usuarioLogeado;
    }
    public boolean isLoginState() {
        return loginState;
    }


}
