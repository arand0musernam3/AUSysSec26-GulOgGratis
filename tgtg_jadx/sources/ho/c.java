package ho;

import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.order.OrderState;
import go.w;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f22195b;

    public /* synthetic */ c(w wVar, int i11) {
        this.f22194a = i11;
        this.f22195b = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.Throwable r8, x70.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ho.b
            if (r0 == 0) goto L13
            r0 = r9
            ho.b r0 = (ho.b) r0
            int r1 = r0.f22193m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22193m = r1
            goto L18
        L13:
            ho.b r0 = new ho.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f22192k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f22193m
            r3 = 0
            go.w r4 = r7.f22195b
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2d
            int r8 = r0.f22191j
            ba0.g.M(r9)
            goto La6
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            return r3
        L33:
            ba0.g.M(r9)
            if (r8 != 0) goto L3b
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        L3b:
            boolean r9 = r8 instanceof qg.c
            r2 = 2132018248(0x7f140448, float:1.9674797E38)
            if (r9 == 0) goto L7c
            qg.c r8 = (qg.c) r8
            java.lang.String r8 = r8.f37051a
            int r9 = r8.hashCode()
            r6 = -1204254625(0xffffffffb838885f, float:-4.3996024E-5)
            if (r9 == r6) goto L74
            r6 = 216372365(0xce5948d, float:3.5372442E-31)
            if (r9 == r6) goto L67
            r6 = 323123197(0x134277fd, float:2.4545401E-27)
            if (r9 == r6) goto L5a
            goto L7c
        L5a:
            java.lang.String r9 = "CANCEL_FAILED_DEADLINE_EXCEEDED"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L63
            goto L7c
        L63:
            r8 = 2132017396(0x7f1400f4, float:1.967307E38)
            goto L81
        L67:
            java.lang.String r9 = "CANCEL_FAILED_ALREADY_CANCELLED"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L70
            goto L7c
        L70:
            r8 = 2132017394(0x7f1400f2, float:1.9673065E38)
            goto L81
        L74:
            java.lang.String r9 = "CANCEL_FAILED_ALREADY_REDEEMED"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L7e
        L7c:
            r8 = r2
            goto L81
        L7e:
            r8 = 2132017395(0x7f1400f3, float:1.9673067E38)
        L81:
            y80.a2 r9 = r4.f20775d
            y80.h1 r2 = r4.f20776e
            y80.y1 r2 = r2.f45488a
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r2 = r2 + r5
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r2)
            r0.f22191j = r8
            r0.f22193m = r5
            r9.getClass()
            r9.k(r3, r6)
            kotlin.Unit r9 = kotlin.Unit.f26487a
            if (r9 != r1) goto La6
            return r1
        La6:
            java.lang.String r8 = r4.getString(r8)
            android.widget.Toast r8 = android.widget.Toast.makeText(r4, r8, r5)
            r8.show()
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ho.c.a(java.lang.Throwable, x70.c):java.lang.Object");
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        switch (this.f22194a) {
            case 0:
                return a((Throwable) obj, cVar);
            default:
                OrderState orderState = (OrderState) obj;
                int i11 = orderState == null ? -1 : e.$EnumSwitchMapping$0[orderState.ordinal()];
                w wVar = this.f22195b;
                if (i11 == 1) {
                    w.z(wVar, OrderState.REDEEMED, AppConstants.RESULT_CODE_ORDER_COLLECTED);
                } else if (i11 == 2) {
                    w.z(wVar, OrderState.CANCELLED, AppConstants.RESULT_CODE_ORDER_CANCELLED);
                } else if (i11 == 3) {
                    w.z(wVar, OrderState.NOT_COLLECTED, AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED);
                }
                return Unit.f26487a;
        }
    }
}
