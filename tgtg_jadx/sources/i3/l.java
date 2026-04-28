package i3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import g3.ea;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ea f23157b;

    public /* synthetic */ l(ea eaVar, int i11) {
        this.f23156a = i11;
        this.f23157b = eaVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w4.y yVar, x70.c cVar) {
        switch (this.f23156a) {
            case 0:
                Object objN = v80.f0.n(new k(yVar, this.f23157b, null, 0), cVar);
                if (objN != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objN2 = v80.f0.n(new k(yVar, this.f23157b, null, 1), cVar);
                if (objN2 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
