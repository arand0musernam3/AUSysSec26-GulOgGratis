package atd.ax;

import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/ui/listener/OutOfBandChallengeListener;", "Lcom/adyen/threeds2/internal/ui/listener/ChallengeListener;", "openOobApp", "", "appUri", "Landroid/net/Uri;", "whitelistStatus", "", "submitOobChallenge", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getSDKTransactionID extends getSDKAppID {
    void AuthenticationRequestParameters(@NotNull Uri uri, @Nullable String str);

    void getSDKTransactionID(@Nullable String str);
}
