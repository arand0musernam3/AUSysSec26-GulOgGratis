package h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f21109a = 2500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f21110b = 1500;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f21111c = 50;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[Catch: k -> 0x01c8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {k -> 0x01c8, blocks: (B:34:0x00c8, B:41:0x00e6, B:55:0x010e, B:57:0x0128, B:61:0x013d, B:65:0x0145), top: B:115:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, t1.j] */
    /* JADX WARN: Type inference failed for: r12v6, types: [T, t1.j] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0195 -> B:120:0x01a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(f2.x r28, int r29, int r30, int r31, z5.c r32, z70.c r33) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.f1.a(f2.x, int, int, int, z5.c, z70.c):java.lang.Object");
    }

    public static final boolean b(boolean z11, f2.x xVar, int i11, int i12) {
        if (z11) {
            if (xVar.c() > i11) {
                return true;
            }
            return xVar.c() == i11 && xVar.d() > i12;
        }
        if (xVar.c() < i11) {
            return true;
        }
        return xVar.c() == i11 && xVar.d() < i12;
    }

    public static final boolean c(f2.x xVar, int i11) {
        return i11 <= xVar.e() && xVar.c() <= i11;
    }
}
