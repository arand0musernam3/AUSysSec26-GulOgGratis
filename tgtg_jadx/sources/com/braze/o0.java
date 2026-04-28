package com.braze;

import com.braze.Braze;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.storage.c3;
import com.braze.ui.inappmessage.InAppMessageManagerBase;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10304b;

    public /* synthetic */ o0(boolean z11, int i11) {
        this.f10303a = i11;
        this.f10304b = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10303a) {
            case 0:
                return Braze.setSyncPolicyOfflineStatus$lambda$204$lambda$203(this.f10304b);
            case 1:
                return Braze.requestGeofenceRefresh$lambda$166(this.f10304b);
            case 2:
                return Braze.setSyncPolicyOfflineStatus$lambda$202(this.f10304b);
            case 3:
                return Braze.Companion._set_outboundNetworkRequestsOffline_$lambda$0(this.f10304b);
            case 4:
                return InAppMessageManagerBase._set_shouldNextUnregisterBeSkipped_$lambda$0(this.f10304b);
            case 5:
                return InAppMessageManagerBase.setClickOutsideModalViewDismissInAppMessageView$lambda$3(this.f10304b);
            case 6:
                return InAppMessageManagerBase.setBackButtonDismissesInAppMessageView$lambda$2(this.f10304b);
            case 7:
                return c3.a(this.f10304b);
            case 8:
                return com.braze.storage.t0.a(this.f10304b);
            case 9:
                return DefaultBrazeImageLoader.setOffline$lambda$0(this.f10304b);
            case 10:
                return BrazeGeofenceManager.configureFromServerConfig$lambda$27(this.f10304b);
            case 11:
                return BrazeGeofenceManager.configureFromServerConfig$lambda$29(this.f10304b);
            default:
                return BrazeGeofenceManager.setUpGeofences$lambda$12(this.f10304b);
        }
    }
}
