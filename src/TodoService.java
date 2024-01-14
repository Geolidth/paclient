/*
* File: TodoService.java
* Author: Csajbók-Reményi László
* Copyright: 2024, Csajbók-Reményi László
* Group: Szoft II/I/E
* Date: 2024/01/14
* Github: https://github.com/Geolidth/paclient.git
* Licenc: GNU GPL
*/

public class TodoService {
    private Client client;
    private final String url;
    public TodoService() {
        url ="https://jsonplaceholder.typicode.com/posts";
        client = new Client();
    }

    public String getTodos(){
        return client.get(url);
    }
}
