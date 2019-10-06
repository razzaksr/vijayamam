package dayten.mvc;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionInfo 
{
	@ExceptionHandler(value=ProductNotRequiredException.class)
	public String myOwn(Exception e)
	{
		System.out.println(e);
		return "productException";
	}
	@ExceptionHandler(value=NullPointerException.class)
	public String numFor(Exception e)
	{
		System.out.println(e);
		return "number";
	}
	@ExceptionHandler(value=Exception.class)
	public String all(Exception e)
	{
		System.out.println(e);
		return "default";
	}
}
