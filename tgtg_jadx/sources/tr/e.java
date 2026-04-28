package tr;

import android.os.Build;
import com.adyen.checkout.components.core.action.AwaitAction;
import com.adyen.checkout.core.Environment;
import com.app.tgtg.model.remote.support.response.ConsumerSupportResponse;
import com.app.tgtg.model.remote.support.response.SupportPictureUploadResponse;
import com.braze.dispatch.h;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.tgtg.componentlibrary.component.radiobutton.ComposableSingletons$DemoPantryRadioButtonKt;
import java.lang.annotation.Annotation;
import java.util.BitSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.g1;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.iana.AEADAlgorithm;
import ui.a0;
import ui.a1;
import ui.a2;
import ui.b0;
import ui.b2;
import ui.c1;
import ui.d0;
import ui.d1;
import ui.d2;
import ui.e0;
import ui.e2;
import ui.f1;
import ui.g0;
import ui.g2;
import ui.h0;
import ui.h2;
import ui.i1;
import ui.i2;
import ui.j0;
import ui.j1;
import ui.k0;
import ui.l;
import ui.l1;
import ui.l2;
import ui.m0;
import ui.m1;
import ui.n;
import ui.n0;
import ui.n2;
import ui.o1;
import ui.o2;
import ui.p1;
import ui.q0;
import ui.r;
import ui.r1;
import ui.s;
import ui.s0;
import ui.s1;
import ui.t0;
import ui.u;
import ui.u1;
import ui.v;
import ui.v0;
import ui.w0;
import ui.x;
import ui.y;
import ui.y0;
import ui.y1;
import ui.z0;
import v70.p;
import zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveCampaignAnalyticsAction;
import zendesk.android.internal.frontendevents.analyticsevents.model.ProactiveCampaignAnalyticsDTO;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40428a;

    public /* synthetic */ e(u6.f fVar) {
        this.f40428a = 21;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40428a) {
            case 0:
                return new av.e();
            case 1:
                return new av.e();
            case 2:
                return new av.e();
            case 3:
                return ConsumerSupportResponse._childSerializers$_anonymous_();
            case 4:
                return SupportPictureUploadResponse._childSerializers$_anonymous_();
            case 5:
                return com.braze.dispatch.c.a();
            case 6:
                return com.braze.dispatch.c.b();
            case 7:
                return com.braze.dispatch.e.a();
            case 8:
                return com.braze.dispatch.f.a();
            case 9:
                return com.braze.dispatch.f.j();
            case 10:
                return com.braze.dispatch.f.d();
            case 11:
                return com.braze.dispatch.f.e();
            case 12:
                return com.braze.dispatch.f.g();
            case 13:
                return com.braze.dispatch.f.h();
            case 14:
                return com.braze.dispatch.g.a();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return h.d();
            case 16:
                return h.c();
            case 17:
                return h.b();
            case 18:
                return h.a();
            case 19:
                return BrazeActionParser.execute$lambda$1();
            case 20:
                return Boolean.valueOf(Build.BRAND.equals("google"));
            case 21:
                String str = "";
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    Object objInvoke = cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", "");
                    objInvoke.getClass();
                    str = (String) objInvoke;
                } catch (Exception unused) {
                }
                v70.e eVarB = c0.b();
                Iterator it = StringsKt.S(str, new char[]{','}, 6).iterator();
                while (it.hasNext()) {
                    try {
                        eVarB.add(Long.valueOf(Long.parseLong((String) it.next())));
                    } catch (NumberFormatException unused2) {
                    }
                }
                BitSet bitSetValueOf = BitSet.valueOf(CollectionsKt.s0(c0.a(eVarB)));
                int size = bitSetValueOf.size();
                if (size == 0) {
                    return p0.f26531a;
                }
                p pVar = new p(size);
                for (int iNextSetBit = 0; iNextSetBit >= 0; iNextSetBit = bitSetValueOf.nextSetBit(iNextSetBit + 1)) {
                    if (bitSetValueOf.get(iNextSetBit)) {
                        pVar.add(Integer.valueOf(iNextSetBit));
                    }
                    if (iNextSetBit == Integer.MAX_VALUE) {
                        return g1.a(pVar);
                    }
                }
                return g1.a(pVar);
            case 22:
                ComposableSingletons$DemoPantryRadioButtonKt composableSingletons$DemoPantryRadioButtonKt = ComposableSingletons$DemoPantryRadioButtonKt.INSTANCE;
                return Unit.f26487a;
            case 23:
                ComposableSingletons$DemoPantryRadioButtonKt composableSingletons$DemoPantryRadioButtonKt2 = ComposableSingletons$DemoPantryRadioButtonKt.INSTANCE;
                return Unit.f26487a;
            case 24:
                return Unit.f26487a;
            case 25:
                return ProactiveCampaignAnalyticsAction._init_$_anonymous_();
            case 26:
                return ProactiveCampaignAnalyticsDTO._childSerializers$_anonymous_();
            case 27:
                return new i90.f("com.app.tgtg.feature.checkout.PaymentProviderAndOperations", Reflection.getOrCreateKotlinClass(o2.class), new KClass[]{Reflection.getOrCreateKotlinClass(n.class), Reflection.getOrCreateKotlinClass(r.class), Reflection.getOrCreateKotlinClass(u.class), Reflection.getOrCreateKotlinClass(x.class), Reflection.getOrCreateKotlinClass(a0.class), Reflection.getOrCreateKotlinClass(d0.class), Reflection.getOrCreateKotlinClass(g0.class), Reflection.getOrCreateKotlinClass(j0.class), Reflection.getOrCreateKotlinClass(m0.class), Reflection.getOrCreateKotlinClass(ui.p0.class), Reflection.getOrCreateKotlinClass(s0.class), Reflection.getOrCreateKotlinClass(v0.class), Reflection.getOrCreateKotlinClass(y0.class), Reflection.getOrCreateKotlinClass(z0.class), Reflection.getOrCreateKotlinClass(c1.class), Reflection.getOrCreateKotlinClass(f1.class), Reflection.getOrCreateKotlinClass(i1.class), Reflection.getOrCreateKotlinClass(l1.class), Reflection.getOrCreateKotlinClass(o1.class), Reflection.getOrCreateKotlinClass(r1.class), Reflection.getOrCreateKotlinClass(u1.class), Reflection.getOrCreateKotlinClass(a2.class), Reflection.getOrCreateKotlinClass(d2.class), Reflection.getOrCreateKotlinClass(g2.class), Reflection.getOrCreateKotlinClass(h2.class), Reflection.getOrCreateKotlinClass(i2.class), Reflection.getOrCreateKotlinClass(n2.class)}, new KSerializer[]{l.f41233a, ui.p.f41258a, s.f41272a, v.f41284a, y.f41297a, b0.f41173a, e0.f41190a, h0.f41208a, k0.f41230a, n0.f41253a, q0.f41263a, t0.f41277a, w0.f41290a, new i90.a("com.app.tgtg.feature.checkout.PaymentProviderAndOperations.Adyen.Retry", z0.INSTANCE, new Annotation[0]), a1.f41168a, d1.f41185a, ui.g1.f41202a, j1.f41226a, m1.f41241a, p1.f41262a, s1.f41274a, y1.f41301a, b2.f41174a, e2.f41191a, new i90.a("com.app.tgtg.feature.checkout.PaymentProviderAndOperations.Fail.TimeOut", h2.INSTANCE, new Annotation[0]), new i90.a("com.app.tgtg.feature.checkout.PaymentProviderAndOperations.Fail.UserAbort", i2.INSTANCE, new Annotation[0]), l2.f41237a}, new Annotation[0]);
            case 28:
                return new i90.a(Reflection.getOrCreateKotlinClass(AwaitAction.class), new KSerializer[0]);
            default:
                return new i90.a(Reflection.getOrCreateKotlinClass(Environment.class), new KSerializer[0]);
        }
    }

    public /* synthetic */ e(int i11) {
        this.f40428a = i11;
    }
}
