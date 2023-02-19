package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CalculadoraEDTest {
public void escenario() {
	CerebroCalculadoraED calc=new CerebroCalculadoraED();
}
@Test
 void testOperarSuma() {
	calc.operarSuma(Operaciones.SUMAR);
  double esperado=5;
  assertEquals(esperado,calc.getResultado());
}

@Test
public void testOperarResta() {
	calc.operarResta(Operaciones.RESTAR;
  assertEquals(0, calc.getResultado());
}

@Test
 void testOperarMultiplicar() {
	calc.operarMultiplica(Operaciones.MULTIPLICAR);
  assertEquals(2, (calc.getResultado());
}

@Test
 void testOperarDividir() {
  calc.operarDivide(Operaciones.DIVIDIR);
  assertEquals(1, calc.getResultado());
}
}