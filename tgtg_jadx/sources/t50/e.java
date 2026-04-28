package t50;

import com.braze.h2;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e[] f39810i = {new e(false, 3, 5, 8, 8, 1, 3, 5), new e(false, 5, 7, 10, 10, 1, 5, 7), new e(true, 5, 7, 16, 6, 1, 5, 7), new e(false, 8, 10, 12, 12, 1, 8, 10), new e(true, 10, 11, 14, 6, 2, 10, 11), new e(false, 12, 12, 14, 14, 1, 12, 12), new e(true, 16, 14, 24, 10, 1, 16, 14), new e(false, 18, 14, 16, 16, 1, 18, 14), new e(false, 22, 18, 18, 18, 1, 22, 18), new e(true, 22, 18, 16, 10, 2, 22, 18), new e(false, 30, 20, 20, 20, 1, 30, 20), new e(true, 32, 24, 16, 14, 2, 32, 24), new e(false, 36, 24, 22, 22, 1, 36, 24), new e(false, 44, 28, 24, 24, 1, 44, 28), new e(true, 49, 28, 22, 14, 2, 49, 28), new e(false, 62, 36, 14, 14, 4, 62, 36), new e(false, 86, 42, 16, 16, 4, 86, 42), new e(false, 114, 48, 18, 18, 4, 114, 48), new e(false, 144, 56, 20, 20, 4, 144, 56), new e(false, 174, 68, 22, 22, 4, 174, 68), new e(false, 204, 84, 24, 24, 4, 102, 42), new e(false, 280, 112, 14, 14, 16, 140, 56), new e(false, 368, 144, 16, 16, 16, 92, 36), new e(false, 456, BERTags.PRIVATE, 18, 18, 16, 114, 48), new e(false, 576, BERTags.FLAGS, 20, 20, 16, 144, 56), new e(false, 696, 272, 22, 22, 16, 174, 68), new e(false, 816, 336, 24, 24, 16, 136, 56), new e(false, 1050, 408, 18, 18, 36, 175, 68), new e(false, 1304, 496, 20, 20, 36, 163, 62), new a(false, 1558, 620, 22, 22, 36, -1, 62)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f39817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f39818h;

    public e(boolean z11, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f39811a = z11;
        this.f39812b = i11;
        this.f39813c = i12;
        this.f39814d = i13;
        this.f39815e = i14;
        this.f39816f = i15;
        this.f39817g = i16;
        this.f39818h = i17;
    }

    public static e e(int i11, f fVar) {
        for (int i12 = 0; i12 < 30; i12++) {
            e eVar = f39810i[i12];
            if (!(fVar == f.FORCE_SQUARE && eVar.f39811a) && ((fVar != f.FORCE_RECTANGLE || eVar.f39811a) && i11 <= eVar.f39812b)) {
                return eVar;
            }
        }
        i4.a.f("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i11)));
        return null;
    }

    public int a(int i11) {
        return this.f39817g;
    }

    public final int b() {
        int i11 = this.f39816f;
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2 && i11 != 4) {
                if (i11 == 16) {
                    return 4;
                }
                if (i11 == 36) {
                    return 6;
                }
                h2.b("Cannot handle this number of data regions");
                return 0;
            }
        }
        return i12;
    }

    public int c() {
        return this.f39812b / this.f39817g;
    }

    public final int d() {
        int i11 = this.f39816f;
        if (i11 == 1 || i11 == 2) {
            return 1;
        }
        if (i11 == 4) {
            return 2;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 == 36) {
            return 6;
        }
        h2.b("Cannot handle this number of data regions");
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f39811a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        int i11 = this.f39814d;
        sb2.append(i11);
        sb2.append('x');
        int i12 = this.f39815e;
        sb2.append(i12);
        sb2.append(", symbol size ");
        sb2.append((b() * i11) + (b() << 1));
        sb2.append('x');
        sb2.append((d() * i12) + (d() << 1));
        sb2.append(", symbol data size ");
        sb2.append(b() * i11);
        sb2.append('x');
        sb2.append(d() * i12);
        sb2.append(", codewords ");
        sb2.append(this.f39812b);
        sb2.append('+');
        sb2.append(this.f39813c);
        return sb2.toString();
    }
}
