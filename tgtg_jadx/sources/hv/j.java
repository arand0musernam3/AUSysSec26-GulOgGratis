package hv;

import android.app.Activity;
import android.content.Context;
import ao.g3;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mv.t;
import mv.u;
import v80.b0;
import y80.a2;
import y80.h1;
import y80.r;
import zendesk.android.Zendesk;
import zendesk.android.messaging.MessagingScreen;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f22530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f22531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f22532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final iv.a f22533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final se.b f22534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f22535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f22536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f22537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f22538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f22539k;
    public final h1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f22540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f22541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ap.f f22542o;

    public j(Context context, g3 g3Var, u uVar, b0 b0Var, iv.a aVar, se.b bVar, a aVar2, l lVar) {
        g3Var.getClass();
        uVar.getClass();
        b0Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        this.f22529a = context;
        this.f22530b = g3Var;
        this.f22531c = uVar;
        this.f22532d = b0Var;
        this.f22533e = aVar;
        this.f22534f = bVar;
        this.f22535g = aVar2;
        this.f22536h = lVar;
        this.f22537i = new AtomicBoolean(false);
        a2 a2VarC = r.c(0);
        this.f22539k = a2VarC;
        this.l = new h1(a2VarC);
        a2 a2VarC2 = r.c(Boolean.FALSE);
        this.f22540m = a2VarC2;
        this.f22541n = new h1(a2VarC2);
        if (b()) {
            FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new k());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r12v16, types: [hv.g, zendesk.android.events.ZendeskEventListener] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(z70.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof hv.h
            if (r0 == 0) goto L14
            r0 = r12
            hv.h r0 = (hv.h) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.l = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            hv.h r0 = new hv.h
            r0.<init>(r11, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f22521j
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r6.l
            java.util.concurrent.atomic.AtomicBoolean r9 = r11.f22537i
            r10 = 1
            if (r1 == 0) goto L32
            if (r1 != r10) goto L2b
            ba0.g.M(r12)
            goto L64
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
        L30:
            r12 = 0
            return r12
        L32:
            ba0.g.M(r12)
            boolean r12 = r9.get()
            if (r12 == 0) goto L3e
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        L3e:
            zendesk.android.Zendesk$Companion r1 = zendesk.android.Zendesk.INSTANCE
            e.b r12 = new e.b
            r2 = 18
            r12.<init>(r11, r2)
            r1.setAuthenticationDelegate(r12)
            iv.a r12 = r11.f22533e
            java.lang.String r3 = r12.f24200a
            zendesk.messaging.android.DefaultMessagingFactory r4 = new zendesk.messaging.android.DefaultMessagingFactory
            r12 = 3
            r2 = 0
            r4.<init>(r2, r2, r12, r2)
            r6.l = r10
            android.content.Context r2 = r11.f22529a
            r5 = 0
            r7 = 8
            r8 = 0
            java.lang.Object r12 = zendesk.android.Zendesk.Companion.initialize$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L64
            return r0
        L64:
            zendesk.android.ZendeskResult r12 = (zendesk.android.ZendeskResult) r12
            boolean r0 = r12 instanceof zendesk.android.ZendeskResult.Success
            if (r0 == 0) goto L83
            r9.set(r10)
            hv.g r12 = r11.f22538j
            if (r12 == 0) goto L72
            goto L9c
        L72:
            hv.g r12 = new hv.g
            r12.<init>()
            r11.f22538j = r12
            zendesk.android.Zendesk$Companion r0 = zendesk.android.Zendesk.INSTANCE
            zendesk.android.Zendesk r0 = r0.getInstance()
            r0.addEventListener(r12)
            goto L9c
        L83:
            boolean r0 = r12 instanceof zendesk.android.ZendeskResult.Failure
            if (r0 == 0) goto La1
            mv.m0 r0 = sa0.a.f38953a
            zendesk.android.ZendeskResult$Failure r12 = (zendesk.android.ZendeskResult.Failure) r12
            java.lang.Object r12 = r12.getError()
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.String r1 = "Zendesk.initialize failed"
            r10 = 0
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r0.e(r12, r1, r2)
            r9.set(r10)
        L9c:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r10)
            return r12
        La1:
            e40.a.f()
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: hv.j.a(z70.c):java.lang.Object");
    }

    public final boolean b() {
        u uVar = this.f22531c;
        uVar.getClass();
        String strA = uVar.a(mv.k.APPTRK_CC_ZENDESK_CHAT_INTEGRATION);
        if (strA != null) {
            return ox.h.w(strA, t.VARIANT.a());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.app.Activity r9, java.lang.String r10, java.lang.String r11, kotlin.jvm.functions.Function0 r12, z70.c r13) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hv.j.c(android.app.Activity, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, z70.c):java.lang.Object");
    }

    public final void d(Activity activity, String str, String str2) {
        if (activity.isTaskRoot()) {
            this.f22542o = new ap.f(activity, 6);
        }
        f(str);
        Zendesk.INSTANCE.getInstance().getMessaging().showMessaging(activity, str != null ? new MessagingScreen.NewConversation((MessagingScreen.ExitAction) null, 1, (DefaultConstructorMarker) null) : MessagingScreen.ConversationsList.INSTANCE);
        this.f22534f.v(str2, str);
    }

    public final void e() {
        Zendesk.INSTANCE.getInstance().getMessaging().clearConversationFields();
        Boolean bool = Boolean.FALSE;
        a2 a2Var = this.f22540m;
        a2Var.getClass();
        a2Var.k(null, bool);
        a2 a2Var2 = this.f22539k;
        a2Var2.getClass();
        a2Var2.k(null, 0);
    }

    public final void f(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        iv.a aVar = this.f22533e;
        if (str != null) {
            linkedHashMap.put(aVar.f24201b, str);
        }
        linkedHashMap.put(aVar.f24202c, this.f22530b.m().m285getUserId8nKqa5U());
        String str2 = aVar.f24203d;
        mv.b bVar = mv.b.f30149d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            bVar = null;
        }
        String string = StringsKt.e0(StringsKt.Y(bVar.a(), '-')).toString();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        linkedHashMap.put(str2, lowerCase);
        Zendesk.INSTANCE.getInstance().getMessaging().setConversationFields(linkedHashMap);
    }
}
