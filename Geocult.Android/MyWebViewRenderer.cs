using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Geocult.Droid;
using Geocult.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

[assembly: ExportRenderer(typeof(MyWebView), typeof(MyWebViewRenderer))]


namespace Geocult.Droid
{
    public class MyWebViewRenderer : WebViewRenderer
    {
        public MyWebViewRenderer(Context context) : base(context)
        {

        }

        protected override void OnElementChanged(ElementChangedEventArgs<WebView> e)
        {
            base.OnElementChanged(e);


            if (Control != null)
            {

                //For Cache
                Control.Settings.CacheMode = Android.Webkit.CacheModes.CacheElseNetwork;
                Control.Settings.JavaScriptEnabled = true;

                Control.Settings.SetSupportMultipleWindows(false);

                //Control.Settings.SetSupportMultipleWindows(true);

            }

        }





    }
}