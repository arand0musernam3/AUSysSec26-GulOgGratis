package com.app.tgtg.services.notifications;

import ao.c;
import ao.v;
import com.appsflyer.AppsFlyerLib;
import com.braze.push.BrazeFirebaseMessagingService;
import com.google.firebase.messaging.y;
import ft.s;
import gf.g;
import gv.a;
import hv.b;
import hv.j;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import v80.b0;
import v80.f0;
import zendesk.messaging.android.push.PushNotifications;
import zendesk.messaging.android.push.PushResponsibility;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class TGTGMessagingService extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f9496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f9497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f9498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f9499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f9500h;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(y yVar) {
        yVar.getClass();
        super.onMessageReceived(yVar);
        if (BrazeFirebaseMessagingService.INSTANCE.handleBrazeRemoteMessage(this, yVar)) {
            sa0.a.f38953a.f("BrazeRemoteMessage: " + yVar.d(), new Object[0]);
            return;
        }
        b bVar = this.f9500h;
        x70.c cVar = null;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zendeskManager");
            bVar = null;
        }
        j jVar = (j) bVar;
        jVar.getClass();
        jVar.f22536h.getClass();
        Map mapD = yVar.d();
        mapD.getClass();
        if (PushNotifications.shouldBeDisplayed(mapD) != PushResponsibility.MESSAGING_SHOULD_DISPLAY) {
            sa0.a.f38953a.f("OtherRemoteMessage: " + yVar.d(), new Object[0]);
            return;
        }
        b bVar2 = this.f9500h;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zendeskManager");
            bVar2 = null;
        }
        j jVar2 = (j) bVar2;
        jVar2.getClass();
        f0.B(jVar2.f22532d, null, null, new g(jVar2, yVar, cVar, 9), 3);
        sa0.a.f38953a.f("ZendeskRemoteMessage: " + yVar.d(), new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        str.getClass();
        super.onNewToken(str);
        v vVar = this.f9497e;
        s sVar = null;
        Object[] objArr = 0;
        if (vVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authRepository");
            vVar = null;
        }
        if (vVar.f4469b.a()) {
            b0 b0Var = this.f9498f;
            if (b0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("externalScope");
                b0Var = null;
            }
            f0.B(b0Var, null, null, new g(this, str, objArr == true ? 1 : 0, 2), 3);
        }
        b bVar = this.f9500h;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("zendeskManager");
            bVar = null;
        }
        j jVar = (j) bVar;
        jVar.getClass();
        jVar.f22536h.getClass();
        PushNotifications.updatePushNotificationToken(str);
        s sVar2 = this.f9499g;
        if (sVar2 != null) {
            sVar = sVar2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("trackingSettingsManager");
        }
        if (sVar.a()) {
            AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), str);
        }
    }
}
