package kotlin.reflect.jvm.internal;

import com.braze.ui.actions.brazeactions.steps.StepData;
import j4.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.h0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import m0.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w70.a;
import x70.c;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00028\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00028\u00002\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00028\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ3\u0010\u001d\u001a\u00028\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n2\f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR.\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020  !*\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R.\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b !*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010$0$0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\"\u0010'\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010&0&0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R.\u0010)\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020( !*\n\u0012\u0004\u0012\u00020(\u0018\u00010\u001f0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#R2\u0010*\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 !*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010#R\u0018\u0010.\u001a\u0006\u0012\u0002\b\u00030+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020 0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010?\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020@0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00109R\u0016\u0010F\u001a\u0004\u0018\u00010C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u00107R\u0014\u0010H\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u00107R\u0014\u0010I\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u00107R\u0014\u0010J\u001a\u0002058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bJ\u00107R\u0014\u0010N\u001a\u00020K8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "<init>", "()V", "", "", "getAbsentArguments", "()[Ljava/lang/Object;", "", "Lkotlin/reflect/KParameter;", StepData.ARGS, "callAnnotationConstructor", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/reflect/KType;", "type", "defaultEmptyArray", "(Lkotlin/reflect/KType;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "extractContinuationArgument", "()Ljava/lang/reflect/Type;", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "Lx70/c;", "continuationArgument", "callDefaultMethod$kotlin_reflection", "(Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "callDefaultMethod", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "", "kotlin.jvm.PlatformType", "_annotations", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "Ljava/util/ArrayList;", "_parameters", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "_typeParameters", "_absentArguments", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getDefaultCaller", "defaultCaller", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "isBound", "()Z", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()Lkotlin/reflect/KType;", "returnType", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "isOpen", "isAbstract", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n+ 2 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,243:1\n224#2,5:244\n224#2,2:249\n226#2,3:252\n224#2,5:255\n224#2,5:260\n224#2,2:269\n226#2,3:273\n26#3:251\n1549#4:265\n1620#4,3:266\n37#5,2:271\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n*L\n106#1:244,5\n148#1:249,2\n148#1:252,3\n187#1:255,5\n195#1:260,5\n215#1:269,2\n215#1:273,3\n149#1:251\n201#1:265\n201#1:266,3\n216#1:271,2\n*E\n"})
public abstract class KCallableImpl<R> implements KCallable<R>, KTypeParameterOwnerImpl {

    @NotNull
    private final ReflectProperties.LazySoftVal<Object[]> _absentArguments;

    @NotNull
    private final ReflectProperties.LazySoftVal<List<Annotation>> _annotations;

    @NotNull
    private final ReflectProperties.LazySoftVal<ArrayList<KParameter>> _parameters;

    @NotNull
    private final ReflectProperties.LazySoftVal<KTypeImpl> _returnType;

    @NotNull
    private final ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> _typeParameters;

    public KCallableImpl() {
        ReflectProperties.LazySoftVal<List<Annotation>> lazySoftValLazySoft = ReflectProperties.lazySoft(new Function0<List<? extends Annotation>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_annotations$1
            final /* synthetic */ KCallableImpl<R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<Annotation> invoke() {
                return UtilKt.computeAnnotations(this.this$0.getDescriptor());
            }
        });
        lazySoftValLazySoft.getClass();
        this._annotations = lazySoftValLazySoft;
        ReflectProperties.LazySoftVal<ArrayList<KParameter>> lazySoftValLazySoft2 = ReflectProperties.lazySoft(new Function0<ArrayList<KParameter>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1
            final /* synthetic */ KCallableImpl<R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ArrayList<KParameter> invoke() {
                int i11;
                final CallableMemberDescriptor descriptor = this.this$0.getDescriptor();
                ArrayList<KParameter> arrayList = new ArrayList<>();
                final int i12 = 0;
                if (this.this$0.isBound()) {
                    i11 = 0;
                } else {
                    final ReceiverParameterDescriptor instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(descriptor);
                    if (instanceReceiverParameter != null) {
                        arrayList.add(new KParameterImpl(this.this$0, 0, KParameter.Kind.INSTANCE, new Function0<ParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final ParameterDescriptor invoke() {
                                return instanceReceiverParameter;
                            }
                        }));
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    final ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
                    if (extensionReceiverParameter != null) {
                        arrayList.add(new KParameterImpl(this.this$0, i11, KParameter.Kind.EXTENSION_RECEIVER, new Function0<ParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final ParameterDescriptor invoke() {
                                return extensionReceiverParameter;
                            }
                        }));
                        i11++;
                    }
                }
                int size = descriptor.getValueParameters().size();
                while (i12 < size) {
                    arrayList.add(new KParameterImpl(this.this$0, i11, KParameter.Kind.VALUE, new Function0<ParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final ParameterDescriptor invoke() {
                            ValueParameterDescriptor valueParameterDescriptor = descriptor.getValueParameters().get(i12);
                            valueParameterDescriptor.getClass();
                            return valueParameterDescriptor;
                        }
                    }));
                    i12++;
                    i11++;
                }
                if (this.this$0.isAnnotationConstructor() && (descriptor instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
                    h0.r(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$invoke$$inlined$sortBy$1
                        @Override // java.util.Comparator
                        public final int compare(T t9, T t11) {
                            return a.a(((KParameter) t9).getName(), ((KParameter) t11).getName());
                        }
                    });
                }
                arrayList.trimToSize();
                return arrayList;
            }
        });
        lazySoftValLazySoft2.getClass();
        this._parameters = lazySoftValLazySoft2;
        ReflectProperties.LazySoftVal<KTypeImpl> lazySoftValLazySoft3 = ReflectProperties.lazySoft(new Function0<KTypeImpl>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1
            final /* synthetic */ KCallableImpl<R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final KTypeImpl invoke() {
                KotlinType returnType = this.this$0.getDescriptor().getReturnType();
                returnType.getClass();
                final KCallableImpl<R> kCallableImpl = this.this$0;
                return new KTypeImpl(returnType, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Type invoke() {
                        Type typeExtractContinuationArgument = kCallableImpl.extractContinuationArgument();
                        return typeExtractContinuationArgument == null ? kCallableImpl.getCaller().getReturnType() : typeExtractContinuationArgument;
                    }
                });
            }
        });
        lazySoftValLazySoft3.getClass();
        this._returnType = lazySoftValLazySoft3;
        ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> lazySoftValLazySoft4 = ReflectProperties.lazySoft(new Function0<List<? extends KTypeParameterImpl>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_typeParameters$1
            final /* synthetic */ KCallableImpl<R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<KTypeParameterImpl> invoke() {
                List<TypeParameterDescriptor> typeParameters = this.this$0.getDescriptor().getTypeParameters();
                typeParameters.getClass();
                KTypeParameterOwnerImpl kTypeParameterOwnerImpl = this.this$0;
                ArrayList arrayList = new ArrayList(e0.o(typeParameters, 10));
                for (TypeParameterDescriptor typeParameterDescriptor : typeParameters) {
                    typeParameterDescriptor.getClass();
                    arrayList.add(new KTypeParameterImpl(kTypeParameterOwnerImpl, typeParameterDescriptor));
                }
                return arrayList;
            }
        });
        lazySoftValLazySoft4.getClass();
        this._typeParameters = lazySoftValLazySoft4;
        ReflectProperties.LazySoftVal<Object[]> lazySoftValLazySoft5 = ReflectProperties.lazySoft(new Function0<Object[]>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_absentArguments$1
            final /* synthetic */ KCallableImpl<R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                int size = (this.this$0.isSuspend() ? 1 : 0) + this.this$0.getParameters().size();
                int size2 = (this.this$0.getParameters().size() + 31) / 32;
                Object[] objArr = new Object[size + size2 + 1];
                List<KParameter> parameters = this.this$0.getParameters();
                KCallableImpl<R> kCallableImpl = this.this$0;
                for (KParameter kParameter : parameters) {
                    if (kParameter.isOptional() && !UtilKt.isInlineClassType(kParameter.getType())) {
                        objArr[kParameter.getIndex()] = UtilKt.defaultPrimitiveValue(ReflectJvmMapping.getJavaType(kParameter.getType()));
                    } else if (kParameter.isVararg()) {
                        objArr[kParameter.getIndex()] = kCallableImpl.defaultEmptyArray(kParameter.getType());
                    }
                }
                for (int i11 = 0; i11 < size2; i11++) {
                    objArr[size + i11] = 0;
                }
                return objArr;
            }
        });
        lazySoftValLazySoft5.getClass();
        this._absentArguments = lazySoftValLazySoft5;
    }

    private final R callAnnotationConstructor(Map<KParameter, ? extends Object> args) throws IllegalCallableAccessException {
        Object objDefaultEmptyArray;
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(e0.o(parameters, 10));
        for (KParameter kParameter : parameters) {
            if (args.containsKey(kParameter)) {
                objDefaultEmptyArray = args.get(kParameter);
                if (objDefaultEmptyArray == null) {
                    i1.f(kParameter, 41, "Annotation argument value cannot be null (");
                    return null;
                }
            } else if (kParameter.isOptional()) {
                objDefaultEmptyArray = null;
            } else {
                if (!kParameter.isVararg()) {
                    d.o(kParameter, "No argument provided for a required parameter: ");
                    return null;
                }
                objDefaultEmptyArray = defaultEmptyArray(kParameter.getType());
            }
            arrayList.add(objDefaultEmptyArray);
        }
        Caller<?> defaultCaller = getDefaultCaller();
        if (defaultCaller == null) {
            d.r(getDescriptor(), "This callable does not support a default call: ");
            return null;
        }
        try {
            return (R) defaultCaller.call(arrayList.toArray(new Object[0]));
        } catch (IllegalAccessException e5) {
            throw new IllegalCallableAccessException(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object defaultEmptyArray(KType type) {
        Class clsV = w.v(KTypesJvm.getJvmErasure(type));
        if (clsV.isArray()) {
            Object objNewInstance = Array.newInstance(clsV.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsV.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Type extractContinuationArgument() {
        Type[] lowerBounds;
        if (isSuspend()) {
            Object objX = CollectionsKt.X(getCaller().getParameterTypes());
            ParameterizedType parameterizedType = objX instanceof ParameterizedType ? (ParameterizedType) objX : null;
            if (Intrinsics.areEqual(parameterizedType != null ? parameterizedType.getRawType() : null, c.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object objM = y.M(actualTypeArguments);
                WildcardType wildcardType = objM instanceof WildcardType ? (WildcardType) objM : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) y.x(lowerBounds);
                }
            }
        }
        return null;
    }

    private final Object[] getAbsentArguments() {
        return (Object[]) this._absentArguments.invoke().clone();
    }

    @Override // kotlin.reflect.KCallable
    public R call(@NotNull Object... args) throws IllegalCallableAccessException {
        args.getClass();
        try {
            return (R) getCaller().call(args);
        } catch (IllegalAccessException e5) {
            throw new IllegalCallableAccessException(e5);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(@NotNull Map<KParameter, ? extends Object> args) {
        args.getClass();
        return isAnnotationConstructor() ? callAnnotationConstructor(args) : callDefaultMethod$kotlin_reflection(args, null);
    }

    public final R callDefaultMethod$kotlin_reflection(@NotNull Map<KParameter, ? extends Object> args, @Nullable c<?> continuationArgument) throws IllegalCallableAccessException {
        args.getClass();
        List<KParameter> parameters = getParameters();
        boolean z11 = false;
        if (parameters.isEmpty()) {
            try {
                return (R) getCaller().call(isSuspend() ? new c[]{continuationArgument} : new c[0]);
            } catch (IllegalAccessException e5) {
                throw new IllegalCallableAccessException(e5);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters.size();
        Object[] absentArguments = getAbsentArguments();
        if (isSuspend()) {
            absentArguments[parameters.size()] = continuationArgument;
        }
        int i11 = 0;
        for (KParameter kParameter : parameters) {
            if (args.containsKey(kParameter)) {
                absentArguments[kParameter.getIndex()] = args.get(kParameter);
            } else if (kParameter.isOptional()) {
                int i12 = (i11 / 32) + size;
                Object obj = absentArguments[i12];
                obj.getClass();
                absentArguments[i12] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i11 % 32)));
                z11 = true;
            } else if (!kParameter.isVararg()) {
                d.o(kParameter, "No argument provided for a required parameter: ");
                return null;
            }
            if (kParameter.getKind() == KParameter.Kind.VALUE) {
                i11++;
            }
        }
        if (!z11) {
            try {
                return (R) getCaller().call(Arrays.copyOf(absentArguments, size));
            } catch (IllegalAccessException e11) {
                throw new IllegalCallableAccessException(e11);
            }
        }
        Caller<?> defaultCaller = getDefaultCaller();
        if (defaultCaller == null) {
            d.r(getDescriptor(), "This callable does not support a default call: ");
            return null;
        }
        try {
            return (R) defaultCaller.call(absentArguments);
        } catch (IllegalAccessException e12) {
            throw new IllegalCallableAccessException(e12);
        }
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this._annotations.invoke();
        listInvoke.getClass();
        return listInvoke;
    }

    @NotNull
    public abstract Caller<?> getCaller();

    @NotNull
    public abstract KDeclarationContainerImpl getContainer();

    @Nullable
    public abstract Caller<?> getDefaultCaller();

    @NotNull
    public abstract CallableMemberDescriptor getDescriptor();

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KParameter> getParameters() {
        ArrayList<KParameter> arrayListInvoke = this._parameters.invoke();
        arrayListInvoke.getClass();
        return arrayListInvoke;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public KType getReturnType() {
        KTypeImpl kTypeImplInvoke = this._returnType.invoke();
        kTypeImplInvoke.getClass();
        return kTypeImplInvoke;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        List<KTypeParameterImpl> listInvoke = this._typeParameters.invoke();
        listInvoke.getClass();
        return listInvoke;
    }

    @Override // kotlin.reflect.KCallable
    @Nullable
    public KVisibility getVisibility() {
        DescriptorVisibility visibility = getDescriptor().getVisibility();
        visibility.getClass();
        return UtilKt.toKVisibility(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return getDescriptor().getModality() == Modality.ABSTRACT;
    }

    public final boolean isAnnotationConstructor() {
        return Intrinsics.areEqual(getName(), "<init>") && getContainer().getJClass().isAnnotation();
    }

    public abstract boolean isBound();

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return getDescriptor().getModality() == Modality.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return getDescriptor().getModality() == Modality.OPEN;
    }
}
