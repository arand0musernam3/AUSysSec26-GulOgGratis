package f0;

import android.os.Trace;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f16806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f16807k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(Object obj, Object obj2, x70.c cVar, int i11) {
        super(1, cVar);
        this.f16806j = i11;
        this.f16807k = obj;
        this.l = obj2;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        switch (this.f16806j) {
            case 0:
                return new o2((s2) this.f16807k, (l2) this.l, cVar, 0);
            case 1:
                return new o2((s2) this.f16807k, (i0.w) this.l, cVar, 1);
            default:
                return new o2((t1.b) this.f16807k, this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x70.c cVar = (x70.c) obj;
        switch (this.f16806j) {
        }
        return ((o2) create(cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f16806j;
        Object obj2 = this.l;
        Object obj3 = this.f16807k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                StringBuilder sb2 = new StringBuilder();
                s2 s2Var = (s2) obj3;
                sb2.append(s2Var);
                sb2.append(" CameraCaptureSessionWrapper#close");
                l2 l2Var = (l2) obj2;
                try {
                    Trace.beginSection(sb2.toString());
                    Log.d("CXCP", "Closing capture session for " + s2Var);
                    e0.f.B(l2Var.f16759a);
                    Trace.endSection();
                    return Unit.f26487a;
                } finally {
                }
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                StringBuilder sb3 = new StringBuilder();
                s2 s2Var2 = (s2) obj3;
                sb3.append(s2Var2);
                sb3.append(" stopRepeating");
                i0.w wVar = (i0.w) obj2;
                try {
                    Trace.beginSection(sb3.toString());
                    wVar.U();
                    Trace.endSection();
                    try {
                        Trace.beginSection(s2Var2 + " abortCaptures");
                        wVar.a();
                        Trace.endSection();
                        return Unit.f26487a;
                    } finally {
                    }
                } finally {
                }
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                t1.b bVar = (t1.b) obj3;
                t1.b.b(bVar);
                Object objA = t1.b.a(bVar, obj2);
                bVar.f39359c.f39464b.setValue(objA);
                bVar.f39361e.setValue(objA);
                return Unit.f26487a;
        }
    }
}
