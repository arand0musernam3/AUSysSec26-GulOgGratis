package zv;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.managers.r f48143b;

    public /* synthetic */ p(com.braze.managers.r rVar, int i11) {
        this.f48142a = i11;
        this.f48143b = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f48142a) {
            case 0:
                return com.braze.managers.r.c(this.f48143b);
            case 1:
                return com.braze.managers.r.f(this.f48143b);
            case 2:
                return com.braze.managers.r.d(this.f48143b);
            case 3:
                return com.braze.managers.r.a(this.f48143b);
            case 4:
                return com.braze.managers.r.b(this.f48143b);
            default:
                return com.braze.managers.r.e(this.f48143b);
        }
    }
}
