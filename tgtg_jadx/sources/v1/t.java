package v1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f41842b;

    public /* synthetic */ t(u uVar, int i11) {
        this.f41841a = i11;
        this.f41842b = uVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w4.y yVar, x70.c cVar) {
        switch (this.f41841a) {
            case 0:
                Object objN = v80.f0.n(new s(yVar, this.f41842b, null, 0), cVar);
                if (objN != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objN2 = v80.f0.n(new s(yVar, this.f41842b, null, 1), cVar);
                if (objN2 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
