package b0;

import android.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5439j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5440k;
    public final /* synthetic */ x2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5441m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(x2 x2Var, int i11, x70.c cVar) {
        super(1, cVar);
        this.l = x2Var;
        this.f5441m = i11;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new u2(this.l, this.f5441m, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((u2) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        v80.q qVarB;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i12 = this.f5440k;
        try {
            if (i12 == 0) {
                ba0.g.M(obj);
                if (wd.a.B(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOffAsync");
                }
                x2 x2Var = this.l;
                int i13 = this.f5441m;
                i0.b bVarA = x2Var.f5493c.a();
                this.f5439j = i13;
                this.f5440k = 1;
                obj = bVarA.e(this);
                if (obj == aVar) {
                    return aVar;
                }
                i11 = i13;
            } else {
                if (i12 != 1) {
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i11 = this.f5439j;
                ba0.g.M(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                i0.c cVar = (i0.c) autoCloseable;
                e0.a aVar2 = new e0.a(i11);
                if (cVar.f22602a.a()) {
                    qc.y.j("Cannot call setTorchOff on ", cVar, " after close.");
                    qVarB = null;
                } else {
                    i0.h hVar = cVar.f22604c;
                    hVar.getClass();
                    qVarB = i0.h.b(hVar, aVar2, null, null, new e0.j0(0), null, null, null, 118);
                }
                w.b.y(autoCloseable, null);
                return qVarB;
            } finally {
            }
        } catch (CancellationException e5) {
            if (wd.a.B(3, "CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e5);
            }
            return x2.l;
        }
    }
}
