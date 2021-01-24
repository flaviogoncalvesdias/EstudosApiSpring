package restSpringUdemy;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restSpringUdemy.exception.UnsuportedMathOperationExcepion;


@RestController
public class MathController {

	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationExcepion("Plaease set a numeric value!");
		}
	return Double.parseDouble(numberOne) +  Double.parseDouble(numberTwo);
	
	}
	
	@RequestMapping(value="/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationExcepion("Plaease set a numeric value!");
		}
	return Double.parseDouble(numberOne) -  Double.parseDouble(numberTwo);
	
	}
	
	@RequestMapping(value="/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationExcepion("Plaease set a numeric value!");
		}
	return Double.parseDouble(numberOne) /  Double.parseDouble(numberTwo);
	
	}
	
	@RequestMapping(value="/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo) ) {
			throw new UnsuportedMathOperationExcepion("Plaease set a numeric value!");
		}
	return Double.parseDouble(numberOne) *  Double.parseDouble(numberTwo);
	
	}
	
	@RequestMapping(value="/raiz/{numberOne}", method = RequestMethod.GET)
	public Double raiz(@PathVariable("numberOne") String numberOne) {
		if (!isNumeric(numberOne) ) {
			throw new UnsuportedMathOperationExcepion("Plaease set a numeric value!");
		}
		
		
	return   Math.sqrt(Double.parseDouble(numberOne));
	
	}
	
	private boolean isNumeric(String number) {
		if (number == null)
		return false;
		String stgNumber = number.replaceAll(",", ".");
		return stgNumber.matches("[-+]?[0-9]*\\.?[0-9]+");

	}

}
