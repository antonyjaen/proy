
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.io.IOException;
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
    DBCollection ventas = database.getCollection("ventas");
    DBCollection facturacion = database.getCollection("facturacion");
    DBCollection inventario = database.getCollection("inventario");
    DBCollection clientes = database.getCollection("clientes");
    
    public void agregarInv(String cod,String des,String cantidad,String precio,String tip) {
        try {
            Date date = new Date();    
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fe = ""+dateFormat.format(date);
            
            BasicDBObject query = new BasicDBObject();
            query.put("_id",cod);  
            DBCursor cursor = inventario.find(query);
            
            int cant=Integer.parseInt(cantidad);
            if (cursor.count()==1) {
                System.out.println("la cant es "+cant);
                String can = (String)cursor.one().get("cantidad");
                cant= cant+Integer.parseInt(can);
                inventario.remove(query);
            }
            DBObject prod = new BasicDBObject("_id",cod)//codigo
                .append("desc",des)//descripcion      
                .append("cantidad",""+cant)//cantidad de produccion
                .append("precio",precio)
                .append("tipo",tip)
                .append("fecha",fe);
            inventario.insert(prod);
            JOptionPane.showMessageDialog(null, "Agregado");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos");//por si se ingresa un priary key repetido
        }
    }
    
     public void agregartrab(String id,String nom,String us,String pass,String sueldo) {
        try {
            Date date = new Date();    
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fe = ""+dateFormat.format(date);
            
            DBObject tra = new BasicDBObject("_id",id)
            .append("nombre",nom)      
            .append("usuario",us)
            .append("pass",pass)
            .append("sueldo",sueldo)
            .append("fecha",fe);
            trabajadores.insert(tra);
            JOptionPane.showMessageDialog(null, "Agregado");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos");//por si se ingresa un priary key repetido
        }
    }
     
    public int log(String us,String pas){
        BasicDBObject query = new BasicDBObject();
        query.put("usuario",us);  
        query.put("pass",pas);
        DBCursor cursor = trabajadores.find(query);
        return cursor.count();
        
        //Icon ic = new ImageIcon((byte[])cursor.one().get("data"));
    }
    
     public Object[][] imglis() throws IOException{
        DBCursor cur = trabajadores.find();
        Object[][] list = new Object[(int)trabajadores.count()+1][3];
        int con=0;
        while (cur.hasNext()){
            con++;
            BasicDBObject datos = new BasicDBObject((BasicDBObject)cur.next());
            list[con][0]=(String) datos.get("_id");
            list[con][1] =(String) datos.get("nombre");
            list[con][2] =(String) datos.get("sueldo");
        }
        return list;
    }
        public void tab(JTable tab){
        DBCursor cur = trabajadores.find();
        DefaultTableModel dt = (DefaultTableModel) tab.getModel();
        int con=0;
        while (cur.hasNext()){
            con++;
            Object[] fila = new Object[3];
            
            String nom,id,sueldo;
            BasicDBObject datos = new BasicDBObject((BasicDBObject)cur.next());
            id=(String) datos.get("_id");
            nom=(String) datos.get("nombre");
            sueldo =(String) datos.get("sueldo");
                //"              "
            fila[0]=id;
            fila[1]=nom;
            fila[2]= sueldo;
            dt.addRow(fila);
        }
        tab.setModel(dt);
        tab.setRowHeight(64);
    }
        public void tab2(JTable tab,String tip,JLabel txtc,JTextField txtbus2){
        BasicDBObject query = new BasicDBObject();
        query.put("tipo",tip);  
        DBCursor cur = inventario.find(query);
            System.out.println("es : "+cur.count());
            if (cur.count()==0) {
                JOptionPane.showMessageDialog(null, "No hay Stuck");
                txtc.setVisible(false);
                txtbus2.setVisible(false);
                tab.setVisible(false);
            }else{
                DefaultTableModel dt = (DefaultTableModel) tab.getModel();
                int con=0;
                while (cur.hasNext()){
                    con++;
                    Object[] fila = new Object[4];

                    String desc,id,precio,can;
                    BasicDBObject datos = new BasicDBObject((BasicDBObject)cur.next());
                    id=(String) datos.get("_id");
                    desc=(String) datos.get("desc");
                    precio =(String) datos.get("precio");
                    can =(String) datos.get("cantidad");
                    //"              "
                    fila[0]=id;
                    fila[1]=desc;
                    fila[3]= precio;
                    fila[2]=can;
                    dt.addRow(fila);
                }
                tab.setModel(dt);
                tab.setRowHeight(64);
                txtc.setVisible(true);
                txtbus2.setVisible(true);
                tab.setVisible(true);
            }
    }
        
      public void EscribirClienteBusqueda(JTable tabla, String bus) {
        DBCursor cur = trabajadores.find();
        Object[] list = new Object[3];
        int con=0;
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while (cur.hasNext()){
            int pas = 0;
            con++;
            BasicDBObject datos = new BasicDBObject((BasicDBObject)cur.next());
            list[0]=(String) datos.get("_id");
            list[1] =(String) datos.get("nombre");
            list[2] =(String) datos.get("sueldo");
            
            String pal = list[0].toString();
            int largo2 = pal.length();
            int largo = bus.length();
            if (largo <= largo2) {
                for (int i = 0; i < largo; i++) {
                    if (pal.substring(i, i + 1).equalsIgnoreCase(bus.substring(i, i + 1))) {
                        pas++;
                    }
                }
            }
            if (pas == largo) {
                modelo.addRow(list);
                tabla.setModel(modelo);
            }
        }
    }
    
    
    public void SubirVenta(String cod,String des,int cantidad) {
        try {
            Date date = new Date();    
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fe = ""+dateFormat.format(date);
            DBObject prod = new BasicDBObject("_id",cod)//codigo
            .append("desc",des)//descripcion       
            .append("fecha",fe)//fecha sin la hora
            .append("cantidad",cantidad);//cantidad de venta
            ventas.insert(prod);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en los datos");//por si se ingresa un priary key repetido
        }
    }
    public static void main(String[] args) {
       Main ok = new Main();
        ok.setVisible(true);
       /*db ok = new db();
       ok.SubirControl("68","3",3);
       ok.SubirVenta("68","3",3);*/
    }
}
