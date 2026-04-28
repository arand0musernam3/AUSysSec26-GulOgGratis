package iw;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.framework.b f24217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24218c;

    public /* synthetic */ d(com.braze.requests.framework.b bVar, long j9, int i11) {
        this.f24216a = i11;
        this.f24217b = bVar;
        this.f24218c = j9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24216a) {
            case 0:
                return com.braze.requests.framework.b.b(this.f24217b, this.f24218c);
            case 1:
                return com.braze.requests.framework.b.d(this.f24217b, this.f24218c);
            case 2:
                return com.braze.requests.framework.b.a(this.f24217b, this.f24218c);
            default:
                return com.braze.requests.framework.b.c(this.f24217b, this.f24218c);
        }
    }
}
