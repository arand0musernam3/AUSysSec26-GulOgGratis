package ya;

import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f45792e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, String str2, int i11) {
        super(str, str2, 2);
        this.f45792e = i11;
    }

    @Override // ya.c
    public final boolean b() {
        switch (this.f45792e) {
            case 0:
                if (!super.b() || !f0.F("MULTI_PROCESS")) {
                    return false;
                }
                int i11 = xa.g.f44215a;
                if (k.f45797e.b()) {
                    return m.f45801a.getStatics().isMultiProcessEnabled();
                }
                throw k.a();
            default:
                if (f0.F("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
