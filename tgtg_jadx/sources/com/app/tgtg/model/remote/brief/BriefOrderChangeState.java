package com.app.tgtg.model.remote.brief;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/app/tgtg/model/remote/brief/BriefOrderChangeState;", "", "<init>", "(Ljava/lang/String;I)V", "NO_CHANGE", "TIME_CHANGED", "CANCELLED", "REFUNDED", "DELEGATE_ACCEPTED", "DELEGATED_RETURNED", "DELEGATED_CANCELLED", "DELEGATED_TIME_RETURNED", "DELEGATED_FULFILLED", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BriefOrderChangeState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BriefOrderChangeState[] $VALUES;
    public static final BriefOrderChangeState NO_CHANGE = new BriefOrderChangeState("NO_CHANGE", 0);
    public static final BriefOrderChangeState TIME_CHANGED = new BriefOrderChangeState("TIME_CHANGED", 1);
    public static final BriefOrderChangeState CANCELLED = new BriefOrderChangeState("CANCELLED", 2);
    public static final BriefOrderChangeState REFUNDED = new BriefOrderChangeState("REFUNDED", 3);
    public static final BriefOrderChangeState DELEGATE_ACCEPTED = new BriefOrderChangeState("DELEGATE_ACCEPTED", 4);
    public static final BriefOrderChangeState DELEGATED_RETURNED = new BriefOrderChangeState("DELEGATED_RETURNED", 5);
    public static final BriefOrderChangeState DELEGATED_CANCELLED = new BriefOrderChangeState("DELEGATED_CANCELLED", 6);
    public static final BriefOrderChangeState DELEGATED_TIME_RETURNED = new BriefOrderChangeState("DELEGATED_TIME_RETURNED", 7);
    public static final BriefOrderChangeState DELEGATED_FULFILLED = new BriefOrderChangeState("DELEGATED_FULFILLED", 8);

    private static final /* synthetic */ BriefOrderChangeState[] $values() {
        return new BriefOrderChangeState[]{NO_CHANGE, TIME_CHANGED, CANCELLED, REFUNDED, DELEGATE_ACCEPTED, DELEGATED_RETURNED, DELEGATED_CANCELLED, DELEGATED_TIME_RETURNED, DELEGATED_FULFILLED};
    }

    static {
        BriefOrderChangeState[] briefOrderChangeStateArr$values = $values();
        $VALUES = briefOrderChangeStateArr$values;
        $ENTRIES = n.w(briefOrderChangeStateArr$values);
    }

    private BriefOrderChangeState(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static BriefOrderChangeState valueOf(String str) {
        return (BriefOrderChangeState) Enum.valueOf(BriefOrderChangeState.class, str);
    }

    public static BriefOrderChangeState[] values() {
        return (BriefOrderChangeState[]) $VALUES.clone();
    }
}
