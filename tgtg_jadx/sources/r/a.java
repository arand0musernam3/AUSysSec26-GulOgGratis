package r;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f37414e = new HashMap();

    @Override // r.f
    public final c b(Object obj) {
        return (c) this.f37414e.get(obj);
    }

    @Override // r.f
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.f37414e.remove(obj);
        return objC;
    }
}
