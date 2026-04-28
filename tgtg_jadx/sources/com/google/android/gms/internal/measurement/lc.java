package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lc implements o30.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11601b;

    public /* synthetic */ lc(Object obj, int i11) {
        this.f11600a = i11;
        this.f11601b = obj;
    }

    @Override // o30.b0
    public final ListenableFuture apply(Object obj) throws IOException {
        switch (this.f11600a) {
            case 0:
                qc qcVar = (qc) this.f11601b;
                int i11 = ((zzmk) obj).f12099a;
                if ((i11 == 29501 || i11 == 29537 || i11 == 29538 || i11 == 29539 || i11 == 29540 || i11 == 29541 || i11 == 29542 || i11 == 29543 || i11 == 29544) && !qcVar.f11800h.b()) {
                    qcVar.b();
                }
                return o30.r0.f31913b;
            case 1:
                final jd jdVar = (jd) this.f11601b;
                final ld ldVar = (ld) obj;
                jdVar.getClass();
                Callable callable = new Callable() { // from class: com.google.android.gms.internal.measurement.id
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ld ldVar2 = ldVar;
                        jd jdVar2 = jdVar;
                        oa oaVar = jdVar2.f11521a;
                        i5 i5Var = new i5(6);
                        try {
                            wd wdVar = (wd) oaVar.f11706f.get();
                            Uri uri = jdVar2.f11522b;
                            i5 i5Var2 = new i5(ldVar2);
                            i5Var2.f11488c = new i5[]{i5Var};
                            return null;
                        } catch (IOException | RuntimeException e5) {
                            h.h(Level.WARNING, oaVar.a(), e5, "Failed to update snapshot for %s flags may be stale.", jdVar2.f11523c);
                            return null;
                        }
                    }
                };
                o30.x0 x0VarA = jdVar.f11521a.a();
                o30.d1 d1Var = new o30.d1(callable);
                x0VarA.execute(d1Var);
                return d1Var;
            case 2:
                return o30.o0.e((ListenableFuture) ((od) this.f11601b).f11718e.get());
            case 3:
                return o30.o0.d(((oc) this.f11601b).apply(obj));
            case 4:
                return ((oe) this.f11601b).f11727e.r0();
            default:
                IOException iOException = (IOException) this.f11601b;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}
