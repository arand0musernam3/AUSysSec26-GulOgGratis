package un;

import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.profile.response.ProfileScreenResponse;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m2.b2;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import pd.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final void a(ProfileScreenResponse profileScreenResponse, b2 b2Var, Function0 function0, Function0 function02, Function2 function2, n nVar, int i11) {
        profileScreenResponse.getClass();
        function0.getClass();
        function02.getClass();
        function2.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1935576300);
        int i12 = (sVar.h(profileScreenResponse) ? 4 : 2) | i11 | (sVar.h(b2Var) ? 32 : 16) | (sVar.h(function0) ? 256 : 128) | (sVar.h(function02) ? 2048 : 1024) | (sVar.h(function2) ? 16384 : 8192);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            List<Order> pendingOrders = profileScreenResponse.getPendingOrders();
            ProfileScreenResponse profileScreenResponse2 = null;
            if (pendingOrders != null && !pendingOrders.isEmpty()) {
                b2Var.invoke();
                profileScreenResponse2 = profileScreenResponse;
            }
            ProfileScreenResponse profileScreenResponse3 = profileScreenResponse.getLatestCompletedOrder() != null ? profileScreenResponse : profileScreenResponse2;
            boolean z11 = (i12 & 896) == 256;
            Object objM = sVar.M();
            f fVar = m.f29332a;
            if (z11 || objM == fVar) {
                objM = new rr.a(23, function0);
                sVar.k0(objM);
            }
            Function0 function03 = (Function0) objM;
            boolean z12 = (i12 & 7168) == 2048;
            Object objM2 = sVar.M();
            if (z12 || objM2 == fVar) {
                objM2 = new rr.a(24, function02);
                sVar.k0(objM2);
            }
            Function0 function04 = (Function0) objM2;
            boolean z13 = (i12 & 57344) == 16384;
            Object objM3 = sVar.M();
            if (z13 || objM3 == fVar) {
                objM3 = new b3.n(18, function2);
                sVar.k0(objM3);
            }
            g.g(profileScreenResponse3, function03, function04, (Function2) objM3, sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(profileScreenResponse, b2Var, function0, function02, function2, i11, 24);
        }
    }
}
