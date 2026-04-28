package com.app.tgtg.model.remote.discover.request;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/remote/discover/request/DiscoverRequestConstants;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "EXPERIMENT", "DEBUG_MODE", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DiscoverRequestConstants {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DiscoverRequestConstants[] $VALUES;

    @NotNull
    private final Object value;
    public static final DiscoverRequestConstants EXPERIMENT = new DiscoverRequestConstants("EXPERIMENT", 0, "DEFAULT");
    public static final DiscoverRequestConstants DEBUG_MODE = new DiscoverRequestConstants("DEBUG_MODE", 1, Boolean.FALSE);

    private static final /* synthetic */ DiscoverRequestConstants[] $values() {
        return new DiscoverRequestConstants[]{EXPERIMENT, DEBUG_MODE};
    }

    static {
        DiscoverRequestConstants[] discoverRequestConstantsArr$values = $values();
        $VALUES = discoverRequestConstantsArr$values;
        $ENTRIES = n.w(discoverRequestConstantsArr$values);
    }

    private DiscoverRequestConstants(String str, int i11, Object obj) {
        this.value = obj;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static DiscoverRequestConstants valueOf(String str) {
        return (DiscoverRequestConstants) Enum.valueOf(DiscoverRequestConstants.class, str);
    }

    public static DiscoverRequestConstants[] values() {
        return (DiscoverRequestConstants[]) $VALUES.clone();
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }
}
