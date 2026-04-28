package qz;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f37372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d10.g f37373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f37374d;

    public n0(int i11, u uVar, d10.g gVar, r rVar) {
        super(i11);
        this.f37373c = gVar;
        this.f37372b = uVar;
        this.f37374d = rVar;
        if (i11 == 2 && uVar.shouldAutoResolveMissingFeatures()) {
            i4.a.f("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // qz.o0
    public final void a(Status status) {
        ((l20.c) this.f37374d).getClass();
        this.f37373c.c(com.google.android.gms.common.internal.i0.l(status));
    }

    @Override // qz.o0
    public final void b(Exception exc) {
        this.f37373c.c(exc);
    }

    @Override // qz.o0
    public final void c(oz.m mVar, boolean z11) {
        Boolean boolValueOf = Boolean.valueOf(z11);
        Map map = (Map) mVar.f33837c;
        d10.g gVar = this.f37373c;
        map.put(gVar, boolValueOf);
        gVar.f13697a.addOnCompleteListener(new oz.m(mVar, gVar));
    }

    @Override // qz.o0
    public final void d(z zVar) throws DeadObjectException {
        d10.g gVar = this.f37373c;
        try {
            this.f37372b.doExecute(zVar.f37403h, gVar);
        } catch (DeadObjectException e5) {
            throw e5;
        } catch (RemoteException e11) {
            a(o0.e(e11));
        } catch (RuntimeException e12) {
            gVar.c(e12);
        }
    }

    @Override // qz.e0
    public final pz.d[] f(z zVar) {
        return this.f37372b.zaa();
    }

    @Override // qz.e0
    public final boolean g(z zVar) {
        return this.f37372b.shouldAutoResolveMissingFeatures();
    }
}
