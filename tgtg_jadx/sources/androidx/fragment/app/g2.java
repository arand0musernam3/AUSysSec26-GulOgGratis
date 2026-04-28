package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y00.v2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3197a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3202f;

    public /* synthetic */ g2(y00.z0 z0Var, int i11, Exception exc, byte[] bArr, Map map) {
        this.f3199c = z0Var;
        this.f3198b = i11;
        this.f3200d = exc;
        this.f3201e = bArr;
        this.f3202f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3197a) {
            case 0:
                for (int i11 = 0; i11 < this.f3198b; i11++) {
                    ViewCompat.p0((View) ((ArrayList) this.f3199c).get(i11), (String) ((ArrayList) this.f3200d).get(i11));
                    ViewCompat.p0((View) ((ArrayList) this.f3201e).get(i11), (String) ((ArrayList) this.f3202f).get(i11));
                }
                break;
            case 1:
                ((androidx.recyclerview.widget.h) this.f3202f).f3750c.execute(new x0.f(this, androidx.recyclerview.widget.d.a(new androidx.recyclerview.widget.e(this)), false, 3));
                break;
            default:
                y00.z0 z0Var = (y00.z0) this.f3199c;
                ((v2) z0Var.f45337f).c(z0Var.f45335d, this.f3198b, (Exception) this.f3200d, (byte[]) this.f3201e, (Map) this.f3202f);
                break;
        }
    }

    public g2(int i11, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f3198b = i11;
        this.f3199c = arrayList;
        this.f3200d = arrayList2;
        this.f3201e = arrayList3;
        this.f3202f = arrayList4;
    }

    public g2(androidx.recyclerview.widget.h hVar, List list, List list2, int i11, Runnable runnable) {
        this.f3202f = hVar;
        this.f3199c = list;
        this.f3200d = list2;
        this.f3198b = i11;
        this.f3201e = runnable;
    }
}
