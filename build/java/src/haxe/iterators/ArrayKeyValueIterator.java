package haxe.iterators;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ArrayKeyValueIterator<T> extends haxe.lang.HxObject
{
	public ArrayKeyValueIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ArrayKeyValueIterator(haxe.root.Array<T> array)
	{
		//line 30 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
		haxe.iterators.ArrayKeyValueIterator.__hx_ctor_haxe_iterators_ArrayKeyValueIterator(((haxe.iterators.ArrayKeyValueIterator<T>) (this) ), ((haxe.root.Array<T>) (array) ));
		//line 30 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	protected static <T_c> void __hx_ctor_haxe_iterators_ArrayKeyValueIterator(haxe.iterators.ArrayKeyValueIterator<T_c> __hx_this, haxe.root.Array<T_c> array)
	{
		//line 32 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
		__hx_this.array = array;
	}
	
	
	public haxe.root.Array<T> array;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
		{
			//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
			if (( field != null )) 
			{
				//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
				switch (field.hashCode())
				{
					case 93090393:
					{
						//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
						if (field.equals("array")) 
						{
							//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
							__temp_executeDef1 = false;
							//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
							this.array = ((haxe.root.Array<T>) (value) );
							//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
							return value;
						}
						
						//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
		{
			//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
			if (( field != null )) 
			{
				//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
				switch (field.hashCode())
				{
					case 93090393:
					{
						//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
						if (field.equals("array")) 
						{
							//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
							__temp_executeDef1 = false;
							//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
							return this.array;
						}
						
						//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
		baseArr.push("array");
		//line 26 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\iterators\\ArrayKeyValueIterator.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


