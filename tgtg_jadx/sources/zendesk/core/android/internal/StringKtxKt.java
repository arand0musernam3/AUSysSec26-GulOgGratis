package zendesk.core.android.internal;

import java.net.MalformedURLException;
import java.net.URI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007¨\u0006\u0002"}, d2 = {"parseUrl", "", "zendesk.core_core-utilities"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class StringKtxKt {
    @InternalZendeskApi
    @NotNull
    public static final String parseUrl(@NotNull String str) {
        str.getClass();
        try {
            URI uri = new URI(str);
            return k.m(uri.getScheme(), "://", uri.getHost());
        } catch (MalformedURLException unused) {
            return "";
        }
    }
}
