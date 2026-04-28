package a60;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Method f848k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Class f849m;

    public d(Method method, Object obj, Class cls) {
        this.f848k = method;
        this.l = obj;
        this.f849m = cls;
    }

    @Override // a60.h0
    public final Object f() {
        return this.f848k.invoke(this.l, this.f849m);
    }

    public final String toString() {
        return this.f849m.getName();
    }
}
