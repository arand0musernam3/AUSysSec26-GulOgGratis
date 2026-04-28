package com.google.firebase.messaging;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f12850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d10.g f12851c;

    public /* synthetic */ n(FirebaseMessaging firebaseMessaging, d10.g gVar, int i11) {
        this.f12849a = i11;
        this.f12850b = firebaseMessaging;
        this.f12851c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12849a) {
            case 0:
                this.f12850b.lambda$getToken$7(this.f12851c);
                break;
            default:
                this.f12850b.lambda$deleteToken$9(this.f12851c);
                break;
        }
    }
}
