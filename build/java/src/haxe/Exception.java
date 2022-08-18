package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Exception extends java.lang.RuntimeException implements haxe.lang.IHxObject
{
	public Exception(haxe.lang.EmptyObject empty)
	{
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		super(null, null);
	}
	
	
	public Exception(java.lang.String message, haxe.Exception previous, java.lang.Object _native)
	{
		//line 50 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		super(message, ((java.lang.Throwable) (((java.lang.Object) (( (( previous == null )) ? (null) : (previous) )) )) ));
		//line 51 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		this.__previousException = previous;
		//line 52 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		if (( ( ! (( _native == null )) ) && ( _native instanceof java.lang.Throwable ) )) 
		{
			//line 53 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			this.__nativeException = ((java.lang.Throwable) (((java.lang.Object) (_native) )) );
			//line 54 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			this.setStackTrace(this.__nativeException.getStackTrace());
		}
		else
		{
			//line 56 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			this.__nativeException = ((java.lang.Throwable) (((java.lang.Object) (this) )) );
		}
		
	}
	
	
	public static haxe.Exception caught(java.lang.Object value)
	{
		//line 22 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		if (( value instanceof haxe.Exception )) 
		{
			//line 23 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			return ((haxe.Exception) (((java.lang.Object) (value) )) );
		}
		else
		{
			//line 24 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			if (( value instanceof java.lang.Throwable )) 
			{
				//line 25 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				return new haxe.Exception(haxe.lang.Runtime.toString(((java.lang.Throwable) (((java.lang.Object) (value) )) ).getMessage()), ((haxe.Exception) (null) ), ((java.lang.Object) (value) ));
			}
			else
			{
				//line 27 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				return new haxe.ValueException(((java.lang.Object) (value) ), ((haxe.Exception) (null) ), ((java.lang.Object) (value) ));
			}
			
		}
		
	}
	
	
	public static java.lang.Object thrown(java.lang.Object value)
	{
		//line 32 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		if (( value instanceof haxe.Exception )) 
		{
			//line 33 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			java.lang.Throwable _native = ((haxe.Exception) (((java.lang.Object) (value) )) ).__nativeException;
			//line 34 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			if (haxe.root.Std.isOfType(_native, java.lang.RuntimeException.class)) 
			{
				//line 34 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				return ((java.lang.Object) (_native) );
			}
			else
			{
				//line 34 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				return value;
			}
			
		}
		else
		{
			//line 35 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			if (( value instanceof java.lang.RuntimeException )) 
			{
				//line 36 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				return value;
			}
			else
			{
				//line 37 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				if (( value instanceof java.lang.Throwable )) 
				{
					//line 38 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
					return ((java.lang.Object) (new haxe.Exception(haxe.lang.Runtime.toString(((java.lang.Throwable) (((java.lang.Object) (value) )) ).getMessage()), ((haxe.Exception) (null) ), ((java.lang.Object) (value) ))) );
				}
				else
				{
					//line 40 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
					haxe.ValueException e = new haxe.ValueException(((java.lang.Object) (value) ), ((haxe.Exception) (null) ), ((java.lang.Object) (null) ));
					//line 41 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
					java.lang.StackTraceElement[] stack = e.getStackTrace();
					//line 42 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
					if (( stack.length > 1 )) 
					{
						//line 43 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						e.setStackTrace(((java.lang.StackTraceElement[]) (java.util.Arrays.copyOfRange(((java.lang.StackTraceElement[]) (stack) ), ((int) (1) ), ((int) (stack.length) ))) ));
					}
					
					//line 45 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
					return ((java.lang.Object) (e) );
				}
				
			}
			
		}
		
	}
	
	
	
	
	public java.lang.Throwable __nativeException;
	
	public haxe.Exception __previousException;
	
	public java.lang.Object unwrap()
	{
		//line 61 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		return ((java.lang.Object) (this.__nativeException) );
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 65 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		return this.get_message();
	}
	
	
	public java.lang.String get_message()
	{
		//line 73 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		return this.getMessage();
	}
	
	
	public java.lang.Object __hx_lookupField(java.lang.String field, boolean throwErrors, boolean isCheck)
	{
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		if (isCheck) 
		{
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			return haxe.lang.Runtime.undefined;
		}
		else
		{
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			if (throwErrors) 
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				throw new java.lang.RuntimeException(haxe.lang.Runtime.toString("Field not found."));
			}
			else
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				return null;
			}
			
		}
		
	}
	
	
	public double __hx_lookupField_f(java.lang.String field, boolean throwErrors)
	{
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		if (throwErrors) 
		{
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			throw new java.lang.RuntimeException(haxe.lang.Runtime.toString("Field not found or incompatible field type."));
		}
		else
		{
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			return 0.0;
		}
		
	}
	
	
	public java.lang.Object __hx_lookupSetField(java.lang.String field, java.lang.Object value)
	{
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		throw new java.lang.RuntimeException(haxe.lang.Runtime.toString("Cannot access field for writing."));
	}
	
	
	public double __hx_lookupSetField_f(java.lang.String field, double value)
	{
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		throw new java.lang.RuntimeException(haxe.lang.Runtime.toString("Cannot access field for writing or incompatible type."));
	}
	
	
	public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		{
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				return this.__hx_lookupSetField_f(field, value);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		{
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			if (( field != null )) 
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				switch (field.hashCode())
				{
					case 1417202488:
					{
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						if (field.equals("__previousException")) 
						{
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							__temp_executeDef1 = false;
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							this.__previousException = ((haxe.Exception) (value) );
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							return value;
						}
						
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						break;
					}
					
					
					case -488799720:
					{
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						if (field.equals("__nativeException")) 
						{
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							__temp_executeDef1 = false;
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							this.__nativeException = ((java.lang.Throwable) (value) );
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							return value;
						}
						
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				return this.__hx_lookupSetField(field, value);
			}
			else
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		{
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			if (( field != null )) 
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				switch (field.hashCode())
				{
					case 1031438366:
					{
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						if (field.equals("get_message")) 
						{
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							__temp_executeDef1 = false;
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_message")) );
						}
						
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						break;
					}
					
					
					case 954925063:
					{
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						if (field.equals("message")) 
						{
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							__temp_executeDef1 = false;
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							return this.get_message();
						}
						
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						break;
					}
					
					
					case -1776922004:
					{
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						if (field.equals("toString")) 
						{
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							__temp_executeDef1 = false;
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
						}
						
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						break;
					}
					
					
					case -488799720:
					{
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						if (field.equals("__nativeException")) 
						{
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							__temp_executeDef1 = false;
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							return this.__nativeException;
						}
						
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						break;
					}
					
					
					case -840111517:
					{
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						if (field.equals("unwrap")) 
						{
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							__temp_executeDef1 = false;
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unwrap")) );
						}
						
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						break;
					}
					
					
					case 1417202488:
					{
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						if (field.equals("__previousException")) 
						{
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							__temp_executeDef1 = false;
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							return this.__previousException;
						}
						
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				return this.__hx_lookupField(field, throwErrors, isCheck);
			}
			else
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		{
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				return this.__hx_lookupField_f(field, throwErrors);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		{
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			if (( field != null )) 
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				switch (field.hashCode())
				{
					case -1776922004:
					{
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						if (field.equals("toString")) 
						{
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							__temp_executeDef1 = false;
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							return haxe.lang.Runtime.slowCallField(this, field, dynargs);
						}
						
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						break;
					}
					
					
					case -840111517:
					{
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						if (field.equals("unwrap")) 
						{
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							__temp_executeDef1 = false;
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							return this.unwrap();
						}
						
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						break;
					}
					
					
					case 1031438366:
					{
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						if (field.equals("get_message")) 
						{
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							__temp_executeDef1 = false;
							//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
							return this.get_message();
						}
						
						//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				return ((haxe.lang.Function) (this.__hx_getField(field, true, false, false)) ).__hx_invokeDynamic(dynargs);
			}
			else
			{
				//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		baseArr.push("__previousException");
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		baseArr.push("__nativeException");
		//line 11 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\haxe\\Exception.hx"
		baseArr.push("message");
	}
	
	
}


