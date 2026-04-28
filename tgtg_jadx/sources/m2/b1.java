package m2;

import c5.f3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3 f28772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c1 f28773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g4.l f28774c;

    public b1(f3 f3Var) {
        this.f28772a = f3Var;
    }

    public final c1 a() {
        c1 c1Var = this.f28773b;
        if (c1Var != null) {
            return c1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    public final boolean b(int i11) {
        Function1 function1;
        f3 f3Var;
        g4.l lVar = null;
        if (i11 == 7) {
            function1 = a().f28789a;
        } else if (i11 == 2) {
            function1 = a().f28790b;
        } else if (i11 == 6) {
            function1 = a().f28791c;
        } else if (i11 == 5) {
            function1 = a().f28792d;
        } else if (i11 == 3) {
            function1 = a().f28793e;
        } else if (i11 == 4) {
            function1 = a().f28794f;
        } else {
            if (i11 != 1 && i11 != 0) {
                com.braze.h2.b("invalid ImeAction");
                return false;
            }
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(this);
            return true;
        }
        if (i11 == 6) {
            g4.l lVar2 = this.f28774c;
            if (lVar2 != null) {
                lVar = lVar2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("focusManager");
            }
            ((g4.p) lVar).i(1, true);
            return true;
        }
        if (i11 != 5) {
            if (i11 != 7 || (f3Var = this.f28772a) == null) {
                return false;
            }
            ((c5.z1) f3Var).a();
            return true;
        }
        g4.l lVar3 = this.f28774c;
        if (lVar3 != null) {
            lVar = lVar3;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        }
        ((g4.p) lVar).i(2, true);
        return true;
    }
}
