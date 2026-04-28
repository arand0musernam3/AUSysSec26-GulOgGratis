package a60;

import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f939b;

    public x(Class cls, k kVar) {
        this.f938a = cls;
        this.f939b = kVar;
    }

    @Override // a60.j
    public final k a(Type type, Set set, b0 b0Var) {
        if (!set.isEmpty()) {
            return null;
        }
        Set set2 = b60.f.f6049a;
        if (h0.c(this.f938a, type)) {
            return this.f939b;
        }
        return null;
    }
}
