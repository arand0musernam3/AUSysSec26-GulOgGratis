package xh;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.app.tgtg.feature.charity.ui.model.CharityIdError;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.e1;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f44326a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g0 g0Var = new g0();
        f44326a = g0Var;
        e1 e1Var = new e1("com.app.tgtg.feature.charity.domain.NavigationCharityConnect.ProvideCharityIdScreen", g0Var, 2);
        e1Var.j("charityId", true);
        e1Var.j(StatusResponseUtils.RESULT_ERROR, true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{o30.f0.B(r1.f29848a), o30.f0.B((KSerializer) i0.f44329d[1].getValue())};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = i0.f44329d;
        String str = null;
        boolean z11 = true;
        int i11 = 0;
        CharityIdError charityIdError = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                str = (String) aVarC.m(serialDescriptor, 0, r1.f29848a, str);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    c50.w.e(iW);
                    return null;
                }
                charityIdError = (CharityIdError) aVarC.m(serialDescriptor, 1, (i90.b) jVarArr[1].getValue(), charityIdError);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new i0(i11, str, charityIdError);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i0 i0Var = (i0) obj;
        encoder.getClass();
        i0Var.getClass();
        CharityIdError charityIdError = i0Var.f44331c;
        String str = i0Var.f44330b;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        u70.j[] jVarArr = i0.f44329d;
        if (bVarC.C(serialDescriptor) || str != null) {
            bVarC.r(serialDescriptor, 0, r1.f29848a, str);
        }
        if (bVarC.C(serialDescriptor) || charityIdError != null) {
            bVarC.r(serialDescriptor, 1, (KSerializer) jVarArr[1].getValue(), charityIdError);
        }
        bVarC.b(serialDescriptor);
    }
}
