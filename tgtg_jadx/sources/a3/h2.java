package a3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import z1.y3;
import z1.z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f374c;

    public /* synthetic */ h2(int i11, Object obj, Object obj2) {
        this.f372a = i11;
        this.f373b = obj;
        this.f374c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w4.y yVar, x70.c cVar) {
        switch (this.f372a) {
            case 0:
                Object objE = z3.e(yVar, new g2((j2) this.f373b, (n0) this.f374c, (x70.c) null), cVar);
                if (objE != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objF = y3.f(yVar, new m2.b0((m3.b1) this.f373b, (Function1) this.f374c, 1), cVar);
                if (objF != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objN = v80.f0.n(new co.n(yVar, (m2.l1) this.f373b, (l3) this.f374c, (x70.c) null, 5), cVar);
                if (objN != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
