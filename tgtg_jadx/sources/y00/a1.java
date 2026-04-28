package y00;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.z8;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends f4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f44578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(l4 l4Var, int i11) {
        super(l4Var);
        this.f44578e = i11;
    }

    @Override // y00.f4
    public final void s() {
        int i11 = this.f44578e;
    }

    public boolean t() {
        q();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((n1) this.f21216b).f44982a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void w(String str, g4 g4Var, z8 z8Var, y0 y0Var) {
        String str2;
        URL url;
        byte[] bArrA;
        l1 l1Var;
        Map map;
        String str3 = g4Var.f44829a;
        n1 n1Var = (n1) this.f21216b;
        p();
        q();
        try {
            url = new URI(str3).toURL();
            this.f44586c.k0();
            bArrA = z8Var.a();
            l1Var = n1Var.f44988g;
            n1.m(l1Var);
            map = g4Var.f44830b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            l1Var.B(new z0(this, str2, url, bArrA, map, y0Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.c("Failed to parse URL. Not uploading MeasurementBatch. appId", w0.x(str2), str3);
        }
    }

    private final void u() {
    }

    private final void v() {
    }
}
