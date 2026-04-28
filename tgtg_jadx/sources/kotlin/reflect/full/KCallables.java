package kotlin.reflect.full;

import com.braze.ui.actions.brazeactions.steps.StepData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\u0018\u00010\bH\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\fH\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"$\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"$\u0010\u0016\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010\"(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/KCallable;", "", "name", "Lkotlin/reflect/KParameter;", "findParameterByName", "(Lkotlin/reflect/KCallable;Ljava/lang/String;)Lkotlin/reflect/KParameter;", "R", "", "", StepData.ARGS, "callSuspend", "(Lkotlin/reflect/KCallable;[Ljava/lang/Object;Lx70/c;)Ljava/lang/Object;", "", "callSuspendBy", "(Lkotlin/reflect/KCallable;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "getInstanceParameter", "(Lkotlin/reflect/KCallable;)Lkotlin/reflect/KParameter;", "getInstanceParameter$annotations", "(Lkotlin/reflect/KCallable;)V", "instanceParameter", "getExtensionReceiverParameter", "getExtensionReceiverParameter$annotations", "extensionReceiverParameter", "", "getValueParameters", "(Lkotlin/reflect/KCallable;)Ljava/util/List;", "getValueParameters$annotations", "valueParameters", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKCallables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallables.kt\nkotlin/reflect/full/KCallables\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n661#2,11:83\n661#2,11:94\n766#2:105\n857#2,2:106\n661#2,11:108\n1#3:119\n*S KotlinDebug\n*F\n+ 1 KCallables.kt\nkotlin/reflect/full/KCallables\n*L\n23#1:83,11\n31#1:94,11\n38#1:105\n38#1:106,2\n45#1:108,11\n*E\n"})
public final class KCallables {

    /* JADX INFO: renamed from: kotlin.reflect.full.KCallables$callSuspend$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "kotlin.reflect.full.KCallables", f = "KCallables.kt", l = {56}, m = "callSuspend")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1<R> extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KCallables.callSuspend(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.full.KCallables$callSuspendBy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "kotlin.reflect.full.KCallables", f = "KCallables.kt", l = {74}, m = "callSuspendBy")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C01511<R> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C01511(x70.c<? super C01511> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KCallables.callSuspendBy(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object callSuspend(@org.jetbrains.annotations.NotNull kotlin.reflect.KCallable<? extends R> r4, @org.jetbrains.annotations.NotNull java.lang.Object[] r5, @org.jetbrains.annotations.NotNull x70.c<? super R> r6) {
        /*
            boolean r0 = r6 instanceof kotlin.reflect.full.KCallables.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.reflect.full.KCallables$callSuspend$1 r0 = (kotlin.reflect.full.KCallables.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlin.reflect.full.KCallables$callSuspend$1 r0 = new kotlin.reflect.full.KCallables$callSuspend$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$1
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r4 = r0.L$0
            kotlin.reflect.KCallable r4 = (kotlin.reflect.KCallable) r4
            ba0.g.M(r6)
            goto L70
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L36:
            ba0.g.M(r6)
            boolean r6 = r4.isSuspend()
            if (r6 != 0) goto L49
            int r6 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.Object r4 = r4.call(r5)
            return r4
        L49:
            boolean r6 = r4 instanceof kotlin.reflect.KFunction
            if (r6 == 0) goto L92
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            kotlin.jvm.internal.SpreadBuilder r6 = new kotlin.jvm.internal.SpreadBuilder
            r2 = 2
            r6.<init>(r2)
            r6.addSpread(r5)
            r6.add(r0)
            int r5 = r6.size()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object[] r5 = r6.toArray(r5)
            java.lang.Object r6 = r4.call(r5)
            if (r6 != r1) goto L70
            return r1
        L70:
            kotlin.reflect.KType r5 = r4.getReturnType()
            kotlin.reflect.KClassifier r5 = r5.getClassifier()
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r5 == 0) goto L91
            kotlin.reflect.KType r4 = r4.getReturnType()
            boolean r4 = r4.isMarkedNullable()
            if (r4 != 0) goto L91
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        L91:
            return r6
        L92:
            java.lang.String r5 = "Cannot callSuspend on a property "
            java.lang.String r6 = ": suspend properties are not supported yet"
            j4.d.m(r5, r4, r6)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.full.KCallables.callSuspend(kotlin.reflect.KCallable, java.lang.Object[], x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object callSuspendBy(@org.jetbrains.annotations.NotNull kotlin.reflect.KCallable<? extends R> r4, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull x70.c<? super R> r6) throws kotlin.reflect.full.IllegalCallableAccessException {
        /*
            boolean r0 = r6 instanceof kotlin.reflect.full.KCallables.C01511
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.reflect.full.KCallables$callSuspendBy$1 r0 = (kotlin.reflect.full.KCallables.C01511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlin.reflect.full.KCallables$callSuspendBy$1 r0 = new kotlin.reflect.full.KCallables$callSuspendBy$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$2
            kotlin.reflect.jvm.internal.KCallableImpl r4 = (kotlin.reflect.jvm.internal.KCallableImpl) r4
            java.lang.Object r4 = r0.L$1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r0.L$0
            kotlin.reflect.KCallable r4 = (kotlin.reflect.KCallable) r4
            ba0.g.M(r6)
            goto L61
        L33:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
        L38:
            r4 = 0
            return r4
        L3a:
            ba0.g.M(r6)
            boolean r6 = r4.isSuspend()
            if (r6 != 0) goto L48
            java.lang.Object r4 = r4.callBy(r5)
            return r4
        L48:
            boolean r6 = r4 instanceof kotlin.reflect.KFunction
            if (r6 == 0) goto L89
            kotlin.reflect.jvm.internal.KCallableImpl r6 = kotlin.reflect.jvm.internal.UtilKt.asKCallableImpl(r4)
            if (r6 == 0) goto L83
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r6 = r6.callDefaultMethod$kotlin_reflection(r5, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            kotlin.reflect.KType r5 = r4.getReturnType()
            kotlin.reflect.KClassifier r5 = r5.getClassifier()
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r5 == 0) goto L82
            kotlin.reflect.KType r4 = r4.getReturnType()
            boolean r4 = r4.isMarkedNullable()
            if (r4 != 0) goto L82
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        L82:
            return r6
        L83:
            java.lang.String r5 = "This callable does not support a default call: "
            j4.d.q(r4, r5)
            goto L38
        L89:
            java.lang.String r5 = "Cannot callSuspendBy on a property "
            java.lang.String r6 = ": suspend properties are not supported yet"
            j4.d.m(r5, r4, r6)
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.full.KCallables.callSuspendBy(kotlin.reflect.KCallable, java.util.Map, x70.c):java.lang.Object");
    }

    @Nullable
    public static final KParameter findParameterByName(@NotNull KCallable<?> kCallable, @NotNull String str) {
        kCallable.getClass();
        str.getClass();
        Iterator<T> it = kCallable.getParameters().iterator();
        Object obj = null;
        boolean z11 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.areEqual(((KParameter) next).getName(), str)) {
                    if (z11) {
                        break;
                    }
                    z11 = true;
                    obj2 = next;
                }
            } else if (z11) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    @Nullable
    public static final KParameter getExtensionReceiverParameter(@NotNull KCallable<?> kCallable) {
        kCallable.getClass();
        Iterator<T> it = kCallable.getParameters().iterator();
        Object obj = null;
        boolean z11 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((KParameter) next).getKind() == KParameter.Kind.EXTENSION_RECEIVER) {
                    if (z11) {
                        break;
                    }
                    z11 = true;
                    obj2 = next;
                }
            } else if (z11) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    @Nullable
    public static final KParameter getInstanceParameter(@NotNull KCallable<?> kCallable) {
        kCallable.getClass();
        Iterator<T> it = kCallable.getParameters().iterator();
        Object obj = null;
        boolean z11 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((KParameter) next).getKind() == KParameter.Kind.INSTANCE) {
                    if (z11) {
                        break;
                    }
                    z11 = true;
                    obj2 = next;
                }
            } else if (z11) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    @NotNull
    public static final List<KParameter> getValueParameters(@NotNull KCallable<?> kCallable) {
        kCallable.getClass();
        List<KParameter> parameters = kCallable.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((KParameter) obj).getKind() == KParameter.Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void getExtensionReceiverParameter$annotations(KCallable kCallable) {
    }

    public static /* synthetic */ void getInstanceParameter$annotations(KCallable kCallable) {
    }

    public static /* synthetic */ void getValueParameters$annotations(KCallable kCallable) {
    }
}
