package k30;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f25910a;

    public l(Object[] objArr) {
        this.f25910a = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.f25910a;
        int length = objArr.length;
        return length != 0 ? length != 1 ? m.l(objArr.length, (Object[]) objArr.clone()) : new f0(objArr[0]) : d0.f25887j;
    }
}
