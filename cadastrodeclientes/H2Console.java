package projeto.cadastrodeclientes;

import org.h2.tools.Server;

public class H2Console {

    public static void iniciar() {
        try {
            Server.createWebServer(
                    "-web",
                    "-webAllowOthers",
                    "-webPort", "8082"
            ).start();

            System.out.println("Console H2 iniciado em: http://localhost:8082");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}