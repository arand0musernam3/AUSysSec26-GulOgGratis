package m2;

import a3.v2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements z4.u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f28765b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f28766c = new b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k9.f f28767d = new k9.f(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28768a;

    public /* synthetic */ b(int i11) {
        this.f28768a = i11;
    }

    @Override // z4.u0
    public final z4.v0 c(z4.w0 w0Var, List list, long j9) {
        switch (this.f28768a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(((z4.t0) list.get(i11)).D(j9));
                }
                return z4.w0.f(w0Var, z5.a.i(j9), z5.a.h(j9), new v2(2, arrayList));
            default:
                return z4.w0.f(w0Var, z5.a.i(j9), z5.a.h(j9), f28767d);
        }
    }
}
