package a2;

import f2.c0;
import f2.t;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f196b;

    public c(c0 c0Var, p pVar) {
        this.f195a = c0Var;
        this.f196b = pVar;
    }

    @Override // a2.o
    public final float a(float f11, float f12) {
        float fAbs = Math.abs(f12);
        List list = this.f195a.j().f17192k;
        int i11 = 0;
        if (!list.isEmpty()) {
            int size = list.size();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i11 += ((t) ((f2.m) it.next())).f17214q;
            }
            i11 /= size;
        }
        float f13 = fAbs - i11;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        return Math.signum(f12) * f13;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    @Override // a2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b(float r18) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.c.b(float):float");
    }
}
