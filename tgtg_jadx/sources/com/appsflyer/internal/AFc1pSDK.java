package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFc1pSDK implements AFc1jSDK {

    @NotNull
    private final AFc1eSDK<SharedPreferences> getMonetizationNetwork;

    @NotNull
    private final u70.j getRevenue;

    public AFc1pSDK(@NotNull AFc1eSDK<SharedPreferences> aFc1eSDK) {
        aFc1eSDK.getClass();
        this.getMonetizationNetwork = aFc1eSDK;
        this.getRevenue = u70.l.b(new Function0<SharedPreferences>() { // from class: com.appsflyer.internal.AFc1pSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: m_, reason: merged with bridge method [inline-methods] */
            public final SharedPreferences invoke() {
                return (SharedPreferences) AFc1pSDK.this.getMonetizationNetwork.getMonetizationNetwork.invoke();
            }
        });
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void AFAdRevenueData(@Nullable String str, int i11) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putInt(str, i11).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final int getCurrencyIso4217Code(@Nullable String str, int i11) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getInt(str, i11);
        } catch (ClassCastException e5) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, e0.f.k("Unexpected data type found for key ", str), e5, false, false, false, false, 120, null);
            return i11;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final long getMediationNetwork(@Nullable String str, long j9) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getLong(str, j9);
        } catch (ClassCastException e5) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, e0.f.k("Unexpected data type found for key ", str), e5, false, false, false, false, 120, null);
            return j9;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final boolean getMonetizationNetwork(@Nullable String str) {
        return ((SharedPreferences) this.getRevenue.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final boolean getRevenue(@Nullable String str) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getBoolean(str, false);
        } catch (ClassCastException e5) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, e0.f.k("Unexpected data type found for key ", str), e5, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getCurrencyIso4217Code(@Nullable String str) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getMediationNetwork(@Nullable String str, @Nullable String str2) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    @Nullable
    public final String getRevenue(@Nullable String str, @Nullable String str2) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getString(str, str2);
        } catch (ClassCastException e5) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, e0.f.k("Unexpected data type found for key ", str), e5, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getRevenue(@Nullable String str, boolean z11) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putBoolean(str, z11).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getRevenue(@Nullable String str, long j9) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putLong(str, j9).apply();
    }
}
