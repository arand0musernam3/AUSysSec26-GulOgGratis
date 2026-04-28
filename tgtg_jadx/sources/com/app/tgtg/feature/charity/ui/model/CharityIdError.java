package com.app.tgtg.feature.charity.ui.model;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/feature/charity/ui/model/CharityIdError;", "", "<init>", "(Ljava/lang/String;I)V", "CHARITY_NOT_FOUND", "TOO_MANY_REQUESTS", "UNKNOWN", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CharityIdError {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CharityIdError[] $VALUES;
    public static final CharityIdError CHARITY_NOT_FOUND = new CharityIdError("CHARITY_NOT_FOUND", 0);
    public static final CharityIdError TOO_MANY_REQUESTS = new CharityIdError("TOO_MANY_REQUESTS", 1);
    public static final CharityIdError UNKNOWN = new CharityIdError("UNKNOWN", 2);

    private static final /* synthetic */ CharityIdError[] $values() {
        return new CharityIdError[]{CHARITY_NOT_FOUND, TOO_MANY_REQUESTS, UNKNOWN};
    }

    static {
        CharityIdError[] charityIdErrorArr$values = $values();
        $VALUES = charityIdErrorArr$values;
        $ENTRIES = n.w(charityIdErrorArr$values);
    }

    private CharityIdError(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CharityIdError valueOf(String str) {
        return (CharityIdError) Enum.valueOf(CharityIdError.class, str);
    }

    public static CharityIdError[] values() {
        return (CharityIdError[]) $VALUES.clone();
    }
}
