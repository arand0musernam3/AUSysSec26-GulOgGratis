package com.braze;

import com.braze.Braze;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.enums.Gender;
import java.io.File;
import java.util.EnumSet;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10787b;

    public /* synthetic */ t0(Object obj, int i11) {
        this.f10786a = i11;
        this.f10787b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10786a) {
            case 0:
                return Braze.publishError$lambda$206((Throwable) this.f10787b);
            case 1:
                return Braze.deserializeContentCard$lambda$147((JSONObject) this.f10787b);
            case 2:
                return Braze.Companion.addSdkMetadata$lambda$20$lambda$19((EnumSet) this.f10787b);
            case 3:
                return Braze.Companion.enableDelayedInitialization$lambda$35((DelayedInitializationAnalyticsBehavior) this.f10787b);
            case 4:
                return Braze.Companion.clearSharedPreferencesData$lambda$39$lambda$38((File) this.f10787b);
            default:
                return BrazeUser.setGender$lambda$17((Gender) this.f10787b);
        }
    }
}
