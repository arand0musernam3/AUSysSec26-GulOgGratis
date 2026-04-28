package s1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import t1.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f38706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(w0 w0Var, int i11) {
        super(1);
        this.f38705a = i11;
        this.f38706b = w0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38705a) {
            case 0:
                n1 n1Var = (n1) obj;
                h0 h0Var = h0.PreEnter;
                h0 h0Var2 = h0.Visible;
                boolean zB = n1Var.b(h0Var, h0Var2);
                Object obj2 = null;
                w0 w0Var = this.f38706b;
                if (zB) {
                    c0 c0Var = w0Var.f38720t.f38730a.f38643c;
                    if (c0Var != null) {
                        obj2 = c0Var.f38555c;
                    }
                } else if (n1Var.b(h0Var2, h0.PostExit)) {
                    c0 c0Var2 = w0Var.f38721u.f38733a.f38643c;
                    if (c0Var2 != null) {
                        obj2 = c0Var2.f38555c;
                    }
                } else {
                    obj2 = r0.f38672d;
                }
                return obj2 == null ? r0.f38672d : obj2;
            default:
                n1 n1Var2 = (n1) obj;
                h0 h0Var3 = h0.PreEnter;
                h0 h0Var4 = h0.Visible;
                boolean zB2 = n1Var2.b(h0Var3, h0Var4);
                w0 w0Var2 = this.f38706b;
                if (zB2) {
                    j1 j1Var = w0Var2.f38720t.f38730a.f38642b;
                    return j1Var != null ? j1Var.f38635b : r0.f38671c;
                }
                if (!n1Var2.b(h0Var4, h0.PostExit)) {
                    return r0.f38671c;
                }
                j1 j1Var2 = w0Var2.f38721u.f38733a.f38642b;
                return j1Var2 != null ? j1Var2.f38635b : r0.f38671c;
        }
    }
}
