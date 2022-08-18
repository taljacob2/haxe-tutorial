package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Type extends haxe.lang.HxObject
{
	public Type(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Type()
	{
		//line 39 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\Type.hx"
		haxe.root.Type.__hx_ctor__Type(this);
	}
	
	
	protected static void __hx_ctor__Type(haxe.root.Type __hx_this)
	{
	}
	
	
	public static java.lang.Class getEnum(java.lang.Object o)
	{
		//line 48 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\Type.hx"
		if (( ( o instanceof java.lang.Enum ) || ( o instanceof haxe.lang.Enum ) )) 
		{
			//line 49 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\Type.hx"
			return o.getClass();
		}
		
		//line 51 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\java\\_std\\Type.hx"
		return null;
	}
	
	
	public static haxe.root.Array<java.lang.String> getClassFields(java.lang.Class c)
	{
		
		Array<String> ret = new Array<String>();
		if (c == java.lang.String.class)
		{
			ret.push("fromCharCode");
			return ret;
		}

		for (java.lang.reflect.Field f : c.getDeclaredFields())
		{
			java.lang.String fname = f.getName();
			if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && !fname.startsWith("__hx_"))
			ret.push(fname);
		}

		for (java.lang.reflect.Method m : c.getDeclaredMethods())
		{
			if (m.getDeclaringClass() == java.lang.Object.class)
				continue;
			java.lang.String mname = m.getName();
			if (java.lang.reflect.Modifier.isStatic(m.getModifiers()) && !mname.startsWith("__hx_"))
				ret.push(mname);
		}

		return ret;
	
	}
	
	
	public static <T> boolean enumEq(T a, T b)
	{
		
			if (a instanceof haxe.lang.Enum)
				return a.equals(b);
			else
				return haxe.lang.Runtime.eq(a, b);
	
	}
	
	
	public static int enumIndex(java.lang.Object e)
	{
		
		if (e instanceof java.lang.Enum)
			return ((java.lang.Enum) e).ordinal();
		else
			return ((haxe.lang.Enum) e).index;
	
	}
	
	
}


