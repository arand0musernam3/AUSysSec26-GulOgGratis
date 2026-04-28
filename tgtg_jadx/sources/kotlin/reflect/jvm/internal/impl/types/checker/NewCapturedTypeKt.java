package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1#2:291\n1#2:310\n1655#3,8:292\n1603#3,9:300\n1855#3:309\n1856#3:311\n1612#3:312\n1726#3,3:313\n1549#3:316\n1620#3,3:317\n1620#3,3:320\n1549#3:323\n1620#3,3:324\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n*L\n122#1:310\n117#1:292,8\n122#1:300,9\n122#1:309\n122#1:311\n122#1:312\n154#1:313,3\n156#1:316\n156#1:317,3\n176#1:320,3\n81#1:323\n81#1:324,3\n*E\n"})
public final class NewCapturedTypeKt {
    private static final List<TypeProjection> captureArguments(UnwrappedType unwrappedType, CaptureStatus captureStatus) {
        List<TypeProjection> arguments;
        if (unwrappedType.getArguments().size() == unwrappedType.getConstructor().getParameters().size() && ((arguments = unwrappedType.getArguments()) == null || !arguments.isEmpty())) {
            Iterator<T> it = arguments.iterator();
            while (it.hasNext()) {
                if (((TypeProjection) it.next()).getProjectionKind() != Variance.INVARIANT) {
                    List<TypeParameterDescriptor> parameters = unwrappedType.getConstructor().getParameters();
                    parameters.getClass();
                    ArrayList<Pair> arrayListY0 = CollectionsKt.y0(arguments, parameters);
                    ArrayList arrayList = new ArrayList(e0.o(arrayListY0, 10));
                    for (Pair pair : arrayListY0) {
                        TypeProjection typeProjectionAsTypeProjection = (TypeProjection) pair.f26485a;
                        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.f26486b;
                        if (typeProjectionAsTypeProjection.getProjectionKind() != Variance.INVARIANT) {
                            UnwrappedType unwrappedTypeUnwrap = (typeProjectionAsTypeProjection.isStarProjection() || typeProjectionAsTypeProjection.getProjectionKind() != Variance.IN_VARIANCE) ? null : typeProjectionAsTypeProjection.getType().unwrap();
                            typeParameterDescriptor.getClass();
                            typeProjectionAsTypeProjection = TypeUtilsKt.asTypeProjection(new NewCapturedType(captureStatus, unwrappedTypeUnwrap, typeProjectionAsTypeProjection, typeParameterDescriptor));
                        }
                        arrayList.add(typeProjectionAsTypeProjection);
                    }
                    TypeSubstitutor typeSubstitutorBuildSubstitutor = TypeConstructorSubstitution.Companion.create(unwrappedType.getConstructor(), arrayList).buildSubstitutor();
                    int size = arguments.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TypeProjection typeProjection = arguments.get(i11);
                        TypeProjection typeProjection2 = (TypeProjection) arrayList.get(i11);
                        if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                            List<KotlinType> upperBounds = unwrappedType.getConstructor().getParameters().get(i11).getUpperBounds();
                            upperBounds.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeSubstitutorBuildSubstitutor.safeSubstitute((KotlinType) it2.next(), Variance.INVARIANT).unwrap()));
                            }
                            if (!typeProjection.isStarProjection() && typeProjection.getProjectionKind() == Variance.OUT_VARIANCE) {
                                arrayList2.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeProjection.getType().unwrap()));
                            }
                            KotlinType type = typeProjection2.getType();
                            type.getClass();
                            ((NewCapturedType) type).getConstructor().initializeSupertypes(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    @Nullable
    public static final SimpleType captureFromArguments(@NotNull SimpleType simpleType, @NotNull CaptureStatus captureStatus) {
        simpleType.getClass();
        captureStatus.getClass();
        List<TypeProjection> listCaptureArguments = captureArguments(simpleType, captureStatus);
        if (listCaptureArguments != null) {
            return replaceArguments(simpleType, listCaptureArguments);
        }
        return null;
    }

    private static final SimpleType replaceArguments(UnwrappedType unwrappedType, List<? extends TypeProjection> list) {
        return KotlinTypeFactory.simpleType$default(unwrappedType.getAttributes(), unwrappedType.getConstructor(), list, unwrappedType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
    }
}
