package p50;

import oz.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f34482a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(q50.b bVar, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13 += 2) {
            int i14 = i11 - i13;
            int i15 = i14;
            while (true) {
                int i16 = i11 + i13;
                if (i15 <= i16) {
                    bVar.b(i15, i14);
                    bVar.b(i15, i16);
                    bVar.b(i14, i15);
                    bVar.b(i16, i15);
                    i15++;
                }
            }
        }
        int i17 = i11 - i12;
        bVar.b(i17, i17);
        int i18 = i17 + 1;
        bVar.b(i18, i17);
        bVar.b(i17, i18);
        int i19 = i11 + i12;
        bVar.b(i19, i17);
        bVar.b(i19, i18);
        bVar.b(i19, i19 - 1);
    }

    public static q50.a b(q50.a aVar, int i11, int i12) {
        r50.a aVar2;
        int i13 = aVar.f36056b / i12;
        if (i12 == 4) {
            aVar2 = r50.a.f37722j;
        } else if (i12 == 6) {
            aVar2 = r50.a.f37721i;
        } else if (i12 == 8) {
            aVar2 = r50.a.l;
        } else if (i12 == 10) {
            aVar2 = r50.a.f37720h;
        } else {
            if (i12 != 12) {
                i4.a.f("Unsupported word size ".concat(String.valueOf(i12)));
                return null;
            }
            aVar2 = r50.a.f37719g;
        }
        m mVar = new m(aVar2);
        int i14 = i11 / i12;
        int[] iArr = new int[i14];
        int i15 = aVar.f36056b / i12;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i12; i18++) {
                i17 |= aVar.d((i16 * i12) + i18) ? 1 << ((i12 - i18) - 1) : 0;
            }
            iArr[i16] = i17;
        }
        mVar.o(i14 - i13, iArr);
        q50.a aVar3 = new q50.a();
        aVar3.b(0, i11 % i12);
        for (int i19 = 0; i19 < i14; i19++) {
            aVar3.b(iArr[i19], i12);
        }
        return aVar3;
    }

    public static q50.a c(q50.a aVar, int i11) {
        q50.a aVar2 = new q50.a();
        int i12 = aVar.f36056b;
        int i13 = (1 << i11) - 2;
        int i14 = 0;
        while (i14 < i12) {
            int i15 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                int i17 = i14 + i16;
                if (i17 >= i12 || aVar.d(i17)) {
                    i15 |= 1 << ((i11 - 1) - i16);
                }
            }
            int i18 = i15 & i13;
            if (i18 == i13) {
                aVar2.b(i18, i11);
            } else if (i18 == 0) {
                aVar2.b(i15 | 1, i11);
            } else {
                aVar2.b(i15, i11);
                i14 += i11;
            }
            i14--;
            i14 += i11;
        }
        return aVar2;
    }
}
