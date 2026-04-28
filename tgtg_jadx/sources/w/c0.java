package w;

import java.util.LinkedHashMap;
import s0.r1;
import s0.y0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f42659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f42662f;

    public c0(String str, r1 r1Var) {
        boolean z11;
        int i11;
        r1Var.getClass();
        this.f42658b = str;
        this.f42659c = r1Var;
        this.f42662f = new LinkedHashMap();
        try {
            i11 = Integer.parseInt(str);
            z11 = true;
        } catch (NumberFormatException unused) {
            wd.a.I("EncoderProfilesProviderAdapter", "Camera id is not an integer:  " + this.f42658b + ", unable to create EncoderProfilesProviderAdapter.");
            z11 = false;
            i11 = -1;
        }
        this.f42660d = z11;
        this.f42661e = i11;
    }

    @Override // s0.y0
    public final boolean a(int i11) {
        return this.f42660d && b(i11) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    @Override // s0.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s0.i b(int r22) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c0.b(int):s0.i");
    }
}
