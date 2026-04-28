package com.adyen.checkout.adyen3ds2.internal.ui;

import com.adyen.threeds2.ChallengeResult;
import com.adyen.threeds2.ChallengeStatusHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0006\u0010\u000e\u001a\u00020\fR(\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/ui/SharedChallengeStatusHandler;", "Lcom/adyen/threeds2/ChallengeStatusHandler;", "()V", "value", "onCompletionListener", "getOnCompletionListener", "()Lcom/adyen/threeds2/ChallengeStatusHandler;", "setOnCompletionListener", "(Lcom/adyen/threeds2/ChallengeStatusHandler;)V", "queuedResult", "Lcom/adyen/threeds2/ChallengeResult;", "onCompletion", "", "result", "reset", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSharedChallengeStatusHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedChallengeStatusHandler.kt\ncom/adyen/checkout/adyen3ds2/internal/ui/SharedChallengeStatusHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class SharedChallengeStatusHandler implements ChallengeStatusHandler {

    @NotNull
    public static final SharedChallengeStatusHandler INSTANCE = new SharedChallengeStatusHandler();

    @Nullable
    private static ChallengeStatusHandler onCompletionListener;

    @Nullable
    private static ChallengeResult queuedResult;

    private SharedChallengeStatusHandler() {
    }

    @Nullable
    public final ChallengeStatusHandler getOnCompletionListener() {
        return onCompletionListener;
    }

    @Override // com.adyen.threeds2.ChallengeStatusHandler
    public void onCompletion(@NotNull ChallengeResult result) {
        result.getClass();
        ChallengeStatusHandler challengeStatusHandler = onCompletionListener;
        Unit unit = null;
        if (challengeStatusHandler != null) {
            challengeStatusHandler.onCompletion(result);
            queuedResult = null;
            unit = Unit.f26487a;
        }
        if (unit == null) {
            queuedResult = result;
        }
    }

    public final void reset() {
        setOnCompletionListener(null);
        queuedResult = null;
    }

    public final void setOnCompletionListener(@Nullable ChallengeStatusHandler challengeStatusHandler) {
        onCompletionListener = challengeStatusHandler;
        ChallengeResult challengeResult = queuedResult;
        if (challengeResult != null) {
            INSTANCE.onCompletion(challengeResult);
        }
    }
}
