package ia0;

import com.braze.h2;
import java.io.InputStream;
import java.util.ArrayList;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f23604a = new f();

    public static final boolean a(int i11, byte[] bArr, int i12, byte[] bArr2, int i13) {
        bArr.getClass();
        bArr2.getClass();
        for (int i14 = 0; i14 < i13; i14++) {
            if (bArr[i14 + i11] != bArr2[i14 + i12]) {
                return false;
            }
        }
        return true;
    }

    public static final c0 b(h0 h0Var) {
        h0Var.getClass();
        return new c0(h0Var);
    }

    public static final d0 c(j0 j0Var) {
        j0Var.getClass();
        return new d0(j0Var);
    }

    public static void d(long j9, g gVar, int i11, ArrayList arrayList, int i12, int i13, ArrayList arrayList2) {
        int i14;
        int i15;
        ArrayList arrayList3;
        long j11;
        int i16;
        int i17 = i11;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i12 >= i13) {
            i4.a.f("Failed requirement.");
            return;
        }
        for (int i18 = i12; i18 < i13; i18++) {
            if (((j) arrayList4.get(i18)).e() < i17) {
                i4.a.f("Failed requirement.");
                return;
            }
        }
        j jVar = (j) arrayList.get(i12);
        j jVar2 = (j) arrayList4.get(i13 - 1);
        if (i17 == jVar.e()) {
            int iIntValue = ((Number) arrayList5.get(i12)).intValue();
            int i19 = i12 + 1;
            j jVar3 = (j) arrayList4.get(i19);
            i14 = i19;
            i15 = iIntValue;
            jVar = jVar3;
        } else {
            i14 = i12;
            i15 = -1;
        }
        if (jVar.j(i17) == jVar2.j(i17)) {
            int iMin = Math.min(jVar.e(), jVar2.e());
            int i21 = 0;
            for (int i22 = i17; i22 < iMin && jVar.j(i22) == jVar2.j(i22); i22++) {
                i21++;
            }
            long j12 = 4;
            long j13 = (gVar.f23643b / j12) + j9 + ((long) 2) + ((long) i21) + 1;
            gVar.C0(-i21);
            gVar.C0(i15);
            int i23 = i17 + i21;
            while (i17 < i23) {
                gVar.C0(jVar.j(i17) & 255);
                i17++;
            }
            if (i14 + 1 == i13) {
                if (i23 == ((j) arrayList4.get(i14)).e()) {
                    gVar.C0(((Number) arrayList5.get(i14)).intValue());
                    return;
                } else {
                    h2.b("Check failed.");
                    return;
                }
            }
            g gVar2 = new g();
            gVar.C0(((int) ((gVar2.f23643b / j12) + j13)) * (-1));
            d(j13, gVar2, i23, arrayList4, i14, i13, arrayList5);
            gVar.b0(gVar2);
            return;
        }
        int i24 = 1;
        for (int i25 = i14 + 1; i25 < i13; i25++) {
            if (((j) arrayList4.get(i25 - 1)).j(i17) != ((j) arrayList4.get(i25)).j(i17)) {
                i24++;
            }
        }
        long j14 = 4;
        long j15 = (gVar.f23643b / j14) + j9 + ((long) 2) + ((long) (i24 * 2));
        gVar.C0(i24);
        gVar.C0(i15);
        for (int i26 = i14; i26 < i13; i26++) {
            int iJ = ((j) arrayList4.get(i26)).j(i17);
            if (i26 == i14 || iJ != ((j) arrayList4.get(i26 - 1)).j(i17)) {
                gVar.C0(iJ & 255);
            }
        }
        g gVar3 = new g();
        int i27 = i14;
        while (i27 < i13) {
            byte bJ = ((j) arrayList4.get(i27)).j(i17);
            int i28 = i27 + 1;
            int i29 = i28;
            while (true) {
                if (i29 >= i13) {
                    i29 = i13;
                    break;
                } else if (bJ != ((j) arrayList4.get(i29)).j(i17)) {
                    break;
                } else {
                    i29++;
                }
            }
            if (i28 == i29 && i17 + 1 == ((j) arrayList4.get(i27)).e()) {
                gVar.C0(((Number) arrayList5.get(i27)).intValue());
                arrayList3 = arrayList5;
                j11 = j15;
                i16 = i29;
            } else {
                gVar.C0(((int) ((gVar3.f23643b / j14) + j15)) * (-1));
                arrayList3 = arrayList5;
                j11 = j15;
                i16 = i29;
                d(j11, gVar3, i17 + 1, arrayList, i27, i16, arrayList3);
                arrayList4 = arrayList;
            }
            j15 = j11;
            i27 = i16;
            arrayList5 = arrayList3;
        }
        gVar.b0(gVar3);
    }

    public static final void e(long j9, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j9 || j9 - j11 < j12) {
            StringBuilder sbG = l1.g("size=", j9, " offset=");
            sbG.append(j11);
            sbG.append(" byteCount=");
            sbG.append(j12);
            throw new ArrayIndexOutOfBoundsException(sbG.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ia0.y f(ia0.j... r11) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.b.f(ia0.j[]):ia0.y");
    }

    public static final u g(InputStream inputStream) {
        inputStream.getClass();
        return new u(inputStream, new l0());
    }

    public static final String h(byte b8) {
        char[] cArr = ja0.b.f24794a;
        return new String(new char[]{cArr[(b8 >> 4) & 15], cArr[b8 & 15]});
    }

    public static final String i(int i11) {
        if (i11 == 0) {
            return "0";
        }
        char[] cArr = ja0.b.f24794a;
        int i12 = 0;
        char[] cArr2 = {cArr[(i11 >> 28) & 15], cArr[(i11 >> 24) & 15], cArr[(i11 >> 20) & 15], cArr[(i11 >> 16) & 15], cArr[(i11 >> 12) & 15], cArr[(i11 >> 8) & 15], cArr[(i11 >> 4) & 15], cArr[i11 & 15]};
        while (i12 < 8 && cArr2[i12] == '0') {
            i12++;
        }
        kotlin.collections.f.f26505a.getClass();
        kotlin.collections.c.a(i12, 8, 8);
        return new String(cArr2, i12, 8 - i12);
    }
}
