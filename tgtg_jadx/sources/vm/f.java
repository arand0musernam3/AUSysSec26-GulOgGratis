package vm;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import um.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f42442b;

    public /* synthetic */ f(u uVar, int i11) {
        this.f42441a = i11;
        this.f42442b = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f42441a) {
            case 0:
                this.f42442b.s(um.g.DELIVERY_INFO);
                break;
            case 1:
                this.f42442b.p();
                break;
            case 2:
                this.f42442b.p();
                break;
            case 3:
                this.f42442b.p();
                break;
            case 4:
                this.f42442b.l(um.g.MAX_ITEM_COUNT);
                break;
            default:
                this.f42442b.l(um.g.DELIVERY_INFO);
                break;
        }
        return Unit.f26487a;
    }
}
