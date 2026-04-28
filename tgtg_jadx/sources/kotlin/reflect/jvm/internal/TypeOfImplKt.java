package kotlin.reflect.jvm.internal;

import i4.a;
import j4.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\bH\u0002¨\u0006\t"}, d2 = {"createMutableCollectionKType", "Lkotlin/reflect/KType;", "type", "createNothingType", "createPlatformKType", "lowerBound", "upperBound", "readOnlyToMutable", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\ntypeOfImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeOfImpl.kt\nkotlin/reflect/jvm/internal/TypeOfImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class TypeOfImplKt {
    @NotNull
    public static final KType createMutableCollectionKType(@NotNull KType kType) {
        kType.getClass();
        KotlinType type = ((KTypeImpl) kType).getType();
        if (!(type instanceof SimpleType)) {
            a.j(kType, "Non-simple type cannot be a mutable collection type: ");
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo977getDeclarationDescriptor = type.getConstructor().mo977getDeclarationDescriptor();
        ClassDescriptor classDescriptor = classifierDescriptorMo977getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo977getDeclarationDescriptor : null;
        if (classDescriptor == null) {
            d.o(kType, "Non-class type cannot be a mutable collection type: ");
            return null;
        }
        SimpleType simpleType = (SimpleType) type;
        TypeConstructor typeConstructor = readOnlyToMutable(classDescriptor).getTypeConstructor();
        typeConstructor.getClass();
        return new KTypeImpl(KotlinTypeFactory.simpleType$default(simpleType, (TypeAttributes) null, typeConstructor, (List) null, false, 26, (Object) null), null, 2, null);
    }

    @NotNull
    public static final KType createNothingType(@NotNull KType kType) {
        kType.getClass();
        KotlinType type = ((KTypeImpl) kType).getType();
        if (!(type instanceof SimpleType)) {
            a.j(kType, "Non-simple type cannot be a Nothing type: ");
            return null;
        }
        SimpleType simpleType = (SimpleType) type;
        TypeConstructor typeConstructor = TypeUtilsKt.getBuiltIns(type).getNothing().getTypeConstructor();
        typeConstructor.getClass();
        return new KTypeImpl(KotlinTypeFactory.simpleType$default(simpleType, (TypeAttributes) null, typeConstructor, (List) null, false, 26, (Object) null), null, 2, null);
    }

    @NotNull
    public static final KType createPlatformKType(@NotNull KType kType, @NotNull KType kType2) {
        kType.getClass();
        kType2.getClass();
        KotlinType type = ((KTypeImpl) kType).getType();
        type.getClass();
        KotlinType type2 = ((KTypeImpl) kType2).getType();
        type2.getClass();
        return new KTypeImpl(KotlinTypeFactory.flexibleType((SimpleType) type, (SimpleType) type2), null, 2, null);
    }

    private static final ClassDescriptor readOnlyToMutable(ClassDescriptor classDescriptor) {
        FqName onlyToMutable = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(DescriptorUtilsKt.getFqNameUnsafe(classDescriptor));
        if (onlyToMutable == null) {
            d.o(classDescriptor, "Not a readonly collection: ");
            return null;
        }
        ClassDescriptor builtInClassByFqName = DescriptorUtilsKt.getBuiltIns(classDescriptor).getBuiltInClassByFqName(onlyToMutable);
        builtInClassByFqName.getClass();
        return builtInClassByFqName;
    }
}
