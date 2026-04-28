package s30;

import android.os.Bundle;
import java.util.HashSet;
import oz.m;
import y00.c2;
import y00.d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38835b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f38834a = i11;
        this.f38835b = obj;
    }

    @Override // y00.d2
    public final void a(String str, String str2, Bundle bundle, long j9) {
        int i11 = this.f38834a;
        Object obj = this.f38835b;
        switch (i11) {
            case 0:
                m mVar = (m) obj;
                if (((HashSet) mVar.f33836b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    k30.m mVar2 = a.f38830a;
                    String strG = c2.g(c2.f44652f, str2, c2.f44647a);
                    if (strG != null) {
                        str2 = strG;
                    }
                    bundle2.putString("events", str2);
                    ((ub.a) mVar.f33837c).D(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !a.f38830a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j9);
                    bundle3.putBundle("params", bundle);
                    ((ub.a) ((m1.a) obj).f28697a).D(3, bundle3);
                    break;
                }
                break;
        }
    }
}
