package m2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import z1.y3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f29090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3.b1 f29091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b2.l f29092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m3.b1 f29093d;

    public u1(v80.b0 b0Var, m3.b1 b1Var, b2.l lVar, m3.b1 b1Var2) {
        this.f29090a = b0Var;
        this.f29091b = b1Var;
        this.f29092c = lVar;
        this.f29093d = b1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w4.y yVar, x70.c cVar) {
        Object objE = y3.e(yVar, new t1(this.f29090a, this.f29091b, this.f29092c, null), new li.c(this.f29093d, 8), cVar);
        return objE == y70.a.COROUTINE_SUSPENDED ? objE : Unit.f26487a;
    }
}
