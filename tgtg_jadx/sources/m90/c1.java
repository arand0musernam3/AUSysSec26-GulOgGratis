package m90;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SerialDescriptor[] f29764a = new SerialDescriptor[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f29765b = new KSerializer[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f29766c = new Object();

    public static final g0 a(String str, KSerializer kSerializer) {
        return new g0(str, new h0(kSerializer));
    }

    public static final Set b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof l) {
            return ((l) serialDescriptor).b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.e());
        int iE = serialDescriptor.e();
        for (int i11 = 0; i11 < iE; i11++) {
            hashSet.add(serialDescriptor.f(i11));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f29764a : serialDescriptorArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer d(java.lang.Class r17, kotlinx.serialization.KSerializer... r18) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m90.c1.d(java.lang.Class, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    public static final i90.a e(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        enumArr.getClass();
        y yVar = new y(str, enumArr.length);
        int length = enumArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            Enum r52 = enumArr[i11];
            int i13 = i12 + 1;
            String strName = (String) kotlin.collections.y.D(i12, strArr);
            if (strName == null) {
                strName = r52.name();
            }
            yVar.j(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) kotlin.collections.y.D(i12, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    annotation.getClass();
                    int i14 = yVar.f29782d;
                    List[] listArr = yVar.f29784f;
                    List arrayList = listArr[i14];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[yVar.f29782d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i11++;
            i12 = i13;
        }
        i90.a aVar = new i90.a(str, enumArr);
        aVar.f23583c = yVar;
        return aVar;
    }

    public static final int f(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        serialDescriptorArr.getClass();
        int iHashCode = (serialDescriptor.a().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int iE = serialDescriptor.e();
        int i11 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i12 = iE - 1;
            int i13 = i11 * 31;
            String strA = serialDescriptor.h(serialDescriptor.e() - iE).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i11 = i13 + iHashCode2;
            iE = i12;
        }
        int iE2 = serialDescriptor.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i11) * 31) + iHashCode3;
            }
            int i14 = iE2 - 1;
            int i15 = iHashCode3 * 31;
            p30.b kind = serialDescriptor.h(serialDescriptor.e() - iE2).getKind();
            iHashCode3 = i15 + (kind != null ? kind.hashCode() : 0);
            iE2 = i14;
        }
    }

    public static final KSerializer g(Object obj, KSerializer... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i11 = 0; i11 < length; i11++) {
                    clsArr2[i11] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause == null) {
                throw e5;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e5.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final KClass h(KType kType) {
        kType.getClass();
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameter)) {
            j4.d.o(classifier, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }

    public static final String i(KClass kClass) {
        kClass.getClass();
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return w.a0.p("Serializer for class '", simpleName, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final void j(int i11, int i12, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int i13 = (~i11) & i12;
        for (int i14 = 0; i14 < 32; i14++) {
            if ((i13 & 1) != 0) {
                arrayList.add(serialDescriptor.f(i14));
            }
            i13 >>>= 1;
        }
        throw new MissingFieldException(serialDescriptor.a(), arrayList);
    }

    public static final void k(String str, KClass kClass) {
        String string;
        kClass.getClass();
        String str2 = "in the polymorphic scope of '" + kClass.getSimpleName() + '\'';
        if (str == null) {
            string = e0.f.g('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbT = e0.f.t("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            j4.s.A(sbT, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbT.append(kClass.getSimpleName());
            sbT.append("' has to be sealed and '@Serializable'.");
            string = sbT.toString();
        }
        throw new SerializationException(string);
    }

    public static final String l(SerialDescriptor serialDescriptor) {
        return CollectionsKt.U(n80.p.j(0, serialDescriptor.e()), ", ", serialDescriptor.a() + '(', ")", new f2.k(serialDescriptor, 1), 24);
    }
}
