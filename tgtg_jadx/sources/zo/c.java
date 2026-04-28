package zo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import qo.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f48015b;

    public /* synthetic */ c(h hVar, int i11) {
        this.f48014a = i11;
        this.f48015b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f48014a) {
            case 0:
                h.c(this.f48015b);
                break;
            default:
                h hVar = this.f48015b;
                hVar.f37214g = true;
                h.c(hVar);
                break;
        }
        return Unit.f26487a;
    }
}
