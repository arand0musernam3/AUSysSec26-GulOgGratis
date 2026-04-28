package y00;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45138a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f45141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f45142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f45143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f45144g;

    public /* synthetic */ t0(String str, y0 y0Var, int i11, IOException iOException, byte[] bArr, Map map) {
        com.google.android.gms.common.internal.i0.h(y0Var);
        this.f45141d = y0Var;
        this.f45139b = i11;
        this.f45142e = iOException;
        this.f45143f = bArr;
        this.f45140c = str;
        this.f45144g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45138a) {
            case 0:
                w0 w0Var = (w0) this.f45144g;
                e1 e1Var = ((n1) w0Var.f21216b).f44986e;
                n1.k(e1Var);
                if (!e1Var.f45268c) {
                    Log.println(6, w0Var.z(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (w0Var.f45257d == 0) {
                    g gVar = ((n1) w0Var.f21216b).f44985d;
                    if (gVar.f44761f == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.f44761f == null) {
                                    n1 n1Var = (n1) gVar.f21216b;
                                    ApplicationInfo applicationInfo = n1Var.f44982a.getApplicationInfo();
                                    String strA = vz.d.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        gVar.f44761f = Boolean.valueOf(str != null && str.equals(strA));
                                    }
                                    if (gVar.f44761f == null) {
                                        gVar.f44761f = Boolean.TRUE;
                                        w0 w0Var2 = n1Var.f44987f;
                                        n1.m(w0Var2);
                                        w0Var2.f45260g.a("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (gVar.f44761f.booleanValue()) {
                        w0Var.f45257d = 'C';
                    } else {
                        w0Var.f45257d = 'c';
                    }
                    break;
                }
                if (w0Var.f45258e < 0) {
                    ((n1) w0Var.f21216b).f44985d.v();
                    w0Var.f45258e = 161000L;
                }
                int i11 = this.f45139b;
                char c3 = w0Var.f45257d;
                long j9 = w0Var.f45258e;
                String str2 = this.f45140c;
                Object obj = this.f45141d;
                Object obj2 = this.f45142e;
                Object obj3 = this.f45143f;
                char cCharAt = "01VDIWEA?".charAt(i11);
                String strA2 = w0.A(true, str2, obj, obj2, obj3);
                StringBuilder sb2 = new StringBuilder(org.bouncycastle.jcajce.provider.asymmetric.a.C(String.valueOf(cCharAt).length() + 1, String.valueOf(c3).length(), String.valueOf(j9).length(), 1) + strA2.length());
                sb2.append("2");
                sb2.append(cCharAt);
                sb2.append(c3);
                sb2.append(j9);
                sb2.append(":");
                sb2.append(strA2);
                String string = sb2.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                u90.j jVar = e1Var.f44710f;
                if (jVar != null) {
                    String str3 = (String) jVar.f40916d;
                    e1 e1Var2 = (e1) jVar.f40917e;
                    e1Var2.p();
                    if (((e1) jVar.f40917e).t().getLong((String) jVar.f40914b, 0L) == 0) {
                        jVar.f();
                    }
                    SharedPreferences sharedPreferencesT = e1Var2.t();
                    String str4 = (String) jVar.f40915c;
                    long j11 = sharedPreferencesT.getLong(str4, 0L);
                    if (j11 <= 0) {
                        SharedPreferences.Editor editorEdit = e1Var2.t().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    r4 r4Var = ((n1) e1Var2.f21216b).f44990i;
                    n1.k(r4Var);
                    long jNextLong = r4Var.p0().nextLong() & LongCompanionObject.MAX_VALUE;
                    long j12 = j11 + 1;
                    long j13 = LongCompanionObject.MAX_VALUE / j12;
                    SharedPreferences.Editor editorEdit2 = e1Var2.t().edit();
                    if (jNextLong < j13) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j12);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((y0) this.f45141d).c(this.f45140c, this.f45139b, (Throwable) this.f45142e, (byte[]) this.f45143f, (Map) this.f45144g);
                return;
        }
    }

    public t0(w0 w0Var, int i11, String str, Object obj, Object obj2, Object obj3) {
        this.f45139b = i11;
        this.f45140c = str;
        this.f45141d = obj;
        this.f45142e = obj2;
        this.f45143f = obj3;
        this.f45144g = w0Var;
    }
}
