package zendesk.conversationkit.android.internal.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00052\u00060\u0001j\u0002`\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lzendesk/conversationkit/android/internal/exception/MultiConvoDisabledException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiConvoDisabledException extends Exception {

    @NotNull
    private static final String MULTI_CONVERSATIONS_EXCEPTION = "Multi conversations is not enabled";

    public MultiConvoDisabledException() {
        super(MULTI_CONVERSATIONS_EXCEPTION);
    }
}
