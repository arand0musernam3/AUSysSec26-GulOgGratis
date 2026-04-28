package cz;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c DEVICE_CHARGING;
    public static final c DEVICE_IDLE;
    public static final c NETWORK_UNMETERED;

    static {
        c cVar = new c("NETWORK_UNMETERED", 0);
        NETWORK_UNMETERED = cVar;
        c cVar2 = new c("DEVICE_IDLE", 1);
        DEVICE_IDLE = cVar2;
        c cVar3 = new c("DEVICE_CHARGING", 2);
        DEVICE_CHARGING = cVar3;
        $VALUES = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
