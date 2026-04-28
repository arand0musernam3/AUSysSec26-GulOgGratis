package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f2960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f2961b;

    static {
        x0 x0Var = x0.f3059c;
        e0 e0Var = null;
        try {
            e0Var = (e0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2960a = e0Var;
        f2961b = new e0();
    }
}
