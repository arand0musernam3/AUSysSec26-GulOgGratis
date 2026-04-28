package com.braze.models;

import com.braze.managers.k0;
import com.braze.storage.FeatureFlagsDataStoreProvider$Companion;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeatureFlag f10218b;

    public /* synthetic */ r(FeatureFlag featureFlag, int i11) {
        this.f10217a = i11;
        this.f10218b = featureFlag;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10217a) {
            case 0:
                return FeatureFlag.properties_delegate$lambda$1$lambda$0(this.f10218b);
            case 1:
                return FeatureFlag._init_$lambda$4$lambda$3(this.f10218b);
            case 2:
                return FeatureFlag.properties_delegate$lambda$1(this.f10218b);
            case 3:
                return FeatureFlag._init_$lambda$4(this.f10218b);
            case 4:
                return com.braze.models.outgoing.event.a.b(this.f10218b);
            case 5:
                return FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$6$lambda$4(this.f10218b);
            default:
                return k0.a(this.f10218b);
        }
    }
}
