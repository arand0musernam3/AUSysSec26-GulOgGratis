package m2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2.w f29071b;

    public /* synthetic */ s(x2.w wVar, int i11) {
        this.f29070a = i11;
        this.f29071b = wVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w4.y yVar, x70.c cVar) {
        switch (this.f29070a) {
            case 0:
                x2.w wVar = this.f29071b;
                wVar.getClass();
                Object objN = v80.f0.n(new ao.e1(wVar, yVar, null, 24), cVar);
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                if (objN != aVar) {
                    objN = Unit.f26487a;
                }
                if (objN != aVar) {
                    break;
                }
                break;
            case 1:
                x2.w wVar2 = this.f29071b;
                wVar2.getClass();
                Object objN2 = v80.f0.n(new gn.w(wVar2, yVar, true, (x70.c) null), cVar);
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                if (objN2 != aVar2) {
                    objN2 = Unit.f26487a;
                }
                if (objN2 != aVar2) {
                    break;
                }
                break;
            default:
                x2.w wVar3 = this.f29071b;
                wVar3.getClass();
                Object objN3 = v80.f0.n(new gn.w(wVar3, yVar, false, (x70.c) null), cVar);
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                if (objN3 != aVar3) {
                    objN3 = Unit.f26487a;
                }
                if (objN3 != aVar3) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
