package g2;

import java.util.ArrayList;
import kotlin.collections.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f18264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f18270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f18271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18272i;

    public y(i iVar) {
        this.f18264a = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new w(0, 0));
        this.f18265b = arrayList;
        this.f18269f = -1;
        this.f18270g = new ArrayList();
        this.f18271h = n0.f26529a;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.f18272i))) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e7.h b(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.y.b(int):e7.h");
    }

    public final int c(int i11) {
        int i12;
        if (d() <= 0) {
            return 0;
        }
        if (i11 >= d()) {
            c2.a.a("ItemIndex > total count");
        }
        if (!this.f18264a.f18173e) {
            return i11 / this.f18272i;
        }
        ArrayList arrayList = this.f18265b;
        int size = arrayList.size();
        kotlin.collections.d0.l(arrayList.size(), size);
        int i13 = size - 1;
        int i14 = 0;
        while (true) {
            if (i14 > i13) {
                i12 = -(i14 + 1);
                break;
            }
            i12 = (i14 + i13) >>> 1;
            int i15 = ((w) arrayList.get(i12)).f18261a - i11;
            if (i15 >= 0) {
                if (i15 <= 0) {
                    break;
                }
                i13 = i12 - 1;
            } else {
                i14 = i12 + 1;
            }
        }
        if (i12 < 0) {
            i12 = (-i12) - 2;
        }
        int iA = a() * i12;
        int i16 = ((w) arrayList.get(i12)).f18261a;
        if (i16 > i11) {
            c2.a.a("currentItemIndex > itemIndex");
        }
        int i17 = 0;
        while (i16 < i11) {
            int i18 = i16 + 1;
            int iE = e(i16);
            i17 += iE;
            int i19 = this.f18272i;
            if (i17 >= i19) {
                if (i17 == i19) {
                    iA++;
                    i17 = 0;
                } else {
                    iA++;
                    i17 = iE;
                }
            }
            if (iA % a() == 0 && iA / a() >= arrayList.size()) {
                arrayList.add(new w(i18 - (i17 > 0 ? 1 : 0), 0));
            }
            i16 = i18;
        }
        return e(i11) + i17 > this.f18272i ? iA + 1 : iA;
    }

    public final int d() {
        return this.f18264a.f18172d.f398b;
    }

    public final int e(int i11) {
        h2.j jVarJ = this.f18264a.f18172d.j(i11);
        int i12 = i11 - jVarJ.f21139a;
        return (int) ((b) ((f) jVarJ.f21141c).f18165b.invoke(x.f18263a, Integer.valueOf(i12))).f18124a;
    }
}
