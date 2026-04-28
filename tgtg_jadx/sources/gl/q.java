package gl;

import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import ao.e1;
import ao.g3;
import com.app.tgtg.feature.locationpicker.LocationPickerActivity;
import com.app.tgtg.feature.login.optin.OptInActivity;
import com.app.tgtg.feature.main.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jb.u;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.y;
import mv.m0;
import mv.z;
import v80.f0;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgl/q;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOnboardingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnboardingViewModel.kt\ncom/app/tgtg/feature/login/onboarding/OnboardingViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1300#2,2:304\n1315#2,2:306\n1318#2:309\n1596#2:310\n1629#2,4:311\n1807#2,3:315\n1606#2:318\n1617#2:319\n1924#2,2:320\n1926#2:323\n1618#2:324\n1#3:308\n1#3:322\n*S KotlinDebug\n*F\n+ 1 OnboardingViewModel.kt\ncom/app/tgtg/feature/login/onboarding/OnboardingViewModel\n*L\n61#1:304,2\n61#1:306,2\n61#1:309\n184#1:310\n184#1:311,4\n197#1:315,3\n203#1:318\n203#1:319\n203#1:320,2\n203#1:323\n203#1:324\n203#1:322\n*E\n"})
public final class q extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f20567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ft.j f20568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f20569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ao.c f20570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cv.b f20571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f20572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f20573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f20574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f20575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h1 f20576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final av.c f20577k;

    public q(o oVar, ft.j jVar, g3 g3Var, ao.c cVar, cv.b bVar) {
        oVar.getClass();
        jVar.getClass();
        g3Var.getClass();
        cVar.getClass();
        bVar.getClass();
        this.f20567a = oVar;
        this.f20568b = jVar;
        this.f20569c = g3Var;
        this.f20570d = cVar;
        this.f20571e = bVar;
        this.f20572f = new ArrayList();
        a2 a2VarC = r.c(Boolean.FALSE);
        this.f20573g = a2VarC;
        this.f20574h = a2VarC;
        IntRange intRange = new IntRange(1, 2, 1);
        int iA = w0.a(e0.o(intRange, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        Iterator it = intRange.iterator();
        while (((n80.h) it).f30715c) {
            Object next = it.next();
            ((Number) next).intValue();
            ArrayList arrayList = new ArrayList(6);
            for (int i11 = 0; i11 < 6; i11++) {
                arrayList.add(Boolean.FALSE);
            }
            linkedHashMap.put(next, arrayList);
        }
        a2 a2VarC2 = r.c(new jl.e(linkedHashMap));
        this.f20575i = a2VarC2;
        this.f20576j = new h1(a2VarC2);
        this.f20577k = new av.c();
        this.f20567a.f20564b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(gl.q r5, z70.c r6) {
        /*
            boolean r0 = r6 instanceof gl.p
            if (r0 == 0) goto L13
            r0 = r6
            gl.p r0 = (gl.p) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            gl.p r0 = new gl.p
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f20565j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            r6.getClass()
            goto L50
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L33:
            ba0.g.M(r6)
            mv.m0 r6 = sa0.a.f38953a
            java.lang.String r2 = "OnboardingSurvey"
            r6.h(r2)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "fetchUser() called"
            r6.c(r4, r2)
            ao.g3 r5 = r5.f20569c
            r0.l = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L50
            return r1
        L50:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.q.a(gl.q, z70.c):java.lang.Object");
    }

    public final List b(int i11) {
        jl.g gVar;
        List list = (List) ((jl.e) this.f20576j.f45488a.getValue()).f25314a.get(Integer.valueOf(i11));
        if (list == null) {
            return n0.f26529a;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            String strC = null;
            if (i12 < 0) {
                d0.n();
                throw null;
            }
            if (((Boolean) obj).booleanValue()) {
                if (i11 == 1) {
                    jl.f fVar = (jl.f) CollectionsKt.Q(i12, jl.f.a());
                    if (fVar != null) {
                        strC = fVar.c();
                    }
                } else if (i11 == 2 && (gVar = (jl.g) CollectionsKt.Q(i12, jl.g.a())) != null) {
                    strC = gVar.c();
                }
            }
            if (strC != null) {
                arrayList.add(strC);
            }
            i12 = i13;
        }
        return arrayList;
    }

    public final void c() {
        m0 m0Var = sa0.a.f38953a;
        m0Var.h("OnboardingSurvey");
        m0Var.c("navigateAfterOnboarding() called", new Object[0]);
        String strH = this.f20569c.h();
        if (y.k(strH, "US", true)) {
            d("push");
            return;
        }
        if (this.f20570d.b(strH)) {
            d("newsletter");
            return;
        }
        boolean zH = this.f20568b.h();
        av.c cVar = this.f20577k;
        if (zH) {
            cVar.k(new av.a(MainActivity.class, u.x(new Pair("DESTINATION", z.DISCOVER)), 56));
        } else {
            cVar.k(new av.a(LocationPickerActivity.class, u.x(new Pair("ORIGIN", f70.i.ONBOARDING), new Pair("IS_NEW_USER", Boolean.TRUE)), 56));
        }
    }

    public final void d(String str) {
        this.f20577k.k(new av.a(OptInActivity.class, u.x(new Pair("OPT_IN_TYPE", str), new Pair("OPT_IN_CONTEXT", ll.e.SIGNUP)), 56));
    }

    public final void e(int i11) {
        f0.B(m1.d(this), null, null, new e1(b(i11), this, i11 != 1 ? i11 != 2 ? "" : jl.h.WHEN_DO_YOU_PREFER_TO_COLLECT.a() : jl.h.WHAT_BRINGS_YOU_HERE.a(), null, 4), 3);
    }

    public final void f(int i11, boolean z11) {
        String strA = i11 != 0 ? i11 != 1 ? i11 != 2 ? "" : jl.h.WHEN_DO_YOU_PREFER_TO_COLLECT.a() : jl.h.WHAT_BRINGS_YOU_HERE.a() : "Its_A_Surprise";
        List listB = z11 ? n0.f26529a : b(i11);
        boolean zAreEqual = Intrinsics.areEqual(strA, jl.h.WHAT_BRINGS_YOU_HERE.a());
        cv.b bVar = this.f20571e;
        if (zAreEqual) {
            bVar.c(cv.i.ACTION_ONBOARDING_USP, h0.g.E(new Pair(dv.a.SELECTED_VALUES, new dv.c(listB))));
        } else if (Intrinsics.areEqual(strA, jl.h.WHEN_DO_YOU_PREFER_TO_COLLECT.a())) {
            bVar.c(cv.i.ACTION_ONBOARDING_COLLECTION_TIMES, h0.g.E(new Pair(dv.a.SELECTED_VALUES, new dv.c(listB))));
        }
    }
}
