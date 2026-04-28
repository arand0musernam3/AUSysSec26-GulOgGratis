package zendesk.core.android.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0007¨\u0006\u0003"}, d2 = {"isNotNullOrEmpty", "", "", "zendesk.core_core-utilities"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class NullabilityKtxKt {
    @InternalZendeskApi
    public static final boolean isNotNullOrEmpty(@Nullable String str) {
        return !(str == null || str.length() == 0);
    }
}
