package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import i4.a;
import j4.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.p0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.TargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nModuleDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl\n+ 2 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n19#2:177\n19#2:181\n19#2:182\n766#3:178\n857#3,2:179\n1#4:183\n*S KotlinDebug\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl\n*L\n72#1:177\n75#1:181\n78#1:182\n72#1:178\n72#1:179,2\n*E\n"})
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {

    @NotNull
    private final KotlinBuiltIns builtIns;

    @NotNull
    private final Map<ModuleCapability<?>, Object> capabilities;

    @Nullable
    private ModuleDependencies dependencies;
    private boolean isValid;

    @Nullable
    private PackageFragmentProvider packageFragmentProviderForModuleContent;

    @NotNull
    private final j packageFragmentProviderForWholeModuleWithDependencies$delegate;

    @NotNull
    private final PackageViewDescriptorFactory packageViewDescriptorFactory;

    @NotNull
    private final MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> packages;

    @Nullable
    private final TargetPlatform platform;

    @Nullable
    private final Name stableName;

    @NotNull
    private final StorageManager storageManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(@NotNull Name name, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable TargetPlatform targetPlatform, @NotNull Map<ModuleCapability<?>, ? extends Object> map, @Nullable Name name2) {
        super(Annotations.Companion.getEMPTY(), name);
        name.getClass();
        storageManager.getClass();
        kotlinBuiltIns.getClass();
        map.getClass();
        this.storageManager = storageManager;
        this.builtIns = kotlinBuiltIns;
        this.platform = targetPlatform;
        this.stableName = name2;
        if (!name.isSpecial()) {
            d.o(name, "Module name must be special: ");
            throw null;
        }
        this.capabilities = map;
        PackageViewDescriptorFactory packageViewDescriptorFactory = (PackageViewDescriptorFactory) getCapability(PackageViewDescriptorFactory.Companion.getCAPABILITY());
        this.packageViewDescriptorFactory = packageViewDescriptorFactory == null ? PackageViewDescriptorFactory.Default.INSTANCE : packageViewDescriptorFactory;
        this.isValid = true;
        this.packages = storageManager.createMemoizedFunction(new Function1<FqName, PackageViewDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packages$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final PackageViewDescriptor invoke(@NotNull FqName fqName) {
                fqName.getClass();
                PackageViewDescriptorFactory packageViewDescriptorFactory2 = this.this$0.packageViewDescriptorFactory;
                ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
                return packageViewDescriptorFactory2.compute(moduleDescriptorImpl, fqName, moduleDescriptorImpl.storageManager);
            }
        });
        this.packageFragmentProviderForWholeModuleWithDependencies$delegate = l.b(new Function0<CompositePackageFragmentProvider>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CompositePackageFragmentProvider invoke() {
                ModuleDependencies moduleDependencies = this.this$0.dependencies;
                ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
                if (moduleDependencies == null) {
                    throw new AssertionError("Dependencies of module " + moduleDescriptorImpl.getId() + " were not set before querying module content");
                }
                List<ModuleDescriptorImpl> allDependencies = moduleDependencies.getAllDependencies();
                this.this$0.assertValid();
                allDependencies.contains(this.this$0);
                Iterator<T> it = allDependencies.iterator();
                while (it.hasNext()) {
                    ((ModuleDescriptorImpl) it.next()).isInitialized();
                }
                ArrayList arrayList = new ArrayList(e0.o(allDependencies, 10));
                Iterator<T> it2 = allDependencies.iterator();
                while (it2.hasNext()) {
                    PackageFragmentProvider packageFragmentProvider = ((ModuleDescriptorImpl) it2.next()).packageFragmentProviderForModuleContent;
                    packageFragmentProvider.getClass();
                    arrayList.add(packageFragmentProvider);
                }
                return new CompositePackageFragmentProvider(arrayList, "CompositeProvider@ModuleDescriptor for " + this.this$0.getName());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getId() {
        String string = getName().toString();
        string.getClass();
        return string;
    }

    private final CompositePackageFragmentProvider getPackageFragmentProviderForWholeModuleWithDependencies() {
        return (CompositePackageFragmentProvider) this.packageFragmentProviderForWholeModuleWithDependencies$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInitialized() {
        return this.packageFragmentProviderForModuleContent != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d3) {
        return (R) ModuleDescriptor.DefaultImpls.accept(this, declarationDescriptorVisitor, d3);
    }

    public void assertValid() {
        if (isValid()) {
            return;
        }
        InvalidModuleExceptionKt.moduleInvalidated(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return this.builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @Nullable
    public <T> T getCapability(@NotNull ModuleCapability<T> moduleCapability) {
        moduleCapability.getClass();
        T t9 = (T) this.capabilities.get(moduleCapability);
        if (t9 == null) {
            return null;
        }
        return t9;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @Nullable
    public DeclarationDescriptor getContainingDeclaration() {
        return ModuleDescriptor.DefaultImpls.getContainingDeclaration(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public List<ModuleDescriptor> getExpectedByModules() {
        ModuleDependencies moduleDependencies = this.dependencies;
        if (moduleDependencies != null) {
            return moduleDependencies.getDirectExpectedByDependencies();
        }
        a.d(k.p(new StringBuilder("Dependencies of module "), getId(), " were not set"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public PackageViewDescriptor getPackage(@NotNull FqName fqName) {
        fqName.getClass();
        assertValid();
        return (PackageViewDescriptor) this.packages.invoke(fqName);
    }

    @NotNull
    public final PackageFragmentProvider getPackageFragmentProvider() {
        assertValid();
        return getPackageFragmentProviderForWholeModuleWithDependencies();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        fqName.getClass();
        function1.getClass();
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(fqName, function1);
    }

    public final void initialize(@NotNull PackageFragmentProvider packageFragmentProvider) {
        packageFragmentProvider.getClass();
        isInitialized();
        this.packageFragmentProviderForModuleContent = packageFragmentProvider;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public final void setDependencies(@NotNull List<ModuleDescriptorImpl> list, @NotNull Set<ModuleDescriptorImpl> set) {
        list.getClass();
        set.getClass();
        setDependencies(new ModuleDependenciesImpl(list, set, n0.f26529a, p0.f26531a));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        if (Intrinsics.areEqual(this, moduleDescriptor)) {
            return true;
        }
        ModuleDependencies moduleDependencies = this.dependencies;
        moduleDependencies.getClass();
        return CollectionsKt.I(moduleDependencies.getModulesWhoseInternalsAreVisible(), moduleDescriptor) || getExpectedByModules().contains(moduleDescriptor) || moduleDescriptor.getExpectedByModules().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        String string = super.toString();
        string.getClass();
        return isValid() ? string : k.l(string, " !isValid");
    }

    public final void setDependencies(@NotNull ModuleDependencies moduleDependencies) {
        moduleDependencies.getClass();
        this.dependencies = moduleDependencies;
    }

    public final void setDependencies(@NotNull ModuleDescriptorImpl... moduleDescriptorImplArr) {
        moduleDescriptorImplArr.getClass();
        setDependencies(y.T(moduleDescriptorImplArr));
    }

    public final void setDependencies(@NotNull List<ModuleDescriptorImpl> list) {
        list.getClass();
        setDependencies(list, p0.f26531a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(@NotNull Name name, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable TargetPlatform targetPlatform) {
        this(name, storageManager, kotlinBuiltIns, targetPlatform, null, null, 48, null);
        name.getClass();
        storageManager.getClass();
        kotlinBuiltIns.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ModuleDescriptorImpl(Name name, StorageManager storageManager, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map map, Name name2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        targetPlatform = (i11 & 8) != 0 ? null : targetPlatform;
        if ((i11 & 16) != 0) {
            map = o0.f26530a;
            map.getClass();
        }
        this(name, storageManager, kotlinBuiltIns, targetPlatform, map, (i11 & 32) != 0 ? null : name2);
    }
}
