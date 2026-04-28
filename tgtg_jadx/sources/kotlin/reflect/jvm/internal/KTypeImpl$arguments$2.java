package kotlin.reflect.jvm.internal;

import e40.a;
import j4.d;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKTypeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl$arguments$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1559#2:137\n1590#2,4:138\n*S KotlinDebug\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl$arguments$2\n*L\n81#1:137\n81#1:138,4\n*E\n"})
public final class KTypeImpl$arguments$2 extends Lambda implements Function0<List<? extends KTypeProjection>> {
    final /* synthetic */ Function0<Type> $computeJavaType;
    final /* synthetic */ KTypeImpl this$0;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KTypeImpl$arguments$2(KTypeImpl kTypeImpl, Function0<? extends Type> function0) {
        super(0);
        this.this$0 = kTypeImpl;
        this.$computeJavaType = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Type> invoke$lambda$0(j jVar) {
        return (List) jVar.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<KTypeProjection> invoke() {
        KTypeProjection kTypeProjectionInvariant;
        List<TypeProjection> arguments = this.this$0.getType().getArguments();
        if (arguments.isEmpty()) {
            return n0.f26529a;
        }
        m mVar = m.PUBLICATION;
        final KTypeImpl kTypeImpl = this.this$0;
        final j jVarA = l.a(mVar, new Function0<List<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$parameterizedTypeArguments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<Type> invoke() {
                Type javaType = kTypeImpl.getJavaType();
                javaType.getClass();
                return ReflectClassUtilKt.getParameterizedTypeArguments(javaType);
            }
        });
        Function0<Type> function0 = this.$computeJavaType;
        final KTypeImpl kTypeImpl2 = this.this$0;
        ArrayList arrayList = new ArrayList(e0.o(arguments, 10));
        final int i11 = 0;
        for (Object obj : arguments) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (typeProjection.isStarProjection()) {
                kTypeProjectionInvariant = KTypeProjection.INSTANCE.getSTAR();
            } else {
                KotlinType type = typeProjection.getType();
                type.getClass();
                KTypeImpl kTypeImpl3 = new KTypeImpl(type, function0 != null ? new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$1$type$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Type invoke() {
                        Type javaType = kTypeImpl2.getJavaType();
                        if (javaType instanceof Class) {
                            Class cls = (Class) javaType;
                            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                            componentType.getClass();
                            return componentType;
                        }
                        if (javaType instanceof GenericArrayType) {
                            if (i11 != 0) {
                                d.r(kTypeImpl2, "Array type has been queried for a non-0th argument: ");
                                return null;
                            }
                            Type genericComponentType = ((GenericArrayType) javaType).getGenericComponentType();
                            genericComponentType.getClass();
                            return genericComponentType;
                        }
                        if (!(javaType instanceof ParameterizedType)) {
                            d.r(kTypeImpl2, "Non-generic type has been queried for arguments: ");
                            return null;
                        }
                        Type type2 = (Type) KTypeImpl$arguments$2.invoke$lambda$0(jVarA).get(i11);
                        if (type2 instanceof WildcardType) {
                            WildcardType wildcardType = (WildcardType) type2;
                            Type[] lowerBounds = wildcardType.getLowerBounds();
                            lowerBounds.getClass();
                            Type type3 = (Type) y.y(lowerBounds);
                            if (type3 == null) {
                                Type[] upperBounds = wildcardType.getUpperBounds();
                                upperBounds.getClass();
                                type2 = (Type) y.x(upperBounds);
                            } else {
                                type2 = type3;
                            }
                        }
                        type2.getClass();
                        return type2;
                    }
                } : null);
                int i13 = WhenMappings.$EnumSwitchMapping$0[typeProjection.getProjectionKind().ordinal()];
                if (i13 == 1) {
                    kTypeProjectionInvariant = KTypeProjection.INSTANCE.invariant(kTypeImpl3);
                } else if (i13 == 2) {
                    kTypeProjectionInvariant = KTypeProjection.INSTANCE.contravariant(kTypeImpl3);
                } else {
                    if (i13 != 3) {
                        a.f();
                        return null;
                    }
                    kTypeProjectionInvariant = KTypeProjection.INSTANCE.covariant(kTypeImpl3);
                }
            }
            arrayList.add(kTypeProjectionInvariant);
            i11 = i12;
        }
        return arrayList;
    }
}
