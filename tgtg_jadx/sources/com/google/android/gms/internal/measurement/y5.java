package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y5 extends m5 implements a6 {
    @Override // com.google.android.gms.internal.measurement.a6
    public final void beginAdUnitExposure(String str, long j9) {
        Parcel parcelL = L();
        parcelL.writeString(str);
        parcelL.writeLong(j9);
        M(23, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelL = L();
        parcelL.writeString(str);
        parcelL.writeString(str2);
        o5.b(parcelL, bundle);
        M(9, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void endAdUnitExposure(String str, long j9) {
        Parcel parcelL = L();
        parcelL.writeString(str);
        parcelL.writeLong(j9);
        M(24, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void generateEventId(c6 c6Var) {
        Parcel parcelL = L();
        o5.c(parcelL, c6Var);
        M(22, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void getCachedAppInstanceId(c6 c6Var) {
        Parcel parcelL = L();
        o5.c(parcelL, c6Var);
        M(19, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void getConditionalUserProperties(String str, String str2, c6 c6Var) {
        Parcel parcelL = L();
        parcelL.writeString(str);
        parcelL.writeString(str2);
        o5.c(parcelL, c6Var);
        M(10, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void getCurrentScreenClass(c6 c6Var) {
        Parcel parcelL = L();
        o5.c(parcelL, c6Var);
        M(17, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void getCurrentScreenName(c6 c6Var) {
        Parcel parcelL = L();
        o5.c(parcelL, c6Var);
        M(16, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void getGmpAppId(c6 c6Var) {
        Parcel parcelL = L();
        o5.c(parcelL, c6Var);
        M(21, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void getMaxUserProperties(String str, c6 c6Var) {
        Parcel parcelL = L();
        parcelL.writeString(str);
        o5.c(parcelL, c6Var);
        M(6, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void getUserProperties(String str, String str2, boolean z11, c6 c6Var) {
        Parcel parcelL = L();
        parcelL.writeString(str);
        parcelL.writeString(str2);
        ClassLoader classLoader = o5.f11692a;
        parcelL.writeInt(z11 ? 1 : 0);
        o5.c(parcelL, c6Var);
        M(5, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void initialize(yz.a aVar, j6 j6Var, long j9) {
        Parcel parcelL = L();
        o5.c(parcelL, aVar);
        o5.b(parcelL, j6Var);
        parcelL.writeLong(j9);
        M(1, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void initializeWithElapsedTime(yz.a aVar, j6 j6Var, long j9, long j11) {
        Parcel parcelL = L();
        o5.c(parcelL, aVar);
        o5.b(parcelL, j6Var);
        parcelL.writeLong(j9);
        parcelL.writeLong(j11);
        M(60, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j9, long j11) {
        Parcel parcelL = L();
        parcelL.writeString(str);
        parcelL.writeString(str2);
        o5.b(parcelL, bundle);
        parcelL.writeInt(z11 ? 1 : 0);
        parcelL.writeInt(1);
        parcelL.writeLong(j9);
        parcelL.writeLong(j11);
        M(59, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void logHealthData(int i11, String str, yz.a aVar, yz.a aVar2, yz.a aVar3) {
        Parcel parcelL = L();
        parcelL.writeInt(5);
        parcelL.writeString("Error with data collection. Data lost.");
        o5.c(parcelL, aVar);
        o5.c(parcelL, aVar2);
        o5.c(parcelL, aVar3);
        M(33, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void onActivityCreatedByScionActivityInfo(l6 l6Var, Bundle bundle, long j9) {
        Parcel parcelL = L();
        o5.b(parcelL, l6Var);
        o5.b(parcelL, bundle);
        parcelL.writeLong(j9);
        M(53, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void onActivityDestroyedByScionActivityInfo(l6 l6Var, long j9) {
        Parcel parcelL = L();
        o5.b(parcelL, l6Var);
        parcelL.writeLong(j9);
        M(54, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void onActivityPausedByScionActivityInfo(l6 l6Var, long j9) {
        Parcel parcelL = L();
        o5.b(parcelL, l6Var);
        parcelL.writeLong(j9);
        M(55, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void onActivityResumedByScionActivityInfo(l6 l6Var, long j9) {
        Parcel parcelL = L();
        o5.b(parcelL, l6Var);
        parcelL.writeLong(j9);
        M(56, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void onActivitySaveInstanceStateByScionActivityInfo(l6 l6Var, c6 c6Var, long j9) {
        Parcel parcelL = L();
        o5.b(parcelL, l6Var);
        o5.c(parcelL, c6Var);
        parcelL.writeLong(j9);
        M(57, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void onActivityStartedByScionActivityInfo(l6 l6Var, long j9) {
        Parcel parcelL = L();
        o5.b(parcelL, l6Var);
        parcelL.writeLong(j9);
        M(51, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void onActivityStoppedByScionActivityInfo(l6 l6Var, long j9) {
        Parcel parcelL = L();
        o5.b(parcelL, l6Var);
        parcelL.writeLong(j9);
        M(52, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void registerOnMeasurementEventListener(g6 g6Var) {
        Parcel parcelL = L();
        o5.c(parcelL, g6Var);
        M(35, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void retrieveAndUploadBatches(e6 e6Var) {
        Parcel parcelL = L();
        o5.c(parcelL, e6Var);
        M(58, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void setConditionalUserProperty(Bundle bundle, long j9) {
        Parcel parcelL = L();
        o5.b(parcelL, bundle);
        parcelL.writeLong(j9);
        M(8, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void setConsentThirdParty(Bundle bundle, long j9) {
        Parcel parcelL = L();
        o5.b(parcelL, bundle);
        parcelL.writeLong(j9);
        M(45, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void setCurrentScreenByScionActivityInfo(l6 l6Var, String str, String str2, long j9) {
        Parcel parcelL = L();
        o5.b(parcelL, l6Var);
        parcelL.writeString(str);
        parcelL.writeString(str2);
        parcelL.writeLong(j9);
        M(50, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void setDataCollectionEnabled(boolean z11) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void setMeasurementEnabled(boolean z11, long j9) {
        Parcel parcelL = L();
        ClassLoader classLoader = o5.f11692a;
        parcelL.writeInt(z11 ? 1 : 0);
        parcelL.writeLong(j9);
        M(11, parcelL);
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public final void setUserProperty(String str, String str2, yz.a aVar, boolean z11, long j9) {
        Parcel parcelL = L();
        parcelL.writeString("fcm");
        parcelL.writeString("_ln");
        o5.c(parcelL, aVar);
        parcelL.writeInt(1);
        parcelL.writeLong(j9);
        M(4, parcelL);
    }
}
