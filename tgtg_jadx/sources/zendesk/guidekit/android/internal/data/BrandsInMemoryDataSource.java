package zendesk.guidekit.android.internal.data;

import e90.a;
import e90.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;
import zendesk.guidekit.android.model.Brand;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003R$\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u000f\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzendesk/guidekit/android/internal/data/BrandsInMemoryDataSource;", "", "<init>", "()V", "", "channelId", "Lzendesk/guidekit/android/model/Brand;", "getBrand", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "brand", "", "saveBrand", "(Lzendesk/guidekit/android/model/Brand;Lx70/c;)Ljava/lang/Object;", "clear", "", "Lzendesk/guidekit/android/internal/data/ChannelId;", "brands", "Ljava/util/Map;", "Le90/a;", "persistenceMutex", "Le90/a;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrandsInMemoryDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrandsInMemoryDataSource.kt\nzendesk/guidekit/android/internal/data/BrandsInMemoryDataSource\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,30:1\n116#2,10:31\n116#2,11:41\n*S KotlinDebug\n*F\n+ 1 BrandsInMemoryDataSource.kt\nzendesk/guidekit/android/internal/data/BrandsInMemoryDataSource\n*L\n18#1:31,10\n22#1:41,11\n*E\n"})
public final class BrandsInMemoryDataSource {

    @NotNull
    private final Map<String, Brand> brands = new LinkedHashMap();

    @NotNull
    private final a persistenceMutex = d.a();

    /* JADX INFO: renamed from: zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource$getBrand$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource", f = "BrandsInMemoryDataSource.kt", l = {36}, m = "getBrand")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
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
            return BrandsInMemoryDataSource.this.getBrand(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource$saveBrand$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource", f = "BrandsInMemoryDataSource.kt", l = {36}, m = "saveBrand")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03751 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03751(x70.c<? super C03751> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrandsInMemoryDataSource.this.saveBrand(null, this);
        }
    }

    public final void clear() {
        this.brands.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getBrand(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.guidekit.android.model.Brand> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource$getBrand$1 r0 = (zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource$getBrand$1 r0 = new zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource$getBrand$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            e90.a r5 = (e90.a) r5
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            ba0.g.M(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L38:
            ba0.g.M(r6)
            e90.a r6 = r4.persistenceMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.g(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = 0
            java.util.Map<java.lang.String, zendesk.guidekit.android.model.Brand> r1 = r4.brands     // Catch: java.lang.Throwable -> L55
            java.lang.Object r5 = r1.get(r5)     // Catch: java.lang.Throwable -> L55
            r6.e(r0)
            return r5
        L55:
            r5 = move-exception
            r6.e(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource.getBrand(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveBrand(@org.jetbrains.annotations.NotNull zendesk.guidekit.android.model.Brand r5, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource.C03751
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource$saveBrand$1 r0 = (zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource.C03751) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource$saveBrand$1 r0 = new zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource$saveBrand$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            e90.a r5 = (e90.a) r5
            java.lang.Object r0 = r0.L$0
            zendesk.guidekit.android.model.Brand r0 = (zendesk.guidekit.android.model.Brand) r0
            ba0.g.M(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L38:
            ba0.g.M(r6)
            e90.a r6 = r4.persistenceMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.g(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = 0
            java.util.Map<java.lang.String, zendesk.guidekit.android.model.Brand> r1 = r4.brands     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = r5.getChannelId()     // Catch: java.lang.Throwable -> L5a
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L5a
            kotlin.Unit r5 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L5a
            r6.e(r0)
            return r5
        L5a:
            r5 = move-exception
            r6.e(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource.saveBrand(zendesk.guidekit.android.model.Brand, x70.c):java.lang.Object");
    }
}
