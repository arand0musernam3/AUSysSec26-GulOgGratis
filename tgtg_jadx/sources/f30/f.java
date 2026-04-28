package f30;

import a90.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends a30.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f17281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d10.g f17282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f17283j;

    public f(g gVar, d10.g gVar2) {
        v vVar = new v("OnRequestInstallCallback");
        this.f17283j = gVar;
        super(3);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f17281h = vVar;
        this.f17282i = gVar2;
    }
}
