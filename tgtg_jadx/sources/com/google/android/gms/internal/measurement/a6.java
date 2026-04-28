package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface a6 extends IInterface {
    void beginAdUnitExposure(String str, long j9);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j9);

    void endAdUnitExposure(String str, long j9);

    void generateEventId(c6 c6Var);

    void getAppInstanceId(c6 c6Var);

    void getCachedAppInstanceId(c6 c6Var);

    void getConditionalUserProperties(String str, String str2, c6 c6Var);

    void getCurrentScreenClass(c6 c6Var);

    void getCurrentScreenName(c6 c6Var);

    void getGmpAppId(c6 c6Var);

    void getMaxUserProperties(String str, c6 c6Var);

    void getSessionId(c6 c6Var);

    void getTestFlag(c6 c6Var, int i11);

    void getUserProperties(String str, String str2, boolean z11, c6 c6Var);

    void initForTests(Map map);

    void initialize(yz.a aVar, j6 j6Var, long j9);

    void initializeWithElapsedTime(yz.a aVar, j6 j6Var, long j9, long j11);

    void isDataCollectionEnabled(c6 c6Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j9);

    void logEventAndBundle(String str, String str2, Bundle bundle, c6 c6Var, long j9);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j9, long j11);

    void logHealthData(int i11, String str, yz.a aVar, yz.a aVar2, yz.a aVar3);

    void onActivityCreated(yz.a aVar, Bundle bundle, long j9);

    void onActivityCreatedByScionActivityInfo(l6 l6Var, Bundle bundle, long j9);

    void onActivityDestroyed(yz.a aVar, long j9);

    void onActivityDestroyedByScionActivityInfo(l6 l6Var, long j9);

    void onActivityPaused(yz.a aVar, long j9);

    void onActivityPausedByScionActivityInfo(l6 l6Var, long j9);

    void onActivityResumed(yz.a aVar, long j9);

    void onActivityResumedByScionActivityInfo(l6 l6Var, long j9);

    void onActivitySaveInstanceState(yz.a aVar, c6 c6Var, long j9);

    void onActivitySaveInstanceStateByScionActivityInfo(l6 l6Var, c6 c6Var, long j9);

    void onActivityStarted(yz.a aVar, long j9);

    void onActivityStartedByScionActivityInfo(l6 l6Var, long j9);

    void onActivityStopped(yz.a aVar, long j9);

    void onActivityStoppedByScionActivityInfo(l6 l6Var, long j9);

    void performAction(Bundle bundle, c6 c6Var, long j9);

    void registerOnMeasurementEventListener(g6 g6Var);

    void resetAnalyticsData(long j9);

    void resetAnalyticsDataWithElapsedTime(long j9, long j11);

    void retrieveAndUploadBatches(e6 e6Var);

    void setConditionalUserProperty(Bundle bundle, long j9);

    void setConsent(Bundle bundle, long j9);

    void setConsentThirdParty(Bundle bundle, long j9);

    void setCurrentScreen(yz.a aVar, String str, String str2, long j9);

    void setCurrentScreenByScionActivityInfo(l6 l6Var, String str, String str2, long j9);

    void setDataCollectionEnabled(boolean z11);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(g6 g6Var);

    void setInstanceIdProvider(i6 i6Var);

    void setMeasurementEnabled(boolean z11, long j9);

    void setMinimumSessionDuration(long j9);

    void setSessionTimeoutDuration(long j9);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j9);

    void setUserProperty(String str, String str2, yz.a aVar, boolean z11, long j9);

    void unregisterOnMeasurementEventListener(g6 g6Var);
}
