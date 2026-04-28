package a60;

import com.braze.h2;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f945d;

    public z(Type type, String str, Object obj) {
        this.f942a = type;
        this.f943b = str;
        this.f944c = obj;
    }

    @Override // a60.k
    public final Object a(p pVar) {
        k kVar = this.f945d;
        if (kVar != null) {
            return kVar.a(pVar);
        }
        h2.b("JsonAdapter isn't ready");
        return null;
    }

    @Override // a60.k
    public final void e(q qVar, Object obj) {
        k kVar = this.f945d;
        if (kVar != null) {
            kVar.e(qVar, obj);
        } else {
            h2.b("JsonAdapter isn't ready");
        }
    }

    public final String toString() {
        k kVar = this.f945d;
        return kVar != null ? kVar.toString() : super.toString();
    }
}
