package zendesk.conversationkit.android.internal.metadata;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y70.a;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0082@¢\u0006\u0004\b\r\u0010\u000bJC\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0018\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0019\u0010\u000bJ\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u001a\u0010\u000bJ&\u0010\u001d\u001a\u00020\u001c2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u001d\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006 "}, d2 = {"Lzendesk/conversationkit/android/internal/metadata/MetadataManager;", "", "Lzendesk/conversationkit/android/internal/metadata/MetadataStorage;", "metadataStorage", "Lzendesk/conversationkit/android/internal/metadata/MetadataFormatter;", "metadataFormatter", "<init>", "(Lzendesk/conversationkit/android/internal/metadata/MetadataStorage;Lzendesk/conversationkit/android/internal/metadata/MetadataFormatter;)V", "", "", "getConversationTags", "(Lx70/c;)Ljava/lang/Object;", "", "getConversationFields", "fields", "tags", "formatMetadata", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/Map;", "", "saveConversationFields", "(Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "saveConversationTags", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "clearConversationFields", "clearConversationTags", "clearStorage", "getMetadata", "remoteMetadata", "", "shouldUpdateMetadata", "Lzendesk/conversationkit/android/internal/metadata/MetadataStorage;", "Lzendesk/conversationkit/android/internal/metadata/MetadataFormatter;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMetadataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataManager.kt\nzendesk/conversationkit/android/internal/metadata/MetadataManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,100:1\n1#2:101\n188#3,3:102\n*S KotlinDebug\n*F\n+ 1 MetadataManager.kt\nzendesk/conversationkit/android/internal/metadata/MetadataManager\n*L\n95#1:102,3\n*E\n"})
public final class MetadataManager {

    @NotNull
    private final MetadataFormatter metadataFormatter;

    @NotNull
    private final MetadataStorage metadataStorage;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.metadata.MetadataManager$getMetadata$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.metadata.MetadataManager", f = "MetadataManager.kt", l = {61, 62}, m = "getMetadata")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
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
            return MetadataManager.this.getMetadata(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.metadata.MetadataManager$shouldUpdateMetadata$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.metadata.MetadataManager", f = "MetadataManager.kt", l = {93}, m = "shouldUpdateMetadata")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C02441 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C02441(x70.c<? super C02441> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MetadataManager.this.shouldUpdateMetadata(null, this);
        }
    }

    public MetadataManager(@NotNull MetadataStorage metadataStorage, @NotNull MetadataFormatter metadataFormatter) {
        metadataStorage.getClass();
        metadataFormatter.getClass();
        this.metadataStorage = metadataStorage;
        this.metadataFormatter = metadataFormatter;
    }

    private final Map<String, Object> formatMetadata(Map<String, ? extends Object> fields, List<String> tags) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (fields != null && !fields.isEmpty()) {
            linkedHashMap.putAll(this.metadataFormatter.formatConversationFields(fields));
        }
        if (tags != null && !tags.isEmpty()) {
            linkedHashMap.putAll(this.metadataFormatter.formatConversationTags(tags));
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getConversationFields(x70.c<? super Map<String, ? extends Object>> cVar) {
        return this.metadataStorage.getConversationFields(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getConversationTags(x70.c<? super List<String>> cVar) {
        return this.metadataStorage.getConversationTags(cVar);
    }

    @Nullable
    public final Object clearConversationFields(@NotNull x70.c<? super Unit> cVar) {
        Object objClearConversationFields = this.metadataStorage.clearConversationFields(cVar);
        return objClearConversationFields == a.COROUTINE_SUSPENDED ? objClearConversationFields : Unit.f26487a;
    }

    @Nullable
    public final Object clearConversationTags(@NotNull x70.c<? super Unit> cVar) {
        Object objClearConversationTags = this.metadataStorage.clearConversationTags(cVar);
        return objClearConversationTags == a.COROUTINE_SUSPENDED ? objClearConversationTags : Unit.f26487a;
    }

    @Nullable
    public final Object clearStorage(@NotNull x70.c<? super Unit> cVar) {
        Object objClear = this.metadataStorage.clear(cVar);
        return objClear == a.COROUTINE_SUSPENDED ? objClear : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getMetadata(@org.jetbrains.annotations.NotNull x70.c<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof zendesk.conversationkit.android.internal.metadata.MetadataManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.conversationkit.android.internal.metadata.MetadataManager$getMetadata$1 r0 = (zendesk.conversationkit.android.internal.metadata.MetadataManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.metadata.MetadataManager$getMetadata$1 r0 = new zendesk.conversationkit.android.internal.metadata.MetadataManager$getMetadata$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            java.util.Map r0 = (java.util.Map) r0
            ba0.g.M(r7)
            goto L55
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L35:
            ba0.g.M(r7)
            goto L45
        L39:
            ba0.g.M(r7)
            r0.label = r4
            java.lang.Object r7 = r6.getConversationFields(r0)
            if (r7 != r1) goto L45
            goto L51
        L45:
            java.util.Map r7 = (java.util.Map) r7
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r0 = r6.getConversationTags(r0)
            if (r0 != r1) goto L52
        L51:
            return r1
        L52:
            r5 = r0
            r0 = r7
            r7 = r5
        L55:
            java.util.List r7 = (java.util.List) r7
            java.util.Map r7 = r6.formatMetadata(r0, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.metadata.MetadataManager.getMetadata(x70.c):java.lang.Object");
    }

    @Nullable
    public final Object saveConversationFields(@NotNull Map<String, ? extends Object> map, @NotNull x70.c<? super Unit> cVar) {
        Object objSaveConversationFields = this.metadataStorage.saveConversationFields(map, cVar);
        return objSaveConversationFields == a.COROUTINE_SUSPENDED ? objSaveConversationFields : Unit.f26487a;
    }

    @Nullable
    public final Object saveConversationTags(@NotNull List<String> list, @NotNull x70.c<? super Unit> cVar) {
        Object objSaveConversationTags = this.metadataStorage.saveConversationTags(list, cVar);
        return objSaveConversationTags == a.COROUTINE_SUSPENDED ? objSaveConversationTags : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shouldUpdateMetadata(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull x70.c<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.conversationkit.android.internal.metadata.MetadataManager.C02441
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.conversationkit.android.internal.metadata.MetadataManager$shouldUpdateMetadata$1 r0 = (zendesk.conversationkit.android.internal.metadata.MetadataManager.C02441) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.metadata.MetadataManager$shouldUpdateMetadata$1 r0 = new zendesk.conversationkit.android.internal.metadata.MetadataManager$shouldUpdateMetadata$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            java.util.Map r5 = (java.util.Map) r5
            ba0.g.M(r6)
            goto L40
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.getMetadata(r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            java.util.Map r6 = (java.util.Map) r6
            if (r6 != 0) goto L47
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L47:
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L50
        L4e:
            r3 = r1
            goto L7a
        L50:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L58:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r5 == 0) goto L6f
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r2 = r5.get(r2)
            goto L70
        L6f:
            r2 = 0
        L70:
            java.lang.Object r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L58
        L7a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.metadata.MetadataManager.shouldUpdateMetadata(java.util.Map, x70.c):java.lang.Object");
    }
}
