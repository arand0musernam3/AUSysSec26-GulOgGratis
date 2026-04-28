package co.datadome.sdk.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lco/datadome/sdk/internal/SDKTestingMode;", "", "()V", "isEnabled", "", "()Z", "setEnabled", "(Z)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SDKTestingMode {

    @NotNull
    public static final SDKTestingMode INSTANCE = new SDKTestingMode();
    private static boolean isEnabled;

    private SDKTestingMode() {
    }

    public final boolean isEnabled() {
        return isEnabled;
    }

    public final void setEnabled(boolean z11) {
        isEnabled = z11;
    }
}
