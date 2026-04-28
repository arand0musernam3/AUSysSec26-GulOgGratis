package androidx.lifecycle;

import a3.b2;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import c5.u2;
import com.app.tgtg.R;
import com.app.tgtg.feature.ServerMessageActivity;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.remote.PushNotificationsSettings;
import com.app.tgtg.model.remote.Server;
import com.app.tgtg.model.remote.order.Order;
import f0.d4;
import f0.f4;
import f0.y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.bouncycastle.iana.AEADAlgorithm;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3490b;

    public /* synthetic */ m(Object obj, int i11) {
        this.f3489a = i11;
        this.f3490b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if (r0.l(r10, r9, r1) == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ib.h0 r9, x70.c r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f3490b
            ep.d0 r0 = (ep.d0) r0
            boolean r1 = r10 instanceof ep.b0
            if (r1 == 0) goto L17
            r1 = r10
            ep.b0 r1 = (ep.b0) r1
            int r2 = r1.f16223m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f16223m = r2
            goto L1c
        L17:
            ep.b0 r1 = new ep.b0
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.f16222k
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.f16223m
            java.lang.String r4 = "POLLING_STATE"
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3d
            if (r3 == r6) goto L37
            if (r3 != r5) goto L30
            ba0.g.M(r10)
            goto L7c
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L37:
            ib.h0 r9 = r1.f16221j
            ba0.g.M(r10)
            goto L60
        L3d:
            ba0.g.M(r10)
            if (r9 != 0) goto L45
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        L45:
            ib.h r10 = r9.f23732e
            java.lang.String r3 = r10.a(r4)
            if (r3 == 0) goto L60
            java.lang.String r7 = "PARTIAL"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r7)
            if (r7 == 0) goto L60
            r1.f16221j = r9
            r1.f16223m = r6
            java.lang.Object r10 = r0.l(r3, r10, r1)
            if (r10 != r2) goto L60
            goto L7b
        L60:
            ib.g0 r10 = r9.f23729b
            boolean r10 = r10.a()
            if (r10 == 0) goto L7c
            ib.h r9 = r9.f23731d
            java.lang.String r10 = r9.a(r4)
            if (r10 == 0) goto L7c
            r3 = 0
            r1.f16221j = r3
            r1.f16223m = r5
            java.lang.Object r9 = r0.l(r10, r9, r1)
            if (r9 != r2) goto L7c
        L7b:
            return r2
        L7c:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.m.a(ib.h0, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(boolean r6, x70.c r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f3490b
            ao.g3 r0 = (ao.g3) r0
            boolean r1 = r7 instanceof ao.g2
            if (r1 == 0) goto L17
            r1 = r7
            ao.g2 r1 = (ao.g2) r1
            int r2 = r1.l
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.l = r2
            goto L1c
        L17:
            ao.g2 r1 = new ao.g2
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r7 = r1.f4255j
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r1.l
            r4 = 1
            if (r3 == 0) goto L32
            if (r3 != r4) goto L2b
            ba0.g.M(r7)
            goto L40
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L32:
            ba0.g.M(r7)
            if (r6 != 0) goto L5d
            r1.l = r4
            java.lang.Object r6 = r0.s(r1)
            if (r6 != r2) goto L40
            return r2
        L40:
            cv.b r6 = r0.f4263g
            cv.i r7 = cv.i.DEBUG_SYSTEM_LOG_OUT
            dv.a r0 = dv.a.STATUS_CODE
            dv.c r1 = new dv.c
            java.lang.String r2 = "Unauthorized"
            r1.<init>(r2)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r2}
            dv.b r0 = h0.g.E(r0)
            r6.c(r7, r0)
        L5d:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.m.b(boolean, x70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) throws Throwable {
        ib.h hVar;
        String strA;
        int i11 = 9;
        switch (this.f3489a) {
            case 0:
                l0 l0Var = (l0) this.f3490b;
                Object objK = v80.f0.K(l0Var.f3488b, new a3.x(l0Var, obj, , i11), cVar);
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                if (objK != aVar) {
                    objK = Unit.f26487a;
                }
                return objK == aVar ? objK : Unit.f26487a;
            case 1:
                return b(((Boolean) obj).booleanValue(), cVar);
            case 2:
                ib.h0 h0Var = (ib.h0) obj;
                if (h0Var != null && (hVar = h0Var.f23731d) != null && (strA = hVar.a("PollingState")) != null) {
                    bm.p pVar = (bm.p) this.f3490b;
                    int iHashCode = strA.hashCode();
                    if (iHashCode != -2009873286) {
                        if (iHashCode != -1667914715) {
                            if (iHashCode == 1023309918) {
                                strA.equals("KeepPolling");
                            }
                        } else if (strA.equals("PollingError")) {
                            v80.f0.B(m1.d(pVar), null, null, new b2(pVar, , 8), 3);
                        }
                    } else if (strA.equals("LoginSuccess")) {
                        pVar.f6379a.n().setShouldVerifyEmail(false);
                        v80.f0.B(m1.d(pVar), null, null, new bm.n(pVar, null), 3);
                        ft.c.L(null);
                    }
                }
                return Unit.f26487a;
            case 3:
                ((u2) this.f3490b).f7386a.i(((Number) obj).floatValue());
                return Unit.f26487a;
            case 4:
                c50.l0 l0Var2 = (c50.l0) obj;
                c50.f1 f1Var = (c50.f1) this.f3490b;
                l0Var2.getClass();
                f1Var.f7540h = l0Var2;
                if (f1Var.f7542j) {
                    f1Var.f7542j = false;
                    f1Var.c();
                }
                Object objA = c50.f1.a(f1Var, l0Var2.f7599a.f7613a, c50.b1.GENERAL, cVar);
                return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
            case 5:
                d8.y yVar = (d8.y) this.f3490b;
                if (yVar.f14742h.b() instanceof d8.i0) {
                    return Unit.f26487a;
                }
                Object objF = d8.y.f(yVar, true, cVar);
                return objF == y70.a.COROUTINE_SUSPENDED ? objF : Unit.f26487a;
            case 6:
                g9.f0 f0Var = (g9.f0) this.f3490b;
                hp.y yVar2 = (hp.y) obj;
                if (yVar2 instanceof hp.q) {
                    g9.p.f(f0Var, hp.q.INSTANCE.f22335a);
                } else if (yVar2 instanceof hp.u) {
                    g9.p.f(f0Var, hp.u.INSTANCE.f22335a);
                } else {
                    hp.o oVar = hp.o.INSTANCE;
                    if (Intrinsics.areEqual(yVar2, oVar)) {
                        g9.p.f(f0Var, oVar.f22335a);
                    } else {
                        hp.r rVar = hp.r.INSTANCE;
                        if (Intrinsics.areEqual(yVar2, rVar)) {
                            g9.p.f(f0Var, rVar.f22335a);
                        } else {
                            hp.s sVar = hp.s.INSTANCE;
                            if (Intrinsics.areEqual(yVar2, sVar)) {
                                g9.p.f(f0Var, sVar.f22335a);
                            } else {
                                hp.t tVar = hp.t.INSTANCE;
                                if (Intrinsics.areEqual(yVar2, tVar)) {
                                    g9.p.f(f0Var, tVar.f22335a);
                                } else {
                                    hp.w wVar = hp.w.INSTANCE;
                                    if (Intrinsics.areEqual(yVar2, wVar)) {
                                        g9.p.f(f0Var, wVar.f22335a);
                                    } else {
                                        hp.v vVar = hp.v.INSTANCE;
                                        if (Intrinsics.areEqual(yVar2, vVar)) {
                                            g9.p.f(f0Var, vVar.f22335a);
                                        } else {
                                            hp.x xVar = hp.x.INSTANCE;
                                            if (!Intrinsics.areEqual(yVar2, xVar)) {
                                                e40.a.f();
                                                return null;
                                            }
                                            g9.p.f(f0Var, xVar.f22335a);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return Unit.f26487a;
            case 7:
                return a((ib.h0) obj, cVar);
            case 8:
                j0.m mVar = (j0.m) obj;
                f0.v0 v0Var = (f0.v0) this.f3490b;
                a2 a2Var = v0Var.f16931f;
                if (mVar instanceof j0.i) {
                    a2Var.getClass();
                    a2Var.k(null, mVar);
                    Unit unit = Unit.f26487a;
                    y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                    return unit;
                }
                if (mVar instanceof j0.k) {
                    a2Var.getClass();
                    a2Var.k(null, mVar);
                    Unit unit2 = Unit.f26487a;
                    y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                    return unit2;
                }
                if (!(mVar instanceof j0.j)) {
                    return Unit.f26487a;
                }
                y80.m1 m1Var = v0Var.f16933h;
                Unit unit3 = Unit.f26487a;
                Object objEmit = m1Var.emit(unit3, cVar);
                return objEmit == y70.a.COROUTINE_SUSPENDED ? objEmit : unit3;
            case 9:
                f0.v1 v1Var = (f0.v1) obj;
                f4 f4Var = (f4) this.f3490b;
                synchronized (f4Var.f16663e) {
                    try {
                        if (v1Var instanceof y1) {
                            d4 d4Var = new d4((f0.d) ((y1) v1Var).f17003a);
                            f4Var.f16665g = d4Var;
                            f4Var.b(new y1(d4Var));
                        } else {
                            f4Var.b(v1Var);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Unit.f26487a;
            case 10:
                b2.j jVar = (b2.j) obj;
                m3.h1 h1Var = (m3.h1) this.f3490b;
                if ((jVar instanceof b2.n) || (jVar instanceof b2.d)) {
                    h1Var.i(h1Var.h() + 1);
                } else if ((jVar instanceof b2.o) || (jVar instanceof b2.e) || (jVar instanceof b2.m)) {
                    h1Var.i(h1Var.h() - 1);
                }
                return Unit.f26487a;
            case 11:
                String str = (String) obj;
                CharityOrderActivity charityOrderActivity = (CharityOrderActivity) this.f3490b;
                if (charityOrderActivity.C().f22215i.f45488a.getValue() == null) {
                    return Unit.f26487a;
                }
                String string = charityOrderActivity.getString(R.string.orderview_delegate_sharing_subject);
                string.getClass();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string2 = charityOrderActivity.getString(R.string.orderview_delegate_sharing_body);
                string2.getClass();
                Order order = (Order) charityOrderActivity.C().f22215i.f45488a.getValue();
                charityOrderActivity.C().B.f26484a.a(new f70.q(String.format(string2, Arrays.copyOf(new Object[]{order != null ? order.getStoreName() : 0, str}, 2)), string, 4));
                return Unit.f26487a;
            case 12:
                ft.a aVar4 = (ft.a) obj;
                if (aVar4 != null) {
                    MainActivity mainActivity = (MainActivity) this.f3490b;
                    boolean z11 = MainActivity.f9078v;
                    mainActivity.g0().f22148a.f4195c.j(null);
                    mainActivity.g0().f22163q.f25316a.a(new f70.b(ServerMessageActivity.class, jb.u.x(new Pair("MESSAGE_URL", aVar4.f17900b), new Pair("BLOCK_APP", Boolean.valueOf(aVar4.f17899a))), false, false, false, null, null, null, null, false, 636));
                }
                return Unit.f26487a;
            case 13:
                ((ho.j) this.f3490b).f22210d.f20828c.j((PushNotificationsSettings) obj);
                Unit unit4 = Unit.f26487a;
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                return unit4;
            case 14:
                gj.b0 b0Var = (gj.b0) obj;
                lm.i iVar = (lm.i) this.f3490b;
                if (Intrinsics.areEqual(b0Var, gj.x.f20526a)) {
                    iVar.w(true);
                } else if (Intrinsics.areEqual(b0Var, gj.y.f20527a)) {
                    FragmentManager parentFragmentManager = iVar.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    new hj.d().show(parentFragmentManager, "FiltersFullScreenFragment");
                } else if (b0Var instanceof gj.z) {
                    tm.e eVarS = iVar.s();
                    String str2 = ((gj.z) b0Var).f20528a;
                    cv.i iVar2 = cv.i.ACTION_QUICK_FILTER_APPLIED;
                    Pair pair = new Pair(dv.a.SOURCE, new dv.c(str2));
                    dv.a aVar6 = dv.a.SELECTED_FILTERS;
                    ArrayList arrayList = new ArrayList();
                    String strA2 = dv.d.COMPLEX_FILTER_FLAG_TRUE.a();
                    ij.b bVar = eVarS.l;
                    Object value = bVar.f24031d.f45488a.getValue();
                    if (((Set) value).isEmpty()) {
                        value = null;
                    }
                    Set set = (Set) value;
                    if (set != null) {
                        dv.a aVar7 = dv.a.ID;
                        dv.d dVar = dv.d.COMPLEX_FILTER_CATEGORY;
                        arrayList.add(h0.g.E(new Pair(aVar7, new dv.c(dVar != null ? dVar.a() : null)), new Pair(dv.a.SELECTED_VALUES, new dv.c(CollectionsKt.k0(CollectionsKt.r0(set))))));
                    }
                    if (bVar.l.f45488a.getValue() != null) {
                        dv.a aVar8 = dv.a.ID;
                        dv.d dVar2 = dv.d.COMPLEX_FILTER_COLLECTION_TIME;
                        arrayList.add(h0.g.E(new Pair(aVar8, new dv.c(dVar2 != null ? dVar2.a() : null)), new Pair(dv.a.SELECTED_VALUES, new dv.c(kotlin.collections.c0.c(strA2)))));
                    }
                    if (bVar.c()) {
                        dv.a aVar9 = dv.a.ID;
                        dv.d dVar3 = dv.d.COMPLEX_FILTER_COLLECT_NOW;
                        arrayList.add(h0.g.E(new Pair(aVar9, new dv.c(dVar3 != null ? dVar3.a() : null)), new Pair(dv.a.SELECTED_VALUES, new dv.c(kotlin.collections.c0.c(strA2)))));
                    }
                    Object value2 = bVar.f24033f.f45488a.getValue();
                    if (((Set) value2).isEmpty()) {
                        value2 = null;
                    }
                    Set set2 = (Set) value2;
                    if (set2 != null) {
                        dv.a aVar10 = dv.a.ID;
                        dv.d dVar4 = dv.d.COMPLEX_FILTER_DIET;
                        arrayList.add(h0.g.E(new Pair(aVar10, new dv.c(dVar4 != null ? dVar4.a() : null)), new Pair(dv.a.SELECTED_VALUES, new dv.c(CollectionsKt.k0(CollectionsKt.r0(set2))))));
                    }
                    if (((Boolean) bVar.f24042p.f45488a.getValue()).booleanValue()) {
                        dv.a aVar11 = dv.a.ID;
                        dv.d dVar5 = dv.d.COMPLEX_FILTER_SOLD_OUT;
                        arrayList.add(h0.g.E(new Pair(aVar11, new dv.c(dVar5 != null ? dVar5.a() : null)), new Pair(dv.a.SELECTED_VALUES, new dv.c(kotlin.collections.c0.c(strA2)))));
                    }
                    String str3 = (String) bVar.f24035h.f45488a.getValue();
                    if (str3 != null) {
                        dv.a aVar12 = dv.a.ID;
                        dv.d dVar6 = dv.d.COMPLEX_FILTER_SORT;
                        arrayList.add(h0.g.E(new Pair(aVar12, new dv.c(dVar6 != null ? dVar6.a() : null)), new Pair(dv.a.SELECTED_VALUES, new dv.c(kotlin.collections.c0.c(str3)))));
                    }
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((dv.b) it.next()).c());
                    }
                    eVarS.n(iVar2, h0.g.E(pair, new Pair(aVar6, new dv.c(arrayList2))));
                } else {
                    if (!(b0Var instanceof gj.a0)) {
                        e40.a.f();
                        return null;
                    }
                    iVar.s().n(cv.i.ACTION_QUICK_FILTER_RESET, h0.g.E(new Pair(dv.a.SOURCE, new dv.c(((gj.a0) b0Var).f20477a))));
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                String strK = e0.f.k("https://share.toogoodtogo.com/recipe/", (String) obj);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", strK);
                intent.setFlags(1);
                try {
                    Intent intentCreateChooser = Intent.createChooser(intent, "");
                    e.n nVar = (e.n) this.f3490b;
                    intentCreateChooser.getClass();
                    nVar.a(intentCreateChooser, null);
                    break;
                } catch (Exception e5) {
                    sa0.a.f38953a.k(e5, "Failed to launch share intent", new Object[0]);
                }
                return Unit.f26487a;
            case 16:
                long jLongValue = ((Number) obj).longValue();
                a2 a2Var2 = (a2) ((n1) this.f3490b).f3500b;
                Long l = new Long(jLongValue);
                a2Var2.getClass();
                a2Var2.k(null, l);
                Unit unit5 = Unit.f26487a;
                y70.a aVar13 = y70.a.COROUTINE_SUSPENDED;
                return unit5;
            case 17:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ng.d dVar7 = (ng.d) this.f3490b;
                if (zBooleanValue) {
                    Toast.makeText(dVar7.requireActivity(), "Welcome to " + ((Server) dVar7.s().f30843d.f45488a.getValue()).getName(), 0).show();
                }
                dVar7.dismiss();
                return Unit.f26487a;
            case 18:
                if (Intrinsics.areEqual((ni.a) obj, ni.a.f30856a)) {
                    ((Function0) this.f3490b).invoke();
                    return Unit.f26487a;
                }
                e40.a.f();
                return null;
            case 19:
                String str4 = (String) obj;
                SurpriseBagOrderActivity surpriseBagOrderActivity = (SurpriseBagOrderActivity) this.f3490b;
                if (surpriseBagOrderActivity.C().f22215i.f45488a.getValue() == null) {
                    return Unit.f26487a;
                }
                String string3 = surpriseBagOrderActivity.getString(R.string.orderview_delegate_sharing_subject);
                string3.getClass();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string4 = surpriseBagOrderActivity.getString(R.string.orderview_delegate_sharing_body);
                string4.getClass();
                Order order2 = (Order) surpriseBagOrderActivity.C().f22215i.f45488a.getValue();
                String str5 = String.format(string4, Arrays.copyOf(new Object[]{order2 != null ? order2.getStoreName() : null, str4}, 2));
                no.m0 m0VarC = surpriseBagOrderActivity.C();
                m0VarC.getClass();
                m0VarC.I.f26484a.a(new f70.q(str5, string3, 4));
                return Unit.f26487a;
            case 20:
                int iIntValue = ((Number) obj).intValue();
                pi.m mVar2 = (pi.m) this.f3490b;
                mVar2.getClass();
                v80.f0.B(m1.d(mVar2), null, null, new b0.a1(mVar2, iIntValue, , i11), 3);
                return Unit.f26487a;
            case 21:
                ((ss.w) ((t5.a) this.f3490b).f39791b).f39256d.i(new ts.y(((Number) obj).intValue()));
                return Unit.f26487a;
            case 22:
                w2.z zVar = (w2.z) this.f3490b;
                if (Build.VERSION.SDK_INT >= 34) {
                    w2.i.b(zVar.q(), (View) zVar.f43083b);
                }
                return Unit.f26487a;
            case 23:
                ((ub.a) this.f3490b).J();
                return Unit.f26487a;
            case 24:
                ub.a aVar14 = (ub.a) ((oa0.m0) this.f3490b).f32344g;
                aVar14.H().updateCursorAnchorInfo((View) aVar14.f40981b, (CursorAnchorInfo) obj);
                return Unit.f26487a;
            case 25:
                ((w2.e1) this.f3490b).I.setValue(Boolean.FALSE);
                return Unit.f26487a;
            case 26:
                Pair pair2 = (Pair) obj;
                int iIntValue2 = ((Number) pair2.f26485a).intValue();
                int iIntValue3 = ((Number) pair2.f26486b).intValue();
                xj.k kVar = (xj.k) this.f3490b;
                kVar.M.i(iIntValue2);
                kVar.N.i(iIntValue3);
                return Unit.f26487a;
            default:
                zl.b bVar2 = (zl.b) obj;
                if (bVar2 instanceof zl.b) {
                    ((Function1) this.f3490b).invoke(bVar2.f47967a);
                    return Unit.f26487a;
                }
                e40.a.f();
                return null;
        }
    }
}
