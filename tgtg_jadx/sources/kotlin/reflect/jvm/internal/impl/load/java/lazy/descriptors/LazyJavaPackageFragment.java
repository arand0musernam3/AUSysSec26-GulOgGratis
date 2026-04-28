package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    @NotNull
    private final Annotations annotations;

    @NotNull
    private final NotNullLazyValue binaryClasses$delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final LazyJavaResolverContext f26562c;

    @NotNull
    private final JavaPackage jPackage;

    @NotNull
    private final JvmMetadataVersion jvmMetadataVersion;

    @NotNull
    private final NotNullLazyValue partToFacade$delegate;

    @NotNull
    private final JvmPackageScope scope;

    @NotNull
    private final NotNullLazyValue<List<FqName>> subPackages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage) {
        super(lazyJavaResolverContext.getModule(), javaPackage.getFqName());
        lazyJavaResolverContext.getClass();
        javaPackage.getClass();
        this.jPackage = javaPackage;
        LazyJavaResolverContext lazyJavaResolverContextChildForClassOrPackage$default = ContextKt.childForClassOrPackage$default(lazyJavaResolverContext, this, null, 0, 6, null);
        this.f26562c = lazyJavaResolverContextChildForClassOrPackage$default;
        this.jvmMetadataVersion = DeserializationHelpersKt.jvmMetadataVersionOrDefault(lazyJavaResolverContext.getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration());
        this.binaryClasses$delegate = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new Function0<Map<String, ? extends KotlinJvmBinaryClass>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$binaryClasses$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Map<String, KotlinJvmBinaryClass> invoke() {
                PackagePartProvider packagePartProvider = this.this$0.f26562c.getComponents().getPackagePartProvider();
                String strAsString = this.this$0.getFqName().asString();
                strAsString.getClass();
                List<String> listFindPackageParts = packagePartProvider.findPackageParts(strAsString);
                LazyJavaPackageFragment lazyJavaPackageFragment = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (String str : listFindPackageParts) {
                    ClassId classId = ClassId.topLevel(JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars());
                    classId.getClass();
                    KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(lazyJavaPackageFragment.f26562c.getComponents().getKotlinClassFinder(), classId, lazyJavaPackageFragment.jvmMetadataVersion);
                    Pair pair = kotlinJvmBinaryClassFindKotlinClass != null ? new Pair(str, kotlinJvmBinaryClassFindKotlinClass) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return x0.j(arrayList);
            }
        });
        this.scope = new JvmPackageScope(lazyJavaResolverContextChildForClassOrPackage$default, javaPackage, this);
        this.subPackages = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createRecursionTolerantLazyValue(new Function0<List<? extends FqName>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$subPackages$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<FqName> invoke() {
                Collection<JavaPackage> subPackages = this.this$0.jPackage.getSubPackages();
                ArrayList arrayList = new ArrayList(e0.o(subPackages, 10));
                Iterator<T> it = subPackages.iterator();
                while (it.hasNext()) {
                    arrayList.add(((JavaPackage) it.next()).getFqName());
                }
                return arrayList;
            }
        }, n0.f26529a);
        this.annotations = lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getJavaTypeEnhancementState().getDisabledDefaultAnnotations() ? Annotations.Companion.getEMPTY() : LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContextChildForClassOrPackage$default, javaPackage);
        this.partToFacade$delegate = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new Function0<HashMap<JvmClassName, JvmClassName>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$partToFacade$2

            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[KotlinClassHeader.Kind.values().length];
                    try {
                        iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HashMap<JvmClassName, JvmClassName> invoke() {
                HashMap<JvmClassName, JvmClassName> map = new HashMap<>();
                for (Map.Entry<String, KotlinJvmBinaryClass> entry : this.this$0.getBinaryClasses$descriptors_jvm().entrySet()) {
                    String key = entry.getKey();
                    KotlinJvmBinaryClass value = entry.getValue();
                    JvmClassName jvmClassNameByInternalName = JvmClassName.byInternalName(key);
                    jvmClassNameByInternalName.getClass();
                    KotlinClassHeader classHeader = value.getClassHeader();
                    int i11 = WhenMappings.$EnumSwitchMapping$0[classHeader.getKind().ordinal()];
                    if (i11 == 1) {
                        String multifileClassName = classHeader.getMultifileClassName();
                        if (multifileClassName != null) {
                            JvmClassName jvmClassNameByInternalName2 = JvmClassName.byInternalName(multifileClassName);
                            jvmClassNameByInternalName2.getClass();
                            map.put(jvmClassNameByInternalName, jvmClassNameByInternalName2);
                        }
                    } else if (i11 == 2) {
                        map.put(jvmClassNameByInternalName, jvmClassNameByInternalName);
                    }
                }
                return map;
            }
        });
    }

    @Nullable
    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(@NotNull JavaClass javaClass) {
        javaClass.getClass();
        return this.scope.getJavaScope$descriptors_jvm().findClassifierByJavaClass$descriptors_jvm(javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public final Map<String, KotlinJvmBinaryClass> getBinaryClasses$descriptors_jvm() {
        return (Map) StorageKt.getValue(this.binaryClasses$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    @NotNull
    public final List<FqName> getSubPackageFqNames$descriptors_jvm() {
        return (List) this.subPackages.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return "Lazy Java package fragment: " + getFqName() + " of module " + this.f26562c.getComponents().getModule();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    public JvmPackageScope getMemberScope() {
        return this.scope;
    }
}
