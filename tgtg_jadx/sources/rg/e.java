package rg;

import java.util.List;
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
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f38003a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        f38003a = eVar;
        e1 e1Var = new e1("com.app.tgtg.favWidget.FavouriteWidgetState.Available", eVar, 2);
        e1Var.j("currentTime", false);
        e1Var.j("items", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f0.B(r1.f29848a), f0.B((KSerializer) g.f38004c[1].getValue())};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = g.f38004c;
        String str = null;
        boolean z11 = true;
        int i11 = 0;
        List list = null;
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
                list = (List) aVarC.m(serialDescriptor, 1, (i90.b) jVarArr[1].getValue(), list);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new g(str, list, i11);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        encoder.getClass();
        gVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        u70.j[] jVarArr = g.f38004c;
        bVarC.r(serialDescriptor, 0, r1.f29848a, gVar.f38005a);
        bVarC.r(serialDescriptor, 1, (KSerializer) jVarArr[1].getValue(), gVar.f38006b);
        bVarC.b(serialDescriptor);
    }
}
