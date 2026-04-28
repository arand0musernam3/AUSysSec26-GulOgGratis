package x90;

import ia0.d0;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;
import m2.f2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f44100c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44104g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44098a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44099b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d[] f44101d = new d[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44102e = 7;

    public e(q qVar) {
        this.f44100c = new d0(qVar);
    }

    public final int a(int i11) {
        int i12;
        int i13 = 0;
        if (i11 > 0) {
            int length = this.f44101d.length;
            while (true) {
                length--;
                i12 = this.f44102e;
                if (length < i12 || i11 <= 0) {
                    break;
                }
                d dVar = this.f44101d[length];
                dVar.getClass();
                int i14 = dVar.f44097c;
                i11 -= i14;
                this.f44104g -= i14;
                this.f44103f--;
                i13++;
            }
            d[] dVarArr = this.f44101d;
            System.arraycopy(dVarArr, i12 + 1, dVarArr, i12 + 1 + i13, this.f44103f);
            this.f44102e += i13;
        }
        return i13;
    }

    public final ia0.j b(int i11) throws IOException {
        if (i11 >= 0) {
            d[] dVarArr = g.f44113a;
            if (i11 <= dVarArr.length - 1) {
                return dVarArr[i11].f44095a;
            }
        }
        int length = this.f44102e + 1 + (i11 - g.f44113a.length);
        if (length >= 0) {
            d[] dVarArr2 = this.f44101d;
            if (length < dVarArr2.length) {
                d dVar = dVarArr2[length];
                dVar.getClass();
                return dVar.f44095a;
            }
        }
        wy.o.e(i11 + 1, "Header index too large ");
        return null;
    }

    public final void c(d dVar) {
        this.f44099b.add(dVar);
        int i11 = dVar.f44097c;
        int i12 = this.f44098a;
        if (i11 > i12) {
            d[] dVarArr = this.f44101d;
            kotlin.collections.x.m(dVarArr, 0, dVarArr.length, null);
            this.f44102e = this.f44101d.length - 1;
            this.f44103f = 0;
            this.f44104g = 0;
            return;
        }
        a((this.f44104g + i11) - i12);
        int i13 = this.f44103f + 1;
        d[] dVarArr2 = this.f44101d;
        if (i13 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.f44102e = this.f44101d.length - 1;
            this.f44101d = dVarArr3;
        }
        int i14 = this.f44102e;
        this.f44102e = i14 - 1;
        this.f44101d[i14] = dVar;
        this.f44103f++;
        this.f44104g += i11;
    }

    public final ia0.j d() {
        d0 d0Var = this.f44100c;
        byte b8 = d0Var.readByte();
        byte[] bArr = r90.e.f37811a;
        int i11 = b8 & 255;
        int i12 = 0;
        boolean z11 = (b8 & ByteCompanionObject.MIN_VALUE) == 128;
        long jE = e(i11, 127);
        if (!z11) {
            return d0Var.q(jE);
        }
        ia0.g gVar = new ia0.g();
        int[] iArr = x.f44203a;
        d0Var.getClass();
        f2 f2Var = x.f44205c;
        f2 f2Var2 = f2Var;
        int i13 = 0;
        for (long j9 = 0; j9 < jE; j9++) {
            byte b11 = d0Var.readByte();
            byte[] bArr2 = r90.e.f37811a;
            i12 = (i12 << 8) | (b11 & 255);
            i13 += 8;
            while (i13 >= 8) {
                f2[] f2VarArr = (f2[]) f2Var2.f28854d;
                f2VarArr.getClass();
                f2Var2 = f2VarArr[(i12 >>> (i13 - 8)) & 255];
                f2Var2.getClass();
                if (((f2[]) f2Var2.f28854d) == null) {
                    gVar.z0(f2Var2.f28852b);
                    i13 -= f2Var2.f28853c;
                    f2Var2 = f2Var;
                } else {
                    i13 -= 8;
                }
            }
        }
        while (i13 > 0) {
            f2[] f2VarArr2 = (f2[]) f2Var2.f28854d;
            f2VarArr2.getClass();
            f2 f2Var3 = f2VarArr2[(i12 << (8 - i13)) & 255];
            f2Var3.getClass();
            f2[] f2VarArr3 = (f2[]) f2Var3.f28854d;
            int i14 = f2Var3.f28853c;
            if (f2VarArr3 != null || i14 > i13) {
                break;
            }
            gVar.z0(f2Var3.f28852b);
            i13 -= i14;
            f2Var2 = f2Var;
        }
        return gVar.q(gVar.f23643b);
    }

    public final int e(int i11, int i12) {
        int i13 = i11 & i12;
        if (i13 < i12) {
            return i13;
        }
        int i14 = 0;
        while (true) {
            byte b8 = this.f44100c.readByte();
            byte[] bArr = r90.e.f37811a;
            int i15 = b8 & 255;
            if ((b8 & ByteCompanionObject.MIN_VALUE) == 0) {
                return i12 + (i15 << i14);
            }
            i12 += (b8 & ByteCompanionObject.MAX_VALUE) << i14;
            i14 += 7;
        }
    }
}
