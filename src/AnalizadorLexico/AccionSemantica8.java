package AnalizadorLexico;

public class AccionSemantica8 extends AccionSemantica{
	// CONCATENA Y AGREGA EN LA TABLA DE SIMBOLOS DE UNA, ES PARA TOKENS QUE PASAN DIRECTO AL ESTADO FINAL

	public void Ejecutar(String buffer, char c){
		buffer=buffer + c;
		if(Analizador_Lexico.tablaSimbolos.contains(buffer)){
			// RETURN tablaSimbolos.get(buffer);
		}
		else
			Analizador_Lexico.tablaSimbolos.add(buffer);
			//return tablaSimbolos.get(buffer);
	}
}