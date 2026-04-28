package hw;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.b f22545b;

    public /* synthetic */ a(com.braze.requests.b bVar, int i11) {
        this.f22544a = i11;
        this.f22545b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22544a) {
            case 0:
                return com.braze.requests.b.c(this.f22545b);
            case 1:
                return com.braze.requests.b.b(this.f22545b);
            default:
                return com.braze.requests.b.a(this.f22545b);
        }
    }
}
