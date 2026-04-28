package zendesk.conversationkit.android.internal;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0002H\u0000\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"imageMimeTypes", "", "", "[Ljava/lang/String;", "isImageMimeType", "", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FileExtKt {

    @NotNull
    private static final String[] imageMimeTypes = {"image/jpeg", "image/png", "image/gif", "image/jpg", "image/webp", "image/svg+xml"};

    public static final boolean isImageMimeType(@NotNull String str) {
        str.getClass();
        String[] strArr = imageMimeTypes;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return y.v(strArr, lowerCase);
    }
}
