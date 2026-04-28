package kotlin.reflect.jvm.internal.impl.storage;

import j4.s;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class LockBasedStorageManager implements StorageManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final StorageManager NO_LOCKS;
    private static final String PACKAGE_NAME;
    private final String debugText;
    private final ExceptionHandlingStrategy exceptionHandlingStrategy;
    protected final SimpleLock lock;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class CacheWithNotNullValuesBasedOnMemoizedFunction<K, V> extends CacheWithNullableValuesBasedOnMemoizedFunction<K, V> implements CacheWithNotNullValues<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = i11 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 3 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "computation";
            } else if (i11 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i11 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i11 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private CacheWithNotNullValuesBasedOnMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<KeyWithComputation<K, V>, Object> concurrentMap) {
            super(concurrentMap);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction, kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        @NotNull
        public V computeIfAbsent(K k11, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                $$$reportNull$$$0(2);
            }
            V v3 = (V) super.computeIfAbsent(k11, function0);
            if (v3 == null) {
                $$$reportNull$$$0(3);
            }
            return v3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class CacheWithNullableValuesBasedOnMemoizedFunction<K, V> extends MapBasedMemoizedFunction<KeyWithComputation<K, V>, V> implements CacheWithNullableValues<K, V> {
        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i11 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private CacheWithNullableValuesBasedOnMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<KeyWithComputation<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new Function1<KeyWithComputation<K, V>, V>() { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction.1
                @Override // kotlin.jvm.functions.Function1
                public V invoke(KeyWithComputation<K, V> keyWithComputation) {
                    return (V) ((KeyWithComputation) keyWithComputation).computation.invoke();
                }
            });
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Nullable
        public V computeIfAbsent(K k11, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                $$$reportNull$$$0(2);
            }
            return invoke(new KeyWithComputation(k11, function0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public interface ExceptionHandlingStrategy {
        public static final ExceptionHandlingStrategy THROW = new ExceptionHandlingStrategy() { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy.1
            private static /* synthetic */ void $$$reportNull$$$0(int i11) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'throwable' of kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1.handleException must not be null");
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            @NotNull
            public RuntimeException handleException(@NotNull Throwable th2) {
                if (th2 == null) {
                    $$$reportNull$$$0(0);
                }
                throw ExceptionUtilsKt.rethrow(th2);
            }
        };

        @NotNull
        RuntimeException handleException(@NotNull Throwable th2);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class KeyWithComputation<K, V> {
        private final Function0<? extends V> computation;
        private final K key;

        public KeyWithComputation(K k11, Function0<? extends V> function0) {
            this.key = k11;
            this.computation = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.key.equals(((KeyWithComputation) obj).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static abstract class LockBasedLazyValueWithPostCompute<T> extends LockBasedLazyValue<T> {

        @Nullable
        private volatile SingleThreadValue<T> valuePostCompute;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedLazyValueWithPostCompute(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
            this.valuePostCompute = null;
        }

        public abstract void doPostCompute(T t9);

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, kotlin.jvm.functions.Function0
        public T invoke() {
            SingleThreadValue<T> singleThreadValue = this.valuePostCompute;
            return (singleThreadValue == null || !singleThreadValue.hasValue()) ? (T) super.invoke() : singleThreadValue.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        public final void postCompute(T t9) {
            this.valuePostCompute = new SingleThreadValue<>(t9);
            try {
                doPostCompute(t9);
            } finally {
                this.valuePostCompute = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class LockBasedNotNullLazyValue<T> extends LockBasedLazyValue<T> implements NotNullLazyValue<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 2 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i11 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedNotNullLazyValue(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t9 = (T) super.invoke();
            if (t9 == null) {
                $$$reportNull$$$0(2);
            }
            return t9;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static abstract class LockBasedNotNullLazyValueWithPostCompute<T> extends LockBasedLazyValueWithPostCompute<T> implements NotNullLazyValue<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 2 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i11 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedNotNullLazyValueWithPostCompute(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t9 = (T) super.invoke();
            if (t9 == null) {
                $$$reportNull$$$0(2);
            }
            return t9;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNullable<K, V> {
        private final ConcurrentMap<K, Object> cache;
        private final Function1<? super K, ? extends V> compute;
        private final LockBasedStorageManager storageManager;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = (i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 3 || i11 == 4) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "compute";
            } else if (i11 == 3 || i11 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i11 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i11 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i11 != 3 && i11 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 != 3 && i11 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public MapBasedMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
            if (function1 == null) {
                $$$reportNull$$$0(2);
            }
            this.storageManager = lockBasedStorageManager;
            this.cache = concurrentMap;
            this.compute = function1;
        }

        @NotNull
        private AssertionError raceCondition(K k11, Object obj) {
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.sanitizeStackTrace(new AssertionError("Race condition detected on input " + k11 + ". Old value is " + obj + " under " + this.storageManager));
            if (assertionError == null) {
                $$$reportNull$$$0(4);
            }
            return assertionError;
        }

        public LockBasedStorageManager getStorageManager() {
            return this.storageManager;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
          0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v17 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x0087, B:39:0x0095, B:40:0x0099, B:41:0x009a, B:42:0x00a4, B:43:0x00a5, B:44:0x00af, B:45:0x00b0, B:46:0x00b7, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:49:0x0018, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable, kotlin.jvm.functions.Function1
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public V invoke(K r6) {
            /*
                r5 = this;
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.cache
                java.lang.Object r0 = r0.get(r6)
                if (r0 == 0) goto L11
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING
                if (r0 == r1) goto L11
                java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeExceptionOrNull(r0)
                return r6
            L11:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r0 = r5.storageManager
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r0 = r0.lock
                r0.lock()
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.cache     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L3b
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 != r1) goto L3e
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r0 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L3b
                r2 = 1
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$RecursionDetectedResult r2 = r5.recursionDetected(r6, r2)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = r2.isFallThrough()     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L3e
                java.lang.Object r6 = r2.getValue()     // Catch: java.lang.Throwable -> L3b
            L33:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r0 = r5.storageManager
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r0 = r0.lock
                r0.unlock()
                return r6
            L3b:
                r6 = move-exception
                goto Lb8
            L3e:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L3b
                if (r0 != r2) goto L52
                r2 = 0
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$RecursionDetectedResult r2 = r5.recursionDetected(r6, r2)     // Catch: java.lang.Throwable -> L3b
                boolean r3 = r2.isFallThrough()     // Catch: java.lang.Throwable -> L3b
                if (r3 != 0) goto L52
                java.lang.Object r6 = r2.getValue()     // Catch: java.lang.Throwable -> L3b
                goto L33
            L52:
                if (r0 == 0) goto L59
                java.lang.Object r6 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeExceptionOrNull(r0)     // Catch: java.lang.Throwable -> L3b
                goto L33
            L59:
                r0 = 0
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r2 = r5.cache     // Catch: java.lang.Throwable -> L7e
                r2.put(r6, r1)     // Catch: java.lang.Throwable -> L7e
                kotlin.jvm.functions.Function1<? super K, ? extends V> r2 = r5.compute     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r2 = r2.invoke(r6)     // Catch: java.lang.Throwable -> L7e
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r3 = r5.cache     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r4 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.escapeNull(r2)     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r3 = r3.put(r6, r4)     // Catch: java.lang.Throwable -> L7e
                if (r3 != r1) goto L79
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r6 = r5.storageManager
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r6 = r6.lock
                r6.unlock()
                return r2
            L79:
                java.lang.AssertionError r0 = r5.raceCondition(r6, r3)     // Catch: java.lang.Throwable -> L7e
                throw r0     // Catch: java.lang.Throwable -> L7e
            L7e:
                r1 = move-exception
                boolean r2 = kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.isProcessCanceledException(r1)     // Catch: java.lang.Throwable -> L3b
                if (r2 != 0) goto Lb0
                if (r1 == r0) goto La5
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.cache     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r2 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.escapeThrowable(r1)     // Catch: java.lang.Throwable -> L3b
                java.lang.Object r0 = r0.put(r6, r2)     // Catch: java.lang.Throwable -> L3b
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING     // Catch: java.lang.Throwable -> L3b
                if (r0 == r2) goto L9a
                java.lang.AssertionError r6 = r5.raceCondition(r6, r0)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            L9a:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r6 = r5.storageManager     // Catch: java.lang.Throwable -> L3b
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy r6 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.access$100(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r6 = r6.handleException(r1)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            La5:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r6 = r5.storageManager     // Catch: java.lang.Throwable -> L3b
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy r6 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.access$100(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r6 = r6.handleException(r1)     // Catch: java.lang.Throwable -> L3b
                throw r6     // Catch: java.lang.Throwable -> L3b
            Lb0:
                java.util.concurrent.ConcurrentMap<K, java.lang.Object> r0 = r5.cache     // Catch: java.lang.Throwable -> L3b
                r0.remove(r6)     // Catch: java.lang.Throwable -> L3b
                java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch: java.lang.Throwable -> L3b
                throw r1     // Catch: java.lang.Throwable -> L3b
            Lb8:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r0 = r5.storageManager
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r0 = r0.lock
                r0.unlock()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction.invoke(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        public boolean isComputed(K k11) {
            Object obj = this.cache.get(k11);
            return (obj == null || obj == NotValue.COMPUTING) ? false : true;
        }

        @NotNull
        public RecursionDetectedResult<V> recursionDetected(K k11, boolean z11) {
            RecursionDetectedResult<V> recursionDetectedResultRecursionDetectedDefault = this.storageManager.recursionDetectedDefault("", k11);
            if (recursionDetectedResultRecursionDetectedDefault == null) {
                $$$reportNull$$$0(3);
            }
            return recursionDetectedResultRecursionDetectedDefault;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class MapBasedMemoizedFunctionToNotNull<K, V> extends MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNotNull<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = i11 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 3 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "compute";
            } else if (i11 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MapBasedMemoizedFunctionToNotNull(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
            if (function1 == null) {
                $$$reportNull$$$0(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction, kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable, kotlin.jvm.functions.Function1
        @NotNull
        public V invoke(K k11) {
            V v3 = (V) super.invoke(k11);
            if (v3 == null) {
                $$$reportNull$$$0(3);
            }
            return v3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class RecursionDetectedResult<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean fallThrough;
        private final T value;

        private RecursionDetectedResult(T t9, boolean z11) {
            this.value = t9;
            this.fallThrough = z11;
        }

        @NotNull
        public static <T> RecursionDetectedResult<T> fallThrough() {
            return new RecursionDetectedResult<>(null, true);
        }

        @NotNull
        public static <T> RecursionDetectedResult<T> value(T t9) {
            return new RecursionDetectedResult<>(t9, false);
        }

        public T getValue() {
            return this.value;
        }

        public boolean isFallThrough() {
            return this.fallThrough;
        }

        public String toString() {
            return isFallThrough() ? "FALL_THROUGH" : String.valueOf(this.value);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.$$$reportNull$$$0(int):void");
    }

    static {
        String canonicalName = LockBasedStorageManager.class.getCanonicalName();
        canonicalName.getClass();
        int I = StringsKt.I(6, canonicalName, ".");
        PACKAGE_NAME = I == -1 ? "" : canonicalName.substring(0, I);
        NO_LOCKS = new LockBasedStorageManager("NO_LOCKS", ExceptionHandlingStrategy.THROW, EmptySimpleLock.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.1
            private static /* synthetic */ void $$$reportNull$$$0(int i11) {
                String str = i11 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
                Object[] objArr = new Object[i11 != 1 ? 3 : 2];
                if (i11 != 1) {
                    objArr[0] = "source";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
                }
                if (i11 != 1) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
                } else {
                    objArr[1] = "recursionDetectedDefault";
                }
                if (i11 != 1) {
                    objArr[2] = "recursionDetectedDefault";
                }
                String str2 = String.format(str, objArr);
                if (i11 == 1) {
                    throw new IllegalStateException(str2);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
            @NotNull
            public <K, V> RecursionDetectedResult<V> recursionDetectedDefault(@NotNull String str, K k11) {
                if (str == null) {
                    $$$reportNull$$$0(0);
                }
                RecursionDetectedResult<V> recursionDetectedResultFallThrough = RecursionDetectedResult.fallThrough();
                if (recursionDetectedResultFallThrough == null) {
                    $$$reportNull$$$0(1);
                }
                return recursionDetectedResultFallThrough;
            }
        };
    }

    private LockBasedStorageManager(@NotNull String str, @NotNull ExceptionHandlingStrategy exceptionHandlingStrategy, @NotNull SimpleLock simpleLock) {
        if (str == null) {
            $$$reportNull$$$0(4);
        }
        if (exceptionHandlingStrategy == null) {
            $$$reportNull$$$0(5);
        }
        if (simpleLock == null) {
            $$$reportNull$$$0(6);
        }
        this.lock = simpleLock;
        this.exceptionHandlingStrategy = exceptionHandlingStrategy;
        this.debugText = str;
    }

    @NotNull
    private static <K> ConcurrentMap<K, Object> createConcurrentHashMap() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    public static <T extends Throwable> T sanitizeStackTrace(@NotNull T t9) {
        if (t9 == null) {
            $$$reportNull$$$0(36);
        }
        StackTraceElement[] stackTrace = t9.getStackTrace();
        int length = stackTrace.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (!stackTrace[i11].getClassName().startsWith(PACKAGE_NAME)) {
                break;
            }
            i11++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i11, length);
        t9.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return t9;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T compute(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(34);
        }
        this.lock.lock();
        try {
            return (T) function0.invoke();
        } finally {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new CacheWithNotNullValuesBasedOnMemoizedFunction(createConcurrentHashMap());
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues() {
        return new CacheWithNullableValuesBasedOnMemoizedFunction(createConcurrentHashMap());
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(23);
        }
        return new LockBasedNotNullLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(@NotNull Function0<? extends T> function0, final Function1<? super Boolean, ? extends T> function1, @NotNull final Function1<? super T, Unit> function12) {
        if (function0 == null) {
            $$$reportNull$$$0(28);
        }
        if (function12 == null) {
            $$$reportNull$$$0(29);
        }
        return new LockBasedNotNullLazyValueWithPostCompute<T>(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.5
            private static /* synthetic */ void $$$reportNull$$$0(int i11) {
                String str = i11 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                Object[] objArr = new Object[i11 != 2 ? 2 : 3];
                if (i11 != 2) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                } else {
                    objArr[0] = "value";
                }
                if (i11 != 2) {
                    objArr[1] = "recursionDetected";
                } else {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                }
                if (i11 == 2) {
                    objArr[2] = "doPostCompute";
                }
                String str2 = String.format(str, objArr);
                if (i11 == 2) {
                    throw new IllegalArgumentException(str2);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute
            public void doPostCompute(@NotNull T t9) {
                if (t9 == null) {
                    $$$reportNull$$$0(2);
                }
                function12.invoke(t9);
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            @NotNull
            public RecursionDetectedResult<T> recursionDetected(boolean z11) {
                Function1 function13 = function1;
                if (function13 == null) {
                    RecursionDetectedResult<T> recursionDetectedResultRecursionDetected = super.recursionDetected(z11);
                    if (recursionDetectedResultRecursionDetected == null) {
                        $$$reportNull$$$0(0);
                    }
                    return recursionDetectedResultRecursionDetected;
                }
                RecursionDetectedResult<T> recursionDetectedResultValue = RecursionDetectedResult.value(function13.invoke(Boolean.valueOf(z11)));
                if (recursionDetectedResultValue == null) {
                    $$$reportNull$$$0(1);
                }
                return recursionDetectedResultValue;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            $$$reportNull$$$0(9);
        }
        MemoizedFunctionToNotNull<K, V> memoizedFunctionToNotNullCreateMemoizedFunction = createMemoizedFunction(function1, createConcurrentHashMap());
        if (memoizedFunctionToNotNullCreateMemoizedFunction == null) {
            $$$reportNull$$$0(10);
        }
        return memoizedFunctionToNotNullCreateMemoizedFunction;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            $$$reportNull$$$0(19);
        }
        MemoizedFunctionToNullable<K, V> memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(function1, createConcurrentHashMap());
        if (memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues == null) {
            $$$reportNull$$$0(20);
        }
        return memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NullableLazyValue<T> createNullableLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(30);
        }
        return new LockBasedLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(@NotNull Function0<? extends T> function0, @NotNull final T t9) {
        if (function0 == null) {
            $$$reportNull$$$0(26);
        }
        if (t9 == null) {
            $$$reportNull$$$0(27);
        }
        return new LockBasedNotNullLazyValue<T>(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.4
            private static /* synthetic */ void $$$reportNull$$$0(int i11) {
                throw new IllegalStateException("@NotNull method kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4.recursionDetected must not return null");
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            @NotNull
            public RecursionDetectedResult<T> recursionDetected(boolean z11) {
                RecursionDetectedResult<T> recursionDetectedResultValue = RecursionDetectedResult.value(t9);
                if (recursionDetectedResultValue == null) {
                    $$$reportNull$$$0(0);
                }
                return recursionDetectedResultValue;
            }
        };
    }

    @NotNull
    public <K, V> RecursionDetectedResult<V> recursionDetectedDefault(@NotNull String str, K k11) {
        if (str == null) {
            $$$reportNull$$$0(35);
        }
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        sb2.append(k11 == null ? "" : s.j(k11, "on input: "));
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) sanitizeStackTrace(new AssertionError(sb2.toString())));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return k.p(sb2, this.debugText, ")");
    }

    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            $$$reportNull$$$0(14);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(15);
        }
        return new MapBasedMemoizedFunctionToNotNull(this, concurrentMap, function1);
    }

    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            $$$reportNull$$$0(21);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(22);
        }
        return new MapBasedMemoizedFunction(this, concurrentMap, function1);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class LockBasedLazyValue<T> implements NullableLazyValue<T> {
        private final Function0<? extends T> computable;
        private final LockBasedStorageManager storageManager;

        @Nullable
        private volatile Object value;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = (i11 == 2 || i11 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 2 || i11 == 3) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 == 2 || i11 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i11 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i11 != 2 && i11 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public LockBasedLazyValue(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
            this.value = NotValue.NOT_COMPUTED;
            this.storageManager = lockBasedStorageManager;
            this.computable = function0;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T invoke() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.value
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue
                if (r1 != 0) goto Lb
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeThrowable(r0)
                return r0
            Lb:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r0 = r4.storageManager
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r0 = r0.lock
                r0.lock()
                java.lang.Object r0 = r4.value     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeThrowable(r0)     // Catch: java.lang.Throwable -> L24
            L1c:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r4.storageManager
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r1 = r1.lock
                r1.unlock()
                return r0
            L24:
                r0 = move-exception
                goto L85
            L26:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r0 != r1) goto L3e
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                r4.value = r2     // Catch: java.lang.Throwable -> L24
                r2 = 1
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$RecursionDetectedResult r2 = r4.recursionDetected(r2)     // Catch: java.lang.Throwable -> L24
                boolean r3 = r2.isFallThrough()     // Catch: java.lang.Throwable -> L24
                if (r3 != 0) goto L3e
                java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L3e:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                if (r0 != r2) goto L52
                r0 = 0
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$RecursionDetectedResult r0 = r4.recursionDetected(r0)     // Catch: java.lang.Throwable -> L24
                boolean r2 = r0.isFallThrough()     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L52
                java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L52:
                r4.value = r1     // Catch: java.lang.Throwable -> L24
                kotlin.jvm.functions.Function0<? extends T> r0 = r4.computable     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L60
                r4.postCompute(r0)     // Catch: java.lang.Throwable -> L60
                r4.value = r0     // Catch: java.lang.Throwable -> L60
                goto L1c
            L60:
                r0 = move-exception
                boolean r1 = kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.isProcessCanceledException(r0)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L7e
                java.lang.Object r1 = r4.value     // Catch: java.lang.Throwable -> L24
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r1 != r2) goto L73
                java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.escapeThrowable(r0)     // Catch: java.lang.Throwable -> L24
                r4.value = r1     // Catch: java.lang.Throwable -> L24
            L73:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r4.storageManager     // Catch: java.lang.Throwable -> L24
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.access$100(r1)     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = r1.handleException(r0)     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L7e:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.NOT_COMPUTED     // Catch: java.lang.Throwable -> L24
                r4.value = r1     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L85:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r4.storageManager
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r1 = r1.lock
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue.invoke():java.lang.Object");
        }

        public boolean isComputed() {
            return (this.value == NotValue.NOT_COMPUTED || this.value == NotValue.COMPUTING) ? false : true;
        }

        @NotNull
        public RecursionDetectedResult<T> recursionDetected(boolean z11) {
            RecursionDetectedResult<T> recursionDetectedResultRecursionDetectedDefault = this.storageManager.recursionDetectedDefault("in a lazy value", null);
            if (recursionDetectedResultRecursionDetectedDefault == null) {
                $$$reportNull$$$0(2);
            }
            return recursionDetectedResultRecursionDetectedDefault;
        }

        public void postCompute(T t9) {
        }
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public LockBasedStorageManager(String str, @Nullable Runnable runnable, @Nullable Function1<InterruptedException, Unit> function1) {
        this(str, ExceptionHandlingStrategy.THROW, SimpleLock.Companion.simpleLock(runnable, function1));
    }
}
