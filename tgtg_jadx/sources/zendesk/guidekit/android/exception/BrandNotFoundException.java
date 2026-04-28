package zendesk.guidekit.android.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/guidekit/android/exception/BrandNotFoundException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "channelId", "", "<init>", "(Ljava/lang/String;)V", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BrandNotFoundException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandNotFoundException(@NotNull String str) {
        super("Brand with ID: " + str + " was not found");
        str.getClass();
    }
}
