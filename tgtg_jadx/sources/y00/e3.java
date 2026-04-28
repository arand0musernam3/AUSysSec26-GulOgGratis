package y00;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.c6;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44738a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f44740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t4 f44741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f44742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m3 f44743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f44744g;

    public e3(m3 m3Var, String str, String str2, t4 t4Var, boolean z11, c6 c6Var) {
        this.f44739b = str;
        this.f44740c = str2;
        this.f44741d = t4Var;
        this.f44742e = z11;
        this.f44744g = c6Var;
        this.f44743f = m3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        r4 r4Var;
        j0 j0Var;
        n1 n1Var;
        AtomicReference atomicReference;
        m3 m3Var;
        j0 j0Var2;
        switch (this.f44738a) {
            case 0:
                String str = this.f44740c;
                String str2 = this.f44739b;
                c6 c6Var = (c6) this.f44744g;
                m3 m3Var2 = this.f44743f;
                Bundle bundle = new Bundle();
                try {
                    try {
                        j0Var = m3Var2.f44962e;
                        n1Var = (n1) m3Var2.f21216b;
                    } catch (RemoteException e5) {
                        e = e5;
                    }
                    if (j0Var == null) {
                        w0 w0Var = n1Var.f44987f;
                        n1.m(w0Var);
                        w0Var.f45260g.c("Failed to get user properties; not connected to service", str2, str);
                        r4Var = n1Var.f44990i;
                        n1.k(r4Var);
                        r4Var.i0(c6Var, bundle);
                        return;
                    }
                    List<o4> listJ = j0Var.j(str2, str, this.f44742e, this.f44741d);
                    Bundle bundle2 = new Bundle();
                    if (listJ != null) {
                        for (o4 o4Var : listJ) {
                            String str3 = o4Var.f45055e;
                            String str4 = o4Var.f45052b;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l = o4Var.f45054d;
                                if (l != null) {
                                    bundle2.putLong(str4, l.longValue());
                                } else {
                                    Double d3 = o4Var.f45057g;
                                    if (d3 != null) {
                                        bundle2.putDouble(str4, d3.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        m3Var2.C();
                        r4 r4Var2 = n1Var.f44990i;
                        n1.k(r4Var2);
                        r4Var2.i0(c6Var, bundle2);
                        return;
                    } catch (RemoteException e11) {
                        e = e11;
                        bundle = bundle2;
                        w0 w0Var2 = ((n1) m3Var2.f21216b).f44987f;
                        n1.m(w0Var2);
                        w0Var2.f45260g.c("Failed to get user properties; remote exception", str2, e);
                        r4Var = ((n1) m3Var2.f21216b).f44990i;
                        n1.k(r4Var);
                        r4Var.i0(c6Var, bundle);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        bundle = bundle2;
                        r4 r4Var3 = ((n1) m3Var2.f21216b).f44990i;
                        n1.k(r4Var3);
                        r4Var3.i0(c6Var, bundle);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f44744g;
                synchronized (atomicReference2) {
                    try {
                        try {
                            m3Var = this.f44743f;
                            j0Var2 = m3Var.f44962e;
                        } catch (RemoteException e12) {
                            w0 w0Var3 = ((n1) this.f44743f.f21216b).f44987f;
                            n1.m(w0Var3);
                            w0Var3.f45260g.d("(legacy) Failed to get user properties; remote exception", null, this.f44739b, e12);
                            ((AtomicReference) this.f44744g).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f44744g;
                        }
                        if (j0Var2 == null) {
                            w0 w0Var4 = ((n1) m3Var.f21216b).f44987f;
                            n1.m(w0Var4);
                            w0Var4.f45260g.d("(legacy) Failed to get user properties; not connected to service", null, this.f44739b, this.f44740c);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(j0Var2.j(this.f44739b, this.f44740c, this.f44742e, this.f44741d));
                        } else {
                            atomicReference2.set(j0Var2.g(null, this.f44739b, this.f44740c, this.f44742e));
                        }
                        m3Var.C();
                        atomicReference = (AtomicReference) this.f44744g;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th4) {
                        ((AtomicReference) this.f44744g).notify();
                        throw th4;
                    }
                }
        }
    }

    public e3(m3 m3Var, AtomicReference atomicReference, String str, String str2, t4 t4Var, boolean z11) {
        this.f44744g = atomicReference;
        this.f44739b = str;
        this.f44740c = str2;
        this.f44741d = t4Var;
        this.f44742e = z11;
        this.f44743f = m3Var;
    }
}
