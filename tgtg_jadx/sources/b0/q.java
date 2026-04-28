package b0;

import android.view.animation.Animation;
import g3.v7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5368c;

    public /* synthetic */ q(boolean z11, dn.f fVar) {
        this.f5366a = 1;
        this.f5367b = z11;
        this.f5368c = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5366a) {
            case 0:
                r0 r0Var = (r0) this.f5368c;
                f0.o oVar = (f0.o) obj;
                oVar.getClass();
                l0 l0Var = new l0(oVar, r0Var);
                x xVar = r0Var.f5392n;
                oVar.f16792a.getFrameNumber();
                return Boolean.valueOf(s0.v0.a(new w.y(xVar, l0Var), this.f5367b));
            case 1:
                dn.f fVar = (dn.f) this.f5368c;
                ((Animation) obj).getClass();
                if (!this.f5367b) {
                    fVar.a(true);
                }
                return Unit.f26487a;
            case 2:
                e.g gVar = (e.g) this.f5368c;
                androidx.activity.e0 e0Var = (androidx.activity.e0) gVar.f7113a;
                boolean z11 = this.f5367b;
                e0Var.setEnabled(z11);
                ((f.a) gVar.f7114b).g(z11);
                return new e.e((w8.f) obj, gVar, 0);
            case 3:
                e.j jVar = (e.j) this.f5368c;
                jVar.z(this.f5367b);
                return new e.e((w8.f) obj, jVar, 1);
            default:
                z1.h1 h1Var = (z1.h1) obj;
                float f11 = (int) (((z5.l) this.f5368c).f47286a >> 32);
                h1Var.a(v7.Settled, 0.0f);
                if (this.f5367b) {
                    h1Var.a(v7.StartToEnd, f11);
                }
                h1Var.a(v7.EndToStart, -f11);
                return Unit.f26487a;
        }
    }

    public /* synthetic */ q(Object obj, boolean z11, int i11) {
        this.f5366a = i11;
        this.f5368c = obj;
        this.f5367b = z11;
    }
}
