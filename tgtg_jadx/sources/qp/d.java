package qp;

import c50.w;
import com.app.tgtg.model.remote.user.response.ItemsListPaging;
import com.app.tgtg.model.remote.user.response.ItemsListPaging$$serializer;
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
public final /* synthetic */ class d implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f37224a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f37224a = dVar;
        e1 e1Var = new e1("com.app.tgtg.feature.stationPicker.model.response.MetroSearchResponse", dVar, 2);
        e1Var.j("results", true);
        e1Var.j("paging", false);
        descriptor = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f.f37225c[0].getValue(), ItemsListPaging$$serializer.INSTANCE};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = f.f37225c;
        List list = null;
        boolean z11 = true;
        int i11 = 0;
        ItemsListPaging itemsListPaging = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                list = (List) aVarC.n(serialDescriptor, 0, (i90.b) jVarArr[0].getValue(), list);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    w.e(iW);
                    return null;
                }
                itemsListPaging = (ItemsListPaging) aVarC.n(serialDescriptor, 1, ItemsListPaging$$serializer.INSTANCE, itemsListPaging);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new f(i11, list, itemsListPaging);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f fVar = (f) obj;
        encoder.getClass();
        fVar.getClass();
        List list = fVar.f37226a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        j[] jVarArr = f.f37225c;
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(list, new ArrayList())) {
            bVarC.i(serialDescriptor, 0, (KSerializer) jVarArr[0].getValue(), list);
        }
        bVarC.i(serialDescriptor, 1, ItemsListPaging$$serializer.INSTANCE, fVar.f37227b);
        bVarC.b(serialDescriptor);
    }
}
