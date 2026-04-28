package com.braze.communication.dust;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.f1;
import com.braze.managers.d0;
import com.braze.managers.e0;
import com.braze.managers.f0;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import j4.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import org.json.JSONObject;
import v80.i1;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f9627d = BrazeLogger.getBrazeLogTag((Class<?>) i.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final IntRange f9628e = new IntRange(200, 299, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final IntRange f9629f = new IntRange(400, 499, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final IntRange f9630g = new IntRange(500, 599, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i1 f9631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f9632b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f9633c = new AtomicLong(DateTimeUtils.nowInMilliseconds());

    public static final String c(i iVar) {
        return "Not restarting stream since " + iVar.f9631a + " is still active.";
    }

    public static final String d(i iVar) {
        return "Started stream job " + iVar.f9631a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009c -> B:21:0x00a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(v80.b0 r22, x80.w r23, com.braze.managers.d0 r24, z70.c r25) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.communication.dust.i.a(v80.b0, x80.w, com.braze.managers.d0, z70.c):java.lang.Object");
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qv.a(this, 2), 7, (Object) null);
        i1 i1Var = this.f9631a;
        if (i1Var != null) {
            i1Var.a(null);
        }
        this.f9631a = null;
    }

    public static final String d(String str) {
        return e0.f.k("Got call to startStream() for url ", str);
    }

    public static final String c(String str) {
        return e0.f.k("Failed to parse data line:\n", str);
    }

    public static final String b(Ref.ObjectRef objectRef) {
        return s.j(objectRef.element, "Recorded data type: ");
    }

    public static final String b(String str) {
        return e0.f.k("Got un-actionable stream line:\n", str);
    }

    public static final String b(i iVar) {
        return "Got call to endStreamAndJoin(). Stream job: " + iVar.f9631a;
    }

    public static final String b(String str, String str2) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Not handling event: '", str, "' and data: '", str2, "'");
    }

    public final void a(String str, d0 d0Var, e0 e0Var, f0 f0Var, boolean z11) throws Throwable {
        i1 i1Var;
        str.getClass();
        d0Var.getClass();
        e0Var.getClass();
        f0Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mw.d(str, 26), 7, (Object) null);
        if (!z11 || (i1Var = this.f9631a) == null || !i1Var.g()) {
            v80.f0.E(kotlin.coroutines.g.f26549a, new f(this, null));
            this.f9631a = v80.f0.B(BrazeCoroutineScope.INSTANCE, null, null, new h(this, f0Var, e0Var, d0Var, str, null), 3);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qv.a(this, 1), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qv.a(this, 0), 7, (Object) null);
    }

    public static final String a(i iVar) {
        return "Got call to endStream(). Stream job: " + iVar.f9631a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(z70.c r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.braze.communication.dust.c
            if (r0 == 0) goto L13
            r0 = r14
            com.braze.communication.dust.c r0 = (com.braze.communication.dust.c) r0
            int r1 = r0.f9607d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9607d = r1
            goto L18
        L13:
            com.braze.communication.dust.c r0 = new com.braze.communication.dust.c
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f9605b
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f9607d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            com.braze.communication.dust.i r0 = r0.f9604a
            ba0.g.M(r14)
            goto L6f
        L2c:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r14)
            r14 = 0
            return r14
        L33:
            com.braze.communication.dust.i r2 = r0.f9604a
            ba0.g.M(r14)
            goto L5f
        L39:
            ba0.g.M(r14)
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r6 = com.braze.communication.dust.i.f9627d
            qv.a r10 = new qv.a
            r14 = 3
            r10.<init>(r13, r14)
            r11 = 14
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11, r12)
            v80.i1 r14 = r13.f9631a
            if (r14 == 0) goto L6e
            r0.f9604a = r13
            r0.f9607d = r4
            java.lang.Object r14 = v80.f0.k(r14, r0)
            if (r14 != r1) goto L5e
            goto L6b
        L5e:
            r2 = r13
        L5f:
            r0.f9604a = r2
            r0.f9607d = r3
            r3 = 50
            java.lang.Object r14 = v80.f0.o(r3, r0)
            if (r14 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r0 = r2
            goto L6f
        L6e:
            r0 = r13
        L6f:
            r14 = 0
            r0.f9631a = r14
            kotlin.Unit r14 = kotlin.Unit.f26487a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.communication.dust.i.a(z70.c):java.lang.Object");
    }

    public static final String a() {
        return "Waiting to consume new line";
    }

    public static final String a(String str) {
        return a0.p("Received new line: '", str, "'");
    }

    public static final String a(Ref.ObjectRef objectRef) {
        return s.j(objectRef.element, "Recorded event type: ");
    }

    public static final String a(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        return "Handling full event on blank line. lastEventType: '" + objectRef.element + "' \ndata: '" + objectRef2.element + "'";
    }

    public static void a(String str, String str2, Function1 function1) {
        str.getClass();
        str2.getClass();
        function1.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str3 = f9627d;
        BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f1(str, str2, 26), 14, (Object) null);
        if (Intrinsics.areEqual(str, "msg")) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new bw.a(jSONObject, 19), 14, (Object) null);
                function1.invoke(com.braze.models.dust.e.f10145a.a(jSONObject));
                return;
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f9627d, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new mw.d(str2, 25), 8, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f1(str, str2, 27), 14, (Object) null);
    }

    public static final String a(String str, String str2) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Got event '", str, "' and data: '", str2, "'");
    }

    public static final String a(JSONObject jSONObject) {
        return e0.f.k("Parsed dust message json to:\n", JsonUtils.getPrettyPrintedString(jSONObject));
    }

    public final void a(boolean z11) {
        this.f9632b.set(z11);
        this.f9633c.set(z11 ? DateTimeUtils.nowInMilliseconds() : 0L);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f9627d, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new aa.d(z11, this, 5), 12, (Object) null);
    }

    public static final String a(boolean z11, i iVar) {
        return "Set stream listening state to " + z11 + " and stream listen started at " + iVar.f9633c;
    }
}
