package e10;

import android.content.Context;
import java.util.Locale;
import t1.z1;
import te.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements z1, f0, zz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15548a;

    public t() {
        this.f15548a = 3;
    }

    @Override // zz.b
    public int c(Context context, String str, boolean z11) {
        return 0;
    }

    @Override // zz.b
    public int d(Context context, String str) {
        return this.f15548a;
    }

    @Override // t1.x1
    public t1.o e(long j9, t1.o oVar, t1.o oVar2, t1.o oVar3) {
        return j9 < ((long) this.f15548a) * 1000000 ? oVar : oVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    @Override // te.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(ue.d r21, float r22) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e10.t.f(ue.d, float):java.lang.Object");
    }

    public void g(int i11) {
        if (i11 != 0) {
            if (i11 == 0) {
                i11 = 0;
            } else if (i11 != 2 && i11 != 1 && i11 != 23 && i11 != 3) {
                Locale locale = Locale.US;
                i4.a.f(j4.s.f(i11, "Invalid environment value "));
                return;
            }
        }
        this.f15548a = i11;
    }

    @Override // t1.z1
    public int q() {
        return this.f15548a;
    }

    @Override // t1.z1
    public int t() {
        return 0;
    }

    public /* synthetic */ t(int i11) {
        this.f15548a = i11;
    }

    @Override // t1.x1
    public t1.o m(long j9, t1.o oVar, t1.o oVar2, t1.o oVar3) {
        return oVar3;
    }
}
