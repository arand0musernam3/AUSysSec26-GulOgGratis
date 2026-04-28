package androidx.datastore.preferences.protobuf;

import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0[] f2980a;

    @Override // androidx.datastore.preferences.protobuf.o0
    public final z0 a(Class cls) {
        for (o0 o0Var : this.f2980a) {
            if (o0Var.b(cls)) {
                return o0Var.a(cls);
            }
        }
        h2.a("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean b(Class cls) {
        for (o0 o0Var : this.f2980a) {
            if (o0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
