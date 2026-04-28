package al;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import b0.b1;
import b0.n2;
import b0.r0;
import b0.x2;
import cj.s0;
import com.app.tgtg.feature.logincharity.ui.model.Country;
import com.app.tgtg.model.local.payment.ResumePaymentData;
import com.app.tgtg.model.remote.PushNotificationsSettings;
import com.app.tgtg.model.remote.discover.request.BucketFillerType;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureType;
import com.braze.h2;
import ep.d0;
import f0.g1;
import f0.x3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import m0.h1;
import org.bouncycastle.iana.AEADAlgorithm;
import s0.t0;
import t1.q1;
import t1.y0;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1559k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f1560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f1561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1562o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b1 b1Var, x70.c cVar, Map map, n2 n2Var, t0 t0Var, int i11) {
        super(2, cVar);
        this.f1558j = i11;
        switch (i11) {
            case 5:
                this.f1561n = b1Var;
                this.f1560m = map;
                this.f1562o = n2Var;
                this.l = t0Var;
                super(2, cVar);
                break;
            default:
                this.f1560m = b1Var;
                this.f1561n = map;
                this.f1562o = n2Var;
                this.l = t0Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (kotlin.Unit.f26487a != r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[PHI: r10
      0x0045: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v16 java.lang.Object) binds: [B:22:0x006c, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x002b, B:14:0x003a, B:29:0x008b, B:30:0x009b, B:32:0x00a1, B:15:0x003e, B:24:0x006f, B:26:0x0075, B:21:0x005f), top: B:44:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[Catch: all -> 0x0030, PHI: r4
      0x009b: PHI (r4v5 java.lang.Object) = (r4v4 java.lang.Object), (r4v6 java.lang.Object) binds: [B:25:0x0073, B:29:0x008b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0030, blocks: (B:9:0x002b, B:14:0x003a, B:29:0x008b, B:30:0x009b, B:32:0x00a1, B:15:0x003e, B:24:0x006f, B:26:0x0075, B:21:0x005f), top: B:44:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x002b, B:14:0x003a, B:29:0x008b, B:30:0x009b, B:32:0x00a1, B:15:0x003e, B:24:0x006f, B:26:0x0075, B:21:0x005f), top: B:44:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: al.n.a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (t1.y0.v(r1, r0, r13) == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        if (t1.j1.c(r5, 0.0f, r7, r8, r13, 4) == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f1562o
            g9.l r0 = (g9.l) r0
            java.lang.Object r1 = r13.f1561n
            t1.y0 r1 = (t1.y0) r1
            y70.a r6 = y70.a.COROUTINE_SUSPENDED
            int r2 = r13.f1559k
            r3 = 2
            r5 = 1
            if (r2 == 0) goto L20
            if (r2 == r5) goto L1c
            if (r2 != r3) goto L15
            goto L1c
        L15:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L1c:
            ba0.g.M(r14)
            goto L73
        L20:
            ba0.g.M(r14)
            java.lang.Object r2 = r13.f1560m
            v80.b0 r2 = (v80.b0) r2
            m3.k1 r7 = r1.f39607d
            m3.g1 r8 = r1.f39612i
            java.lang.Object r7 = r7.getValue()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r7 != 0) goto L3e
            r13.f1559k = r5
            java.lang.Object r0 = t1.y0.v(r1, r0, r13)
            if (r0 != r6) goto L73
            goto L72
        L3e:
            java.lang.Object r5 = r13.l
            t1.q1 r5 = (t1.q1) r5
            long r9 = r5.g()
            r5 = 1000000(0xf4240, float:1.401298E-39)
            long r11 = (long) r5
            long r9 = r9 / r11
            float r5 = r8.h()
            float r7 = r8.h()
            float r8 = (float) r9
            float r7 = r7 * r8
            int r7 = (int) r7
            r8 = 0
            r9 = 6
            r10 = 0
            t1.u1 r7 = t1.c.k(r7, r8, r10, r9)
            an.d r8 = new an.d
            r9 = 20
            r8.<init>(r2, r1, r0, r9)
            r13.f1559k = r3
            r1 = 0
            r0 = r5
            r5 = 4
            r4 = r13
            r2 = r7
            r3 = r8
            java.lang.Object r0 = t1.j1.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L73
        L72:
            return r6
        L73:
            kotlin.Unit r0 = kotlin.Unit.f26487a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: al.n.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|44|(1:(1:(1:(1:(1:(4:9|41|42|43)(2:10|11))(2:12|38))(4:13|14|42|43))(3:18|19|30))(1:21))(3:22|(0)|40)|25|45|26|(2:29|30)|40) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (ir.h.b(r1, r13) != r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        r0 = r14;
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        r1 = r1.f24128e;
        r13.l = r0;
        r13.f1559k = 4;
        r1.getClass();
        r1.k(null, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        if (kotlin.Unit.f26487a != r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        if (kotlin.Unit.f26487a != r4) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: al.n.c(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r0.g(r7, r2) != r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f1561n
            hf.g r0 = (hf.g) r0
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r6.f1559k
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L26
            if (r2 == r5) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L17
            ba0.g.M(r7)
            goto L5a
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L1e:
            ba0.g.M(r7)
            goto L4b
        L22:
            ba0.g.M(r7)
            goto L3c
        L26:
            ba0.g.M(r7)
            java.lang.Object r7 = r6.f1560m
            dn.k r7 = (dn.k) r7
            java.lang.Object r7 = r7.f15018b
            ye.b r7 = (ye.b) r7
            v80.j0 r7 = r7.l
            r6.f1559k = r5
            java.lang.Object r7 = r7.m(r6)
            if (r7 != r1) goto L3c
            goto L59
        L3c:
            nf.e r7 = nf.e.APP_VERSION
            java.lang.Object r2 = r6.l
            java.lang.String r2 = (java.lang.String) r2
            r6.f1559k = r4
            kotlin.Unit r7 = r0.g(r7, r2)
            if (r7 != r1) goto L4b
            goto L59
        L4b:
            nf.e r7 = nf.e.APP_BUILD
            java.lang.Object r2 = r6.f1562o
            java.lang.String r2 = (java.lang.String) r2
            r6.f1559k = r3
            kotlin.Unit r7 = r0.g(r7, r2)
            if (r7 != r1) goto L5a
        L59:
            return r1
        L5a:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: al.n.d(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (v80.f0.y(r12) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0096 -> B:7:0x001c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r11.f1559k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r11.f1562o
            x80.b r1 = (x80.b) r1
            java.lang.Object r4 = r11.f1561n
            l0.f r4 = (l0.f) r4
            java.lang.Object r5 = r11.f1560m
            j1.b r5 = (j1.b) r5
            ba0.g.M(r12)
            r12 = r5
        L1c:
            r5 = r1
            goto L99
        L1f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L26:
            java.lang.Object r1 = r11.f1562o
            x80.b r1 = (x80.b) r1
            java.lang.Object r4 = r11.f1561n
            l0.f r4 = (l0.f) r4
            java.lang.Object r5 = r11.f1560m
            j1.b r5 = (j1.b) r5
            ba0.g.M(r12)
            r7 = r5
        L36:
            r5 = r4
            goto L61
        L38:
            ba0.g.M(r12)
            java.lang.Object r12 = r11.f1560m
            j1.b r12 = (j1.b) r12
            java.lang.Object r1 = r11.l
            l0.f r1 = (l0.f) r1
            x80.i r4 = r1.f26746b
            r4.getClass()
            x80.b r5 = new x80.b
            r5.<init>(r4)
            r4 = r1
        L4e:
            r11.f1560m = r12
            r11.f1561n = r4
            r11.f1562o = r5
            r11.f1559k = r3
            java.lang.Object r1 = r5.b(r11)
            if (r1 != r0) goto L5d
            goto L95
        L5d:
            r7 = r12
            r12 = r1
            r1 = r5
            goto L36
        L61:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L9f
            java.lang.Object r12 = r1.c()
            r6 = r12
            m0.h1 r6 = (m0.h1) r6
            h2.b1 r12 = new h2.b1
            r4 = 10
            r8 = 0
            r12.<init>(r6, r8, r4)
            r4 = 3
            v80.b2 r8 = v80.f0.B(r7, r8, r8, r12, r4)
            v80.x1 r12 = v80.x1.f42174a
            al.n r4 = new al.n
            r9 = 0
            r10 = 24
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.f1560m = r7
            r11.f1561n = r5
            r11.f1562o = r1
            r11.f1559k = r2
            java.lang.Object r12 = v80.f0.K(r12, r4, r11)
            if (r12 != r0) goto L96
        L95:
            return r0
        L96:
            r4 = r5
            r12 = r7
            goto L1c
        L99:
            boolean r1 = v80.f0.y(r12)
            if (r1 != 0) goto L4e
        L9f:
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: al.n.e(java.lang.Object):java.lang.Object");
    }

    private final Object f(Object obj) {
        h1 h1Var = (h1) this.f1561n;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f1559k;
        if (i11 == 0) {
            ba0.g.M(obj);
            l0.f fVar = (l0.f) this.f1560m;
            Surface surface = ((j1.b) this.f1562o).f24366b;
            this.f1559k = 1;
            fVar.getClass();
            v80.l lVar = new v80.l(1, y70.f.b(this));
            lVar.t();
            h1Var.a(surface, new l0.b(0), new c1.f(lVar, 3));
            lVar.v(l0.e.f26744a);
            obj = lVar.s();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        ((b2) this.l).a(null);
        if (((m0.i) obj).f28527a != 3) {
            return Unit.f26487a;
        }
        h1Var.c();
        return Boolean.valueOf(h1Var.f28522i.b(null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (kotlin.Unit.f26487a != r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[PHI: r10
      0x0045: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v16 java.lang.Object) binds: [B:22:0x006c, B:15:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x002b, B:14:0x003a, B:29:0x008b, B:30:0x009b, B:32:0x00a1, B:15:0x003e, B:24:0x006f, B:26:0x0075, B:21:0x005f), top: B:44:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[Catch: all -> 0x0030, PHI: r4
      0x009b: PHI (r4v5 java.lang.Object) = (r4v4 java.lang.Object), (r4v6 java.lang.Object) binds: [B:25:0x0073, B:29:0x008b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0030, blocks: (B:9:0x002b, B:14:0x003a, B:29:0x008b, B:30:0x009b, B:32:0x00a1, B:15:0x003e, B:24:0x006f, B:26:0x0075, B:21:0x005f), top: B:44:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x002b, B:14:0x003a, B:29:0x008b, B:30:0x009b, B:32:0x00a1, B:15:0x003e, B:24:0x006f, B:26:0x0075, B:21:0x005f), top: B:44:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: al.n.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f1562o
            com.app.tgtg.model.remote.profile.response.ProfileFeatureType r0 = (com.app.tgtg.model.remote.profile.response.ProfileFeatureType) r0
            java.lang.Object r1 = r8.f1561n
            mn.l r1 = (mn.l) r1
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r8.f1559k
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L2a
            if (r3 == r6) goto L22
            if (r3 == r5) goto L17
            if (r3 != r4) goto L1b
        L17:
            ba0.g.M(r9)
            goto L6e
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L22:
            ba0.g.M(r9)
            u70.q r9 = (u70.q) r9
            java.lang.Object r9 = r9.f40851a
            goto L3c
        L2a:
            ba0.g.M(r9)
            ln.i r9 = r1.f30020b
            java.lang.Object r3 = r8.l
            com.app.tgtg.model.remote.profile.response.ProfileFeatureState r3 = (com.app.tgtg.model.remote.profile.response.ProfileFeatureState) r3
            r8.f1559k = r6
            java.lang.Object r9 = r9.e(r0, r3, r8)
            if (r9 != r2) goto L3c
            goto L6d
        L3c:
            u70.o r3 = u70.q.f40850b
            boolean r3 = r9 instanceof u70.p
            if (r3 != 0) goto L6e
            r3 = r9
            com.app.tgtg.model.remote.profile.response.ProfileFeature r3 = (com.app.tgtg.model.remote.profile.response.ProfileFeature) r3
            int[] r7 = mn.k.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r7[r0]
            if (r0 == r6) goto L60
            if (r0 == r5) goto L52
            goto L6e
        L52:
            y80.a2 r0 = r1.f30041x
            r8.f1560m = r9
            r8.f1559k = r4
            r0.j(r3)
            kotlin.Unit r9 = kotlin.Unit.f26487a
            if (r9 != r2) goto L6e
            goto L6d
        L60:
            y80.a2 r0 = r1.f30039v
            r8.f1560m = r9
            r8.f1559k = r5
            r0.j(r3)
            kotlin.Unit r9 = kotlin.Unit.f26487a
            if (r9 != r2) goto L6e
        L6d:
            return r2
        L6e:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: al.n.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r1.emit((com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse) r8, r7) != r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f1561n
            nh.b r0 = (nh.b) r0
            java.lang.Object r1 = r7.f1560m
            y80.j r1 = (y80.j) r1
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r7.f1559k
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L2a
            if (r3 == r6) goto L26
            if (r3 == r5) goto L22
            if (r3 != r4) goto L1b
            ba0.g.M(r8)
            goto L78
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L22:
            ba0.g.M(r8)
            goto L6a
        L26:
            ba0.g.M(r8)
            goto L40
        L2a:
            ba0.g.M(r8)
            java.lang.Object r8 = r7.f1562o
            com.app.tgtg.model.remote.discover.request.BucketFillerType r8 = (com.app.tgtg.model.remote.discover.request.BucketFillerType) r8
            java.lang.Object r3 = r7.l
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r7.f1560m = r1
            r7.f1559k = r6
            java.lang.Object r8 = nh.b.a(r0, r8, r3, r7)
            if (r8 != r2) goto L40
            goto L77
        L40:
            com.app.tgtg.model.remote.discover.request.DiscoverSingleBucketRequest r8 = (com.app.tgtg.model.remote.discover.request.DiscoverSingleBucketRequest) r8
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.now()
            java.time.ZoneOffset r3 = r3.getOffset()
            java.lang.String r3 = r3.toString()
            r3.getClass()
            android.content.Context r6 = r0.f30851a
            boolean r6 = android.text.format.DateFormat.is24HourFormat(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            mh.a r0 = r0.f30852b
            r7.f1560m = r1
            r7.f1559k = r5
            mh.b r0 = r0.f29958a
            java.lang.Object r8 = r0.b(r8, r3, r6, r7)
            if (r8 != r2) goto L6a
            goto L77
        L6a:
            com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse r8 = (com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse) r8
            r0 = 0
            r7.f1560m = r0
            r7.f1559k = r4
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r2) goto L78
        L77:
            return r2
        L78:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: al.n.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v15, types: [kotlin.jvm.functions.Function2, z70.i] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Map] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f1558j) {
            case 0:
                return new n((p) this.f1562o, (String) this.l, cVar, 0);
            case 1:
                return new n(this.f1560m, this.f1561n, (String) this.l, this.f1562o, cVar, 1);
            case 2:
                return new n((e90.c) this.f1562o, (Function2) this.l, cVar);
            case 3:
                return new n(cVar, (r0) this.f1560m, (ArrayList) this.f1561n, (ArrayList) this.f1562o);
            case 4:
                return new n((b1) this.f1560m, cVar, (Map) this.f1561n, (n2) this.f1562o, (t0) this.l, 4);
            case 5:
                return new n((b1) this.f1561n, cVar, (Map) this.f1560m, (n2) this.f1562o, (t0) this.l, 5);
            case 6:
                return new n((x2) this.f1561n, (n2) this.f1562o, (Map) this.f1560m, (t0) this.l, cVar);
            case 7:
                n nVar = new n((Function1) this.f1561n, (AtomicReference) this.f1562o, (Function2) this.l, cVar);
                nVar.f1560m = obj;
                return nVar;
            case 8:
                return new n((ResumePaymentData) this.f1562o, (s0) this.l, cVar, 8);
            case 9:
                return new n((em.j) this.f1560m, (Function0) this.f1561n, (Context) this.f1562o, (m3.b1) this.l, cVar, 9);
            case 10:
                return new n((String) this.l, (em.j) this.f1561n, (Country) this.f1562o, cVar);
            case 11:
                return new n((d0) this.f1560m, (List) this.f1561n, (List) this.f1562o, (List) this.l, cVar, 11);
            case 12:
                return new n((x3) this.f1561n, (String) this.l, (g1) this.f1562o, cVar);
            case 13:
                return new n((Function0) this.f1560m, (Function1) this.f1561n, (m3.b1) this.f1562o, (m3.b1) this.l, cVar, 13);
            case 14:
                return new n((st.b) this.f1562o, (ft.j) this.l, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new n((gi.c) this.f1562o, (String) this.l, cVar, 15);
            case 16:
                n nVar2 = new n((gs.a) this.f1562o, (PushNotificationsSettings) this.l, cVar, 16);
                nVar2.f1560m = obj;
                return nVar2;
            case 17:
                n nVar3 = new n((lz.i) this.f1562o, (Function2) this.l, cVar);
                nVar3.f1560m = obj;
                return nVar3;
            case 18:
                n nVar4 = new n((hh.a) this.f1562o, (fh.c) this.l, cVar, 18);
                nVar4.f1560m = obj;
                return nVar4;
            case 19:
                return new n((hr.i) this.f1562o, (String) this.l, cVar, 19);
            case 20:
                return new n((i5.d) this.f1560m, (ScrollCaptureSession) this.f1561n, (Rect) this.f1562o, (Consumer) this.l, cVar, 20);
            case 21:
                n nVar5 = new n((y0) this.f1561n, (g9.l) this.f1562o, (q1) this.l, cVar, 21);
                nVar5.f1560m = obj;
                return nVar5;
            case 22:
                return new n((ir.h) this.f1560m, (String) this.f1561n, (Boolean) this.f1562o, cVar);
            case 23:
                return new n(this.f1560m, this.f1561n, (String) this.l, this.f1562o, cVar, 23);
            case 24:
                return new n((l0.f) this.f1560m, (h1) this.f1561n, (j1.b) this.f1562o, (b2) this.l, cVar, 24);
            case 25:
                n nVar6 = new n((l0.f) this.l, cVar);
                nVar6.f1560m = obj;
                return nVar6;
            case 26:
                return new n((lo.m) this.f1562o, (String) this.l, cVar, 26);
            case 27:
                return new n((mn.l) this.f1561n, (ProfileFeatureType) this.f1562o, (ProfileFeatureState) this.l, cVar, 27);
            case 28:
                n nVar7 = new n((nh.b) this.f1561n, (BucketFillerType) this.f1562o, (ArrayList) this.l, cVar, 28);
                nVar7.f1560m = obj;
                return nVar7;
            default:
                return new n((no.j) this.f1560m, (m3.b1) this.f1561n, (Activity) this.f1562o, (Function0) this.l, cVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1558j) {
            case 0:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 6:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 7:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 8:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 9:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 10:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 11:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 12:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 13:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 14:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 16:
                return ((n) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 17:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 18:
                return ((n) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 19:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 20:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 21:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 22:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 23:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 24:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 25:
                return ((n) create((j1.b) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 26:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 27:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 28:
                return ((n) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((n) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fb, code lost:
    
        if (r1.emit(r0, r67) != r2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02e6, code lost:
    
        if (xz.b.r(r1, r6, r67) == r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03db, code lost:
    
        if (v80.f0.o(1000, r67) == r1) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x063d, code lost:
    
        if (r0.emit(em.e.f16092a, r67) == r3) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x06c4, code lost:
    
        if (r2.emit(r4, r67) == r3) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0761, code lost:
    
        if (cj.s0.a(r0, r1, r67) == r2) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0774, code lost:
    
        if (r3 == r2) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x07df, code lost:
    
        if (v80.f0.k(r2, r67) == r0) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x07f1, code lost:
    
        if (r3 == r0) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x084d, code lost:
    
        if (((v80.i0) r1).H(r67) == r0) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x096f, code lost:
    
        if (r0 != r12) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
    
        if (r0.emit(r2, r67) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0690 A[PHI: r0
      0x0690: PHI (r0v56 java.lang.Object) = (r0v55 java.lang.Object), (r0v55 java.lang.Object), (r0v62 java.lang.Object) binds: [B:262:0x066a, B:264:0x068d, B:250:0x0614] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0afe  */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v138 */
    /* JADX WARN: Type inference failed for: r1v43, types: [b0.x2] */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v28, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r68) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: al.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x2 x2Var, n2 n2Var, Map map, t0 t0Var, x70.c cVar) {
        super(2, cVar);
        this.f1558j = 6;
        this.f1561n = x2Var;
        this.f1562o = n2Var;
        this.f1560m = map;
        this.l = t0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(e90.c cVar, Function2 function2, x70.c cVar2) {
        super(2, cVar2);
        this.f1558j = 2;
        this.f1562o = cVar;
        this.l = (z70.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x3 x3Var, String str, g1 g1Var, x70.c cVar) {
        super(2, cVar);
        this.f1558j = 12;
        this.f1561n = x3Var;
        this.l = str;
        this.f1562o = g1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ir.h hVar, String str, Boolean bool, x70.c cVar) {
        super(2, cVar);
        this.f1558j = 22;
        this.f1560m = hVar;
        this.f1561n = str;
        this.f1562o = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1558j = i11;
        this.f1560m = obj;
        this.f1561n = obj2;
        this.f1562o = obj3;
        this.l = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, Object obj3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1558j = i11;
        this.f1561n = obj;
        this.f1562o = obj2;
        this.l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, String str, Object obj3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1558j = i11;
        this.f1560m = obj;
        this.f1561n = obj2;
        this.l = str;
        this.f1562o = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f1558j = i11;
        this.f1562o = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, em.j jVar, Country country, x70.c cVar) {
        super(2, cVar);
        this.f1558j = 10;
        this.l = str;
        this.f1561n = jVar;
        this.f1562o = country;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(Function1 function1, AtomicReference atomicReference, Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.f1558j = 7;
        this.f1561n = (Lambda) function1;
        this.f1562o = atomicReference;
        this.l = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l0.f fVar, x70.c cVar) {
        super(2, cVar);
        this.f1558j = 25;
        this.l = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(lz.i iVar, Function2 function2, x70.c cVar) {
        super(2, cVar);
        this.f1558j = 17;
        this.f1562o = iVar;
        this.l = (z70.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x70.c cVar, r0 r0Var, ArrayList arrayList, ArrayList arrayList2) {
        super(2, cVar);
        this.f1558j = 3;
        this.f1560m = r0Var;
        this.f1561n = arrayList;
        this.f1562o = arrayList2;
    }
}
