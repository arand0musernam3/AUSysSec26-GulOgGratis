package com.braze;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f10347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10348c;

    public /* synthetic */ q0(Braze braze, String str) {
        this.f10346a = 3;
        this.f10348c = str;
        this.f10347b = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10346a) {
            case 0:
                return Braze.logFeatureFlagImpression$lambda$84(this.f10347b, this.f10348c);
            case 1:
                return Braze._set_registeredPushToken_$lambda$36(this.f10347b, this.f10348c);
            case 2:
                return Braze.logPushMaxCampaign$lambda$200(this.f10347b, this.f10348c);
            case 3:
                return Braze.logPushNotificationOpened$lambda$57(this.f10348c, this.f10347b);
            default:
                return Braze.setSdkAuthenticationSignature$lambda$160(this.f10347b, this.f10348c);
        }
    }

    public /* synthetic */ q0(Braze braze, String str, int i11) {
        this.f10346a = i11;
        this.f10347b = braze;
        this.f10348c = str;
    }
}
