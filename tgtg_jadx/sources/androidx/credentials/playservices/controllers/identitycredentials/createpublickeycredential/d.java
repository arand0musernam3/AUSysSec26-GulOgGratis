package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import n7.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f2872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n7.c f2873c;

    public /* synthetic */ d(l lVar, n7.c cVar, int i11) {
        this.f2871a = i11;
        this.f2872b = lVar;
        this.f2873c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2871a) {
            case 0:
                this.f2872b.onResult(this.f2873c);
                break;
            default:
                this.f2872b.onResult(this.f2873c);
                break;
        }
    }
}
