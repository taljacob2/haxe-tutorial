package haxe.exceptions;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NotImplementedException extends haxe.exceptions.PosException
{
	public NotImplementedException(haxe.lang.EmptyObject empty)
	{
		//line 6 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\exceptions\\NotImplementedException.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public NotImplementedException(java.lang.String message, haxe.Exception previous, java.lang.Object pos)
	{
		//line 8 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\exceptions\\NotImplementedException.hx"
		super(haxe.lang.Runtime.toString(( (( message == null )) ? ("Not implemented") : (message) )), ((haxe.Exception) (( (( previous == null )) ? (null) : (previous) )) ), ((java.lang.Object) (( (( pos == null )) ? (null) : (pos) )) ));
		//line 8 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\exceptions\\NotImplementedException.hx"
		if (( message == null )) 
		{
			//line 8 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\exceptions\\NotImplementedException.hx"
			message = "Not implemented";
		}
		
	}
	
	
}


