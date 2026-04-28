package y00;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45332a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f45333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f45334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f45336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f45337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h2.s0 f45338g;

    public z0(a1 a1Var, String str, URL url, byte[] bArr, Map map, y0 y0Var) {
        Objects.requireNonNull(a1Var);
        this.f45338g = a1Var;
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.h(url);
        this.f45333b = url;
        this.f45334c = bArr;
        this.f45337f = y0Var;
        this.f45335d = str;
        this.f45336e = map;
    }

    public void a(int i11, IOException iOException, byte[] bArr, Map map) {
        l1 l1Var = ((n1) ((w2) this.f45338g).f21216b).f44988g;
        n1.m(l1Var);
        l1Var.y(new androidx.fragment.app.g2(this, i11, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:646), block:B:141:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:649), block:B:142:0x0287 */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARN: Type inference failed for: r14v0, types: [y00.z0] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.z0.run():void");
    }

    public z0(w2 w2Var, String str, URL url, byte[] bArr, HashMap map, v2 v2Var) {
        Objects.requireNonNull(w2Var);
        this.f45338g = w2Var;
        com.google.android.gms.common.internal.i0.e(str);
        this.f45333b = url;
        this.f45334c = bArr;
        this.f45337f = v2Var;
        this.f45335d = str;
        this.f45336e = map;
    }
}
