package at;

import android.net.Uri;
import android.os.Bundle;
import com.app.tgtg.feature.webview.ui.WebViewActivity;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f70.g f4769a;

    public c0(f70.g gVar) {
        gVar.getClass();
        this.f4769a = gVar;
    }

    public static /* synthetic */ void c(c0 c0Var, String str, ct.a aVar, Integer num, boolean z11, int i11) {
        if ((i11 & 2) != 0) {
            aVar = ct.a.UNKNOWN;
        }
        ct.a aVar2 = aVar;
        if ((i11 & 4) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        c0Var.b(str, aVar2, num2, z11, null);
    }

    public final void a(Uri uri) {
        uri.getClass();
        this.f4769a.a(new f70.o(uri));
    }

    public final void b(String str, ct.a aVar, Integer num, boolean z11, String str2) {
        aVar.getClass();
        ct.a aVar2 = ct.a.ALLERGENS;
        Bundle bundleX = jb.u.x(new Pair("DESTINATION", aVar), new Pair("URL", str), new Pair("ALLOW_ZOOM", Boolean.valueOf(z11)), new Pair("STRING_TITLE", str2));
        if (num != null) {
            bundleX.putInt("TITLE", num.intValue());
        }
        this.f4769a.a(new f70.b(WebViewActivity.class, bundleX, false, false, false, null, null, null, null, true, 508));
    }
}
