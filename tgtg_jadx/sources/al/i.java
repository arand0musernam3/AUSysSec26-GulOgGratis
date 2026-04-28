package al;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.p0;
import bg.k0;
import bg.w0;
import cj.l0;
import cj.s0;
import com.adyen.checkout.adyen3ds2.Adyen3DS2Component;
import com.adyen.checkout.await.AwaitComponent;
import com.adyen.checkout.bcmc.BcmcComponent;
import com.adyen.checkout.bcmc.BcmcConfiguration;
import com.adyen.checkout.blik.BlikComponent;
import com.adyen.checkout.blik.BlikConfiguration;
import com.adyen.checkout.card.AddressConfiguration;
import com.adyen.checkout.card.CardComponent;
import com.adyen.checkout.card.CardConfiguration;
import com.adyen.checkout.cashapppay.CashAppPayComponent;
import com.adyen.checkout.cashapppay.CashAppPayConfiguration;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.action.AwaitAction;
import com.adyen.checkout.components.core.action.QrCodeAction;
import com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider;
import com.adyen.checkout.core.CardType;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.googlepay.GooglePayComponent;
import com.adyen.checkout.googlepay.GooglePayConfiguration;
import com.adyen.checkout.mbway.MBWayComponent;
import com.adyen.checkout.mbway.MBWayConfiguration;
import com.adyen.checkout.qrcode.QRCodeComponent;
import com.adyen.checkout.redirect.RedirectComponent;
import com.adyen.checkout.ui.core.AdyenComponentView;
import com.app.tgtg.R;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.mapService.response.Clusters;
import com.app.tgtg.model.remote.mapService.response.MapClustersResponse;
import com.app.tgtg.model.remote.order.AuthPayloadType;
import com.app.tgtg.model.remote.order.AuthorizationPayload;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentMethodsKt;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.PriceSpecification;
import ib.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import mv.m0;
import mv.r0;
import org.json.JSONObject;
import ui.a2;
import ui.c1;
import ui.d0;
import ui.d2;
import ui.f1;
import ui.g0;
import ui.g2;
import ui.h2;
import ui.i1;
import ui.i2;
import ui.j0;
import ui.j2;
import ui.k2;
import ui.l1;
import ui.n2;
import ui.o1;
import ui.o2;
import ui.r1;
import ui.u1;
import ui.v0;
import ui.w1;
import ui.x1;
import ui.y0;
import ui.z0;
import yi.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1539b;

    public /* synthetic */ i(Object obj, int i11) {
        this.f1538a = i11;
        this.f1539b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.p0
    public final void a(Object obj) {
        ib.h hVar;
        String strA;
        Object objA;
        Clusters clusters;
        List<Clusters> clusters2;
        Object next;
        PickupInterval pickupIntervalL;
        PaymentMethods paymentMethods;
        PaymentMethods paymentMethods2;
        CardType[] cardTypeArr;
        PickupInterval pickupIntervalL2;
        int i11 = this.f1538a;
        Object obj2 = this.f1539b;
        switch (i11) {
            case 0:
                p pVar = (p) obj2;
                h0 h0Var = (h0) obj;
                if (h0Var != null && (hVar = h0Var.f23731d) != null && (strA = hVar.a("PollingState")) != null) {
                    int iHashCode = strA.hashCode();
                    if (iHashCode == -2009873286) {
                        if (strA.equals("LoginSuccess")) {
                            pVar.f1565c.n().setShouldVerifyEmail(false);
                            boolean zK = ft.c.k();
                            cl.d dVar = cl.d.f8444b;
                            if (zK) {
                                pVar.e(dVar, "Polling");
                            } else {
                                pVar.d(dVar, "Polling");
                            }
                            break;
                        }
                    } else if (iHashCode == -1667914715) {
                        if (strA.equals("PollingError")) {
                            pVar.f1577p.i(new qt.a(new cl.g(Integer.valueOf(R.string.generic_err_undefined_error), 10)));
                            break;
                        }
                    } else if (iHashCode == 1023309918) {
                        strA.equals("KeepPolling");
                        break;
                    }
                }
                break;
            case 1:
                HiddenStoresActivity hiddenStoresActivity = (HiddenStoresActivity) obj2;
                av.a aVar = (av.a) obj;
                int i12 = HiddenStoresActivity.f9412k;
                aVar.getClass();
                if (aVar instanceof av.a) {
                    hiddenStoresActivity.startActivity(aVar.a(hiddenStoresActivity), mv.a.b(hiddenStoresActivity));
                }
                break;
            case 2:
                XmlCheckoutAddressFragment xmlCheckoutAddressFragment = (XmlCheckoutAddressFragment) obj2;
                Pair pair = (Pair) obj;
                pair.getClass();
                xmlCheckoutAddressFragment.z().a();
                m0 m0Var = sa0.a.f38953a;
                Throwable th2 = (Throwable) pair.f26485a;
                m0Var.d(th2);
                Context contextRequireContext = xmlCheckoutAddressFragment.requireContext();
                contextRequireContext.getClass();
                r0.o(contextRequireContext, th2);
                break;
            case 3:
                pl.f fVar = (pl.f) obj2;
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                pg.a aVar2 = fVar.f35484f;
                aVar2.getClass();
                ((TGTGLoadingView) aVar2.f34763e).setVisibility(8);
                if (arrayList.isEmpty()) {
                    fVar.t(R.string.generic_err_undefined_error);
                    fVar.dismiss();
                } else {
                    fVar.f35486h = new bg.p(fVar.requireContext(), arrayList, new jb.b(fVar));
                    p pVarQ = fVar.q();
                    Context contextRequireContext2 = fVar.requireContext();
                    contextRequireContext2.getClass();
                    pVarQ.f1582u = r0.d(contextRequireContext2, arrayList);
                    fVar.s(fVar.q().f1582u);
                }
                break;
            case 4:
                Function1 function1 = (Function1) obj2;
                qt.a aVar3 = (qt.a) obj;
                if (aVar3 != null && (objA = aVar3.a()) != null) {
                    function1.invoke(objA);
                    break;
                }
                break;
            case 5:
                MapClustersResponse mapClustersResponse = (MapClustersResponse) obj;
                mapClustersResponse.getClass();
                uk.q qVar = ((uk.c) obj2).f41322n;
                if (qVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar = null;
                }
                qVar.getClass();
                HashMap map = new HashMap();
                for (Clusters clusters3 : mapClustersResponse.getClusters()) {
                    map.put(new LatLngInfo(clusters3.getLocation().getLatitude(), clusters3.getLocation().getLongitude()), om.o.CLUSTER);
                }
                LinkedHashMap linkedHashMap = qVar.f41369w;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    LatLngInfo latLngInfo = (LatLngInfo) entry.getKey();
                    if (!linkedHashMap.containsKey(latLngInfo) || linkedHashMap.get(latLngInfo) != map.get(latLngInfo)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    LatLngInfo latLngInfo2 = (LatLngInfo) entry2.getKey();
                    if (!map.containsKey(latLngInfo2) || linkedHashMap.get(latLngInfo2) != map.get(latLngInfo2)) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                    st.a aVar4 = qVar.f41349b;
                    if (aVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                        aVar4 = null;
                    }
                    ((rt.d) aVar4).m((LatLngInfo) entry3.getKey());
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                    LatLngInfo latLngInfo3 = (LatLngInfo) entry4.getKey();
                    if (map.containsKey(latLngInfo3) && linkedHashMap.get(latLngInfo3) == map.get(latLngInfo3)) {
                        linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                    }
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(linkedHashMap4);
                linkedHashMap.putAll(linkedHashMap2);
                for (Map.Entry entry5 : linkedHashMap2.entrySet()) {
                    switch (uk.n.$EnumSwitchMapping$0[((om.o) entry5.getValue()).ordinal()]) {
                        case 1:
                            LatLngInfo latLngInfo4 = (LatLngInfo) entry5.getKey();
                            uk.c cVar = qVar.f41353f;
                            if (cVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
                                cVar = null;
                            }
                            LatLngInfo latLngInfo5 = (LatLngInfo) entry5.getKey();
                            cVar.getClass();
                            latLngInfo5.getClass();
                            uk.r rVarQ = cVar.q();
                            rVarQ.getClass();
                            MapClustersResponse mapClustersResponse2 = (MapClustersResponse) rVarQ.l.d();
                            if (mapClustersResponse2 == null || (clusters2 = mapClustersResponse2.getClusters()) == null) {
                                clusters = null;
                            } else {
                                Iterator<T> it = clusters2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        Clusters clusters4 = (Clusters) next;
                                        if (clusters4.getLocation().getLatitude() != latLngInfo5.getLatitude() || clusters4.getLocation().getLongitude() != latLngInfo5.getLongitude()) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                clusters = (Clusters) next;
                            }
                            int count = clusters != null ? clusters.getCount() : 0;
                            uk.c cVar2 = qVar.f41353f;
                            if (cVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
                                cVar2 = null;
                            }
                            mc.a aVarA = mc.a.a(cVar2.getLayoutInflater());
                            ((AppCompatTextView) aVarA.f29924d).setText(String.valueOf(count));
                            st.a aVar5 = qVar.f41349b;
                            if (aVar5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                                aVar5 = null;
                            }
                            ConstraintLayout constraintLayout = (ConstraintLayout) aVarA.f29922b;
                            constraintLayout.getClass();
                            Context context = qVar.getContext();
                            context.getClass();
                            ((rt.d) aVar5).c(latLngInfo4, constraintLayout, context);
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            break;
                        default:
                            e40.a.f();
                            break;
                    }
                }
                break;
            case 6:
                ((b1) obj2).setValue(obj);
                break;
            case 7:
                yi.r rVar = (yi.r) obj2;
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                Object obj3 = pair2.f26485a;
                if (!rVar.v().P) {
                    rVar.t("throwableObserver");
                }
                rVar.v().p(false);
                Throwable th3 = (Throwable) obj3;
                sa0.a.f38953a.d(th3);
                Context contextRequireContext3 = rVar.requireContext();
                contextRequireContext3.getClass();
                r0.o(contextRequireContext3, th3);
                if (((Boolean) pair2.f26486b).booleanValue()) {
                    yi.v vVar = rVar.f46020k;
                    if (vVar != null) {
                        vVar.b();
                    }
                    rVar.dismiss();
                }
                break;
            default:
                f0 f0Var = (f0) obj2;
                yi.c0 c0Var = f0Var.f45993s;
                o2 o2Var = (o2) obj;
                o2Var.getClass();
                if (o2Var instanceof ui.u) {
                    f0Var.F(((ui.u) o2Var).f41280b);
                    break;
                } else {
                    int i13 = 1;
                    if (o2Var instanceof ui.r) {
                        ui.r rVar2 = (ui.r) o2Var;
                        PaymentMethod paymentMethod = rVar2.f41267b;
                        Environment environment = rVar2.f41268c;
                        yi.x xVar = new yi.x(f0Var, 5);
                        o0 o0VarRequireActivity = f0Var.requireActivity();
                        o0VarRequireActivity.getClass();
                        BcmcComponent bcmcComponent = (BcmcComponent) PaymentComponentProvider.DefaultImpls.get$default(BcmcComponent.PROVIDER, o0VarRequireActivity, paymentMethod, (BcmcConfiguration) ((BcmcConfiguration.Builder) new BcmcConfiguration.Builder(environment, AppConstants.INSTANCE.getAdyenClientKey()).setShowStorePaymentField(true).setAmount(f0Var.y())).build(), new bj.b(o0VarRequireActivity, paymentMethod, xVar, f0Var, environment).f6296c, (OrderRequest) null, (String) null, 48, (Object) null);
                        f0Var.M(PaymentType.BCMCCARD.getTitleResId());
                        pg.k kVar = f0Var.f45994t;
                        kVar.getClass();
                        AdyenComponentView adyenComponentView = (AdyenComponentView) kVar.f34929c;
                        LifecycleOwner viewLifecycleOwner = f0Var.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        adyenComponentView.attach(bcmcComponent, viewLifecycleOwner);
                        f0Var.Q();
                        break;
                    } else {
                        x70.c cVar3 = null;
                        if (o2Var instanceof f1) {
                            PaymentMethods paymentMethods3 = ((f1) o2Var).f41195b;
                            PriceSpecification priceSpecification = (PriceSpecification) f0Var.A().f8349j.f45488a.getValue();
                            Price total = priceSpecification != null ? priceSpecification.getTotal() : null;
                            if (total == null) {
                                f0Var.w("totalPrice is null");
                            } else {
                                boolean zAreEqual = Intrinsics.areEqual(f0Var.A().f8355q.f45488a.getValue(), aj.k.f1503a);
                                String strH = f0Var.A().h();
                                if (strH != null) {
                                    s0 s0VarB = f0Var.B();
                                    String strZ = f0Var.z();
                                    BasicItem basicItemF = f0Var.A().f();
                                    String pickupWindowStartSecond = (basicItemF == null || (pickupIntervalL2 = mv.d.l(basicItemF)) == null) ? null : pickupIntervalL2.getPickupWindowStartSecond();
                                    PriceSpecification priceSpecification2 = (PriceSpecification) f0Var.A().f8349j.f45488a.getValue();
                                    Map<VoucherId, Price> voucherWithPriceMap = priceSpecification2 != null ? priceSpecification2.getVoucherWithPriceMap() : null;
                                    PriceSpecification priceSpecification3 = (PriceSpecification) f0Var.A().f8349j.f45488a.getValue();
                                    Map<VoucherId, Price> discountsWithPriceMap = priceSpecification3 != null ? priceSpecification3.getDiscountsWithPriceMap() : null;
                                    paymentMethods3.getClass();
                                    v80.f0.B(m1.d(s0VarB), null, null, new cj.o0(paymentMethods3, zAreEqual, voucherWithPriceMap, s0VarB, strH, total, discountsWithPriceMap, strZ, pickupWindowStartSecond, (x70.c) null), 3);
                                } else {
                                    f0Var.w("orderId is null");
                                }
                            }
                            break;
                        } else if (o2Var instanceof ui.x) {
                            PaymentMethods paymentMethods4 = ((ui.x) o2Var).f41293b;
                            w0 w0Var = f0Var.l;
                            if (w0Var != null) {
                                w0Var.a();
                            }
                            if (new j30.g(new ky.b(f0Var.requireContext(), 4)).b(15) == 0) {
                                Executor executorC = androidx.core.app.e.c(f0Var.requireContext());
                                executorC.getClass();
                                LifecycleOwner viewLifecycleOwner2 = f0Var.getViewLifecycleOwner();
                                viewLifecycleOwner2.getClass();
                                v80.f0.B(m1.c(viewLifecycleOwner2), null, null, new tg.g(f0Var, paymentMethods4, executorC, cVar3, 15), 3);
                            } else {
                                f0Var.B().l(paymentMethods4);
                                f0Var.B().x(cv.i.DEBUG_ADYEN_BIOMETRICS_FAILED, kotlin.collections.w0.b(new Pair(dv.a.REASON, new dv.c("BiometricManager"))));
                            }
                            break;
                        } else if (o2Var instanceof g0) {
                            g0 g0Var = (g0) o2Var;
                            PaymentMethod paymentMethod2 = g0Var.f41199b;
                            boolean z11 = g0Var.f41200c;
                            Environment environment2 = g0Var.f41201d;
                            yi.x xVar2 = new yi.x(f0Var, 1);
                            Amount amount = new Amount(null, 0L, 3, null);
                            Price priceC = f0Var.C();
                            String currency = priceC != null ? priceC.getCurrency() : null;
                            if (currency == null) {
                                currency = "";
                            }
                            amount.setCurrency(currency);
                            amount.setValue(f0Var.C() != null ? r2.getMinorUnits() : 0);
                            if (Intrinsics.areEqual(amount.getCurrency(), "") || amount.getValue() == 0) {
                                f0Var.A().s(cv.i.DEBUG_CHECKOUT_FAILED, h0.g.E(new Pair(dv.a.CHECKOUT_ERROR_CAUSE, new dv.c(aj.d.ADYEN_INIT + ", amount missing in CardComponent"))));
                                Toast.makeText(f0Var.requireContext(), R.string.generic_err_undefined_error, 0).show();
                            } else {
                                o0 o0VarRequireActivity2 = f0Var.requireActivity();
                                o0VarRequireActivity2.getClass();
                                bj.f fVar2 = new bj.f(o0VarRequireActivity2, paymentMethod2, z11, environment2, xVar2, f0Var);
                                List<String> brands = paymentMethod2.getBrands();
                                if (brands != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<T> it2 = brands.iterator();
                                    while (it2.hasNext()) {
                                        CardType byBrandName = CardType.INSTANCE.getByBrandName((String) it2.next());
                                        if (byBrandName != null) {
                                            arrayList2.add(byBrandName);
                                        }
                                    }
                                    cardTypeArr = (CardType[]) arrayList2.toArray(new CardType[0]);
                                } else {
                                    cardTypeArr = null;
                                }
                                if (cardTypeArr == null) {
                                    cardTypeArr = new CardType[0];
                                }
                                CardComponent cardComponent = (CardComponent) PaymentComponentProvider.DefaultImpls.get$default(CardComponent.PROVIDER, fVar2.f6302a, fVar2.f6303b, (CardConfiguration) ((CardConfiguration.Builder) new CardConfiguration.Builder(fVar2.f6305d, AppConstants.INSTANCE.getAdyenClientKey()).setSupportedCardTypes((CardType[]) Arrays.copyOf(cardTypeArr, cardTypeArr.length)).setShowStorePaymentField(true).setAddressConfiguration(fVar2.f6304c ? new AddressConfiguration.PostalCode(new AddressConfiguration.CardAddressFieldPolicy.Optional()) : AddressConfiguration.None.INSTANCE).setSubmitButtonVisible(true).setAmount(amount)).build(), fVar2.f6308g, (OrderRequest) null, (String) null, 48, (Object) null);
                                f0Var.M(PaymentType.CREDITCARD.getTitleResId());
                                pg.k kVar2 = f0Var.f45994t;
                                kVar2.getClass();
                                AdyenComponentView adyenComponentView2 = (AdyenComponentView) kVar2.f34929c;
                                LifecycleOwner viewLifecycleOwner3 = f0Var.getViewLifecycleOwner();
                                viewLifecycleOwner3.getClass();
                                adyenComponentView2.attach(cardComponent, viewLifecycleOwner3);
                                f0Var.Q();
                            }
                            break;
                        } else if (o2Var instanceof i1) {
                            i1 i1Var = (i1) o2Var;
                            f0Var.s(i1Var.f41216b, i1Var.f41217c, i1Var.f41218d);
                            break;
                        } else if (o2Var instanceof j0) {
                            j0 j0Var = (j0) o2Var;
                            PaymentMethod paymentMethod3 = j0Var.f41224b;
                            Environment environment3 = j0Var.f41225c;
                            w0 w0Var2 = f0Var.l;
                            if (w0Var2 != null) {
                                w0Var2.a();
                            }
                            o0 o0VarRequireActivity3 = f0Var.requireActivity();
                            o0VarRequireActivity3.getClass();
                            if (!r0.c(o0VarRequireActivity3)) {
                                f0.u((f0) f0Var.f45998x.f40820a, "Payments - Goggle Pay cancelled", 1);
                            } else {
                                yi.x xVar3 = new yi.x(f0Var, 4);
                                o0 o0VarRequireActivity4 = f0Var.requireActivity();
                                o0VarRequireActivity4.getClass();
                                bj.j jVar = new bj.j(o0VarRequireActivity4, paymentMethod3, xVar3, f0Var, f0Var.f45998x, environment3);
                                GooglePayConfiguration googlePayConfigurationA = jVar.a(f0Var.y(), false);
                                try {
                                    googlePayConfigurationA.getClass();
                                    f0Var.f45986k = (GooglePayComponent) PaymentComponentProvider.DefaultImpls.get$default(GooglePayComponent.PROVIDER, o0VarRequireActivity4, paymentMethod3, googlePayConfigurationA, jVar.f6318e, (OrderRequest) null, (String) null, 48, (Object) null);
                                    pg.k kVar3 = f0Var.f45994t;
                                    kVar3.getClass();
                                    AdyenComponentView adyenComponentView3 = (AdyenComponentView) kVar3.f34929c;
                                    GooglePayComponent googlePayComponent = f0Var.f45986k;
                                    googlePayComponent.getClass();
                                    LifecycleOwner viewLifecycleOwner4 = f0Var.getViewLifecycleOwner();
                                    viewLifecycleOwner4.getClass();
                                    adyenComponentView3.attach(googlePayComponent, viewLifecycleOwner4);
                                    GooglePayComponent googlePayComponent2 = f0Var.f45986k;
                                    if (googlePayComponent2 != null) {
                                        googlePayComponent2.submit();
                                    }
                                } catch (Exception e5) {
                                    sa0.a.f38953a.d(e5);
                                    if (f0Var.getContext() != null) {
                                        Toast.makeText(f0Var.requireContext(), R.string.generic_err_undefined_error, 0).show();
                                    }
                                    f0Var.A().b();
                                    f0Var.A().s(cv.i.DEBUG_CHECKOUT_FAILED, h0.g.E(new Pair(dv.a.CHECKOUT_ERROR_CAUSE, new dv.c(aj.d.GOOGLE_PAY_AVAILABLE + ", ex: " + e5.getMessage()))));
                                    return;
                                }
                            }
                            break;
                        } else if (o2Var instanceof ui.m0) {
                            f0Var.F(((ui.m0) o2Var).f41240b);
                            break;
                        } else if (o2Var instanceof ui.s0) {
                            f0Var.F(((ui.s0) o2Var).f41273b);
                            break;
                        } else if (o2Var instanceof c1) {
                            f0Var.F(((c1) o2Var).f41178b);
                            break;
                        } else if (o2Var instanceof o1) {
                            f0Var.F(((o1) o2Var).f41256b);
                            break;
                        } else if (o2Var instanceof r1) {
                            f0Var.F(((r1) o2Var).f41269b);
                            break;
                        } else if (o2Var instanceof l1) {
                            l1 l1Var = (l1) o2Var;
                            Action action = l1Var.f41235b;
                            Environment environment4 = l1Var.f41236c;
                            f0Var.f45985j = "3DS2";
                            Adyen3DS2Component threeDSecureComponent = f0Var.x().getThreeDSecureComponent(c0Var, environment4);
                            o0 o0VarRequireActivity5 = f0Var.requireActivity();
                            o0VarRequireActivity5.getClass();
                            threeDSecureComponent.handleAction(action, o0VarRequireActivity5);
                            break;
                        } else if (o2Var instanceof ui.p0) {
                            ui.p0 p0Var = (ui.p0) o2Var;
                            PaymentMethod paymentMethod4 = p0Var.f41260b;
                            Environment environment5 = p0Var.f41261c;
                            if (f0Var.requireActivity().isFinishing()) {
                                Toast.makeText(f0Var.requireContext(), R.string.generic_err_undefined_error, 0).show();
                            } else {
                                yi.x xVar4 = new yi.x(f0Var, 6);
                                o0 o0VarRequireActivity6 = f0Var.requireActivity();
                                o0VarRequireActivity6.getClass();
                                MBWayComponent mBWayComponent = (MBWayComponent) PaymentComponentProvider.DefaultImpls.get$default(MBWayComponent.PROVIDER, o0VarRequireActivity6, paymentMethod4, (MBWayConfiguration) ((MBWayConfiguration.Builder) new MBWayConfiguration.Builder(environment5, AppConstants.INSTANCE.getAdyenClientKey()).setAmount(f0Var.y())).build(), new bj.l(o0VarRequireActivity6, paymentMethod4, xVar4, f0Var, environment5).f6322c, (OrderRequest) null, (String) null, 48, (Object) null);
                                f0Var.Q();
                                f0Var.M(PaymentType.MBWAY.getTitleResId());
                                pg.k kVar4 = f0Var.f45994t;
                                kVar4.getClass();
                                AdyenComponentView adyenComponentView4 = (AdyenComponentView) kVar4.f34929c;
                                LifecycleOwner viewLifecycleOwner5 = f0Var.getViewLifecycleOwner();
                                viewLifecycleOwner5.getClass();
                                adyenComponentView4.attach(mBWayComponent, viewLifecycleOwner5);
                            }
                            break;
                        } else if (o2Var instanceof ui.a0) {
                            ui.a0 a0Var = (ui.a0) o2Var;
                            PaymentMethod paymentMethod5 = a0Var.f41166b;
                            Environment environment6 = a0Var.f41167c;
                            if (f0Var.requireActivity().isFinishing()) {
                                Toast.makeText(f0Var.requireContext(), R.string.generic_err_undefined_error, 0).show();
                            } else {
                                yi.x xVar5 = new yi.x(f0Var, 2);
                                o0 o0VarRequireActivity7 = f0Var.requireActivity();
                                o0VarRequireActivity7.getClass();
                                BlikComponent blikComponent = (BlikComponent) PaymentComponentProvider.DefaultImpls.get$default(BlikComponent.PROVIDER, o0VarRequireActivity7, paymentMethod5, (BlikConfiguration) ((BlikConfiguration.Builder) new BlikConfiguration.Builder(environment6, AppConstants.INSTANCE.getAdyenClientKey()).setAmount(f0Var.y())).build(), new bj.d(o0VarRequireActivity7, paymentMethod5, xVar5, f0Var, environment6).f6300c, (OrderRequest) null, (String) null, 48, (Object) null);
                                f0Var.Q();
                                f0Var.M(PaymentType.BLIK.getTitleResId());
                                pg.k kVar5 = f0Var.f45994t;
                                kVar5.getClass();
                                AdyenComponentView adyenComponentView5 = (AdyenComponentView) kVar5.f34929c;
                                LifecycleOwner viewLifecycleOwner6 = f0Var.getViewLifecycleOwner();
                                viewLifecycleOwner6.getClass();
                                adyenComponentView5.attach(blikComponent, viewLifecycleOwner6);
                            }
                            break;
                        } else {
                            boolean z12 = o2Var instanceof d0;
                            String str = AppConstants.RETURN_URL_ITEMVIEW_ADYEN;
                            if (z12) {
                                d0 d0Var = (d0) o2Var;
                                PaymentMethod paymentMethod6 = d0Var.f41183b;
                                Environment environment7 = d0Var.f41184c;
                                yi.x xVar6 = new yi.x(f0Var, 0);
                                o0 o0VarRequireActivity8 = f0Var.requireActivity();
                                o0VarRequireActivity8.getClass();
                                CashAppPayComponent cashAppPayComponent = (CashAppPayComponent) PaymentComponentProvider.DefaultImpls.get$default(CashAppPayComponent.PROVIDER, o0VarRequireActivity8, paymentMethod6, (CashAppPayConfiguration) ((CashAppPayConfiguration.Builder) new CashAppPayConfiguration.Builder(environment7, AppConstants.INSTANCE.getAdyenClientKey()).setReturnUrl(AppConstants.RETURN_URL_ITEMVIEW_ADYEN).setAmount(f0Var.y())).build(), new bj.h(o0VarRequireActivity8, paymentMethod6, xVar6, f0Var, environment7).f6312c, (OrderRequest) null, (String) null, 48, (Object) null);
                                f0Var.M(PaymentType.CASH_APP_PAY.getTitleResId());
                                pg.k kVar6 = f0Var.f45994t;
                                kVar6.getClass();
                                AdyenComponentView adyenComponentView6 = (AdyenComponentView) kVar6.f34929c;
                                LifecycleOwner viewLifecycleOwner7 = f0Var.getViewLifecycleOwner();
                                viewLifecycleOwner7.getClass();
                                adyenComponentView6.attach(cashAppPayComponent, viewLifecycleOwner7);
                                f0Var.Q();
                                break;
                            } else if (o2Var instanceof z0) {
                                ModelObject.Serializer<StoredPaymentMethod> serializer = StoredPaymentMethod.SERIALIZER;
                                PaymentMethods paymentMethods5 = f0Var.f45988n;
                                paymentMethods5.getClass();
                                String adyenPayload = paymentMethods5.getAdyenPayload();
                                adyenPayload.getClass();
                                StoredPaymentMethod storedPaymentMethod = (StoredPaymentMethod) serializer.deserialize(new JSONObject(adyenPayload));
                                PaymentMethods paymentMethods6 = f0Var.f45988n;
                                paymentMethods6.getClass();
                                boolean showZipcode = paymentMethods6.getShowZipcode();
                                PaymentMethods paymentMethods7 = f0Var.f45988n;
                                paymentMethods7.getClass();
                                f0Var.s(storedPaymentMethod, showZipcode, PaymentMethodsKt.getAdyenEnvironment(paymentMethods7));
                                break;
                            } else if (o2Var instanceof v0) {
                                v0 v0Var = (v0) o2Var;
                                QrCodeAction qrCodeAction = v0Var.f41286b;
                                Environment environment8 = v0Var.f41287c;
                                f0Var.f45985j = "QRcode";
                                QRCodeComponent qrComponent = f0Var.x().getQrComponent(c0Var, environment8);
                                o0 o0VarRequireActivity9 = f0Var.requireActivity();
                                o0VarRequireActivity9.getClass();
                                qrComponent.handleAction(qrCodeAction, o0VarRequireActivity9);
                                f0Var.f45987m = true;
                                if (f0Var.f45989o == null && (paymentMethods2 = (PaymentMethods) f0Var.A().f8353o.f45488a.getValue()) != null) {
                                    f0.R(f0Var, paymentMethods2, null, null, 14);
                                }
                                if (f0Var.B().g() != null && f0Var.A().h() != null) {
                                    f0Var.B().f8385a.d(Boolean.TRUE, "resumePolling");
                                    s0 s0VarB2 = f0Var.B();
                                    String strG = f0Var.B().g();
                                    strG.getClass();
                                    String strH2 = f0Var.A().h();
                                    strH2.getClass();
                                    s0VarB2.i(strG, strH2);
                                    break;
                                }
                            } else if (o2Var instanceof y0) {
                                y0 y0Var = (y0) o2Var;
                                Action action2 = y0Var.f41299b;
                                Environment environment9 = y0Var.f41300c;
                                f0Var.f45985j = "Redirect";
                                RedirectComponent redirectComponent = f0Var.x().getRedirectComponent(c0Var, environment9);
                                o0 o0VarRequireActivity10 = f0Var.requireActivity();
                                o0VarRequireActivity10.getClass();
                                redirectComponent.handleAction(action2, o0VarRequireActivity10);
                                f0Var.f45987m = true;
                                bg.b1 b1Var = f0Var.f45989o;
                                if (b1Var == null) {
                                    PaymentMethods paymentMethods8 = (PaymentMethods) f0Var.A().f8353o.f45488a.getValue();
                                    if (paymentMethods8 != null) {
                                        f0.R(f0Var, paymentMethods8, PaymentProvider.ADYEN, action2, 8);
                                    }
                                } else {
                                    bg.b1.r(b1Var, PaymentProvider.ADYEN, action2, null, null, 12);
                                }
                                if (f0Var.B().g() != null && f0Var.A().h() != null) {
                                    f0Var.B().f8385a.d(Boolean.TRUE, "resumePolling");
                                    s0 s0VarB3 = f0Var.B();
                                    String strG2 = f0Var.B().g();
                                    strG2.getClass();
                                    String strH3 = f0Var.A().h();
                                    strH3.getClass();
                                    s0VarB3.i(strG2, strH3);
                                    break;
                                }
                            } else if (o2Var instanceof ui.n) {
                                ui.n nVar = (ui.n) o2Var;
                                AwaitAction awaitAction = nVar.f41251b;
                                Environment environment10 = nVar.f41252c;
                                f0Var.f45985j = "Await";
                                AwaitComponent awaitComponent = f0Var.x().getAwaitComponent(c0Var, environment10);
                                o0 o0VarRequireActivity11 = f0Var.requireActivity();
                                o0VarRequireActivity11.getClass();
                                awaitComponent.handleAction(awaitAction, o0VarRequireActivity11);
                                f0Var.f45987m = true;
                                if (f0Var.f45989o == null && (paymentMethods = (PaymentMethods) f0Var.A().f8353o.f45488a.getValue()) != null) {
                                    f0.R(f0Var, paymentMethods, null, null, 14);
                                    break;
                                }
                            } else if (o2Var instanceof u1) {
                                PaymentMethods paymentMethods9 = ((u1) o2Var).f41281b;
                                String strH4 = f0Var.A().h();
                                if (strH4 != null) {
                                    PriceSpecification priceSpecification4 = (PriceSpecification) f0Var.A().f8349j.f45488a.getValue();
                                    Price total2 = priceSpecification4 != null ? priceSpecification4.getTotal() : null;
                                    if (total2 == null) {
                                        f0Var.w("totalPrice is null");
                                    } else {
                                        s0 s0VarB4 = f0Var.B();
                                        String strZ2 = f0Var.z();
                                        BasicItem basicItemF2 = f0Var.A().f();
                                        String pickupWindowStartSecond2 = (basicItemF2 == null || (pickupIntervalL = mv.d.l(basicItemF2)) == null) ? null : pickupIntervalL.getPickupWindowStartSecond();
                                        PriceSpecification priceSpecification5 = (PriceSpecification) f0Var.A().f8349j.f45488a.getValue();
                                        Map<VoucherId, Price> voucherWithPriceMap2 = priceSpecification5 != null ? priceSpecification5.getVoucherWithPriceMap() : null;
                                        paymentMethods9.getClass();
                                        s0.o(s0VarB4, new AuthorizationPayload((String) null, (String) null, false, (String) null, AuthPayloadType.CHARITY_AUTH_PAYLOAD, (String) null, (String) null, (String) null, (String) null, 495, (DefaultConstructorMarker) null), paymentMethods9, strH4, total2, voucherWithPriceMap2, null, strZ2, pickupWindowStartSecond2);
                                    }
                                } else {
                                    f0Var.w("orderId is null");
                                }
                                break;
                            } else if (o2Var instanceof a2) {
                                f0Var.dismissAllowingStateLoss();
                                f0Var.B().c();
                                int i14 = yi.b0.$EnumSwitchMapping$1[((a2) o2Var).f41169b.ordinal()];
                                if (i14 == 1) {
                                    f0Var.N(Integer.valueOf(R.string.order_has_been_canceled_popup_description), R.string.order_has_been_canceled_popup_title);
                                    break;
                                } else if (i14 == 2) {
                                    f0Var.N(null, R.string.cancel_order_error_already_cancelled);
                                    break;
                                } else if (i14 == 3) {
                                    String strH5 = f0Var.A().h();
                                    if (strH5 != null) {
                                        f0Var.H(strH5);
                                    } else {
                                        f0Var.N(null, R.string.cancel_order_error_deadline_exceeded);
                                    }
                                    break;
                                }
                            } else if (o2Var instanceof d2) {
                                f0Var.D(((d2) o2Var).f41186b);
                                break;
                            } else if (o2Var instanceof h2) {
                                f0.v(f0Var, false, 2);
                                f0Var.A().s(cv.i.DEBUG_CHECKOUT_FAILED, h0.g.E(new Pair(dv.a.CHECKOUT_ERROR_CAUSE, new dv.c("PAYMENT_TIMED_OUT"))));
                                k0 k0Var = new k0(f0Var.requireActivity());
                                k0Var.e(R.string.generic_err_undefined_error);
                                k0Var.c(android.R.string.ok);
                                k0Var.f6179j = false;
                                k0Var.f6180k = true;
                                View viewRequireView = f0Var.requireView();
                                viewRequireView.getClass();
                                k0Var.f6184p = viewRequireView;
                                k0Var.l = new yi.w(f0Var, i13);
                                k0Var.f();
                                break;
                            } else if (o2Var instanceof i2) {
                                w0 w0Var3 = f0Var.l;
                                if (w0Var3 != null) {
                                    w0Var3.a();
                                }
                                f0.v(f0Var, false, 2);
                                f0Var.B().c();
                                zi.e eVar = f0Var.f45983h;
                                if (eVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("paymentCallbacks");
                                    eVar = null;
                                }
                                boolean z13 = f0Var.A().f8334b0;
                                BasicItem basicItemF3 = f0Var.A().f();
                                aj.c cVarD = f0Var.A().d();
                                String strJ = f0Var.B().j();
                                if (strJ != null) {
                                    str = strJ;
                                }
                                eVar.e(z13, basicItemF3, cVarD, str);
                                f0Var.dismissAllowingStateLoss();
                                f0Var.A().s(cv.i.DEBUG_CHECKOUT_FAILED, h0.g.E(new Pair(dv.a.CHECKOUT_ERROR_CAUSE, new dv.c(aj.d.ORDER_ABORTED + ", BackendResponse"))));
                                break;
                            } else if (!(o2Var instanceof g2)) {
                                boolean z14 = o2Var instanceof k2;
                                String str2 = AppConstants.RETURN_URL_ITEMVIEW_SATISPAY;
                                if (z14) {
                                    PaymentMethods paymentMethods10 = (PaymentMethods) f0Var.A().f8353o.f45488a.getValue();
                                    if (paymentMethods10 != null) {
                                        f0.R(f0Var, paymentMethods10, null, null, 14);
                                    }
                                    AuthorizationPayload authorizationPayload = new AuthorizationPayload((String) null, (String) null, false, (String) null, AuthPayloadType.SATISPAY_AUTH_PAYLOAD, (String) null, (String) null, (String) null, (String) null, 495, (DefaultConstructorMarker) null);
                                    s0 s0VarB5 = f0Var.B();
                                    String strJ2 = s0VarB5.j();
                                    if (strJ2 != null) {
                                        int iHashCode2 = strJ2.hashCode();
                                        if (iHashCode2 != -1519864232) {
                                            if (iHashCode2 != 551410120) {
                                                if (iHashCode2 == 1368001256 && strJ2.equals(AppConstants.RETURN_URL_PARCELBASKET_ADYEN)) {
                                                    str2 = AppConstants.RETURN_URL_PARCELBASKET_SATISPAY;
                                                }
                                            } else if (strJ2.equals(AppConstants.RETURN_URL_MANUFACTURE_ADYEN)) {
                                                str2 = AppConstants.RETURN_URL_MANUFACTURE_SATISPAY;
                                            }
                                        } else if (strJ2.equals(AppConstants.RETURN_URL_CATERING_ADYEN)) {
                                            str2 = AppConstants.RETURN_URL_CATERING_SATISPAY;
                                        }
                                    }
                                    s0VarB5.f8385a.d(str2, "returnUrl");
                                    f0Var.I(authorizationPayload);
                                } else if (o2Var instanceof j2) {
                                    f0Var.L(((j2) o2Var).f41227b);
                                } else if (o2Var instanceof w1) {
                                    AuthorizationPayload authorizationPayload2 = new AuthorizationPayload((String) null, (String) null, false, (String) null, AuthPayloadType.EDENRED_AUTH_PAYLOAD, (String) null, (String) null, (String) null, (String) null, 495, (DefaultConstructorMarker) null);
                                    f0Var.B().f8385a.d(AppConstants.RETURN_URL_ITEMVIEW_SATISPAY, "returnUrl");
                                    f0Var.I(authorizationPayload2);
                                } else if (o2Var instanceof x1) {
                                    f0Var.K(((x1) o2Var).f41294b);
                                } else if (o2Var instanceof n2) {
                                    f0Var.H(((n2) o2Var).f41254b);
                                } else {
                                    e40.a.f();
                                }
                                break;
                            } else {
                                Throwable th4 = ((g2) o2Var).f41204b;
                                if (!(th4 instanceof CancellationException)) {
                                    s0 s0VarB6 = f0Var.B();
                                    if (!(s0VarB6.g() == null ? false : ((Boolean) v80.f0.E(kotlin.coroutines.g.f26549a, new l0(s0VarB6, null))).booleanValue())) {
                                        w0 w0Var4 = f0Var.l;
                                        if (w0Var4 != null) {
                                            w0Var4.a();
                                        }
                                        f0.v(f0Var, false, 2);
                                        Context contextRequireContext4 = f0Var.requireContext();
                                        contextRequireContext4.getClass();
                                        r0.o(contextRequireContext4, th4);
                                        f0Var.dismissAllowingStateLoss();
                                        f0Var.B().c();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
