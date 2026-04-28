package d6;

import android.util.Log;
import ao.p2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u70.f f14437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Enum f14439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, u70.f fVar, Object obj2, Enum r42, int i11) {
        super(0);
        this.f14435a = i11;
        this.f14436b = obj;
        this.f14437c = fVar;
        this.f14438d = obj2;
        this.f14439e = r42;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object pVar;
        Object pVar2;
        int i11 = this.f14435a;
        Object obj = this.f14438d;
        u70.f fVar = this.f14437c;
        Enum r32 = this.f14439e;
        Object obj2 = this.f14436b;
        switch (i11) {
            case 0:
                ((d0) obj2).d((Function0) fVar, (a0) obj, (z5.m) r32);
                return Unit.f26487a;
            default:
                Object qVar = ((u70.q) ((gy.d) obj2).f20920b.getValue()).f40851a;
                if (!(qVar instanceof u70.p)) {
                    u70.o oVar = u70.q.f40850b;
                    gy.c cVar = (gy.c) r32;
                    q2 q2Var = ((gy.h) qVar).f20927a;
                    cVar.getClass();
                    try {
                        pVar2 = new gy.a(q2Var.K(cVar).z(), ((iy.c) ((u70.t) q2Var.f48336d).getValue()).f24241d, ((iy.a) ((u70.t) q2Var.f48337e).getValue()).f24238d, ((iy.d) ((u70.t) q2Var.f48338f).getValue()).f24242d);
                    } catch (Throwable th2) {
                        u70.o oVar2 = u70.q.f40850b;
                        pVar2 = new u70.p(th2);
                    }
                    qVar = new u70.q(pVar2);
                    break;
                }
                u70.o oVar3 = u70.q.f40850b;
                boolean z11 = qVar instanceof u70.p;
                if (!z11) {
                    ba0.g.M(qVar);
                    pVar = ((u70.q) qVar).f40851a;
                } else {
                    if (!z11) {
                        e40.a.f();
                        return null;
                    }
                    Throwable thA = u70.q.a(qVar);
                    thA.getClass();
                    pVar = new u70.p(thA);
                }
                p2 p2Var = (p2) fVar;
                Throwable thA2 = u70.q.a(pVar);
                if (thA2 == null) {
                    p2Var.invoke(pVar);
                } else {
                    ((p2) obj).invoke(my.a.f30260a);
                    Log.e("FingerprintJS", "Unexpected error occurred. Feel free to create an issue on Github repository of the fingerprintjs-android library.", thA2);
                }
                return Unit.f26487a;
        }
    }
}
