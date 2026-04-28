package m90;

import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f29855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KSerializer f29856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KSerializer f29857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k90.e f29858d;

    public s1(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        k90.e eVar;
        kSerializer.getClass();
        kSerializer2.getClass();
        kSerializer3.getClass();
        this.f29855a = kSerializer;
        this.f29856b = kSerializer2;
        this.f29857c = kSerializer3;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        z0 z0Var = new z0(this, 1);
        if (StringsKt.H("kotlin.Triple")) {
            i4.a.f("Blank serial names are prohibited");
            eVar = null;
        } else {
            k90.a aVar = new k90.a("kotlin.Triple");
            z0Var.invoke(aVar);
            eVar = new k90.e("kotlin.Triple", k90.j.f26240j, aVar.f26204c.size(), kotlin.collections.y.T(serialDescriptorArr), aVar);
        }
        this.f29858d = eVar;
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        k90.e eVar = this.f29858d;
        l90.a aVarC = decoder.c(eVar);
        Object obj = c1.f29766c;
        Object objN = obj;
        Object objN2 = objN;
        Object objN3 = objN2;
        while (true) {
            int iW = aVarC.w(eVar);
            if (iW == -1) {
                aVarC.b(eVar);
                if (objN == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objN2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objN3 != obj) {
                    return new u70.u(objN, objN2, objN3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iW == 0) {
                objN = aVarC.n(eVar, 0, this.f29855a, null);
            } else if (iW == 1) {
                objN2 = aVarC.n(eVar, 1, this.f29856b, null);
            } else {
                if (iW != 2) {
                    throw new SerializationException(j4.s.f(iW, "Unexpected index "));
                }
                objN3 = aVarC.n(eVar, 2, this.f29857c, null);
            }
        }
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return this.f29858d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u70.u uVar = (u70.u) obj;
        encoder.getClass();
        uVar.getClass();
        k90.e eVar = this.f29858d;
        l90.b bVarC = encoder.c(eVar);
        bVarC.i(eVar, 0, this.f29855a, uVar.f40859a);
        bVarC.i(eVar, 1, this.f29856b, uVar.f40860b);
        bVarC.i(eVar, 2, this.f29857c, uVar.f40861c);
        bVarC.b(eVar);
    }
}
