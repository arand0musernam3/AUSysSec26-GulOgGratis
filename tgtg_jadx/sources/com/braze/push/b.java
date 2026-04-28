package com.braze.push;

import com.braze.push.BrazeFirebaseMessagingService;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f10324b;

    public /* synthetic */ b(Map map, int i11) {
        this.f10323a = i11;
        this.f10324b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10323a) {
            case 0:
                return BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$7(this.f10324b);
            default:
                return BrazeHuaweiPushHandler.handleHmsRemoteMessageData$lambda$0(this.f10324b);
        }
    }
}
