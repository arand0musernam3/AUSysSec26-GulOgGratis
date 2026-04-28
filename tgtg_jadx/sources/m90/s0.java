package m90;

import java.util.Map;
import kotlin.Pair;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f29851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KSerializer f29852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k90.e f29854d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s0(KSerializer kSerializer, KSerializer kSerializer2, int i11) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.f29853c = i11;
        kSerializer.getClass();
        kSerializer2.getClass();
        switch (i11) {
            case 1:
                this(kSerializer, kSerializer2, (byte) 0);
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (StringsKt.H("kotlin.Pair")) {
                    i4.a.f("Blank serial names are prohibited");
                    throw null;
                }
                k90.a aVar = new k90.a("kotlin.Pair");
                k90.a.a(aVar, "first", kSerializer.getDescriptor());
                k90.a.a(aVar, "second", kSerializer2.getDescriptor());
                this.f29854d = new k90.e("kotlin.Pair", k90.j.f26240j, aVar.f26204c.size(), kotlin.collections.y.T(serialDescriptorArr), aVar);
                return;
            default:
                this.f29854d = ox.h.o("kotlin.collections.Map.Entry", k90.j.l, new SerialDescriptor[0], new m2.c2(5, kSerializer, kSerializer2));
                return;
        }
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        Object r0Var;
        SerialDescriptor descriptor = getDescriptor();
        l90.a aVarC = decoder.c(descriptor);
        Object obj = c1.f29766c;
        Object objN = obj;
        Object objN2 = objN;
        while (true) {
            int iW = aVarC.w(getDescriptor());
            if (iW == -1) {
                if (objN == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objN2 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                switch (this.f29853c) {
                    case 0:
                        r0Var = new r0(objN, objN2);
                        break;
                    default:
                        r0Var = new Pair(objN, objN2);
                        break;
                }
                aVarC.b(descriptor);
                return r0Var;
            }
            if (iW == 0) {
                objN = aVarC.n(getDescriptor(), 0, this.f29851a, null);
            } else {
                if (iW != 1) {
                    throw new SerializationException(j4.s.f(iW, "Invalid index: "));
                }
                objN2 = aVarC.n(getDescriptor(), 1, this.f29852b, null);
            }
        }
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        switch (this.f29853c) {
        }
        return this.f29854d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Object key;
        Object value;
        encoder.getClass();
        l90.b bVarC = encoder.c(getDescriptor());
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.f29851a;
        switch (this.f29853c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                key = pair.f26485a;
                break;
        }
        bVarC.i(descriptor, 0, kSerializer, key);
        SerialDescriptor descriptor2 = getDescriptor();
        KSerializer kSerializer2 = this.f29852b;
        switch (this.f29853c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                value = pair2.f26486b;
                break;
        }
        bVarC.i(descriptor2, 1, kSerializer2, value);
        bVarC.b(getDescriptor());
    }

    public s0(KSerializer kSerializer, KSerializer kSerializer2, byte b8) {
        this.f29851a = kSerializer;
        this.f29852b = kSerializer2;
    }
}
