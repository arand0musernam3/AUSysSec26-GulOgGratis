package ao;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Address;
import android.util.Base64;
import android.widget.Toast;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.ComponentAvailableCallback;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.googlepay.GooglePayComponent;
import com.adyen.checkout.googlepay.GooglePayConfiguration;
import com.adyen.checkout.googlepay.internal.provider.GooglePayComponentProvider;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.discover.response.DiscoverSingleBucketResponse;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.mapService.response.FilterChipId;
import com.app.tgtg.model.remote.mapService.response.FilterChipOption;
import com.app.tgtg.model.remote.order.response.ProviderType;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentMethodsKt;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.PriceSpecification;
import com.app.tgtg.model.remote.user.requests.SurveyResult;
import com.app.tgtg.model.remote.user.response.charity.CharityDayScheduleStore;
import com.google.android.gms.internal.measurement.cg;
import g3.q9;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4233k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4234m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f4232j = i11;
        this.f4233k = obj;
        this.l = obj2;
        this.f4234m = obj3;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f4232j) {
            case 0:
                return new e1((pt.b) this.f4233k, (r1) this.l, (DiscoverSingleBucketResponse) this.f4234m, cVar, 0);
            case 1:
                return new e1((m3.h1) this.f4233k, (BasketManager) this.l, (BaseItemMnuV2) this.f4234m, cVar, 1);
            case 2:
                return new e1((v80.b0) this.f4233k, (m3.b1) this.l, (m3.b1) this.f4234m, cVar, 2);
            case 3:
                return new e1((m3.b1) this.f4233k, (ap.n) this.l, (bp.b) this.f4234m, cVar, 3);
            case 4:
                return new e1((List) this.f4233k, (gl.q) this.l, (String) this.f4234m, cVar, 4);
            case 5:
                e1 e1Var = new e1((dn.k) this.l, (z3.u) this.f4234m, cVar, 5);
                e1Var.f4233k = obj;
                return e1Var;
            case 6:
                return new e1((ArrayList) this.f4233k, (jj.c) this.l, (List) this.f4234m, cVar, 6);
            case 7:
                return new e1((m3.b1) this.f4233k, (i9.p) this.l, (z3.r) this.f4234m, cVar, 7);
            case 8:
                e1 e1Var2 = new e1((h8.e) this.l, (Long) this.f4234m, cVar, 8);
                e1Var2.f4233k = obj;
                return e1Var2;
            case 9:
                return new e1((he.k) this.f4233k, (Context) this.l, (String) this.f4234m, cVar, 9);
            case 10:
                return new e1((ep.d0) this.f4233k, (m3.c3) this.l, (dv.d) this.f4234m, cVar, 10);
            case 11:
                e1 e1Var3 = new e1((w4.y) this.l, (m2.l1) this.f4234m, cVar, 11);
                e1Var3.f4233k = obj;
                return e1Var3;
            case 12:
                return new e1((SurpriseBagOrderActivity) this.f4233k, (m3.b1) this.l, (m3.b1) this.f4234m, cVar, 12);
            case 13:
                return new e1((m3.g1) this.f4233k, (m3.c3) this.l, (m3.b1) this.f4234m, cVar, 13);
            case 14:
                return new e1((CharityDayScheduleStore) this.f4233k, (m3.b1) this.l, (m3.b1) this.f4234m, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new e1((com.google.firebase.messaging.a0) this.f4233k, (m3.b1) this.l, (m3.b1) this.f4234m, cVar, 15);
            case 16:
                return new e1((List) this.f4233k, (ry.b) this.l, (Context) this.f4234m, cVar, 16);
            case 17:
                return new e1((Function1) this.f4233k, (m3.b1) this.l, (m3.b1) this.f4234m, cVar, 17);
            case 18:
                return new e1((List) this.f4233k, (Function0) this.l, (m3.c3) this.f4234m, cVar, 18);
            case 19:
                return new e1((uf.k) this.f4233k, (String) this.l, (JSONArray) this.f4234m, cVar, 19);
            case 20:
                e1 e1Var4 = new e1((un.a) this.l, (String) this.f4234m, cVar, 20);
                e1Var4.f4233k = obj;
                return e1Var4;
            case 21:
                return new e1((cj.q) this.f4233k, (cj.e0) this.l, (m3.b1) this.f4234m, cVar, 21);
            case 22:
                return new e1((m3.b1) this.f4233k, (m3.b1) this.l, (m3.b1) this.f4234m, cVar, 22);
            case 23:
                e1 e1Var5 = new e1((w2.e1) this.l, (w4.y) this.f4234m, cVar, 23);
                e1Var5.f4233k = obj;
                return e1Var5;
            case 24:
                e1 e1Var6 = new e1((x2.w) this.l, (w4.y) this.f4234m, cVar, 24);
                e1Var6.f4233k = obj;
                return e1Var6;
            case 25:
                return new e1((yi.r) this.f4233k, (m3.b1) this.l, (m3.b1) this.f4234m, cVar, 25);
            case 26:
                return new e1((yi.f0) this.f4233k, (Cipher) this.l, (String) this.f4234m, cVar, 26);
            default:
                return new e1((yi.f0) this.f4233k, (String) this.l, (Executor) this.f4234m, cVar, 27);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4232j) {
        }
        return ((e1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Bitmap bitmapDecodeStream;
        Function0 function0;
        Object next;
        Environment adyenEnvironment;
        PaymentMethod paymentMethod;
        List<String> brands;
        Price total;
        Price total2;
        int i11 = this.f4232j;
        int i12 = 2;
        String currency = 0;
        currency = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i13 = 1;
        Object obj2 = this.l;
        Object obj3 = this.f4234m;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                pt.b bVar = (pt.b) this.f4233k;
                if (bVar != null) {
                    ((MainActivity) bVar).l0(r1.m(((DiscoverSingleBucketResponse) obj3).getBucket()));
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                m3.h1 h1Var = (m3.h1) this.f4233k;
                BasketManager basketManager = (BasketManager) obj2;
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) obj3;
                if (h1Var.h() != basketManager.getQuantity(baseItemMnuV2.m393getItemIdFvU5WIY())) {
                    h1Var.i(basketManager.getQuantity(baseItemMnuV2.m393getItemIdFvU5WIY()));
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                m3.b1 b1Var = (m3.b1) obj2;
                b1Var.setValue(co.q.MAXIMISED);
                ((m3.b1) obj3).setValue(v80.f0.B((v80.b0) this.f4233k, null, null, new co.o(new bm.j(b1Var, 2), currency, z11 ? 1 : 0), 3));
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((Boolean) ((m3.b1) this.f4233k).getValue()).booleanValue()) {
                    ((ap.n) obj2).k(((bp.b) obj3).c());
                }
                break;
            case 4:
                String str = (String) obj3;
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                List list = (List) this.f4233k;
                gl.q qVar = (gl.q) obj2;
                if (cg.q(list)) {
                    SurveyResult surveyResult = new SurveyResult(jl.i.MULTIPLE_CHOICE.a(), str, list);
                    ArrayList arrayList = qVar.f20572f;
                    kotlin.collections.i0.v(arrayList, new q9(surveyResult, i13));
                    arrayList.add(surveyResult);
                } else {
                    kotlin.collections.i0.v(qVar.f20572f, new c60.e(str, 27));
                }
                break;
            case 5:
                List list2 = (List) this.f4233k;
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                gn.a.j((dn.k) obj2, (z3.u) obj3, list2);
                break;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                jj.c cVar = (jj.c) obj2;
                List list3 = (List) obj3;
                Iterator it = ((ArrayList) this.f4233k).iterator();
                while (it.hasNext()) {
                    cVar.a((FilterChipOption) it.next(), list3);
                }
                cVar.a(new FilterChipOption(FilterChipId.SOLD_OUT, "", (String) null, 4, (DefaultConstructorMarker) null), kotlin.collections.n0.f26529a);
                break;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                i9.p pVar = (i9.p) obj2;
                z3.r rVar = (z3.r) obj3;
                for (g9.l lVar : (Set) ((m3.b1) this.f4233k).getValue()) {
                    if (!((List) pVar.b().f20180e.f45488a.getValue()).contains(lVar) && !rVar.contains(lVar)) {
                        pVar.b().c(lVar);
                    }
                }
                break;
            case 8:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((h8.a) this.f4233k).f((h8.e) obj2, (Long) obj3);
                break;
            case 9:
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                for (he.b0 b0Var : ((HashMap) ((he.k) this.f4233k).c()).values()) {
                    b0Var.getClass();
                    Bitmap bitmap = b0Var.f21871f;
                    String str2 = b0Var.f21869d;
                    if (bitmap == null && kotlin.text.y.p(str2, "data:", false) && StringsKt.G(str2, "base64,", 0, false, 6) > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str2.substring(StringsKt.F(str2, ',', 0, false, 6) + 1), 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            b0Var.f21871f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e5) {
                            ve.c.c("data URL did not have correct base64 format.", e5);
                        }
                    }
                    Context context = (Context) obj2;
                    String str3 = (String) obj3;
                    if (b0Var.f21871f == null && str3 != null) {
                        try {
                            InputStream inputStreamOpen = context.getAssets().open(str3 + str2);
                            inputStreamOpen.getClass();
                            try {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inScaled = true;
                                options2.inDensity = 160;
                                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                            } catch (IllegalArgumentException e11) {
                                ve.c.c("Unable to decode image.", e11);
                                bitmapDecodeStream = null;
                            }
                            if (bitmapDecodeStream != null) {
                                b0Var.f21871f = ve.k.d(bitmapDecodeStream, b0Var.f21866a, b0Var.f21867b);
                            }
                        } catch (IOException e12) {
                            ve.c.c("Unable to open asset.", e12);
                        }
                        break;
                    }
                    break;
                }
                break;
            case 10:
                y70.a aVar11 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ep.d0 d0Var = (ep.d0) this.f4233k;
                cv.i iVar = cv.i.SCREEN_RECIPE;
                dv.a aVar12 = dv.a.TITLE;
                m3.c3 c3Var = (m3.c3) obj2;
                hp.g gVar = (hp.g) c3Var.getValue();
                dv.d dVar = (dv.d) obj3;
                d0Var.r(iVar, h0.g.E(new Pair(aVar12, new dv.c(gVar != null ? gVar.f22276b : null)), new Pair(dv.a.OPENED_FROM, new dv.c(dVar != null ? dVar.a() : null))));
                hp.g gVar2 = (hp.g) c3Var.getValue();
                if (gVar2 != null) {
                    v80.f0.B(androidx.lifecycle.m1.d(d0Var), null, null, new d8.c(d0Var, gVar2, currency, 11), 3);
                }
                break;
            case 11:
                y70.a aVar13 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                v80.b0 b0Var2 = (v80.b0) this.f4233k;
                v80.d0 d0Var2 = v80.d0.UNDISPATCHED;
                w4.y yVar = (w4.y) obj2;
                m2.l1 l1Var = (m2.l1) obj3;
                v80.f0.B(b0Var2, null, d0Var2, new m2.r0(yVar, l1Var, currency, i13), 1);
                break;
            case 12:
                y70.a aVar14 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                SurpriseBagOrderActivity surpriseBagOrderActivity = (SurpriseBagOrderActivity) this.f4233k;
                int i14 = SurpriseBagOrderActivity.f9178y;
                if (surpriseBagOrderActivity.K()) {
                    ((m3.b1) obj2).setValue(Boolean.TRUE);
                } else {
                    ((m3.b1) obj3).setValue(oo.f.GENERIC);
                }
                break;
            case 13:
                m3.c3 c3Var2 = (m3.c3) obj2;
                y70.a aVar15 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                m3.g1 g1Var = (m3.g1) this.f4233k;
                boolean z14 = g1Var.h() >= 0.8f;
                boolean z15 = ((Number) c3Var2.getValue()).floatValue() >= 0.8f;
                if (z14 != z15) {
                    ((m3.b1) obj3).setValue(Boolean.valueOf(z15));
                }
                g1Var.i(((Number) c3Var2.getValue()).floatValue());
                break;
            case 14:
                y70.a aVar16 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((m3.b1) obj2).setValue((CharityDayScheduleStore) this.f4233k);
                ((m3.b1) obj3).setValue(Boolean.TRUE);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                m3.b1 b1Var2 = (m3.b1) obj2;
                y70.a aVar17 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                float fH = ((z1.r) ((com.google.firebase.messaging.a0) this.f4233k).f12782e).f46655j.h();
                if (!Float.isNaN(fH)) {
                    int i15 = MapBottomSheet.f9095y;
                    Float f11 = (Float) b1Var2.getValue();
                    if (f11 != null) {
                        m3.b1 b1Var3 = (m3.b1) obj3;
                        float fFloatValue = f11.floatValue();
                        if (fH > fFloatValue) {
                            b1Var3.setValue(Boolean.TRUE);
                        } else if (fH < fFloatValue) {
                            b1Var3.setValue(Boolean.FALSE);
                        }
                    }
                    b1Var2.setValue(new Float(fH));
                }
                break;
            case 16:
                ry.b bVar2 = (ry.b) obj2;
                y70.a aVar18 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                List list4 = (List) this.f4233k;
                if (list4 == null || list4.isEmpty()) {
                    String string = ((Context) obj3).getString(R.string.map_unknown_address);
                    string.getClass();
                    bVar2.invoke(string);
                } else {
                    String addressLine = ((Address) list4.get(0)).getAddressLine(0);
                    addressLine.getClass();
                    bVar2.invoke(addressLine);
                }
                break;
            case 17:
                y70.a aVar19 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((Function1) this.f4233k).invoke(!((List) ((m3.b1) obj2).getValue()).isEmpty() ? ti.i.DIVERGENCE : ((Boolean) ((m3.b1) obj3).getValue()).booleanValue() ? ti.i.SAVE : ti.i.INITIAL);
                break;
            case 18:
                y70.a aVar20 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((Boolean) ((m3.c3) obj3).getValue()).booleanValue() && !((List) this.f4233k).isEmpty() && (function0 = (Function0) obj2) != null) {
                    function0.invoke();
                }
                break;
            case 19:
                y70.a aVar21 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                hf.g gVar3 = ((uf.k) this.f4233k).f41117a;
                String str4 = (String) obj2;
                JSONArray jSONArray = (JSONArray) obj3;
                gVar3.getClass();
                str4.getClass();
                uf.g gVar4 = gVar3.f22030d;
                File file = gVar4.f41098a;
                File file2 = new File(str4);
                if (file2.exists()) {
                    String name = file2.getName();
                    File file3 = new File(file, r8.k.l(name, "-1.tmp"));
                    File file4 = new File(file, r8.k.l(name, "-2.tmp"));
                    int length = jSONArray.length() / 2;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = n80.p.j(0, jSONArray.length()).iterator();
                    while (((n80.h) it2).f30715c) {
                        int iNextInt = ((kotlin.collections.s0) it2).nextInt();
                        if (iNextInt < length) {
                            JSONObject jSONObject = jSONArray.getJSONObject(iNextInt);
                            jSONObject.getClass();
                            arrayList2.add(jSONObject);
                        } else {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(iNextInt);
                            jSONObject2.getClass();
                            arrayList3.add(jSONObject2);
                        }
                    }
                    gVar4.m(arrayList2, file3, true);
                    gVar4.m(arrayList3, file4, true);
                    gVar4.h(str4);
                }
                break;
            case 20:
                String str5 = (String) this.f4233k;
                y70.a aVar22 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((un.a) obj2).f41455f = r8.k.m((String) obj3, " ", str5);
                break;
            case 21:
                cj.e0 e0Var = (cj.e0) obj2;
                y70.a aVar23 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                BasicItem basicItemF = ((cj.q) this.f4233k).f();
                if ((basicItemF != null ? basicItemF.getItemType() : null) == ItemType.MANUFACTURER && e0Var.o()) {
                    int iIntValue = ((Number) ((m3.b1) obj3).getValue()).intValue();
                    int i16 = e0Var.L;
                    e0Var.L = iIntValue;
                    if (i16 != iIntValue && e0Var.f8221k.getValue() != null) {
                        v80.f0.B(androidx.lifecycle.m1.d(e0Var), null, null, new cj.z(true, e0Var, (x70.c) null), 3);
                    }
                }
                break;
            case 22:
                y70.a aVar24 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (!((List) ((m3.b1) this.f4233k).getValue()).isEmpty() && ((Boolean) ((m3.b1) obj2).getValue()).booleanValue()) {
                    ((m3.b1) obj3).setValue(Boolean.TRUE);
                }
                break;
            case 23:
                y70.a aVar25 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                v80.b0 b0Var3 = (v80.b0) this.f4233k;
                w2.e1 e1Var = (w2.e1) obj2;
                x2.w wVar = e1Var.f42880s;
                w4.y yVar2 = (w4.y) obj3;
                us.j jVar = new us.j(12, wVar, e1Var);
                v80.d0 d0Var3 = v80.d0.UNDISPATCHED;
                x70.c cVar2 = null;
                v80.f0.B(b0Var3, null, d0Var3, new w2.d1(wVar, yVar2, cVar2, z12 ? 1 : 0), 1);
                v80.f0.B(b0Var3, null, d0Var3, new os.c(e1Var, wVar, yVar2, jVar, (x70.c) null, 18), 1);
                v80.f0.B(b0Var3, null, d0Var3, new tg.g(wVar, yVar2, jVar, cVar2, 7), 1);
                break;
            case 24:
                y70.a aVar26 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                v80.b0 b0Var4 = (v80.b0) this.f4233k;
                v80.d0 d0Var4 = v80.d0.UNDISPATCHED;
                x2.w wVar2 = (x2.w) obj2;
                w4.y yVar3 = (w4.y) obj3;
                v80.f0.B(b0Var4, null, d0Var4, new w2.d1(wVar2, yVar3, currency, i13), 1);
                v80.f0.B(b0Var4, null, d0Var4, new w2.d1(wVar2, yVar3, currency, i12), 1);
                break;
            case 25:
                y70.a aVar27 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                yi.r rVar2 = (yi.r) this.f4233k;
                List list5 = (List) ((m3.b1) obj2).getValue();
                PriceSpecification priceSpecification = (PriceSpecification) ((m3.b1) obj3).getValue();
                rVar2.getClass();
                Iterator it3 = list5.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        PaymentMethods paymentMethods = (PaymentMethods) next;
                        if (paymentMethods.getPaymentType() != PaymentType.GOOGLEPAY || paymentMethods.getProviderType() != ProviderType.ADYEN_PAYMENT_METHOD) {
                        }
                    } else {
                        next = null;
                    }
                }
                PaymentMethods paymentMethods2 = (PaymentMethods) next;
                if (paymentMethods2 == null || (adyenEnvironment = PaymentMethodsKt.getAdyenEnvironment(paymentMethods2)) == null) {
                    adyenEnvironment = AppConstants.INSTANCE.getAdyenEnvironment();
                }
                Environment environment = adyenEnvironment;
                if (paymentMethods2 != null) {
                    ModelObject.Serializer<PaymentMethod> serializer = PaymentMethod.SERIALIZER;
                    String adyenPayload = paymentMethods2.getAdyenPayload();
                    adyenPayload.getClass();
                    paymentMethod = (PaymentMethod) serializer.deserialize(new JSONObject(adyenPayload));
                } else {
                    paymentMethod = null;
                }
                if (paymentMethod == null || ((brands = paymentMethod.getBrands()) != null && brands.isEmpty())) {
                    rVar2.v().c(false, null, list5);
                } else {
                    Amount amount = new Amount(null, 0L, 3, null);
                    if (priceSpecification != null && (total2 = priceSpecification.getTotal()) != null) {
                        currency = total2.getCurrency();
                    }
                    amount.setCurrency(currency);
                    amount.setValue((priceSpecification == null || (total = priceSpecification.getTotal()) == null) ? 0L : total.getMinorUnits());
                    String currency2 = amount.getCurrency();
                    if (currency2 == null || currency2.length() == 0 || amount.getValue() == 0) {
                        rVar2.v().s(cv.i.DEBUG_CHECKOUT_FAILED, h0.g.E(new Pair(dv.a.CHECKOUT_ERROR_CAUSE, new dv.c(aj.d.GOOGLE_PAY_AVAILABLE + ", amount missing in Google Pay -> " + amount.getCurrency()))));
                        Toast.makeText(rVar2.requireContext(), R.string.generic_err_undefined_error, 0).show();
                    } else {
                        androidx.fragment.app.o0 o0VarRequireActivity = rVar2.requireActivity();
                        o0VarRequireActivity.getClass();
                        GooglePayConfiguration googlePayConfigurationA = new bj.j(o0VarRequireActivity, paymentMethod, null, null, null, environment).a(amount, true);
                        b40.a aVar28 = new b40.a(rVar2, paymentMethods2, list5, 10);
                        GooglePayComponentProvider googlePayComponentProvider = GooglePayComponent.PROVIDER;
                        Application application = rVar2.requireActivity().getApplication();
                        application.getClass();
                        googlePayComponentProvider.isAvailable(application, paymentMethod, googlePayConfigurationA, (ComponentAvailableCallback) aVar28);
                    }
                }
                break;
            case 26:
                String str6 = (String) obj3;
                yi.f0 f0Var = (yi.f0) this.f4233k;
                y70.a aVar29 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                try {
                    cj.s0 s0VarB = f0Var.B();
                    Cipher cipher = (Cipher) obj2;
                    cipher.getClass();
                    s0VarB.n(cipher);
                    f0Var.H(str6);
                } catch (Exception unused) {
                    f0Var.B().d();
                    f0Var.H(str6);
                }
                break;
            default:
                String str7 = (String) obj2;
                yi.f0 f0Var2 = (yi.f0) this.f4233k;
                y70.a aVar30 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                try {
                    b70.b bVarR = f0Var2.B().r();
                    a3.i3 i3Var = new a3.i3(5);
                    i3Var.f395b = f0Var2.getString(R.string.checkout_biometric_promt_title);
                    i3Var.f396c = f0Var2.getString(R.string.checkout_biometric_promt_cancel_txt);
                    i3Var.f394a = false;
                    a3.i3 i3VarN = i3Var.n();
                    ky.o oVar = new ky.o(f0Var2, (Executor) obj3, new yi.e0(f0Var2, str7, bVarR, z13 ? 1 : 0));
                    if (bVarR.f6056b) {
                        oVar.u(i3VarN, null);
                    } else {
                        oVar.s(i3VarN, new t.q(bVarR.f6055a));
                    }
                } catch (Exception e13) {
                    f0Var2.B().d();
                    f0Var2.H(str7);
                    sa0.a.f38953a.d(e13);
                    return Unit.f26487a;
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f4232j = i11;
        this.l = obj;
        this.f4234m = obj2;
    }
}
