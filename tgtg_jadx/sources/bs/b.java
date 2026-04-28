package bs;

import a3.f1;
import a3.x;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.lifecycle.m1;
import androidx.recyclerview.widget.RecyclerView;
import bp.s;
import c1.q;
import cg.b0;
import cg.c0;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.item.response.HighlightedItemMnuV2;
import com.app.tgtg.model.remote.item.response.ItemMnuV2;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import com.app.tgtg.model.remote.manufacturer.response.ItemDetailsFaqItem;
import com.app.tgtg.model.remote.mapService.response.FilterChipOption;
import com.app.tgtg.model.remote.order.Order;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.models.IPropertiesObject;
import com.braze.models.inappmessage.IInAppMessageZippedAssetHtml;
import com.braze.push.BrazePushReceiver;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import g9.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import m3.b1;
import m3.h1;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONArray;
import pg.x0;
import v80.f0;
import y80.a2;
import ym.u;
import ym.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6669c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f6667a = i11;
        this.f6668b = obj;
        this.f6669c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11;
        switch (this.f6667a) {
            case 0:
                HiddenStoresActivity hiddenStoresActivity = (HiddenStoresActivity) this.f6668b;
                BasicItem basicItem = (BasicItem) this.f6669c;
                x0 x0Var = hiddenStoresActivity.f9416e;
                x70.c cVar = null;
                if (x0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x0Var = null;
                }
                ((TGTGLoadingView) x0Var.f35269j).setVisibility(0);
                x0 x0Var2 = hiddenStoresActivity.f9416e;
                if (x0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x0Var2 = null;
                }
                ((RecyclerView) x0Var2.f35262c).setVisibility(8);
                i iVar = hiddenStoresActivity.f9418g;
                if (iVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    iVar = null;
                }
                iVar.f6680b.clear();
                iVar.notifyDataSetChanged();
                o oVarA = hiddenStoresActivity.A();
                basicItem.getClass();
                f0.B(m1.d(oVarA), null, null, new x(oVarA, basicItem, cVar, 18), 3);
                return Unit.f26487a;
            case 1:
                ((db.a) ((cb.b) this.f6668b).f7865c).a((q) this.f6669c);
                return Unit.f26487a;
            case 2:
                b0 b0Var = (b0) this.f6668b;
                Vibrator vibrator = (Vibrator) this.f6669c;
                Function0 function0 = b0Var.f7936b;
                if (function0 != null) {
                    function0.invoke();
                }
                c0 c0Var = b0Var.f7937c;
                if (c0Var == null) {
                    return null;
                }
                vibrator.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i12 = c0Var.f7943a;
                int i13 = c0Var.f7944b;
                int i14 = c0Var.f7945c;
                if (i12 % 2 == 0) {
                    i12++;
                }
                if (i13 < 1) {
                    i13 = 1;
                }
                if (i13 > 100) {
                    i13 = 100;
                }
                int i15 = 1000 / i13;
                if (i14 < 1) {
                    i14 = 1;
                }
                if (i14 > 100) {
                    i14 = 100;
                }
                int i16 = (i14 * 255) / 100;
                int i17 = i16;
                for (int i18 = 0; i18 < i12; i18++) {
                    arrayList.add(Long.valueOf(i15));
                    arrayList2.add(Integer.valueOf(i17));
                    i17 = i17 == i16 ? 0 : i16;
                }
                if (!arrayList.isEmpty()) {
                    vibrator.vibrate(VibrationEffect.createWaveform(CollectionsKt.s0(arrayList), CollectionsKt.q0(arrayList2), -1));
                }
                return Unit.f26487a;
            case 3:
                Function1 function1 = (Function1) this.f6668b;
                Function0 function02 = (Function0) this.f6669c;
                function1.invoke(cv.i.CHARITY_LOGIN_STARTED);
                function02.invoke();
                return Unit.f26487a;
            case 4:
                cm.d dVar = (cm.d) this.f6668b;
                b1 b1Var = (b1) this.f6669c;
                cv.i iVar2 = cv.i.CHARITY_LOGIN_CONTACT_US_CLOSED;
                dv.a aVar = dv.a.CHARITY_LOGIN_SECTION;
                dv.d dVar2 = dv.d.LOGIN_LANDING;
                dv.b bVarE = h0.g.E(new Pair(aVar, new dv.c(dVar2 != null ? dVar2.a() : null)));
                dVar.getClass();
                iVar2.getClass();
                dVar.f8463a.c(iVar2, bVarE);
                b1Var.setValue(Boolean.FALSE);
                return Unit.f26487a;
            case 5:
                h1 h1Var = (h1) this.f6668b;
                Function1 function12 = (Function1) this.f6669c;
                if (h1Var.h() > 0) {
                    h1Var.i(h1Var.h() - 1);
                    if (function12 != null) {
                        function12.invoke(-1);
                    }
                }
                return Unit.f26487a;
            case 6:
                y yVar = (y) this.f6668b;
                ItemMnuV2 itemMnuV2 = (ItemMnuV2) this.f6669c;
                if (yVar != null) {
                    ((u) yVar).x(itemMnuV2.getItem());
                }
                return Unit.f26487a;
            case 7:
                y yVar2 = (y) this.f6668b;
                HighlightedItemMnuV2 highlightedItemMnuV2 = (HighlightedItemMnuV2) this.f6669c;
                if (yVar2 != null) {
                    ((u) yVar2).x(highlightedItemMnuV2.getItem());
                }
                return Unit.f26487a;
            case 8:
                ((Function2) this.f6668b).invoke((SortingChoice) this.f6669c, Boolean.TRUE);
                return Unit.f26487a;
            case 9:
                Activity activity = (Activity) this.f6668b;
                Order order = (Order) this.f6669c;
                if (activity != null) {
                    p30.b.w(activity, new io.a(order.m429getOrderIdreIZeYA(), order.getInvitationId(), order.getOrderType(), false, f70.i.ORDER_BLOB, 88), null);
                }
                return Unit.f26487a;
            case 10:
                return Braze._init_$lambda$27((Braze) this.f6668b, (Context) this.f6669c);
            case 11:
                return BrazeUser.setCustomUserAttribute$lambda$50((String) this.f6668b, (JSONArray) this.f6669c);
            case 12:
                return IPropertiesObject.doesKeyExist$lambda$1((String) this.f6668b, (IPropertiesObject) this.f6669c);
            case 13:
                return com.braze.models.h.a(this.f6668b, (JSONArray) this.f6669c);
            case 14:
                return BrazePushReceiver.Companion.handlePush$lambda$3((String) this.f6668b, (Intent) this.f6669c);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return StepData.isArgCountInBounds$lambda$4((IntRange) this.f6668b, (StepData) this.f6669c);
            case 16:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$8((IInAppMessageZippedAssetHtml) this.f6668b, (String) this.f6669c);
            case 17:
                ((Function1) this.f6668b).invoke((s) this.f6669c);
                return Unit.f26487a;
            case 18:
                e.n nVar = (e.n) this.f6668b;
                Uri uri = (Uri) this.f6669c;
                uri.getClass();
                nVar.a(uri, null);
                return Unit.f26487a;
            case 19:
                dq.i iVar3 = (dq.i) this.f6668b;
                Function0 function03 = (Function0) this.f6669c;
                a2 a2Var = iVar3.f15159d;
                Iterable iterable = (Iterable) a2Var.getValue();
                int i19 = 0;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    i11 = 0;
                } else {
                    Iterator it = iterable.iterator();
                    i11 = 0;
                    while (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue() && (i11 = i11 + 1) < 0) {
                            d0.m();
                            throw null;
                        }
                    }
                }
                cv.b bVar = iVar3.f15157b;
                if (i11 == 0) {
                    bVar.b(cv.i.ACTION_SKIP_BBM_SURVEY);
                } else {
                    cv.i iVar4 = cv.i.ACTION_ANSWER_BBM_SURVEY;
                    dv.a aVar2 = dv.a.ANSWERS;
                    Iterable iterable2 = (Iterable) a2Var.getValue();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : iterable2) {
                        int i21 = i19 + 1;
                        if (i19 < 0) {
                            d0.n();
                            throw null;
                        }
                        Integer numValueOf = ((Boolean) obj).booleanValue() ? Integer.valueOf(i19) : null;
                        if (numValueOf != null) {
                            arrayList3.add(numValueOf);
                        }
                        i19 = i21;
                    }
                    bVar.c(iVar4, h0.g.E(new Pair(aVar2, new dv.c(arrayList3)), new Pair(dv.a.FREE_TEXT_ANSWER, new dv.c((String) iVar3.f15162g.getValue()))));
                }
                function03.invoke();
                return Unit.f26487a;
            case 20:
                return com.braze.models.outgoing.event.a.b((String) this.f6668b, (String[]) this.f6669c);
            case 21:
                return com.braze.models.outgoing.event.a.b((String) this.f6668b, (com.braze.enums.g) this.f6669c);
            case 22:
                ((e.g) this.f6668b).f15286c = (Function0) this.f6669c;
                return Unit.f26487a;
            case 23:
                ((e.j) this.f6668b).f15291d = (Function2) this.f6669c;
                return Unit.f26487a;
            case 24:
                Function1 function13 = (Function1) this.f6668b;
                FlashSalesItem flashSalesItem = (FlashSalesItem) this.f6669c;
                if (function13 != null) {
                    function13.invoke(flashSalesItem);
                }
                return Unit.f26487a;
            case 25:
                ei.a aVar3 = (ei.a) this.f6668b;
                Function0 function04 = (Function0) this.f6669c;
                cv.i iVar5 = cv.i.CHARITY_LOGIN_CONNECT_TO_CHARITY;
                aVar3.getClass();
                iVar5.getClass();
                aVar3.f16039d.b(iVar5);
                function04.invoke();
                return Unit.f26487a;
            case 26:
                jj.c cVar2 = (jj.c) this.f6668b;
                FilterChipOption filterChipOption = (FilterChipOption) this.f6669c;
                cVar2.getClass();
                cVar2.f25290a.f20523c.i(new gj.f(filterChipOption));
                return Unit.f26487a;
            case 27:
                f1 f1Var = (f1) this.f6668b;
                ItemDetailsFaqItem itemDetailsFaqItem = (ItemDetailsFaqItem) this.f6669c;
                f1Var.invoke(itemDetailsFaqItem.getLinkUrl(), itemDetailsFaqItem.getQuestion());
                return Unit.f26487a;
            case 28:
                g9.f0 f0Var = (g9.f0) this.f6668b;
                ep.d0 d0Var = (ep.d0) this.f6669c;
                p.f(f0Var, hp.s.INSTANCE.f22335a);
                ArrayList arrayList4 = d0Var.f16254o;
                Iterable iterable3 = (Iterable) d0Var.f16250j.getValue();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : iterable3) {
                    if (((hp.f1) obj2).f22274b) {
                        arrayList5.add(obj2);
                    }
                }
                ArrayList arrayList6 = new ArrayList(e0.o(arrayList5, 10));
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(((hp.f1) it2.next()).f22273a.f22327a);
                }
                boolean zAreEqual = Intrinsics.areEqual(d0Var.f16257r, arrayList6);
                if (!zAreEqual) {
                    arrayList4.clear();
                }
                d0Var.f16257r = arrayList6;
                Object objR0 = !zAreEqual ? n0.f26529a : CollectionsKt.r0(arrayList4);
                List list = d0Var.l;
                list.getClass();
                f0.B(m1.d(d0Var), null, null, new al.n(d0Var, arrayList6, list, objR0, (x70.c) null, 11), 3);
                return Unit.f26487a;
            default:
                hp.a aVar4 = (hp.a) this.f6668b;
                ep.d0 d0Var2 = (ep.d0) this.f6669c;
                if (aVar4 == hp.a.SAVE_LIMIT_REACHED) {
                    d0Var2.A.j(null);
                }
                return Unit.f26487a;
        }
    }
}
