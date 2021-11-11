public class Flauta extends InstrumentoViento{
  //Podemos sobreescribir algún método y agregar funcionalidad

  public Flauta(){}

  public void limpiar(){
    System.out.println("Limpiando la Flauta");
  }

  @Override
  public String tipoInstrumento(){
    return "Flauta";
  }

  @Override
  public String toString(){
    return "Flauta{}";
  }
}