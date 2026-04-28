package us;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.m1;
import at.c0;
import b5.o0;
import c5.f1;
import c5.q2;
import c5.x1;
import c5.x3;
import com.adyen.checkout.googlepay.AllowedCardNetworks;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.postpurchase.specialrewards.SpecialRewardCelebrationFragment;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.manufacturer.response.ItemDetailsFaqItem;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.order.OrderType;
import com.app.tgtg.model.remote.order.response.CreateOrderResponse;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.voucher.VoucherMode;
import com.braze.images.DefaultBrazeImageLoader;
import com.google.firebase.messaging.a0;
import g4.g0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import m3.b1;
import m3.c3;
import m5.t0;
import mv.r0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.u1;
import ss.j1;
import ss.k1;
import ss.w0;
import um.u;
import v1.p0;
import v80.f0;
import w.q0;
import w2.e1;
import w2.j0;
import w2.m0;
import w2.n0;
import w2.q1;
import w2.s1;
import w2.v0;
import x2.w;
import x90.v;
import x90.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41533c;

    public /* synthetic */ j(t5.a aVar, k1 k1Var) {
        this.f41531a = 1;
        this.f41532b = aVar;
        this.f41533c = k1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, x90.z] */
    /* JADX WARN: Type inference failed for: r15v0, types: [m5.t0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jA;
        int i11 = 0;
        int i12 = 4;
        int i13 = 2;
        int i14 = 3;
        vVarArr = null;
        v[] vVarArr = null;
        switch (this.f41531a) {
            case 0:
                j1 j1Var = (j1) this.f41533c;
                t5.a aVar = (t5.a) this.f41532b;
                String termsLink = j1Var.f39193a.getTermsLink();
                if (termsLink != null) {
                    aVar.getClass();
                    c0.c((c0) aVar.f39793d, termsLink, ct.a.TERMS_AND_CONDITIONS, Integer.valueOf(R.string.webview_terms_and_condition_title), false, 24);
                }
                return Unit.f26487a;
            case 1:
                t5.a aVar2 = (t5.a) this.f41532b;
                VoucherMode voucherMode = ((k1) this.f41533c).f39204e;
                aVar2.getClass();
                voucherMode.getClass();
                ((w0) aVar2.f39791b).f39263c.i(new ts.j(voucherMode));
                return Unit.f26487a;
            case 2:
                v1.o oVar = (v1.o) this.f41533c;
                o0 o0Var = (o0) this.f41532b;
                oVar.f41811w = oVar.f41806r.a(o0Var.f5908a.d(), o0Var.getLayoutDirection(), o0Var);
                return Unit.f26487a;
            case 3:
                ((Ref.ObjectRef) this.f41533c).element = b5.o.e((p0) this.f41532b, z4.k1.f47165a);
                return Unit.f26487a;
            case 4:
                pm.m mVar = (pm.m) this.f41533c;
                ItemDetailsFaqItem itemDetailsFaqItem = (ItemDetailsFaqItem) this.f41532b;
                mVar.invoke(itemDetailsFaqItem.getLinkUrl(), itemDetailsFaqItem.getQuestion());
                return Unit.f26487a;
            case 5:
                ((cj.q) this.f41533c).q((PaymentMethods) this.f41532b);
                return Unit.f26487a;
            case 6:
                cj.q qVar = (cj.q) this.f41533c;
                ((b1) this.f41532b).setValue(null);
                qVar.getClass();
                f0.E(kotlin.coroutines.g.f26549a, new cj.c(qVar, , 5));
                return Unit.f26487a;
            case 7:
                ((Function1) this.f41533c).invoke((PaymentMethods) this.f41532b);
                return Unit.f26487a;
            case 8:
                ((u) this.f41533c).j(ItemId.m198constructorimpl(((BasketItem) this.f41532b).getItemId()), f70.i.SCREEN_BASKET);
                return Unit.f26487a;
            case 9:
                return com.braze.events.b.a((Class) this.f41533c, (Set) this.f41532b);
            case 10:
                q0 q0Var = (q0) this.f41533c;
                List list = (List) this.f41532b;
                s0.g gVar = c0.g.f6802a;
                return Boolean.valueOf(c0.g.a(q0Var.f42751a, list));
            case 11:
                v0 v0Var = (v0) this.f41533c;
                Ref.IntRef intRef = (Ref.IntRef) this.f41532b;
                v0Var.f43057t.d();
                if (v0Var.isAttached() && ((q2) ((x3) b5.o.e(v0Var, x1.f7427t))).b()) {
                    i13 = 1;
                }
                int i15 = intRef.element;
                int i16 = i13 * i15;
                intRef.element = i15 * (-1);
                return Integer.valueOf(i16);
            case 12:
                w wVar = (w) this.f41533c;
                e1 e1Var = (e1) this.f41532b;
                if (!wVar.f43784d) {
                    p0 p0Var = e1Var.f42886y;
                    if (p0Var.isAttached()) {
                        ((g0) p0Var.f41820v).S0(7);
                    }
                }
                return Unit.f26487a;
            case 13:
                s1 s1Var = (s1) this.f41533c;
                n0 n0Var = (n0) this.f41532b;
                v2.b bVarB = s1Var.f43043a.b();
                m0 m0Var = (m0) s1Var.f43046d.getValue();
                j0 j0Var = new j0();
                j0Var.f42945a = new int[30];
                StringBuilder sb2 = new StringBuilder();
                boolean z11 = false;
                while (i11 < bVarB.f41928c.length()) {
                    int iCodePointAt = Character.codePointAt(bVarB, i11);
                    n0Var.getClass();
                    int i17 = iCodePointAt == 10 ? 32 : iCodePointAt == 13 ? 65279 : iCodePointAt;
                    int iCharCount = Character.charCount(iCodePointAt);
                    if (i17 != iCodePointAt) {
                        j0Var.c(sb2.length(), sb2.length() + iCharCount, Character.charCount(i17));
                        z11 = true;
                    }
                    sb2.appendCodePoint(i17);
                    i11 += iCharCount;
                    z11 = z11;
                }
                CharSequence string = z11 ? sb2.toString() : bVarB;
                if (string == bVarB) {
                    return null;
                }
                long jC = n0.c(bVarB.f41929d, j0Var, m0Var);
                t0 t0Var = bVarB.f41930e;
                return new q1(new v2.b(string, jC, t0Var != null ? new t0(n0.c(t0Var.f29650a, j0Var, m0Var)) : 0, null, null, null, 56), j0Var);
            case 14:
                SpecialRewardCelebrationFragment specialRewardCelebrationFragment = (SpecialRewardCelebrationFragment) this.f41533c;
                ((b1) this.f41532b).setValue(Boolean.TRUE);
                qo.h hVar = (qo.h) specialRewardCelebrationFragment.f9225f.getValue();
                cv.i iVar = cv.i.ACTION_UNWRAP_SPECIAL_REWARD;
                iVar.getClass();
                hVar.f37209b.c(iVar, null);
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                x90.n nVar = (x90.n) this.f41533c;
                v vVar = (v) this.f41532b;
                try {
                    nVar.f44132a.b(vVar);
                    break;
                } catch (IOException e5) {
                    aa0.e eVar = aa0.e.f1191a;
                    aa0.e.f1191a.i(4, "Http2Connection.Listener failure for " + nVar.f44134c, e5);
                    try {
                        vVar.c(x90.b.PROTOCOL_ERROR, e5);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return Unit.f26487a;
            case 16:
                x90.m mVar2 = (x90.m) this.f41533c;
                z zVar = (z) this.f41532b;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                x90.n nVar2 = mVar2.f44130b;
                synchronized (nVar2.f44153w) {
                    synchronized (nVar2) {
                        try {
                            z zVar2 = nVar2.f44148r;
                            ?? zVar3 = new z();
                            zVar2.getClass();
                            for (int i18 = 0; i18 < 10; i18++) {
                                if (((1 << i18) & zVar2.f44207a) != 0) {
                                    zVar3.b(i18, zVar2.f44208b[i18]);
                                }
                            }
                            for (int i19 = 0; i19 < 10; i19++) {
                                if (((1 << i19) & zVar.f44207a) != 0) {
                                    zVar3.b(i19, zVar.f44208b[i19]);
                                }
                            }
                            objectRef.element = zVar3;
                            jA = ((long) zVar3.a()) - ((long) zVar2.a());
                            if (jA != 0 && !nVar2.f44133b.isEmpty()) {
                                vVarArr = (v[]) nVar2.f44133b.values().toArray(new v[0]);
                            }
                            z zVar4 = (z) objectRef.element;
                            zVar4.getClass();
                            nVar2.f44148r = zVar4;
                            t90.c.b(nVar2.f44141j, nVar2.f44134c + " onSettings", 0L, new j(17, nVar2, objectRef), 6);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        nVar2.f44153w.a((z) objectRef.element);
                    } catch (IOException e11) {
                        x90.b bVar = x90.b.PROTOCOL_ERROR;
                        nVar2.a(bVar, bVar, e11);
                    }
                    break;
                }
                if (vVarArr != null) {
                    int length = vVarArr.length;
                    while (i11 < length) {
                        v vVar2 = vVarArr[i11];
                        synchronized (vVar2) {
                            vVar2.f44189e += jA;
                            if (jA > 0) {
                                vVar2.notifyAll();
                            }
                        }
                        i11++;
                    }
                }
                return Unit.f26487a;
            case 17:
                x90.n nVar3 = (x90.n) this.f41533c;
                nVar3.f44132a.a(nVar3, (z) ((Ref.ObjectRef) this.f41532b).element);
                return Unit.f26487a;
            case 18:
                b1 b1Var = (b1) this.f41533c;
                pi.m mVar3 = (pi.m) this.f41532b;
                b1Var.setValue(Boolean.FALSE);
                mVar3.getClass();
                f0.E(kotlin.coroutines.g.f26549a, new pi.j(mVar3, , i12));
                return Unit.f26487a;
            case 19:
                yn.v vVar3 = (yn.v) this.f41533c;
                a0 a0Var = (a0) this.f41532b;
                MainActivity mainActivity = (MainActivity) a0Var.f12782e;
                BriefOrder briefOrder = vVar3.f46311a;
                OrderState orderState = briefOrder.getOrderState();
                if ((orderState != null ? xn.d.$EnumSwitchMapping$0[orderState.ordinal()] : -1) == 1) {
                    OrderType orderType = briefOrder.getOrderType();
                    OrderType orderType2 = OrderType.MANUFACTURER;
                    hm.v vVar4 = (hm.v) a0Var.f12780c;
                    if (orderType == orderType2) {
                        vVar4.d(cv.i.ACTION_BROWSE_OTHER_PARCELS, null);
                        mainActivity.k0(mv.z.MANUFACTURER, f70.i.ORDER_POPUP);
                    } else {
                        vVar4.d(cv.i.ACTION_BROWSE_OTHER_BAGS, null);
                    }
                } else if (briefOrder.getInvitationId() != null) {
                    String invitationId = briefOrder.getInvitationId();
                    OrderType orderType3 = briefOrder.getOrderType();
                    if (orderType3 == null) {
                        orderType3 = OrderType.MAGICBAG;
                    }
                    p30.b.w(mainActivity, new io.a(null, invitationId, orderType3, false, f70.i.ORDER_CHANGED_POPUP, 89), null);
                } else {
                    String strM321getOrderIdreIZeYA = briefOrder.m321getOrderIdreIZeYA();
                    OrderType orderType4 = briefOrder.getOrderType();
                    if (orderType4 == null) {
                        orderType4 = OrderType.MAGICBAG;
                    }
                    p30.b.w(mainActivity, new io.a(strM321getOrderIdreIZeYA, null, orderType4, false, f70.i.ORDER_CHANGED_POPUP, 90), null);
                }
                mainActivity.f9083j.d((u1) a0Var.f12781d);
                return Unit.f26487a;
            case 20:
                yn.l lVar = (yn.l) this.f41533c;
                a0 a0Var2 = (a0) this.f41532b;
                if (lVar.f46298a && Intrinsics.areEqual(bo.d.f6548b.name(), AllowedCardNetworks.DISCOVER)) {
                    km.a aVarA = ((bo.d) a0Var2.f12779b).a();
                    aVarA.getClass();
                    ((fn.t) aVarA).r();
                    hm.v vVar5 = (hm.v) a0Var2.f12780c;
                    vVar5.getClass();
                    f0.B(m1.d(vVar5), null, null, new hm.q(vVar5, , i13), 3);
                }
                return Unit.f26487a;
            case 21:
                xn.b bVar2 = (xn.b) this.f41533c;
                a0 a0Var3 = (a0) this.f41532b;
                bVar2.invoke();
                ((MainActivity) a0Var3.f12782e).f9083j.d((u1) a0Var3.f12781d);
                return Unit.f26487a;
            case 22:
                xn.b bVar3 = (xn.b) this.f41533c;
                a0 a0Var4 = (a0) this.f41532b;
                bVar3.invoke();
                ((MainActivity) a0Var4.f12782e).f9083j.d((u1) a0Var4.f12781d);
                return Unit.f26487a;
            case 23:
                yn.h hVar2 = (yn.h) this.f41533c;
                a0 a0Var5 = (a0) this.f41532b;
                BriefOrder briefOrder2 = hVar2.f46284a;
                String strM321getOrderIdreIZeYA2 = briefOrder2.m321getOrderIdreIZeYA();
                MainActivity mainActivity2 = (MainActivity) a0Var5.f12782e;
                OrderType orderType5 = briefOrder2.getOrderType();
                if (orderType5 == null) {
                    orderType5 = OrderType.MAGICBAG;
                }
                p30.b.w(mainActivity2, new io.a(strM321getOrderIdreIZeYA2, null, orderType5, false, f70.i.ORDER_CHANGED_POPUP, 90), null);
                mainActivity2.f9083j.d((u1) a0Var5.f12781d);
                return Unit.f26487a;
            case 24:
                return DefaultBrazeImageLoader.getBitmapFromCache$lambda$13$lambda$12((String) this.f41533c, (DefaultBrazeImageLoader) this.f41532b);
            case 25:
                return DefaultBrazeImageLoader.shouldSkipCaching$lambda$7$lambda$6((Map.Entry) this.f41533c, (Uri) this.f41532b);
            case 26:
                yi.r rVar = (yi.r) this.f41533c;
                f1 f1Var = (f1) this.f41532b;
                String strK = rVar.v().k();
                if (strK != null) {
                    f1Var.a(strK);
                }
                return Unit.f26487a;
            case 27:
                yi.r rVar2 = (yi.r) this.f41533c;
                if (((CreateOrderResponse.CreateOrderState) ((c3) this.f41532b).getValue()) != CreateOrderResponse.CreateOrderState.MISSING_TAX_DATA) {
                    rVar2.dismiss();
                    yi.v vVar6 = rVar2.f46020k;
                    if (vVar6 != null) {
                        vVar6.b();
                    }
                } else {
                    cj.q qVarV = rVar2.v();
                    f0.B(m1.d(qVarV), null, null, new cj.c(qVarV, , i14), 3);
                    g9.f0 f0Var = rVar2.f46018i;
                    if (f0Var != null) {
                        g9.p.f(f0Var, aj.e.CHECKOUT.a());
                    }
                }
                return Unit.f26487a;
            case 28:
                ((Function1) this.f41533c).invoke((vj.j) this.f41532b);
                return Unit.f26487a;
            default:
                ((xj.k) this.f41533c).b(r0.u((Context) this.f41532b), true);
                return Unit.f26487a;
        }
    }

    public /* synthetic */ j(int i11, Object obj, Object obj2) {
        this.f41531a = i11;
        this.f41533c = obj;
        this.f41532b = obj2;
    }
}
