package vv;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f42521b;

    public /* synthetic */ c(Class cls, int i11) {
        this.f42520a = i11;
        this.f42521b = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f42520a) {
            case 0:
                return com.braze.events.d.d(this.f42521b);
            case 1:
                return com.braze.events.d.b(this.f42521b);
            default:
                return com.braze.events.d.c(this.f42521b);
        }
    }
}
