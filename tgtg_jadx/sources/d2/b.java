package d2;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13741a;

    public /* synthetic */ b(int i11) {
        this.f13741a = i11;
    }

    public static final a b(int i11, String str) {
        WeakHashMap weakHashMap = z2.f13983w;
        return new a(i11, str);
    }

    public static final v2 d(int i11, String str) {
        WeakHashMap weakHashMap = z2.f13983w;
        return new v2(c.H(x6.d.f43872e), str);
    }

    public static z2 e(m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        View view = (View) sVar.j(c5.v0.f7394f);
        z2 z2VarF = f(view);
        boolean zH = sVar.h(z2VarF) | sVar.h(view);
        Object objM = sVar.M();
        if (zH || objM == m3.m.f29332a) {
            objM = new a3.p(24, z2VarF, view);
            sVar.k0(objM);
        }
        m3.i.d(z2VarF, (Function1) objM, sVar);
        return z2VarF;
    }

    public static z2 f(View view) {
        z2 z2Var;
        WeakHashMap weakHashMap = z2.f13983w;
        synchronized (weakHashMap) {
            try {
                Object z2Var2 = weakHashMap.get(view);
                if (z2Var2 == null) {
                    z2Var2 = new z2(view);
                    weakHashMap.put(view, z2Var2);
                }
                z2Var = (z2) z2Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z2Var;
    }

    @Override // d2.f
    public void c(z5.c cVar, int i11, int[] iArr, z5.m mVar, int[] iArr2) {
        switch (this.f13741a) {
            case 0:
                i.b(iArr, iArr2, false);
                break;
            case 1:
                i.c(i11, iArr, iArr2, false);
                break;
            case 2:
                if (mVar != z5.m.Ltr) {
                    i.b(iArr, iArr2, true);
                } else {
                    i.c(i11, iArr, iArr2, false);
                }
                break;
            default:
                if (mVar != z5.m.Ltr) {
                    i.c(i11, iArr, iArr2, true);
                } else {
                    i.b(iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f13741a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            case 3:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
