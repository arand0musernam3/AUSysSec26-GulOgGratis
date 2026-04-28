package xh;

import com.app.tgtg.feature.charity.ui.model.CharityIdError;
import com.app.tgtg.model.remote.badge.BadgeCollection;
import com.app.tgtg.model.remote.voucher.CountryBasedVoucher;
import com.app.tgtg.model.remote.voucher.CurrencyBasedVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.app.tgtg.model.remote.voucher.UnknownVoucher;
import com.braze.images.DefaultBrazeImageLoader;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44312a;

    public /* synthetic */ d(int i11) {
        this.f44312a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44312a) {
            case 0:
                return Unit.f26487a;
            case 1:
                return Unit.f26487a;
            case 2:
                return new i90.f("com.app.tgtg.feature.charity.domain.NavigationCharity", Reflection.getOrCreateKotlinClass(b0.class), new KClass[]{Reflection.getOrCreateKotlinClass(k.class), Reflection.getOrCreateKotlinClass(n.class), Reflection.getOrCreateKotlinClass(r.class), Reflection.getOrCreateKotlinClass(s.class), Reflection.getOrCreateKotlinClass(t.class), Reflection.getOrCreateKotlinClass(u.class), Reflection.getOrCreateKotlinClass(v.class), Reflection.getOrCreateKotlinClass(w.class), Reflection.getOrCreateKotlinClass(z.class), Reflection.getOrCreateKotlinClass(a0.class)}, new KSerializer[]{i.f44328a, l.f44334a, p.f44338a, new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.NotificationsSettingsScreen", s.INSTANCE, new Annotation[0]), new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.OrderViewScreen", t.INSTANCE, new Annotation[0]), new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.PartnerStoresScreen", u.INSTANCE, new Annotation[0]), new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.PostPurchaseScreen", v.INSTANCE, new Annotation[0]), new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.ReservationHistoryScreen", w.INSTANCE, new Annotation[0]), x.f44347a, new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.SuccessfulCollectionScreen", a0.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 3:
                return new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.CharityGraph", h.INSTANCE, new Annotation[0]);
            case 4:
                return new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.NotificationsSettingsScreen", s.INSTANCE, new Annotation[0]);
            case 5:
                return new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.OrderViewScreen", t.INSTANCE, new Annotation[0]);
            case 6:
                return new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.PartnerStoresScreen", u.INSTANCE, new Annotation[0]);
            case 7:
                return new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.PostPurchaseScreen", v.INSTANCE, new Annotation[0]);
            case 8:
                return new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.ReservationHistoryScreen", w.INSTANCE, new Annotation[0]);
            case 9:
                return new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharity.SuccessfulCollectionScreen", a0.INSTANCE, new Annotation[0]);
            case 10:
                return new i90.f("com.app.tgtg.feature.charity.domain.NavigationCharityConnect", Reflection.getOrCreateKotlinClass(m0.class), new KClass[]{Reflection.getOrCreateKotlinClass(d0.class), Reflection.getOrCreateKotlinClass(f0.class), Reflection.getOrCreateKotlinClass(i0.class), Reflection.getOrCreateKotlinClass(l0.class)}, new KSerializer[]{new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharityConnect.CharitySignupSettingsScreen", d0.INSTANCE, new Annotation[0]), new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharityConnect.ConnectCharityScreen", f0.INSTANCE, new Annotation[0]), g0.f44326a, j0.f44332a}, new Annotation[0]);
            case 11:
                return new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharityConnect.CharityConnectGraph", c0.INSTANCE, new Annotation[0]);
            case 12:
                return new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharityConnect.CharitySignupSettingsScreen", d0.INSTANCE, new Annotation[0]);
            case 13:
                return new i90.a("com.app.tgtg.feature.charity.domain.NavigationCharityConnect.ConnectCharityScreen", f0.INSTANCE, new Annotation[0]);
            case 14:
                CharityIdError[] charityIdErrorArrValues = CharityIdError.values();
                charityIdErrorArrValues.getClass();
                return new i90.a("com.app.tgtg.feature.charity.ui.model.CharityIdError", (Enum[]) charityIdErrorArrValues);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BadgeCollection._childSerializers$_anonymous_();
            case 16:
                return CountryBasedVoucher._childSerializers$_anonymous_();
            case 17:
                return CurrencyBasedVoucher._childSerializers$_anonymous_();
            case 18:
                return DiscountVoucher._childSerializers$_anonymous_();
            case 19:
                return DiscountVoucher._childSerializers$_anonymous_$0();
            case 20:
                return UnknownVoucher._init_$_anonymous_();
            case 21:
                return DefaultBrazeImageLoader.renderUrlIntoView$lambda$1();
            case 22:
                return DefaultBrazeImageLoader.getBitmapFromUrl$lambda$8();
            case 23:
                return DefaultBrazeImageLoader.getBitmapFromUrl$lambda$10();
            case 24:
                return com.braze.images.a.b();
            case 25:
                return com.braze.images.c.a();
            case 26:
                return com.braze.images.d.a();
            case 27:
                return com.braze.images.d.b();
            case 28:
                return com.braze.images.d.c();
            default:
                return com.braze.images.d.d();
        }
    }
}
