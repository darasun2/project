package crc64cc674e0f4e513851;


public class MyWebViewRenderer
	extends crc643f46942d9dd1fff9.WebViewRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Geocult.Droid.MyWebViewRenderer, Geocult.Android", MyWebViewRenderer.class, __md_methods);
	}


	public MyWebViewRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MyWebViewRenderer.class)
			mono.android.TypeManager.Activate ("Geocult.Droid.MyWebViewRenderer, Geocult.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MyWebViewRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MyWebViewRenderer.class)
			mono.android.TypeManager.Activate ("Geocult.Droid.MyWebViewRenderer, Geocult.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public MyWebViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MyWebViewRenderer.class)
			mono.android.TypeManager.Activate ("Geocult.Droid.MyWebViewRenderer, Geocult.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
