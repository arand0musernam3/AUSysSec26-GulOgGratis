package ho;

import android.content.Context;
import c5.v0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlin.jvm.internal.Intrinsics;
import lv.s;
import mv.p0;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    public static final long a(Order order) {
        OrderState state = order != null ? order.getState() : null;
        int i11 = state == null ? -1 : q.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            return s.f28221d;
        }
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            if (i11 == 6) {
                return s.f28231k;
            }
            if (i11 != 7) {
                return s.B;
            }
        }
        return s.D;
    }

    public static final String b(boolean z11, PickupInterval pickupInterval, String str, m3.n nVar) {
        String str2;
        m3.s sVar = (m3.s) nVar;
        Context context = (Context) sVar.j(v0.f7390b);
        String strG = p0.G(context, pickupInterval != null ? pickupInterval.getIntervalStart() : null);
        String strG2 = p0.G(context, pickupInterval != null ? pickupInterval.getIntervalEnd() : null);
        if (str != null) {
            str2 = "GMT" + ZoneId.of(str).getRules().getOffset(Instant.now());
        } else {
            str2 = null;
        }
        if (z11) {
            sVar.a0(109954470);
            String strT = f0.T(R.string.orderview_information_collection_time, new Object[]{strG, strG2}, sVar);
            sVar.q(false);
            return strT;
        }
        sVar.a0(110114492);
        String strD = p0.D(pickupInterval != null ? pickupInterval.getIntervalStart() : null, str);
        String strD2 = p0.D(pickupInterval != null ? pickupInterval.getIntervalEnd() : null, str);
        if (str2 == null) {
            str2 = "-";
        }
        String strT2 = f0.T(R.string.order_status_collect_time_with_timezone, new Object[]{strD, strD2, str2}, sVar);
        sVar.q(false);
        return strT2;
    }

    public static final boolean c(String str) {
        ZoneOffset offset;
        boolean zAreEqual;
        Instant instantNow = Instant.now();
        if (str != null) {
            offset = ZoneId.of(str).getRules().getOffset(instantNow);
            zAreEqual = Intrinsics.areEqual(ZoneId.systemDefault().getRules().getOffset(instantNow), offset);
        } else {
            offset = null;
            zAreEqual = true;
        }
        return offset == null || zAreEqual;
    }
}
