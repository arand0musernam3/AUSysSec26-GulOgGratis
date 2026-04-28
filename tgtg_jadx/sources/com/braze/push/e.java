package com.braze.push;

import com.braze.push.BrazeNotificationStyleFactory;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10329a;

    public /* synthetic */ e(int i11) {
        this.f10329a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10329a) {
            case 0:
                return BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$23();
            case 1:
                return BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$1();
            case 2:
                return BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$2();
            case 3:
                return BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$3();
            case 4:
                return BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$4();
            case 5:
                return BrazeNotificationUtils.setDeleteIntent$lambda$34();
            case 6:
                return BrazeNotificationUtils.sendNotificationOpenedBroadcast$lambda$73();
            case 7:
                return BrazeNotificationUtils.setSmallIcon$lambda$35();
            case 8:
                return BrazeNotificationUtils.setSmallIcon$lambda$36();
            case 9:
                return BrazeNotificationUtils.setSetShowWhen$lambda$37();
            case 10:
                return BrazeNotificationUtils.logBaiduNotificationClick$lambda$58();
            case 11:
                return BrazeNotificationUtils.logBaiduNotificationClick$lambda$59();
            case 12:
                return BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate$lambda$11();
            case 13:
                return BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate$lambda$12();
            case 14:
                return BrazeNotificationUtils.getValidNotificationChannel$lambda$74();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BrazeNotificationUtils.getValidNotificationChannel$lambda$77();
            case 16:
                return BrazeNotificationUtils.setSoundIfPresentAndSupported$lambda$45();
            case 17:
                return BrazeNotificationUtils.setSoundIfPresentAndSupported$lambda$46();
            case 18:
                return BrazeNotificationUtils.isUninstallTrackingPush$lambda$65();
            case 19:
                return BrazeNotificationUtils.handlePushStoryPageClicked$lambda$71();
            case 20:
                return BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$5();
            case 21:
                return BrazeNotificationUtils.refreshBannersIfAppropriate$lambda$13();
            case 22:
                return BrazeNotificationUtils.refreshBannersIfAppropriate$lambda$14();
            case 23:
                return BrazeNotificationUtils.setPriorityIfPresentAndSupported$lambda$49();
            case 24:
                return BrazeNotificationUtils.sendPushMessageReceivedBroadcast$lambda$10();
            case 25:
                return BrazeNotificationUtils.setCategoryIfPresentAndSupported$lambda$53();
            case 26:
                return BrazeNotificationUtils.setCategoryIfPresentAndSupported$lambda$54();
            case 27:
                return BrazeNotificationUtils.setVisibilityIfPresentAndSupported$lambda$55();
            case 28:
                return BrazeNotificationUtils.handleNotificationDeleted$lambda$2();
            default:
                return BrazeNotificationUtils.handleNotificationDeleted$lambda$3();
        }
    }
}
