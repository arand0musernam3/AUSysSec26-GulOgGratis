package b0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.camera.core.ImageCaptureException;
import androidx.lifecycle.LifecycleOwner;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import com.app.tgtg.model.remote.badge.BadgeCollection;
import com.app.tgtg.model.remote.item.CharityItemInformation;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.braze.storage.ICardStorageProvider;
import g3.w6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONArray;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.messaging.android.internal.UriHandler;
import zendesk.messaging.android.internal.conversationscreen.delegates.FileMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.ImageMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5489e;

    public /* synthetic */ x1(z5.c cVar, Function1 function1, m3.b1 b1Var, m3.b1 b1Var2) {
        this.f5485a = 29;
        float f11 = lv.t.f28247a;
        this.f5486b = cVar;
        this.f5487c = function1;
        this.f5488d = b1Var;
        this.f5489e = b1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [z4.w1] */
    /* JADX WARN: Type inference failed for: r14v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r4v48, types: [T, java.lang.Object, r5.d0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iB;
        int iB2;
        String strM370getStoreId7QsYvu8;
        CharityItemInformation information;
        ItemCategory itemCategory;
        StoreInformation storeInformationM;
        CharityItemInformation information2;
        long j9;
        int i11 = 5;
        int i12 = 23;
        int i13 = 4;
        int i14 = 20;
        int i15 = 2;
        ?? r14 = 0;
        int i16 = 3;
        int i17 = 1;
        switch (this.f5485a) {
            case 0:
                d2 d2Var = (d2) this.f5486b;
                v80.i0 i0Var = (v80.i0) this.f5487c;
                y1 y1Var = (y1) this.f5488d;
                o2 o2Var = (o2) this.f5489e;
                Throwable th2 = (Throwable) obj;
                if ((th2 instanceof ImageCaptureException) && ((ImageCaptureException) th2).f2215a == 3) {
                    v80.f0.B(d2Var.f5120b.f5270f, null, null, new a2(d2Var, o2Var, y1Var, null), 3);
                } else {
                    v80.q qVar = y1Var.f5513d;
                    i0Var.getClass();
                    if (th2 == null) {
                        qVar.R(i0Var.p());
                    } else if (th2 instanceof CancellationException) {
                        qVar.r((CancellationException) th2);
                    } else {
                        qVar.h0(th2);
                    }
                }
                return Unit.f26487a;
            case 1:
                m3.b1 b1Var = (m3.b1) this.f5486b;
                m3.g1 g1Var = (m3.g1) this.f5487c;
                m3.g1 g1Var2 = (m3.g1) this.f5488d;
                m3.c3 c3Var = (m3.c3) this.f5489e;
                ((z5.c) obj).getClass();
                if (p30.b.b(b1Var)) {
                    iB = j80.c.b(g1Var.h());
                    iB2 = j80.c.b(g1Var2.h());
                } else {
                    iB = j80.c.b(((Number) c3Var.getValue()).floatValue());
                    iB2 = j80.c.b(g1Var2.h());
                }
                return new z5.j((((long) iB) << 32) | (((long) iB2) & 4294967295L));
            case 2:
                return com.braze.models.h.a((com.braze.managers.m0) this.f5486b, (ICardStorageProvider) this.f5487c, (com.braze.analytics.b) this.f5488d, (JSONArray) this.f5489e, obj);
            case 3:
                WebView webView = (WebView) this.f5486b;
                at.g0 g0Var = (at.g0) this.f5487c;
                bt.b bVar = (bt.b) this.f5488d;
                a50.c cVar = (a50.c) this.f5489e;
                ((Context) obj).getClass();
                boolean z11 = g0Var.f4780d;
                boolean z12 = g0Var.f4781e;
                if (!z11) {
                    webView.setWebViewClient(bVar);
                    bVar.f6703c = cVar;
                    webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    WebSettings settings = webView.getSettings();
                    settings.setDomStorageEnabled(true);
                    settings.setJavaScriptEnabled(true);
                    settings.setLoadWithOverviewMode(true);
                    settings.setUseWideViewPort(true);
                    settings.setBuiltInZoomControls(z12);
                    settings.setSupportZoom(z12);
                    if (g0Var.f4782f) {
                        webView.clearCache(true);
                        webView.clearHistory();
                        CookieManager.getInstance().removeAllCookies(null);
                        CookieManager.getInstance().flush();
                    }
                    webView.loadUrl(g0Var.f4777a);
                }
                return webView;
            case 4:
                List list = (List) this.f5486b;
                Ref.IntRef intRef = (Ref.IntRef) this.f5487c;
                List list2 = (List) this.f5488d;
                g2.r rVar = (g2.r) this.f5489e;
                h2.n1 n1Var = (h2.n1) ((h2.y0) obj);
                z4.w1 w1Var = n1Var.f21188e;
                int iB3 = w1Var != null ? w1Var.b() : 0;
                int iC = 0;
                while (r14 < iB3) {
                    z1.h2 h2Var = rVar.f18223q;
                    z1.h2 h2Var2 = z1.h2.Vertical;
                    ?? r11 = n1Var.f21188e;
                    iC += (int) (h2Var == h2Var2 ? (r11 != 0 ? r11.c(r14) : 0L) & 4294967295L : (r11 != 0 ? r11.c(r14) : 0L) >> 32);
                    r14++;
                }
                if (list != null) {
                    list.add(Integer.valueOf(iC));
                }
                if (intRef.element != list2.size()) {
                    intRef.element++;
                }
                return Unit.f26487a;
            case 5:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f5486b;
                f2.c0 c0Var = (f2.c0) this.f5487c;
                dn.k kVar = (dn.k) this.f5488d;
                z3.u uVar = (z3.u) this.f5489e;
                ((m3.l0) obj).getClass();
                gn.s sVar = new gn.s(c0Var, kVar, uVar, r14);
                lifecycleOwner.getLifecycle().a(sVar);
                return new c5.s0(5, lifecycleOwner, sVar);
            case 6:
                CharityOrderActivity charityOrderActivity = (CharityOrderActivity) this.f5486b;
                v80.b0 b0Var = (v80.b0) this.f5487c;
                w6 w6Var = (w6) this.f5488d;
                m3.b1 b1Var2 = (m3.b1) this.f5489e;
                ((Boolean) obj).getClass();
                int i18 = CharityOrderActivity.f9162o;
                ActivityResultLauncher activityResultLauncher = charityOrderActivity.f20777f;
                if (activityResultLauncher == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("requestPermissionLauncher");
                    activityResultLauncher = null;
                }
                mv.d.c(charityOrderActivity, activityResultLauncher, new go.f(b0Var, w6Var, b1Var2, i17), new go.d(charityOrderActivity, i17));
                return Unit.f26487a;
            case 7:
                return FileMessageContainerAdapterDelegate.ViewHolder.createFileImageUploadCell$lambda$13$lambda$12$lambda$11((MessageLogEntry.FileMessageContainer) this.f5486b, (Function1) this.f5487c, (UriHandler) this.f5488d, (MessageContent.FileUpload) this.f5489e, (String) obj);
            case 8:
                return ImageMessageContainerAdapterDelegate.ViewHolder.createImageCell$lambda$11$lambda$10$lambda$6((MessageLogEntry.ImageMessageContainer) this.f5486b, (UriHandler) this.f5487c, (MessageContent.Image) this.f5488d, (Function1) this.f5489e, (String) obj);
            case 9:
                ir.h hVar = (ir.h) this.f5486b;
                Activity activity = (Activity) this.f5487c;
                cj.e0 e0Var = (cj.e0) this.f5488d;
                g9.f0 f0Var = (g9.f0) this.f5489e;
                g9.c0 c0Var2 = (g9.c0) obj;
                c0Var2.getClass();
                u3.d dVar = new u3.d(new dp.s(3, hVar, activity, e0Var, f0Var), true, -926456495);
                kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                o0Var.getClass();
                kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(qr.a.class), o0Var, n0Var, null, null, null, null, dVar);
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(qr.b.class), o0Var, n0Var, null, null, null, null, new u3.d(new dm.e(i15, e0Var, f0Var), true, 326058490));
                return Unit.f26487a;
            case 10:
                hs.h hVar2 = (hs.h) this.f5486b;
                Function1 function1 = (Function1) this.f5487c;
                m3.b1 b1Var3 = (m3.b1) this.f5488d;
                m3.b1 b1Var4 = (m3.b1) this.f5489e;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                String email = hVar2.f22472a.m().getEmail();
                if (email == null || email.length() <= 0) {
                    b1Var3.setValue(Boolean.FALSE);
                    function1.invoke(Boolean.TRUE);
                } else {
                    b1Var3.setValue(bool);
                    hVar2.f22481j = zBooleanValue;
                    z.m(b1Var4, hVar2.c());
                }
                return Unit.f26487a;
            case 11:
                Function0 function0 = (Function0) this.f5486b;
                hs.h hVar3 = (hs.h) this.f5487c;
                m3.b1 b1Var5 = (m3.b1) this.f5488d;
                m3.b1 b1Var6 = (m3.b1) this.f5489e;
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                if (((Boolean) function0.invoke()).booleanValue()) {
                    b1Var5.setValue(bool2);
                    hVar3.f22482k.setCalendarAlerts(zBooleanValue2);
                    z.m(b1Var6, hVar3.c());
                }
                return Unit.f26487a;
            case 12:
                gh.l lVar = (gh.l) this.f5486b;
                ih.i iVar = (ih.i) this.f5487c;
                Function1 function12 = (Function1) this.f5488d;
                Function0 function02 = (Function0) this.f5489e;
                g2.i iVar2 = (g2.i) obj;
                iVar2.getClass();
                g2.i.p(iVar2, new im.a(15), new u3.d(new cn.x(8, lVar, iVar, function12, function02), true, 1205453670));
                List<BadgeCollection> list3 = lVar.f20459b;
                for (BadgeCollection badgeCollection : list3) {
                    if (badgeCollection.getTitle() != null) {
                        g2.i.p(iVar2, new im.a(16), new u3.d(new a3.m2(badgeCollection, 13), true, -136177134));
                    }
                    g2.i.q(iVar2, badgeCollection.getBadges().size(), new u3.d(new dm.e(i16, badgeCollection, function12), true, 1668884629));
                    if (!Intrinsics.areEqual(CollectionsKt.W(list3), badgeCollection)) {
                        g2.i.p(iVar2, new im.a(17), jh.f.f25261b);
                    }
                }
                return Unit.f26487a;
            case 13:
                ki.i iVar3 = (ki.i) this.f5486b;
                CharityItem charityItem = (CharityItem) this.f5487c;
                Context context = (Context) this.f5488d;
                Function0 function03 = (Function0) this.f5489e;
                if (((Boolean) obj).booleanValue()) {
                    ki.a aVar = new ki.a(3, function03);
                    iVar3.getClass();
                    iVar3.g(cv.i.ACTION_CONFIRM_DECLINE);
                    v80.f0.B(androidx.lifecycle.m1.d(iVar3), null, null, new gf.g(iVar3, aVar, null, i14), 3);
                } else {
                    yi.r rVarC = y00.d0.c(charityItem, "https://charity.toogoodtogo.com", null, new j4.d(10), 4);
                    context.getClass();
                    rVarC.show(((k.h) context).getSupportFragmentManager(), "CHECKOUT");
                    CharityItem charityItem2 = (CharityItem) iVar3.f26409i.getValue();
                    dv.b bVar2 = new dv.b();
                    bVar2.a(dv.a.IS_DONATION, Boolean.FALSE);
                    bVar2.a(dv.a.ITEM_ID, (charityItem2 == null || (information2 = charityItem2.getInformation()) == null) ? null : information2.mo340getItemIdFvU5WIY());
                    dv.a aVar2 = dv.a.STORE_ID;
                    if (charityItem2 == null || (storeInformationM = mv.d.m(charityItem2)) == null || (strM370getStoreId7QsYvu8 = storeInformationM.m370getStoreId7QsYvu8()) == null) {
                        strM370getStoreId7QsYvu8 = null;
                    }
                    bVar2.a(aVar2, strM370getStoreId7QsYvu8);
                    bVar2.a(dv.a.ITEM_TYPE, charityItem2 != null ? charityItem2.getItemType().name() : null);
                    bVar2.a(dv.a.ITEM_CATEGORY, (charityItem2 == null || (information = charityItem2.getInformation()) == null || (itemCategory = information.getItemCategory()) == null) ? null : itemCategory.name());
                    bVar2.a(dv.a.BASKET_ID, "");
                    if (!iVar3.f26405e.n().getUserHasPurchased()) {
                        bVar2.a(dv.a.FIRST_PURCHASE, Boolean.TRUE);
                    }
                    iVar3.d(cv.i.CORE_PURCHASE_STARTED, bVar2);
                }
                return Unit.f26487a;
            case 14:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) this.f5486b;
                l9.f fVar = (l9.f) this.f5487c;
                g9.z zVar = (g9.z) this.f5488d;
                Bundle bundle = (Bundle) this.f5489e;
                g9.l lVar2 = (g9.l) obj;
                lVar2.getClass();
                booleanRef.element = true;
                fVar.a(zVar, bundle, lVar2, kotlin.collections.n0.f26529a);
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                List list4 = (List) this.f5486b;
                Function1 function13 = (Function1) this.f5487c;
                Function1 function14 = (Function1) this.f5488d;
                Function0 function04 = (Function0) this.f5489e;
                f2.l lVar3 = (f2.l) obj;
                lVar3.getClass();
                f2.l.q(lVar3, null, lp.d.f28028m, 3);
                lVar3.r(list4.size(), null, new cn.n(list4, 12), new u3.d(new gn.p(list4, function13, function14, i16), true, 2039820996));
                f2.l.q(lVar3, null, new u3.d(new a3.u1(list4, function04, r14, i12), true, 287565580), 3);
                return Unit.f26487a;
            case 16:
                m2.e1 e1Var = (m2.e1) this.f5486b;
                r5.z zVar2 = (r5.z) this.f5487c;
                r5.y yVar = (r5.y) this.f5488d;
                r5.m mVar = (r5.m) this.f5489e;
                if (e1Var.b()) {
                    r5.h hVar4 = e1Var.f28821d;
                    m2.j0 j0Var = e1Var.f28838v;
                    m2.j0 j0Var2 = e1Var.f28839w;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    m2.h0 h0Var = new m2.h0(hVar4, j0Var, objectRef, i15);
                    r5.t tVar = zVar2.f37717a;
                    tVar.d(yVar, mVar, h0Var, j0Var2);
                    ?? d0Var = new r5.d0(zVar2, tVar);
                    zVar2.f37718b.set(d0Var);
                    objectRef.element = d0Var;
                    e1Var.f28822e = d0Var;
                }
                return new m2.p0();
            case 17:
                Set set = (Set) this.f5486b;
                Object obj2 = this.f5487c;
                Set set2 = (Set) this.f5488d;
                m3.b1 b1Var7 = (m3.b1) this.f5489e;
                set.add(obj2);
                return new n9.b(set, obj2, set2, b1Var7);
            case 18:
                SurpriseBagOrderActivity surpriseBagOrderActivity = (SurpriseBagOrderActivity) this.f5486b;
                v80.b0 b0Var2 = (v80.b0) this.f5487c;
                w6 w6Var2 = (w6) this.f5488d;
                m3.b1 b1Var8 = (m3.b1) this.f5489e;
                ((Boolean) obj).getClass();
                int i19 = SurpriseBagOrderActivity.f9178y;
                ActivityResultLauncher activityResultLauncher2 = surpriseBagOrderActivity.f20777f;
                if (activityResultLauncher2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("requestPermissionLauncher");
                    activityResultLauncher2 = null;
                }
                mv.d.c(surpriseBagOrderActivity, activityResultLauncher2, new go.f(b0Var2, w6Var2, b1Var8, i16), new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(16, surpriseBagOrderActivity, b0Var2, w6Var2, b1Var8));
                return Unit.f26487a;
            case 19:
                np.b bVar3 = (np.b) this.f5486b;
                Function0 function05 = (Function0) this.f5487c;
                String str = (String) this.f5488d;
                Function0 function06 = (Function0) this.f5489e;
                vg.b bVar4 = (vg.b) obj;
                bVar4.getClass();
                switch (np.e.$EnumSwitchMapping$1[bVar4.ordinal()]) {
                    case 1:
                        bVar3.f31327o.j(bVar3.f31325m.getValue());
                        function05.invoke();
                        break;
                    case 2:
                        cv.i iVar4 = cv.i.ACTION_LOCATION_ADDED;
                        Pair pair = new Pair(dv.a.SOURCE, new dv.c(str));
                        dv.a aVar3 = dv.a.TYPE;
                        dv.d dVar2 = dv.d.STATIONS;
                        dv.b bVarE = h0.g.E(pair, new Pair(aVar3, new dv.c(dVar2 != null ? dVar2.a() : null)));
                        iVar4.getClass();
                        bVar3.f31315b.c(iVar4, bVarE);
                        v80.f0.B(androidx.lifecycle.m1.d(bVar3), null, null, new np.a(bVar3, null, i16), 3);
                        if (function06 != null) {
                            function06.invoke();
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        e40.a.f();
                        return null;
                }
                return Unit.f26487a;
            case 20:
                SpecialRewardsActivity specialRewardsActivity = (SpecialRewardsActivity) this.f5486b;
                g9.f0 f0Var2 = (g9.f0) this.f5487c;
                m3.b1 b1Var9 = (m3.b1) this.f5488d;
                m3.b1 b1Var10 = (m3.b1) this.f5489e;
                g9.c0 c0Var3 = (g9.c0) obj;
                int i21 = SpecialRewardsActivity.f9434g;
                c0Var3.getClass();
                zz.f.m(c0Var3, "screen_list", new u3.d(new dp.s(4, specialRewardsActivity, f0Var2, b1Var9, b1Var10), true, 2034636896));
                zz.f.m(c0Var3, "screen_used_and_expired_list", new u3.d(new dm.e(6, specialRewardsActivity, b1Var10), true, 1528368471));
                return Unit.f26487a;
            case 21:
                v80.b0 b0Var3 = (v80.b0) this.f5486b;
                Function1 function15 = (Function1) this.f5487c;
                w6 w6Var3 = (w6) this.f5488d;
                Function0 function07 = (Function0) this.f5489e;
                BasicItem basicItem = (BasicItem) obj;
                basicItem.getClass();
                v80.f0.B(b0Var3, null, null, new oi.b(w6Var3, function07, null, i11), 3);
                function15.invoke(basicItem);
                return Unit.f26487a;
            case 22:
                r40.h hVar5 = (r40.h) this.f5486b;
                String str2 = (String) this.f5487c;
                String str3 = (String) this.f5488d;
                h8.e eVar = (h8.e) this.f5489e;
                h8.a aVar4 = (h8.a) obj;
                if (((String) o00.h0.x(aVar4, r40.h.f37624d, "")).equals(str2)) {
                    h8.e eVarC = hVar5.c(aVar4, str2);
                    if (eVarC == null || eVarC.f21665a.equals(str3)) {
                        return null;
                    }
                    synchronized (hVar5) {
                        hVar5.d(aVar4, str2);
                        HashSet hashSet = new HashSet((Collection) o00.h0.x(aVar4, eVar, new HashSet()));
                        hashSet.add(str2);
                        aVar4.g(eVar, hashSet);
                    }
                    return null;
                }
                h8.e eVar2 = r40.h.f37623c;
                long jLongValue = ((Long) o00.h0.x(aVar4, eVar2, 0L)).longValue();
                long j11 = 1;
                if (jLongValue + 1 == 30) {
                    synchronized (hVar5) {
                        try {
                            long jLongValue2 = ((Long) o00.h0.x(aVar4, eVar2, 0L)).longValue();
                            String str4 = "";
                            Set hashSet2 = new HashSet();
                            String str5 = null;
                            for (Map.Entry entry : aVar4.a().entrySet()) {
                                if (entry.getValue() instanceof Set) {
                                    Set<String> set3 = (Set) entry.getValue();
                                    for (String str6 : set3) {
                                        long j12 = j11;
                                        if (str5 == null || str5.compareTo(str6) > 0) {
                                            str4 = ((h8.e) entry.getKey()).f21665a;
                                            str5 = str6;
                                            hashSet2 = set3;
                                        }
                                        j11 = j12;
                                    }
                                }
                                j11 = j11;
                            }
                            j9 = j11;
                            HashSet hashSet3 = new HashSet(hashSet2);
                            hashSet3.remove(str5);
                            str4.getClass();
                            aVar4.g(new h8.e(str4), hashSet3);
                            jLongValue = jLongValue2 - j9;
                            aVar4.f(r40.h.f37623c, Long.valueOf(jLongValue));
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else {
                    j9 = 1;
                }
                HashSet hashSet4 = new HashSet((Collection) o00.h0.x(aVar4, eVar, new HashSet()));
                hashSet4.add(str2);
                aVar4.g(eVar, hashSet4);
                aVar4.f(r40.h.f37623c, Long.valueOf(jLongValue + j9));
                aVar4.f(r40.h.f37624d, str2);
                return null;
            case 23:
                List list5 = (List) this.f5486b;
                aj.n nVar = (aj.n) this.f5487c;
                m1.a aVar5 = (m1.a) this.f5488d;
                x60.m mVar2 = (x60.m) this.f5489e;
                f2.l lVar4 = (f2.l) obj;
                lVar4.getClass();
                int i22 = 24;
                lVar4.r(list5.size(), new ao.p2(18, new qb.r(i12), list5), new ao.p2(19, new qb.r(i22), list5), new u3.d(new dp.y(list5, nVar, aVar5, i15), true, 802480018));
                f2.l.q(lVar4, null, new u3.d(new a3.m2(mVar2, i22), true, 1456789759), 3);
                return Unit.f26487a;
            case 24:
                g9.f0 f0Var3 = (g9.f0) this.f5486b;
                Function0 function08 = (Function0) this.f5487c;
                Function0 function09 = (Function0) this.f5488d;
                Function2 function2 = (Function2) this.f5489e;
                g9.c0 c0Var4 = (g9.c0) obj;
                c0Var4.getClass();
                u3.d dVar3 = new u3.d(new dq.f(f0Var3, function08, i17), true, -1515523931);
                kotlin.collections.o0 o0Var2 = kotlin.collections.o0.f26530a;
                o0Var2.getClass();
                kotlin.collections.n0 n0Var2 = kotlin.collections.n0.f26529a;
                zz.f.l(c0Var4, Reflection.getOrCreateKotlinClass(rl.e.class), o0Var2, n0Var2, null, null, null, null, dVar3);
                zz.f.l(c0Var4, Reflection.getOrCreateKotlinClass(rl.d.class), o0Var2, n0Var2, null, null, null, null, new u3.d(new cn.v(function09, function2, f0Var3, i13), true, -1735009138));
                return Unit.f26487a;
            case 25:
                ss.j1 j1Var = (ss.j1) this.f5486b;
                x60.j jVar = (x60.j) this.f5487c;
                x60.h hVar6 = (x60.h) this.f5488d;
                x60.m mVar3 = (x60.m) this.f5489e;
                f2.l lVar5 = (f2.l) obj;
                lVar5.getClass();
                List list6 = j1Var.f39195c;
                lVar5.r(list6.size(), null, new cn.n(list6, 20), new u3.d(new rs.h(list6, jVar, hVar6, mVar3, 0), true, 802480018));
                return Unit.f26487a;
            case 26:
                ss.c1 c1Var = (ss.c1) this.f5486b;
                x60.j jVar2 = (x60.j) this.f5487c;
                x60.h hVar7 = (x60.h) this.f5488d;
                x60.m mVar4 = (x60.m) this.f5489e;
                f2.l lVar6 = (f2.l) obj;
                lVar6.getClass();
                List list7 = c1Var.f39146c;
                lVar6.r(list7.size(), null, new cn.n(list7, 21), new u3.d(new rs.h(list7, jVar2, hVar7, mVar4, 1), true, 802480018));
                return Unit.f26487a;
            case 27:
                t1.b bVar5 = (t1.b) this.f5486b;
                t1.j jVar3 = (t1.j) this.f5487c;
                Function1 function16 = (Function1) this.f5488d;
                Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) this.f5489e;
                t1.h hVar8 = (t1.h) obj;
                t1.j1.i(hVar8, bVar5.f39359c);
                m3.k1 k1Var = hVar8.f39447e;
                Object objA = t1.b.a(bVar5, k1Var.getValue());
                if (!Intrinsics.areEqual(objA, k1Var.getValue())) {
                    bVar5.f39359c.f39464b.setValue(objA);
                    jVar3.f39464b.setValue(objA);
                    if (function16 != null) {
                        function16.invoke(bVar5);
                    }
                    hVar8.a();
                    booleanRef2.element = true;
                } else if (function16 != null) {
                    function16.invoke(bVar5);
                }
                return Unit.f26487a;
            case 28:
                m3.b1 b1Var11 = (m3.b1) this.f5486b;
                t1.g0 g0Var2 = (t1.g0) this.f5487c;
                Ref.FloatRef floatRef = (Ref.FloatRef) this.f5488d;
                v80.b0 b0Var4 = (v80.b0) this.f5489e;
                long jLongValue3 = ((Long) obj).longValue();
                m3.c3 c3Var2 = (m3.c3) b1Var11.getValue();
                long jLongValue4 = c3Var2 != null ? ((Number) c3Var2.getValue()).longValue() : jLongValue3;
                long j13 = g0Var2.f39436c;
                o3.e eVar3 = g0Var2.f39434a;
                if (j13 == Long.MIN_VALUE || floatRef.element != t1.j1.h(b0Var4.getCoroutineContext())) {
                    g0Var2.f39436c = jLongValue3;
                    Object[] objArr = eVar3.f31830a;
                    int i23 = eVar3.f31832c;
                    for (int i24 = 0; i24 < i23; i24++) {
                        ((t1.d0) objArr[i24]).f39412f = true;
                    }
                    floatRef.element = t1.j1.h(b0Var4.getCoroutineContext());
                }
                float f11 = floatRef.element;
                if (f11 == 0.0f) {
                    Object[] objArr2 = eVar3.f31830a;
                    int i25 = eVar3.f31832c;
                    for (int i26 = 0; i26 < i25; i26++) {
                        t1.d0 d0Var2 = (t1.d0) objArr2[i26];
                        d0Var2.f39409c.setValue(d0Var2.f39410d.f39475c);
                        d0Var2.f39412f = true;
                    }
                } else {
                    long j14 = (long) ((jLongValue4 - g0Var2.f39436c) / f11);
                    Object[] objArr3 = eVar3.f31830a;
                    int i27 = eVar3.f31832c;
                    boolean z13 = true;
                    for (int i28 = 0; i28 < i27; i28++) {
                        t1.d0 d0Var3 = (t1.d0) objArr3[i28];
                        if (!d0Var3.f39411e) {
                            d0Var3.f39414h.f39435b.setValue(Boolean.FALSE);
                            if (d0Var3.f39412f) {
                                d0Var3.f39412f = false;
                                d0Var3.f39413g = j14;
                            }
                            long j15 = j14 - d0Var3.f39413g;
                            d0Var3.f39409c.setValue(d0Var3.f39410d.f(j15));
                            d0Var3.f39411e = d0Var3.f39410d.e(j15);
                        }
                        if (!d0Var3.f39411e) {
                            z13 = false;
                        }
                    }
                    g0Var2.f39437d.setValue(Boolean.valueOf(!z13));
                }
                return Unit.f26487a;
            default:
                z5.c cVar2 = (z5.c) this.f5486b;
                Function1 function17 = (Function1) this.f5487c;
                float f12 = lv.t.f28251e;
                m3.b1 b1Var12 = (m3.b1) this.f5488d;
                m3.b1 b1Var13 = (m3.b1) this.f5489e;
                z4.z zVar3 = (z4.z) obj;
                zVar3.getClass();
                b1Var12.setValue(new z5.f(cVar2.O((int) (zVar3.u() & 4294967295L))));
                function17.invoke(new z5.f(((z5.f) b1Var12.getValue()).f47277a + ((z5.f) b1Var13.getValue()).f47277a + f12));
                return Unit.f26487a;
        }
    }

    public /* synthetic */ x1(ArrayList arrayList, Ref.IntRef intRef, List list, int i11, g2.r rVar) {
        this.f5485a = 4;
        this.f5486b = arrayList;
        this.f5487c = intRef;
        this.f5488d = list;
        this.f5489e = rVar;
    }

    public /* synthetic */ x1(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f5485a = i11;
        this.f5486b = obj;
        this.f5487c = obj2;
        this.f5488d = obj3;
        this.f5489e = obj4;
    }
}
