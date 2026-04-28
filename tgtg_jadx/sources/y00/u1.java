package y00;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.c6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45204a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f45205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t4 f45206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f45208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f45209f;

    public /* synthetic */ u1(v1 v1Var, t4 t4Var, Bundle bundle, l0 l0Var, String str) {
        this.f45207d = v1Var;
        this.f45206c = t4Var;
        this.f45208e = bundle;
        this.f45209f = l0Var;
        this.f45205b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        m3 m3Var;
        j0 j0Var;
        r4 r4Var;
        j0 j0Var2;
        switch (this.f45204a) {
            case 0:
                v1 v1Var = (v1) this.f45207d;
                t4 t4Var = this.f45206c;
                Bundle bundle = (Bundle) this.f45208e;
                l0 l0Var = (l0) this.f45209f;
                String str = this.f45205b;
                l4 l4Var = v1Var.f45249g;
                l4Var.W();
                try {
                    l0Var.G(l4Var.e0(bundle, t4Var));
                    return;
                } catch (RemoteException e5) {
                    l4Var.b().f45260g.c("Failed to return trigger URIs for app", str, e5);
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.f45207d;
                synchronized (atomicReference2) {
                    try {
                        try {
                            m3Var = (m3) this.f45209f;
                            j0Var = m3Var.f44962e;
                        } catch (RemoteException e11) {
                            w0 w0Var = ((n1) ((m3) this.f45209f).f21216b).f44987f;
                            n1.m(w0Var);
                            w0Var.f45260g.d("(legacy) Failed to get conditional properties; remote exception", null, this.f45205b, e11);
                            ((AtomicReference) this.f45207d).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f45207d;
                        }
                        if (j0Var == null) {
                            w0 w0Var2 = ((n1) m3Var.f21216b).f44987f;
                            n1.m(w0Var2);
                            w0Var2.f45260g.d("(legacy) Failed to get conditional properties; not connected to service", null, this.f45205b, (String) this.f45208e);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(j0Var.y(this.f45205b, (String) this.f45208e, this.f45206c));
                        } else {
                            atomicReference2.set(j0Var.m(null, this.f45205b, (String) this.f45208e));
                        }
                        m3Var.C();
                        atomicReference = (AtomicReference) this.f45207d;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th2) {
                        ((AtomicReference) this.f45207d).notify();
                        throw th2;
                    }
                }
            default:
                c6 c6Var = (c6) this.f45208e;
                String str2 = (String) this.f45207d;
                String str3 = this.f45205b;
                m3 m3Var2 = (m3) this.f45209f;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        j0Var2 = m3Var2.f44962e;
                    } catch (Throwable th3) {
                        r4 r4Var2 = ((n1) m3Var2.f21216b).f44990i;
                        n1.k(r4Var2);
                        r4Var2.j0(c6Var, arrayList);
                        throw th3;
                    }
                } catch (RemoteException e12) {
                    w0 w0Var3 = ((n1) m3Var2.f21216b).f44987f;
                    n1.m(w0Var3);
                    w0Var3.f45260g.d("Failed to get conditional properties; remote exception", str3, str2, e12);
                }
                if (j0Var2 != null) {
                    arrayList = r4.k0(j0Var2.y(str3, str2, this.f45206c));
                    m3Var2.C();
                    r4Var = ((n1) m3Var2.f21216b).f44990i;
                    n1.k(r4Var);
                    r4Var.j0(c6Var, arrayList);
                    return;
                }
                n1 n1Var = (n1) m3Var2.f21216b;
                w0 w0Var4 = n1Var.f44987f;
                n1.m(w0Var4);
                w0Var4.f45260g.c("Failed to get conditional properties; not connected to service", str3, str2);
                r4Var = n1Var.f44990i;
                n1.k(r4Var);
                r4Var.j0(c6Var, arrayList);
                return;
        }
    }

    public u1(m3 m3Var, String str, String str2, t4 t4Var, c6 c6Var) {
        this.f45205b = str;
        this.f45207d = str2;
        this.f45206c = t4Var;
        this.f45208e = c6Var;
        this.f45209f = m3Var;
    }

    public u1(m3 m3Var, AtomicReference atomicReference, String str, String str2, t4 t4Var) {
        this.f45207d = atomicReference;
        this.f45205b = str;
        this.f45208e = str2;
        this.f45206c = t4Var;
        this.f45209f = m3Var;
    }
}
