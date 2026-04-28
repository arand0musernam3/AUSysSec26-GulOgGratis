package iw;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.framework.h f24212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f24214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24215e;

    public /* synthetic */ c(com.braze.requests.framework.h hVar, long j9, long j11, Object obj, int i11) {
        this.f24211a = i11;
        this.f24212b = hVar;
        this.f24213c = j9;
        this.f24214d = j11;
        this.f24215e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24211a) {
            case 0:
                return com.braze.requests.framework.b.a(this.f24212b, this.f24213c, this.f24214d, (com.braze.requests.util.g) this.f24215e);
            default:
                return com.braze.requests.framework.g.a(this.f24212b, this.f24213c, this.f24214d, (com.braze.requests.framework.g) this.f24215e);
        }
    }
}
