package yj;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xj.k f46106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f46107c;

    public /* synthetic */ n(xj.k kVar, b1 b1Var, int i11) {
        this.f46105a = i11;
        this.f46106b = kVar;
        this.f46107c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f46105a) {
            case 0:
                ((cv.b) this.f46106b.f44413h.f28697a).b(cv.i.TEMP_SCREEN_POP_UP_CHANGE_PUSH_SETTINGS);
                this.f46107c.setValue(Boolean.TRUE);
                break;
            default:
                ((cv.b) this.f46106b.f44413h.f28697a).b(cv.i.TEMP_SCREEN_POP_UP_CHANGE_PUSH_SETTINGS);
                this.f46107c.setValue(Boolean.TRUE);
                break;
        }
        return Unit.f26487a;
    }
}
