package a3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m2.l1 f581b;

    public /* synthetic */ u0(m2.l1 l1Var, int i11) {
        this.f580a = i11;
        this.f581b = l1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w4.y yVar, x70.c cVar) {
        switch (this.f580a) {
            case 0:
                Object objS = m2.g0.s(yVar, this.f581b, cVar);
                if (objS != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objS2 = m2.g0.s(yVar, this.f581b, cVar);
                if (objS2 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
