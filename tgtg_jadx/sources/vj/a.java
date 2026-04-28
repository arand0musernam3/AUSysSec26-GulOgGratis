package vj;

import c50.w;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import o30.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42409a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f42409a = aVar;
        e1 e1Var = new e1("com.app.tgtg.feature.favorites.model.FavoriteReminderSettings", aVar, 2);
        e1Var.j("type", true);
        e1Var.j("scheduled_days", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f.f42413a, f0.B((KSerializer) c.f42410c[1].getValue())};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = c.f42410c;
        e eVar = null;
        boolean z11 = true;
        int i11 = 0;
        List list = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                eVar = (e) aVarC.n(serialDescriptor, 0, f.f42413a, eVar);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    w.e(iW);
                    return null;
                }
                list = (List) aVarC.m(serialDescriptor, 1, (i90.b) jVarArr[1].getValue(), list);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new c(i11, eVar, list);
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
        List list = cVar.f42412b;
        e eVar = cVar.f42411a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        u70.j[] jVarArr = c.f42410c;
        if (bVarC.C(serialDescriptor) || eVar != e.UNKNOWN) {
            bVarC.i(serialDescriptor, 0, f.f42413a, eVar);
        }
        if (bVarC.C(serialDescriptor) || list != null) {
            bVarC.r(serialDescriptor, 1, (KSerializer) jVarArr[1].getValue(), list);
        }
        bVarC.b(serialDescriptor);
    }
}
