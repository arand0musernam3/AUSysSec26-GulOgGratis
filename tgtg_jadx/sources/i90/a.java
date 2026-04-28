package i90;

import i2.x;
import j4.s;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.c1;
import m90.z;
import u70.l;
import u70.m;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23581a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f23583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f23584d;

    public a(KClass kClass, KSerializer[] kSerializerArr) {
        kClass.getClass();
        this.f23582b = kClass;
        List listAsList = Arrays.asList(kSerializerArr);
        listAsList.getClass();
        this.f23583c = listAsList;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (StringsKt.H("kotlinx.serialization.ContextualSerializer")) {
            i4.a.f("Blank serial names are prohibited");
            throw null;
        }
        k90.j jVar = k90.j.f26240j;
        k90.h hVar = k90.h.f26238j;
        if (Intrinsics.areEqual(hVar, jVar)) {
            i4.a.f("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            throw null;
        }
        k90.a aVar = new k90.a("kotlinx.serialization.ContextualSerializer");
        n0 n0Var = n0.f26529a;
        n0Var.getClass();
        aVar.f26203b = n0Var;
        this.f23584d = new k90.b(new k90.e("kotlinx.serialization.ContextualSerializer", hVar, aVar.f26204c.size(), y.T(serialDescriptorArr), aVar), kClass);
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        switch (this.f23581a) {
            case 0:
                x xVarA = decoder.a();
                KClass kClass = (KClass) this.f23582b;
                KSerializer kSerializerD = xVarA.d(kClass, (List) this.f23583c);
                if (kSerializerD != null) {
                    return decoder.h(kSerializerD);
                }
                throw new SerializationException(c1.i(kClass));
            case 1:
                Enum[] enumArr = (Enum[]) this.f23582b;
                int iJ = decoder.j(getDescriptor());
                if (iJ >= 0 && iJ < enumArr.length) {
                    return enumArr[iJ];
                }
                throw new SerializationException(iJ + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
            default:
                SerialDescriptor descriptor = getDescriptor();
                l90.a aVarC = decoder.c(descriptor);
                int iW = aVarC.w(getDescriptor());
                if (iW != -1) {
                    throw new SerializationException(s.f(iW, "Unexpected index "));
                }
                aVarC.b(descriptor);
                return this.f23582b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, u70.j] */
    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        switch (this.f23581a) {
            case 0:
                return (k90.b) this.f23584d;
            case 1:
                return (SerialDescriptor) ((t) this.f23584d).getValue();
            default:
                return (SerialDescriptor) this.f23584d.getValue();
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        switch (this.f23581a) {
            case 0:
                encoder.getClass();
                obj.getClass();
                x xVarA = encoder.a();
                KClass kClass = (KClass) this.f23582b;
                KSerializer kSerializerD = xVarA.d(kClass, (List) this.f23583c);
                if (kSerializerD == null) {
                    throw new SerializationException(c1.i(kClass));
                }
                encoder.w(kSerializerD, obj);
                return;
            case 1:
                Enum r52 = (Enum) obj;
                encoder.getClass();
                r52.getClass();
                Enum[] enumArr = (Enum[]) this.f23582b;
                int iE = y.E(enumArr, r52);
                if (iE != -1) {
                    encoder.t(getDescriptor(), iE);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r52);
                String strA = getDescriptor().a();
                String string = Arrays.toString(enumArr);
                string.getClass();
                sb2.append(" is not a valid enum ");
                sb2.append(strA);
                sb2.append(", must be one of ");
                sb2.append(string);
                throw new SerializationException(sb2.toString());
            default:
                encoder.getClass();
                obj.getClass();
                encoder.c(getDescriptor()).b(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.f23581a) {
            case 1:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        obj.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.f23583c = listAsList;
    }

    public a(String str, Object obj) {
        obj.getClass();
        this.f23582b = obj;
        this.f23583c = n0.f26529a;
        this.f23584d = l.a(m.PUBLICATION, new z(this, 1, str));
    }

    public a(String str, Enum[] enumArr) {
        str.getClass();
        enumArr.getClass();
        this.f23582b = enumArr;
        this.f23584d = l.b(new z(0, this, str));
    }
}
