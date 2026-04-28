package u70;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class l {
    public static j a(m mVar, Function0 function0) {
        mVar.getClass();
        function0.getClass();
        int i11 = k.$EnumSwitchMapping$0[mVar.ordinal()];
        if (i11 == 1) {
            return new t(function0, null, 2, null);
        }
        if (i11 == 2) {
            function0.getClass();
            s sVar = new s();
            sVar.f40854a = function0;
            sVar.f40855b = e0.f40836a;
            return sVar;
        }
        if (i11 != 3) {
            e40.a.f();
            return null;
        }
        function0.getClass();
        i0 i0Var = new i0();
        i0Var.f40847a = function0;
        i0Var.f40848b = e0.f40836a;
        return i0Var;
    }

    public static t b(Function0 function0) {
        function0.getClass();
        return new t(function0, null, 2, null);
    }
}
