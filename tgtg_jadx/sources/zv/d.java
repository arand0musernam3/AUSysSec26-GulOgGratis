package zv;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.managers.d f48115b;

    public /* synthetic */ d(com.braze.managers.d dVar, int i11) {
        this.f48114a = i11;
        this.f48115b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f48114a) {
            case 0:
                return com.braze.managers.f.a(this.f48115b);
            case 1:
                return com.braze.managers.f.b(this.f48115b);
            case 2:
                return com.braze.managers.g.c(this.f48115b);
            case 3:
                return com.braze.managers.g.b(this.f48115b);
            case 4:
                return com.braze.managers.j.a(this.f48115b);
            default:
                return com.braze.managers.j.b(this.f48115b);
        }
    }
}
