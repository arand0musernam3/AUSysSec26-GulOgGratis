package gt;

import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.brief.BriefOrderChangeState;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.order.OrderType;
import kotlin.Unit;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9.v f20851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f20852b = new g(this, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f20853c = new g(this, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f20854d = new h(this, 0);

    public j(y9.v vVar) {
        this.f20851a = vVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static BriefOrderChangeState a(String str) {
        switch (str.hashCode()) {
            case -1031784143:
                if (str.equals("CANCELLED")) {
                    return BriefOrderChangeState.CANCELLED;
                }
                break;
            case -321016751:
                if (str.equals("DELEGATED_CANCELLED")) {
                    return BriefOrderChangeState.DELEGATED_CANCELLED;
                }
                break;
            case 74702359:
                if (str.equals("REFUNDED")) {
                    return BriefOrderChangeState.REFUNDED;
                }
                break;
            case 82925231:
                if (str.equals("DELEGATED_RETURNED")) {
                    return BriefOrderChangeState.DELEGATED_RETURNED;
                }
                break;
            case 1093226017:
                if (str.equals("DELEGATED_TIME_RETURNED")) {
                    return BriefOrderChangeState.DELEGATED_TIME_RETURNED;
                }
                break;
            case 1220303137:
                if (str.equals("DELEGATE_ACCEPTED")) {
                    return BriefOrderChangeState.DELEGATE_ACCEPTED;
                }
                break;
            case 1332790050:
                if (str.equals("TIME_CHANGED")) {
                    return BriefOrderChangeState.TIME_CHANGED;
                }
                break;
            case 1395699694:
                if (str.equals("NO_CHANGE")) {
                    return BriefOrderChangeState.NO_CHANGE;
                }
                break;
            case 1657596959:
                if (str.equals("DELEGATED_FULFILLED")) {
                    return BriefOrderChangeState.DELEGATED_FULFILLED;
                }
                break;
        }
        i4.a.f("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static OrderType b(String str) {
        switch (str.hashCode()) {
            case 347933649:
                if (str.equals("MANUFACTURER")) {
                    return OrderType.MANUFACTURER;
                }
                break;
            case 390434749:
                if (str.equals("FLASH_SALES")) {
                    return OrderType.FLASH_SALES;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return OrderType.UNKNOWN;
                }
                break;
            case 712755003:
                if (str.equals("MAGICBAG")) {
                    return OrderType.MAGICBAG;
                }
                break;
            case 833459711:
                if (str.equals("CATERING")) {
                    return OrderType.CATERING;
                }
                break;
            case 1033200795:
                if (str.equals("TABLE_RESERVATION")) {
                    return OrderType.TABLE_RESERVATION;
                }
                break;
            case 1457047928:
                if (str.equals("CHARITY")) {
                    return OrderType.CHARITY;
                }
                break;
        }
        i4.a.f("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }

    public static final String c(j jVar, BriefOrderChangeState briefOrderChangeState) {
        switch (i.$EnumSwitchMapping$1[briefOrderChangeState.ordinal()]) {
            case 1:
                return "NO_CHANGE";
            case 2:
                return "TIME_CHANGED";
            case 3:
                return "CANCELLED";
            case 4:
                return "REFUNDED";
            case 5:
                return "DELEGATE_ACCEPTED";
            case 6:
                return "DELEGATED_RETURNED";
            case 7:
                return "DELEGATED_CANCELLED";
            case 8:
                return "DELEGATED_TIME_RETURNED";
            case 9:
                return "DELEGATED_FULFILLED";
            default:
                e40.a.f();
                return null;
        }
    }

    public static final String d(j jVar, OrderType orderType) {
        switch (i.$EnumSwitchMapping$0[orderType.ordinal()]) {
            case 1:
                return "MAGICBAG";
            case 2:
                return "MANUFACTURER";
            case 3:
                return "CHARITY";
            case 4:
                return "FLASH_SALES";
            case 5:
                return "CATERING";
            case 6:
                return "TABLE_RESERVATION";
            case 7:
                return "UNKNOWN";
            default:
                e40.a.f();
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(gt.j r7, java.util.List r8, z70.c r9) {
        /*
            boolean r0 = r9 instanceof gt.c
            if (r0 == 0) goto L13
            r0 = r9
            gt.c r0 = (gt.c) r0
            int r1 = r0.f20838n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20838n = r1
            goto L18
        L13:
            gt.c r0 = new gt.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f20838n
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L32
            if (r2 != r4) goto L2b
            ba0.g.M(r9)
            goto L74
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L32:
            java.util.List r8 = r0.f20836k
            gt.j r7 = r0.f20835j
            ba0.g.M(r9)
            goto L58
        L3a:
            ba0.g.M(r9)
            r0.f20835j = r7
            r0.f20836k = r8
            r0.f20838n = r5
            y9.v r9 = r7.f20851a
            g9.r0 r2 = new g9.r0
            r6 = 14
            r2.<init>(r6)
            java.lang.Object r9 = o00.x0.C(r0, r9, r3, r5, r2)
            if (r9 != r1) goto L53
            goto L55
        L53:
            kotlin.Unit r9 = kotlin.Unit.f26487a
        L55:
            if (r9 != r1) goto L58
            goto L73
        L58:
            r9 = 0
            r0.f20835j = r9
            r0.f20836k = r9
            r0.f20838n = r4
            y9.v r9 = r7.f20851a
            ek.a r2 = new ek.a
            r4 = 19
            r2.<init>(r4, r7, r8)
            java.lang.Object r7 = o00.x0.C(r0, r9, r3, r5, r2)
            if (r7 != r1) goto L6f
            goto L71
        L6f:
            kotlin.Unit r7 = kotlin.Unit.f26487a
        L71:
            if (r7 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gt.j.e(gt.j, java.util.List, z70.c):java.lang.Object");
    }

    public final Object f(BriefOrder briefOrder, z70.c cVar) {
        Object objC = x0.C(cVar, this.f20851a, false, true, new d(this, briefOrder, 0));
        return objC == y70.a.COROUTINE_SUSPENDED ? objC : Unit.f26487a;
    }

    public final Object g(String str, OrderState orderState, z70.c cVar) {
        Object objC = x0.C(cVar, this.f20851a, false, true, new f(this, orderState, str, 0));
        return objC == y70.a.COROUTINE_SUSPENDED ? objC : Unit.f26487a;
    }
}
