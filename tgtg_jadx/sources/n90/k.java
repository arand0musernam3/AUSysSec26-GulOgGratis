package n90;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements KSerializer {

    @NotNull
    private final KClass<Object> baseClass;

    @NotNull
    private final SerialDescriptor descriptor;

    public k(KClass kClass) {
        kClass.getClass();
        this.baseClass = kClass;
        this.descriptor = ox.h.p("JsonContentPolymorphicSerializer<" + kClass.getSimpleName() + '>', k90.c.f26213k, new SerialDescriptor[0]);
    }

    @Override // i90.b
    @NotNull
    public final Object deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        l lVarJ = xz.b.j(decoder);
        n nVarO = lVarJ.o();
        i90.b bVarSelectDeserializer = selectDeserializer(nVarO);
        bVarSelectDeserializer.getClass();
        return lVarJ.getJson().a((KSerializer) bVarSelectDeserializer, nVarO);
    }

    @Override // i90.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public abstract i90.b selectDeserializer(n nVar);

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Object obj) throws IllegalAccessException, InvocationTargetException {
        encoder.getClass();
        obj.getClass();
        KSerializer kSerializerE = encoder.a().e(this.baseClass, obj);
        if (kSerializerE == null) {
            KSerializer kSerializerK = ba0.g.K(Reflection.getOrCreateKotlinClass(obj.getClass()));
            if (kSerializerK == null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(obj.getClass());
                KClass<Object> kClass = this.baseClass;
                String simpleName = orCreateKotlinClass.getSimpleName();
                if (simpleName == null) {
                    simpleName = String.valueOf(orCreateKotlinClass);
                }
                throw new SerializationException(org.bouncycastle.jcajce.provider.asymmetric.a.d("Class '", simpleName, "' is not registered for polymorphic serialization ", "in the scope of '" + kClass.getSimpleName() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
            }
            kSerializerE = kSerializerK;
        }
        kSerializerE.serialize(encoder, obj);
    }
}
