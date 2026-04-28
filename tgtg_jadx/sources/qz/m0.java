package qz;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d10.g f37369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f37371d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(k kVar, d10.g gVar) {
        this(4, gVar);
        this.f37370c = 1;
        this.f37371d = kVar;
    }

    @Override // qz.o0
    public final void a(Status status) {
        this.f37369b.c(new ApiException(status));
    }

    @Override // qz.o0
    public final void b(Exception exc) {
        this.f37369b.c(exc);
    }

    @Override // qz.o0
    public final /* bridge */ /* synthetic */ void c(oz.m mVar, boolean z11) {
        int i11 = this.f37370c;
    }

    @Override // qz.o0
    public final void d(z zVar) throws DeadObjectException {
        try {
            j(zVar);
        } catch (DeadObjectException e5) {
            a(o0.e(e5));
            throw e5;
        } catch (RemoteException e11) {
            a(o0.e(e11));
        } catch (RuntimeException e12) {
            this.f37369b.c(e12);
        }
    }

    @Override // qz.e0
    public final pz.d[] f(z zVar) {
        switch (this.f37370c) {
            case 0:
                return ((g0) this.f37371d).f37350a.f37376b;
            default:
                g0 g0Var = (g0) zVar.l.get((k) this.f37371d);
                if (g0Var == null) {
                    return null;
                }
                return g0Var.f37350a.f37376b;
        }
    }

    @Override // qz.e0
    public final boolean g(z zVar) {
        switch (this.f37370c) {
            case 0:
                return ((g0) this.f37371d).f37350a.f37377c;
            default:
                g0 g0Var = (g0) zVar.l.get((k) this.f37371d);
                return g0Var != null && g0Var.f37350a.f37377c;
        }
    }

    public final void j(z zVar) {
        switch (this.f37370c) {
            case 0:
                g0 g0Var = (g0) this.f37371d;
                o oVar = g0Var.f37350a;
                ((q) ((h0) oVar).f37353e.f5849c).accept(zVar.f37403h, this.f37369b);
                k kVar = oVar.f37375a.f37368b;
                if (kVar != null) {
                    zVar.l.put(kVar, g0Var);
                }
                break;
            default:
                g0 g0Var2 = (g0) zVar.l.remove((k) this.f37371d);
                if (g0Var2 == null) {
                    this.f37369b.d(Boolean.FALSE);
                } else {
                    ((q) ((i0) g0Var2.f37351b).f37355b.f5850d).accept(zVar.f37403h, this.f37369b);
                    g0Var2.f37350a.f37375a.f37368b = null;
                }
                break;
        }
    }

    public m0(int i11, d10.g gVar) {
        super(i11);
        this.f37369b = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(g0 g0Var, d10.g gVar) {
        this(3, gVar);
        this.f37370c = 0;
        this.f37371d = g0Var;
    }

    private final /* bridge */ /* synthetic */ void h(oz.m mVar, boolean z11) {
    }

    private final /* bridge */ /* synthetic */ void i(oz.m mVar, boolean z11) {
    }
}
