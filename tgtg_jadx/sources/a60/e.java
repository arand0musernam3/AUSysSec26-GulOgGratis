package a60;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Method f851k;
    public final /* synthetic */ Class l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f852m;

    public e(Method method, Class cls, int i11) {
        this.f851k = method;
        this.l = cls;
        this.f852m = i11;
    }

    @Override // a60.h0
    public final Object f() {
        return this.f851k.invoke(null, this.l, Integer.valueOf(this.f852m));
    }

    public final String toString() {
        return this.l.getName();
    }
}
