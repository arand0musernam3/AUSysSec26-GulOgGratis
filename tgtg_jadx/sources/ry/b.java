package ry;

import a3.v0;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c0;
import b2.j;
import b5.o0;
import c40.q;
import c5.s0;
import com.app.tgtg.feature.catering.ui.CateringItemDetailsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.model.remote.RewardId;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.response.CateringItem;
import com.app.tgtg.model.remote.profile.response.SpecialRewardsCardDetails;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.app.tgtg.model.remote.user.response.Address;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import d6.l;
import e.n;
import i4.h;
import i4.m0;
import ii.j0;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import m3.b1;
import m3.c3;
import m3.l0;
import m5.k0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.w;
import r5.y;
import s90.g;
import ss.d1;
import t1.d0;
import t1.g0;
import t1.m1;
import t1.p1;
import t1.q1;
import ti.i;
import ti.s;
import us.r;
import v80.b0;
import v80.f0;
import v80.i0;
import x60.m;
import z4.z;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38273c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f38271a = i11;
        this.f38272b = obj;
        this.f38273c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r9v1 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Lifecycle lifecycle;
        int length;
        int i11 = 2;
        int i12 = 4;
        int i13 = 16;
        int i14 = 3;
        int i15 = 0;
        int i16 = 1;
        w wVar = 0;
        switch (this.f38271a) {
            case 0:
                a aVar = (a) this.f38272b;
                n nVar = (n) this.f38273c;
                ((l0) obj).getClass();
                aVar.f38270d = nVar;
                return new v0(aVar, i13);
            case 1:
                Lifecycle lifecycle2 = (Lifecycle) this.f38272b;
                c0 c0Var = (c0) this.f38273c;
                ((l0) obj).getClass();
                lifecycle2.a(c0Var);
                return new s0(15, lifecycle2, c0Var);
            case 2:
                g gVar = (g) this.f38272b;
                q qVar = (q) this.f38273c;
                ((IOException) obj).getClass();
                synchronized (gVar) {
                    qVar.d();
                }
                return Unit.f26487a;
            case 3:
                ContactUsActivity contactUsActivity = (ContactUsActivity) this.f38272b;
                View view = (View) this.f38273c;
                int i17 = ContactUsActivity.f9367t;
                ((View) obj).getClass();
                w wVar2 = contactUsActivity.f9369g;
                if (wVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wVar2 = null;
                }
                int iIndexOfChild = wVar2.l.indexOfChild(view);
                w wVar3 = contactUsActivity.f9369g;
                if (wVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    wVar3 = null;
                }
                wVar3.l.removeViewAt(iIndexOfChild);
                contactUsActivity.F().f9393n.remove(iIndexOfChild);
                boolean z11 = contactUsActivity.F().f9393n.size() < 2;
                w wVar4 = contactUsActivity.f9369g;
                if (wVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    wVar = wVar4;
                }
                ContactUsActivity.Z(z11, wVar.f35213h);
                return Unit.f26487a;
            case 4:
                g0 g0Var = (g0) this.f38272b;
                d0 d0Var = (d0) this.f38273c;
                g0Var.f39434a.b(d0Var);
                g0Var.f39435b.setValue(Boolean.TRUE);
                return new s0(i13, g0Var, d0Var);
            case 5:
                f0.B((b0) this.f38272b, null, v80.d0.UNDISPATCHED, new f3.g((q1) this.f38273c, null), 1);
                return new l(1);
            case 6:
                q1 q1Var = (q1) this.f38272b;
                q1 q1Var2 = (q1) this.f38273c;
                q1Var.f39546j.add(q1Var2);
                return new s0(17, q1Var, q1Var2);
            case 7:
                return new s0(18, (q1) this.f38272b, (m1) this.f38273c);
            case 8:
                q1 q1Var3 = (q1) this.f38272b;
                p1 p1Var = (p1) this.f38273c;
                q1Var3.f39545i.add(p1Var);
                return new s0(19, q1Var3, p1Var);
            case 9:
                b1 b1Var = (b1) this.f38272b;
                s sVar = (s) this.f38273c;
                i iVar = (i) obj;
                iVar.getClass();
                b1Var.setValue(Boolean.FALSE);
                if (iVar != i.NONE) {
                    cv.i iVar2 = cv.i.ACTION_MANAGE_CUSTOM_COLLECTION_DAYS_CLOSE;
                    dv.b bVarE = h0.g.E(new Pair(dv.a.CUSTOM_DAYS_CLOSED_FROM, new dv.c(iVar.a())));
                    sVar.getClass();
                    iVar2.getClass();
                    sVar.f40263d.c(iVar2, bVarE);
                }
                return Unit.f26487a;
            case 10:
                s sVar2 = (s) this.f38272b;
                c3 c3Var = (c3) this.f38273c;
                List list = (List) obj;
                list.getClass();
                if (list.isEmpty()) {
                    sVar2.f40270k.j(n0.f26529a);
                } else {
                    sVar2.getClass();
                    f0.B(androidx.lifecycle.m1.d(sVar2), null, null, new os.c(sVar2, list, (x70.c) wVar, 13), 3);
                }
                cv.i iVar3 = cv.i.ACTION_CUSTOM_COLLECTION_DAYS_CONFIRM;
                dv.b bVarE2 = h0.g.E(new Pair(dv.a.NUMBER_OF_CONFLICTS, new dv.c(Integer.valueOf(((List) c3Var.getValue()).size()))), new Pair(dv.a.NUMBER_OF_KEPT_CONFLICTS, new dv.c(Integer.valueOf(((List) c3Var.getValue()).size() - list.size()))));
                sVar2.getClass();
                iVar3.getClass();
                sVar2.f40263d.c(iVar3, bVarE2);
                return Unit.f26487a;
            case 11:
                tg.i iVar4 = (tg.i) this.f38272b;
                LatLngInfo latLngInfo = (LatLngInfo) this.f38273c;
                String str = (String) obj;
                str.getClass();
                String str2 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(str, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null));
                String string = str2 != null ? StringsKt.e0(str2).toString() : null;
                if (string == null) {
                    string = "";
                }
                String str3 = string;
                iVar4.k(new vg.g(str3, null, new Address(str3, latLngInfo, null), vg.d.DRAGGING_MAP, 2));
                return Unit.f26487a;
            case 12:
                List list2 = (List) this.f38272b;
                tg.i iVar5 = (tg.i) this.f38273c;
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                lVar.r(list2.size(), null, new cn.n(list2, 27), new u3.d(new lk.b(iVar5, list2, i16), true, 802480018));
                return Unit.f26487a;
            case 13:
                pg.n nVar2 = (pg.n) this.f38272b;
                CateringItemDetailsActivity cateringItemDetailsActivity = (CateringItemDetailsActivity) this.f38273c;
                int i18 = CateringItemDetailsActivity.f8972o;
                ((View) obj).getClass();
                nVar2.f35003v.setEnabled(false);
                cateringItemDetailsActivity.F().f29972b = false;
                uh.g gVarF = cateringItemDetailsActivity.F();
                CateringItem cateringItem = (CateringItem) gVarF.f41159i.d();
                if (cateringItem != null) {
                    th.c cVar = gVarF.f41156f;
                    cVar.getClass();
                    cVar.f40185a.a(new th.b(cateringItem));
                    ArrayList arrayListJ = kotlin.collections.d0.j(dv.d.SURPRISE.a());
                    cv.i iVar6 = cv.i.SCREEN_NEED_TO_KNOW;
                    dv.a aVar2 = dv.a.SOURCE;
                    dv.d dVar = dv.d.PRE_PURCHASE_POPUP;
                    gVarF.d(iVar6, h0.g.E(new Pair(aVar2, new dv.c(dVar != null ? dVar.a() : null)), new Pair(dv.a.KNOW_TYPE, new dv.c(arrayListJ)), new Pair(dv.a.ITEM_TYPE, new dv.c(cateringItem.getItemType().name()))));
                } else {
                    gVarF.f41162m.k(Boolean.TRUE);
                }
                cateringItemDetailsActivity.G();
                return Unit.f26487a;
            case 14:
                ss.b1 b1Var2 = (ss.b1) this.f38272b;
                m mVar = (m) this.f38273c;
                f2.l lVar2 = (f2.l) obj;
                lVar2.getClass();
                List list3 = b1Var2.f39140b;
                lVar2.r(list3.size(), null, new cn.n(list3, 28), new u3.d(new lk.b(mVar, list3, i11), true, 802480018));
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                List list4 = (List) this.f38272b;
                BasicVoucher basicVoucher = (BasicVoucher) this.f38273c;
                f2.l lVar3 = (f2.l) obj;
                lVar3.getClass();
                lVar3.r(list4.size(), null, new cn.n(list4, 29), new u3.d(new lk.b(basicVoucher, list4, i14), true, 802480018));
                return Unit.f26487a;
            case 16:
                d1 d1Var = (d1) this.f38272b;
                t5.a aVar3 = (t5.a) this.f38273c;
                f2.l lVar4 = (f2.l) obj;
                lVar4.getClass();
                if (d1Var.f39155b.isEmpty()) {
                    f2.l.q(lVar4, null, us.a.f41509b, 3);
                } else {
                    f2.l.s(lVar4, d1Var.f39155b.size(), null, new u3.d(new r(d1Var, aVar3, i15), true, 2125286309), 6);
                }
                f2.l.q(lVar4, null, new u3.d(new tq.c(aVar3, i16), true, 1764477432), 3);
                f2.l.q(lVar4, null, us.a.f41510c, 3);
                return Unit.f26487a;
            case 17:
                ((b2.l) this.f38272b).c((b2.m) this.f38273c);
                return Unit.f26487a;
            case 18:
                h hVar = (h) this.f38272b;
                i4.r rVar = (i4.r) this.f38273c;
                o0 o0Var = (o0) obj;
                o0Var.b();
                k4.d.s(o0Var, hVar, rVar, 0.0f, null, 60);
                return Unit.f26487a;
            case 19:
                m0 m0Var = (m0) this.f38272b;
                i4.r rVar2 = (i4.r) this.f38273c;
                o0 o0Var2 = (o0) obj;
                o0Var2.b();
                k4.d.s(o0Var2, m0Var.f23270f, rVar2, 0.0f, null, 60);
                return Unit.f26487a;
            case 20:
                ((b2.l) this.f38272b).c((j) this.f38273c);
                return Unit.f26487a;
            case 21:
                Function1 function1 = (Function1) this.f38272b;
                SpecialRewardsCardDetails specialRewardsCardDetails = (SpecialRewardsCardDetails) this.f38273c;
                ((SpecialReward) obj).getClass();
                function1.invoke(RewardId.m257boximpl(specialRewardsCardDetails.m489getRewardIdr7kTZ_U()));
                return Unit.f26487a;
            case 22:
                i0 i0Var = (i0) this.f38272b;
                v80.q qVar2 = (v80.q) this.f38273c;
                Throwable th2 = (Throwable) obj;
                i0Var.getClass();
                qVar2.getClass();
                if (th2 == null) {
                    qVar2.R(i0Var.p());
                } else if (th2 instanceof CancellationException) {
                    qVar2.r((CancellationException) th2);
                } else {
                    qVar2.h0(th2);
                }
                return Unit.f26487a;
            case 23:
                e6.i iVar7 = (e6.i) this.f38272b;
                v80.q qVar3 = (v80.q) this.f38273c;
                Throwable th3 = (Throwable) obj;
                if (th3 == null) {
                    iVar7.b(qVar3.C());
                } else if (th3 instanceof CancellationException) {
                    iVar7.c();
                } else {
                    iVar7.d(th3);
                }
                return Unit.f26487a;
            case 24:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f38272b;
                w8.a aVar4 = (w8.a) this.f38273c;
                androidx.lifecycle.s sVar3 = new androidx.lifecycle.s(aVar4, 7);
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.a(sVar3);
                }
                if (lifecycleOwner == null) {
                    androidx.lifecycle.w wVar5 = androidx.lifecycle.w.ON_RESUME;
                    aVar4.getClass();
                    aVar4.f43281b = wVar5.a();
                    aVar4.a();
                }
                return new i3.a(lifecycleOwner, (c0) sVar3, (Object) aVar4, i12);
            case 25:
                ((w80.c) this.f38272b).f43292b.removeCallbacks((v30.a) this.f38273c);
                return Unit.f26487a;
            case 26:
                wi.e eVar = (wi.e) this.f38272b;
                Function2 function2 = (Function2) this.f38273c;
                z zVar = (z) obj;
                zVar.getClass();
                int i19 = eVar.f43432a;
                if (!eVar.f43435d && function2 != null) {
                    function2.invoke(Integer.valueOf(i19), zVar);
                }
                return Unit.f26487a;
            case 27:
                String str4 = (String) this.f38272b;
                b1 b1Var3 = (b1) this.f38273c;
                y yVar = (y) obj;
                yVar.getClass();
                String str5 = yVar.f37714a.f29538b;
                if (Intrinsics.areEqual(str4, "GB") && 5 <= (length = str5.length()) && length < 9) {
                    String strN = kotlin.text.y.n(str5, " ", "", false);
                    int length2 = strN.length() - 3;
                    str5 = strN.substring(0, length2) + ' ' + strN.substring(length2);
                }
                int length3 = str5.length();
                b1Var3.setValue(y.a(yVar, str5, k0.b(length3, length3), 4));
                return Unit.f26487a;
            case 28:
                ((x.g) this.f38272b).f43606b.b((x.f) this.f38273c);
                return Unit.f26487a;
            default:
                j0 j0Var = (j0) this.f38272b;
                b1 b1Var4 = (b1) this.f38273c;
                String string2 = LocalDate.now().toString();
                string2.getClass();
                j0Var.getClass();
                f0.E(kotlin.coroutines.g.f26549a, new gf.g(j0Var, string2, wVar, i13));
                b1Var4.setValue(null);
                return Unit.f26487a;
        }
    }
}
