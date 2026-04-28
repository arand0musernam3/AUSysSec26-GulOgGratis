package nn;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kn.d f31164b;

    public /* synthetic */ r(kn.d dVar, int i11) {
        this.f31163a = i11;
        this.f31164b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31163a) {
            case 0:
                this.f31164b.f26480h.invoke();
                break;
            default:
                kn.d dVar = this.f31164b;
                Function0 function0 = dVar.f26479g;
                if (function0 != null) {
                    function0.invoke();
                }
                dVar.f26480h.invoke();
                break;
        }
        return Unit.f26487a;
    }
}
