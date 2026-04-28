package a3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.app.tgtg.R;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.main.fragments.delivery.basket.ui.ParcelBasketActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.braze.BrazeUser;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.brazeactions.steps.SetCustomUserAttributeStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import m3.b1;
import m3.s;
import org.bouncycastle.iana.AEADAlgorithm;
import w.a0;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f506c;

    public /* synthetic */ p(r rVar, q1.k0 k0Var, i0 i0Var) {
        this.f504a = 0;
        this.f505b = k0Var;
        this.f506c = i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i11;
        int i12;
        String string;
        LayoutInflater layoutInflaterFrom;
        int i13 = 7;
        int i14 = 6;
        int i15 = 5;
        int i16 = 8;
        int i17 = 2;
        int i18 = 3;
        int i19 = 4;
        x70.c cVar = null;
        final int i21 = 0;
        final int i22 = 1;
        switch (this.f504a) {
            case 0:
                f0 f0Var = (f0) obj;
                r.m((q1.k0) this.f505b, (i0) this.f506c, f0Var, 0, f0Var.f342f.f29617a.f29603a.f29538b.length());
                return Unit.f26487a;
            case 1:
                v80.f0.B((v80.b0) this.f505b, null, v80.d0.UNDISPATCHED, new x((c5.t1) this.f506c, (m5.h) obj, cVar, i22), 1);
                return Unit.f26487a;
            case 2:
                j2 j2Var = (j2) this.f505b;
                Function1 function1 = (Function1) this.f506c;
                i0 i0Var = (i0) obj;
                j2Var.l(i0Var);
                function1.invoke(i0Var);
                return Unit.f26487a;
            case 3:
                j2 j2Var2 = (j2) this.f505b;
                Context context = (Context) this.f506c;
                o2.a aVar = (o2.a) obj;
                aVar.a();
                m2.g0.D(aVar, context.getResources(), m2.j1.Copy, j2Var2.h(), new q2(new n0(j2Var2, i15), null, 0));
                m2.j1 j1Var = m2.j1.SelectAll;
                s2 s2Var = j2Var2.f402a;
                ArrayList arrayListC = s2Var.c(j2Var2.j());
                if (arrayListC.isEmpty()) {
                    i12 = i22;
                } else {
                    int size = arrayListC.size();
                    int i23 = 0;
                    while (i23 < size) {
                        s sVar = (s) arrayListC.get(i23);
                        m5.h hVarD = sVar.d();
                        if (hVarD.f29538b.length() == 0) {
                            i11 = i22;
                        } else {
                            i11 = i22;
                            i0 i0Var2 = (i0) s2Var.a().b(sVar.f549a);
                            if (i0Var2 == null || Math.abs(i0Var2.f385a.f367b - i0Var2.f386b.f367b) != hVarD.f29538b.length()) {
                                i12 = 0;
                            }
                        }
                        i23++;
                        i22 = i11;
                    }
                    i12 = i22;
                }
                m2.g0.D(aVar, context.getResources(), j1Var, i12 ^ 1, new q2(new n0(j2Var2, i13), new n0(j2Var2, i14), 0));
                aVar.a();
                return Unit.f26487a;
            case 4:
                final xg.b0 b0Var = (xg.b0) this.f505b;
                final se.b bVar = (se.b) this.f506c;
                g9.c0 c0Var = (g9.c0) obj;
                c0Var.getClass();
                u3.d dVar = new u3.d(new i80.o() { // from class: ah.d
                    @Override // i80.o
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i24 = i21;
                        m3.n nVar = (m3.n) obj4;
                        a0.A((Integer) obj5, (s1.l) obj2, (g9.l) obj3);
                        switch (i24) {
                            case 0:
                                ex.i.e(null, b0Var, bVar, nVar, 0);
                                break;
                            default:
                                dx.f.b(null, b0Var, bVar, nVar, 0);
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, true, 759995741);
                kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                o0Var.getClass();
                kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
                zz.f.l(c0Var, Reflection.getOrCreateKotlinClass(ah.g.class), o0Var, n0Var, null, null, null, null, dVar);
                zz.f.l(c0Var, Reflection.getOrCreateKotlinClass(ah.f.class), o0Var, n0Var, null, null, null, null, new u3.d(new i80.o() { // from class: ah.d
                    @Override // i80.o
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i24 = i22;
                        m3.n nVar = (m3.n) obj4;
                        a0.A((Integer) obj5, (s1.l) obj2, (g9.l) obj3);
                        switch (i24) {
                            case 0:
                                ex.i.e(null, b0Var, bVar, nVar, 0);
                                break;
                            default:
                                dx.f.b(null, b0Var, bVar, nVar, 0);
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, true, -1960467130));
                zz.f.l(c0Var, Reflection.getOrCreateKotlinClass(ah.h.class), o0Var, n0Var, null, null, null, null, ah.l.f1471a);
                return Unit.f26487a;
            case 5:
                ak.b bVar2 = (ak.b) this.f505b;
                FlashSalesItem flashSalesItem = (FlashSalesItem) this.f506c;
                ((View) obj).getClass();
                ((x0) bVar2.f1512c).invoke(flashSalesItem);
                return Unit.f26487a;
            case 6:
                m2.b2 b2Var = (m2.b2) this.f505b;
                al.p pVar = (al.p) this.f506c;
                ((Integer) obj).getClass();
                b2Var.invoke();
                pVar.f1575n.c(f70.i.DEEP_LINK);
                return Unit.f26487a;
            case 7:
                final ap.n nVar = (ap.n) this.f505b;
                final Activity activity = (Activity) this.f506c;
                g9.c0 c0Var2 = (g9.c0) obj;
                c0Var2.getClass();
                u3.d dVar2 = new u3.d(new i80.o() { // from class: ap.c
                    @Override // i80.o
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        switch (i22) {
                            case 0:
                                m3.n nVar2 = (m3.n) obj4;
                                ((Integer) obj5).getClass();
                                ((s1.l) obj2).getClass();
                                ((g9.l) obj3).getClass();
                                n nVar3 = nVar;
                                b1 b1VarN = m3.i.n(nVar3.Q, nVar2, 0);
                                boolean zBooleanValue = ((Boolean) b1VarN.getValue()).booleanValue();
                                boolean zI = nVar3.i(((Boolean) b1VarN.getValue()).booleanValue());
                                h1 h1Var = nVar3.O;
                                s sVar2 = (s) nVar2;
                                boolean zH = sVar2.h(nVar3) | sVar2.f(b1VarN);
                                Activity activity2 = activity;
                                boolean zH2 = zH | sVar2.h(activity2);
                                Object objM = sVar2.M();
                                m3.f fVar = m3.m.f29332a;
                                if (zH2 || objM == fVar) {
                                    objM = new a0.g(nVar3, activity2, b1VarN, 3);
                                    sVar2.k0(objM);
                                }
                                Function0 function0 = (Function0) objM;
                                boolean zH3 = sVar2.h(activity2);
                                Object objM2 = sVar2.M();
                                if (zH3 || objM2 == fVar) {
                                    objM2 = new f(activity2, 0);
                                    sVar2.k0(objM2);
                                }
                                Function0 function02 = (Function0) objM2;
                                boolean zH4 = sVar2.h(nVar3) | sVar2.f(b1VarN);
                                Object objM3 = sVar2.M();
                                if (zH4 || objM3 == fVar) {
                                    objM3 = new g(nVar3, b1VarN, 0);
                                    sVar2.k0(objM3);
                                }
                                Function0 function03 = (Function0) objM3;
                                boolean zH5 = sVar2.h(nVar3);
                                Object objM4 = sVar2.M();
                                if (zH5 || objM4 == fVar) {
                                    objM4 = new h(nVar3, 0);
                                    sVar2.k0(objM4);
                                }
                                Function0 function04 = (Function0) objM4;
                                boolean zH6 = sVar2.h(activity2);
                                Object objM5 = sVar2.M();
                                if (zH6 || objM5 == fVar) {
                                    objM5 = new f(activity2, 1);
                                    sVar2.k0(objM5);
                                }
                                ba0.g.f(zBooleanValue, zI, h1Var, function0, function02, function03, function04, (Function0) objM5, sVar2, 0);
                                boolean zH7 = sVar2.h(activity2);
                                Object objM6 = sVar2.M();
                                if (zH7 || objM6 == fVar) {
                                    objM6 = new f(activity2, 2);
                                    sVar2.k0(objM6);
                                }
                                jf.e.a(false, (Function0) objM6, sVar2, 0, 1);
                                break;
                            default:
                                m3.n nVar4 = (m3.n) obj4;
                                a0.A((Integer) obj5, (s1.l) obj2, (g9.l) obj3);
                                n nVar5 = nVar;
                                android.support.v4.media.session.a.f(nVar5, nVar4, 0);
                                s sVar3 = (s) nVar4;
                                boolean zH8 = sVar3.h(nVar5);
                                Activity activity3 = activity;
                                boolean zH9 = zH8 | sVar3.h(activity3);
                                Object objM7 = sVar3.M();
                                if (zH9 || objM7 == m3.m.f29332a) {
                                    objM7 = new i(nVar5, activity3, 0);
                                    sVar3.k0(objM7);
                                }
                                jf.e.a(false, (Function0) objM7, sVar3, 0, 1);
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, true, 1262412982);
                kotlin.collections.o0 o0Var2 = kotlin.collections.o0.f26530a;
                o0Var2.getClass();
                kotlin.collections.n0 n0Var2 = kotlin.collections.n0.f26529a;
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.h.class), o0Var2, n0Var2, null, null, null, null, dVar2);
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.g.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new ap.d(nVar, i21), true, -2051161569));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.i.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new ap.d(nVar, i22), true, 2002108414));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.k.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new ap.d(nVar, i17), true, 1760411101));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.j.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new ap.d(nVar, i18), true, 1518713788));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.n.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new ap.d(nVar, i19), true, 1277016475));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.p.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new ap.d(nVar, i15), true, 1035319162));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.o.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new ap.d(nVar, i14), true, 793621849));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.e.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new ap.d(nVar, i13), true, 551924536));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.l.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new ap.d(nVar, i16), true, 310227223));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.c.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new ap.d(nVar, 9), true, 376602633));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.f.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new ap.d(nVar, 10), true, 134905320));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.q.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new ap.d(nVar, 11), true, -106791993));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(bp.m.class), o0Var2, n0Var2, nv.b.f31404e, nv.b.f31401b, nv.b.f31402c, nv.b.f31403d, new u3.d(new i80.o() { // from class: ap.c
                    @Override // i80.o
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        switch (i21) {
                            case 0:
                                m3.n nVar2 = (m3.n) obj4;
                                ((Integer) obj5).getClass();
                                ((s1.l) obj2).getClass();
                                ((g9.l) obj3).getClass();
                                n nVar3 = nVar;
                                b1 b1VarN = m3.i.n(nVar3.Q, nVar2, 0);
                                boolean zBooleanValue = ((Boolean) b1VarN.getValue()).booleanValue();
                                boolean zI = nVar3.i(((Boolean) b1VarN.getValue()).booleanValue());
                                h1 h1Var = nVar3.O;
                                s sVar2 = (s) nVar2;
                                boolean zH = sVar2.h(nVar3) | sVar2.f(b1VarN);
                                Activity activity2 = activity;
                                boolean zH2 = zH | sVar2.h(activity2);
                                Object objM = sVar2.M();
                                m3.f fVar = m3.m.f29332a;
                                if (zH2 || objM == fVar) {
                                    objM = new a0.g(nVar3, activity2, b1VarN, 3);
                                    sVar2.k0(objM);
                                }
                                Function0 function0 = (Function0) objM;
                                boolean zH3 = sVar2.h(activity2);
                                Object objM2 = sVar2.M();
                                if (zH3 || objM2 == fVar) {
                                    objM2 = new f(activity2, 0);
                                    sVar2.k0(objM2);
                                }
                                Function0 function02 = (Function0) objM2;
                                boolean zH4 = sVar2.h(nVar3) | sVar2.f(b1VarN);
                                Object objM3 = sVar2.M();
                                if (zH4 || objM3 == fVar) {
                                    objM3 = new g(nVar3, b1VarN, 0);
                                    sVar2.k0(objM3);
                                }
                                Function0 function03 = (Function0) objM3;
                                boolean zH5 = sVar2.h(nVar3);
                                Object objM4 = sVar2.M();
                                if (zH5 || objM4 == fVar) {
                                    objM4 = new h(nVar3, 0);
                                    sVar2.k0(objM4);
                                }
                                Function0 function04 = (Function0) objM4;
                                boolean zH6 = sVar2.h(activity2);
                                Object objM5 = sVar2.M();
                                if (zH6 || objM5 == fVar) {
                                    objM5 = new f(activity2, 1);
                                    sVar2.k0(objM5);
                                }
                                ba0.g.f(zBooleanValue, zI, h1Var, function0, function02, function03, function04, (Function0) objM5, sVar2, 0);
                                boolean zH7 = sVar2.h(activity2);
                                Object objM6 = sVar2.M();
                                if (zH7 || objM6 == fVar) {
                                    objM6 = new f(activity2, 2);
                                    sVar2.k0(objM6);
                                }
                                jf.e.a(false, (Function0) objM6, sVar2, 0, 1);
                                break;
                            default:
                                m3.n nVar4 = (m3.n) obj4;
                                a0.A((Integer) obj5, (s1.l) obj2, (g9.l) obj3);
                                n nVar5 = nVar;
                                android.support.v4.media.session.a.f(nVar5, nVar4, 0);
                                s sVar3 = (s) nVar4;
                                boolean zH8 = sVar3.h(nVar5);
                                Activity activity3 = activity;
                                boolean zH9 = zH8 | sVar3.h(activity3);
                                Object objM7 = sVar3.M();
                                if (zH9 || objM7 == m3.m.f29332a) {
                                    objM7 = new i(nVar5, activity3, 0);
                                    sVar3.k0(objM7);
                                }
                                jf.e.a(false, (Function0) objM7, sVar3, 0, 1);
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, true, -348489306));
                return Unit.f26487a;
            case 8:
                List list = (List) this.f505b;
                b0.w1 w1Var = (b0.w1) this.f506c;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((v80.q) it.next()).h0(th2);
                    }
                } else {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((v80.q) it2.next()).R(Unit.f26487a);
                    }
                }
                synchronized (w1Var.f5470d) {
                    w1Var.f5472f.removeAll(list);
                }
                return Unit.f26487a;
            case 9:
                b0.e3 e3Var = (b0.e3) this.f505b;
                v80.s1 s1Var = (v80.s1) this.f506c;
                synchronized (e3Var.f5157k) {
                    e3Var.f5168w.remove(s1Var);
                }
                return Unit.f26487a;
            case 10:
                bg.k0 k0Var = (bg.k0) this.f505b;
                PopupWindow popupWindow = (PopupWindow) this.f506c;
                ((View) obj).getClass();
                y.a aVar2 = k0Var.f6181m;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                popupWindow.dismiss();
                return Unit.f26487a;
            case 11:
                bg.b1 b1Var = (bg.b1) this.f505b;
                String str = (String) this.f506c;
                ((View) obj).getClass();
                if (b1Var.requireArguments().containsKey("name")) {
                    String string2 = b1Var.requireContext().getString(b1Var.requireArguments().getInt("name"));
                    string2.getClass();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string3 = b1Var.getString(R.string.waiting_third_party_popup_description);
                    string3.getClass();
                    string = String.format(string3, Arrays.copyOf(new Object[]{string2}, 1));
                } else {
                    string = b1Var.getString(R.string.waiting_third_party_popup_description);
                    string.getClass();
                }
                bg.k0 k0Var2 = new bg.k0(b1Var.requireActivity());
                View viewRequireView = b1Var.requireView();
                viewRequireView.getClass();
                k0Var2.f6184p = viewRequireView;
                k0Var2.f6180k = true;
                k0Var2.e(R.string.waiting_third_party_popup_title);
                k0Var2.f6172c = string;
                k0Var2.c(R.string.waiting_third_party_popup_positive_btn);
                k0Var2.l = new bg.a(i19);
                k0Var2.b(R.string.waiting_third_party_popup_negative_btn);
                k0Var2.f6182n = new n2(27, b1Var, str);
                k0Var2.f();
                return Unit.f26487a;
            case 12:
                StoreInformation storeInformation = (StoreInformation) this.f505b;
                bq.b bVar3 = (bq.b) this.f506c;
                int i24 = bq.b.f6578c;
                ((View) obj).getClass();
                String website = storeInformation.getWebsite();
                if (website != null) {
                    Uri uriBuild = Uri.parse(website);
                    String scheme = uriBuild.getScheme();
                    if (scheme == null || scheme.length() == 0) {
                        uriBuild = uriBuild.buildUpon().scheme("http").build();
                        uriBuild.getClass();
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
                    Context context2 = bVar3.getContext();
                    context2.getClass();
                    ((Activity) context2).startActivity(intent);
                }
                return Unit.f26487a;
            case 13:
                br.g gVar = (br.g) this.f505b;
                br.i iVar = (br.i) this.f506c;
                long jLongValue = ((Long) obj).longValue() - System.currentTimeMillis();
                v80.b2 b2Var2 = gVar.f6624c;
                if (b2Var2 != null && b2Var2.g()) {
                    v80.b2 b2Var3 = gVar.f6624c;
                    if (b2Var3 != null) {
                        b2Var3.a(null);
                    }
                    gVar.f6624c = null;
                }
                if (jLongValue > 0) {
                    gVar.f6624c = mv.d.v(gVar.f6623b, jLongValue, new aa.e(iVar, 18), new aa.l0(gVar, cVar, i16), 2);
                }
                return Unit.f26487a;
            case 14:
                HiddenStoresActivity hiddenStoresActivity = (HiddenStoresActivity) this.f505b;
                pg.x0 x0Var = (pg.x0) this.f506c;
                int i25 = HiddenStoresActivity.f9412k;
                ((View) obj).getClass();
                String string4 = StringsKt.e0(((EditText) x0Var.f35266g).getText().toString()).toString();
                if (string4.length() > 0) {
                    pg.x0 x0Var2 = hiddenStoresActivity.f9416e;
                    if (x0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        x0Var2 = null;
                    }
                    ((TGTGLoadingView) x0Var2.f35269j).setVisibility(0);
                    bs.o oVarA = hiddenStoresActivity.A();
                    v80.f0.B(androidx.lifecycle.m1.d(oVarA), null, null, new x(oVarA, string4, cVar, 19), 3);
                } else {
                    hiddenStoresActivity.D();
                }
                mv.r0.p(hiddenStoresActivity);
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Fragment fragment = (Fragment) this.f505b;
                i80.n nVar2 = (i80.n) this.f506c;
                Context context3 = (Context) obj;
                if (fragment == null || (layoutInflaterFrom = fragment.getLayoutInflater()) == null) {
                    layoutInflaterFrom = LayoutInflater.from(context3);
                }
                sa.a aVar3 = (sa.a) nVar2.invoke(layoutInflaterFrom, new FrameLayout(context3), Boolean.FALSE);
                View root = aVar3.getRoot();
                root.setTag(R.id.binding_reference, aVar3);
                return root;
            case 16:
                m3.g1 g1Var = (m3.g1) this.f505b;
                m3.g1 g1Var2 = (m3.g1) this.f506c;
                ((z4.z) obj).getClass();
                g1Var.i((int) (r3.u() >> 32));
                g1Var2.i((int) (r3.u() & 4294967295L));
                return Unit.f26487a;
            case 17:
                return UserJavascriptInterfaceBase.incrementCustomUserAttribute$lambda$24((String) this.f505b, (Integer) this.f506c, (BrazeUser) obj);
            case 18:
                return UserJavascriptInterfaceBase.setCustomUserAttributeArray$lambda$20((String) this.f505b, (String[]) this.f506c, (BrazeUser) obj);
            case 19:
                return SetCustomUserAttributeStep.run$lambda$1((StepData) this.f505b, this.f506c, (BrazeUser) obj);
            case 20:
                return Boolean.valueOf(BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57$lambda$56((BrazeInAppMessageManager) this.f505b, (String) this.f506c, (IInAppMessage) obj));
            case 21:
                d2.s1 s1Var2 = (d2.s1) this.f505b;
                z4.m1 m1Var = (z4.m1) this.f506c;
                z4.l1 l1Var = (z4.l1) obj;
                boolean z11 = s1Var2.f13926q;
                float f11 = s1Var2.f13924o;
                if (z11) {
                    z4.l1.o(l1Var, m1Var, l1Var.q0(f11), l1Var.q0(s1Var2.f13925p));
                } else {
                    l1Var.j(m1Var, l1Var.q0(f11), l1Var.q0(s1Var2.f13925p), 0.0f);
                }
                return Unit.f26487a;
            case 22:
                d2.u1 u1Var = (d2.u1) this.f505b;
                z4.m1 m1Var2 = (z4.m1) this.f506c;
                z4.l1 l1Var2 = (z4.l1) obj;
                long j9 = ((z5.j) u1Var.f13941o.invoke(l1Var2)).f47280a;
                if (u1Var.f13942p) {
                    z4.l1.p(l1Var2, m1Var2, (int) (j9 >> 32), (int) (j9 & 4294967295L));
                } else {
                    z4.l1.v(l1Var2, m1Var2, (int) (j9 >> 32), (int) (j9 & 4294967295L), null, 12);
                }
                return Unit.f26487a;
            case 23:
                d2.y1 y1Var = (d2.y1) this.f505b;
                z4.m1 m1Var3 = (z4.m1) this.f506c;
                z4.l1 l1Var3 = (z4.l1) obj;
                boolean z12 = y1Var.f13979s;
                float f12 = y1Var.f13975o;
                if (z12) {
                    z4.l1.o(l1Var3, m1Var3, l1Var3.q0(f12), l1Var3.q0(y1Var.f13976p));
                } else {
                    l1Var3.j(m1Var3, l1Var3.q0(f12), l1Var3.q0(y1Var.f13976p), 0.0f);
                }
                return Unit.f26487a;
            case 24:
                d2.z2 z2Var = (d2.z2) this.f505b;
                View view = (View) this.f506c;
                z2Var.a(view);
                return new c5.s0(i17, z2Var, view);
            case 25:
                File file = (File) this.f505b;
                x80.u uVar = (x80.u) this.f506c;
                if (Intrinsics.areEqual((String) obj, file.getName())) {
                    o00.x0.H(uVar, Unit.f26487a);
                }
                return Unit.f26487a;
            case 26:
                dn.f fVar = (dn.f) this.f505b;
                androidx.fragment.app.o0 o0Var3 = (androidx.fragment.app.o0) this.f506c;
                ((View) obj).getClass();
                ym.w wVar = fVar.f14995b;
                if (!o0Var3.isFinishing()) {
                    if (wVar.f46254b.n().getShowManufacturerItems()) {
                        ag.l lVar = new ag.l(o0Var3, wVar.f46267p, f70.i.SCREEN_DELIVERY);
                        if (!bx.o.M(lVar)) {
                            bx.o.Q(lVar, new Intent(o0Var3, (Class<?>) ParcelBasketActivity.class), ItemId.m198constructorimpl("-1"));
                        }
                    } else {
                        new mv.a0().c(o0Var3);
                    }
                }
                return Unit.f26487a;
            case 27:
                ap.n nVar3 = (ap.n) this.f505b;
                Uri uri = (Uri) this.f506c;
                if (((Boolean) obj).booleanValue()) {
                    uri.getClass();
                    nVar3.g(uri);
                }
                return Unit.f26487a;
            case 28:
                f.b bVar4 = (f.b) this.f505b;
                e.g gVar2 = (e.g) this.f506c;
                bVar4.a(gVar2);
                return new c5.s0(i18, bVar4, gVar2);
            default:
                f.b bVar5 = (f.b) this.f505b;
                e.j jVar = (e.j) this.f506c;
                bVar5.a(jVar);
                return new c5.s0(i19, bVar5, jVar);
        }
    }

    public /* synthetic */ p(int i11, Object obj, Object obj2) {
        this.f504a = i11;
        this.f505b = obj;
        this.f506c = obj2;
    }
}
