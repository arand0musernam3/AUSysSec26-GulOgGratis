package com.braze.enums;

import kotlin.Metadata;
import v0.n;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/braze/enums/BrazeDateFormat;", "", "format", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFormat", "()Ljava/lang/String;", "SHORT", "LONG", "ANDROID_LOGCAT", "CLOCK_12_HOUR", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeDateFormat {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ BrazeDateFormat[] $VALUES;
    private final String format;
    public static final BrazeDateFormat SHORT = new BrazeDateFormat("SHORT", 0, "yyyy-MM-dd");
    public static final BrazeDateFormat LONG = new BrazeDateFormat("LONG", 1, "yyyy-MM-dd kk:mm:ss");
    public static final BrazeDateFormat ANDROID_LOGCAT = new BrazeDateFormat("ANDROID_LOGCAT", 2, "MM-dd kk:mm:ss.SSS");
    public static final BrazeDateFormat CLOCK_12_HOUR = new BrazeDateFormat("CLOCK_12_HOUR", 3, DateKtxConstants.TIME_12_FORMAT_PATTERN);

    private static final /* synthetic */ BrazeDateFormat[] $values() {
        return new BrazeDateFormat[]{SHORT, LONG, ANDROID_LOGCAT, CLOCK_12_HOUR};
    }

    static {
        BrazeDateFormat[] brazeDateFormatArr$values = $values();
        $VALUES = brazeDateFormatArr$values;
        $ENTRIES = n.w(brazeDateFormatArr$values);
    }

    private BrazeDateFormat(String str, int i11, String str2) {
        this.format = str2;
    }

    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static BrazeDateFormat valueOf(String str) {
        return (BrazeDateFormat) Enum.valueOf(BrazeDateFormat.class, str);
    }

    public static BrazeDateFormat[] values() {
        return (BrazeDateFormat[]) $VALUES.clone();
    }

    public final String getFormat() {
        return this.format;
    }
}
