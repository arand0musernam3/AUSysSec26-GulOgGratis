package k30;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f25914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f25915b;

    public o(Comparator comparator, Object[] objArr) {
        this.f25914a = comparator;
        this.f25915b = objArr;
    }

    public Object readResolve() {
        n nVar = new n(this.f25914a);
        nVar.b(this.f25915b);
        return nVar.e();
    }
}
