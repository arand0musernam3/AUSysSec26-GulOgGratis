package q60;

import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.braze.communication.dust.h;
import com.braze.communication.dust.i;
import f2.c0;
import i90.f;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import op.j;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36337a;

    public /* synthetic */ a(int i11) {
        this.f36337a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36337a) {
            case 0:
                return Unit.f26487a;
            case 1:
                return Unit.f26487a;
            case 2:
                return Unit.f26487a;
            case 3:
                return Unit.f26487a;
            case 4:
                return Unit.f26487a;
            case 5:
                return Unit.f26487a;
            case 6:
                return Unit.f26487a;
            case 7:
                return Unit.f26487a;
            case 8:
                return Unit.f26487a;
            case 9:
                return Unit.f26487a;
            case 10:
                return Unit.f26487a;
            case 11:
                return Unit.f26487a;
            case 12:
                return Unit.f26487a;
            case 13:
                return Unit.f26487a;
            case 14:
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int i11 = ItemViewActivity.f9011k;
                return new c0(0, 0);
            case 16:
                return new m90.d(op.a.f32895a, 0);
            case 17:
                return new m90.d(op.d.f32901a, 0);
            case 18:
                return new m90.d(j.f32907a, 0);
            case 19:
                return new f("com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.screens.AccountDetailsScreens", Reflection.getOrCreateKotlinClass(qr.d.class), new KClass[]{Reflection.getOrCreateKotlinClass(qr.a.class), Reflection.getOrCreateKotlinClass(qr.b.class)}, new KSerializer[]{new i90.a("com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.screens.AccountDetailsScreens.AccountDetailsScreen", qr.a.INSTANCE, new Annotation[0]), new i90.a("com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.screens.AccountDetailsScreens.AddressScreen", qr.b.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 20:
                return new i90.a("com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.screens.AccountDetailsScreens.AccountDetailsScreen", qr.a.INSTANCE, new Annotation[0]);
            case 21:
                return new i90.a("com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.screens.AccountDetailsScreens.AddressScreen", qr.b.INSTANCE, new Annotation[0]);
            case 22:
                return com.braze.communication.dust.d.a();
            case 23:
                return h.a();
            case 24:
                return h.d();
            case 25:
                return h.b();
            case 26:
                return h.c();
            case 27:
                return h.e();
            case 28:
                return i.a();
            default:
                return com.braze.triggers.managers.a.a();
        }
    }
}
