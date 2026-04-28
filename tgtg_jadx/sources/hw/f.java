package hw;

import com.app.tgtg.model.remote.order.AdditionalOrderInformation;
import com.app.tgtg.model.remote.order.MonthlyOrders;
import com.app.tgtg.model.remote.order.Order;
import com.braze.requests.g;
import com.braze.requests.h;
import com.braze.requests.j;
import com.braze.requests.k;
import com.braze.requests.l;
import com.braze.requests.r;
import com.braze.requests.s;
import com.braze.requests.w;
import com.braze.requests.x;
import com.braze.requests.y;
import com.tgtg.componentlibrary.component.checkbox.ComposableSingletons$DemoPantryCheckboxKt;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22555a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22555a) {
            case 0:
                return com.braze.requests.f.l();
            case 1:
                return g.d();
            case 2:
                return g.l();
            case 3:
                return g.m();
            case 4:
                return h.l();
            case 5:
                return j.m();
            case 6:
                return j.l();
            case 7:
                return j.n();
            case 8:
                return k.l();
            case 9:
                return l.l();
            case 10:
                return r.d();
            case 11:
                return s.m();
            case 12:
                return s.l();
            case 13:
                return w.l();
            case 14:
                return x.d();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return y.l();
            case 16:
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                return Unit.f26487a;
            case 17:
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt2 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                return Unit.f26487a;
            case 18:
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt3 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                return Unit.f26487a;
            case 19:
                return Unit.f26487a;
            case 20:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 21:
                return new i90.f("com.app.tgtg.feature.charity.ui.home.BottomNavItem", Reflection.getOrCreateKotlinClass(ii.h.class), new KClass[]{Reflection.getOrCreateKotlinClass(ii.e.class), Reflection.getOrCreateKotlinClass(ii.f.class), Reflection.getOrCreateKotlinClass(ii.g.class)}, new KSerializer[]{new i90.a("com.app.tgtg.feature.charity.ui.home.BottomNavItem.Home", ii.e.INSTANCE, new Annotation[0]), new i90.a("com.app.tgtg.feature.charity.ui.home.BottomNavItem.Plan", ii.f.INSTANCE, new Annotation[0]), new i90.a("com.app.tgtg.feature.charity.ui.home.BottomNavItem.Profile", ii.g.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 22:
                return new i90.a("com.app.tgtg.feature.charity.ui.home.BottomNavItem.Home", ii.e.INSTANCE, new Annotation[0]);
            case 23:
                return new i90.a("com.app.tgtg.feature.charity.ui.home.BottomNavItem.Plan", ii.f.INSTANCE, new Annotation[0]);
            case 24:
                return new i90.a("com.app.tgtg.feature.charity.ui.home.BottomNavItem.Profile", ii.g.INSTANCE, new Annotation[0]);
            case 25:
                return Unit.f26487a;
            case 26:
                return AdditionalOrderInformation._childSerializers$_anonymous_();
            case 27:
                return MonthlyOrders._childSerializers$_anonymous_();
            case 28:
                return Order._childSerializers$_anonymous_();
            default:
                return Order._childSerializers$_anonymous_$0();
        }
    }

    public /* synthetic */ f(int i11) {
        this.f22555a = i11;
    }
}
