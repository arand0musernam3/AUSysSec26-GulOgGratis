package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class od {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f11712j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f11713k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.l f11715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.l f11716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j30.l f11717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j30.l f11718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j30.l f11719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f11720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile qb f11721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f11722i;

    public od(Context context, j30.l lVar, j30.l lVar2, j30.l lVar3) {
        this.f11714a = context;
        this.f11716c = lVar;
        this.f11715b = lVar3;
        this.f11717d = lVar2;
        Pattern pattern = ae.f11256a;
        zw.q2 q2Var = new zw.q2(context);
        q2Var.s0("phenotype_storage_info");
        q2Var.t0("storage-info.pb");
        this.f11720g = q2Var.u0();
        zw.q2 q2Var2 = new zw.q2(context);
        q2Var2.s0("phenotype_storage_info");
        q2Var2.t0("device-encrypted-storage-info.pb");
        Set set = ae.f11259d;
        la.e(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        q2Var2.f48334b = "directboot-files";
        this.f11722i = q2Var2.u0();
        this.f11718e = o00.h0.C(new s5(this, 16));
        this.f11719f = o00.h0.C(new ra(lVar, 1));
    }

    public final void a() {
        if (!fa.s(this.f11714a) || c().x() + 86400000 >= System.currentTimeMillis()) {
            o30.r0 r0Var = o30.r0.f31913b;
            return;
        }
        o30.x0 x0Var = (o30.x0) this.f11716c.get();
        x0Var.getClass();
        ListenableFuture listenableFutureE = o30.o0.e((ListenableFuture) this.f11719f.get());
        int i11 = o30.k0.f31897h;
        o30.o0.f(listenableFutureE instanceof o30.k0 ? (o30.k0) listenableFutureE : new o30.l0(listenableFutureE), new lc(this, 2), x0Var);
    }

    public final hd b() {
        qb qbVarC = c();
        return new hd(qbVarC.v(), k30.h.m(qbVarC.A()), qbVarC.u(), qbVarC.w(), (qbVarC.B() && qbVarC.C().u() == ((long) Build.VERSION.SDK_INT)) ? qbVarC.C().t() : "", k30.h.m(qbVarC.y()), k30.h.m(qbVarC.z()), qbVarC.t(), qbVarC.E(), qbVarC.D(), qbVarC.F());
    }

    public final qb c() {
        qb qbVarH;
        qb qbVar = this.f11721h;
        if (qbVar != null) {
            return qbVar;
        }
        synchronized (f11712j) {
            qbVarH = this.f11721h;
            if (qbVarH == null) {
                qbVarH = qb.H();
                if (fa.s(this.f11714a)) {
                    h2 h2Var = (h2) qbVarH.s(7);
                    c1 c1Var = c1.f11297a;
                    int i11 = p0.f11740a;
                    c1 c1Var2 = c1.f11298b;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream inputStreamD = gg.d(((wd) this.f11717d.get()).b(this.f11720g));
                        try {
                            k1 k1VarA = ((j1) h2Var).a(inputStreamD, c1Var2);
                            if (inputStreamD != null) {
                                inputStreamD.close();
                            }
                            qbVarH = (qb) k1VarA;
                        } catch (Throwable th2) {
                            if (inputStreamD != null) {
                                try {
                                    inputStreamD.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (IOException unused) {
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    this.f11721h = qbVarH;
                }
            }
        }
        return qbVarH;
    }
}
