package g3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f19509b;

    public /* synthetic */ t3(int i11, Function0 function0) {
        this.f19508a = i11;
        this.f19509b = function0;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w4.y yVar, x70.c cVar) {
        switch (this.f19508a) {
            case 0:
                Object objF = z1.y3.f(yVar, new a3.p2(6, this.f19509b), cVar);
                if (objF != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objE = z1.z3.e(yVar, new x1(this.f19509b, null, 2), cVar);
                if (objE != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
