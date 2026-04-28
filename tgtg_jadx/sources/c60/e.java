package c60;

import com.app.tgtg.model.remote.user.requests.SurveyResult;
import com.braze.BrazeUser;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.brazeactions.steps.AddToSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromSubscriptionGroupStep;
import j5.b0;
import j5.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7785b;

    public /* synthetic */ e(String str, int i11) {
        this.f7784a = i11;
        this.f7785b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        ha.c cVarV0;
        switch (this.f7784a) {
            case 0:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                String str = this.f7785b;
                if (str != null) {
                    z.h(str, b0Var);
                }
                return Unit.f26487a;
            case 1:
                b0 b0Var2 = (b0) obj;
                b0Var2.getClass();
                z.h(this.f7785b, b0Var2);
                return Unit.f26487a;
            case 2:
                b0 b0Var3 = (b0) obj;
                b0Var3.getClass();
                z.h(this.f7785b, b0Var3);
                return Unit.f26487a;
            case 3:
                b0 b0Var4 = (b0) obj;
                b0Var4.getClass();
                z.h(this.f7785b, b0Var4);
                return Unit.f26487a;
            case 4:
                return UserJavascriptInterfaceBase.setLanguage$lambda$10(this.f7785b, (BrazeUser) obj);
            case 5:
                return UserJavascriptInterfaceBase.addToSubscriptionGroup$lambda$29(this.f7785b, (BrazeUser) obj);
            case 6:
                return UserJavascriptInterfaceBase.removeFromSubscriptionGroup$lambda$30(this.f7785b, (BrazeUser) obj);
            case 7:
                return UserJavascriptInterfaceBase.setCountry$lambda$9(this.f7785b, (BrazeUser) obj);
            case 8:
                return UserJavascriptInterfaceBase.setFirstName$lambda$0(this.f7785b, (BrazeUser) obj);
            case 9:
                return UserJavascriptInterfaceBase.setHomeCity$lambda$11(this.f7785b, (BrazeUser) obj);
            case 10:
                return UserJavascriptInterfaceBase.setPhoneNumber$lambda$16(this.f7785b, (BrazeUser) obj);
            case 11:
                return UserJavascriptInterfaceBase.setEmail$lambda$2(this.f7785b, (BrazeUser) obj);
            case 12:
                return UserJavascriptInterfaceBase.setLineId$lambda$17(this.f7785b, (BrazeUser) obj);
            case 13:
                return UserJavascriptInterfaceBase.setLastName$lambda$1(this.f7785b, (BrazeUser) obj);
            case 14:
                return AddToSubscriptionGroupStep.run$lambda$1(this.f7785b, (BrazeUser) obj);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return RemoveFromSubscriptionGroupStep.run$lambda$1(this.f7785b, (BrazeUser) obj);
            case 16:
                b0 b0Var5 = (b0) obj;
                b0Var5.getClass();
                z.h(this.f7785b, b0Var5);
                return Unit.f26487a;
            case 17:
                b0 b0Var6 = (b0) obj;
                b0Var6.getClass();
                z.r(b0Var6, -1.0f);
                String str2 = this.f7785b;
                if (str2 == null) {
                    str2 = "";
                }
                z.h(str2, b0Var6);
                return Unit.f26487a;
            case 18:
                b0 b0Var7 = (b0) obj;
                b0Var7.getClass();
                z.q(b0Var7);
                z.r(b0Var7, -1.0f);
                z.h(this.f7785b, b0Var7);
                z.k(b0Var7, 0);
                return Unit.f26487a;
            case 19:
                b0 b0Var8 = (b0) obj;
                b0Var8.getClass();
                String str3 = this.f7785b;
                if (str3 != null) {
                    z.h(str3, b0Var8);
                }
                return Unit.f26487a;
            case 20:
                b0 b0Var9 = (b0) obj;
                b0Var9.getClass();
                z.h(this.f7785b, b0Var9);
                return Unit.f26487a;
            case 21:
                b0 b0Var10 = (b0) obj;
                b0Var10.getClass();
                z.h(this.f7785b, b0Var10);
                return Unit.f26487a;
            case 22:
                b0 b0Var11 = (b0) obj;
                b0Var11.getClass();
                z.h(this.f7785b, b0Var11);
                return Unit.f26487a;
            case 23:
                z.h(this.f7785b, (b0) obj);
                return Unit.f26487a;
            case 24:
                z.l(this.f7785b, (b0) obj);
                return Unit.f26487a;
            case 25:
                b0 b0Var12 = (b0) obj;
                z.h(this.f7785b, b0Var12);
                z.m(b0Var12, 5);
                return Unit.f26487a;
            case 26:
                b0 b0Var13 = (b0) obj;
                z.l(this.f7785b, b0Var13);
                z.r(b0Var13, 0.0f);
                return Unit.f26487a;
            case 27:
                return Boolean.valueOf(Intrinsics.areEqual(((SurveyResult) obj).getQuestionId(), this.f7785b));
            case 28:
                String str4 = this.f7785b;
                ha.a aVar = (ha.a) obj;
                aVar.getClass();
                cVarV0 = aVar.v0("DELETE FROM biodata WHERE id = ?");
                try {
                    cVarV0.C(1, str4);
                    cVarV0.q0();
                    cVarV0.close();
                    return Unit.f26487a;
                } finally {
                }
            default:
                String str5 = this.f7785b;
                ha.a aVar2 = (ha.a) obj;
                aVar2.getClass();
                cVarV0 = aVar2.v0("SELECT secret FROM biodata WHERE id = ?");
                try {
                    cVarV0.C(1, str5);
                    if (cVarV0.q0()) {
                        return cVarV0.W(0);
                    }
                    throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type 'kotlin.String'.");
                } finally {
                }
        }
    }
}
