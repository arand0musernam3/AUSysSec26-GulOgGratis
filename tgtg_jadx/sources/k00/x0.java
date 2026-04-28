package k00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25710a;

    public x0(String str) {
        this.f25710a = str;
    }

    @Override // k00.y0
    public final int a() {
        return y0.e((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        y0 y0Var = (y0) obj;
        int iA = y0Var.a();
        int iE = y0.e((byte) 96);
        if (iE != iA) {
            return iE - y0Var.a();
        }
        String str = ((x0) y0Var).f25710a;
        int length = str.length();
        String str2 = this.f25710a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            return this.f25710a.equals(((x0) obj).f25710a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(y0.e((byte) 96)), this.f25710a});
    }

    public final String toString() {
        return r8.k.p(new StringBuilder("\""), this.f25710a, "\"");
    }
}
