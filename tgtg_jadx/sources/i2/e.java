package i2;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.app.tgtg.R;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.loyaltycardpromo.DiscoverLoyaltyCardPromoView;
import com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions.PaymentOptionsActivity;
import com.app.tgtg.model.remote.badge.BadgeButton;
import com.app.tgtg.model.remote.manufacturer.response.AddressSearchElement;
import com.app.tgtg.model.remote.mapService.response.FilterCategory;
import com.app.tgtg.model.remote.mapService.response.FilterDiet;
import com.app.tgtg.model.remote.mapService.response.SortingOption;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod;
import com.app.tgtg.model.remote.payment.SavedBancontactCard;
import com.app.tgtg.model.remote.payment.SavedCreditCard;
import com.app.tgtg.model.remote.payment.SavedEdenred;
import com.app.tgtg.model.remote.payment.UnknownSavedPaymentMethod;
import com.app.tgtg.model.remote.payment.request.DeleteCardRequest;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import com.google.android.gms.internal.measurement.cg;
import g3.ea;
import h2.t0;
import hp.f1;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m3.b1;
import m3.i1;
import mv.r0;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.messaging.android.internal.AttachmentFileResolver;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22818c;

    public /* synthetic */ e(g9.l lVar, g9.o oVar, k9.g gVar, Fragment fragment) {
        this.f22816a = 14;
        this.f22817b = oVar;
        this.f22818c = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        String cardIdentifier;
        int i11 = this.f22816a;
        int i12 = 1;
        int i13 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.f22818c;
        Object obj2 = this.f22817b;
        switch (i11) {
            case 0:
                e0 e0Var = (e0) obj;
                q qVar = (q) ((m3.i0) obj2).getValue();
                return new r(e0Var, qVar, new a3.j((IntRange) ((t0) e0Var.f22822d.f22932f).getValue(), qVar));
            case 1:
                ((i3.y) obj2).f((AccessibilityManager) obj);
                return Unit.f26487a;
            case 2:
                v80.f0.B((v80.b0) obj2, null, null, new i3.i((ea) obj, objArr == true ? 1 : 0, i13), 3);
                return Boolean.TRUE;
            case 3:
                ((i9.p) obj2).i((g9.l) obj, false);
                return Unit.f26487a;
            case 4:
                return ox.h.o((String) obj2, k90.c.f26213k, new SerialDescriptor[0], new i90.e((i90.f) obj, i13));
            case 5:
                g9.f0 f0Var = (g9.f0) obj2;
                f0Var.d((ii.h) obj, new go.e(f0Var, i12));
                return Unit.f26487a;
            case 6:
                ((Function2) obj2).invoke(jl.a.SELECT, (op.l) obj);
                return Unit.f26487a;
            case 7:
                XmlCheckoutAddressFragment xmlCheckoutAddressFragment = (XmlCheckoutAddressFragment) obj2;
                String str = (String) obj;
                xmlCheckoutAddressFragment.x().m(cv.i.ACTION_IGNORE_INPUT_WARNING);
                jg.a0 a0Var = xmlCheckoutAddressFragment.f8942r;
                if (a0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("xmlAddressUiHelper");
                    a0Var = null;
                }
                UserAddress userAddress = a0Var.f25154j;
                if (userAddress != null) {
                    UserAddress userAddress2 = new UserAddress(userAddress.getName(), userAddress.getEmail(), userAddress.getPhoneCountryCode(), userAddress.getPhone(), userAddress.getAddress1(), userAddress.getAddress2(), userAddress.getCity(), userAddress.getState(), userAddress.getPostalCode(), userAddress.getCountry(), userAddress.getStreetName(), userAddress.getHouseNumber(), userAddress.getHouseNumberAddition(), userAddress.getUserAddressType(), str, userAddress.getDeliveryAccessCode(), userAddress.getNoDeliveryAccessCode(), userAddress.getDeliveryInstructions());
                    cj.e0 e0VarX = xmlCheckoutAddressFragment.x();
                    v80.f0.B(m1.d(e0VarX), null, null, new cj.c0(e0VarX, userAddress2, cg.q(xmlCheckoutAddressFragment.f8939o), null), 3);
                }
                return Unit.f26487a;
            case 8:
                ((Function1) obj2).invoke(((BadgeButton) obj).getCtaDestination());
                return Unit.f26487a;
            case 9:
                ((Function1) obj2).invoke((FilterCategory) obj);
                return Unit.f26487a;
            case 10:
                ((Function1) obj2).invoke((FilterDiet) obj);
                return Unit.f26487a;
            case 11:
                ((Function1) obj2).invoke((SortingOption) obj);
                return Unit.f26487a;
            case 12:
                ((DiscoverLoyaltyCardPromoView) obj2).f9286k.invoke();
                ((b1) obj).setValue(Boolean.FALSE);
                return Unit.f26487a;
            case 13:
                return com.braze.requests.framework.queue.c.a((com.braze.requests.g) obj2, (com.braze.requests.framework.h) obj);
            case 14:
                g9.o oVar = (g9.o) obj2;
                Fragment fragment = (Fragment) obj;
                for (g9.l lVar : (Iterable) oVar.f20181f.f45488a.getValue()) {
                    if (k9.g.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + fragment + " viewmodel being cleared");
                    }
                    oVar.c(lVar);
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                AddressSearchElement addressSearchElement = (AddressSearchElement) obj;
                ((Function2) obj2).invoke(addressSearchElement.getText(), addressSearchElement);
                return Unit.f26487a;
            case 16:
                ((Function0) obj2).invoke();
                ((ih.i) obj).f23868q = false;
                return Unit.f26487a;
            case 17:
                gj.a aVar = (gj.a) obj2;
                Function1 function1 = (Function1) obj;
                if (aVar != null) {
                    function1.invoke(aVar);
                }
                return Unit.f26487a;
            case 18:
                String str2 = (String) obj;
                kotlin.text.m mVar = Regex.f26586b;
                Matcher matcher = ((Regex) obj2).f26587a.matcher(str2);
                matcher.getClass();
                if (matcher.find(0)) {
                    return new kotlin.text.l(matcher, str2);
                }
                return null;
            case 19:
                BasicSavedPaymentMethod basicSavedPaymentMethod = (BasicSavedPaymentMethod) obj;
                int i14 = PaymentOptionsActivity.f9428g;
                ks.h hVarB = ((PaymentOptionsActivity) obj2).B();
                if (basicSavedPaymentMethod instanceof SavedCreditCard) {
                    cardIdentifier = ((SavedCreditCard) basicSavedPaymentMethod).getCardIdentifier();
                } else if (basicSavedPaymentMethod instanceof SavedBancontactCard) {
                    cardIdentifier = ((SavedBancontactCard) basicSavedPaymentMethod).getCardIdentifier();
                } else {
                    if (!(basicSavedPaymentMethod instanceof SavedEdenred) && !Intrinsics.areEqual(basicSavedPaymentMethod, UnknownSavedPaymentMethod.INSTANCE)) {
                        e40.a.f();
                        return null;
                    }
                    cardIdentifier = null;
                }
                v80.f0.B(m1.d(hVarB), null, null, new no.f0(hVarB, new DeleteCardRequest(basicSavedPaymentMethod.getPaymentProvider(), cardIdentifier), basicSavedPaymentMethod, (x70.c) null), 3);
                return Unit.f26487a;
            case 20:
                b1 b1Var = (b1) obj;
                int i15 = ManufacturerOrderActivity.f9167q;
                lo.m mVarF0 = ((ManufacturerOrderActivity) obj2).f0();
                Order order = (Order) mVarF0.l.f45488a.getValue();
                if (order != null) {
                    v80.f0.B(m1.d(mVarF0), null, null, new defpackage.j((l1) mVarF0, (Object) order, (x70.c) (objArr2 == true ? 1 : 0), 4), 3);
                }
                b1Var.setValue(Boolean.FALSE);
                return Unit.f26487a;
            case 21:
                ManufacturerOrderActivity manufacturerOrderActivity = (ManufacturerOrderActivity) obj2;
                Function0 function0 = (Function0) obj;
                int i16 = ManufacturerOrderActivity.f9167q;
                if (r0.u(manufacturerOrderActivity)) {
                    function0.invoke();
                } else {
                    Toast.makeText(manufacturerOrderActivity, manufacturerOrderActivity.getString(R.string.fav_widget_no_internet), 1).show();
                }
                return Unit.f26487a;
            case 22:
                b1 b1Var2 = (b1) obj;
                int i17 = ManufacturerOrderActivity.f9167q;
                if (System.currentTimeMillis() - ((i1) obj2).h() > 1000) {
                    b1Var2.setValue(Boolean.TRUE);
                }
                return Unit.f26487a;
            case 23:
                mp.c cVar = (mp.c) obj2;
                fi.b bVar = new fi.b((z3.r) obj, i12);
                Context context = cVar.f30066a;
                context.getClass();
                File fileCreateTempFile = File.createTempFile(e0.f.i(System.currentTimeMillis(), "recipe_generator_"), AttachmentFileResolver.TEMP_FILE_SUFFIX, context.getCacheDir());
                fileCreateTempFile.getClass();
                cVar.f30070e.H(new m0.b0(fileCreateTempFile), androidx.core.app.e.c(context), new jb.b(bVar));
                return Unit.f26487a;
            case 24:
                ((Function1) obj2).invoke(CollectionsKt.M((z3.r) obj));
                return Unit.f26487a;
            case 25:
                ep.d0 d0Var = (ep.d0) obj2;
                hp.g gVar = (hp.g) obj;
                boolean z11 = gVar.f22285k;
                d0Var.getClass();
                v80.f0.B(m1.d(d0Var), null, null, new ep.a0(z11, gVar, d0Var, (x70.c) null), 3);
                return Unit.f26487a;
            case 26:
                ((Function1) obj2).invoke(((f1) obj).f22273a.f22328b);
                return Unit.f26487a;
            case 27:
                Uri uri = (Uri) obj2;
                b1 b1Var3 = (b1) obj;
                b1Var3.setValue(Intrinsics.areEqual((Uri) b1Var3.getValue(), uri) ? null : uri);
                return Unit.f26487a;
            case 28:
                return DataStoreProvider.readBoolean$lambda$2((DataStoreKey) obj2, (Boolean) obj);
            default:
                return DataStoreProvider.readString$lambda$3((DataStoreKey) obj2, (String) obj);
        }
    }

    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        this.f22816a = i11;
        this.f22817b = obj;
        this.f22818c = obj2;
    }
}
