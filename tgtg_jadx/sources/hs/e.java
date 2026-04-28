package hs;

import com.app.tgtg.model.remote.PushNotificationsSettings;
import kotlin.Unit;
import y80.a2;
import y80.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f22467b;

    public /* synthetic */ e(h hVar, int i11) {
        this.f22466a = i11;
        this.f22467b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (kotlin.Unit.f26487a == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.app.tgtg.model.remote.PushNotificationsSettings r20, x70.c r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof hs.d
            if (r2 == 0) goto L17
            r2 = r1
            hs.d r2 = (hs.d) r2
            int r3 = r2.l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.l = r3
            goto L1c
        L17:
            hs.d r2 = new hs.d
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f22464j
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.l
            r5 = 2
            r6 = 1
            r7 = 0
            hs.h r8 = r0.f22467b
            if (r4 == 0) goto L3c
            if (r4 == r6) goto L38
            if (r4 != r5) goto L31
            ba0.g.M(r1)
            goto L8b
        L31:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L38:
            ba0.g.M(r1)
            goto L7a
        L3c:
            ba0.g.M(r1)
            com.app.tgtg.model.remote.DailyReminder r9 = r20.getDailyReminder()
            if (r9 == 0) goto L57
            r17 = 127(0x7f, float:1.78E-43)
            r18 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            com.app.tgtg.model.remote.DailyReminder r1 = com.app.tgtg.model.remote.DailyReminder.copy$default(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r14 = r1
            goto L58
        L57:
            r14 = r7
        L58:
            r15 = 15
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = r20
            com.app.tgtg.model.remote.PushNotificationsSettings r1 = com.app.tgtg.model.remote.PushNotificationsSettings.copy$default(r9, r10, r11, r12, r13, r14, r15, r16)
            r1.getClass()
            r8.f22482k = r1
            y80.a2 r1 = r8.f22477f
            r2.l = r6
            r1.getClass()
            r1.k(r7, r9)
            kotlin.Unit r1 = kotlin.Unit.f26487a
            if (r1 != r3) goto L7a
            goto L8a
        L7a:
            y80.a2 r1 = r8.f22479h
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r2.l = r5
            r1.getClass()
            r1.k(r7, r4)
            kotlin.Unit r1 = kotlin.Unit.f26487a
            if (r1 != r3) goto L8b
        L8a:
            return r3
        L8b:
            kotlin.Unit r1 = kotlin.Unit.f26487a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hs.e.a(com.app.tgtg.model.remote.PushNotificationsSettings, x70.c):java.lang.Object");
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        switch (this.f22466a) {
            case 0:
                return a((PushNotificationsSettings) obj, cVar);
            default:
                a2 a2Var = this.f22467b.f22479h;
                Boolean bool = Boolean.FALSE;
                a2Var.getClass();
                a2Var.k(null, bool);
                Unit unit = Unit.f26487a;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                return unit;
        }
    }
}
