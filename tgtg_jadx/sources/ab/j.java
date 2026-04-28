package ab;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends xz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f1212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f1213f;

    public j(Object obj, k kVar, a aVar) {
        obj.getClass();
        kVar.getClass();
        this.f1211d = obj;
        this.f1212e = kVar;
        this.f1213f = aVar;
    }

    @Override // xz.b
    public final xz.b I(String str, Function1 function1) {
        Object obj = this.f1211d;
        return ((Boolean) function1.invoke(obj)).booleanValue() ? this : new i(obj, str, this.f1213f, this.f1212e);
    }

    @Override // xz.b
    public final Object p() {
        return this.f1211d;
    }
}
