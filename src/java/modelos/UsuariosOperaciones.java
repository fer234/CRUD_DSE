/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author ferna
 */
public class UsuariosOperaciones {
    
    public ArrayList<Usuarios> getUsuarios()
    {
        // Iniciamos hibernate creando una session
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        // Vinculamos la session a una transaction de la base de datos
        Transaction tx=session.beginTransaction();
        ArrayList<Usuarios> arreglo=new ArrayList<Usuarios>();
        Query q=session.createQuery("from Usuarios");
        List<Usuarios> lista=q.list();
        Iterator<Usuarios> iter=lista.iterator();
        // Vaciamos la session y sincronizamos con  la base de datos
        tx.commit();
        // Siempre debemos cerrar todas las sessiones ya que podriamos saturar nuestra base de datos
        // y como sonsecuencia rechazaria nuestras demas peticiones
        session.close();
        while(iter.hasNext())
        {
            Usuarios noti = (Usuarios) iter.next();
            arreglo.add(noti);
        }
        return arreglo;
    }
    
    public Usuarios getUsuarioPorId(int id)
    {
        // Iniciamos hibernate creando una session
        SessionFactory factory=HibernateUtil.getSessionFactory();
        // Vinculamos la session a una transaction de la base de datos
        Session session = factory.openSession();
        Transaction tx=session.beginTransaction();
        Usuarios usr=(Usuarios) session.get(Usuarios.class, id);
        // Vaciamos la session y sincronizamos con  la base de datos
        tx.commit();
        // Siempre debemos cerrar todas las sessiones ya que podriamos saturar nuestra base de datos
        // y como sonsecuencia rechazaria nuestras demas peticiones
        session.close();
        return usr;
    }
    
    public void updateUsuario(Usuarios usr)
    {
        // Iniciamos hibernate creando una session
        SessionFactory factory=HibernateUtil.getSessionFactory();
        // Vinculamos la session a una transaction de la base de datos
        Session session = factory.openSession();
        Transaction tx=session.beginTransaction();
        // Ejecutamos el medoto para actualizar datos
        session.update(usr);
        // Vaciamos la session y sincronizamos con  la base de datos
        tx.commit();
        // Siempre debemos cerrar todas las sessiones ya que podriamos saturar nuestra base de datos
        // y como sonsecuencia rechazaria nuestras demas peticiones
        session.close();
        
    }
    
    public void deleteUsuario(int id)
    {
        // Iniciamos hibernate creando una session
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        // Vinculamos la session a una transaction de la base de datos
        Transaction tx=session.beginTransaction();
        Usuarios usr=(Usuarios) session.get(Usuarios.class, id);
        // Eejecutamos el metodo eliminar con el registro especifico
        session.delete(usr);
        // Vaciamos la session y sincronizamos con  la base de datos
        tx.commit();
        // Siempre debemos cerrar todas las sessiones ya que podriamos saturar nuestra base de datos
        // y como sonsecuencia rechazaria nuestras demas peticiones
        session.close();
        
    }
    
    public void addUsuario(Usuarios user)
    {
        // Iniciamos hibernate creando una session
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        // Vinculamos la session a una transaction de la base de datos
        Transaction tx=session.beginTransaction();
        // Ejecutamos el metodo para guardar el registro
        session.save(user);
        // Vaciamos la session y sincronizamos con  la base de datos
        tx.commit();
        // Siempre debemos cerrar todas las sessiones ya que podriamos saturar nuestra base de datos
        // y como sonsecuencia rechazaria nuestras demas peticiones
        session.close();
        
    }

}
