package no.hvl.dat250.jpa.basicexample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "todos";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager entityManager = factory.createEntityManager();
        // read the existing entries and write to console
        Query query = entityManager.createQuery("select t from Todo t");
        List<Todo> todoList = query.getResultList();
        for (Todo todo : todoList) {
            System.out.println(todo);
        }
        System.out.println("Size: " + todoList.size());

        //Todo: Done
        entityManager.getTransaction().begin();
        Todo todo = new Todo();
        todo.setSummary("This is a test by Fredrik Nestvold Larsen");
        todo.setDescription(" A student at HVL and UiB");
        entityManager.persist(todo);
        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
