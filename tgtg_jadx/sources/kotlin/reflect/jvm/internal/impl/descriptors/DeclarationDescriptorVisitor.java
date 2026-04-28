package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface DeclarationDescriptorVisitor<R, D> {
    R visitClassDescriptor(ClassDescriptor classDescriptor, D d3);

    R visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, D d3);

    R visitFunctionDescriptor(FunctionDescriptor functionDescriptor, D d3);

    R visitModuleDeclaration(ModuleDescriptor moduleDescriptor, D d3);

    R visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, D d3);

    R visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, D d3);

    R visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, D d3);

    R visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, D d3);

    R visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, D d3);

    R visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, D d3);

    R visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, D d3);

    R visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, D d3);

    R visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, D d3);
}
