package com.adyen.checkout.components.core.internal.provider;

import com.braze.h2;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "", "createEncodedSdkData", "", "threeDS2SdkVersion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SdkDataProvider {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ String createEncodedSdkData$default(SdkDataProvider sdkDataProvider, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: createEncodedSdkData");
                return null;
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            return sdkDataProvider.createEncodedSdkData(str);
        }
    }

    @Nullable
    String createEncodedSdkData(@Nullable String threeDS2SdkVersion);
}
