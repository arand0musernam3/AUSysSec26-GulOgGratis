package b5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g4.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f5797a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f5798b;

    @Override // g4.r
    public final boolean a() {
        Boolean bool = f5798b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw b3.i.D("canFocus is read before it is written");
    }

    @Override // g4.r
    public final void e(boolean z11) {
        f5798b = Boolean.valueOf(z11);
    }
}
