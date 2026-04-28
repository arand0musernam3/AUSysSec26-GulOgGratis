package com.google.firebase.messaging;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements d10.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f12834b;

    public /* synthetic */ k(FirebaseMessaging firebaseMessaging, int i11) {
        this.f12833a = i11;
        this.f12834b = firebaseMessaging;
    }

    @Override // d10.e
    public final void onSuccess(Object obj) {
        switch (this.f12833a) {
            case 0:
                this.f12834b.lambda$new$3((i0) obj);
                break;
            case 1:
                this.f12834b.lambda$setNotificationDelegationEnabled$6((Void) obj);
                break;
            default:
                this.f12834b.lambda$handleProxiedNotificationData$5((oz.a) obj);
                break;
        }
    }
}
