package xs;

import c50.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f44493a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f44493a = aVar;
        e1 e1Var = new e1("com.app.tgtg.feature.tabprofile.storelogin.network.model.MyStoreOnboardingSettingsResponse", aVar, 2);
        e1Var.j("my_store_onboarding_url", true);
        e1Var.j("direct_app_login_token", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{f0.B(r1Var), f0.B(r1Var)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        String str = null;
        boolean z11 = true;
        int i11 = 0;
        String str2 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                str = (String) aVarC.m(serialDescriptor, 0, r1.f29848a, str);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    w.e(iW);
                    return null;
                }
                str2 = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str2);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new c(i11, str, str2);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        encoder.getClass();
        cVar.getClass();
        String str = cVar.f44495b;
        String str2 = cVar.f44494a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        if (bVarC.C(serialDescriptor) || str2 != null) {
            bVarC.r(serialDescriptor, 0, r1.f29848a, str2);
        }
        if (bVarC.C(serialDescriptor) || str != null) {
            bVarC.r(serialDescriptor, 1, r1.f29848a, str);
        }
        bVarC.b(serialDescriptor);
    }
}
