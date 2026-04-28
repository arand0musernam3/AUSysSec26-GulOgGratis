package zs;

import kotlin.jvm.functions.Function0;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f48080b;

    public /* synthetic */ i(t tVar, int i11) {
        this.f48079a = i11;
        this.f48080b = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f48079a) {
            case 0:
                return ((g9.l) this.f48080b.getValue()).getViewModelStore();
            default:
                return ((g9.l) this.f48080b.getValue()).getDefaultViewModelCreationExtras();
        }
    }
}
