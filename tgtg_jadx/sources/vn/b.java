package vn;

import a3.t0;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s1.r0;
import s1.y;
import u3.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final void a(ProfileFeature profileFeature, Function1 function1, Function1 function12, Function0 function0, n nVar, int i11) {
        function1.getClass();
        function12.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(308168460);
        int i12 = (sVar.h(profileFeature) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        int i13 = i12 | (sVar.h(function12) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            y.d(true, null, null, r0.o(3, null).a(r0.j(null, 15)).a(r0.e(null, 3)), null, e.e(-331164188, sVar, new ap.e(function12, profileFeature, function1, 25)), sVar, 199686, 22);
            function0.invoke();
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(profileFeature, function1, function12, function0, i11);
        }
    }
}
