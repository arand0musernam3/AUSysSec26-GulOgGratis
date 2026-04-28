package d30;

import i30.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends a30.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f14015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d10.g f14016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f14017j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, d10.g gVar) {
        super(5);
        this.f14017j = eVar;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f14015h = new n("OnRequestIntegrityTokenCallback");
        this.f14016i = gVar;
    }
}
