
public class Contacto
{
   private String nombre;
   private String apellido;
   private String telef;
   
   void set_nombre (String nombre)
   {
	   this.nombre = nombre;
   }
   
   void set_apellido (String apellido)
   {
	   this.apellido = apellido;
   }
   
   void set_telef (String telef)
   {
	   this.telef = telef;
   }
   
   String get_nombre ()
   {
	   return nombre;
   }
   
   String get_apellido ()
   {
	   return apellido;
   }
   
   String get_telef ()
   {
	   return telef;
   }
   
   void estado ()
   {
	   System.out.println(" " + nombre + " " + apellido + " " + telef);
   }
}
