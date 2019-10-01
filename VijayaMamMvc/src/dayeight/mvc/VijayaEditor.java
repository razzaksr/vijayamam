package dayeight.mvc;

import java.beans.PropertyEditorSupport;

public class VijayaEditor extends PropertyEditorSupport
{

	@Override
	public void setAsText(String a) throws IllegalArgumentException 
	{
		if(a.contains("Mr. ")||a.contains("Mrs. ")||a.contains("Miss. "))
		{
			setValue(a);
		}
		else
		{a="Ms. "+a;setValue(a);}
	}
}
