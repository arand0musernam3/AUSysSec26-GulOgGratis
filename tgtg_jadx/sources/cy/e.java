package cy;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum e {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");


    @Nullable
    private final String nativeProtocolAudience;

    e(String str) {
        this.nativeProtocolAudience = str;
    }

    public final String a() {
        return this.nativeProtocolAudience;
    }
}
