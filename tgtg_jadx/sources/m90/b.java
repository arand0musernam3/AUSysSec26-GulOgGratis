package m90;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements KSerializer {
    public i90.b a(l90.a aVar, String str) {
        i2.x xVarA = aVar.a();
        KClass kClassC = c();
        xVarA.getClass();
        kClassC.getClass();
        Map map = (Map) ((Map) xVarA.f22931e).get(kClassC);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = ((Map) xVarA.f22932f).get(kClassC);
        Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (i90.b) function1.invoke(str);
        }
        return null;
    }

    public KSerializer b(Encoder encoder, Object obj) {
        encoder.getClass();
        obj.getClass();
        return encoder.a().e(c(), obj);
    }

    public abstract KClass c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        l90.a aVarC = decoder.c(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object objN = null;
        while (true) {
            int iW = aVarC.w(getDescriptor());
            if (iW == -1) {
                if (objN != null) {
                    aVarC.b(descriptor);
                    return objN;
                }
                i4.a.j((String) objectRef.element, "Polymorphic value has not been read for class ");
                return null;
            }
            if (iW != 0) {
                T t9 = objectRef.element;
                if (iW != 1) {
                    StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) t9;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb2.append(str);
                    sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb2.append(iW);
                    throw new SerializationException(sb2.toString());
                }
                if (t9 == 0) {
                    i4.a.f("Cannot read polymorphic value before its type token");
                    return null;
                }
                objectRef.element = t9;
                objN = aVarC.n(getDescriptor(), iW, b0.a0.t(this, aVarC, (String) t9), null);
            } else {
                objectRef.element = aVarC.u(getDescriptor(), iW);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        obj.getClass();
        KSerializer kSerializerU = b0.a0.u(this, encoder, obj);
        SerialDescriptor descriptor = getDescriptor();
        l90.b bVarC = encoder.c(descriptor);
        bVarC.q(getDescriptor(), 0, kSerializerU.getDescriptor().a());
        bVarC.i(getDescriptor(), 1, kSerializerU, obj);
        bVarC.b(descriptor);
    }
}
