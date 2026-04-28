package com.adyen.checkout.components.core.internal.provider;

import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.data.model.sdkData.Analytics;
import com.adyen.checkout.components.core.internal.data.model.sdkData.Authentication;
import com.adyen.checkout.components.core.internal.data.model.sdkData.SdkData;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import f80.a;
import f80.c;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0014\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/components/core/internal/provider/DefaultSdkDataProvider;", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "analyticsManager", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;)V", "createEncodedSdkData", "", "threeDS2SdkVersion", "createSdkData", "Lcom/adyen/checkout/components/core/internal/data/model/sdkData/SdkData;", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultSdkDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSdkDataProvider.kt\ncom/adyen/checkout/components/core/internal/provider/DefaultSdkDataProvider\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,68:1\n21#2,12:69\n*S KotlinDebug\n*F\n+ 1 DefaultSdkDataProvider.kt\ncom/adyen/checkout/components/core/internal/provider/DefaultSdkDataProvider\n*L\n41#1:69,12\n*E\n"})
public final class DefaultSdkDataProvider implements SdkDataProvider {
    private static final int SCHEMA_VERSION = 1;

    @NotNull
    private final AnalyticsManager analyticsManager;

    public DefaultSdkDataProvider(@NotNull AnalyticsManager analyticsManager) {
        analyticsManager.getClass();
        this.analyticsManager = analyticsManager;
    }

    private final SdkData createSdkData(String threeDS2SdkVersion) {
        return new SdkData(1, new Analytics(this.analyticsManager.getCheckoutAttemptId()), threeDS2SdkVersion != null ? new Authentication(threeDS2SdkVersion) : null, Long.valueOf(new Date().getTime()), Boolean.TRUE);
    }

    public static /* synthetic */ SdkData createSdkData$default(DefaultSdkDataProvider defaultSdkDataProvider, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return defaultSdkDataProvider.createSdkData(str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.SdkDataProvider
    @Nullable
    public String createEncodedSdkData(@Nullable String threeDS2SdkVersion) {
        try {
            JSONObject jSONObjectSerialize = createSdkData(threeDS2SdkVersion).serialize();
            a aVar = c.f17515f;
            String string = jSONObjectSerialize.toString();
            string.getClass();
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            bytes.getClass();
            return c.b(aVar, bytes);
        } catch (JSONException e5) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (!companion.getLogger().shouldLog(adyenLogLevel)) {
                return null;
            }
            String name = DefaultSdkDataProvider.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Unable to serialize SdkData", e5);
            return null;
        }
    }
}
