package iw;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.framework.g f24220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24221c;

    public /* synthetic */ e(com.braze.requests.framework.g gVar, long j9, int i11) {
        this.f24219a = i11;
        this.f24220b = gVar;
        this.f24221c = j9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24219a) {
            case 0:
                return com.braze.requests.framework.g.a(this.f24220b, this.f24221c);
            default:
                return com.braze.requests.framework.g.b(this.f24220b, this.f24221c);
        }
    }
}
