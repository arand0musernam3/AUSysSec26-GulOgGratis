package a3;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems.DeliveryCategoryCarousel;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.CategoryCard;
import com.google.android.gms.internal.measurement.cg;
import com.tgtg.componentlibrary.component.avatar.ComposableSingletons$DemoPantryAvatarKt;
import com.tgtg.componentlibrary.component.avatar.DemoPantryAvatarKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f546a;

    public /* synthetic */ r2(int i11) {
        this.f546a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f546a) {
            case 0:
                return Long.valueOf(((s2) obj2).f560d.get());
            case 1:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof v80.e2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
            case 2:
                v80.e2 e2Var = (v80.e2) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (e2Var != null) {
                    return e2Var;
                }
                if (element2 instanceof v80.e2) {
                    return (v80.e2) element2;
                }
                return null;
            case 3:
                a90.b0 b0Var = (a90.b0) obj;
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                if (element3 instanceof v80.e2) {
                    v80.e2 e2Var2 = (v80.e2) element3;
                    Object objI0 = e2Var2.i0(b0Var.f1009a);
                    Object[] objArr = b0Var.f1010b;
                    int i11 = b0Var.f1012d;
                    objArr[i11] = objI0;
                    v80.e2[] e2VarArr = b0Var.f1011c;
                    b0Var.f1012d = i11 + 1;
                    e2VarArr[i11] = e2Var2;
                }
                return b0Var;
            case 4:
                m3.n nVar = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    cg.b(sVar, 0);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 5:
                return CredentialProviderBeginSignInController.handleResponse$lambda$7((CancellationSignal) obj, (Function0) obj2);
            case 6:
                return CredentialProviderCreatePasswordController.handleResponse$lambda$7((CancellationSignal) obj, (Function0) obj2);
            case 7:
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$11((CancellationSignal) obj, (Function0) obj2);
            case 8:
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$9((CancellationSignal) obj, (Function0) obj2);
            case 9:
                return CreateDigitalCredentialController.handleResponse$lambda$0((CancellationSignal) obj, (Function0) obj2);
            case 10:
                return CreatePasswordCredentialController.handleResponse$lambda$5((CancellationSignal) obj, (Function0) obj2);
            case 11:
                return CreatePublicKeyCredentialController.handleResponse$lambda$13((CancellationSignal) obj, (Function0) obj2);
            case 12:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g3.i2.a(o00.x0.z(R.drawable.system_icon_chevron_left_neutral_80, sVar2, 0), null, d2.m2.f13850c, i4.v.f23315h, sVar2, 3512, 0);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 13:
                m3.n nVar3 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    g3.i2.a(o00.x0.z(R.drawable.system_icon_chevron_right_neutral_80, sVar3, 0), null, d2.m2.f13850c, i4.v.f23315h, sVar3, 3512, 0);
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            case 14:
                m3.n nVar4 = (m3.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    g3.i2.a(o00.x0.z(R.drawable.map_pin_icon, sVar4, 0), o30.f0.U(sVar4, R.string.a11y_browse_change_location), null, 0L, sVar4, 8, 12);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                m3.n nVar5 = (m3.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    v1.n.d(o00.x0.z(R.drawable.charity_email_blob1, sVar5, 0), "blob1", null, null, null, 0.0f, null, sVar5, 56, 124);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 16:
                m3.n nVar6 = (m3.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                m3.s sVar6 = (m3.s) nVar6;
                if (sVar6.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    v1.n.d(o00.x0.z(R.drawable.charity_email_blob2, sVar6, 0), "blob2", null, null, null, 0.0f, null, sVar6, 56, 124);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 17:
                m3.n nVar7 = (m3.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                m3.s sVar7 = (m3.s) nVar7;
                if (sVar7.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    v1.n.d(o00.x0.z(R.drawable.charity_email_blob3, sVar7, 0), "blob3", null, null, null, 0.0f, null, sVar7, 56, 124);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
            case 18:
                m3.n nVar8 = (m3.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                m3.s sVar8 = (m3.s) nVar8;
                if (sVar8.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    v1.n.d(o00.x0.z(R.drawable.charity_email_blob4, sVar8, 0), "blob4", null, null, null, 0.0f, null, sVar8, 56, 124);
                } else {
                    sVar8.U();
                }
                return Unit.f26487a;
            case 19:
                m3.n nVar9 = (m3.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                m3.s sVar9 = (m3.s) nVar9;
                if (sVar9.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    v1.n.d(o00.x0.z(R.drawable.charity_email_blob_mail, sVar9, 0), "blob5", null, null, null, 0.0f, null, sVar9, 56, 124);
                } else {
                    sVar9.U();
                }
                return Unit.f26487a;
            case 20:
                ((Integer) obj2).getClass();
                lx.u.h((m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 21:
                m3.n nVar10 = (m3.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryAvatarKt composableSingletons$DemoPantryAvatarKt = ComposableSingletons$DemoPantryAvatarKt.INSTANCE;
                m3.s sVar10 = (m3.s) nVar10;
                if (sVar10.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    DemoPantryAvatarKt.DemoPantryAvatar(sVar10, 0);
                } else {
                    sVar10.U();
                }
                return Unit.f26487a;
            case 22:
                m3.n nVar11 = (m3.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryAvatarKt composableSingletons$DemoPantryAvatarKt2 = ComposableSingletons$DemoPantryAvatarKt.INSTANCE;
                m3.s sVar11 = (m3.s) nVar11;
                if (sVar11.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    DemoPantryAvatarKt.DemoPantryAvatar(sVar11, 0);
                } else {
                    sVar11.U();
                }
                return Unit.f26487a;
            case 23:
                m3.n nVar12 = (m3.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                m3.s sVar12 = (m3.s) nVar12;
                if (!sVar12.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    sVar12.U();
                }
                return Unit.f26487a;
            case 24:
                ((Integer) obj2).getClass();
                cg.j.o((m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 25:
                ((Integer) obj2).getClass();
                cg.j.p((m3.n) obj, m3.i.F(7));
                return Unit.f26487a;
            case 26:
                ((Integer) obj).intValue();
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) obj2;
                baseItemMnuV2.getClass();
                return ItemId.m197boximpl(baseItemMnuV2.m393getItemIdFvU5WIY());
            case 27:
                ((Integer) obj).intValue();
                BaseItemMnuV2 baseItemMnuV22 = (BaseItemMnuV2) obj2;
                baseItemMnuV22.getClass();
                return ItemId.m197boximpl(baseItemMnuV22.m393getItemIdFvU5WIY());
            case 28:
                ((Integer) obj).intValue();
                CategoryCard categoryCard = (CategoryCard) obj2;
                categoryCard.getClass();
                return categoryCard.getId();
            default:
                ((Integer) obj).intValue();
                int i12 = DeliveryCategoryCarousel.f9125q;
                ((String) obj2).getClass();
                return Unit.f26487a;
        }
    }

    public /* synthetic */ r2(int i11, int i12) {
        this.f546a = i12;
    }
}
