package com.braze.enums;

import kotlin.Metadata;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/enums/GeofenceTransitionType;", "", "<init>", "(Ljava/lang/String;I)V", "ENTER", "EXIT", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeofenceTransitionType {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ GeofenceTransitionType[] $VALUES;
    public static final GeofenceTransitionType ENTER = new GeofenceTransitionType("ENTER", 0);
    public static final GeofenceTransitionType EXIT = new GeofenceTransitionType("EXIT", 1);

    private static final /* synthetic */ GeofenceTransitionType[] $values() {
        return new GeofenceTransitionType[]{ENTER, EXIT};
    }

    static {
        GeofenceTransitionType[] geofenceTransitionTypeArr$values = $values();
        $VALUES = geofenceTransitionTypeArr$values;
        $ENTRIES = n.w(geofenceTransitionTypeArr$values);
    }

    private GeofenceTransitionType(String str, int i11) {
    }

    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static GeofenceTransitionType valueOf(String str) {
        return (GeofenceTransitionType) Enum.valueOf(GeofenceTransitionType.class, str);
    }

    public static GeofenceTransitionType[] values() {
        return (GeofenceTransitionType[]) $VALUES.clone();
    }
}
