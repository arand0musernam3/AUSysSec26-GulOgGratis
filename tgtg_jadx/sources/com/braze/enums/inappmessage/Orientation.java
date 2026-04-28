package com.braze.enums.inappmessage;

import a80.a;
import kotlin.Metadata;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/braze/enums/inappmessage/Orientation;", "", "<init>", "(Ljava/lang/String;I)V", "PORTRAIT", "LANDSCAPE", "ANY", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Orientation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Orientation[] $VALUES;
    public static final Orientation PORTRAIT = new Orientation("PORTRAIT", 0);
    public static final Orientation LANDSCAPE = new Orientation("LANDSCAPE", 1);
    public static final Orientation ANY = new Orientation("ANY", 2);

    private static final /* synthetic */ Orientation[] $values() {
        return new Orientation[]{PORTRAIT, LANDSCAPE, ANY};
    }

    static {
        Orientation[] orientationArr$values = $values();
        $VALUES = orientationArr$values;
        $ENTRIES = n.w(orientationArr$values);
    }

    private Orientation(String str, int i11) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) $VALUES.clone();
    }
}
