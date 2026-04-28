package tx;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public enum d0 {
    ContextChoose("context_choose"),
    JoinTournament("join_tournament");


    @NotNull
    private final String rawValue;

    d0(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
