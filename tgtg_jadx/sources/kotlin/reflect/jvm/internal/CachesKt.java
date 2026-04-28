package kotlin.reflect.jvm.internal;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KClassifiers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0011\u001a\u00020\u0012H\u0000\u001a6\u0010\u0013\u001a\u00020\u0002\"\b\b\u0000\u0010\u0014*\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\bH\u0000\u001a6\u0010\u0019\u001a\u00020\u0002\"\b\b\u0000\u0010\u0014*\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\bH\u0002\u001a&\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00140\f\"\b\b\u0000\u0010\u0014*\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016H\u0000\u001a \u0010\u001b\u001a\u00020\u001c\"\b\b\u0000\u0010\u0014*\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016H\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"6\u0010\u0003\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\t\u0012\u0004\u0012\u00020\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"$\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*0\b\u0002\u0010\u001d\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u00052\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005¨\u0006\u001e"}, d2 = {"CACHE_FOR_BASE_CLASSIFIERS", "Lkotlin/reflect/jvm/internal/CacheByClass;", "Lkotlin/reflect/KType;", "CACHE_FOR_GENERIC_CLASSIFIERS", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "", "Lkotlin/reflect/KTypeProjection;", "", "Lkotlin/reflect/jvm/internal/Key;", "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/KClassImpl;", "", "kotlin.jvm.PlatformType", "K_PACKAGE_CACHE", "Lkotlin/reflect/jvm/internal/KPackageImpl;", "clearCaches", "", "getOrCreateKType", "T", "jClass", "Ljava/lang/Class;", "arguments", "isMarkedNullable", "getOrCreateKTypeWithTypeArguments", "getOrCreateKotlinClass", "getOrCreateKotlinPackage", "Lkotlin/reflect/KDeclarationContainer;", "Key", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\ncaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 caches.kt\nkotlin/reflect/jvm/internal/CachesKt\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n73#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 caches.kt\nkotlin/reflect/jvm/internal/CachesKt\n*L\n68#1:75,2\n68#1:77\n*E\n"})
public final class CachesKt {

    @NotNull
    private static final CacheByClass<KClassImpl<? extends Object>> K_CLASS_CACHE = CacheByClassKt.createCache(new Function1<Class<?>, KClassImpl<? extends Object>>() { // from class: kotlin.reflect.jvm.internal.CachesKt$K_CLASS_CACHE$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KClassImpl<? extends Object> invoke(@NotNull Class<?> cls) {
            cls.getClass();
            return new KClassImpl<>(cls);
        }
    });

    @NotNull
    private static final CacheByClass<KPackageImpl> K_PACKAGE_CACHE = CacheByClassKt.createCache(new Function1<Class<?>, KPackageImpl>() { // from class: kotlin.reflect.jvm.internal.CachesKt$K_PACKAGE_CACHE$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KPackageImpl invoke(@NotNull Class<?> cls) {
            cls.getClass();
            return new KPackageImpl(cls);
        }
    });

    @NotNull
    private static final CacheByClass<KType> CACHE_FOR_BASE_CLASSIFIERS = CacheByClassKt.createCache(new Function1<Class<?>, KType>() { // from class: kotlin.reflect.jvm.internal.CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KType invoke(@NotNull Class<?> cls) {
            cls.getClass();
            KClassImpl orCreateKotlinClass = CachesKt.getOrCreateKotlinClass(cls);
            n0 n0Var = n0.f26529a;
            return KClassifiers.createType(orCreateKotlinClass, n0Var, false, n0Var);
        }
    });

    @NotNull
    private static final CacheByClass<KType> CACHE_FOR_NULLABLE_BASE_CLASSIFIERS = CacheByClassKt.createCache(new Function1<Class<?>, KType>() { // from class: kotlin.reflect.jvm.internal.CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KType invoke(@NotNull Class<?> cls) {
            cls.getClass();
            KClassImpl orCreateKotlinClass = CachesKt.getOrCreateKotlinClass(cls);
            n0 n0Var = n0.f26529a;
            return KClassifiers.createType(orCreateKotlinClass, n0Var, true, n0Var);
        }
    });

    @NotNull
    private static final CacheByClass<ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType>> CACHE_FOR_GENERIC_CLASSIFIERS = CacheByClassKt.createCache(new Function1<Class<?>, ConcurrentHashMap<Pair<? extends List<? extends KTypeProjection>, ? extends Boolean>, KType>>() { // from class: kotlin.reflect.jvm.internal.CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType> invoke(@NotNull Class<?> cls) {
            cls.getClass();
            return new ConcurrentHashMap<>();
        }
    });

    public static final void clearCaches() {
        K_CLASS_CACHE.clear();
        K_PACKAGE_CACHE.clear();
        CACHE_FOR_BASE_CLASSIFIERS.clear();
        CACHE_FOR_NULLABLE_BASE_CLASSIFIERS.clear();
        CACHE_FOR_GENERIC_CLASSIFIERS.clear();
    }

    @NotNull
    public static final <T> KType getOrCreateKType(@NotNull Class<T> cls, @NotNull List<KTypeProjection> list, boolean z11) {
        cls.getClass();
        list.getClass();
        return list.isEmpty() ? z11 ? CACHE_FOR_NULLABLE_BASE_CLASSIFIERS.get(cls) : CACHE_FOR_BASE_CLASSIFIERS.get(cls) : getOrCreateKTypeWithTypeArguments(cls, list, z11);
    }

    private static final <T> KType getOrCreateKTypeWithTypeArguments(Class<T> cls, List<KTypeProjection> list, boolean z11) {
        ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType> concurrentHashMap = CACHE_FOR_GENERIC_CLASSIFIERS.get(cls);
        Pair<List<KTypeProjection>, Boolean> pair = new Pair<>(list, Boolean.valueOf(z11));
        KType kType = concurrentHashMap.get(pair);
        if (kType == null) {
            KType kTypeCreateType = KClassifiers.createType(getOrCreateKotlinClass(cls), list, z11, n0.f26529a);
            KType kTypePutIfAbsent = concurrentHashMap.putIfAbsent(pair, kTypeCreateType);
            kType = kTypePutIfAbsent == null ? kTypeCreateType : kTypePutIfAbsent;
        }
        kType.getClass();
        return kType;
    }

    @NotNull
    public static final <T> KClassImpl<T> getOrCreateKotlinClass(@NotNull Class<T> cls) {
        cls.getClass();
        KAnnotatedElement kAnnotatedElement = K_CLASS_CACHE.get(cls);
        kAnnotatedElement.getClass();
        return (KClassImpl) kAnnotatedElement;
    }

    @NotNull
    public static final <T> KDeclarationContainer getOrCreateKotlinPackage(@NotNull Class<T> cls) {
        cls.getClass();
        return K_PACKAGE_CACHE.get(cls);
    }
}
