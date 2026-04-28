package hw;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.util.d f22554b;

    public /* synthetic */ e(com.braze.requests.util.d dVar, int i11) {
        this.f22553a = i11;
        this.f22554b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22553a) {
            case 0:
                return com.braze.requests.e.a(this.f22554b);
            default:
                return com.braze.communication.b.a(this.f22554b);
        }
    }
}
