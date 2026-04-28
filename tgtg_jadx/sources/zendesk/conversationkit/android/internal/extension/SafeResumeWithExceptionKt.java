package zendesk.conversationkit.android.internal.extension;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import u70.o;
import u70.p;
import u70.q;
import v80.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lv80/k;", "", "exception", "", "safeResumeWithException", "(Lv80/k;Ljava/lang/Throwable;)V", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SafeResumeWithExceptionKt {
    public static final <T> void safeResumeWithException(@NotNull k kVar, @NotNull Throwable th2) {
        kVar.getClass();
        th2.getClass();
        if (kVar.g()) {
            o oVar = q.f40850b;
            kVar.resumeWith(new p(th2));
        }
    }
}
