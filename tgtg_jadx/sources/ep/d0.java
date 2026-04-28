package ep;

import a3.x1;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import com.adyen.checkout.googlepay.AllowedCardNetworks;
import com.app.tgtg.model.local.GenericErrors;
import com.google.android.gms.internal.measurement.cg;
import hp.p1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import v80.f0;
import y80.a2;
import y80.g1;
import y80.h1;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lep/d0;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecipeGeneratorViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecipeGeneratorViewModel.kt\ncom/app/tgtg/feature/recipegenerator/RecipeGeneratorViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Data.kt\nandroidx/work/DataKt\n+ 5 Json.kt\nkotlinx/serialization/json/Json\n+ 6 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,905:1\n1642#2,10:906\n1915#2:916\n1916#2:919\n1652#2:920\n1586#2:921\n1661#2,3:922\n777#2:931\n873#2,2:932\n777#2:939\n873#2,2:940\n1586#2:942\n1661#2,3:943\n1586#2:946\n1661#2,3:947\n296#2,2:950\n1586#2:955\n1661#2,3:956\n1586#2:964\n1661#2,3:965\n777#2:978\n873#2,2:979\n1#3:917\n1#3:918\n32#4,5:925\n222#5:930\n230#6,5:934\n230#6,3:952\n233#6,2:959\n230#6,3:961\n233#6,2:968\n230#6,5:970\n230#6,3:975\n233#6,2:981\n*S KotlinDebug\n*F\n+ 1 RecipeGeneratorViewModel.kt\ncom/app/tgtg/feature/recipegenerator/RecipeGeneratorViewModel\n*L\n216#1:906,10\n216#1:916\n216#1:919\n216#1:920\n251#1:921\n251#1:922,3\n547#1:931\n547#1:932,2\n619#1:939\n619#1:940,2\n620#1:942\n620#1:943,3\n661#1:946\n661#1:947,3\n667#1:950,2\n757#1:955\n757#1:956,3\n769#1:964\n769#1:965,3\n787#1:978\n787#1:979,2\n216#1:918\n410#1:925,5\n499#1:930\n552#1:934,5\n756#1:952,3\n756#1:959,2\n768#1:961,3\n768#1:968,2\n780#1:970,5\n786#1:975,3\n786#1:981,2\n*E\n"})
public final class d0 extends l1 {
    public final a2 A;
    public final h1 B;
    public final a2 C;
    public final h1 D;
    public final a2 E;
    public final h1 F;
    public final m1 G;
    public final g1 H;
    public String I;
    public final a2 J;
    public final h1 K;
    public final LinkedHashMap L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jp.q f16241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv.b f16242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb.s f16243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gp.a f16244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cv.b f16245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mv.u f16246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c1 f16247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m1 f16248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g1 f16249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f16250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h1 f16251k;
    public List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f16252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f16253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f16254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2 f16255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1 f16256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f16257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a2 f16258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1 f16259t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a2 f16260u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h1 f16261v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a2 f16262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h1 f16263x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a2 f16264y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final h1 f16265z;

    public d0(jp.q qVar, fv.b bVar, jb.s sVar, gp.a aVar, cv.b bVar2, mv.u uVar, c1 c1Var) {
        qVar.getClass();
        aVar.getClass();
        bVar2.getClass();
        uVar.getClass();
        c1Var.getClass();
        this.f16241a = qVar;
        this.f16242b = bVar;
        this.f16243c = sVar;
        this.f16244d = aVar;
        this.f16245e = bVar2;
        this.f16246f = uVar;
        this.f16247g = c1Var;
        x70.c cVar = null;
        m1 m1VarB = y80.r.b(0, 0, null, 7);
        this.f16248h = m1VarB;
        this.f16249i = new g1(m1VarB);
        n0 n0Var = n0.f26529a;
        a2 a2VarC = y80.r.c(n0Var);
        this.f16250j = a2VarC;
        this.f16251k = new h1(a2VarC);
        this.l = n0Var;
        a2 a2VarC2 = y80.r.c(n0Var);
        this.f16252m = a2VarC2;
        this.f16253n = new h1(a2VarC2);
        this.f16254o = new ArrayList();
        a2 a2VarC3 = y80.r.c(n0Var);
        this.f16255p = a2VarC3;
        this.f16256q = new h1(a2VarC3);
        a2 a2VarC4 = y80.r.c(null);
        this.f16258s = a2VarC4;
        this.f16259t = new h1(a2VarC4);
        a2 a2VarC5 = y80.r.c(n0Var);
        this.f16260u = a2VarC5;
        this.f16261v = new h1(a2VarC5);
        a2 a2VarC6 = y80.r.c(n0Var);
        this.f16262w = a2VarC6;
        this.f16263x = new h1(a2VarC6);
        a2 a2VarC7 = y80.r.c(null);
        this.f16264y = a2VarC7;
        this.f16265z = new h1(a2VarC7);
        a2 a2VarC8 = y80.r.c(null);
        this.A = a2VarC8;
        this.B = new h1(a2VarC8);
        a2 a2VarC9 = y80.r.c(null);
        this.C = a2VarC9;
        this.D = new h1(a2VarC9);
        a2 a2VarC10 = y80.r.c(null);
        this.E = a2VarC10;
        this.F = new h1(a2VarC10);
        m1 m1VarB2 = y80.r.b(0, 0, null, 7);
        this.G = m1VarB2;
        this.H = new g1(m1VarB2);
        SharedPreferences sharedPreferences = ft.e.f17922c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
            sharedPreferences = null;
        }
        a2 a2VarC11 = y80.r.c(Boolean.valueOf(sharedPreferences.getBoolean("recipeGeneratorImageConsentGiven", false)));
        this.J = a2VarC11;
        this.K = new h1(a2VarC11);
        this.L = new LinkedHashMap();
        f0.B(androidx.lifecycle.m1.d(this), null, null, new u(this, cVar, 0), 3);
        String str = (String) c1Var.a("SHARED_RECIPE_TOKEN");
        if (str != null) {
            f0.B(androidx.lifecycle.m1.d(this), null, null, new v(this, str, null), 3);
            return;
        }
        Boolean bool = (Boolean) c1Var.a("OPEN_SAVED_RECIPES");
        if (bool != null ? bool.booleanValue() : false) {
            f0.B(androidx.lifecycle.m1.d(this), null, null, new u(this, cVar, 2), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[EDGE_INSN: B:36:0x0089->B:31:0x0089 BREAK  A[LOOP:0: B:26:0x0071->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ep.d0 r6, hp.g r7, z70.c r8) {
        /*
            y80.a2 r0 = r6.f16255p
            boolean r1 = r8 instanceof ep.q
            if (r1 == 0) goto L15
            r1 = r8
            ep.q r1 = (ep.q) r1
            int r2 = r1.f16320m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f16320m = r2
            goto L1a
        L15:
            ep.q r1 = new ep.q
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.f16319k
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.f16320m
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L30
            hp.g r7 = r1.f16318j
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            java.lang.Object r8 = r8.f40851a
            goto L52
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            return r4
        L36:
            ba0.g.M(r8)
            java.lang.Object r8 = r0.getValue()
            java.util.List r8 = (java.util.List) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L67
            jp.q r8 = r6.f16241a
            r1.f16318j = r7
            r1.f16320m = r5
            java.lang.Object r8 = r8.k(r1)
            if (r8 != r2) goto L52
            return r2
        L52:
            u70.o r1 = u70.q.f40850b
            boolean r1 = r8 instanceof u70.p
            if (r1 != 0) goto L60
            r1 = r8
            hp.e1 r1 = (hp.e1) r1
            java.util.List r1 = r1.f22271b
            r6.w(r1)
        L60:
            java.lang.Throwable r6 = u70.q.a(r8)
            if (r6 == 0) goto L67
            return r7
        L67:
            java.lang.Object r6 = r0.getValue()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L71:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L89
            java.lang.Object r8 = r6.next()
            r0 = r8
            hp.g r0 = (hp.g) r0
            java.lang.String r1 = r7.f22276b
            java.lang.String r0 = r0.f22276b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L71
            r4 = r8
        L89:
            hp.g r4 = (hp.g) r4
            if (r4 == 0) goto L96
            java.lang.String r6 = r4.f22275a
            r8 = 1022(0x3fe, float:1.432E-42)
            hp.g r6 = hp.g.a(r7, r6, r5, r8)
            return r6
        L96:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.d0.a(ep.d0, hp.g, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ep.d0 r4, z70.c r5) {
        /*
            boolean r0 = r5 instanceof ep.r
            if (r0 == 0) goto L13
            r0 = r5
            ep.r r0 = (ep.r) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ep.r r0 = new ep.r
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f16321j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r5)
            u70.q r5 = (u70.q) r5
            java.lang.Object r4 = r5.f40851a
            goto L40
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L32:
            ba0.g.M(r5)
            jp.q r4 = r4.f16241a
            r0.l = r3
            java.lang.Object r4 = r4.c(r0)
            if (r4 != r1) goto L40
            return r1
        L40:
            java.lang.Throwable r4 = u70.q.a(r4)
            if (r4 == 0) goto L50
            mv.m0 r5 = sa0.a.f38953a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Failed to cleanup old viewed recipes from DB"
            r5.e(r4, r1, r0)
        L50:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.d0.b(ep.d0, z70.c):java.lang.Object");
    }

    public static final ArrayList c(d0 d0Var, List list) {
        Object pVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            try {
                u70.o oVar = u70.q.f40850b;
                fv.b bVar = d0Var.f16242b;
                bVar.getClass();
                uri.getClass();
                pVar = bVar.f(true, uri);
            } catch (Throwable th2) {
                u70.o oVar2 = u70.q.f40850b;
                pVar = new u70.p(th2);
            }
            if (pVar instanceof u70.p) {
                pVar = null;
            }
            q90.a0 a0Var = (q90.a0) pVar;
            if (a0Var != null) {
                arrayList.add(a0Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(ep.d0 r9, hp.g r10, java.lang.String r11, z70.c r12) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.d0.d(ep.d0, hp.g, java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r7.n(r9, r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(ep.d0 r7, hp.g r8, java.lang.String r9, z70.c r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof ep.c0
            if (r0 == 0) goto L16
            r0 = r10
            ep.c0 r0 = (ep.c0) r0
            int r1 = r0.f16234o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f16234o = r1
            goto L1b
        L16:
            ep.c0 r0 = new ep.c0
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f16232m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16234o
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L36
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.l
            ba0.g.M(r10)
            goto L77
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            return r5
        L36:
            java.lang.String r9 = r0.f16231k
            hp.g r8 = r0.f16230j
            ba0.g.M(r10)
            u70.q r10 = (u70.q) r10
            java.lang.Object r10 = r10.f40851a
        L41:
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
            goto L5f
        L46:
            ba0.g.M(r10)
            java.lang.String r10 = r8.f22275a
            if (r10 != 0) goto L50
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        L50:
            jp.q r2 = r7.f16241a
            r0.f16230j = r8
            r0.f16231k = r9
            r0.f16234o = r4
            java.lang.Object r10 = r2.d(r10, r0)
            if (r10 != r1) goto L41
            goto L76
        L5f:
            u70.o r2 = u70.q.f40850b
            boolean r2 = r8 instanceof u70.p
            if (r2 != 0) goto L77
            r2 = r8
            kotlin.Unit r2 = (kotlin.Unit) r2
            r0.f16230j = r5
            r0.f16231k = r5
            r0.l = r8
            r0.f16234o = r3
            java.lang.Object r9 = r7.n(r9, r10, r0)
            if (r9 != r1) goto L77
        L76:
            return r1
        L77:
            java.lang.Throwable r8 = u70.q.a(r8)
            if (r8 == 0) goto L80
            i(r7)
        L80:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.d0.e(ep.d0, hp.g, java.lang.String, z70.c):java.lang.Object");
    }

    public static dv.d g(String str) {
        str.getClass();
        return Intrinsics.areEqual(str, hp.t.INSTANCE.f22335a) ? dv.d.SCREEN_RECIPE : Intrinsics.areEqual(str, hp.u.INSTANCE.f22335a) ? dv.d.SCREEN_RECIPE_LIST : Intrinsics.areEqual(str, hp.v.INSTANCE.f22335a) ? dv.d.SCREEN_SAVED_RECIPE_LIST : dv.d.NONE;
    }

    public static /* synthetic */ void i(d0 d0Var) {
        d0Var.h(GenericErrors.Generic.INSTANCE);
    }

    public static void v(a2 a2Var, hp.g gVar, String str) {
        Object value;
        ArrayList arrayList;
        do {
            value = a2Var.getValue();
            List<hp.g> list = (List) value;
            arrayList = new ArrayList(e0.o(list, 10));
            for (hp.g gVar2 : list) {
                if (Intrinsics.areEqual(gVar2.f22276b, str)) {
                    gVar2 = gVar;
                }
                arrayList.add(gVar2);
            }
        } while (!a2Var.g(value, arrayList));
    }

    public final dv.d f() {
        f70.i iVar = (f70.i) this.f16247g.a("ORIGIN");
        String strName = iVar != null ? iVar.name() : null;
        if (strName != null) {
            int iHashCode = strName.hashCode();
            if (iHashCode != 408556937) {
                if (iHashCode != 835624813) {
                    if (iHashCode == 1055811561 && strName.equals(AllowedCardNetworks.DISCOVER)) {
                        return dv.d.SCREEN_DISCOVER;
                    }
                } else if (strName.equals("DEEP_LINK")) {
                    return dv.d.DEEP_LINK;
                }
            } else if (strName.equals("PROFILE")) {
                return dv.d.SCREEN_MENU;
            }
        }
        return dv.d.NONE;
    }

    public final void h(GenericErrors genericErrors) {
        f0.B(androidx.lifecycle.m1.d(this), null, null, new d8.c(this, genericErrors, null, 12), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ep.w
            if (r0 == 0) goto L13
            r0 = r5
            ep.w r0 = (ep.w) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ep.w r0 = new ep.w
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f16333j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L44
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            r5 = 0
            dv.d r2 = dv.d.NO_RECIPES_FOUND
            r4.s(r5, r2)
            hp.q r5 = hp.q.INSTANCE
            r0.l = r3
            y80.m1 r2 = r4.f16248h
            java.lang.Object r5 = r2.emit(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            com.app.tgtg.model.local.GenericErrors$NoRecipeFound r5 = new com.app.tgtg.model.local.GenericErrors$NoRecipeFound
            db0.c r0 = new db0.c
            r1 = 24
            r0.<init>(r1)
            r5.<init>(r0)
            r4.h(r5)
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.d0.j(z70.c):java.lang.Object");
    }

    public final Object k(hp.e0 e0Var, boolean z11, b0 b0Var) {
        ArrayList arrayList;
        a2 a2Var;
        Object value;
        this.C.j(e0Var.f22268e);
        List list = e0Var.f22267d;
        if (cg.q(list)) {
            list.getClass();
            if (list.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    arrayList = this.f16254o;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (!arrayList.contains((hp.g) next)) {
                        arrayList2.add(next);
                    }
                }
                arrayList.addAll(arrayList2);
                do {
                    a2Var = this.f16252m;
                    value = a2Var.getValue();
                } while (!a2Var.g(value, list));
            }
            s(list.size(), null);
        } else if (z11) {
            Object objJ = j(b0Var);
            return objJ == y70.a.COROUTINE_SUSPENDED ? objJ : Unit.f26487a;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object l(String str, ib.h hVar, b0 b0Var) {
        Object objK;
        Object objJ;
        List list;
        a2 a2Var = this.E;
        a2Var.getClass();
        a2Var.k(null, str);
        switch (str.hashCode()) {
            case -74951327:
                if (str.equals("PARTIAL")) {
                    hp.e0 e0VarO = o(hVar);
                    if (e0VarO == null || (objK = k(e0VarO, false, b0Var)) != y70.a.COROUTINE_SUSPENDED) {
                        objK = Unit.f26487a;
                    }
                    return objK == y70.a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
                }
                break;
            case 2104194:
                if (str.equals("DONE")) {
                    hp.e0 e0VarO2 = o(hVar);
                    if (e0VarO2 == null || ((list = e0VarO2.f22267d) == null || list.isEmpty() ? (objJ = j(b0Var)) != y70.a.COROUTINE_SUSPENDED : (objJ = k(e0VarO2, true, b0Var)) != y70.a.COROUTINE_SUSPENDED)) {
                        objJ = Unit.f26487a;
                    }
                    return objJ == y70.a.COROUTINE_SUSPENDED ? objJ : Unit.f26487a;
                }
                break;
            case 35394935:
                str.equals("PENDING");
                break;
            case 66247144:
                if (str.equals("ERROR")) {
                    s(((List) this.f16253n.f45488a.getValue()).size(), dv.d.RECIPE_GENERATION_LIMIT_REACHED);
                    i(this);
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(hp.g r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ep.x
            if (r0 == 0) goto L13
            r0 = r6
            ep.x r0 = (ep.x) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ep.x r0 = new ep.x
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f16335j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            r6.getClass()
            goto L46
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L33:
            ba0.g.M(r6)
            java.lang.String r6 = r5.f22276b
            r4.u(r5, r6)
            r0.l = r3
            jp.q r6 = r4.f16241a
            java.lang.Object r5 = r6.o(r5, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.d0.m(hp.g, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(hp.g r6, java.lang.String r7, z70.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ep.y
            if (r0 == 0) goto L13
            r0 = r8
            ep.y r0 = (ep.y) r0
            int r1 = r0.f16341o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16341o = r1
            goto L18
        L13:
            ep.y r0 = new ep.y
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f16339m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f16341o
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            boolean r6 = r0.l
            hp.g r7 = r0.f16338k
            hp.g r0 = r0.f16337j
            ba0.g.M(r8)
            u70.q r8 = (u70.q) r8
            r8.getClass()
            r8 = r7
            r7 = r6
            r6 = r0
            goto L60
        L35:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L3c:
            ba0.g.M(r8)
            hp.v r8 = hp.v.INSTANCE
            java.lang.String r8 = r8.f22335a
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
            r8 = 0
            r2 = 1023(0x3ff, float:1.434E-42)
            r4 = 0
            hp.g r8 = hp.g.a(r6, r4, r8, r2)
            r0.f16337j = r6
            r0.f16338k = r8
            r0.l = r7
            r0.f16341o = r3
            jp.q r2 = r5.f16241a
            java.lang.Object r0 = r2.o(r8, r0)
            if (r0 != r1) goto L60
            return r1
        L60:
            java.lang.String r0 = r6.f22276b
            r5.u(r8, r0)
            if (r7 == 0) goto L9d
            java.lang.String r6 = r6.f22276b
        L69:
            y80.a2 r7 = r5.f16255p
            java.lang.Object r8 = r7.getValue()
            r0 = r8
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L7b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r0.next()
            r3 = r2
            hp.g r3 = (hp.g) r3
            java.lang.String r3 = r3.f22276b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r6)
            if (r3 != 0) goto L7b
            r1.add(r2)
            goto L7b
        L94:
            boolean r7 = r7.g(r8, r1)
            if (r7 == 0) goto L69
            r5.t()
        L9d:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.d0.n(hp.g, java.lang.String, z70.c):java.lang.Object");
    }

    public final hp.e0 o(ib.h hVar) {
        Object pVar;
        String strA = hVar.a("KEY_POLLING_RESULT_JSON");
        if (strA == null || strA.length() == 0) {
            return null;
        }
        try {
            u70.o oVar = u70.q.f40850b;
            n90.b bVar = n90.c.f30748d;
            bVar.getClass();
            pVar = (hp.e0) bVar.b(hp.e0.Companion.serializer(), strA);
        } catch (Throwable th2) {
            u70.o oVar2 = u70.q.f40850b;
            pVar = new u70.p(th2);
        }
        if (u70.q.a(pVar) != null) {
            s(((List) this.f16253n.f45488a.getValue()).size(), dv.d.SOMETHING_WENT_WRONG);
            i(this);
        }
        return (hp.e0) (pVar instanceof u70.p ? null : pVar);
    }

    public final void p(Context context) {
        String str = this.I;
        x70.c cVar = null;
        if (str != null) {
            f0.B(androidx.lifecycle.m1.d(this), null, null, new d8.c(this, str, cVar, 14), 3);
        }
        jb.s sVarD = jb.s.d(context);
        sVarD.getClass();
        sVarD.a("RECIPE_GENERATOR_POLLING");
        this.I = null;
    }

    public final void q(hp.g gVar, String str) {
        cv.i iVar;
        gVar.getClass();
        str.getClass();
        boolean z11 = gVar.f22285k;
        if (z11) {
            iVar = cv.i.ACTION_UNSAVE_RECIPE;
        } else {
            if (z11) {
                e40.a.f();
                return;
            }
            iVar = cv.i.ACTION_SAVE_RECIPE;
        }
        Pair pair = new Pair(dv.a.TITLE, new dv.c(gVar.f22276b));
        dv.a aVar = dv.a.SCREEN_NAME;
        dv.d dVarG = g(str);
        x70.c cVar = null;
        r(iVar, h0.g.E(pair, new Pair(aVar, new dv.c(dVarG != null ? dVarG.a() : null))));
        f0.B(androidx.lifecycle.m1.d(this), null, null, new x1(gVar, this, str, cVar, 19), 3);
    }

    public final void r(cv.i iVar, dv.b bVar) {
        iVar.getClass();
        this.f16245e.c(iVar, bVar);
    }

    public final void s(int i11, dv.d dVar) {
        r(cv.i.SCREEN_RECIPE_LIST, dVar != null ? h0.g.E(new Pair(dv.a.RECIPE_COUNT, new dv.c(Integer.valueOf(i11))), new Pair(dv.a.WHY_EMPTY, new dv.c(dVar.a()))) : h0.g.E(new Pair(dv.a.RECIPE_COUNT, new dv.c(Integer.valueOf(i11)))));
    }

    public final void t() {
        cv.i iVar = cv.i.SCREEN_SAVED_RECIPE_LIST;
        Pair pair = new Pair(dv.a.RECIPE_COUNT, new dv.c(Integer.valueOf(((List) this.f16255p.getValue()).size())));
        dv.a aVar = dv.a.OPENED_FROM;
        dv.d dVarF = f();
        r(iVar, h0.g.E(pair, new Pair(aVar, new dv.c(dVarF != null ? dVarF.a() : null))));
    }

    public final void u(hp.g gVar, String str) {
        a2 a2Var;
        Object value;
        ArrayList arrayList;
        a2 a2Var2;
        Object value2;
        hp.g gVar2;
        v(this.f16255p, gVar, str);
        v(this.f16252m, gVar, str);
        do {
            a2Var = this.f16260u;
            value = a2Var.getValue();
            List<p1> list = (List) value;
            arrayList = new ArrayList(e0.o(list, 10));
            for (p1 p1Var : list) {
                if (Intrinsics.areEqual(p1Var.f22317a.f22276b, str)) {
                    long j9 = p1Var.f22318b;
                    gVar.getClass();
                    p1Var = new p1(gVar, j9);
                }
                arrayList.add(p1Var);
            }
        } while (!a2Var.g(value, arrayList));
        do {
            a2Var2 = this.f16258s;
            value2 = a2Var2.getValue();
            gVar2 = (hp.g) value2;
        } while (!a2Var2.g(value2, gVar2 != null ? hp.g.a(gVar2, gVar.f22275a, gVar.f22285k, 1022) : null));
    }

    public final void w(List list) {
        ArrayList arrayList = new ArrayList(e0.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hp.g gVar = (hp.g) it.next();
            arrayList.add(hp.g.a(gVar, gVar.f22275a, true, 1022));
        }
        a2 a2Var = this.f16255p;
        a2Var.getClass();
        a2Var.k(null, arrayList);
    }

    public final void x(List list, boolean z11, hp.d dVar) {
        list.getClass();
        dVar.getClass();
        if (!z11) {
            h(GenericErrors.Offline.INSTANCE);
            return;
        }
        LinkedHashMap linkedHashMap = this.L;
        linkedHashMap.clear();
        linkedHashMap.put(dVar, list);
        List list2 = (List) linkedHashMap.get(hp.d.FROM_GALLERY);
        int size = list2 != null ? list2.size() : 0;
        List list3 = (List) linkedHashMap.get(hp.d.FROM_CAMERA);
        int size2 = list3 != null ? list3.size() : 0;
        r(cv.i.ACTION_UPLOAD_PHOTO, h0.g.E(new Pair(dv.a.PHOTO_COUNT, new dv.c(Integer.valueOf(size + size2))), new Pair(dv.a.GALLERY_PHOTO_COUNT, new dv.c(Integer.valueOf(size))), new Pair(dv.a.CAMERA_PHOTO_COUNT, new dv.c(Integer.valueOf(size2)))));
        f0.B(androidx.lifecycle.m1.d(this), null, null, new s(this, list, null, 1), 3);
    }
}
