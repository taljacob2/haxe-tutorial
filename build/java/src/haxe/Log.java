package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Log extends haxe.lang.HxObject
{
	static
	{
		//line 62 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
		haxe.Log.trace = ( (( haxe.Log_Anon_62__Fun.__hx_current != null )) ? (haxe.Log_Anon_62__Fun.__hx_current) : (haxe.Log_Anon_62__Fun.__hx_current = ((haxe.Log_Anon_62__Fun) (new haxe.Log_Anon_62__Fun()) )) );
	}
	
	public Log(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Log()
	{
		//line 29 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
		haxe.Log.__hx_ctor_haxe_Log(this);
	}
	
	
	protected static void __hx_ctor_haxe_Log(haxe.Log __hx_this)
	{
	}
	
	
	public static java.lang.String formatOutput(java.lang.Object v, java.lang.Object infos)
	{
		//line 34 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
		java.lang.String str = haxe.root.Std.string(v);
		//line 35 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
		if (( infos == null )) 
		{
			//line 36 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
			return str;
		}
		
		//line 37 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
		java.lang.String pstr = ( ( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(infos, "fileName", true)) + ":" ) + ((int) (haxe.lang.Runtime.getField_f(infos, "lineNumber", true)) ) );
		//line 38 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
		if (( ((haxe.root.Array) (haxe.lang.Runtime.getField(infos, "customParams", true)) ) != null )) 
		{
			//line 39 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
			int _g = 0;
			//line 39 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
			haxe.root.Array _g1 = ((haxe.root.Array) (haxe.lang.Runtime.getField(infos, "customParams", true)) );
			//line 39 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
			while (( _g < _g1.length ))
			{
				//line 39 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
				java.lang.Object v1 = _g1.__get(_g);
				//line 39 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
				 ++ _g;
				//line 40 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
				str += ( ", " + haxe.root.Std.string(v1) );
			}
			
		}
		
		//line 41 "I:\\Tal\\Haxe\\Installation\\haxe\\std\\haxe\\Log.hx"
		return ( ( pstr + ": " ) + str );
	}
	
	
	public static haxe.lang.Function trace;
	
}


