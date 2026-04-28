package oa0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d7.e f32291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f32293c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f32291a = null;
            f32292b = new a(7);
            f32293c = new a(6);
        } else if (property.equals("Dalvik")) {
            f32291a = new d7.e(3);
            f32292b = new i0(0);
            f32293c = new c(6);
        } else {
            f32291a = null;
            f32292b = new i0(1);
            f32293c = new c(6);
        }
    }
}
