package g3;

import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CaptureResult;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import com.app.tgtg.R;
import com.app.tgtg.feature.charity.ui.help.CharityContactUsActivity;
import com.app.tgtg.feature.main.fragments.discover.herocomponent.DiscoverSheetView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.DiscoverNotLiveHereView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.RatingCardComposeView;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import com.app.tgtg.feature.tabprofile.legal.LegalActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.user.requests.SurveyResult;
import com.tgtg.componentlibrary.component.checkbox.PantryCheckboxKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.android.Zendesk;
import zendesk.messaging.android.internal.conversationscreen.delegates.MessageLoadMoreAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.common.loadmore.LoadMoreState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q9 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19371b;

    public /* synthetic */ q9(i2.i0 i0Var, z1.q2 q2Var) {
        this.f19370a = 23;
        this.f19371b = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i11 = this.f19370a;
        pg.q3 q3Var = null;
        Object obj2 = this.f19371b;
        switch (i11) {
            case 0:
                m5.r0 r0Var = (m5.r0) obj2;
                m5.f fVar = (m5.f) obj;
                m5.c cVar = (m5.c) fVar.f29529a;
                if (cVar instanceof m5.n) {
                    m5.n nVar = (m5.n) cVar;
                    if (nVar.f29598b == null) {
                        return m5.f.a(fVar, new m5.n(nVar.f29597a, r0Var, nVar.f29599c), 0, 0, 14);
                    }
                }
                if (!(cVar instanceof m5.m)) {
                    return fVar;
                }
                m5.m mVar = (m5.m) cVar;
                return mVar.f29591b == null ? m5.f.a(fVar, new m5.m(mVar.f29590a, r0Var, mVar.f29592c), 0, 0, 14) : fVar;
            case 1:
                SurveyResult surveyResult = (SurveyResult) obj;
                surveyResult.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(surveyResult.getQuestionId(), ((SurveyResult) obj2).getQuestionId()));
            case 2:
                ((z5.c) obj).getClass();
                return new z5.j((((long) 0) << 32) | (((long) j80.c.b(((z1.r) ((dn.k) obj2).f15019c).g())) & 4294967295L));
            case 3:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((DiscoverSheetView) obj2).f9150k.invoke(bool);
                return Unit.f26487a;
            case 4:
                nq.d dVar = (nq.d) obj2;
                View view = (View) obj;
                view.getClass();
                hq.j jVar = view instanceof hq.j ? (hq.j) view : null;
                if (jVar != null) {
                    jVar.setDiscoverRow(dVar);
                }
                return Unit.f26487a;
            case 5:
                fn.c cVar2 = (fn.c) obj2;
                List list = (List) obj;
                list.getClass();
                y80.a2 a2Var = cVar2.H;
                Boolean bool2 = Boolean.TRUE;
                a2Var.getClass();
                a2Var.k(null, bool2);
                cVar2.l(list);
                return Unit.f26487a;
            case 6:
                gq.b bVar = (gq.b) obj2;
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() < 1024) {
                    bVar.getClass();
                    y80.a2 a2Var2 = bVar.f20792f;
                    a2Var2.getClass();
                    a2Var2.k(null, str2);
                }
                return Unit.f26487a;
            case 7:
                Boolean bool3 = (Boolean) obj;
                pg.q3 q3Var2 = ((TrackingConsentActivity) obj2).f9337f;
                if (q3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    q3Var = q3Var2;
                }
                SwitchCompat switchCompat = q3Var.f35084u;
                bool3.getClass();
                switchCompat.setChecked(bool3.booleanValue());
                return Unit.f26487a;
            case 8:
                ((kotlin.collections.t) ((androidx.lifecycle.n1) obj2).f3503e).addLast(obj);
                return Unit.f26487a;
            case 9:
                ((kotlin.collections.t) ((zw.q2) obj2).f48338f).addLast(obj);
                return Unit.f26487a;
            case 10:
                return new a3.v0((h2.i0) obj2, 7);
            case 11:
                return new a3.v0((h2.u0) obj2, 9);
            case 12:
                y3.e eVar = (y3.e) obj2;
                return Boolean.valueOf(eVar != null ? eVar.a(obj) : true);
            case 13:
                return MessageLoadMoreAdapterDelegate.ViewHolder.bind$lambda$2$lambda$1((MessageLogEntry.LoadMore) obj2, (LoadMoreState) obj);
            case 14:
                cv.e eVar2 = (cv.e) obj;
                int i12 = hq.c.f22343r;
                eVar2.getClass();
                Function1 function1 = ((hq.c) obj2).f22354q;
                if (function1 != null) {
                    function1.invoke(eVar2);
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                String str3 = (String) obj;
                int i13 = DiscoverNotLiveHereView.f9271m;
                str3.getClass();
                Function1 function12 = ((DiscoverNotLiveHereView) obj2).l;
                if (function12 != null) {
                    function12.invoke(str3);
                }
                return Unit.f26487a;
            case 16:
                String str4 = (String) obj;
                int i14 = hq.r.f22399h;
                str4.getClass();
                Function1 function13 = ((hq.r) obj2).f22402f;
                if (function13 != null) {
                    function13.invoke(str4);
                }
                return Unit.f26487a;
            case 17:
                List list2 = (List) obj;
                int i15 = hq.u.f22406h;
                list2.getClass();
                ((hq.u) obj2).f22407f.invoke(list2);
                return Unit.f26487a;
            case 18:
                Integer num = (Integer) obj;
                num.getClass();
                Function1 function14 = ((RatingCardComposeView) obj2).l;
                if (function14 != null) {
                    function14.invoke(num);
                }
                return Unit.f26487a;
            case 19:
                return hq.w.c((hq.w) obj2, ((Integer) obj).intValue());
            case 20:
                hv.j jVar2 = (hv.j) obj2;
                ((Throwable) obj).getClass();
                Zendesk.Companion companion = Zendesk.INSTANCE;
                companion.invalidate();
                jVar2.e();
                hv.g gVar = jVar2.f22538j;
                if (gVar != null) {
                    companion.getInstance().removeEventListener(gVar);
                }
                jVar2.f22538j = null;
                jVar2.f22537i.set(false);
                return Unit.f26487a;
            case 21:
                f0.o oVar = (f0.o) obj;
                oVar.getClass();
                Iterator it = ((Map) obj2).entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!CollectionsKt.I((List) entry.getValue(), oVar.c((CaptureResult.Key) entry.getKey()))) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 22:
                return ((m0.w) obj2).f28627m;
            case 23:
                float fFloatValue = ((Float) obj).floatValue();
                i2.e0 e0Var = ((i2.i0) obj2).f22864b;
                e0Var.f22836s.i(e0Var.k(e0Var.l() + j80.c.b(e0Var.q() != 0 ? fFloatValue / e0Var.q() : 0.0f)));
                return Unit.f26487a;
            case 24:
                return new a3.v0((ea) obj2, 10);
            case 25:
                j5.b0 b0Var = (j5.b0) obj;
                b0Var.getClass();
                int i16 = PantryCheckboxKt.WhenMappings.$EnumSwitchMapping$0[((l5.a) obj2).ordinal()];
                if (i16 == 1) {
                    str = "ticked";
                } else if (i16 == 2) {
                    str = "not ticked";
                } else {
                    if (i16 != 3) {
                        e40.a.f();
                        return null;
                    }
                    str = "indeterminate";
                }
                j5.z.o(str, b0Var);
                return Unit.f26487a;
            case 26:
                g9.f0 f0VarM = android.support.v4.media.session.a.m((Context) obj2);
                f0VarM.j((Bundle) obj);
                return f0VarM;
            case 27:
                i90.d dVar2 = (i90.d) obj2;
                k90.a aVar = (k90.a) obj;
                aVar.getClass();
                o30.f0.R(StringCompanionObject.INSTANCE);
                k90.a.a(aVar, "type", m90.r1.f29849b);
                k90.a.a(aVar, "value", ox.h.p("kotlinx.serialization.Polymorphic<" + dVar2.f23585a.getSimpleName() + '>', k90.h.f26238j, new SerialDescriptor[0]));
                List list3 = dVar2.f23586b;
                list3.getClass();
                aVar.f26203b = list3;
                return Unit.f26487a;
            case 28:
                ik.b bVar2 = (ik.b) obj2;
                ek.o oVar2 = (ek.o) obj;
                oVar2.getClass();
                if (oVar2 instanceof ek.f) {
                    o30.e0.t(bVar2).c(R.id.action_questionFragment_to_answerFragment, null);
                } else if ((oVar2 instanceof ek.i) || (oVar2 instanceof ek.k) || (oVar2 instanceof ek.m)) {
                    o30.e0.t(bVar2).c(R.id.action_topicFragment_to_questionFragment, null);
                } else if (oVar2 instanceof ek.h) {
                    wr.g gVar2 = ((ek.h) oVar2).f16056a;
                    gk.a aVar2 = bVar2.o().f16069e;
                    aVar2.getClass();
                    aVar2.f20529a.a(new f70.b(ContactUsActivity.class, jb.u.x(new Pair("ENTRY_DATA", gVar2)), false, false, false, 1000, null, null, null, false, 988));
                } else if (oVar2 instanceof ek.n) {
                    ek.n nVar2 = (ek.n) oVar2;
                    ct.a aVar3 = nVar2.f16063a;
                    String str5 = nVar2.f16064b;
                    ek.q qVarO = bVar2.o();
                    Integer numValueOf = Integer.valueOf(R.string.webview_careers_title);
                    aVar3.getClass();
                    at.c0.c(qVarO.f16070f, str5, aVar3, numValueOf, false, 24);
                } else if (oVar2 instanceof ek.g) {
                    ek.q qVarO2 = bVar2.o();
                    Order order = ((ek.g) oVar2).f16055a;
                    qVarO2.f16069e.f20529a.a(new f70.b(CharityContactUsActivity.class, jb.u.x(new Pair("ORDER_ID", order != null ? order.m429getOrderIdreIZeYA() : null)), false, false, false, null, null, null, null, false, 1020));
                } else if (oVar2 instanceof ek.j) {
                    String str6 = ((ek.j) oVar2).f16057a;
                    gk.a aVar4 = bVar2.o().f16069e;
                    aVar4.getClass();
                    aVar4.f20529a.a(new f70.o(Uri.parse(str6)));
                } else if (Intrinsics.areEqual(oVar2, ek.l.f16058a)) {
                    bVar2.o().f16069e.f20529a.a(new f70.b(OrderListActivity.class, null, false, false, false, 1000, null, null, null, false, 990));
                } else if (Intrinsics.areEqual(oVar2, ek.l.f16059b)) {
                    bVar2.o().f16069e.f20529a.a(new f70.b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                } else if (Intrinsics.areEqual(oVar2, ek.l.f16061d)) {
                    ik.b.p(bVar2, 3);
                } else if (Intrinsics.areEqual(oVar2, ek.l.f16062e)) {
                    ik.b.p(bVar2, 2);
                } else {
                    if (!Intrinsics.areEqual(oVar2, ek.l.f16060c)) {
                        e40.a.f();
                        return null;
                    }
                    ik.b.p(bVar2, 1);
                }
                return Unit.f26487a;
            default:
                Activity activity = (Activity) obj2;
                String str7 = (String) obj;
                str7.getClass();
                if (activity != null) {
                    Toast.makeText(activity, str7, 0).show();
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ q9(Object obj, int i11) {
        this.f19370a = i11;
        this.f19371b = obj;
    }
}
