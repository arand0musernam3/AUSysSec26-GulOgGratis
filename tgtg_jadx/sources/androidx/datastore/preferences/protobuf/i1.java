package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends g1 {
    @Override // androidx.datastore.preferences.protobuf.g1
    public final h1 a(Object obj) {
        z zVar = (z) obj;
        h1 h1Var = zVar.unknownFields;
        if (h1Var != h1.f2981f) {
            return h1Var;
        }
        h1 h1Var2 = new h1(0, new int[8], new Object[8], true);
        zVar.unknownFields = h1Var2;
        return h1Var2;
    }
}
