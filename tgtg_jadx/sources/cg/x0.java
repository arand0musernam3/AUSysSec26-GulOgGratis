package cg;

import com.braze.BrazeUser;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.brazeactions.steps.AddToCustomAttributeArrayStep;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8156c;

    public /* synthetic */ x0(String str, String str2, int i11) {
        this.f8154a = i11;
        this.f8155b = str;
        this.f8156c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f8154a) {
            case 0:
                j5.b0 b0Var = (j5.b0) obj;
                b0Var.getClass();
                String str = this.f8155b;
                if (str == null) {
                    str = this.f8156c;
                }
                j5.z.h(str, b0Var);
                return Unit.f26487a;
            case 1:
                return UserJavascriptInterfaceBase.removeFromCustomAttributeArray$lambda$22(this.f8155b, this.f8156c, (BrazeUser) obj);
            case 2:
                return UserJavascriptInterfaceBase.addToCustomAttributeArray$lambda$21(this.f8155b, this.f8156c, (BrazeUser) obj);
            case 3:
                return UserJavascriptInterfaceBase.addAlias$lambda$28(this.f8155b, this.f8156c, (BrazeUser) obj);
            case 4:
                return AddToCustomAttributeArrayStep.run$lambda$1(this.f8155b, this.f8156c, (BrazeUser) obj);
            case 5:
                j5.b0 b0Var2 = (j5.b0) obj;
                b0Var2.getClass();
                String str2 = this.f8155b;
                if (str2 == null) {
                    str2 = this.f8156c;
                }
                j5.z.h(str2, b0Var2);
                return Unit.f26487a;
            case 6:
                String str3 = this.f8155b;
                String str4 = this.f8156c;
                ha.a aVar = (ha.a) obj;
                aVar.getClass();
                ha.c cVarV0 = aVar.v0("UPDATE biodata SET secret = ? WHERE id = ?");
                try {
                    cVarV0.C(1, str3);
                    cVarV0.C(2, str4);
                    cVarV0.q0();
                    cVarV0.close();
                    return Unit.f26487a;
                } catch (Throwable th2) {
                    cVarV0.close();
                    throw th2;
                }
            default:
                j5.b0 b0Var3 = (j5.b0) obj;
                b0Var3.getClass();
                j5.z.h(this.f8155b, b0Var3);
                j5.z.o(this.f8156c, b0Var3);
                return Unit.f26487a;
        }
    }
}
