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
import zendesk.guidekit.android.model.GuideArticle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u0004\u0018\u00010\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0086@¢\u0006\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzendesk/guidekit/android/internal/data/ArticleInMemoryDataSource;", "", "<init>", "()V", "Lzendesk/guidekit/android/model/GuideArticle;", "article", "", "saveArticle", "(Lzendesk/guidekit/android/model/GuideArticle;Lx70/c;)Ljava/lang/Object;", "", "Lzendesk/guidekit/android/internal/data/ArticleId;", "id", "getArticle", "(JLx70/c;)Ljava/lang/Object;", "", "articlesMap", "Ljava/util/Map;", "Le90/a;", "persistenceMutex", "Le90/a;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArticleInMemoryDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleInMemoryDataSource.kt\nzendesk/guidekit/android/internal/data/ArticleInMemoryDataSource\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,41:1\n116#2,11:42\n116#2,11:53\n*S KotlinDebug\n*F\n+ 1 ArticleInMemoryDataSource.kt\nzendesk/guidekit/android/internal/data/ArticleInMemoryDataSource\n*L\n27#1:42,11\n37#1:53,11\n*E\n"})
public final class ArticleInMemoryDataSource {

    @NotNull
    private final Map<Long, GuideArticle> articlesMap = new LinkedHashMap();

    @NotNull
    private final a persistenceMutex = d.a();

    /* JADX INFO: renamed from: zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource$getArticle$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource", f = "ArticleInMemoryDataSource.kt", l = {47}, m = "getArticle")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        long J$0;
        Object L$0;
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
            return ArticleInMemoryDataSource.this.getArticle(0L, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource$saveArticle$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource", f = "ArticleInMemoryDataSource.kt", l = {47}, m = "saveArticle")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03741 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03741(x70.c<? super C03741> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArticleInMemoryDataSource.this.saveArticle(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getArticle(long r5, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.guidekit.android.model.GuideArticle> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource$getArticle$1 r0 = (zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource$getArticle$1 r0 = new zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource$getArticle$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            long r5 = r0.J$0
            java.lang.Object r0 = r0.L$0
            e90.a r0 = (e90.a) r0
            ba0.g.M(r7)
            goto L47
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L34:
            ba0.g.M(r7)
            e90.a r7 = r4.persistenceMutex
            r0.L$0 = r7
            r0.J$0 = r5
            r0.label = r3
            java.lang.Object r0 = r7.g(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r0 = r7
        L47:
            r7 = 0
            java.util.Map<java.lang.Long, zendesk.guidekit.android.model.GuideArticle> r1 = r4.articlesMap     // Catch: java.lang.Throwable -> L59
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Throwable -> L59
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r1.get(r2)     // Catch: java.lang.Throwable -> L59
            zendesk.guidekit.android.model.GuideArticle r5 = (zendesk.guidekit.android.model.GuideArticle) r5     // Catch: java.lang.Throwable -> L59
            r0.e(r7)
            return r5
        L59:
            r5 = move-exception
            r0.e(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource.getArticle(long, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveArticle(@org.jetbrains.annotations.NotNull zendesk.guidekit.android.model.GuideArticle r6, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource.C03741
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource$saveArticle$1 r0 = (zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource.C03741) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource$saveArticle$1 r0 = new zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource$saveArticle$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            e90.a r6 = (e90.a) r6
            java.lang.Object r0 = r0.L$0
            zendesk.guidekit.android.model.GuideArticle r0 = (zendesk.guidekit.android.model.GuideArticle) r0
            ba0.g.M(r7)
            r7 = r6
            r6 = r0
            goto L4a
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L38:
            ba0.g.M(r7)
            e90.a r7 = r5.persistenceMutex
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r0 = r7.g(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = 0
            java.util.Map<java.lang.Long, zendesk.guidekit.android.model.GuideArticle> r1 = r5.articlesMap     // Catch: java.lang.Throwable -> L5f
            long r2 = r6.getId()     // Catch: java.lang.Throwable -> L5f
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Throwable -> L5f
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            r1.put(r4, r6)     // Catch: java.lang.Throwable -> L5f
            kotlin.Unit r6 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L5f
            r7.e(r0)
            return r6
        L5f:
            r6 = move-exception
            r7.e(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource.saveArticle(zendesk.guidekit.android.model.GuideArticle, x70.c):java.lang.Object");
    }
}
