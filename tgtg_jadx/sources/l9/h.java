package l9;

import android.net.Uri;
import android.os.Bundle;
import g9.v;
import g9.y;
import g9.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f27559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f27561c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f27562d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t f27565g;

    public h(z zVar) {
        this.f27559a = zVar;
    }

    public final y a(String str) {
        v vVar;
        str.getClass();
        t tVar = this.f27565g;
        if (tVar == null || (vVar = (v) tVar.getValue()) == null) {
            return null;
        }
        int i11 = z.f20256f;
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        uri.getClass();
        Bundle bundleD = vVar.d(uri, this.f27562d);
        if (bundleD == null) {
            return null;
        }
        return new y(this.f27559a, bundleD, vVar.f20244p, vVar.b(uri), false, -1);
    }
}
