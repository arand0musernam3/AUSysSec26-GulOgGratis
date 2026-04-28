package hv;

import zendesk.android.FailureCallback;
import zendesk.android.SuccessCallback;
import zendesk.android.ZendeskUser;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements SuccessCallback, FailureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c f22514a;

    public /* synthetic */ c(androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c cVar) {
        this.f22514a = cVar;
    }

    @Override // zendesk.android.FailureCallback
    public void onFailure(Throwable th2) throws Exception {
        th2.getClass();
        sa0.a.f38953a.c("Failed logging in user -> " + th2, new Object[0]);
        this.f22514a.invoke();
    }

    @Override // zendesk.android.SuccessCallback
    public void onSuccess(Object obj) throws Exception {
        ((ZendeskUser) obj).getClass();
        this.f22514a.invoke();
    }
}
