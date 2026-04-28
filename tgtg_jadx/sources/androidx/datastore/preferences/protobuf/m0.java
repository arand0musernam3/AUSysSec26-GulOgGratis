package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public static l0 a(Object obj, Object obj2) {
        l0 l0VarB = (l0) obj;
        l0 l0Var = (l0) obj2;
        if (!l0Var.isEmpty()) {
            if (!l0VarB.f3009a) {
                l0VarB = l0VarB.b();
            }
            l0VarB.a();
            if (!l0Var.isEmpty()) {
                l0VarB.putAll(l0Var);
            }
        }
        return l0VarB;
    }
}
