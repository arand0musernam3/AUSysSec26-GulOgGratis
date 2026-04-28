package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import j4.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMemberDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n1#2:372\n1#2:391\n1559#3:373\n1590#3,4:374\n1569#3,11:378\n1864#3,2:389\n1866#3:392\n1580#3:393\n1549#3:394\n1620#3,3:395\n1559#3:398\n1590#3,4:399\n*S KotlinDebug\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n*L\n215#1:391\n63#1:373\n63#1:374,4\n215#1:378,11\n215#1:389,2\n215#1:392\n215#1:393\n243#1:394\n243#1:395,3\n327#1:398\n327#1:399,4\n*E\n"})
public final class MemberDeserializer {

    @NotNull
    private final AnnotationDeserializer annotationDeserializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final DeserializationContext f26569c;

    public MemberDeserializer(@NotNull DeserializationContext deserializationContext) {
        deserializationContext.getClass();
        this.f26569c = deserializationContext;
        this.annotationDeserializer = new AnnotationDeserializer(deserializationContext.getComponents().getModuleDescriptor(), deserializationContext.getComponents().getNotFoundClasses());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProtoContainer asProtoContainer(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.f26569c.getNameResolver(), this.f26569c.getTypeTable(), this.f26569c.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    private final Annotations getAnnotations(final MessageLite messageLite, int i11, final AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.HAS_ANNOTATIONS.get(i11).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f26569c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.getAnnotations.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<AnnotationDescriptor> invoke() {
                List<AnnotationDescriptor> listR0;
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f26569c.getContainingDeclaration());
                if (protoContainerAsProtoContainer != null) {
                    listR0 = CollectionsKt.r0(MemberDeserializer.this.f26569c.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(protoContainerAsProtoContainer, messageLite, annotatedCallableKind));
                } else {
                    listR0 = null;
                }
                return listR0 == null ? n0.f26529a : listR0;
            }
        });
    }

    private final ReceiverParameterDescriptor getDispatchReceiverParameter() {
        DeclarationDescriptor containingDeclaration = this.f26569c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            return classDescriptor.getThisAsReceiverParameter();
        }
        return null;
    }

    private final Annotations getPropertyFieldAnnotations(final ProtoBuf.Property property, final boolean z11) {
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f26569c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.getPropertyFieldAnnotations.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<AnnotationDescriptor> invoke() {
                List<AnnotationDescriptor> listR0;
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f26569c.getContainingDeclaration());
                if (protoContainerAsProtoContainer != null) {
                    boolean z12 = z11;
                    MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    ProtoBuf.Property property2 = property;
                    listR0 = z12 ? CollectionsKt.r0(memberDeserializer2.f26569c.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(protoContainerAsProtoContainer, property2)) : CollectionsKt.r0(memberDeserializer2.f26569c.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(protoContainerAsProtoContainer, property2));
                } else {
                    listR0 = null;
                }
                return listR0 == null ? n0.f26529a : listR0;
            }
        });
    }

    private final Annotations getReceiverParameterAnnotations(final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f26569c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.getReceiverParameterAnnotations.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<AnnotationDescriptor> invoke() {
                List<AnnotationDescriptor> listLoadExtensionReceiverParameterAnnotations;
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f26569c.getContainingDeclaration());
                if (protoContainerAsProtoContainer != null) {
                    listLoadExtensionReceiverParameterAnnotations = MemberDeserializer.this.f26569c.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(protoContainerAsProtoContainer, messageLite, annotatedCallableKind);
                } else {
                    listLoadExtensionReceiverParameterAnnotations = null;
                }
                return listLoadExtensionReceiverParameterAnnotations == null ? n0.f26529a : listLoadExtensionReceiverParameterAnnotations;
            }
        });
    }

    private final void initializeWithCoroutinesExperimentalityStatus(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<? extends ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
    }

    private final int loadOldFlags(int i11) {
        return (i11 & 63) + ((i11 >> 8) << 6);
    }

    private final ReceiverParameterDescriptor toContextReceiver(ProtoBuf.Type type, DeserializationContext deserializationContext, CallableDescriptor callableDescriptor, int i11) {
        return DescriptorFactory.createContextReceiverParameterForCallable(callableDescriptor, deserializationContext.getTypeDeserializer().type(type), null, Annotations.Companion.getEMPTY(), i11);
    }

    private final List<ValueParameterDescriptor> valueParameters(List<ProtoBuf.ValueParameter> list, final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        MemberDeserializer memberDeserializer;
        ProtoContainer protoContainer;
        Annotations empty;
        final MemberDeserializer memberDeserializer2 = this;
        DeclarationDescriptor containingDeclaration = memberDeserializer2.f26569c.getContainingDeclaration();
        containingDeclaration.getClass();
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        containingDeclaration2.getClass();
        final ProtoContainer protoContainerAsProtoContainer = memberDeserializer2.asProtoContainer(containingDeclaration2);
        ArrayList arrayList = new ArrayList(e0.o(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            KotlinType kotlinTypeType = null;
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            final ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            if (protoContainerAsProtoContainer == null || !s.B(Flags.HAS_ANNOTATIONS, flags)) {
                memberDeserializer = memberDeserializer2;
                protoContainer = protoContainerAsProtoContainer;
                empty = Annotations.Companion.getEMPTY();
            } else {
                final int i13 = i11;
                memberDeserializer = memberDeserializer2;
                protoContainer = protoContainerAsProtoContainer;
                i11 = i13;
                empty = new NonEmptyDeserializedAnnotations(memberDeserializer2.f26569c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$1$annotations$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final List<AnnotationDescriptor> invoke() {
                        return CollectionsKt.r0(this.this$0.f26569c.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(protoContainerAsProtoContainer, messageLite, annotatedCallableKind, i13, valueParameter));
                    }
                });
            }
            Annotations annotations = empty;
            Name name = NameResolverUtilKt.getName(memberDeserializer.f26569c.getNameResolver(), valueParameter.getName());
            KotlinType kotlinTypeType2 = memberDeserializer.f26569c.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, memberDeserializer.f26569c.getTypeTable()));
            boolean zB = s.B(Flags.DECLARES_DEFAULT_VALUE, flags);
            boolean zB2 = s.B(Flags.IS_CROSSINLINE, flags);
            boolean zB3 = s.B(Flags.IS_NOINLINE, flags);
            ProtoBuf.Type typeVarargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, memberDeserializer.f26569c.getTypeTable());
            if (typeVarargElementType != null) {
                kotlinTypeType = memberDeserializer.f26569c.getTypeDeserializer().type(typeVarargElementType);
            }
            SourceElement sourceElement = SourceElement.NO_SOURCE;
            sourceElement.getClass();
            CallableDescriptor callableDescriptor2 = callableDescriptor;
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor2, null, i11, annotations, name, kotlinTypeType2, zB, zB2, zB3, kotlinTypeType, sourceElement));
            memberDeserializer2 = memberDeserializer;
            callableDescriptor = callableDescriptor2;
            i11 = i12;
            protoContainerAsProtoContainer = protoContainer;
        }
        return CollectionsKt.r0(arrayList);
    }

    @NotNull
    public final ClassConstructorDescriptor loadConstructor(@NotNull ProtoBuf.Constructor constructor, boolean z11) {
        constructor.getClass();
        DeclarationDescriptor containingDeclaration = this.f26569c.getContainingDeclaration();
        containingDeclaration.getClass();
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        int flags = constructor.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, getAnnotations(constructor, flags, annotatedCallableKind), z11, CallableMemberDescriptor.Kind.DECLARATION, constructor, this.f26569c.getNameResolver(), this.f26569c.getTypeTable(), this.f26569c.getVersionRequirementTable(), this.f26569c.getContainerSource(), null, 1024, null);
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.f26569c, deserializedClassConstructorDescriptor, n0.f26529a, null, null, null, null, 60, null).getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
        valueParameterList.getClass();
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.valueParameters(valueParameterList, constructor, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(constructor.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setExpect(classDescriptor.isExpect());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(constructor.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    @NotNull
    public final SimpleFunctionDescriptor loadFunction(@NotNull ProtoBuf.Function function) {
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable;
        Throwable th2;
        KotlinType kotlinTypeType;
        function.getClass();
        int flags = function.hasFlags() ? function.getFlags() : loadOldFlags(function.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotations = getAnnotations(function, flags, annotatedCallableKind);
        Annotations receiverParameterAnnotations = ProtoTypeTableUtilKt.hasReceiver(function) ? getReceiverParameterAnnotations(function, annotatedCallableKind) : Annotations.Companion.getEMPTY();
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(this.f26569c.getContainingDeclaration(), null, annotations, NameResolverUtilKt.getName(this.f26569c.getNameResolver(), function.getName()), ProtoEnumFlagsUtilsKt.memberKind(ProtoEnumFlags.INSTANCE, Flags.MEMBER_KIND.get(flags)), function, this.f26569c.getNameResolver(), this.f26569c.getTypeTable(), Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(this.f26569c.getContainingDeclaration()).child(NameResolverUtilKt.getName(this.f26569c.getNameResolver(), function.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : this.f26569c.getVersionRequirementTable(), this.f26569c.getContainerSource(), null, 1024, null);
        DeserializationContext deserializationContext = this.f26569c;
        List<ProtoBuf.TypeParameter> typeParameterList = function.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(function, this.f26569c.getTypeTable());
        if (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) {
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = null;
            th2 = null;
        } else {
            receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, kotlinTypeType, receiverParameterAnnotations);
            th2 = null;
        }
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(function, this.f26569c.getTypeTable());
        Throwable th3 = th2;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listContextReceiverTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                d0.n();
                throw th3;
            }
            ReceiverParameterDescriptor contextReceiver = toContextReceiver((ProtoBuf.Type) obj, deserializationContextChildContext$default, deserializedSimpleFunctionDescriptor, i11);
            if (contextReceiver != null) {
                arrayList.add(contextReceiver);
            }
            i11 = i12;
        }
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer = deserializationContextChildContext$default.getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
        valueParameterList.getClass();
        List<ValueParameterDescriptor> listValueParameters = memberDeserializer.valueParameters(valueParameterList, function, AnnotatedCallableKind.FUNCTION);
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(function, this.f26569c.getTypeTable()));
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        Modality modality = protoEnumFlags.modality(Flags.MODALITY.get(flags));
        DescriptorVisibility descriptorVisibility = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags));
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        initializeWithCoroutinesExperimentalityStatus(deserializedSimpleFunctionDescriptor, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, dispatchReceiverParameter, arrayList, ownTypeParameters, listValueParameters, kotlinTypeType2, modality, descriptorVisibility, o0Var);
        Boolean bool = Flags.IS_OPERATOR.get(flags);
        bool.getClass();
        deserializedSimpleFunctionDescriptor.setOperator(bool.booleanValue());
        Boolean bool2 = Flags.IS_INFIX.get(flags);
        bool2.getClass();
        deserializedSimpleFunctionDescriptor.setInfix(bool2.booleanValue());
        Boolean bool3 = Flags.IS_EXTERNAL_FUNCTION.get(flags);
        bool3.getClass();
        deserializedSimpleFunctionDescriptor.setExternal(bool3.booleanValue());
        Boolean bool4 = Flags.IS_INLINE.get(flags);
        bool4.getClass();
        deserializedSimpleFunctionDescriptor.setInline(bool4.booleanValue());
        Boolean bool5 = Flags.IS_TAILREC.get(flags);
        bool5.getClass();
        deserializedSimpleFunctionDescriptor.setTailrec(bool5.booleanValue());
        Boolean bool6 = Flags.IS_SUSPEND.get(flags);
        bool6.getClass();
        deserializedSimpleFunctionDescriptor.setSuspend(bool6.booleanValue());
        Boolean bool7 = Flags.IS_EXPECT_FUNCTION.get(flags);
        bool7.getClass();
        deserializedSimpleFunctionDescriptor.setExpect(bool7.booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(flags).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> pairDeserializeContractFromFunction = this.f26569c.getComponents().getContractDeserializer().deserializeContractFromFunction(function, deserializedSimpleFunctionDescriptor, this.f26569c.getTypeTable(), deserializationContextChildContext$default.getTypeDeserializer());
        if (pairDeserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap((CallableDescriptor.UserDataKey) pairDeserializeContractFromFunction.f26485a, pairDeserializeContractFromFunction.f26486b);
        }
        return deserializedSimpleFunctionDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final PropertyDescriptor loadProperty(@NotNull final ProtoBuf.Property property) {
        DeserializationContext deserializationContext;
        Flags.FlagField<ProtoBuf.Visibility> flagField;
        Flags.FlagField<ProtoBuf.Modality> flagField2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        KotlinType kotlinTypeType;
        property.getClass();
        int flags = property.hasFlags() ? property.getFlags() : loadOldFlags(property.getOldFlags());
        DeclarationDescriptor containingDeclaration = this.f26569c.getContainingDeclaration();
        Annotations annotations = getAnnotations(property, flags, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        int i11 = flags;
        final DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(containingDeclaration, null, annotations, protoEnumFlags.modality(Flags.MODALITY.get(flags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags)), s.B(Flags.IS_VAR, flags), NameResolverUtilKt.getName(this.f26569c.getNameResolver(), property.getName()), ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(flags)), s.B(Flags.IS_LATEINIT, flags), s.B(Flags.IS_CONST, flags), s.B(Flags.IS_EXTERNAL_PROPERTY, flags), s.B(Flags.IS_DELEGATED, flags), s.B(Flags.IS_EXPECT_PROPERTY, flags), property, this.f26569c.getNameResolver(), this.f26569c.getTypeTable(), this.f26569c.getVersionRequirementTable(), this.f26569c.getContainerSource());
        DeserializationContext deserializationContext2 = this.f26569c;
        List<ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext2, deserializedPropertyDescriptor, typeParameterList, null, null, null, null, 60, null);
        boolean zB = s.B(Flags.HAS_GETTER, i11);
        Annotations receiverParameterAnnotations = (zB && ProtoTypeTableUtilKt.hasReceiver(property)) ? getReceiverParameterAnnotations(property, AnnotatedCallableKind.PROPERTY_GETTER) : Annotations.Companion.getEMPTY();
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(property, this.f26569c.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(property, this.f26569c.getTypeTable());
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, kotlinTypeType, receiverParameterAnnotations);
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(property, this.f26569c.getTypeTable());
        ArrayList arrayList = new ArrayList(e0.o(listContextReceiverTypes, 10));
        int i12 = 0;
        for (Object obj : listContextReceiverTypes) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                d0.n();
                throw null;
            }
            arrayList.add(toContextReceiver((ProtoBuf.Type) obj, deserializationContextChildContext$default, deserializedPropertyDescriptor, i12));
            i12 = i13;
        }
        deserializedPropertyDescriptor.setType(kotlinTypeType2, ownTypeParameters, dispatchReceiverParameter, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, arrayList);
        boolean zB2 = s.B(Flags.HAS_ANNOTATIONS, i11);
        Flags.FlagField<ProtoBuf.Visibility> flagField3 = Flags.VISIBILITY;
        ProtoBuf.Visibility visibility = flagField3.get(i11);
        Flags.FlagField<ProtoBuf.Modality> flagField4 = Flags.MODALITY;
        int accessorFlags = Flags.getAccessorFlags(zB2, visibility, flagField4.get(i11), false, false, false);
        if (zB) {
            int getterFlags = property.hasGetterFlags() ? property.getGetterFlags() : accessorFlags;
            boolean zB3 = s.B(Flags.IS_NOT_DEFAULT, getterFlags);
            boolean zB4 = s.B(Flags.IS_EXTERNAL_ACCESSOR, getterFlags);
            boolean zB5 = s.B(Flags.IS_INLINE_ACCESSOR, getterFlags);
            Annotations annotations2 = getAnnotations(property, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zB3) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
                deserializationContext = deserializationContextChildContext$default;
                flagField2 = flagField4;
                flagField = flagField3;
                propertyGetterDescriptorImplCreateDefaultGetter = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations2, protoEnumFlags2.modality(flagField4.get(getterFlags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField3.get(getterFlags)), !zB3, zB4, zB5, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                deserializationContext = deserializationContextChildContext$default;
                flagField = flagField3;
                flagField2 = flagField4;
                propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations2);
                propertyGetterDescriptorImplCreateDefaultGetter.getClass();
            }
            propertyGetterDescriptorImplCreateDefaultGetter.initialize(deserializedPropertyDescriptor.getReturnType());
        } else {
            deserializationContext = deserializationContextChildContext$default;
            flagField = flagField3;
            flagField2 = flagField4;
            propertyGetterDescriptorImplCreateDefaultGetter = null;
        }
        if (s.B(Flags.HAS_SETTER, i11)) {
            if (property.hasSetterFlags()) {
                accessorFlags = property.getSetterFlags();
            }
            int i14 = accessorFlags;
            boolean zB6 = s.B(Flags.IS_NOT_DEFAULT, i14);
            boolean zB7 = s.B(Flags.IS_EXTERNAL_ACCESSOR, i14);
            boolean zB8 = s.B(Flags.IS_INLINE_ACCESSOR, i14);
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotations3 = getAnnotations(property, i14, annotatedCallableKind);
            if (zB6) {
                ProtoEnumFlags protoEnumFlags3 = ProtoEnumFlags.INSTANCE;
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, protoEnumFlags3.modality(flagField2.get(i14)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags3, flagField.get(i14)), !zB6, zB7, zB8, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) CollectionsKt.h0(DeserializationContext.childContext$default(deserializationContext, propertySetterDescriptorImpl2, n0.f26529a, null, null, null, null, 60, null).getMemberDeserializer().valueParameters(c0.c(property.getSetterValueParameter()), property, annotatedCallableKind)));
            } else {
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
                PropertySetterDescriptorImpl propertySetterDescriptorImplCreateDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations3, Annotations.Companion.getEMPTY());
                propertySetterDescriptorImplCreateDefaultSetter.getClass();
                propertySetterDescriptorImpl = propertySetterDescriptorImplCreateDefaultSetter;
            }
        } else {
            propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
            propertySetterDescriptorImpl = null;
        }
        if (s.B(Flags.HAS_CONSTANT, i11)) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new Function0<NullableLazyValue<? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.loadProperty.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final NullableLazyValue<ConstantValue<?>> invoke() {
                    StorageManager storageManager = MemberDeserializer.this.f26569c.getStorageManager();
                    final MemberDeserializer memberDeserializer = MemberDeserializer.this;
                    final ProtoBuf.Property property2 = property;
                    final DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                    return storageManager.createNullableLazyValue(new Function0<ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.loadProperty.4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final ConstantValue<?> invoke() {
                            MemberDeserializer memberDeserializer2 = memberDeserializer;
                            ProtoContainer protoContainerAsProtoContainer = memberDeserializer2.asProtoContainer(memberDeserializer2.f26569c.getContainingDeclaration());
                            protoContainerAsProtoContainer.getClass();
                            AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = memberDeserializer.f26569c.getComponents().getAnnotationAndConstantLoader();
                            ProtoBuf.Property property3 = property2;
                            KotlinType returnType = deserializedPropertyDescriptor2.getReturnType();
                            returnType.getClass();
                            return annotationAndConstantLoader.loadPropertyConstant(protoContainerAsProtoContainer, property3, returnType);
                        }
                    });
                }
            });
        }
        DeclarationDescriptor containingDeclaration2 = this.f26569c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration2 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration2 : null;
        if ((classDescriptor != null ? classDescriptor.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new Function0<NullableLazyValue<? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.loadProperty.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final NullableLazyValue<ConstantValue<?>> invoke() {
                    StorageManager storageManager = MemberDeserializer.this.f26569c.getStorageManager();
                    final MemberDeserializer memberDeserializer = MemberDeserializer.this;
                    final ProtoBuf.Property property2 = property;
                    final DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                    return storageManager.createNullableLazyValue(new Function0<ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.loadProperty.5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final ConstantValue<?> invoke() {
                            MemberDeserializer memberDeserializer2 = memberDeserializer;
                            ProtoContainer protoContainerAsProtoContainer = memberDeserializer2.asProtoContainer(memberDeserializer2.f26569c.getContainingDeclaration());
                            protoContainerAsProtoContainer.getClass();
                            AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = memberDeserializer.f26569c.getComponents().getAnnotationAndConstantLoader();
                            ProtoBuf.Property property3 = property2;
                            KotlinType returnType = deserializedPropertyDescriptor2.getReturnType();
                            returnType.getClass();
                            return annotationAndConstantLoader.loadAnnotationDefaultValue(protoContainerAsProtoContainer, property3, returnType);
                        }
                    });
                }
            });
        }
        deserializedPropertyDescriptor.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, new FieldDescriptorImpl(getPropertyFieldAnnotations(property, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(getPropertyFieldAnnotations(property, true), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }

    @NotNull
    public final TypeAliasDescriptor loadTypeAlias(@NotNull ProtoBuf.TypeAlias typeAlias) {
        typeAlias.getClass();
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        annotationList.getClass();
        ArrayList arrayList = new ArrayList(e0.o(annotationList, 10));
        for (ProtoBuf.Annotation annotation : annotationList) {
            AnnotationDeserializer annotationDeserializer = this.annotationDeserializer;
            annotation.getClass();
            arrayList.add(annotationDeserializer.deserializeAnnotation(annotation, this.f26569c.getNameResolver()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f26569c.getStorageManager(), this.f26569c.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(this.f26569c.getNameResolver(), typeAlias.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(typeAlias.getFlags())), typeAlias, this.f26569c.getNameResolver(), this.f26569c.getTypeTable(), this.f26569c.getVersionRequirementTable(), this.f26569c.getContainerSource());
        DeserializationContext deserializationContext = this.f26569c;
        List<ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
        typeParameterList.getClass();
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.initialize(deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters(), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(typeAlias, this.f26569c.getTypeTable()), false), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(typeAlias, this.f26569c.getTypeTable()), false));
        return deserializedTypeAliasDescriptor;
    }
}
