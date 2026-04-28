package k30;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f25896a;

    public f(Object[] objArr) {
        this.f25896a = objArr;
    }

    public Object readResolve() {
        d dVar = h.f25901b;
        Object[] objArr = this.f25896a;
        if (objArr.length == 0) {
            return x.f25926e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        m0.c.T(objArr2.length, objArr2);
        return h.j(objArr2.length, objArr2);
    }
}
