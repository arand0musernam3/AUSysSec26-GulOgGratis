package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oc implements j30.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11711b;

    public /* synthetic */ oc(Object obj, int i11) {
        this.f11710a = i11;
        this.f11711b = obj;
    }

    @Override // j30.e
    public final Object apply(Object obj) {
        switch (this.f11710a) {
            case 0:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((qc) this.f11711b).f11795c)), (Throwable) obj);
                return null;
            case 1:
                zb zbVar = (zb) obj;
                ve veVar = wc.f12003a;
                String str = (String) this.f11711b;
                vb vbVar = (vb) zbVar.t(str, wb.u()).k();
                if (!Collections.unmodifiableList(((wb) vbVar.f11483b).t()).contains("")) {
                    vbVar.b();
                    ((wb) vbVar.f11483b).v("");
                }
                yb ybVar = (yb) zbVar.k();
                vbVar.b();
                ((wb) vbVar.f11483b).w("");
                wb wbVar = (wb) vbVar.d();
                ybVar.b();
                ((zb) ybVar.f11483b).v().put(str, wbVar);
                return (zb) ybVar.d();
            default:
                od odVar = (od) this.f11711b;
                ub ubVar = (ub) obj;
                i5 i5Var = new i5(6);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (od.f11712j) {
                            wd wdVar = (wd) odVar.f11717d.get();
                            Uri uri = odVar.f11720g;
                            i5 i5Var2 = new i5(ubVar.t());
                            i5Var2.f11488c = new i5[]{i5Var};
                            wdVar.a(uri, i5Var2);
                            odVar.f11721h = ubVar.t();
                            break;
                        }
                        synchronized (od.f11713k) {
                            wd wdVar2 = (wd) odVar.f11717d.get();
                            Uri uri2 = odVar.f11722i;
                            i5 i5Var3 = new i5(ubVar.u());
                            i5Var3.f11488c = new i5[]{i5Var};
                            wdVar2.a(uri2, i5Var3);
                            ubVar.u();
                            break;
                        }
                        return null;
                    } catch (IOException e5) {
                        throw new RuntimeException(e5);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
        }
    }
}
