package hp;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f22260a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c0 c0Var = new c0();
        f22260a = c0Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.RecipeGeneratorPollingResponse", c0Var, 5);
        e1Var.j("status", true);
        e1Var.j("polling_interval_milliseconds", true);
        e1Var.j("ingredients_found_in_pictures", true);
        e1Var.j("recipes", true);
        e1Var.j("additional_requests_available", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        u70.j[] jVarArr = e0.f22263f;
        return new KSerializer[]{o30.f0.B(r1.f29848a), o30.f0.B(m90.q0.f29842a), o30.f0.B((KSerializer) jVarArr[2].getValue()), o30.f0.B((KSerializer) jVarArr[3].getValue()), o30.f0.B(m90.g.f29797a)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = e0.f22263f;
        int i11 = 0;
        String str = null;
        Long l = null;
        List list = null;
        List list2 = null;
        Boolean bool = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                str = (String) aVarC.m(serialDescriptor, 0, r1.f29848a, str);
                i11 |= 1;
            } else if (iW == 1) {
                l = (Long) aVarC.m(serialDescriptor, 1, m90.q0.f29842a, l);
                i11 |= 2;
            } else if (iW == 2) {
                list = (List) aVarC.m(serialDescriptor, 2, (i90.b) jVarArr[2].getValue(), list);
                i11 |= 4;
            } else if (iW == 3) {
                list2 = (List) aVarC.m(serialDescriptor, 3, (i90.b) jVarArr[3].getValue(), list2);
                i11 |= 8;
            } else {
                if (iW != 4) {
                    c50.w.e(iW);
                    return null;
                }
                bool = (Boolean) aVarC.m(serialDescriptor, 4, m90.g.f29797a, bool);
                i11 |= 16;
            }
        }
        aVarC.b(serialDescriptor);
        return new e0(i11, str, l, list, list2, bool);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e0 e0Var = (e0) obj;
        encoder.getClass();
        e0Var.getClass();
        List list = e0Var.f22267d;
        List list2 = e0Var.f22266c;
        Long l = e0Var.f22265b;
        String str = e0Var.f22264a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        u70.j[] jVarArr = e0.f22263f;
        if (bVarC.C(serialDescriptor) || str != null) {
            bVarC.r(serialDescriptor, 0, r1.f29848a, str);
        }
        if (bVarC.C(serialDescriptor) || l != null) {
            bVarC.r(serialDescriptor, 1, m90.q0.f29842a, l);
        }
        if (bVarC.C(serialDescriptor) || list2 != null) {
            bVarC.r(serialDescriptor, 2, (KSerializer) jVarArr[2].getValue(), list2);
        }
        if (bVarC.C(serialDescriptor) || list != null) {
            bVarC.r(serialDescriptor, 3, (KSerializer) jVarArr[3].getValue(), list);
        }
        bVarC.r(serialDescriptor, 4, m90.g.f29797a, e0Var.f22268e);
        bVarC.b(serialDescriptor);
    }
}
