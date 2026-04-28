package qp;

import c50.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import org.jetbrains.annotations.NotNull;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f37228a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f37228a = gVar;
        e1 e1Var = new e1("com.app.tgtg.feature.stationPicker.model.response.StationsResponse", gVar, 1);
        e1Var.j("stations", true);
        descriptor = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{i.f37229b[0].getValue()};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = i.f37229b;
        List list = null;
        boolean z11 = true;
        int i11 = 0;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else {
                if (iW != 0) {
                    w.e(iW);
                    return null;
                }
                list = (List) aVarC.n(serialDescriptor, 0, (i90.b) jVarArr[0].getValue(), list);
                i11 = 1;
            }
        }
        aVarC.b(serialDescriptor);
        return new i(i11, list);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        encoder.getClass();
        iVar.getClass();
        List list = iVar.f37230a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        j[] jVarArr = i.f37229b;
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(list, new ArrayList())) {
            bVarC.i(serialDescriptor, 0, (KSerializer) jVarArr[0].getValue(), list);
        }
        bVarC.b(serialDescriptor);
    }
}
