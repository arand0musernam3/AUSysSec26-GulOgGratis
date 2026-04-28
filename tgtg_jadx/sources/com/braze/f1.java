package com.braze;

import com.braze.models.inappmessage.InAppMessageHtmlBase;
import com.braze.push.BrazeFirebaseMessagingService;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.BrazePushReceiver;
import com.braze.support.StringUtils;
import com.braze.support.WebContentUtils;
import com.braze.ui.UserJavascriptInterfaceBase;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9833c;

    public /* synthetic */ f1(String str, String str2, int i11) {
        this.f9831a = i11;
        this.f9832b = str;
        this.f9833c = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9831a) {
            case 0:
                return Braze.changeUser$lambda$137$lambda$135(this.f9832b, this.f9833c);
            case 1:
                return Braze.logPushStoryPageClicked$lambda$68(this.f9832b, this.f9833c);
            case 2:
                return Braze.addSerializedCardJsonToStorage$lambda$168(this.f9832b, this.f9833c);
            case 3:
                return Braze.addSerializedCardJsonToStorage$lambda$170$lambda$169(this.f9832b, this.f9833c);
            case 4:
                return InAppMessageHtmlBase.logButtonClick$lambda$5(this.f9832b, this.f9833c);
            case 5:
                return BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$8(this.f9832b, this.f9833c);
            case 6:
                return BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent$lambda$72(this.f9832b, this.f9833c);
            case 7:
                return BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$7(this.f9832b, this.f9833c);
            case 8:
                return UserJavascriptInterfaceBase.setCustomAttribute$lambda$31(this.f9832b, this.f9833c);
            case 9:
                return UserJavascriptInterfaceBase.setCustomAttribute$lambda$32(this.f9832b, this.f9833c);
            case 10:
                return com.braze.models.outgoing.event.a.h(this.f9832b, this.f9833c);
            case 11:
                return com.braze.models.outgoing.event.a.n(this.f9832b, this.f9833c);
            case 12:
                return com.braze.models.outgoing.event.a.r(this.f9832b, this.f9833c);
            case 13:
                return com.braze.models.outgoing.event.a.d(this.f9832b, this.f9833c);
            case 14:
                return com.braze.models.outgoing.event.a.j(this.f9832b, this.f9833c);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return com.braze.models.outgoing.event.a.b(this.f9832b, this.f9833c);
            case 16:
                return com.braze.models.outgoing.event.a.f(this.f9832b, this.f9833c);
            case 17:
                return com.braze.models.outgoing.event.a.p(this.f9832b, this.f9833c);
            case 18:
                return com.braze.models.outgoing.event.a.t(this.f9832b, this.f9833c);
            case 19:
                return com.braze.models.outgoing.event.a.l(this.f9832b, this.f9833c);
            case 20:
                return com.braze.storage.j.a(this.f9832b, this.f9833c);
            case 21:
                return com.braze.storage.p.a(this.f9832b, this.f9833c);
            case 22:
                return StringUtils.getCacheFileSuffix$lambda$2(this.f9832b, this.f9833c);
            case 23:
                return WebContentUtils.replacePrefetchedUrlsWithLocalAssets$lambda$13(this.f9832b, this.f9833c);
            case 24:
                return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$1(this.f9832b, this.f9833c);
            case 25:
                return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$3(this.f9832b, this.f9833c);
            case 26:
                return com.braze.communication.dust.i.a(this.f9832b, this.f9833c);
            case 27:
                return com.braze.communication.dust.i.b(this.f9832b, this.f9833c);
            case 28:
                return com.braze.triggers.managers.a.a(this.f9832b, this.f9833c);
            default:
                return com.braze.triggers.managers.b.d(this.f9832b, this.f9833c);
        }
    }
}
