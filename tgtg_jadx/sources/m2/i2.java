package m2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f28912a = new f2(r5.r.f37699a, 0, 0);

    public static final r5.e0 a(r5.g0 g0Var, m5.h hVar) {
        r5.e0 e0VarC = g0Var.c(hVar);
        int length = hVar.f29538b.length();
        m5.h hVar2 = e0VarC.f37669a;
        r5.s sVar = e0VarC.f37670b;
        int length2 = hVar2.f29538b.length();
        int iMin = Math.min(length, 100);
        for (int i11 = 0; i11 < iMin; i11++) {
            b(sVar.r(i11), length2, i11);
        }
        b(sVar.r(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i12 = 0; i12 < iMin2; i12++) {
            c(sVar.i(i12), length, i12);
        }
        c(sVar.i(length2), length, length2);
        return new r5.e0(hVar2, new f2(sVar, hVar.f29538b.length(), hVar2.f29538b.length()));
    }

    public static final void b(int i11, int i12, int i13) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= i12) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        StringBuilder sbR = r8.k.r(i13, i11, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbR.append(i12);
        sbR.append(']');
        c2.a.c(sbR.toString());
    }

    public static final void c(int i11, int i12, int i13) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= i12) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        StringBuilder sbR = r8.k.r(i13, i11, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbR.append(i12);
        sbR.append(']');
        c2.a.c(sbR.toString());
    }
}
