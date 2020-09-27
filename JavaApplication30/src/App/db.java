
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class db {
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://uqumwigyfcmdecu29uiz:8fRQRwxgMMbf7tjwqdKm@bv0d58maiskw13w-mongodb.services.clever-cloud.com:27017/bv0d58maiskw13w"));
    DB database = (DB) mongoClient.getDB("bv0d58maiskw13w");
    
    DBCollection trabajadores= database.getCollection("trabajadores");
    DBCollection inventario = database.getCollection("inventario");
    DBCollection clientes = database.getCollection("clientes");
    
    public void agregarInv(String cod,String des,String cantidad,String precio,String tip) {
        try {
            //Obitiene la fecha Actual
            Date date = new Date();    
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fe = ""+dateFormat.format(date);
            
            //Busca el Objeto segun su _id 
            BasicDBObject query = new BasicDBObject();
            query.put("_id",cod);  
            DBCursor cursor = inventario.find(query);
            
            
            int cant=Integer.parseInt(cantidad);//cantidad de inventario a sumar
            
            int CantidadE=Integer.parseInt(cantidad);//cantidad evalua : +Agregando : -Eliminando
            
            if (cursor.count()==1) {//si el objeto existe guarda su tantidad y elimina dicho dato para Actualizarlo 
                System.out.println("la cant es "+cant);
                String can = (String)cursor.one().get("cantidad");
                cant= cant+Integer.parseInt(can);
                inventario.remove(query);
            }
            
            DBObject prod = new BasicDBObject("_id",cod)//Crea el producto a agregar
                .append("desc",des)    
                .append("cantidad",""+cant)
                .append("precio",precio)
                .append("tipo",tip)
                .append("fecha",fe);
            
            inventario.insert(prod);//agrega el producto a la db
            
            if (CantidadE>0) {
                JOptionPane.showMessageDialog(null, "Agregado");
            }else{
                JOptionPane.showMessageDialog(null, "Vendido");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos");//por si se ingresa un priary key repetido
        }
    }
    
     public void agregartrab(String id,String nom,String us,String pass,String sueldo) {
        try {
            //Obitiene la fecha Actual
            Date date = new Date();    
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fe = ""+dateFormat.format(date);
            
            //Busca el Objeto segun su _id 
            BasicDBObject query = new BasicDBObject();
            query.put("_id",id);  
            DBCursor cursor = trabajadores.find(query);
            
            int v = cursor.count();// si es 1 existe en la base de datos
            if (v==1) {
                trabajadores.remove(query);
            }
            
            //se crea el objeto a agregar
            DBObject tra = new BasicDBObject("_id",id)
            .append("nombre",nom)      
            .append("usuario",us)
            .append("pass",pass)
            .append("sueldo",sueldo)
            .append("fecha",fe);
            
            trabajadores.insert(tra);//*se agrega el objeto a la db
            
            if (v==1) {//valida si lo actualiza o lo agrega
              JOptionPane.showMessageDialog(null, "Actualizado");  
            }else{
                JOptionPane.showMessageDialog(null, "Agregado");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos");//por si se ingresa un priary key repetido
        }
    }
     public void agregarCli(String id,String nom,String correo,String num) {
        try {
            //obitiene la fecha actual
            Date date = new Date();    
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fe = ""+dateFormat.format(date);
            
            //Busca el Objeto segun su _id 
            BasicDBObject query = new BasicDBObject();
            query.put("_id",id);  
            DBCursor cursor = clientes.find(query);
            
            int v = cursor.count();//validar 0 no existe, 1 si existe 
            
            if (v==1) {
                clientes.remove(query);
            }
            
            //crea el objeto
            DBObject tra = new BasicDBObject("_id",id)
            .append("nombre",nom)    
            .append("correo",correo)
            .append("numero",num)
            .append("fecha",fe);
            
            //agrega el objeto 
            clientes.insert(tra);
            
            if (v==1) {
              JOptionPane.showMessageDialog(null, "Actualizado");  
            }else{
                JOptionPane.showMessageDialog(null, "Agregado");
            }
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos");//por si se ingresa un priary key repetido
        }
    }
     
        public int log(String us,String pas){
            BasicDBObject query = new BasicDBObject();
            query.put("usuario",us);  
            query.put("pass",pas);
            DBCursor cursor = trabajadores.find(query);//Busca lo datos en la db
            return cursor.count();//retorna 1 si existe, 0 si no existe
        }
    
    
        public void tab(JTable tab){
        DBCursor cur = clientes.find();//obtiene datos de la db 
        DefaultTableModel dt = (DefaultTableModel) tab.getModel();
        while (cur.hasNext()){//recore los datos
            Object[] fila = new Object[4];
            
            //se hace una distribucion de los datos
            String nom,id,cor,num;
            BasicDBObject datos = new BasicDBObject((BasicDBObject)cur.next());
            id=(String) datos.get("_id");
            nom=(String) datos.get("nombre");
            cor=(String) datos.get("correo");
            num=(String) datos.get("numero");
            fila[0]=id;
            fila[1]=nom;
            fila[2]= cor;
            fila[3]= num;
            dt.addRow(fila);// se agregan a las filas de la tabla
        }
        tab.setModel(dt);//se agregan  a la trabla
        tab.setRowHeight(64);// damaño de separacion de la tabla
        } 
        
        public void tab2(JTable tab,String tip,JLabel txtc,JTextField txtbus2){
            //valida que tipo va a bucscar
            BasicDBObject query = new BasicDBObject();
            query.put("tipo",tip);  
            DBCursor cur = inventario.find(query);//obtiene los datos
            if (cur.count()==0) {
                //si no hay  datos 
                JOptionPane.showMessageDialog(null, "No hay Stuck");
                txtc.setVisible(false);
                txtbus2.setVisible(false);
                tab.setVisible(false);
            }else{
                //si hay datos
                DefaultTableModel dt = (DefaultTableModel) tab.getModel();
                while (cur.hasNext()){//recorre los datos
                    Object[] fila = new Object[4];
                    //distribuye los datos
                    String desc,id,precio,can;
                    BasicDBObject datos = new BasicDBObject((BasicDBObject)cur.next());
                    id=(String) datos.get("_id");
                    desc=(String) datos.get("desc");
                    precio =(String) datos.get("precio");
                    can =(String) datos.get("cantidad");
                    //los agrega en una fila
                    fila[0]=id;
                    fila[1]=desc;
                    fila[3]= precio;
                    fila[2]=can;
                    //guarda la fila
                    dt.addRow(fila);
                }
                tab.setModel(dt);//agrega las filas a la tabla
                tab.setRowHeight(64);//espacio de la tabla
                //oculta opciones en la interfaz
                txtc.setVisible(true);
                txtbus2.setVisible(true);
                tab.setVisible(true);
            }
    }
      public void EscribirClienteBusqueda(JTable tabla, String bus) {//escribe los clientes a buscar en la tabla
        DBCursor cur = clientes.find();//obitne datos de la db
        Object[] list = new Object[4];
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while (cur.hasNext()){//
            int pas = 0;
            BasicDBObject datos = new BasicDBObject((BasicDBObject)cur.next());
            list[0]=(String) datos.get("_id");
            list[1] =(String) datos.get("nombre");
            list[3] =(String) datos.get("correo");
            list[2] =(String) datos.get("numero");
            String pal = list[0].toString();
            int largo2 = pal.length();//largo de del _id
            int largo = bus.length();//largo del _id a buscar
            if (largo <= largo2) {//si es menor o igual los compara
                for (int i = 0; i < largo; i++) {//recorre letra por letra
                    if (pal.substring(i, i + 1).equalsIgnoreCase(bus.substring(i, i + 1))) {//si las letras son iguales suma puntos
                        pas++;
                    }
                }
            }
            if (pas == largo) {//si los puntos es igual al largo se agrega a la tabla
                modelo.addRow(list);
                tabla.setModel(modelo);
            }
        }
    }
     public void EscribirProductoBusqueda(JTable tabla, String bus,String tip) {
        BasicDBObject query = new BasicDBObject();//obitne datos de la db segun el tipo
        query.put("tipo",tip);
        DBCursor cur = inventario.find(query);
        Object[] list = new Object[4];
        
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();//crea una instancia de la tabla
        
        while (cur.hasNext()){//recorre los datos 
            int pas = 0;
            BasicDBObject datos = new BasicDBObject((BasicDBObject)cur.next());
            list[0]=(String) datos.get("_id");
            list[1] =(String) datos.get("desc");
            list[3] =(String) datos.get("precio");
            list[2] =(String) datos.get("cantidad");
            String pal = list[0].toString();
            int largo2 = pal.length();//largo de del _id
            int largo = bus.length();//largo del _id a buscar
            if (largo <= largo2) {//si es menor o igual los compara
                for (int i = 0; i < largo; i++) {//recorre letra por letra
                    if (pal.substring(i, i + 1).equalsIgnoreCase(bus.substring(i, i + 1))) {//si las letras son iguales suma puntos
                        pas++;
                    }
                }
            }
            if (pas == largo) {//si los puntos es igual al largo se agrega a la tabla
                modelo.addRow(list);
                tabla.setModel(modelo);
            }
        }
    }
    public static void main(String[] args) {
        //Arranca el programa
       Main ok = new Main();
        ok.setVisible(true);
    }
}