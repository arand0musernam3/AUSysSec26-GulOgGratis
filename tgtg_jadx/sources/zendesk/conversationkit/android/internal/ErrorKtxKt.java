package zendesk.conversationkit.android.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isContentTooLargeException", "", "", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ErrorKtxKt {
    public static final boolean isContentTooLargeException(@NotNull Throwable th2) {
        th2.getClass();
        return (th2 instanceof HttpException) && ((HttpException) th2).f37956a == 413;
    }
}
