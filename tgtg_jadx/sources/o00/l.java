package o00;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f31703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f31704d = new HashMap(0);

    public l(int i11, int i12) {
        if (i11 > i12) {
            i4.a.h();
            throw null;
        }
        this.f31701a = i11;
        this.f31702b = i12;
        this.f31703c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return e0.f.h(iIdentityHashCode, "Node", new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4));
    }
}
